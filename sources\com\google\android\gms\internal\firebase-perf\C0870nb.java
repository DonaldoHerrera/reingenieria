package com.google.android.gms.internal.firebase-perf;

import com.google.android.gms.internal.firebase-perf.C0878pb;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

/* renamed from: com.google.android.gms.internal.firebase-perf.nb reason: case insensitive filesystem */
final class C0870nb<FieldDescriptorType extends C0878pb<FieldDescriptorType>> {
    private static final C0870nb a = new C0870nb(true);
    final C0906wc<FieldDescriptorType, Object> b = C0906wc.a(16);
    private boolean c;
    private boolean d = false;

    private C0870nb() {
    }

    public static <T extends C0878pb<T>> C0870nb<T> f() {
        return a;
    }

    /* access modifiers changed from: 0000 */
    public final Iterator<Entry<FieldDescriptorType, Object>> a() {
        if (this.d) {
            return new Kb(this.b.e().iterator());
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
        C0870nb nbVar = new C0870nb();
        for (int i = 0; i < this.b.c(); i++) {
            Entry b2 = this.b.b(i);
            nbVar.b((FieldDescriptorType) (C0878pb) b2.getKey(), b2.getValue());
        }
        for (Entry entry : this.b.d()) {
            nbVar.b((FieldDescriptorType) (C0878pb) entry.getKey(), entry.getValue());
        }
        nbVar.d = this.d;
        return nbVar;
    }

    public final Iterator<Entry<FieldDescriptorType, Object>> d() {
        if (this.d) {
            return new Kb(this.b.entrySet().iterator());
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
        if (!(obj instanceof C0870nb)) {
            return false;
        }
        return this.b.equals(((C0870nb) obj).b);
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
        if (!fielddescriptortype.z()) {
            a(fielddescriptortype.h(), obj);
            r6 = obj;
        } else if (obj instanceof List) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj2 = arrayList.get(i);
                i++;
                a(fielddescriptortype.h(), obj2);
            }
            r6 = arrayList;
        } else {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        if (r6 instanceof Fb) {
            this.d = true;
        }
        this.b.put(fielddescriptortype, r6);
    }

    private C0870nb(boolean z) {
        e();
    }

    private final Object a(FieldDescriptorType fielddescriptortype) {
        Object obj = this.b.get(fielddescriptortype);
        if (!(obj instanceof Fb)) {
            return obj;
        }
        Fb.c();
        throw null;
    }

    private static int c(Entry<FieldDescriptorType, Object> entry) {
        C0878pb pbVar = (C0878pb) entry.getKey();
        Object value = entry.getValue();
        if (pbVar.C() != fd.MESSAGE || pbVar.z() || pbVar.D()) {
            return a(pbVar, value);
        }
        if (value instanceof Fb) {
            return C0838fb.b(((C0878pb) entry.getKey()).k(), (Jb) (Fb) value);
        }
        return C0838fb.b(((C0878pb) entry.getKey()).k(), (C0835ec) value);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0026, code lost:
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002e, code lost:
        if ((r3 instanceof byte[]) == false) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001b, code lost:
        if ((r3 instanceof com.google.android.gms.internal.firebase-perf.Fb) == false) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0024, code lost:
        if ((r3 instanceof com.google.android.gms.internal.firebase-perf.C0909xb) == false) goto L_0x0043;
     */
    private static void a(Yc yc, Object obj) {
        boolean z;
        C0897ub.a(obj);
        boolean z2 = false;
        switch (C0866mb.a[yc.a().ordinal()]) {
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
                if (!(obj instanceof Oa)) {
                    break;
                }
            case 8:
                if (!(obj instanceof Integer)) {
                    break;
                }
            case 9:
                if (!(obj instanceof C0835ec)) {
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
        C0878pb pbVar = (C0878pb) entry.getKey();
        Object value = entry.getValue();
        if (value instanceof Fb) {
            Fb.c();
            throw null;
        } else if (pbVar.z()) {
            Object a2 = a((FieldDescriptorType) pbVar);
            if (a2 == null) {
                a2 = new ArrayList();
            }
            for (Object a3 : (List) value) {
                ((List) a2).add(a(a3));
            }
            this.b.put(pbVar, a2);
        } else if (pbVar.C() == fd.MESSAGE) {
            Object a4 = a((FieldDescriptorType) pbVar);
            if (a4 == null) {
                this.b.put(pbVar, a(value));
                return;
            }
            if (a4 instanceof C0859kc) {
                obj = pbVar.a((C0859kc) a4, (C0859kc) value);
            } else {
                obj = pbVar.a(((C0835ec) a4).f(), (C0835ec) value).b();
            }
            this.b.put(pbVar, obj);
        } else {
            this.b.put(pbVar, a(value));
        }
    }

    private static boolean a(Entry<FieldDescriptorType, Object> entry) {
        C0878pb pbVar = (C0878pb) entry.getKey();
        if (pbVar.C() == fd.MESSAGE) {
            if (pbVar.z()) {
                for (C0835ec i : (List) entry.getValue()) {
                    if (!i.i()) {
                        return false;
                    }
                }
            } else {
                Object value = entry.getValue();
                if (value instanceof C0835ec) {
                    if (!((C0835ec) value).i()) {
                        return false;
                    }
                } else if (value instanceof Fb) {
                    return true;
                } else {
                    throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
            }
        }
        return true;
    }

    public final void a(C0870nb<FieldDescriptorType> nbVar) {
        for (int i = 0; i < nbVar.b.c(); i++) {
            b(nbVar.b.b(i));
        }
        for (Entry b2 : nbVar.b.d()) {
            b(b2);
        }
    }

    private static Object a(Object obj) {
        if (obj instanceof C0859kc) {
            return ((C0859kc) obj).d();
        }
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    private static int b(Yc yc, Object obj) {
        switch (C0866mb.b[yc.ordinal()]) {
            case 1:
                return C0838fb.b(((Double) obj).doubleValue());
            case 2:
                return C0838fb.b(((Float) obj).floatValue());
            case 3:
                return C0838fb.d(((Long) obj).longValue());
            case 4:
                return C0838fb.e(((Long) obj).longValue());
            case 5:
                return C0838fb.m(((Integer) obj).intValue());
            case 6:
                return C0838fb.g(((Long) obj).longValue());
            case 7:
                return C0838fb.c(((Integer) obj).intValue());
            case 8:
                return C0838fb.b(((Boolean) obj).booleanValue());
            case 9:
                return C0838fb.c((C0835ec) obj);
            case 10:
                if (obj instanceof Fb) {
                    return C0838fb.a((Jb) (Fb) obj);
                }
                return C0838fb.b((C0835ec) obj);
            case 11:
                if (obj instanceof Oa) {
                    return C0838fb.b((Oa) obj);
                }
                return C0838fb.b((String) obj);
            case 12:
                if (obj instanceof Oa) {
                    return C0838fb.b((Oa) obj);
                }
                return C0838fb.b((byte[]) obj);
            case 13:
                return C0838fb.a(((Integer) obj).intValue());
            case 14:
                return C0838fb.d(((Integer) obj).intValue());
            case 15:
                return C0838fb.h(((Long) obj).longValue());
            case 16:
                return C0838fb.b(((Integer) obj).intValue());
            case 17:
                return C0838fb.f(((Long) obj).longValue());
            case 18:
                if (obj instanceof C0909xb) {
                    return C0838fb.e(((C0909xb) obj).k());
                }
                return C0838fb.e(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    static void a(C0838fb fbVar, Yc yc, int i, Object obj) throws IOException {
        if (yc == Yc.GROUP) {
            C0835ec ecVar = (C0835ec) obj;
            C0897ub.a(ecVar);
            fbVar.a(i, 3);
            ecVar.a(fbVar);
            fbVar.a(i, 4);
            return;
        }
        fbVar.a(i, yc.b());
        switch (C0866mb.b[yc.ordinal()]) {
            case 1:
                fbVar.a(((Double) obj).doubleValue());
                break;
            case 2:
                fbVar.a(((Float) obj).floatValue());
                return;
            case 3:
                fbVar.a(((Long) obj).longValue());
                return;
            case 4:
                fbVar.a(((Long) obj).longValue());
                return;
            case 5:
                fbVar.h(((Integer) obj).intValue());
                return;
            case 6:
                fbVar.c(((Long) obj).longValue());
                return;
            case 7:
                fbVar.k(((Integer) obj).intValue());
                return;
            case 8:
                fbVar.a(((Boolean) obj).booleanValue());
                return;
            case 9:
                ((C0835ec) obj).a(fbVar);
                return;
            case 10:
                fbVar.a((C0835ec) obj);
                return;
            case 11:
                if (obj instanceof Oa) {
                    fbVar.a((Oa) obj);
                    return;
                } else {
                    fbVar.a((String) obj);
                    return;
                }
            case 12:
                if (obj instanceof Oa) {
                    fbVar.a((Oa) obj);
                    return;
                }
                byte[] bArr = (byte[]) obj;
                fbVar.b(bArr, 0, bArr.length);
                return;
            case 13:
                fbVar.i(((Integer) obj).intValue());
                return;
            case 14:
                fbVar.k(((Integer) obj).intValue());
                return;
            case 15:
                fbVar.c(((Long) obj).longValue());
                return;
            case 16:
                fbVar.j(((Integer) obj).intValue());
                return;
            case 17:
                fbVar.b(((Long) obj).longValue());
                return;
            case 18:
                if (!(obj instanceof C0909xb)) {
                    fbVar.h(((Integer) obj).intValue());
                    break;
                } else {
                    fbVar.h(((C0909xb) obj).k());
                    return;
                }
        }
    }

    static int a(Yc yc, int i, Object obj) {
        int l = C0838fb.l(i);
        if (yc == Yc.GROUP) {
            C0897ub.a((C0835ec) obj);
            l <<= 1;
        }
        return l + b(yc, obj);
    }

    public static int a(C0878pb<?> pbVar, Object obj) {
        Yc h = pbVar.h();
        int k = pbVar.k();
        if (!pbVar.z()) {
            return a(h, k, obj);
        }
        int i = 0;
        if (pbVar.D()) {
            for (Object b2 : (List) obj) {
                i += b(h, b2);
            }
            return C0838fb.l(k) + i + C0838fb.g(i);
        }
        for (Object a2 : (List) obj) {
            i += a(h, k, a2);
        }
        return i;
    }
}
