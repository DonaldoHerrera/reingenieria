package com.google.android.gms.internal.clearcut;

import java.lang.reflect.Type;

/* renamed from: com.google.android.gms.internal.clearcut.ba reason: case insensitive filesystem */
public enum C0740ba {
    DOUBLE(0, C0746da.SCALAR, C0779oa.DOUBLE),
    FLOAT(1, C0746da.SCALAR, C0779oa.FLOAT),
    INT64(2, C0746da.SCALAR, C0779oa.LONG),
    UINT64(3, C0746da.SCALAR, C0779oa.LONG),
    INT32(4, C0746da.SCALAR, C0779oa.INT),
    FIXED64(5, C0746da.SCALAR, C0779oa.LONG),
    FIXED32(6, C0746da.SCALAR, C0779oa.INT),
    BOOL(7, C0746da.SCALAR, C0779oa.BOOLEAN),
    STRING(8, C0746da.SCALAR, C0779oa.STRING),
    MESSAGE(9, C0746da.SCALAR, C0779oa.MESSAGE),
    BYTES(10, C0746da.SCALAR, C0779oa.BYTE_STRING),
    UINT32(11, C0746da.SCALAR, C0779oa.INT),
    ENUM(12, C0746da.SCALAR, C0779oa.ENUM),
    SFIXED32(13, C0746da.SCALAR, C0779oa.INT),
    SFIXED64(14, C0746da.SCALAR, C0779oa.LONG),
    SINT32(15, C0746da.SCALAR, C0779oa.INT),
    SINT64(16, C0746da.SCALAR, C0779oa.LONG),
    GROUP(17, C0746da.SCALAR, C0779oa.MESSAGE),
    DOUBLE_LIST(18, C0746da.VECTOR, C0779oa.DOUBLE),
    FLOAT_LIST(19, C0746da.VECTOR, C0779oa.FLOAT),
    INT64_LIST(20, C0746da.VECTOR, C0779oa.LONG),
    UINT64_LIST(21, C0746da.VECTOR, C0779oa.LONG),
    INT32_LIST(22, C0746da.VECTOR, C0779oa.INT),
    FIXED64_LIST(23, C0746da.VECTOR, C0779oa.LONG),
    FIXED32_LIST(24, C0746da.VECTOR, C0779oa.INT),
    BOOL_LIST(25, C0746da.VECTOR, C0779oa.BOOLEAN),
    STRING_LIST(26, C0746da.VECTOR, C0779oa.STRING),
    MESSAGE_LIST(27, C0746da.VECTOR, C0779oa.MESSAGE),
    BYTES_LIST(28, C0746da.VECTOR, C0779oa.BYTE_STRING),
    UINT32_LIST(29, C0746da.VECTOR, C0779oa.INT),
    ENUM_LIST(30, C0746da.VECTOR, C0779oa.ENUM),
    SFIXED32_LIST(31, C0746da.VECTOR, C0779oa.INT),
    SFIXED64_LIST(32, C0746da.VECTOR, C0779oa.LONG),
    SINT32_LIST(33, C0746da.VECTOR, C0779oa.INT),
    SINT64_LIST(34, C0746da.VECTOR, C0779oa.LONG),
    DOUBLE_LIST_PACKED(35, C0746da.PACKED_VECTOR, C0779oa.DOUBLE),
    FLOAT_LIST_PACKED(36, C0746da.PACKED_VECTOR, C0779oa.FLOAT),
    INT64_LIST_PACKED(37, C0746da.PACKED_VECTOR, C0779oa.LONG),
    UINT64_LIST_PACKED(38, C0746da.PACKED_VECTOR, C0779oa.LONG),
    INT32_LIST_PACKED(39, C0746da.PACKED_VECTOR, C0779oa.INT),
    FIXED64_LIST_PACKED(40, C0746da.PACKED_VECTOR, C0779oa.LONG),
    FIXED32_LIST_PACKED(41, C0746da.PACKED_VECTOR, C0779oa.INT),
    BOOL_LIST_PACKED(42, C0746da.PACKED_VECTOR, C0779oa.BOOLEAN),
    UINT32_LIST_PACKED(43, C0746da.PACKED_VECTOR, C0779oa.INT),
    ENUM_LIST_PACKED(44, C0746da.PACKED_VECTOR, C0779oa.ENUM),
    SFIXED32_LIST_PACKED(45, C0746da.PACKED_VECTOR, C0779oa.INT),
    SFIXED64_LIST_PACKED(46, C0746da.PACKED_VECTOR, C0779oa.LONG),
    SINT32_LIST_PACKED(47, C0746da.PACKED_VECTOR, C0779oa.INT),
    SINT64_LIST_PACKED(48, C0746da.PACKED_VECTOR, C0779oa.LONG),
    GROUP_LIST(49, C0746da.VECTOR, C0779oa.MESSAGE),
    MAP(50, C0746da.MAP, C0779oa.VOID);
    
    private static final C0740ba[] Z = null;
    private static final Type[] aa = null;
    private final C0779oa ca;
    private final int da;
    private final C0746da ea;
    private final Class<?> fa;
    private final boolean ga;

    static {
        int i;
        aa = new Type[0];
        C0740ba[] values = values();
        Z = new C0740ba[values.length];
        for (C0740ba baVar : values) {
            Z[baVar.da] = baVar;
        }
    }

    private C0740ba(int i, C0746da daVar, C0779oa oaVar) {
        this.da = i;
        this.ea = daVar;
        this.ca = oaVar;
        int i2 = C0743ca.a[daVar.ordinal()];
        this.fa = (i2 == 1 || i2 == 2) ? oaVar.a() : null;
        boolean z = false;
        if (daVar == C0746da.SCALAR) {
            int i3 = C0743ca.b[oaVar.ordinal()];
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
