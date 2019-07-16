package com.soundcloud.flippernative.api;

public final class audio_error_quality_t_value {
    public static final audio_error_quality_t_value HQ = new audio_error_quality_t_value("HQ");
    public static final audio_error_quality_t_value SQ = new audio_error_quality_t_value("SQ");
    private static int swigNext = 0;
    private static audio_error_quality_t_value[] swigValues = {SQ, HQ};
    private final String swigName;
    private final int swigValue;

    private audio_error_quality_t_value(String str) {
        this.swigName = str;
        int i = swigNext;
        swigNext = i + 1;
        this.swigValue = i;
    }

    public static audio_error_quality_t_value swigToEnum(int i) {
        audio_error_quality_t_value[] audio_error_quality_t_valueArr = swigValues;
        if (i < audio_error_quality_t_valueArr.length && i >= 0 && audio_error_quality_t_valueArr[i].swigValue == i) {
            return audio_error_quality_t_valueArr[i];
        }
        int i2 = 0;
        while (true) {
            audio_error_quality_t_value[] audio_error_quality_t_valueArr2 = swigValues;
            if (i2 >= audio_error_quality_t_valueArr2.length) {
                StringBuilder sb = new StringBuilder();
                sb.append("No enum ");
                sb.append(audio_error_quality_t_value.class);
                sb.append(" with value ");
                sb.append(i);
                throw new IllegalArgumentException(sb.toString());
            } else if (audio_error_quality_t_valueArr2[i2].swigValue == i) {
                return audio_error_quality_t_valueArr2[i2];
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

    private audio_error_quality_t_value(String str, int i) {
        this.swigName = str;
        this.swigValue = i;
        swigNext = i + 1;
    }

    private audio_error_quality_t_value(String str, audio_error_quality_t_value audio_error_quality_t_value) {
        this.swigName = str;
        this.swigValue = audio_error_quality_t_value.swigValue;
        swigNext = this.swigValue + 1;
    }
}
