/**
 * Dianping.com Inc.
 * Copyright (c) 2003-2013 All Rights Reserved.
 */
package com.dianping.pigeon.remoting.common.util;

import java.util.regex.Pattern;

import com.dianping.pigeon.config.ConfigChangeListener;
import com.dianping.pigeon.config.ConfigManagerLoader;

public final class Constants {

    public Constants() {
    }

    public static final Pattern COMMA_SPLIT_PATTERN = Pattern.compile("\\s*[,]+\\s*");

    public static final int MESSAGE_TYPE_HEART = 1;
    public static final int MESSAGE_TYPE_SERVICE = 2;
    public static final int MESSAGE_TYPE_EXCEPTION = 3;
    public static final int MESSAGE_TYPE_SERVICE_EXCEPTION = 4;
    public static final int MESSAGE_TYPE_HEALTHCHECK = 5;
    public static final int MESSAGE_TYPE_SCANNER_HEART = 6;

    public static final int CALLTYPE_REPLY = 1;
    public static final int CALLTYPE_NOREPLY = 2;
    public static final int CALLTYPE_MANUAL = 3;

    public static final int COMPRESS_TYPE_NONE = 0;
    public static final int COMPRESS_TYPE_SNAPPY = 1;
    public static final int COMPRESS_TYPE_GZIP = 2;

    public static final String PROCESS_MODEL_DEFAULT = "default";
    public static final String PROCESS_MODEL_THREAD = "thread";
    public static final String PROCESS_MODEL_JACTOR = "jactor";

    public static final String CALL_SYNC = "sync";
    public static final String CALL_CALLBACK = "callback";
    public static final String CALL_ONEWAY = "oneway";
    public static final String CALL_FUTURE = "future";

    public static final String CLUSTER_FAILFAST = "failfast";
    public static final String CLUSTER_FAILOVER = "failover";
    public static final String CLUSTER_FAILSAFE = "failsafe";
    public static final String CLUSTER_FORKING = "forking";

    public static final String SERIALIZE_JAVA = "java";
    public static final String SERIALIZE_HESSIAN = "hessian";
    public static final String SERIALIZE_HESSIAN1 = "hessian1";
    public static final String SERIALIZE_PROTOBUF = "protobuf";
    public static final String SERIALIZE_JSON = "json";

    public static final byte MESSAGE_HEAD_FIRST = 57;
    public static final byte MESSAGE_HEAD_SECOND = 58;

    public static final byte EXPAND_FLAG_FIRST = 29;
    public static final byte EXPAND_FLAG_SECOND = 30;
    public static final byte EXPAND_FLAG_THIRD = 31;

    public static final int ATTACHMENT_RETRY = 1;
    public static final int ATTACHMENT_BYTEBUFFER = 2;
    public static final int ATTACHMENT_REQUEST_SEQ = 11;

    public static final String TRANSFER_NULL = "NULL";

    public static final String REQ_ATTACH_WRITE_BUFF_LIMIT = "WRITE_BUFF_LIMIT";

    public static final int VERSION_150 = 150;

    public static final String REQUEST_CREATE_TIME = "requestCreateTime";
    public static final String REQUEST_TIMEOUT = "requestTimeout";
    public static final String REQUEST_FIRST_FLAG = "requestFirstFlag";

    public static final String ECHO_METHOD = "$echo";

    public static final int DEFAULT_FAILOVER_RETRY = 1;
    public static final boolean DEFAULT_FAILOVER_TIMEOUT_RETRY = false;

    public static final String CONFIG_CLUSTER_CLUSTER = "cluster";
    public static final String CONFIG_CLUSTER_RETRY = "retry";
    public static final String CONFIG_CLUSTER_TIMEOUT_RETRY = "timeout-retry";

    public static final String CONTEXT_FUTURE = "Context-Future";
    public static final String CONTEXT_SERVER_COST = "Context-Server-Cost";

    // Deafult value for the above keys
    public static final String DEFAULT_GROUP = "";

