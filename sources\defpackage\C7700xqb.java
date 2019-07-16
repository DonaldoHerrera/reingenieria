package defpackage;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: xqb reason: default package and case insensitive filesystem */
/* compiled from: MemberScope.kt */
public final class C7700xqb {
    /* access modifiers changed from: private */
    public static int a = 1;
    /* access modifiers changed from: private */
    public static final int b = x.i();
    /* access modifiers changed from: private */
    public static final int c = x.i();
    /* access modifiers changed from: private */
    public static final int d = x.i();
    /* access modifiers changed from: private */
    public static final int e = x.i();
    /* access modifiers changed from: private */
    public static final int f = x.i();
    /* access modifiers changed from: private */
    public static final int g = x.i();
    /* access modifiers changed from: private */
    public static final int h = (x.i() - 1);
    /* access modifiers changed from: private */
    public static final int i;
    private static final int j;
    private static final int k;
    public static final C7700xqb l = new C7700xqb(h, null, 2, null);
    public static final C7700xqb m = new C7700xqb(k, null, 2, null);
    public static final C7700xqb n = new C7700xqb(b, null, 2, null);
    public static final C7700xqb o = new C7700xqb(c, null, 2, null);
    public static final C7700xqb p = new C7700xqb(d, null, 2, null);
    public static final C7700xqb q = new C7700xqb(i, null, 2, null);
    public static final C7700xqb r = new C7700xqb(e, null, 2, null);
    public static final C7700xqb s = new C7700xqb(f, null, 2, null);
    public static final C7700xqb t = new C7700xqb(g, null, 2, null);
    public static final C7700xqb u = new C7700xqb(j, null, 2, null);
    private static final List<C0188a> v;
    private static final List<C0188a> w;
    public static final a x = new a(null);
    private final int y;
    private final List<C7631wqb> z;

    /* renamed from: xqb$a */
    /* compiled from: MemberScope.kt */
    public static final class a {

        /* renamed from: xqb$a$a reason: collision with other inner class name */
        /* compiled from: MemberScope.kt */
        private static final class C0188a {
            private final int a;
            private final String b;

            public C0188a(int i, String str) {
                C7471uYa.b(str, "name");
                this.a = i;
                this.b = str;
            }

            public final int a() {
                return this.a;
            }

            public final String b() {
                return this.b;
            }
        }

        private a() {
        }

        /* access modifiers changed from: private */
        public final int i() {
            int e = C7700xqb.a;
            C7700xqb.a = C7700xqb.a << 1;
            return e;
        }

        public final int b() {
            return C7700xqb.i;
        }

        public final int c() {
            return C7700xqb.f;
        }

        public final int d() {
            return C7700xqb.b;
        }

        public final int e() {
            return C7700xqb.e;
        }

        public final int f() {
            return C7700xqb.c;
        }

        public final int g() {
            return C7700xqb.d;
        }

        public final int h() {
            return C7700xqb.g;
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }

        public final int a() {
            return C7700xqb.h;
        }
    }

