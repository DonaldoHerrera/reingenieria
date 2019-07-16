package com.soundcloud.flippernative.api;

public final class error_code {
    public static final error_code FAILED_TO_OPEN_DECODER = new error_code("FAILED_TO_OPEN_DECODER");
    public static final error_code FAILED_TO_OPEN_FILE = new error_code("FAILED_TO_OPEN_FILE");
    public static final error_code FAILED_TO_OPEN_SINK = new error_code("FAILED_TO_OPEN_SINK");
    public static final error_code HLS_FAILED_TO_LOAD_KEY = new error_code("HLS_FAILED_TO_LOAD_KEY");
    public static final error_code HLS_FAILED_TO_LOAD_PLAYLIST = new error_code("HLS_FAILED_TO_LOAD_PLAYLIST");
    public static final error_code HLS_FAILED_TO_LOAD_SEGMENT = new error_code("HLS_FAILED_TO_LOAD_SEGMENT");
    public static final error_code MP3_PARSING_FAILED = new error_code("MP3_PARSING_FAILED");
    public static final error_code OK = new error_code("OK");
    public static final error_code PLAYER_TOO_LONG_BUFFERING = new error_code("PLAYER_TOO_LONG_BUFFERING");
    private static int swigNext = 0;
    private static error_code[] swigValues = {OK, HLS_FAILED_TO_LOAD_PLAYLIST, HLS_FAILED_TO_LOAD_SEGMENT, HLS_FAILED_TO_LOAD_KEY, PLAYER_TOO_LONG_BUFFERING, MP3_PARSING_FAILED, FAILED_TO_OPEN_DECODER, FAILED_TO_OPEN_FILE, FAILED_TO_OPEN_SINK};
    private final String swigName;
    private final int swigValue;

    private error_code(String str) {
        this.swigName = str;
        int i = swigNext;
        swigNext = i + 1;
        this.swigValue = i;
    }

    public static error_code swigToEnum(int i) {
        error_code[] error_codeArr = swigValues;
        if (i < error_codeArr.length && i >= 0 && error_codeArr[i].swigValue == i) {
            return error_codeArr[i];
        }
        int i2 = 0;
        while (true) {
            error_code[] error_codeArr2 = swigValues;
            if (i2 >= error_codeArr2.length) {
                StringBuilder sb = new StringBuilder();
                sb.append("No enum ");
                sb.append(error_code.class);
                sb.append(" with value ");
                sb.append(i);
                throw new IllegalArgumentException(sb.toString());
            } else if (error_codeArr2[i2].swigValue == i) {
                return error_codeArr2[i2];
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

    private error_code(String str, int i) {
        this.swigName = str;
        this.swigValue = i;
        swigNext = i + 1;
    }

    private error_code(String str, error_code error_code) {
        this.swigName = str;
        this.swigValue = error_code.swigValue;
        swigNext = this.swigValue + 1;
    }
}
