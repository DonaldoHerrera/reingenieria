package defpackage;

import defpackage.C1918zw;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

/* renamed from: xw reason: default package and case insensitive filesystem */
final class C1858xw<FieldDescriptorType extends C1918zw<FieldDescriptorType>> {
    private static final C1858xw a = new C1858xw(true);
    final Cx<FieldDescriptorType, Object> b = Cx.a(16);
    private boolean c;
    private boolean d = false;

    private C1858xw() {
    }

    public static <T extends C1918zw<T>> C1858xw<T> e() {
        return a;
    }

    public final boolean a() {
        return this.c;
    }

    public final boolean b() {
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

    public final Iterator<Entry<FieldDescriptorType, Object>> c() {
        if (this.d) {
            return new C0245Pw(this.b.entrySet().iterator());
        }
        return this.b.entrySet().iterator();
    }

    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        C1858xw xwVar = new C1858xw();
        for (int i = 0; i < this.b.c(); i++) {
            Entry b2 = this.b.b(i);
            xwVar.a((FieldDescriptorType) (C1918zw) b2.getKey(), b2.getValue());
        }
        for (Entry entry : this.b.d()) {
            xwVar.a((FieldDescriptorType) (C1918zw) entry.getKey(), entry.getValue());
        }
        xwVar.d = this.d;
        return xwVar;
    }

    public final void d() {
        if (!this.c) {
            this.b.b();
            this.c = true;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1858xw)) {
            return false;
        }
        return this.b.equals(((C1858xw) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    private final Object a(FieldDescriptorType fielddescriptortype) {
        Object obj = this.b.get(fielddescriptortype);
        if (!(obj instanceof C0229Lw)) {
            return obj;
        }
        C0229Lw.a();
        throw null;
    }

    private C1858xw(boolean z) {
        d();
    }

    private final void a(FieldDescriptorType fielddescriptortype, Object obj) {
        if (!fielddescriptortype.B()) {
            a(fielddescriptortype.F(), obj);
            r6 = obj;
        } else if (obj instanceof List) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj2 = arrayList.get(i);
                i++;
                a(fielddescriptortype.F(), obj2);
            }
            r6 = arrayList;
        } else {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        if (r6 instanceof C0229Lw) {
            this.d = true;
        }
        this.b.put(fielddescriptortype, r6);
    }

    private final void b(Entry<FieldDescriptorType, Object> entry) {
        Object obj;
        C1918zw zwVar = (C1918zw) entry.getKey();
        Object value = entry.getValue();
        if (value instanceof C0229Lw) {
            C0229Lw.a();
            throw null;
        } else if (zwVar.B()) {
            Object a2 = a((FieldDescriptorType) zwVar);
            if (a2 == null) {
                a2 = new ArrayList();
            }
            for (Object a3 : (List) value) {
                ((List) a2).add(a(a3));
            }
            this.b.put(zwVar, a2);
        } else if (zwVar.H() == C1343gy.MESSAGE) {
            Object a4 = a((FieldDescriptorType) zwVar);
            if (a4 == null) {
                this.b.put(zwVar, a(value));
                return;
            }
            if (a4 instanceof C1527mx) {
                obj = zwVar.a((C1527mx) a4, (C1527mx) value);
            } else {
                obj = zwVar.a(((C1403ix) a4).c(), (C1403ix) value).h();
            }
            this.b.put(zwVar, obj);
        } else {
            this.b.put(zwVar, a(value));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0026, code lost:
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002e, code lost:
        if ((r3 instanceof byte[]) == false) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001b, code lost:
        if ((r3 instanceof defpackage.C0229Lw) == false) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0024, code lost:
        if ((r3 instanceof defpackage.C0206Fw) == false) goto L_0x0043;
     */
    private static void a(C1250dy dyVar, Object obj) {
        boolean z;
        C0209Gw.a(obj);
        boolean z2 = false;
        switch (C0191Aw.a[dyVar.a().ordinal()]) {
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
                if (!(obj instanceof C0289Zv)) {
                    break;
                }
            case 8:
                if (!(obj instanceof Integer)) {
                    break;
                }
            case 9:
                if (!(obj instanceof C1403ix)) {
                    break;
                }
        }
        z2 = z;
        if (!z2) {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
    }

    private static boolean a(Entry<FieldDescriptorType, Object> entry) {
        C1918zw zwVar = (C1918zw) entry.getKey();
        if (zwVar.H() == C1343gy.MESSAGE) {
            if (zwVar.B()) {
                for (C1403ix i : (List) entry.getValue()) {
                    if (!i.i()) {
                        return false;
                    }
                }
            } else {
                Object value = entry.getValue();
                if (value instanceof C1403ix) {
                    if (!((C1403ix) value).i()) {
                        return false;
                    }
                } else if (value instanceof C0229Lw) {
                    return true;
                } else {
                    throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
            }
        }
        return true;
    }

    public final void a(C1858xw<FieldDescriptorType> xwVar) {
        for (int i = 0; i < xwVar.b.c(); i++) {
            b(xwVar.b.b(i));
        }
        for (Entry b2 : xwVar.b.d()) {
            b(b2);
        }
    }

    private static Object a(Object obj) {
        if (obj instanceof C1527mx) {
            return ((C1527mx) obj).e();
        }
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }
}
