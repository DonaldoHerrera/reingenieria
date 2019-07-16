package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.od reason: case insensitive filesystem */
public enum C1015od {
    DOUBLE(C1032rd.DOUBLE, 1),
    FLOAT(C1032rd.FLOAT, 5),
    INT64(C1032rd.LONG, 0),
    UINT64(C1032rd.LONG, 0),
    INT32(C1032rd.INT, 0),
    FIXED64(C1032rd.LONG, 1),
    FIXED32(C1032rd.INT, 5),
    BOOL(C1032rd.BOOLEAN, 0),
    STRING(C1032rd.STRING, 2),
    GROUP(C1032rd.MESSAGE, 3),
    MESSAGE(C1032rd.MESSAGE, 2),
    BYTES(C1032rd.BYTE_STRING, 2),
    UINT32(C1032rd.INT, 0),
    ENUM(C1032rd.ENUM, 0),
    SFIXED32(C1032rd.INT, 5),
    SFIXED64(C1032rd.LONG, 1),
    SINT32(C1032rd.INT, 0),
    SINT64(C1032rd.LONG, 0);
    
    private final C1032rd t;
    private final int u;

    private C1015od(C1032rd rdVar, int i) {
        this.t = rdVar;
        this.u = i;
    }

    public final C1032rd a() {
        return this.t;
    }
}
