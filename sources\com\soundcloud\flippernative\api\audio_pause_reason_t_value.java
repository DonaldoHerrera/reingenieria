package com.soundcloud.flippernative.api;

public final class audio_pause_reason_t_value {
    public static final audio_pause_reason_t_value BUFFER_UNDERRUN = new audio_pause_reason_t_value("BUFFER_UNDERRUN");
    public static final audio_pause_reason_t_value CONCURRENT_STREAMING = new audio_pause_reason_t_value("CONCURRENT_STREAMING");
    public static final audio_pause_reason_t_value CONTEXT_CHANGE = new audio_pause_reason_t_value("CONTEXT_CHANGE");
    public static final audio_pause_reason_t_value END_OF_CONTENT = new audio_pause_reason_t_value("END_OF_CONTENT");
    public static final audio_pause_reason_t_value PAUSE = new audio_pause_reason_t_value("PAUSE");
    public static final audio_pause_reason_t_value PLAYBACK_ERROR = new audio_pause_reason_t_value("PLAYBACK_ERROR");
    public static final audio_pause_reason_t_value SEEK = new audio_pause_reason_t_value("SEEK");
    public static final audio_pause_reason_t_value SKIP = new audio_pause_reason_t_value("SKIP");
    public static final audio_pause_reason_t_value TRACK_FINISHED = new audio_pause_reason_t_value("TRACK_FINISHED");
    private static int swigNext = 0;
    private static audio_pause_reason_t_value[] swigValues = {PAUSE, BUFFER_UNDERRUN, SKIP, TRACK_FINISHED, END_OF_CONTENT, CONTEXT_CHANGE, PLAYBACK_ERROR, CONCURRENT_STREAMING, SEEK};
    private final String swigName;
    private final int swigValue;

    private audio_pause_reason_t_value(String str) {
        this.swigName = str;
        int i = swigNext;
        swigNext = i + 1;
        this.swigValue = i;
    }

    public static audio_pause_reason_t_value swigToEnum(int i) {
        audio_pause_reason_t_value[] audio_pause_reason_t_valueArr = swigValues;
        if (i < audio_pause_reason_t_valueArr.length && i >= 0 && audio_pause_reason_t_valueArr[i].swigValue == i) {
            return audio_pause_reason_t_valueArr[i];
        }
        int i2 = 0;
        while (true) {
            audio_pause_reason_t_value[] audio_pause_reason_t_valueArr2 = swigValues;
            if (i2 >= audio_pause_reason_t_valueArr2.length) {
                StringBuilder sb = new StringBuilder();
                sb.append("No enum ");
                sb.append(audio_pause_reason_t_value.class);
                sb.append(" with value ");
                sb.append(i);
                throw new IllegalArgumentException(sb.toString());
            } else if (audio_pause_reason_t_valueArr2[i2].swigValue == i) {
                return audio_pause_reason_t_valueArr2[i2];
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

    private audio_pause_reason_t_value(String str, int i) {
        this.swigName = str;
        this.swigValue = i;
        swigNext = i + 1;
    }

    private audio_pause_reason_t_value(String str, audio_pause_reason_t_value audio_pause_reason_t_value) {
        this.swigName = str;
        this.swigValue = audio_pause_reason_t_value.swigValue;
        swigNext = this.swigValue + 1;
    }
}
