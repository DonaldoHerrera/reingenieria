package com.soundcloud.flippernative.api;

public final class audio_trigger_t_value {
    public static final audio_trigger_t_value AUTO = new audio_trigger_t_value("AUTO");
    public static final audio_trigger_t_value MANUAL = new audio_trigger_t_value("MANUAL");
    public static final audio_trigger_t_value REPEAT = new audio_trigger_t_value("REPEAT");
    private static int swigNext = 0;
    private static audio_trigger_t_value[] swigValues = {MANUAL, AUTO, REPEAT};
    private final String swigName;
    private final int swigValue;

    private audio_trigger_t_value(String str) {
        this.swigName = str;
        int i = swigNext;
        swigNext = i + 1;
        this.swigValue = i;
    }

    public static audio_trigger_t_value swigToEnum(int i) {
        audio_trigger_t_value[] audio_trigger_t_valueArr = swigValues;
        if (i < audio_trigger_t_valueArr.length && i >= 0 && audio_trigger_t_valueArr[i].swigValue == i) {
            return audio_trigger_t_valueArr[i];
        }
        int i2 = 0;
        while (true) {
            audio_trigger_t_value[] audio_trigger_t_valueArr2 = swigValues;
            if (i2 >= audio_trigger_t_valueArr2.length) {
                StringBuilder sb = new StringBuilder();
                sb.append("No enum ");
                sb.append(audio_trigger_t_value.class);
                sb.append(" with value ");
                sb.append(i);
                throw new IllegalArgumentException(sb.toString());
            } else if (audio_trigger_t_valueArr2[i2].swigValue == i) {
                return audio_trigger_t_valueArr2[i2];
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

    private audio_trigger_t_value(String str, int i) {
        this.swigName = str;
        this.swigValue = i;
        swigNext = i + 1;
    }

    private audio_trigger_t_value(String str, audio_trigger_t_value audio_trigger_t_value) {
        this.swigName = str;
        this.swigValue = audio_trigger_t_value.swigValue;
        swigNext = this.swigValue + 1;
    }
}
