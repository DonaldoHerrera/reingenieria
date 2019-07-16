package com.google.android.gms.internal.measurement;

import java.lang.reflect.Type;

public enum Bb {
    DOUBLE(0, Db.SCALAR, Tb.DOUBLE),
    FLOAT(1, Db.SCALAR, Tb.FLOAT),
    INT64(2, Db.SCALAR, Tb.LONG),
    UINT64(3, Db.SCALAR, Tb.LONG),
    INT32(4, Db.SCALAR, Tb.INT),
    FIXED64(5, Db.SCALAR, Tb.LONG),
    FIXED32(6, Db.SCALAR, Tb.INT),
    BOOL(7, Db.SCALAR, Tb.BOOLEAN),
    STRING(8, Db.SCALAR, Tb.STRING),
    MESSAGE(9, Db.SCALAR, Tb.MESSAGE),
    BYTES(10, Db.SCALAR, Tb.BYTE_STRING),
    UINT32(11, Db.SCALAR, Tb.INT),
    ENUM(12, Db.SCALAR, Tb.ENUM),
    SFIXED32(13, Db.SCALAR, Tb.INT),
    SFIXED64(14, Db.SCALAR, Tb.LONG),
    SINT32(15, Db.SCALAR, Tb.INT),
    SINT64(16, Db.SCALAR, Tb.LONG),
    GROUP(17, Db.SCALAR, Tb.MESSAGE),
    DOUBLE_LIST(18, Db.VECTOR, Tb.DOUBLE),
    FLOAT_LIST(19, Db.VECTOR, Tb.FLOAT),
    INT64_LIST(20, Db.VECTOR, Tb.LONG),
    UINT64_LIST(21, Db.VECTOR, Tb.LONG),
    INT32_LIST(22, Db.VECTOR, Tb.INT),
    FIXED64_LIST(23, Db.VECTOR, Tb.LONG),
    FIXED32_LIST(24, Db.VECTOR, Tb.INT),
    BOOL_LIST(25, Db.VECTOR, Tb.BOOLEAN),
    STRING_LIST(26, Db.VECTOR, Tb.STRING),
    MESSAGE_LIST(27, Db.VECTOR, Tb.MESSAGE),
    BYTES_LIST(28, Db.VECTOR, Tb.BYTE_STRING),
    UINT32_LIST(29, Db.VECTOR, Tb.INT),
    ENUM_LIST(30, Db.VECTOR, Tb.ENUM),
    SFIXED32_LIST(31, Db.VECTOR, Tb.INT),
    SFIXED64_LIST(32, Db.VECTOR, Tb.LONG),
    SINT32_LIST(33, Db.VECTOR, Tb.INT),
    SINT64_LIST(34, Db.VECTOR, Tb.LONG),
    DOUBLE_LIST_PACKED(35, Db.PACKED_VECTOR, Tb.DOUBLE),
    FLOAT_LIST_PACKED(36, Db.PACKED_VECTOR, Tb.FLOAT),
    INT64_LIST_PACKED(37, Db.PACKED_VECTOR, Tb.LONG),
    UINT64_LIST_PACKED(38, Db.PACKED_VECTOR, Tb.LONG),
    INT32_LIST_PACKED(39, Db.PACKED_VECTOR, Tb.INT),
    FIXED64_LIST_PACKED(40, Db.PACKED_VECTOR, Tb.LONG),
    FIXED32_LIST_PACKED(41, Db.PACKED_VECTOR, Tb.INT),
    BOOL_LIST_PACKED(42, Db.PACKED_VECTOR, Tb.BOOLEAN),
    UINT32_LIST_PACKED(43, Db.PACKED_VECTOR, Tb.INT),
    ENUM_LIST_PACKED(44, Db.PACKED_VECTOR, Tb.ENUM),
    SFIXED32_LIST_PACKED(45, Db.PACKED_VECTOR, Tb.INT),
    SFIXED64_LIST_PACKED(46, Db.PACKED_VECTOR, Tb.LONG),
    SINT32_LIST_PACKED(47, Db.PACKED_VECTOR, Tb.INT),
    SINT64_LIST_PACKED(48, Db.PACKED_VECTOR, Tb.LONG),
    GROUP_LIST(49, Db.VECTOR, Tb.MESSAGE),
    MAP(50, Db.MAP, Tb.VOID);
    
    private static final Bb[] Z = null;
    private static final Type[] aa = null;
    private final Tb ca;
    private final int da;
    private final Db ea;
    private final Class<?> fa;
    private final boolean ga;

    static {
        int i;
        aa = new Type[0];
        Bb[] values = values();
        Z = new Bb[values.length];
        for (Bb bb : values) {
            Z[bb.da] = bb;
        }
    }

    private Bb(int i, Db db, Tb tb) {
        this.da = i;
        this.ea = db;
        this.ca = tb;
        int i2 = Ab.a[db.ordinal()];
        if (i2 == 1) {
            this.fa = tb.a();
        } else if (i2 != 2) {
            this.fa = null;
        } else {
            this.fa = tb.a();
        }
        boolean z = false;
        if (db == Db.SCALAR) {
            int i3 = Ab.b[tb.ordinal()];
            if (!(i3 == 1 || i3 == 2 || i3 == 3)) {
                z = true;
            }
        }
        this.ga = z;
    }

    public final int a() {
        return this.da;
    }
}
