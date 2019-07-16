package com.soundcloud.flippernative.api;

public final class item_interaction_link_type_t_value {
    public static final item_interaction_link_type_t_value ATTRIBUTOR = new item_interaction_link_type_t_value("ATTRIBUTOR");
    public static final item_interaction_link_type_t_value OWNER = new item_interaction_link_type_t_value("OWNER");
    public static final item_interaction_link_type_t_value SELF = new item_interaction_link_type_t_value("SELF");
    private static int swigNext = 0;
    private static item_interaction_link_type_t_value[] swigValues = {ATTRIBUTOR, OWNER, SELF};
    private final String swigName;
    private final int swigValue;

    private item_interaction_link_type_t_value(String str) {
        this.swigName = str;
        int i = swigNext;
        swigNext = i + 1;
        this.swigValue = i;
    }

    public static item_interaction_link_type_t_value swigToEnum(int i) {
        item_interaction_link_type_t_value[] item_interaction_link_type_t_valueArr = swigValues;
        if (i < item_interaction_link_type_t_valueArr.length && i >= 0 && item_interaction_link_type_t_valueArr[i].swigValue == i) {
            return item_interaction_link_type_t_valueArr[i];
        }
        int i2 = 0;
        while (true) {
            item_interaction_link_type_t_value[] item_interaction_link_type_t_valueArr2 = swigValues;
            if (i2 >= item_interaction_link_type_t_valueArr2.length) {
                StringBuilder sb = new StringBuilder();
                sb.append("No enum ");
                sb.append(item_interaction_link_type_t_value.class);
                sb.append(" with value ");
                sb.append(i);
                throw new IllegalArgumentException(sb.toString());
            } else if (item_interaction_link_type_t_valueArr2[i2].swigValue == i) {
                return item_interaction_link_type_t_valueArr2[i2];
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

    private item_interaction_link_type_t_value(String str, int i) {
        this.swigName = str;
        this.swigValue = i;
        swigNext = i + 1;
    }

    private item_interaction_link_type_t_value(String str, item_interaction_link_type_t_value item_interaction_link_type_t_value) {
        this.swigName = str;
        this.swigValue = item_interaction_link_type_t_value.swigValue;
        swigNext = this.swigValue + 1;
    }
}
