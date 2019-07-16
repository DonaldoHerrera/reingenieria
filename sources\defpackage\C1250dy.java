package defpackage;

/* renamed from: dy reason: default package and case insensitive filesystem */
public enum C1250dy {
    DOUBLE(C1343gy.DOUBLE, 1),
    FLOAT(C1343gy.FLOAT, 5),
    INT64(C1343gy.LONG, 0),
    UINT64(C1343gy.LONG, 0),
    INT32(C1343gy.INT, 0),
    FIXED64(C1343gy.LONG, 1),
    FIXED32(C1343gy.INT, 5),
    BOOL(C1343gy.BOOLEAN, 0),
    STRING(C1343gy.STRING, 2),
    GROUP(C1343gy.MESSAGE, 3),
    MESSAGE(C1343gy.MESSAGE, 2),
    BYTES(C1343gy.BYTE_STRING, 2),
    UINT32(C1343gy.INT, 0),
    ENUM(C1343gy.ENUM, 0),
    SFIXED32(C1343gy.INT, 5),
    SFIXED64(C1343gy.LONG, 1),
    SINT32(C1343gy.INT, 0),
    SINT64(C1343gy.LONG, 0);
    
    private final C1343gy t;
    private final int u;

    private C1250dy(C1343gy gyVar, int i) {
        this.t = gyVar;
        this.u = i;
    }

    public final C1343gy a() {
        return this.t;
    }
}
