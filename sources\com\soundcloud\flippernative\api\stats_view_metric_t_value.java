package com.soundcloud.flippernative.api;

public final class stats_view_metric_t_value {
    public static final stats_view_metric_t_value COMMENTS = new stats_view_metric_t_value("COMMENTS");
    public static final stats_view_metric_t_value DOWNLOADS = new stats_view_metric_t_value("DOWNLOADS");
    public static final stats_view_metric_t_value LIKES = new stats_view_metric_t_value("LIKES");
    public static final stats_view_metric_t_value PLAYS = new stats_view_metric_t_value("PLAYS");
    public static final stats_view_metric_t_value REPOSTS = new stats_view_metric_t_value("REPOSTS");
    public static final stats_view_metric_t_value RSS = new stats_view_metric_t_value("RSS");
    private static int swigNext = 0;
    private static stats_view_metric_t_value[] swigValues = {PLAYS, LIKES, COMMENTS, REPOSTS, DOWNLOADS, RSS};
    private final String swigName;
    private final int swigValue;

    private stats_view_metric_t_value(String str) {
        this.swigName = str;
        int i = swigNext;
        swigNext = i + 1;
        this.swigValue = i;
    }

    public static stats_view_metric_t_value swigToEnum(int i) {
        stats_view_metric_t_value[] stats_view_metric_t_valueArr = swigValues;
        if (i < stats_view_metric_t_valueArr.length && i >= 0 && stats_view_metric_t_valueArr[i].swigValue == i) {
            return stats_view_metric_t_valueArr[i];
        }
        int i2 = 0;
        while (true) {
            stats_view_metric_t_value[] stats_view_metric_t_valueArr2 = swigValues;
            if (i2 >= stats_view_metric_t_valueArr2.length) {
                StringBuilder sb = new StringBuilder();
                sb.append("No enum ");
                sb.append(stats_view_metric_t_value.class);
                sb.append(" with value ");
                sb.append(i);
                throw new IllegalArgumentException(sb.toString());
            } else if (stats_view_metric_t_valueArr2[i2].swigValue == i) {
                return stats_view_metric_t_valueArr2[i2];
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

    private stats_view_metric_t_value(String str, int i) {
        this.swigName = str;
        this.swigValue = i;
        swigNext = i + 1;
    }

    private stats_view_metric_t_value(String str, stats_view_metric_t_value stats_view_metric_t_value) {
        this.swigName = str;
        this.swigValue = stats_view_metric_t_value.swigValue;
        swigNext = this.swigValue + 1;
    }
}
