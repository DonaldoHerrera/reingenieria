package com.adjust.sdk;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.LinkedHashMap;
import java.util.Map;

public class AdjustEvent {
    private static ILogger logger = AdjustFactory.getLogger();
    String callbackId;
    Map<String, String> callbackParameters;
    String currency;
    String eventToken;
    String orderId;
    Map<String, String> partnerParameters;
    Double revenue;

    public AdjustEvent(String str) {
        if (checkEventToken(str, logger)) {
            this.eventToken = str;
        }
    }

    private static boolean checkEventToken(String str, ILogger iLogger) {
        if (str == null) {
            iLogger.error("Missing Event Token", new Object[0]);
            return false;
        } else if (str.length() == 6) {
            return true;
        } else {
            iLogger.error("Malformed Event Token '%s'", str);
            return false;
        }
    }

    private boolean checkRevenue(Double d, String str) {
        if (d != null) {
            if (d.doubleValue() < FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                logger.error("Invalid amount %.5f", d);
                return false;
            } else if (str == null) {
                logger.error("Currency must be set with revenue", new Object[0]);
                return false;
            } else if (str.equals("")) {
                logger.error("Currency is empty", new Object[0]);
                return false;
            }
        } else if (str != null) {
            logger.error("Revenue must be set with currency", new Object[0]);
            return false;
        }
        return true;
    }

    public void addCallbackParameter(String str, String str2) {
        String str3 = "Callback";
        if (Util.isValidParameter(str, "key", str3) && Util.isValidParameter(str2, "value", str3)) {
            if (this.callbackParameters == null) {
                this.callbackParameters = new LinkedHashMap();
            }
            if (((String) this.callbackParameters.put(str, str2)) != null) {
                logger.warn("Key %s was overwritten", str);
            }
        }
    }

    public void addPartnerParameter(String str, String str2) {
        String str3 = "Partner";
        if (Util.isValidParameter(str, "key", str3) && Util.isValidParameter(str2, "value", str3)) {
            if (this.partnerParameters == null) {
                this.partnerParameters = new LinkedHashMap();
            }
            if (((String) this.partnerParameters.put(str, str2)) != null) {
                logger.warn("Key %s was overwritten", str);
            }
        }
    }

    public boolean isValid() {
        return this.eventToken != null;
    }

    public void setCallbackId(String str) {
        this.callbackId = str;
    }

    public void setOrderId(String str) {
        this.orderId = str;
    }

    public void setRevenue(double d, String str) {
        if (checkRevenue(Double.valueOf(d), str)) {
            this.revenue = Double.valueOf(d);
            this.currency = str;
        }
    }
}
