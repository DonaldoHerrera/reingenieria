package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.C1072yb;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

/* renamed from: com.google.android.gms.internal.measurement.wb reason: case insensitive filesystem */
final class C1060wb<FieldDescriptorType extends C1072yb<FieldDescriptorType>> {
    private static final C1060wb a = new C1060wb(true);
    final Kc<FieldDescriptorType, Object> b = Kc.a(16);
    private boolean c;
    private boolean d = false;

    private C1060wb() {
    }

    public static <T extends C1072yb<T>> C1060wb<T> f() {
        return a;
    }

    /* access modifiers changed from: 0000 */
    public final Iterator<Entry<FieldDescriptorType, Object>> a() {
        if (this.d) {
            return new Xb(this.b.e().iterator());
        }
        return this.b.e().iterator();
    }

    public final boolean b() {
        return this.c;
    }

    public final boolean c() {
        for (int i = 0; i < this.b.c(); i++) {
            if (!a(this.b.b(i))) {
                return false;
            }
        }
        for (Entry a2 : this.b.d()) {
            if (!a(a2)) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        C1060wb wbVar = new C1060wb();
        for (int i = 0; i < this.b.c(); i++) {
            Entry b2 = this.b.b(i);
            wbVar.b((FieldDescriptorType) (C1072yb) b2.getKey(), b2.getValue());
        }
        for (Entry entry : this.b.d()) {
            wbVar.b((FieldDescriptorType) (C1072yb) entry.getKey(), entry.getValue());
        }
        wbVar.d = this.d;
        return wbVar;
    }

    public final Iterator<Entry<FieldDescriptorType, Object>> d() {
        if (this.d) {
            return new Xb(this.b.entrySet().iterator());
        }
        return this.b.entrySet().iterator();
    }

    public final void e() {
        if (!this.c) {
            this.b.b();
            this.c = true;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1060wb)) {
            return false;
        }
        return this.b.equals(((C1060wb) obj).b);
    }

    public final int g() {
        int i = 0;
        for (int i2 = 0; i2 < this.b.c(); i2++) {
            i += c(this.b.b(i2));
        }
        for (Entry c2 : this.b.d()) {
            i += c(c2);
        }
        return i;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    private final void b(FieldDescriptorType fielddescriptortype, Object obj) {
        if (!fielddescriptortype.A()) {
            a(fielddescriptortype.G(), obj);
            r6 = obj;
        } else if (obj instanceof List) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj2 = arrayList.get(i);
                i++;
                a(fielddescriptortype.G(), obj2);
            }
            r6 = arrayList;
        } else {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        if (r6 instanceof Sb) {
            this.d = true;
        }
        this.b.put(fielddescriptortype, r6);
    }

    private C1060wb(boolean z) {
        e();
    }

    private final Object a(FieldDescriptorType fielddescriptortype) {
        Object obj = this.b.get(fielddescriptortype);
        if (!(obj instanceof Sb)) {
            return obj;
        }
        Sb.c();
        throw null;
    }