    static {
        String str;
        String str2;
        String str3;
        Object obj;
        Object obj2;
        int i2 = b;
        int i3 = c;
        i = i2 | i3 | d;
        int i4 = f;
        int i5 = i3 | i4;
        int i6 = g;
        j = i5 | i6;
        k = i4 | i6;
        a aVar = x;
        Field[] fields = C7700xqb.class.getFields();
        String str4 = "T::class.java.fields";
        C7471uYa.a((Object) fields, str4);
        ArrayList arrayList = new ArrayList();
        int length = fields.length;
        int i7 = 0;
        while (true) {
            str = "it";
            if (i7 >= length) {
                break;
            }
            Field field = fields[i7];
            C7471uYa.a((Object) field, str);
            if (Modifier.isStatic(field.getModifiers())) {
                arrayList.add(field);
            }
            i7++;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (true) {
            str2 = "field.name";
            str3 = "field";
            if (!it.hasNext()) {
                break;
            }
            Field field2 = (Field) it.next();
            Object obj3 = field2.get(null);
            if (!(obj3 instanceof C7700xqb)) {
                obj3 = null;
            }
            C7700xqb xqb = (C7700xqb) obj3;
            if (xqb != null) {
                int i8 = xqb.y;
                C7471uYa.a((Object) field2, str3);
                String name = field2.getName();
                C7471uYa.a((Object) name, str2);
                obj2 = new C0188a(i8, name);
            } else {
                obj2 = null;
            }
            if (obj2 != null) {
                arrayList2.add(obj2);
            }
        }
        v = C7676xWa.q(arrayList2);
        a aVar2 = x;
        Field[] fields2 = C7700xqb.class.getFields();
        C7471uYa.a((Object) fields2, str4);
        ArrayList arrayList3 = new ArrayList();
        for (Field field3 : fields2) {
            C7471uYa.a((Object) field3, str);
            if (Modifier.isStatic(field3.getModifiers())) {
                arrayList3.add(field3);
            }
        }
        ArrayList<Field> arrayList4 = new ArrayList<>();
        for (Object next : arrayList3) {
            Field field4 = (Field) next;
            C7471uYa.a((Object) field4, str);
            if (C7471uYa.a((Object) field4.getType(), (Object) Integer.TYPE)) {
                arrayList4.add(next);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        for (Field field5 : arrayList4) {
            Object obj4 = field5.get(null);
            if (obj4 != null) {
                int intValue = ((Integer) obj4).intValue();
                if (intValue == ((-intValue) & intValue)) {
                    C7471uYa.a((Object) field5, str3);
                    String name2 = field5.getName();
                    C7471uYa.a((Object) name2, str2);
                    obj = new C0188a(intValue, name2);
                } else {
                    obj = null;
                }
                if (obj != null) {
                    arrayList5.add(obj);
                }
            } else {
                throw new OVa("null cannot be cast to non-null type kotlin.Int");
            }
        }
        w = C7676xWa.q(arrayList5);
    }

    public C7700xqb(int i2, List<? extends C7631wqb> list) {
        C7471uYa.b(list, "excludes");
        this.z = list;
        for (C7631wqb a2 : this.z) {
            i2 &= ~a2.a();
        }
        this.y = i2;
    }

    public final List<C7631wqb> j() {
        return this.z;
    }

    public final int k() {
        return this.y;
    }

    public String toString() {
        Object obj;
        boolean z2;
        Iterator it = v.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((C0188a) obj).a() == this.y) {
                z2 = true;
                continue;
            } else {
                z2 = false;
                continue;
            }
            if (z2) {
                break;
            }
        }
        C0188a aVar = (C0188a) obj;
        String b2 = aVar != null ? aVar.b() : null;
        if (b2 == null) {
            List<C0188a> list = w;
            ArrayList arrayList = new ArrayList();
            for (C0188a aVar2 : list) {
                Object b3 = a(aVar2.a()) ? aVar2.b() : null;
                if (b3 != null) {
                    arrayList.add(b3);
                }
            }
            b2 = C7676xWa.a(arrayList, " | ", null, null, 0, null, null, 62, null);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("DescriptorKindFilter(");
        sb.append(b2);
        sb.append(", ");
        sb.append(this.z);
        sb.append(')');
        return sb.toString();
    }

    public final boolean a(int i2) {
        return (i2 & this.y) != 0;
    }

    public final C7700xqb c(int i2) {
        int i3 = i2 & this.y;
        if (i3 == 0) {
            return null;
        }
        return new C7700xqb(i3, this.z);
    }

    public /* synthetic */ C7700xqb(int i2, List list, int i3, C7264rYa rya) {
        if ((i3 & 2) != 0) {
            list = C6918mWa.a();
        }
        this(i2, list);
    }
}
