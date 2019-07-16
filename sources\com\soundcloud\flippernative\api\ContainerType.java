package com.soundcloud.flippernative.api;

public final class ContainerType {
    public static final ContainerType FMP4 = new ContainerType("FMP4");
    public static final ContainerType MP3 = new ContainerType("MP3");
    public static final ContainerType MP4 = new ContainerType("MP4");
    public static final ContainerType OGG = new ContainerType("OGG");
    public static final ContainerType Unknown = new ContainerType("Unknown");
    private static int swigNext = 0;
    private static ContainerType[] swigValues = {MP3, MP4, FMP4, OGG, Unknown};
    private final String swigName;
    private final int swigValue;

    private ContainerType(String str) {
        this.swigName = str;
        int i = swigNext;
        swigNext = i + 1;
        this.swigValue = i;
    }

    public static ContainerType swigToEnum(int i) {
        ContainerType[] containerTypeArr = swigValues;
        if (i < containerTypeArr.length && i >= 0 && containerTypeArr[i].swigValue == i) {
            return containerTypeArr[i];
        }
        int i2 = 0;
        while (true) {
            ContainerType[] containerTypeArr2 = swigValues;
            if (i2 >= containerTypeArr2.length) {
                StringBuilder sb = new StringBuilder();
                sb.append("No enum ");
                sb.append(ContainerType.class);
                sb.append(" with value ");
                sb.append(i);
                throw new IllegalArgumentException(sb.toString());
            } else if (containerTypeArr2[i2].swigValue == i) {
                return containerTypeArr2[i2];
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

    private ContainerType(String str, int i) {
        this.swigName = str;
        this.swigValue = i;
        swigNext = i + 1;
    }

    private ContainerType(String str, ContainerType containerType) {
        this.swigName = str;
        this.swigValue = containerType.swigValue;
        swigNext = this.swigValue + 1;
    }
}
