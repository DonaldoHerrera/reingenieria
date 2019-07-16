package com.soundcloud.flippernative.api;

public final class pageview_navigation_type_t_value {
    public static final pageview_navigation_type_t_value INITIAL = new pageview_navigation_type_t_value("INITIAL");
    public static final pageview_navigation_type_t_value RELOAD = new pageview_navigation_type_t_value("RELOAD");
    public static final pageview_navigation_type_t_value VIRTUAL = new pageview_navigation_type_t_value("VIRTUAL");
    private static int swigNext = 0;
    private static pageview_navigation_type_t_value[] swigValues = {INITIAL, RELOAD, VIRTUAL};
    private final String swigName;
    private final int swigValue;

    private pageview_navigation_type_t_value(String str) {
        this.swigName = str;
        int i = swigNext;
        swigNext = i + 1;
        this.swigValue = i;
    }

    public static pageview_navigation_type_t_value swigToEnum(int i) {
        pageview_navigation_type_t_value[] pageview_navigation_type_t_valueArr = swigValues;
        if (i < pageview_navigation_type_t_valueArr.length && i >= 0 && pageview_navigation_type_t_valueArr[i].swigValue == i) {
            return pageview_navigation_type_t_valueArr[i];
        }
        int i2 = 0;
        while (true) {
            pageview_navigation_type_t_value[] pageview_navigation_type_t_valueArr2 = swigValues;
            if (i2 >= pageview_navigation_type_t_valueArr2.length) {
                StringBuilder sb = new StringBuilder();
                sb.append("No enum ");
                sb.append(pageview_navigation_type_t_value.class);
                sb.append(" with value ");
                sb.append(i);
                throw new IllegalArgumentException(sb.toString());
            } else if (pageview_navigation_type_t_valueArr2[i2].swigValue == i) {
                return pageview_navigation_type_t_valueArr2[i2];
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

    private pageview_navigation_type_t_value(String str, int i) {
        this.swigName = str;
        this.swigValue = i;
        swigNext = i + 1;
    }

    private pageview_navigation_type_t_value(String str, pageview_navigation_type_t_value pageview_navigation_type_t_value) {
        this.swigName = str;
        this.swigValue = pageview_navigation_type_t_value.swigValue;
        swigNext = this.swigValue + 1;
    }
}
