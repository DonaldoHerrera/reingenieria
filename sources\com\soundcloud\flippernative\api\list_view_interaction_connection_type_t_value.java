package com.soundcloud.flippernative.api;

public final class list_view_interaction_connection_type_t_value {
    public static final list_view_interaction_connection_type_t_value OFFLINE = new list_view_interaction_connection_type_t_value("OFFLINE");
    public static final list_view_interaction_connection_type_t_value UNKNOWN = new list_view_interaction_connection_type_t_value("UNKNOWN");
    public static final list_view_interaction_connection_type_t_value WIFI = new list_view_interaction_connection_type_t_value("WIFI");
    public static final list_view_interaction_connection_type_t_value _2G = new list_view_interaction_connection_type_t_value("_2G");
    public static final list_view_interaction_connection_type_t_value _3G = new list_view_interaction_connection_type_t_value("_3G");
    public static final list_view_interaction_connection_type_t_value _4G = new list_view_interaction_connection_type_t_value("_4G");
    private static int swigNext = 0;
    private static list_view_interaction_connection_type_t_value[] swigValues = {OFFLINE, WIFI, _2G, _3G, _4G, UNKNOWN};
    private final String swigName;
    private final int swigValue;

    private list_view_interaction_connection_type_t_value(String str) {
        this.swigName = str;
        int i = swigNext;
        swigNext = i + 1;
        this.swigValue = i;
    }

    public static list_view_interaction_connection_type_t_value swigToEnum(int i) {
        list_view_interaction_connection_type_t_value[] list_view_interaction_connection_type_t_valueArr = swigValues;
        if (i < list_view_interaction_connection_type_t_valueArr.length && i >= 0 && list_view_interaction_connection_type_t_valueArr[i].swigValue == i) {
            return list_view_interaction_connection_type_t_valueArr[i];
        }
        int i2 = 0;
        while (true) {
            list_view_interaction_connection_type_t_value[] list_view_interaction_connection_type_t_valueArr2 = swigValues;
            if (i2 >= list_view_interaction_connection_type_t_valueArr2.length) {
                StringBuilder sb = new StringBuilder();
                sb.append("No enum ");
                sb.append(list_view_interaction_connection_type_t_value.class);
                sb.append(" with value ");
                sb.append(i);
                throw new IllegalArgumentException(sb.toString());
            } else if (list_view_interaction_connection_type_t_valueArr2[i2].swigValue == i) {
                return list_view_interaction_connection_type_t_valueArr2[i2];
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

    private list_view_interaction_connection_type_t_value(String str, int i) {
        this.swigName = str;
        this.swigValue = i;
        swigNext = i + 1;
    }

    private list_view_interaction_connection_type_t_value(String str, list_view_interaction_connection_type_t_value list_view_interaction_connection_type_t_value) {
        this.swigName = str;
        this.swigValue = list_view_interaction_connection_type_t_value.swigValue;
        swigNext = this.swigValue + 1;
    }
}
