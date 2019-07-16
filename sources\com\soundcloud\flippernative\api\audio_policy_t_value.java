package com.soundcloud.flippernative.api;

public final class audio_policy_t_value {
    public static final audio_policy_t_value ALLOW = new audio_policy_t_value("ALLOW");
    public static final audio_policy_t_value MONETIZE = new audio_policy_t_value("MONETIZE");
    public static final audio_policy_t_value SNIP = new audio_policy_t_value("SNIP");
    private static int swigNext = 0;
    private static audio_policy_t_value[] swigValues = {MONETIZE, ALLOW, SNIP};
    private final String swigName;
    private final int swigValue;

    private audio_policy_t_value(String str) {
        this.swigName = str;
        int i = swigNext;
        swigNext = i + 1;
        this.swigValue = i;
    }

    public static audio_policy_t_value swigToEnum(int i) {
        audio_policy_t_value[] audio_policy_t_valueArr = swigValues;
        if (i < audio_policy_t_valueArr.length && i >= 0 && audio_policy_t_valueArr[i].swigValue == i) {
            return audio_policy_t_valueArr[i];
        }
        int i2 = 0;
        while (true) {
            audio_policy_t_value[] audio_policy_t_valueArr2 = swigValues;
            if (i2 >= audio_policy_t_valueArr2.length) {
                StringBuilder sb = new StringBuilder();
                sb.append("No enum ");
                sb.append(audio_policy_t_value.class);
                sb.append(" with value ");
                sb.append(i);
                throw new IllegalArgumentException(sb.toString());
            } else if (audio_policy_t_valueArr2[i2].swigValue == i) {
                return audio_policy_t_valueArr2[i2];
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

    private audio_policy_t_value(String str, int i) {
        this.swigName = str;
        this.swigValue = i;
        swigNext = i + 1;
    }

    private audio_policy_t_value(String str, audio_policy_t_value audio_policy_t_value) {
        this.swigName = str;
        this.swigValue = audio_policy_t_value.swigValue;
        swigNext = this.swigValue + 1;
    }
}