    public static final String REQUEST_KEY_TOKEN = "@s";
    public static final String REQUEST_KEY_TIMESTAMP = "@t";
    public static final String REQUEST_KEY_VERSION = "@v";

    public static final String HEART_TASK_SERVICE = "HeartbeatService/";

    public static final String HEART_TASK_METHOD = "heartbeat";

    public static final String KEY_LOADBALANCE = "pigeon.loadbalance.defaulttype";
    public static final String KEY_RECONNECT_INTERVAL = "pigeon.reconnect.interval";
    private static final String KEY_INVOKER_HEARTBEAT_ENABLE = "pigeon.invoker.heartbeat.enable";
    public static final String KEY_HEARTBEAT_INTERVAL = "pigeon.heartbeat.interval";
    public static final String KEY_HEARTBEAT_TIMEOUT = "pigeon.heartbeat.timeout";
    public static final String KEY_INVOKER_CHANNEL_DEADTHRESHOLD = "pigeon.heartbeat.channel.dead.threshold";
    public static final String KEY_HEARTBEAT_DEADTHRESHOLD = "pigeon.heartbeat.dead.threshold";
    public static final String KEY_HEARTBEAT_HEALTHTHRESHOLD = "pigeon.heartbeat.health.threshold";
    public static final String KEY_HEARTBEAT_AUTOPICKOFF = "pigeon.heartbeat.autopickoff";
    public static final String KEY_SERVICE_NAMESPACE = "pigeon.service.namespace";
    public static final String KEY_INVOKER_MAXREQUESTS = "pigeon.invoker.maxrequests";
    public static final String KEY_PROVIDER_COREPOOLSIZE = "pigeon.provider.pool.coresize";
    public static final String KEY_PROVIDER_MAXPOOLSIZE = "pigeon.provider.pool.maxsize";
    public static final String KEY_PROVIDER_WORKQUEUESIZE = "pigeon.provider.pool.queuesize";
    public static final String KEY_RESPONSE_COREPOOLSIZE = "pigeon.response.pool.coresize";
    public static final String KEY_RESPONSE_MAXPOOLSIZE = "pigeon.response.pool.maxsize";
    public static final String KEY_RESPONSE_WORKQUEUESIZE = "pigeon.response.pool.queuesize";
    public static final String KEY_INVOKER_TIMEOUT = "pigeon.invoker.timeout";
    public static final String KEY_WRITE_BUFFER_HIGH_WATER = "pigeon.channel.writebuff.high";
    public static final String KEY_WRITE_BUFFER_LOW_WATER = "pigeon.channel.writebuff.low";
    public static final String KEY_DEFAULT_WRITE_BUFF_LIMIT = "pigeon.channel.writebuff.defaultlimit";
    public static final String KEY_INVOKER_NETTY_BOSSCOUNT = "pigeon.invoker.netty.bosscount";
    public static final String KEY_INVOKER_NETTY_WORKERCOUNT = "pigeon.invoker.netty.workercount";
    public static final String KEY_CHANNEL_POOL_INITIAL_SIZE = "pigeon.channel.pool.initial.size";
    public static final String KEY_CHANNEL_POOL_NORMAL_SIZE = "pigeon.channel.pool.normal.size";
    public static final String KEY_CHANNEL_POOL_MAX_ACTIVE = "pigeon.channel.pool.max.active";
    public static final String KEY_CHANNEL_POOL_MAX_WAIT = "pigeon.channel.pool.max.wait";
    public static final String KEY_CHANNEL_POOL_TIME_BETWEEN_CHECKER_MILLIS = "pigeon.channel.pool.timeBetweenCheckerMillis";

    public static final String KEY_NOTIFY_ENABLE = "pigeon.notify.enable";
    public static final String KEY_HEARTBEAT_ENABLE = "pigeon.heartbeat.enable";
    public static final String KEY_TEST_ENABLE = "pigeon.test.enable";
    public static final String KEY_CONNECT_TIMEOUT = "pigeon.netty.connecttimeout";
    public static final String KEY_PROVIDER_HEARTBEAT_INTERNAL = "pigeon.provider.heartbeat.internal";
    public static final String KEY_REGIONPOLICY = "pigeon.regionpolicy.defaulttype";