    private static int c(Entry<FieldDescriptorType, Object> entry) {
        C1072yb ybVar = (C1072yb) entry.getKey();
        Object value = entry.getValue();
        if (ybVar.E() != C1032rd.MESSAGE || ybVar.A() || ybVar.I()) {
            return a(ybVar, value);
        }
        if (value instanceof Sb) {
            return C1007nb.b(((C1072yb) entry.getKey()).l(), (Wb) (Sb) value);
        }
        return C1007nb.d(((C1072yb) entry.getKey()).l(), (C1026qc) value);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0026, code lost:
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002e, code lost:
        if ((r3 instanceof byte[]) == false) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001b, code lost:
        if ((r3 instanceof com.google.android.gms.internal.measurement.Sb) == false) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0024, code lost:
        if ((r3 instanceof com.google.android.gms.internal.measurement.Lb) == false) goto L_0x0043;
     */
    private static void a(C1015od odVar, Object obj) {
        boolean z;
        Hb.a(obj);
        boolean z2 = false;
        switch (C1078zb.a[odVar.a().ordinal()]) {
            case 1:
                z = obj instanceof Integer;
                break;
            case 2:
                z = obj instanceof Long;
                break;
            case 3:
                z = obj instanceof Float;
                break;
            case 4:
                z = obj instanceof Double;
                break;
            case 5:
                z = obj instanceof Boolean;
                break;
            case 6:
                z = obj instanceof String;
                break;
            case 7:
                if (!(obj instanceof Ya)) {
                    break;
                }
            case 8:
                if (!(obj instanceof Integer)) {
                    break;
                }
            case 9:
                if (!(obj instanceof C1026qc)) {
                    break;
                }
        }
        z2 = z;
        if (!z2) {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
    }

    private final void b(Entry<FieldDescriptorType, Object> entry) {
        Object obj;
        C1072yb ybVar = (C1072yb) entry.getKey();
        Object value = entry.getValue();
        if (value instanceof Sb) {
            Sb.c();
            throw null;
        } else if (ybVar.A()) {
            Object a2 = a((FieldDescriptorType) ybVar);
            if (a2 == null) {
                a2 = new ArrayList();
            }
            for (Object a3 : (List) value) {
                ((List) a2).add(a(a3));
            }
            this.b.put(ybVar, a2);
        } else if (ybVar.E() == C1032rd.MESSAGE) {
            Object a4 = a((FieldDescriptorType) ybVar);
            if (a4 == null) {
                this.b.put(ybVar, a(value));
                return;
            }
            if (a4 instanceof C1049uc) {
                obj = ybVar.a((C1049uc) a4, (C1049uc) value);
            } else {
                obj = ybVar.a(((C1026qc) a4).f(), (C1026qc) value).w();
            }
            this.b.put(ybVar, obj);
        } else {
            this.b.put(ybVar, a(value));
        }
    }

    private static boolean a(Entry<FieldDescriptorType, Object> entry) {
        C1072yb ybVar = (C1072yb) entry.getKey();
        if (ybVar.E() == C1032rd.MESSAGE) {
            if (ybVar.A()) {
                for (C1026qc i : (List) entry.getValue()) {
                    if (!i.i()) {
                        return false;
                    }
                }
            } else {
                Object value = entry.getValue();
                if (value instanceof C1026qc) {
                    if (!((C1026qc) value).i()) {
                        return false;
                    }
                } else if (value instanceof Sb) {
                    return true;
                } else {
                    throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
            }
        }
        return true;
    }

    public final void a(C1060wb<FieldDescriptorType> wbVar) {
        for (int i = 0; i < wbVar.b.c(); i++) {
            b(wbVar.b.b(i));
        }
        for (Entry b2 : wbVar.b.d()) {
            b(b2);
        }
    }

    private static Object a(Object obj) {
        if (obj instanceof C1049uc) {
            return ((C1049uc) obj).c();
        }
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    private static int b(C1015od odVar, Object obj) {
        switch (C1078zb.b[odVar.ordinal()]) {
            case 1:
                return C1007nb.b(((Double) obj).doubleValue());
            case 2:
                return C1007nb.b(((Float) obj).floatValue());
            case 3:
                return C1007nb.d(((Long) obj).longValue());
            case 4:
                return C1007nb.e(((Long) obj).longValue());
            case 5:
                return C1007nb.f(((Integer) obj).intValue());
            case 6:
                return C1007nb.g(((Long) obj).longValue());
            case 7:
                return C1007nb.i(((Integer) obj).intValue());
            case 8:
                return C1007nb.b(((Boolean) obj).booleanValue());
            case 9:
                return C1007nb.b((C1026qc) obj);
            case 10:
                if (obj instanceof Sb) {
                    return C1007nb.a((Wb) (Sb) obj);
                }
                return C1007nb.a((C1026qc) obj);
            case 11:
                if (obj instanceof Ya) {
                    return C1007nb.a((Ya) obj);
                }
                return C1007nb.a((String) obj);
            case 12:
                if (obj instanceof Ya) {
                    return C1007nb.a((Ya) obj);
                }
                return C1007nb.b((byte[]) obj);
            case 13:
                return C1007nb.g(((Integer) obj).intValue());
            case 14:
                return C1007nb.j(((Integer) obj).intValue());
            case 15:
                return C1007nb.h(((Long) obj).longValue());
            case 16:
                return C1007nb.h(((Integer) obj).intValue());
            case 17:
                return C1007nb.f(((Long) obj).longValue());
            case 18:
                if (obj instanceof Lb) {
                    return C1007nb.k(((Lb) obj).l());
                }
                return C1007nb.k(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    static int a(C1015od odVar, int i, Object obj) {
        int e = C1007nb.e(i);
        if (odVar == C1015od.GROUP) {
            Hb.a((C1026qc) obj);
            e <<= 1;
        }
        return e + b(odVar, obj);
    }

    public static int a(C1072yb<?> ybVar, Object obj) {
        C1015od G = ybVar.G();
        int l = ybVar.l();
        if (!ybVar.A()) {
            return a(G, l, obj);
        }
        int i = 0;
        if (ybVar.I()) {
            for (Object b2 : (List) obj) {
                i += b(G, b2);
            }
            return C1007nb.e(l) + i + C1007nb.l(i);
        }
        for (Object a2 : (List) obj) {
            i += a(G, l, a2);
        }
        return i;
    }
}
