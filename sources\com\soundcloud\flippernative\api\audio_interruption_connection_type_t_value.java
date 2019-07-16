package com.soundcloud.flippernative.api;

public final class audio_interruption_connection_type_t_value {
    public static final audio_interruption_connection_type_t_value OFFLINE = new audio_interruption_connection_type_t_value("OFFLINE");
    public static final audio_interruption_connection_type_t_value UNKNOWN = new audio_interruption_connection_type_t_value("UNKNOWN");
    public static final audio_interruption_connection_type_t_value WIFI = new audio_interruption_connection_type_t_value("WIFI");
    public static final audio_interruption_connection_type_t_value _2G = new audio_interruption_connection_type_t_value("_2G");
    public static final audio_interruption_connection_type_t_value _3G = new audio_interruption_connection_type_t_value("_3G");
    public static final audio_interruption_connection_type_t_value _4G = new audio_interruption_connection_type_t_value("_4G");
    private static int swigNext = 0;
    private static audio_interruption_connection_type_t_value[] swigValues = {OFFLINE, WIFI, _2G, _3G, _4G, UNKNOWN};
    private final String swigName;
    private final int swigValue;

    private audio_interruption_connection_type_t_value(String str) {
        this.swigName = str;
        int i = swigNext;
        swigNext = i + 1;
        this.swigValue = i;
    }

    public static audio_interruption_connection_type_t_value swigToEnum(int i) {
        audio_interruption_connection_type_t_value[] audio_interruption_connection_type_t_valueArr = swigValues;
        if (i < audio_interruption_connection_type_t_valueArr.length && i >= 0 && audio_interruption_connection_type_t_valueArr[i].swigValue == i) {
            return audio_interruption_connection_type_t_valueArr[i];
        }
        int i2 = 0;
        while (true) {
            audio_interruption_connection_type_t_value[] audio_interruption_connection_type_t_valueArr2 = swigValues;
            if (i2 >= audio_interruption_connection_type_t_valueArr2.length) {
                StringBuilder sb = new StringBuilder();
                sb.append("No enum ");
                sb.append(audio_interruption_connection_type_t_value.class);
                sb.append(" with value ");
                sb.append(i);
                throw new IllegalArgumentException(sb.toString());
            } else if (audio_interruption_connection_type_t_valueArr2[i2].swigValue == i) {
                return audio_interruption_connection_type_t_valueArr2[i2];
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

    private audio_interruption_connection_type_t_value(String str, int i) {
        this.swigName = str;
        this.swigValue = i;
        swigNext = i + 1;
    }

    private audio_interruption_connection_type_t_value(String str, audio_interruption_connection_type_t_value audio_interruption_connection_type_t_value) {
        this.swigName = str;
        this.swigValue = audio_interruption_connection_type_t_value.swigValue;
        swigNext = this.swigValue + 1;
    }
}
