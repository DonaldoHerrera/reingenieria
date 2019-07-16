package com.google.android.gms.cast;

import com.google.android.gms.common.api.CommonStatusCodes;

/* renamed from: com.google.android.gms.cast.f reason: case insensitive filesystem */
public final class C0632f extends CommonStatusCodes {
    public static String getStatusCodeString(int i) {
        if (i == 0) {
            return "SUCCESS";
        }
        if (i == 2015) {
            return "TCP_PROBER_FAIL_TO_VERIFY_DEVICE";
        }
        if (i == 7) {
            return "NETWORK_ERROR";
        }
        if (i == 8) {
            return "INTERNAL_ERROR";
        }
        if (i == 2200) {
            return "ERROR_SERVICE_CREATION_FAILED";
        }
        if (i == 2201) {
            return "ERROR_SERVICE_DISCONNECTED";
        }
        switch (i) {
            case 13:
                return "UNKNOWN_ERROR";
            case 14:
                return "INTERRUPTED";
            case 15:
                return "TIMEOUT";
            default:
                switch (i) {
                    case 2000:
                        return "AUTHENTICATION_FAILED";
                    case 2001:
                        return "INVALID_REQUEST";
                    case 2002:
                        return "CANCELED";
                    case 2003:
                        return "NOT_ALLOWED";
                    case 2004:
                        return "APPLICATION_NOT_FOUND";
                    case 2005:
                        return "APPLICATION_NOT_RUNNING";
                    case 2006:
                        return "MESSAGE_TOO_LARGE";
                    case 2007:
                        return "MESSAGE_SEND_BUFFER_TOO_FULL";
                    default:
                        switch (i) {
                            case 2100:
                                return "FAILED";
                            case 2101:
                                return "STATUS_CANCELLED";
                            case 2102:
                                return "STATUS_TIMED_OUT";
                            case 2103:
                                return "REPLACED";
                            default:
                                return CommonStatusCodes.getStatusCodeString(i);
                        }
                }
        }
    }
}
