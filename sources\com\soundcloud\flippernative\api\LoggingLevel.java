package com.soundcloud.flippernative.api;

public final class LoggingLevel {
    public static final LoggingLevel L_DEBUG = new LoggingLevel("L_DEBUG", PlayerJniJNI.L_DEBUG_get());
    public static final LoggingLevel L_ERR = new LoggingLevel("L_ERR");
    public static final LoggingLevel L_INFO = new LoggingLevel("L_INFO");
    public static final LoggingLevel L_WARN = new LoggingLevel("L_WARN");
    private static int swigNext = 0;
    private static LoggingLevel[] swigValues = {L_DEBUG, L_INFO, L_WARN, L_ERR};
    private final String swigName;
    private final int swigValue;

    private LoggingLevel(String str) {
        this.swigName = str;
        int i = swigNext;
        swigNext = i + 1;
        this.swigValue = i;
    }

    public static LoggingLevel swigToEnum(int i) {
        LoggingLevel[] loggingLevelArr = swigValues;
        if (i < loggingLevelArr.length && i >= 0 && loggingLevelArr[i].swigValue == i) {
            return loggingLevelArr[i];
        }
        int i2 = 0;
        while (true) {
            LoggingLevel[] loggingLevelArr2 = swigValues;
            if (i2 >= loggingLevelArr2.length) {
                StringBuilder sb = new StringBuilder();
                sb.append("No enum ");
                sb.append(LoggingLevel.class);
                sb.append(" with value ");
                sb.append(i);
                throw new IllegalArgumentException(sb.toString());
            } else if (loggingLevelArr2[i2].swigValue == i) {
                return loggingLevelArr2[i2];
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

    private LoggingLevel(String str, int i) {
        this.swigName = str;
        this.swigValue = i;
        swigNext = i + 1;
    }

    private LoggingLevel(String str, LoggingLevel loggingLevel) {
        this.swigName = str;
        this.swigValue = loggingLevel.swigValue;
        swigNext = this.swigValue + 1;
    }
}
