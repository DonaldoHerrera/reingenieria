package com.soundcloud.flippernative.api;

public final class stats_view_type_t_value {
    public static final stats_view_type_t_value TRACK = new stats_view_type_t_value("TRACK");
    public static final stats_view_type_t_value USER = new stats_view_type_t_value("USER");
    private static int swigNext = 0;
    private static stats_view_type_t_value[] swigValues = {TRACK, USER};
    private final String swigName;
    private final int swigValue;

    private stats_view_type_t_value(String str) {
        this.swigName = str;
        int i = swigNext;
        swigNext = i + 1;
        this.swigValue = i;
    }

    public static stats_view_type_t_value swigToEnum(int i) {
        stats_view_type_t_value[] stats_view_type_t_valueArr = swigValues;
        if (i < stats_view_type_t_valueArr.length && i >= 0 && stats_view_type_t_valueArr[i].swigValue == i) {
            return stats_view_type_t_valueArr[i];
        }
        int i2 = 0;
        while (true) {
            stats_view_type_t_value[] stats_view_type_t_valueArr2 = swigValues;
            if (i2 >= stats_view_type_t_valueArr2.length) {
                StringBuilder sb = new StringBuilder();
                sb.append("No enum ");
                sb.append(stats_view_type_t_value.class);
                sb.append(" with value ");
                sb.append(i);
                throw new IllegalArgumentException(sb.toString());
            } else if (stats_view_type_t_valueArr2[i2].swigValue == i) {
                return stats_view_type_t_valueArr2[i2];
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

    private stats_view_type_t_value(String str, int i) {
        this.swigName = str;
        this.swigValue = i;
        swigNext = i + 1;
    }

    private stats_view_type_t_value(String str, stats_view_type_t_value stats_view_type_t_value) {
        this.swigName = str;
        this.swigValue = stats_view_type_t_value.swigValue;
        swigNext = this.swigValue + 1;
    }
}
