package com.soundcloud.flippernative.api;

public final class rich_media_stream_pause_reason_t_value {
    public static final rich_media_stream_pause_reason_t_value BUFFER_UNDERRUN = new rich_media_stream_pause_reason_t_value("BUFFER_UNDERRUN");
    public static final rich_media_stream_pause_reason_t_value CONCURRENT_STREAMING = new rich_media_stream_pause_reason_t_value("CONCURRENT_STREAMING");
    public static final rich_media_stream_pause_reason_t_value CONTEXT_CHANGE = new rich_media_stream_pause_reason_t_value("CONTEXT_CHANGE");
    public static final rich_media_stream_pause_reason_t_value END_OF_CONTENT = new rich_media_stream_pause_reason_t_value("END_OF_CONTENT");
    public static final rich_media_stream_pause_reason_t_value PAUSE = new rich_media_stream_pause_reason_t_value("PAUSE");
    public static final rich_media_stream_pause_reason_t_value PLAYBACK_ERROR = new rich_media_stream_pause_reason_t_value("PLAYBACK_ERROR");
    public static final rich_media_stream_pause_reason_t_value SKIP = new rich_media_stream_pause_reason_t_value("SKIP");
    public static final rich_media_stream_pause_reason_t_value TRACK_FINISHED = new rich_media_stream_pause_reason_t_value("TRACK_FINISHED");
    private static int swigNext = 0;
    private static rich_media_stream_pause_reason_t_value[] swigValues = {PAUSE, BUFFER_UNDERRUN, SKIP, TRACK_FINISHED, END_OF_CONTENT, CONTEXT_CHANGE, PLAYBACK_ERROR, CONCURRENT_STREAMING};
    private final String swigName;
    private final int swigValue;

    private rich_media_stream_pause_reason_t_value(String str) {
        this.swigName = str;
        int i = swigNext;
        swigNext = i + 1;
        this.swigValue = i;
    }

    public static rich_media_stream_pause_reason_t_value swigToEnum(int i) {
        rich_media_stream_pause_reason_t_value[] rich_media_stream_pause_reason_t_valueArr = swigValues;
        if (i < rich_media_stream_pause_reason_t_valueArr.length && i >= 0 && rich_media_stream_pause_reason_t_valueArr[i].swigValue == i) {
            return rich_media_stream_pause_reason_t_valueArr[i];
        }
        int i2 = 0;
        while (true) {
            rich_media_stream_pause_reason_t_value[] rich_media_stream_pause_reason_t_valueArr2 = swigValues;
            if (i2 >= rich_media_stream_pause_reason_t_valueArr2.length) {
                StringBuilder sb = new StringBuilder();
                sb.append("No enum ");
                sb.append(rich_media_stream_pause_reason_t_value.class);
                sb.append(" with value ");
                sb.append(i);
                throw new IllegalArgumentException(sb.toString());
            } else if (rich_media_stream_pause_reason_t_valueArr2[i2].swigValue == i) {
                return rich_media_stream_pause_reason_t_valueArr2[i2];
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

    private rich_media_stream_pause_reason_t_value(String str, int i) {
        this.swigName = str;
        this.swigValue = i;
        swigNext = i + 1;
    }

    private rich_media_stream_pause_reason_t_value(String str, rich_media_stream_pause_reason_t_value rich_media_stream_pause_reason_t_value) {
        this.swigName = str;
        this.swigValue = rich_media_stream_pause_reason_t_value.swigValue;
        swigNext = this.swigValue + 1;
    }
}
