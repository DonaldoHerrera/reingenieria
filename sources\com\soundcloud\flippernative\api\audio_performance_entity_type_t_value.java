package com.soundcloud.flippernative.api;

public final class audio_performance_entity_type_t_value {
    public static final audio_performance_entity_type_t_value AD_AUDIO = new audio_performance_entity_type_t_value("AD_AUDIO");
    public static final audio_performance_entity_type_t_value AD_VIDEO = new audio_performance_entity_type_t_value("AD_VIDEO");
    public static final audio_performance_entity_type_t_value SOUNDCLOUD = new audio_performance_entity_type_t_value("SOUNDCLOUD");
    private static int swigNext = 0;
    private static audio_performance_entity_type_t_value[] swigValues = {AD_AUDIO, AD_VIDEO, SOUNDCLOUD};
    private final String swigName;
    private final int swigValue;

    private audio_performance_entity_type_t_value(String str) {
        this.swigName = str;
        int i = swigNext;
        swigNext = i + 1;
        this.swigValue = i;
    }

    public static audio_performance_entity_type_t_value swigToEnum(int i) {
        audio_performance_entity_type_t_value[] audio_performance_entity_type_t_valueArr = swigValues;
        if (i < audio_performance_entity_type_t_valueArr.length && i >= 0 && audio_performance_entity_type_t_valueArr[i].swigValue == i) {
            return audio_performance_entity_type_t_valueArr[i];
        }
        int i2 = 0;
        while (true) {
            audio_performance_entity_type_t_value[] audio_performance_entity_type_t_valueArr2 = swigValues;
            if (i2 >= audio_performance_entity_type_t_valueArr2.length) {
                StringBuilder sb = new StringBuilder();
                sb.append("No enum ");
                sb.append(audio_performance_entity_type_t_value.class);
                sb.append(" with value ");
                sb.append(i);
                throw new IllegalArgumentException(sb.toString());
            } else if (audio_performance_entity_type_t_valueArr2[i2].swigValue == i) {
                return audio_performance_entity_type_t_valueArr2[i2];
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

    private audio_performance_entity_type_t_value(String str, int i) {
        this.swigName = str;
        this.swigValue = i;
        swigNext = i + 1;
    }

    private audio_performance_entity_type_t_value(String str, audio_performance_entity_type_t_value audio_performance_entity_type_t_value) {
        this.swigName = str;
        this.swigValue = audio_performance_entity_type_t_value.swigValue;
        swigNext = this.swigValue + 1;
    }
}
