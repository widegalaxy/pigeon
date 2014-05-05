/**
 * Dianping.com Inc.
 * Copyright (c) 2003-2013 All Rights Reserved.
 */
package com.dianping.pigeon.remoting.invoker.domain;

import org.apache.log4j.Logger;

import com.dianping.dpsf.async.ServiceCallback;
import com.dianping.dpsf.exception.DPSFException;
import com.dianping.pigeon.log.LoggerLoader;
import com.dianping.pigeon.remoting.common.domain.InvocationRequest;
import com.dianping.pigeon.remoting.common.domain.InvocationResponse;
import com.dianping.pigeon.remoting.common.util.Constants;
import com.dianping.pigeon.remoting.invoker.Client;
import com.dianping.pigeon.remoting.invoker.util.InvokerUtils;

public class ServiceCallbackWrapper implements Callback {

	private static final Logger logger = LoggerLoader.getLogger(ServiceCallbackWrapper.class);

	private InvocationResponse response;

	private InvocationRequest request;

	private Client client;

	private ServiceCallback callback;

	public ServiceCallbackWrapper(ServiceCallback callback) {
		this.callback = callback;
	}

	@Override
	public void run() {
		try {
// BUGFIX: no context needed for callback invocation
//			if (ContextUtils.getContext() != null) {
//				if (this.response.getMessageType() == Constants.MESSAGE_TYPE_SERVICE) {
//					// 传递业务上下文
//					ContextUtils.addSuccessContext(this.response.getContext());
//				} else {
//					// 传递业务上下文
//					ContextUtils.addFailedContext(this.response.getContext());
//				}
//			}
			if (response.getMessageType() == Constants.MESSAGE_TYPE_SERVICE_EXCEPTION) {
				StringBuilder sb = new StringBuilder();
				sb.append("Service Exception Info *************\r\n")
						// .append(" token:").append(ContextUtil.getToken(this.response.getContext())).append("\r\n")
						.append(" seq:").append(request.getSequence()).append(" callType:")
						.append(request.getCallType()).append("\r\n serviceName:").append(request.getServiceName())
						.append(" methodName:").append(request.getMethodName()).append("\r\n host:")
						.append(client.getHost()).append(":").append(client.getPort());
				
				response.setReturn(new RuntimeException(sb.toString(), InvokerUtils.toInvocationThrowable(response.getReturn())));
			}
			try {
				if (response.getMessageType() == Constants.MESSAGE_TYPE_SERVICE) {
					if(logger.isDebugEnabled()) {
						logger.debug("response:" + response);
						logger.debug("callback:" + callback);
					}
					this.callback.callback(response.getReturn());
				} else if (response.getMessageType() == Constants.MESSAGE_TYPE_EXCEPTION) {
					logger.error(response.getCause());
					this.callback.frameworkException(new DPSFException(response.getCause()));
				} else if (response.getMessageType() == Constants.MESSAGE_TYPE_SERVICE_EXCEPTION) {
					this.callback.serviceException((Exception) response.getReturn());
				}
			} catch (Exception e) {
				logger.error("ServiceCallback error", e);
			}
		} catch (DPSFException e) {
			this.callback.frameworkException(e);
		}
	}

	@Override
	public void setClient(Client client) {
		this.client = client;
	}

	@Override
	public Client getClient() {
		return this.client;
	}

	@Override
	public void callback(InvocationResponse response) {
		this.response = response;
	}

	@Override
	public void setRequest(InvocationRequest request) {
		this.request = request;
	}

}