    public static final int DEFAULT_INVOKER_TIMEOUT = 1000;
    public static final int DEFAULT_PROVIDER_COREPOOLSIZE = 60;
    public static final int DEFAULT_PROVIDER_MAXPOOLSIZE = 500;
    public static final int DEFAULT_PROVIDER_WORKQUEUESIZE = 1000;
    public static final int DEFAULT_RESPONSE_COREPOOLSIZE = 10;
    public static final int DEFAULT_RESPONSE_MAXPOOLSIZE = 100;
    public static final int DEFAULT_RESPONSE_WORKQUEUESIZE = 800;
    public static final boolean DEFAULT_INVOKER_HEARTBEAT_ENABLE = true;
    public static final int DEFAULT_INVOKER_CHANNEL_DEADTHRESHOLD = 5;
    public static final int DEFAULT_RECONNECT_INTERVAL = 5000;
    public static final int DEFAULT_HEARTBEAT_INTERVAL = 3000;

    public static final int DEFAULT_HEARTBEAT_TIMEOUT = 3000;
    public static final int DEFAULT_HEARTBEAT_DEADTHRESHOLD = 5;
    public static final int DEFAULT_HEARTBEAT_HEALTHCOUNT = 5;
    public static final boolean DEFAULT_HEARTBEAT_AUTOPICKOFF = true;
    public static final int DEFAULT_WRITE_BUFFER_HIGH_WATER = 35 * 1024 * 1024;
    public static final int DEFAULT_WRITE_BUFFER_LOW_WATER = 25 * 1024 * 1024;
    public static final boolean DEFAULT_WRITE_BUFF_LIMIT = false;
    public static final int DEFAULT_INVOKER_NETTY_BOSSCOUNT = 1;
    public static final int DEFAULT_INVOKER_NETTY_WORKERCOUNT = Runtime.getRuntime().availableProcessors() * 2;
    public static final int DEFAULT_CHANNEL_POOL_INITIAL_SIZE = 1;
    public static final int DEFAULT_CHANNEL_POOL_NORMAL_SIZE = 1;
    public static final int DEFAULT_CHANNEL_POOL_MAX_ACTIVE = 5;
    public static final int DEFAULT_CHANNEL_POOL_MAX_WAIT = 2000;
    public static final int DEFAULT_CHANNEL_POOL_TIME_BETWEEN_CHECKER_MILLIS = 2000;
    public static final String DEFAULT_PROCESS_TYPE = "threadpool";
    public static final boolean DEFAULT_NOTIFY_ENABLE = true;
    public static final boolean DEFAULT_TEST_ENABLE = true;
    public static final int DEFAULT_CONNECT_TIMEOUT = 2000;
    public static final int DEFAULT_WEIGHT_STARTDELAY = 30000;
    public static final int DEFAULT_PROVIDER_HEARTBEAT_INTERNAL = 60000;

    public static final String PROTOCOL_HTTP = "http";
    public static final String PROTOCOL_DEFAULT = "default";
    public static final String KEY_UNPUBLISH_WAITTIME = "pigeon.unpublish.waittime";
    public static final int DEFAULT_UNPUBLISH_WAITTIME = 5000;
    public static final String KEY_ONLINE_WHILE_INITIALIZED = "pigeon.online.whileinitialized";
    public static final boolean DEFAULT_ONLINE_WHILE_INITIALIZED = false;
    public static final boolean DEFAULT_TIMEOUT_CANCEL = false;
    public static final int DEFAULT_STRING_MAXLENGTH = 1000;
    public static final String KEY_STRING_MAXLENGTH = "pigeon.string.maxlength";
    public static final int DEFAULT_STRING_MAXITEMS = 500;
    public static final String KEY_STRING_MAXITEMS = "pigeon.string.maxitems";
    public static final boolean DEFAULT_ONLINE_AUTO = true;
    public static final String KEY_ONLINE_AUTO = "pigeon.online.auto";
    public static final String KEY_WEIGHT_INITIAL = "pigeon.weight.initial";
    public static final int DEFAULT_WEIGHT_INITIAL = 0;
    public static final String KEY_WEIGHT_DEFAULT = "pigeon.weight.default";
    public static final int DEFAULT_WEIGHT_DEFAULT = 1;
    public static final String KEY_AUTOREGISTER_ENABLE = "pigeon.autoregister.enable";
    public static final String KEY_AUTOPUBLISH_ENABLE = "pigeon.autopublish.enable";
    public static final String KEY_AUTOUNPUBLISH_ENABLE = "pigeon.autounpublish.enable";

