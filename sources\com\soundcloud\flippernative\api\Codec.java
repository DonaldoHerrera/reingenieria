package com.soundcloud.flippernative.api;

public final class Codec {
    public static final Codec AAC = new Codec("AAC");
    public static final Codec MP3 = new Codec("MP3");
    public static final Codec OPUS = new Codec("OPUS");
    public static final Codec Unknown = new Codec("Unknown");
    private static int swigNext = 0;
    private static Codec[] swigValues = {MP3, OPUS, AAC, Unknown};
    private final String swigName;
    private final int swigValue;

    private Codec(String str) {
        this.swigName = str;
        int i = swigNext;
        swigNext = i + 1;
        this.swigValue = i;
    }

    public static Codec swigToEnum(int i) {
        Codec[] codecArr = swigValues;
        if (i < codecArr.length && i >= 0 && codecArr[i].swigValue == i) {
            return codecArr[i];
        }
        int i2 = 0;
        while (true) {
            Codec[] codecArr2 = swigValues;
            if (i2 >= codecArr2.length) {
                StringBuilder sb = new StringBuilder();
                sb.append("No enum ");
                sb.append(Codec.class);
                sb.append(" with value ");
                sb.append(i);
                throw new IllegalArgumentException(sb.toString());
            } else if (codecArr2[i2].swigValue == i) {
                return codecArr2[i2];
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

    private Codec(String str, int i) {
        this.swigName = str;
        this.swigValue = i;
        swigNext = i + 1;
    }

    private Codec(String str, Codec codec) {
        this.swigName = str;
        this.swigValue = codec.swigValue;
        swigNext = this.swigValue + 1;
    }
}
