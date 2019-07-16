package defpackage;

import defpackage.Knb.a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

/* renamed from: Knb reason: default package */
/* compiled from: FieldSet */
final class Knb<FieldDescriptorType extends a<FieldDescriptorType>> {
    private static final Knb a = new Knb(true);
    private final C6393eob<FieldDescriptorType, Object> b = C6393eob.b(16);
    private boolean c;
    private boolean d = false;

    /* renamed from: Knb$a */
    /* compiled from: FieldSet */
    public interface a<T extends a<T>> extends Comparable<T> {
        defpackage.Wnb.a a(defpackage.Wnb.a aVar, Wnb wnb);

        int i();

        boolean p();

        defpackage.C7144pob.a q();

        b s();

        boolean t();
    }

    private Knb() {
    }

    public static <T extends a<T>> Knb<T> a() {
        return a;
    }

    public static <T extends a<T>> Knb<T> f() {
        return new Knb<>();
    }

    public int b(FieldDescriptorType fielddescriptortype) {
        if (fielddescriptortype.p()) {
            Object a2 = a(fielddescriptortype);
            if (a2 == null) {
                return 0;
            }
            return ((List) a2).size();
        }
        throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
    }

    public boolean c(FieldDescriptorType fielddescriptortype) {
        if (!fielddescriptortype.p()) {
            return this.b.get(fielddescriptortype) != null;
        }
        throw new IllegalArgumentException("hasField() can only be called on non-repeated fields.");
    }

    public Iterator<Entry<FieldDescriptorType, Object>> d() {
        if (this.d) {
            return new b(this.b.entrySet().iterator());
        }
        return this.b.entrySet().iterator();
    }

    public void e() {
        if (!this.c) {
            this.b.d();
            this.c = true;
        }
    }

    public Object a(FieldDescriptorType fielddescriptortype) {
        Object obj = this.b.get(fielddescriptortype);
        return obj instanceof Qnb ? ((Qnb) obj).b() : obj;
    }

    public Knb<FieldDescriptorType> clone() {
        Knb<FieldDescriptorType> f = f();
        for (int i = 0; i < this.b.a(); i++) {
            Entry a2 = this.b.a(i);
            f.c((a) a2.getKey(), a2.getValue());
        }
        for (Entry entry : this.b.b()) {
            f.c((a) entry.getKey(), entry.getValue());
        }
        f.d = this.d;
        return f;
    }

    private Knb(boolean z) {
        e();
    }

