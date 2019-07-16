package com.google.android.gms.internal.clearcut;

public enum Ib {
    DOUBLE(Nb.DOUBLE, 1),
    FLOAT(Nb.FLOAT, 5),
    INT64(Nb.LONG, 0),
    UINT64(Nb.LONG, 0),
    INT32(Nb.INT, 0),
    FIXED64(Nb.LONG, 1),
    FIXED32(Nb.INT, 5),
    BOOL(Nb.BOOLEAN, 0),
    STRING(Nb.STRING, 2),
    GROUP(Nb.MESSAGE, 3),
    MESSAGE(Nb.MESSAGE, 2),
    BYTES(Nb.BYTE_STRING, 2),
    UINT32(Nb.INT, 0),
    ENUM(Nb.ENUM, 0),
    SFIXED32(Nb.INT, 5),
    SFIXED64(Nb.LONG, 1),
    SINT32(Nb.INT, 0),
    SINT64(Nb.LONG, 0);
    
    private final Nb t;
    private final int u;

    private Ib(Nb nb, int i) {
        this.t = nb;
        this.u = i;
    }

    public final Nb a() {
        return this.t;
    }
}
