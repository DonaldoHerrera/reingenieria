package com.soundcloud.flippernative.api;

public final class click_connection_type_t_value {
    public static final click_connection_type_t_value OFFLINE = new click_connection_type_t_value("OFFLINE");
    public static final click_connection_type_t_value UNKNOWN = new click_connection_type_t_value("UNKNOWN");
    public static final click_connection_type_t_value WIFI = new click_connection_type_t_value("WIFI");
    public static final click_connection_type_t_value _2G = new click_connection_type_t_value("_2G");
    public static final click_connection_type_t_value _3G = new click_connection_type_t_value("_3G");
    public static final click_connection_type_t_value _4G = new click_connection_type_t_value("_4G");
    private static int swigNext = 0;
    private static click_connection_type_t_value[] swigValues = {OFFLINE, WIFI, _2G, _3G, _4G, UNKNOWN};
    private final String swigName;
    private final int swigValue;

    private click_connection_type_t_value(String str) {
        this.swigName = str;
        int i = swigNext;
        swigNext = i + 1;
        this.swigValue = i;
    }

    public static click_connection_type_t_value swigToEnum(int i) {
        click_connection_type_t_value[] click_connection_type_t_valueArr = swigValues;
        if (i < click_connection_type_t_valueArr.length && i >= 0 && click_connection_type_t_valueArr[i].swigValue == i) {
            return click_connection_type_t_valueArr[i];
        }
        int i2 = 0;
        while (true) {
            click_connection_type_t_value[] click_connection_type_t_valueArr2 = swigValues;
            if (i2 >= click_connection_type_t_valueArr2.length) {
                StringBuilder sb = new StringBuilder();
                sb.append("No enum ");
                sb.append(click_connection_type_t_value.class);
                sb.append(" with value ");
                sb.append(i);
                throw new IllegalArgumentException(sb.toString());
            } else if (click_connection_type_t_valueArr2[i2].swigValue == i) {
                return click_connection_type_t_valueArr2[i2];
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

    private click_connection_type_t_value(String str, int i) {
        this.swigName = str;
        this.swigValue = i;
        swigNext = i + 1;
    }

    private click_connection_type_t_value(String str, click_connection_type_t_value click_connection_type_t_value) {
        this.swigName = str;
        this.swigValue = click_connection_type_t_value.swigValue;
        swigNext = this.swigValue + 1;
    }
}