    public static final String KEY_LOG_PARAMETER = "pigeon.log.parameters";
    public static final String Key_REPLY_MANUAL = "pigeon.provider.reply.manual";
    public static final String KEY_MONITOR_ENABLE = "pigeon.monitor.enabled";

    public static final int WEIGHT_INITIAL = ConfigManagerLoader.getConfigManager()
            .getIntValue(Constants.KEY_WEIGHT_INITIAL, Constants.DEFAULT_WEIGHT_INITIAL);

    public static final int WEIGHT_DEFAULT = ConfigManagerLoader.getConfigManager()
            .getIntValue(Constants.KEY_WEIGHT_DEFAULT, Constants.DEFAULT_WEIGHT_DEFAULT);

    public static final boolean LOG_PARAMETERS = ConfigManagerLoader.getConfigManager()
            .getBooleanValue(KEY_LOG_PARAMETER, false);

    public static boolean REPLY_MANUAL = ConfigManagerLoader.getConfigManager()
            .getBooleanValue(Key_REPLY_MANUAL, false);

    public static final boolean MONITOR_ENABLE = ConfigManagerLoader.getConfigManager()
            .getBooleanValue(KEY_MONITOR_ENABLE, true);

    public static final int PROVIDER_POOL_CORE_SIZE = ConfigManagerLoader.getConfigManager()
            .getIntValue(Constants.KEY_PROVIDER_COREPOOLSIZE, Constants.DEFAULT_PROVIDER_COREPOOLSIZE);

    public static final int PROVIDER_POOL_MAX_SIZE = ConfigManagerLoader.getConfigManager()
            .getIntValue(Constants.KEY_PROVIDER_MAXPOOLSIZE, Constants.DEFAULT_PROVIDER_MAXPOOLSIZE);

    public static final int PROVIDER_POOL_QUEUE_SIZE = ConfigManagerLoader.getConfigManager()
            .getIntValue(Constants.KEY_PROVIDER_WORKQUEUESIZE, Constants.DEFAULT_PROVIDER_WORKQUEUESIZE);

    public static final int CONNECT_TIMEOUT = ConfigManagerLoader.getConfigManager().getIntValue(
            KEY_CONNECT_TIMEOUT, DEFAULT_CONNECT_TIMEOUT);

    public static final int INVOKER_NETTY_BOSSCOUNT = ConfigManagerLoader.getConfigManager().getIntValue(
            KEY_INVOKER_NETTY_BOSSCOUNT, DEFAULT_INVOKER_NETTY_BOSSCOUNT);

    public static final int INVOKER_NETTY_WORKERCOUNT = ConfigManagerLoader.getConfigManager().getIntValue(
            KEY_INVOKER_NETTY_WORKERCOUNT, DEFAULT_INVOKER_NETTY_WORKERCOUNT);

    public static final int WRITE_BUFFER_HIGH_WATER = ConfigManagerLoader.getConfigManager().getIntValue(
            KEY_WRITE_BUFFER_HIGH_WATER, DEFAULT_WRITE_BUFFER_HIGH_WATER);

    public static final int WRITE_BUFFER_LOW_WATER = ConfigManagerLoader.getConfigManager().getIntValue(
            KEY_WRITE_BUFFER_LOW_WATER, DEFAULT_WRITE_BUFFER_LOW_WATER);

