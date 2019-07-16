package com.soundcloud.flippernative.api;

public final class pageview_connection_type_t_value {
    public static final pageview_connection_type_t_value OFFLINE = new pageview_connection_type_t_value("OFFLINE");
    public static final pageview_connection_type_t_value UNKNOWN = new pageview_connection_type_t_value("UNKNOWN");
    public static final pageview_connection_type_t_value WIFI = new pageview_connection_type_t_value("WIFI");
    public static final pageview_connection_type_t_value _2G = new pageview_connection_type_t_value("_2G");
    public static final pageview_connection_type_t_value _3G = new pageview_connection_type_t_value("_3G");
    public static final pageview_connection_type_t_value _4G = new pageview_connection_type_t_value("_4G");
    private static int swigNext = 0;
    private static pageview_connection_type_t_value[] swigValues = {OFFLINE, WIFI, _2G, _3G, _4G, UNKNOWN};
    private final String swigName;
    private final int swigValue;

    private pageview_connection_type_t_value(String str) {
        this.swigName = str;
        int i = swigNext;
        swigNext = i + 1;
        this.swigValue = i;
    }

    public static pageview_connection_type_t_value swigToEnum(int i) {
        pageview_connection_type_t_value[] pageview_connection_type_t_valueArr = swigValues;
        if (i < pageview_connection_type_t_valueArr.length && i >= 0 && pageview_connection_type_t_valueArr[i].swigValue == i) {
            return pageview_connection_type_t_valueArr[i];
        }
        int i2 = 0;
        while (true) {
            pageview_connection_type_t_value[] pageview_connection_type_t_valueArr2 = swigValues;
            if (i2 >= pageview_connection_type_t_valueArr2.length) {
                StringBuilder sb = new StringBuilder();
                sb.append("No enum ");
                sb.append(pageview_connection_type_t_value.class);
                sb.append(" with value ");
                sb.append(i);
                throw new IllegalArgumentException(sb.toString());
            } else if (pageview_connection_type_t_valueArr2[i2].swigValue == i) {
                return pageview_connection_type_t_valueArr2[i2];
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

    private pageview_connection_type_t_value(String str, int i) {
        this.swigName = str;
        this.swigValue = i;
        swigNext = i + 1;
    }

    private pageview_connection_type_t_value(String str, pageview_connection_type_t_value pageview_connection_type_t_value) {
        this.swigName = str;
        this.swigValue = pageview_connection_type_t_value.swigValue;
        swigNext = this.swigValue + 1;
    }
}
