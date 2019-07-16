package com.soundcloud.flippernative.api;

public final class ErrorReason {
    public static final ErrorReason Failed = new ErrorReason("Failed");
    public static final ErrorReason Forbidden = new ErrorReason("Forbidden");
    public static final ErrorReason NotFound = new ErrorReason("NotFound");
    public static final ErrorReason Nothing = new ErrorReason("Nothing");
    public static final ErrorReason ServiceUnavailable = new ErrorReason("ServiceUnavailable");
    public static final ErrorReason Timeout = new ErrorReason("Timeout");
    private static int swigNext = 0;
    private static ErrorReason[] swigValues = {Nothing, Failed, NotFound, Forbidden, Timeout, ServiceUnavailable};
    private final String swigName;
    private final int swigValue;

    private ErrorReason(String str) {
        this.swigName = str;
        int i = swigNext;
        swigNext = i + 1;
        this.swigValue = i;
    }

    public static ErrorReason swigToEnum(int i) {
        ErrorReason[] errorReasonArr = swigValues;
        if (i < errorReasonArr.length && i >= 0 && errorReasonArr[i].swigValue == i) {
            return errorReasonArr[i];
        }
        int i2 = 0;
        while (true) {
            ErrorReason[] errorReasonArr2 = swigValues;
            if (i2 >= errorReasonArr2.length) {
                StringBuilder sb = new StringBuilder();
                sb.append("No enum ");
                sb.append(ErrorReason.class);
                sb.append(" with value ");
                sb.append(i);
                throw new IllegalArgumentException(sb.toString());
            } else if (errorReasonArr2[i2].swigValue == i) {
                return errorReasonArr2[i2];
            } else {
                i2++;
            }
        }
    }

    public final int swigValue() {
        return this.swigValue;
    }

    public String toString() {
        return this.swigName;
    }

    private ErrorReason(String str, int i) {
        this.swigName = str;
        this.swigValue = i;
        swigNext = i + 1;
    }

    private ErrorReason(String str, ErrorReason errorReason) {
        this.swigName = str;
        this.swigValue = errorReason.swigValue;
        swigNext = this.swigValue + 1;
    }
}