    public void c(FieldDescriptorType fielddescriptortype, Object obj) {
        if (!fielddescriptortype.p()) {
            b(fielddescriptortype.q(), obj);
            r5 = obj;
        } else if (obj instanceof List) {
            List<Object> arrayList = new ArrayList<>();
            arrayList.addAll((List) obj);
            for (Object b2 : arrayList) {
                b(fielddescriptortype.q(), b2);
            }
            r5 = arrayList;
        } else {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        if (r5 instanceof Qnb) {
            this.d = true;
        }
        this.b.a(fielddescriptortype, r5);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0024, code lost:
        if ((r3 instanceof defpackage.Nnb.a) == false) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002d, code lost:
        if ((r3 instanceof byte[]) == false) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if ((r3 instanceof defpackage.Qnb) == false) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001c, code lost:
        r1 = true;
     */
    private static void b(defpackage.C7144pob.a aVar, Object obj) {
        if (obj != null) {
            boolean z = false;
            switch (Jnb.a[aVar.a().ordinal()]) {
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
                    if (!(obj instanceof Fnb)) {
                        break;
                    }
                case 8:
                    if (!(obj instanceof Integer)) {
                        break;
                    }
                case 9:
                    if (!(obj instanceof Wnb)) {
                        break;
                    }
            }
            if (!z) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            return;
        }
        throw new NullPointerException();
    }

    public Object a(FieldDescriptorType fielddescriptortype, int i) {
        if (fielddescriptortype.p()) {
            Object a2 = a(fielddescriptortype);
            if (a2 != null) {
                return ((List) a2).get(i);
            }
            throw new IndexOutOfBoundsException();
        }
        throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
    }

    public void a(FieldDescriptorType fielddescriptortype, Object obj) {
        List list;
        if (fielddescriptortype.p()) {
            b(fielddescriptortype.q(), obj);
            Object a2 = a(fielddescriptortype);
            if (a2 == null) {
                list = new ArrayList();
                this.b.a(fielddescriptortype, list);
            } else {
                list = (List) a2;
            }
            list.add(obj);
            return;
        }
        throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
    }

    public boolean c() {
        for (int i = 0; i < this.b.a(); i++) {
            if (!a(this.b.a(i))) {
                return false;
            }
        }
        for (Entry a2 : this.b.b()) {
            if (!a(a2)) {
                return false;
            }
        }
        return true;
    }

    private void b(Entry<FieldDescriptorType, Object> entry) {
        a aVar = (a) entry.getKey();
        Object value = entry.getValue();
        if (value instanceof Qnb) {
            value = ((Qnb) value).b();
        }
        if (aVar.p()) {
            Object a2 = a((FieldDescriptorType) aVar);
            if (a2 == null) {
                a2 = new ArrayList();
            }
            for (Object a3 : (List) value) {
                ((List) a2).add(a(a3));
            }
            this.b.a(aVar, a2);
        } else if (aVar.s() == b.MESSAGE) {
            Object a4 = a((FieldDescriptorType) aVar);
            if (a4 == null) {
                this.b.a(aVar, a(value));
                return;
            }
            this.b.a(aVar, aVar.a(((Wnb) a4).b(), (Wnb) value).build());
        } else {
            this.b.a(aVar, a(value));
        }
    }

    private boolean a(Entry<FieldDescriptorType, Object> entry) {
        a aVar = (a) entry.getKey();
        if (aVar.s() == b.MESSAGE) {
            if (aVar.p()) {
                for (Wnb i : (List) entry.getValue()) {
                    if (!i.i()) {
                        return false;
                    }
                }
            } else {
                Object value = entry.getValue();
                if (value instanceof Wnb) {
                    if (!((Wnb) value).i()) {
                        return false;
                    }
                } else if (value instanceof Qnb) {
                    return true;
                } else {
                    throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
            }
        }
        return true;
    }

    static int a(defpackage.C7144pob.a aVar, boolean z) {
        if (z) {
            return 2;
        }
        return aVar.b();
    }

    public void a(Knb<FieldDescriptorType> knb) {
        for (int i = 0; i < knb.b.a(); i++) {
            b(knb.b.a(i));
        }
        for (Entry b2 : knb.b.b()) {
            b(b2);
        }
    }

    private Object a(Object obj) {
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    public int b() {
        int i = 0;
        for (int i2 = 0; i2 < this.b.a(); i2++) {
            Entry a2 = this.b.a(i2);
            i += b((a) a2.getKey(), a2.getValue());
        }
        for (Entry entry : this.b.b()) {
            i += b((a) entry.getKey(), entry.getValue());
        }
        return i;
    }

    public static Object a(Gnb gnb, defpackage.C7144pob.a aVar, boolean z) throws IOException {
        switch (Jnb.b[aVar.ordinal()]) {
            case 1:
                return Double.valueOf(gnb.e());
            case 2:
                return Float.valueOf(gnb.i());
            case 3:
                return Long.valueOf(gnb.k());
            case 4:
                return Long.valueOf(gnb.z());
            case 5:
                return Integer.valueOf(gnb.j());
            case 6:
                return Long.valueOf(gnb.h());
            case 7:
                return Integer.valueOf(gnb.g());
            case 8:
                return Boolean.valueOf(gnb.c());
            case 9:
                if (z) {
                    return gnb.w();
                }
                return gnb.v();
            case 10:
                return gnb.d();
            case 11:
                return Integer.valueOf(gnb.y());
            case 12:
                return Integer.valueOf(gnb.r());
            case 13:
                return Long.valueOf(gnb.s());
            case 14:
                return Integer.valueOf(gnb.t());
            case 15:
                return Long.valueOf(gnb.u());
            case 16:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle nested groups.");
            case 17:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle embedded messages.");
            case 18:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle enums.");
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int b(a<?> aVar, Object obj) {
        defpackage.C7144pob.a q = aVar.q();
        int i = aVar.i();
        if (!aVar.p()) {
            return a(q, i, obj);
        }
        int i2 = 0;
        if (aVar.t()) {
            for (Object a2 : (List) obj) {
                i2 += a(q, a2);
            }
            return Hnb.h(i) + i2 + Hnb.e(i2);
        }
        for (Object a3 : (List) obj) {
            i2 += a(q, i, a3);
        }
        return i2;
    }

    private static void a(Hnb hnb, defpackage.C7144pob.a aVar, int i, Object obj) throws IOException {
        if (aVar == defpackage.C7144pob.a.GROUP) {
            hnb.b(i, (Wnb) obj);
            return;
        }
        hnb.e(i, a(aVar, false));
        a(hnb, aVar, obj);
    }

    private static void a(Hnb hnb, defpackage.C7144pob.a aVar, Object obj) throws IOException {
        switch (Jnb.b[aVar.ordinal()]) {
            case 1:
                hnb.b(((Double) obj).doubleValue());
                return;
            case 2:
                hnb.b(((Float) obj).floatValue());
                return;
            case 3:
                hnb.i(((Long) obj).longValue());
                return;
            case 4:
                hnb.n(((Long) obj).longValue());
                return;
            case 5:
                hnb.m(((Integer) obj).intValue());
                return;
            case 6:
                hnb.h(((Long) obj).longValue());
                return;
            case 7:
                hnb.l(((Integer) obj).intValue());
                return;
            case 8:
                hnb.b(((Boolean) obj).booleanValue());
                return;
            case 9:
                hnb.b((String) obj);
                return;
            case 10:
                if (obj instanceof Fnb) {
                    hnb.b((Fnb) obj);
                    return;
                } else {
                    hnb.b((byte[]) obj);
                    return;
                }
            case 11:
                hnb.s(((Integer) obj).intValue());
                return;
            case 12:
                hnb.q(((Integer) obj).intValue());
                return;
            case 13:
                hnb.l(((Long) obj).longValue());
                return;
            case 14:
                hnb.r(((Integer) obj).intValue());
                return;
            case 15:
                hnb.m(((Long) obj).longValue());
                return;
            case 16:
                hnb.c((Wnb) obj);
                return;
            case 17:
                hnb.d((Wnb) obj);
                return;
            case 18:
                if (obj instanceof defpackage.Nnb.a) {
                    hnb.k(((defpackage.Nnb.a) obj).i());
                    return;
                } else {
                    hnb.k(((Integer) obj).intValue());
                    return;
                }
            default:
                return;
        }
    }

    public static void a(a<?> aVar, Object obj, Hnb hnb) throws IOException {
        defpackage.C7144pob.a q = aVar.q();
        int i = aVar.i();
        if (aVar.p()) {
            List<Object> list = (List) obj;
            if (aVar.t()) {
                hnb.e(i, 2);
                int i2 = 0;
                for (Object a2 : list) {
                    i2 += a(q, a2);
                }
                hnb.p(i2);
                for (Object a3 : list) {
                    a(hnb, q, a3);
                }
                return;
            }
            for (Object a4 : list) {
                a(hnb, q, i, a4);
            }
        } else if (obj instanceof Qnb) {
            a(hnb, q, i, ((Qnb) obj).b());
        } else {
            a(hnb, q, i, obj);
        }
    }

    private static int a(defpackage.C7144pob.a aVar, int i, Object obj) {
        int h = Hnb.h(i);
        if (aVar == defpackage.C7144pob.a.GROUP) {
            h *= 2;
        }
        return h + a(aVar, obj);
    }

    private static int a(defpackage.C7144pob.a aVar, Object obj) {
        switch (Jnb.b[aVar.ordinal()]) {
            case 1:
                return Hnb.a(((Double) obj).doubleValue());
            case 2:
                return Hnb.a(((Float) obj).floatValue());
            case 3:
                return Hnb.b(((Long) obj).longValue());
            case 4:
                return Hnb.f(((Long) obj).longValue());
            case 5:
                return Hnb.c(((Integer) obj).intValue());
            case 6:
                return Hnb.a(((Long) obj).longValue());
            case 7:
                return Hnb.b(((Integer) obj).intValue());
            case 8:
                return Hnb.a(((Boolean) obj).booleanValue());
            case 9:
                return Hnb.a((String) obj);
            case 10:
                if (obj instanceof Fnb) {
                    return Hnb.a((Fnb) obj);
                }
                return Hnb.a((byte[]) obj);
            case 11:
                return Hnb.i(((Integer) obj).intValue());
            case 12:
                return Hnb.f(((Integer) obj).intValue());
            case 13:
                return Hnb.d(((Long) obj).longValue());
            case 14:
                return Hnb.g(((Integer) obj).intValue());
            case 15:
                return Hnb.e(((Long) obj).longValue());
            case 16:
                return Hnb.a((Wnb) obj);
            case 17:
                if (obj instanceof Qnb) {
                    return Hnb.a((Rnb) (Qnb) obj);
                }
                return Hnb.b((Wnb) obj);
            case 18:
                if (obj instanceof defpackage.Nnb.a) {
                    return Hnb.a(((defpackage.Nnb.a) obj).i());
                }
                return Hnb.a(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }
}
