package com.soundcloud.flippernative.api;

public final class MediaFormat {
    public static final MediaFormat HLS_AAC = new MediaFormat("HLS_AAC");
    public static final MediaFormat HLS_MP3 = new MediaFormat("HLS_MP3");
    public static final MediaFormat HLS_OPUS = new MediaFormat("HLS_OPUS");
    public static final MediaFormat UNKNOWN = new MediaFormat("UNKNOWN");
    private static int swigNext = 0;
    private static MediaFormat[] swigValues = {HLS_OPUS, HLS_MP3, HLS_AAC, UNKNOWN};
    private final String swigName;
    private final int swigValue;

    private MediaFormat(String str) {
        this.swigName = str;
        int i = swigNext;
        swigNext = i + 1;
        this.swigValue = i;
    }

    public static MediaFormat swigToEnum(int i) {
        MediaFormat[] mediaFormatArr = swigValues;
        if (i < mediaFormatArr.length && i >= 0 && mediaFormatArr[i].swigValue == i) {
            return mediaFormatArr[i];
        }
        int i2 = 0;
        while (true) {
            MediaFormat[] mediaFormatArr2 = swigValues;
            if (i2 >= mediaFormatArr2.length) {
                StringBuilder sb = new StringBuilder();
                sb.append("No enum ");
                sb.append(MediaFormat.class);
                sb.append(" with value ");
                sb.append(i);
                throw new IllegalArgumentException(sb.toString());
            } else if (mediaFormatArr2[i2].swigValue == i) {
                return mediaFormatArr2[i2];
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

    private MediaFormat(String str, int i) {
        this.swigName = str;
        this.swigValue = i;
        swigNext = i + 1;
    }

    private MediaFormat(String str, MediaFormat mediaFormat) {
        this.swigName = str;
        this.swigValue = mediaFormat.swigValue;
        swigNext = this.swigValue + 1;
    }
}