    public static final String KEY_SERVICE_SHARED = "pigeon.provider.service.shared";
    public static final boolean DEFAULT_SERVICE_SHARED = true;

    public static final String CONTEXT_KEY_CLIENT_IP = "CLIENT_IP";
    public static final String CONTEXT_KEY_CLIENT_APP = "CLIENT_APP";
    public static final String CONTEXT_KEY_SOURCE_IP = "SOURCE_IP";
    public static final String CONTEXT_KEY_SOURCE_APP = "SOURCE_APP";

    public static final int getChannelPoolInitialSize() {
        return ConfigManagerLoader.getConfigManager().getIntValue(
                KEY_CHANNEL_POOL_INITIAL_SIZE, DEFAULT_CHANNEL_POOL_INITIAL_SIZE);
    }

    public static final int getChannelPoolNormalSize() {
        return ConfigManagerLoader.getConfigManager().getIntValue(
                KEY_CHANNEL_POOL_NORMAL_SIZE, DEFAULT_CHANNEL_POOL_NORMAL_SIZE);
    }

    public static final int getChannelPoolMaxActive() {
        return ConfigManagerLoader.getConfigManager().getIntValue(
                KEY_CHANNEL_POOL_MAX_ACTIVE, DEFAULT_CHANNEL_POOL_MAX_ACTIVE);
    }

    public static final int getChannelPoolMaxWait() {
        return ConfigManagerLoader.getConfigManager().getIntValue(
                KEY_CHANNEL_POOL_MAX_WAIT, DEFAULT_CHANNEL_POOL_MAX_WAIT);
    }

    public static final int getChannelPoolTimeBetweenCheckerMillis() {
        return ConfigManagerLoader.getConfigManager().getIntValue(
                KEY_CHANNEL_POOL_TIME_BETWEEN_CHECKER_MILLIS, DEFAULT_CHANNEL_POOL_TIME_BETWEEN_CHECKER_MILLIS);
    }


    public static final boolean getInvokerHeartbeatEnable() {
        return ConfigManagerLoader.getConfigManager().getBooleanValue(
                KEY_INVOKER_HEARTBEAT_ENABLE, DEFAULT_INVOKER_HEARTBEAT_ENABLE);
    }

    public static final int getDefaultInvokerChannelDeadthreshold() {
        return ConfigManagerLoader.getConfigManager().getIntValue(
                KEY_INVOKER_CHANNEL_DEADTHRESHOLD, DEFAULT_INVOKER_CHANNEL_DEADTHRESHOLD);
    }

    public static final int getDefaultInvokerClientDeadthreshold() {
        return ConfigManagerLoader.getConfigManager().getIntValue(
                KEY_HEARTBEAT_DEADTHRESHOLD, DEFAULT_HEARTBEAT_DEADTHRESHOLD);
    }

    public static final int getInvokerHeartbeatTimeout() {
        return ConfigManagerLoader.getConfigManager().getIntValue(
                KEY_HEARTBEAT_TIMEOUT, DEFAULT_HEARTBEAT_TIMEOUT);
    }

    public static final int getInvokerHeartbeatInterval() {
        return ConfigManagerLoader.getConfigManager().getIntValue(
                KEY_HEARTBEAT_INTERVAL, DEFAULT_HEARTBEAT_INTERVAL);
    }


    static {
        ConfigManagerLoader.getConfigManager().registerConfigChangeListener(new InnerConfigChangeListener());
    }

    private static class InnerConfigChangeListener implements ConfigChangeListener {

        @Override
        public void onKeyUpdated(String key, String value) {
            if (key.endsWith("pigeon.provider.reply.manual")) {
                try {
                    REPLY_MANUAL = Boolean.valueOf(value);
                } catch (RuntimeException e) {
                }
            }
        }

        @Override
        public void onKeyAdded(String key, String value) {

        }

        @Override
        public void onKeyRemoved(String key) {

        }

    }

}
