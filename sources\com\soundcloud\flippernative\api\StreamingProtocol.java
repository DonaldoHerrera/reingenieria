package com.soundcloud.flippernative.api;

public final class StreamingProtocol {
    public static final StreamingProtocol EncryptedHls = new StreamingProtocol("EncryptedHls");
    public static final StreamingProtocol File = new StreamingProtocol("File");
    public static final StreamingProtocol Hls = new StreamingProtocol("Hls");
    public static final StreamingProtocol Unknown = new StreamingProtocol("Unknown");
    private static int swigNext = 0;
    private static StreamingProtocol[] swigValues = {Hls, EncryptedHls, File, Unknown};
    private final String swigName;
    private final int swigValue;

    private StreamingProtocol(String str) {
        this.swigName = str;
        int i = swigNext;
        swigNext = i + 1;
        this.swigValue = i;
    }

    public static StreamingProtocol swigToEnum(int i) {
        StreamingProtocol[] streamingProtocolArr = swigValues;
        if (i < streamingProtocolArr.length && i >= 0 && streamingProtocolArr[i].swigValue == i) {
            return streamingProtocolArr[i];
        }
        int i2 = 0;
        while (true) {
            StreamingProtocol[] streamingProtocolArr2 = swigValues;
            if (i2 >= streamingProtocolArr2.length) {
                StringBuilder sb = new StringBuilder();
                sb.append("No enum ");
                sb.append(StreamingProtocol.class);
                sb.append(" with value ");
                sb.append(i);
                throw new IllegalArgumentException(sb.toString());
            } else if (streamingProtocolArr2[i2].swigValue == i) {
                return streamingProtocolArr2[i2];
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

    private StreamingProtocol(String str, int i) {
        this.swigName = str;
        this.swigValue = i;
        swigNext = i + 1;
    }

    private StreamingProtocol(String str, StreamingProtocol streamingProtocol) {
        this.swigName = str;
        this.swigValue = streamingProtocol.swigValue;
        swigNext = this.swigValue + 1;
    }
}
