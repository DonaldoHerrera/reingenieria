package com.soundcloud.flippernative.api;

public final class offline_sync_quality_t_value {
    public static final offline_sync_quality_t_value HQ = new offline_sync_quality_t_value("HQ");
    public static final offline_sync_quality_t_value SQ = new offline_sync_quality_t_value("SQ");
    private static int swigNext = 0;
    private static offline_sync_quality_t_value[] swigValues = {SQ, HQ};
    private final String swigName;
    private final int swigValue;

    private offline_sync_quality_t_value(String str) {
        this.swigName = str;
        int i = swigNext;
        swigNext = i + 1;
        this.swigValue = i;
    }

    public static offline_sync_quality_t_value swigToEnum(int i) {
        offline_sync_quality_t_value[] offline_sync_quality_t_valueArr = swigValues;
        if (i < offline_sync_quality_t_valueArr.length && i >= 0 && offline_sync_quality_t_valueArr[i].swigValue == i) {
            return offline_sync_quality_t_valueArr[i];
        }
        int i2 = 0;
        while (true) {
            offline_sync_quality_t_value[] offline_sync_quality_t_valueArr2 = swigValues;
            if (i2 >= offline_sync_quality_t_valueArr2.length) {
                StringBuilder sb = new StringBuilder();
                sb.append("No enum ");
                sb.append(offline_sync_quality_t_value.class);
                sb.append(" with value ");
                sb.append(i);
                throw new IllegalArgumentException(sb.toString());
            } else if (offline_sync_quality_t_valueArr2[i2].swigValue == i) {
                return offline_sync_quality_t_valueArr2[i2];
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

    private offline_sync_quality_t_value(String str, int i) {
        this.swigName = str;
        this.swigValue = i;
        swigNext = i + 1;
    }

    private offline_sync_quality_t_value(String str, offline_sync_quality_t_value offline_sync_quality_t_value) {
        this.swigName = str;
        this.swigValue = offline_sync_quality_t_value.swigValue;
        swigNext = this.swigValue + 1;
    }
}
