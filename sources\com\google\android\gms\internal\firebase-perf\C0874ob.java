package com.google.android.gms.internal.firebase-perf;

import java.lang.reflect.Type;

/* renamed from: com.google.android.gms.internal.firebase-perf.ob reason: case insensitive filesystem */
public enum C0874ob {
    DOUBLE(0, C0882qb.SCALAR, Gb.DOUBLE),
    FLOAT(1, C0882qb.SCALAR, Gb.FLOAT),
    INT64(2, C0882qb.SCALAR, Gb.LONG),
    UINT64(3, C0882qb.SCALAR, Gb.LONG),
    INT32(4, C0882qb.SCALAR, Gb.INT),
    FIXED64(5, C0882qb.SCALAR, Gb.LONG),
    FIXED32(6, C0882qb.SCALAR, Gb.INT),
    BOOL(7, C0882qb.SCALAR, Gb.BOOLEAN),
    STRING(8, C0882qb.SCALAR, Gb.STRING),
    MESSAGE(9, C0882qb.SCALAR, Gb.MESSAGE),
    BYTES(10, C0882qb.SCALAR, Gb.BYTE_STRING),
    UINT32(11, C0882qb.SCALAR, Gb.INT),
    ENUM(12, C0882qb.SCALAR, Gb.ENUM),
    SFIXED32(13, C0882qb.SCALAR, Gb.INT),
    SFIXED64(14, C0882qb.SCALAR, Gb.LONG),
    SINT32(15, C0882qb.SCALAR, Gb.INT),
    SINT64(16, C0882qb.SCALAR, Gb.LONG),
    GROUP(17, C0882qb.SCALAR, Gb.MESSAGE),
    DOUBLE_LIST(18, C0882qb.VECTOR, Gb.DOUBLE),
    FLOAT_LIST(19, C0882qb.VECTOR, Gb.FLOAT),
    INT64_LIST(20, C0882qb.VECTOR, Gb.LONG),
    UINT64_LIST(21, C0882qb.VECTOR, Gb.LONG),
    INT32_LIST(22, C0882qb.VECTOR, Gb.INT),
    FIXED64_LIST(23, C0882qb.VECTOR, Gb.LONG),
    FIXED32_LIST(24, C0882qb.VECTOR, Gb.INT),
    BOOL_LIST(25, C0882qb.VECTOR, Gb.BOOLEAN),
    STRING_LIST(26, C0882qb.VECTOR, Gb.STRING),
    MESSAGE_LIST(27, C0882qb.VECTOR, Gb.MESSAGE),
    BYTES_LIST(28, C0882qb.VECTOR, Gb.BYTE_STRING),
    UINT32_LIST(29, C0882qb.VECTOR, Gb.INT),
    ENUM_LIST(30, C0882qb.VECTOR, Gb.ENUM),
    SFIXED32_LIST(31, C0882qb.VECTOR, Gb.INT),
    SFIXED64_LIST(32, C0882qb.VECTOR, Gb.LONG),
    SINT32_LIST(33, C0882qb.VECTOR, Gb.INT),
    SINT64_LIST(34, C0882qb.VECTOR, Gb.LONG),
    DOUBLE_LIST_PACKED(35, C0882qb.PACKED_VECTOR, Gb.DOUBLE),
    FLOAT_LIST_PACKED(36, C0882qb.PACKED_VECTOR, Gb.FLOAT),
    INT64_LIST_PACKED(37, C0882qb.PACKED_VECTOR, Gb.LONG),
    UINT64_LIST_PACKED(38, C0882qb.PACKED_VECTOR, Gb.LONG),
    INT32_LIST_PACKED(39, C0882qb.PACKED_VECTOR, Gb.INT),
    FIXED64_LIST_PACKED(40, C0882qb.PACKED_VECTOR, Gb.LONG),
    FIXED32_LIST_PACKED(41, C0882qb.PACKED_VECTOR, Gb.INT),
    BOOL_LIST_PACKED(42, C0882qb.PACKED_VECTOR, Gb.BOOLEAN),
    UINT32_LIST_PACKED(43, C0882qb.PACKED_VECTOR, Gb.INT),
    ENUM_LIST_PACKED(44, C0882qb.PACKED_VECTOR, Gb.ENUM),
    SFIXED32_LIST_PACKED(45, C0882qb.PACKED_VECTOR, Gb.INT),
    SFIXED64_LIST_PACKED(46, C0882qb.PACKED_VECTOR, Gb.LONG),
    SINT32_LIST_PACKED(47, C0882qb.PACKED_VECTOR, Gb.INT),
    SINT64_LIST_PACKED(48, C0882qb.PACKED_VECTOR, Gb.LONG),
    GROUP_LIST(49, C0882qb.VECTOR, Gb.MESSAGE),
    MAP(50, C0882qb.MAP, Gb.VOID);
    
    private static final C0874ob[] Z = null;
    private static final Type[] aa = null;
    private final Gb ca;
    private final int da;
    private final C0882qb ea;
    private final Class<?> fa;
    private final boolean ga;

    static {
        int i;
        aa = new Type[0];
        C0874ob[] values = values();
        Z = new C0874ob[values.length];
        for (C0874ob obVar : values) {
            Z[obVar.da] = obVar;
        }
    }

    private C0874ob(int i, C0882qb qbVar, Gb gb) {
        this.da = i;
        this.ea = qbVar;
        this.ca = gb;
        int i2 = C0885rb.a[qbVar.ordinal()];
        if (i2 == 1) {
            this.fa = gb.a();
        } else if (i2 != 2) {
            this.fa = null;
        } else {
            this.fa = gb.a();
        }
        boolean z = false;
        if (qbVar == C0882qb.SCALAR) {
            int i3 = C0885rb.b[gb.ordinal()];
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
