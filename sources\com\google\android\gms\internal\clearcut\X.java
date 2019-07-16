package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.C0737aa;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

final class X<FieldDescriptorType extends C0737aa<FieldDescriptorType>> {
    private static final X a = new X(true);
    private final C0750eb<FieldDescriptorType, Object> b = C0750eb.a(16);
    private boolean c;
    private boolean d = false;

    private X() {
    }

    private X(boolean z) {
        i();
    }

    static int a(Ib ib, int i, Object obj) {
        int e = M.e(i);
        if (ib == Ib.GROUP) {
            C0761ia.a((La) obj);
            e <<= 1;
        }
        return e + b(ib, obj);
    }

    private final Object a(FieldDescriptorType fielddescriptortype) {
        Object obj = this.b.get(fielddescriptortype);
        if (!(obj instanceof C0782pa)) {
            return obj;
        }
        C0782pa.c();
        throw null;
    }

    private static Object a(Object obj) {
        if (obj instanceof Ra) {
            return ((Ra) obj).f();
        }
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0026, code lost:
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002e, code lost:
        if ((r3 instanceof byte[]) == false) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001b, code lost:
        if ((r3 instanceof com.google.android.gms.internal.clearcut.C0782pa) == false) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0024, code lost:
        if ((r3 instanceof com.google.android.gms.internal.clearcut.C0764ja) == false) goto L_0x0043;
     */
    private static void a(Ib ib, Object obj) {
        boolean z;
        C0761ia.a(obj);
        boolean z2 = false;
        switch (Y.a[ib.a().ordinal()]) {
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
                if (!(obj instanceof A)) {
                    break;
                }
            case 8:
                if (!(obj instanceof Integer)) {
                    break;
                }
            case 9:
                if (!(obj instanceof La)) {
                    break;
                }
        }
        z2 = z;
        if (!z2) {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
    }

    private final void a(FieldDescriptorType fielddescriptortype, Object obj) {
        if (!fielddescriptortype.o()) {
            a(fielddescriptortype.r(), obj);
            r6 = obj;
        } else if (obj instanceof List) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj2 = arrayList.get(i);
                i++;
                a(fielddescriptortype.r(), obj2);
            }
            r6 = arrayList;
        } else {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        if (r6 instanceof C0782pa) {
            this.d = true;
        }
        this.b.put(fielddescriptortype, r6);
    }

    private static boolean a(Entry<FieldDescriptorType, Object> entry) {
        C0737aa aaVar = (C0737aa) entry.getKey();
        if (aaVar.n() == Nb.MESSAGE) {
            if (aaVar.o()) {
                for (La i : (List) entry.getValue()) {
                    if (!i.i()) {
                        return false;
                    }
                }
            } else {
                Object value = entry.getValue();
                if (value instanceof La) {
                    if (!((La) value).i()) {
                        return false;
                    }
                } else if (value instanceof C0782pa) {
                    return true;
                } else {
                    throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
            }
        }
        return true;
    }

    private static int b(Ib ib, Object obj) {
        switch (Y.b[ib.ordinal()]) {
            case 1:
                return M.b(((Double) obj).doubleValue());
            case 2:
                return M.b(((Float) obj).floatValue());
            case 3:
                return M.d(((Long) obj).longValue());
            case 4:
                return M.e(((Long) obj).longValue());
            case 5:
                return M.f(((Integer) obj).intValue());
            case 6:
                return M.g(((Long) obj).longValue());
            case 7:
                return M.i(((Integer) obj).intValue());
            case 8:
                return M.b(((Boolean) obj).booleanValue());
            case 9:
                return M.b((La) obj);
            case 10:
                return obj instanceof C0782pa ? M.a((C0793ta) (C0782pa) obj) : M.a((La) obj);
            case 11:
                return obj instanceof A ? M.a((A) obj) : M.a((String) obj);
            case 12:
                return obj instanceof A ? M.a((A) obj) : M.b((byte[]) obj);
            case 13:
                return M.g(((Integer) obj).intValue());
            case 14:
                return M.j(((Integer) obj).intValue());
            case 15:
                return M.h(((Long) obj).longValue());
            case 16:
                return M.h(((Integer) obj).intValue());
            case 17:
                return M.f(((Long) obj).longValue());
            case 18:
                return obj instanceof C0764ja ? M.k(((C0764ja) obj).zzc()) : M.k(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    private static int b(C0737aa<?> aaVar, Object obj) {
        Ib r = aaVar.r();
        int zzc = aaVar.zzc();
        if (!aaVar.o()) {
            return a(r, zzc, obj);
        }
        int i = 0;
        if (aaVar.m()) {
            for (Object b2 : (List) obj) {
                i += b(r, b2);
            }
            return M.e(zzc) + i + M.l(i);
        }
        for (Object a2 : (List) obj) {
            i += a(r, zzc, a2);
        }
        return i;
    }

    private final void b(Entry<FieldDescriptorType, Object> entry) {
        C0737aa aaVar = (C0737aa) entry.getKey();
        Object value = entry.getValue();
        if (value instanceof C0782pa) {
            C0782pa.c();
            throw null;
        } else if (aaVar.o()) {
            Object a2 = a((FieldDescriptorType) aaVar);
            if (a2 == null) {
                a2 = new ArrayList();
            }
            for (Object a3 : (List) value) {
                ((List) a2).add(a(a3));
            }
            this.b.put(aaVar, a2);
        } else if (aaVar.n() == Nb.MESSAGE) {
            Object a4 = a((FieldDescriptorType) aaVar);
            if (a4 == null) {
                this.b.put(aaVar, a(value));
            } else if (!(a4 instanceof Ra)) {
                this.b.put(aaVar, aaVar.a(((La) a4).a(), (La) value).g());
            } else {
                aaVar.a((Ra) a4, (Ra) value);
                throw null;
            }
        } else {
            this.b.put(aaVar, a(value));
        }
    }

    private static int c(Entry<FieldDescriptorType, Object> entry) {
        C0737aa aaVar = (C0737aa) entry.getKey();
        Object value = entry.getValue();
        return (aaVar.n() != Nb.MESSAGE || aaVar.o() || aaVar.m()) ? b(aaVar, value) : value instanceof C0782pa ? M.b(((C0737aa) entry.getKey()).zzc(), (C0793ta) (C0782pa) value) : M.d(((C0737aa) entry.getKey()).zzc(), (La) value);
    }

    public static <T extends C0737aa<T>> X<T> f() {
        return a;
    }

    /* access modifiers changed from: 0000 */
    public final Iterator<Entry<FieldDescriptorType, Object>> a() {
        return this.d ? new C0790sa(this.b.d().iterator()) : this.b.d().iterator();
    }

    public final void a(X<FieldDescriptorType> x) {
        for (int i = 0; i < x.b.b(); i++) {
            b(x.b.b(i));
        }
        for (Entry b2 : x.b.c()) {
            b(b2);
        }
    }

    /* access modifiers changed from: 0000 */
    public final boolean b() {
        return this.b.isEmpty();
    }

    public final boolean c() {
        return this.c;
    }

    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        X x = new X();
        for (int i = 0; i < this.b.b(); i++) {
            Entry b2 = this.b.b(i);
            x.a((FieldDescriptorType) (C0737aa) b2.getKey(), b2.getValue());
        }
        for (Entry entry : this.b.c()) {
            x.a((FieldDescriptorType) (C0737aa) entry.getKey(), entry.getValue());
        }
        x.d = this.d;
        return x;
    }

    public final boolean d() {
        for (int i = 0; i < this.b.b(); i++) {
            if (!a(this.b.b(i))) {
                return false;
            }
        }
        for (Entry a2 : this.b.c()) {
            if (!a(a2)) {
                return false;
            }
        }
        return true;
    }

    public final Iterator<Entry<FieldDescriptorType, Object>> e() {
        return this.d ? new C0790sa(this.b.entrySet().iterator()) : this.b.entrySet().iterator();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof X)) {
            return false;
        }
        return this.b.equals(((X) obj).b);
    }

    public final int g() {
        int i = 0;
        for (int i2 = 0; i2 < this.b.b(); i2++) {
            Entry b2 = this.b.b(i2);
            i += b((C0737aa) b2.getKey(), b2.getValue());
        }
        for (Entry entry : this.b.c()) {
            i += b((C0737aa) entry.getKey(), entry.getValue());
        }
        return i;
    }

    public final int h() {
        int i = 0;
        for (int i2 = 0; i2 < this.b.b(); i2++) {
            i += c(this.b.b(i2));
        }
        for (Entry c2 : this.b.c()) {
            i += c(c2);
        }
        return i;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final void i() {
        if (!this.c) {
            this.b.e();
            this.c = true;
        }
    }
}
