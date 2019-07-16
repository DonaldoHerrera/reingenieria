package com.soundcloud.flippernative.api;

public final class rich_media_stream_action_t_value {
    public static final rich_media_stream_action_t_value CHECKPOINT = new rich_media_stream_action_t_value("CHECKPOINT");
    public static final rich_media_stream_action_t_value PAUSE = new rich_media_stream_action_t_value("PAUSE");
    public static final rich_media_stream_action_t_value PLAY = new rich_media_stream_action_t_value("PLAY");
    public static final rich_media_stream_action_t_value PLAY_START = new rich_media_stream_action_t_value("PLAY_START");
    private static int swigNext = 0;
    private static rich_media_stream_action_t_value[] swigValues = {PLAY, PAUSE, CHECKPOINT, PLAY_START};
    private final String swigName;
    private final int swigValue;

    private rich_media_stream_action_t_value(String str) {
        this.swigName = str;
        int i = swigNext;
        swigNext = i + 1;
        this.swigValue = i;
    }

    public static rich_media_stream_action_t_value swigToEnum(int i) {
        rich_media_stream_action_t_value[] rich_media_stream_action_t_valueArr = swigValues;
        if (i < rich_media_stream_action_t_valueArr.length && i >= 0 && rich_media_stream_action_t_valueArr[i].swigValue == i) {
            return rich_media_stream_action_t_valueArr[i];
        }
        int i2 = 0;
        while (true) {
            rich_media_stream_action_t_value[] rich_media_stream_action_t_valueArr2 = swigValues;
            if (i2 >= rich_media_stream_action_t_valueArr2.length) {
                StringBuilder sb = new StringBuilder();
                sb.append("No enum ");
                sb.append(rich_media_stream_action_t_value.class);
                sb.append(" with value ");
                sb.append(i);
                throw new IllegalArgumentException(sb.toString());
            } else if (rich_media_stream_action_t_valueArr2[i2].swigValue == i) {
                return rich_media_stream_action_t_valueArr2[i2];
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

    private rich_media_stream_action_t_value(String str, int i) {
        this.swigName = str;
        this.swigValue = i;
        swigNext = i + 1;
    }

    private rich_media_stream_action_t_value(String str, rich_media_stream_action_t_value rich_media_stream_action_t_value) {
        this.swigName = str;
        this.swigValue = rich_media_stream_action_t_value.swigValue;
        swigNext = this.swigValue + 1;
    }
}
