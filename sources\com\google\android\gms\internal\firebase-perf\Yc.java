package com.google.android.gms.internal.firebase-perf;

public enum Yc {
    DOUBLE(fd.DOUBLE, 1),
    FLOAT(fd.FLOAT, 5),
    INT64(fd.LONG, 0),
    UINT64(fd.LONG, 0),
    INT32(fd.INT, 0),
    FIXED64(fd.LONG, 1),
    FIXED32(fd.INT, 5),
    BOOL(fd.BOOLEAN, 0),
    STRING(fd.STRING, 2),
    GROUP(fd.MESSAGE, 3),
    MESSAGE(fd.MESSAGE, 2),
    BYTES(fd.BYTE_STRING, 2),
    UINT32(fd.INT, 0),
    ENUM(fd.ENUM, 0),
    SFIXED32(fd.INT, 5),
    SFIXED64(fd.LONG, 1),
    SINT32(fd.INT, 0),
    SINT64(fd.LONG, 0);
    
    private final fd t;
    private final int u;

    private Yc(fd fdVar, int i) {
        this.t = fdVar;
        this.u = i;
    }

    public final fd a() {
        return this.t;
    }

    public final int b() {
        return this.u;
    }
}
