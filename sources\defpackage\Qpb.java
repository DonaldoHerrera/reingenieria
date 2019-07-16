package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: Qpb reason: default package */
/* compiled from: ConstantValueFactory.kt */
public final class Qpb {
    public static final Qpb a = new Qpb();

    private Qpb() {
    }

    public final Ipb a(List<? extends Npb<?>> list, C7706xtb xtb) {
        C7471uYa.b(list, "value");
        C7471uYa.b(xtb, C1325gg.TYPE);
        return new Ipb(list, new Opb(xtb));
    }

    public final Npb<?> a(Object obj) {
        if (obj instanceof Byte) {
            return new Kpb(((Number) obj).byteValue());
        }
        if (obj instanceof Short) {
            return new C5597aqb(((Number) obj).shortValue());
        }
        if (obj instanceof Integer) {
            return new Vpb(((Number) obj).intValue());
        }
        if (obj instanceof Long) {
            return new Zpb(((Number) obj).longValue());
        }
        if (obj instanceof Character) {
            return new Lpb(((Character) obj).charValue());
        }
        if (obj instanceof Float) {
            return new Upb(((Number) obj).floatValue());
        }
        if (obj instanceof Double) {
            return new Rpb(((Number) obj).doubleValue());
        }
        if (obj instanceof Boolean) {
            return new Jpb(((Boolean) obj).booleanValue());
        }
        if (obj instanceof String) {
            return new C5665bqb((String) obj);
        }
        if (obj instanceof byte[]) {
            return a(C6578hWa.a((byte[]) obj), C5331Tbb.BYTE);
        }
        if (obj instanceof short[]) {
            return a(C6578hWa.a((short[]) obj), C5331Tbb.SHORT);
        }
        if (obj instanceof int[]) {
            return a(C6578hWa.d((int[]) obj), C5331Tbb.INT);
        }
        if (obj instanceof long[]) {
            return a(C6578hWa.a((long[]) obj), C5331Tbb.LONG);
        }
        if (obj instanceof char[]) {
            return a(C6578hWa.b((char[]) obj), C5331Tbb.CHAR);
        }
        if (obj instanceof float[]) {
            return a(C6578hWa.a((float[]) obj), C5331Tbb.FLOAT);
        }
        if (obj instanceof double[]) {
            return a(C6578hWa.a((double[]) obj), C5331Tbb.DOUBLE);
        }
        if (obj instanceof boolean[]) {
            return a(C6578hWa.a((boolean[]) obj), C5331Tbb.BOOLEAN);
        }
        if (obj == null) {
            return new _pb();
        }
        return null;
    }

    private final Ipb a(List<?> list, C5331Tbb tbb) {
        List<Object> q = C7676xWa.q(list);
        ArrayList arrayList = new ArrayList();
        for (Object a2 : q) {
            Npb a3 = a(a2);
            if (a3 != null) {
                arrayList.add(a3);
            }
        }
        return new Ipb(arrayList, new Ppb(tbb));
    }
}
