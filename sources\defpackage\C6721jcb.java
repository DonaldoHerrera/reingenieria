package defpackage;

import java.lang.annotation.Annotation;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/* renamed from: jcb reason: default package and case insensitive filesystem */
/* compiled from: JavaToKotlinClassMap.kt */
public final class C6721jcb {
    private static final String a;
    private static final String b;
    private static final String c;
    private static final String d;
    private static final C7280rnb e;
    private static final C7349snb f;
    private static final C7280rnb g;
    private static final HashMap<C7487unb, C7280rnb> h = new HashMap<>();
    private static final HashMap<C7487unb, C7280rnb> i = new HashMap<>();
    private static final HashMap<C7487unb, C7349snb> j = new HashMap<>();
    private static final HashMap<C7487unb, C7349snb> k = new HashMap<>();
    private static final List<a> l;
    public static final C6721jcb m;

    /* renamed from: jcb$a */
    /* compiled from: JavaToKotlinClassMap.kt */
    public static final class a {
        private final C7280rnb a;
        private final C7280rnb b;
        private final C7280rnb c;

        public a(C7280rnb rnb, C7280rnb rnb2, C7280rnb rnb3) {
            C7471uYa.b(rnb, "javaClass");
            C7471uYa.b(rnb2, "kotlinReadOnly");
            C7471uYa.b(rnb3, "kotlinMutable");
            this.a = rnb;
            this.b = rnb2;
            this.c = rnb3;
        }

        public final C7280rnb a() {
            return this.a;
        }

        public final C7280rnb b() {
            return this.b;
        }

        public final C7280rnb c() {
            return this.c;
        }

        public final C7280rnb d() {
            return this.a;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0024, code lost:
            if (defpackage.C7471uYa.a((java.lang.Object) r2.c, (java.lang.Object) r3.c) != false) goto L_0x0029;
         */
        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof a) {
                    a aVar = (a) obj;
                    if (C7471uYa.a((Object) this.a, (Object) aVar.a)) {
                        if (C7471uYa.a((Object) this.b, (Object) aVar.b)) {
                        }
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            C7280rnb rnb = this.a;
            int i = 0;
            int hashCode = (rnb != null ? rnb.hashCode() : 0) * 31;
            C7280rnb rnb2 = this.b;
            int hashCode2 = (hashCode + (rnb2 != null ? rnb2.hashCode() : 0)) * 31;
            C7280rnb rnb3 = this.c;
            if (rnb3 != null) {
                i = rnb3.hashCode();
            }
            return hashCode2 + i;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("PlatformMutabilityMapping(javaClass=");
            sb.append(this.a);
            sb.append(", kotlinReadOnly=");
            sb.append(this.b);
            sb.append(", kotlinMutable=");
            sb.append(this.c);
            sb.append(")");
            return sb.toString();
        }
    }

    static {
        C7424tqb[] values;
        C6721jcb jcb = new C6721jcb();
        m = jcb;
        StringBuilder sb = new StringBuilder();
        sb.append(c.a.b().toString());
        String str = ".";
        sb.append(str);
        sb.append(c.a.a());
        a = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(c.c.b().toString());
        sb2.append(str);
        sb2.append(c.c.a());
        b = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(c.b.b().toString());
        sb3.append(str);
        sb3.append(c.b.a());
        c = sb3.toString();
        StringBuilder sb4 = new StringBuilder();
        sb4.append(c.d.b().toString());
        sb4.append(str);
        sb4.append(c.d.a());
        d = sb4.toString();
        C7280rnb a2 = C7280rnb.a(new C7349snb("kotlin.jvm.functions.FunctionN"));
        C7471uYa.a((Object) a2, "ClassId.topLevel(FqName(…vm.functions.FunctionN\"))");
        e = a2;
        C7349snb a3 = e.a();
        C7471uYa.a((Object) a3, "FUNCTION_N_CLASS_ID.asSingleFqName()");
        f = a3;
        C7280rnb a4 = C7280rnb.a(new C7349snb("kotlin.reflect.KFunction"));
        C7471uYa.a((Object) a4, "ClassId.topLevel(FqName(…tlin.reflect.KFunction\"))");
        g = a4;
        C7280rnb a5 = C7280rnb.a(C5301Sbb.h.M);
        C7471uYa.a((Object) a5, "ClassId.topLevel(FQ_NAMES.iterable)");
        C7349snb snb = C5301Sbb.h.U;
        C7471uYa.a((Object) snb, "FQ_NAMES.mutableIterable");
        C7349snb d2 = a5.d();
        C7349snb d3 = a5.d();
        String str2 = "kotlinReadOnly.packageFqName";
        C7471uYa.a((Object) d3, str2);
        C7349snb b2 = C7625wnb.b(snb, d3);
        C7280rnb rnb = new C7280rnb(d2, b2, false);
        C7280rnb a6 = C7280rnb.a(C5301Sbb.h.L);
        C7471uYa.a((Object) a6, "ClassId.topLevel(FQ_NAMES.iterator)");
        C7349snb snb2 = C5301Sbb.h.T;
        C7471uYa.a((Object) snb2, "FQ_NAMES.mutableIterator");
        C7349snb d4 = a6.d();
        C7349snb d5 = a6.d();
        C7471uYa.a((Object) d5, str2);
        C7280rnb rnb2 = new C7280rnb(d4, C7625wnb.b(snb2, d5), false);
        C7280rnb a7 = C7280rnb.a(C5301Sbb.h.N);
        C7471uYa.a((Object) a7, "ClassId.topLevel(FQ_NAMES.collection)");
        C7349snb snb3 = C5301Sbb.h.V;
        C7471uYa.a((Object) snb3, "FQ_NAMES.mutableCollection");
        C7349snb d6 = a7.d();
        C7349snb d7 = a7.d();
        C7471uYa.a((Object) d7, str2);
        C7280rnb rnb3 = new C7280rnb(d6, C7625wnb.b(snb3, d7), false);
        C7280rnb a8 = C7280rnb.a(C5301Sbb.h.O);
        C7471uYa.a((Object) a8, "ClassId.topLevel(FQ_NAMES.list)");
        C7349snb snb4 = C5301Sbb.h.W;
        C7471uYa.a((Object) snb4, "FQ_NAMES.mutableList");
        C7349snb d8 = a8.d();
        C7349snb d9 = a8.d();
        C7471uYa.a((Object) d9, str2);
        C7280rnb rnb4 = new C7280rnb(d8, C7625wnb.b(snb4, d9), false);
        C7280rnb a9 = C7280rnb.a(C5301Sbb.h.Q);
        C7471uYa.a((Object) a9, "ClassId.topLevel(FQ_NAMES.set)");
        C7349snb snb5 = C5301Sbb.h.Y;
        C7471uYa.a((Object) snb5, "FQ_NAMES.mutableSet");
        C7349snb d10 = a9.d();
        C7349snb d11 = a9.d();
        C7471uYa.a((Object) d11, str2);
        C7280rnb rnb5 = new C7280rnb(d10, C7625wnb.b(snb5, d11), false);
        C7280rnb a10 = C7280rnb.a(C5301Sbb.h.P);
        C7471uYa.a((Object) a10, "ClassId.topLevel(FQ_NAMES.listIterator)");
        C7349snb snb6 = C5301Sbb.h.X;
        C7471uYa.a((Object) snb6, "FQ_NAMES.mutableListIterator");
        C7349snb d12 = a10.d();
        C7349snb d13 = a10.d();
        C7471uYa.a((Object) d13, str2);
        C7280rnb rnb6 = new C7280rnb(d12, C7625wnb.b(snb6, d13), false);
        C7280rnb a11 = C7280rnb.a(C5301Sbb.h.R);
        C7471uYa.a((Object) a11, "ClassId.topLevel(FQ_NAMES.map)");
        C7349snb snb7 = C5301Sbb.h.Z;
        C7471uYa.a((Object) snb7, "FQ_NAMES.mutableMap");
        C7349snb d14 = a11.d();
        C7349snb d15 = a11.d();
        C7471uYa.a((Object) d15, str2);
        C7280rnb rnb7 = new C7280rnb(d14, C7625wnb.b(snb7, d15), false);
        C7280rnb a12 = C7280rnb.a(C5301Sbb.h.R).a(C5301Sbb.h.S.e());
        C7471uYa.a((Object) a12, "ClassId.topLevel(FQ_NAME…MES.mapEntry.shortName())");
        C7349snb snb8 = C5301Sbb.h.aa;
        C7471uYa.a((Object) snb8, "FQ_NAMES.mutableMapEntry");
        C7349snb d16 = a12.d();
        C7349snb d17 = a12.d();
        C7471uYa.a((Object) d17, str2);
        l = C6918mWa.b((T[]) new a[]{new a(jcb.a(Iterable.class), a5, rnb), new a(jcb.a(Iterator.class), a6, rnb2), new a(jcb.a(Collection.class), a7, rnb3), new a(jcb.a(List.class), a8, rnb4), new a(jcb.a(Set.class), a9, rnb5), new a(jcb.a(ListIterator.class), a10, rnb6), new a(jcb.a(Map.class), a11, rnb7), new a(jcb.a(Entry.class), a12, new C7280rnb(d16, C7625wnb.b(snb8, d17), false))});
        C7487unb unb = C5301Sbb.h.a;
        C7471uYa.a((Object) unb, "FQ_NAMES.any");
        jcb.a(Object.class, unb);
        C7487unb unb2 = C5301Sbb.h.g;
        C7471uYa.a((Object) unb2, "FQ_NAMES.string");
        jcb.a(String.class, unb2);
        C7487unb unb3 = C5301Sbb.h.f;
        C7471uYa.a((Object) unb3, "FQ_NAMES.charSequence");
        jcb.a(CharSequence.class, unb3);
        C7349snb snb9 = C5301Sbb.h.t;
        C7471uYa.a((Object) snb9, "FQ_NAMES.throwable");
        jcb.a(Throwable.class, snb9);
        C7487unb unb4 = C5301Sbb.h.c;
        C7471uYa.a((Object) unb4, "FQ_NAMES.cloneable");
        jcb.a(Cloneable.class, unb4);
        C7487unb unb5 = C5301Sbb.h.q;
        C7471uYa.a((Object) unb5, "FQ_NAMES.number");
        jcb.a(Number.class, unb5);
        C7349snb snb10 = C5301Sbb.h.u;
        C7471uYa.a((Object) snb10, "FQ_NAMES.comparable");
        jcb.a(Comparable.class, snb10);
        C7487unb unb6 = C5301Sbb.h.r;
        C7471uYa.a((Object) unb6, "FQ_NAMES._enum");
        jcb.a(Enum.class, unb6);
        C7349snb snb11 = C5301Sbb.h.C;
        C7471uYa.a((Object) snb11, "FQ_NAMES.annotation");
        jcb.a(Annotation.class, snb11);
        for (a a13 : l) {
            jcb.a(a13);
        }
        for (C7424tqb tqb : C7424tqb.values()) {
            C7280rnb a14 = C7280rnb.a(tqb.d());
            C7471uYa.a((Object) a14, "ClassId.topLevel(jvmType.wrapperFqName)");
            C7280rnb a15 = C7280rnb.a(C5301Sbb.b(tqb.c()));
            C7471uYa.a((Object) a15, "ClassId.topLevel(KotlinB…e(jvmType.primitiveType))");
            jcb.a(a14, a15);
        }
        for (C7280rnb rnb8 : C5090Lbb.b.a()) {
            StringBuilder sb5 = new StringBuilder();
            sb5.append("kotlin.jvm.internal.");
            sb5.append(rnb8.f().a());
            sb5.append("CompanionObject");
            C7280rnb a16 = C7280rnb.a(new C7349snb(sb5.toString()));
            C7471uYa.a((Object) a16, "ClassId.topLevel(FqName(…g() + \"CompanionObject\"))");
            C7280rnb a17 = rnb8.a(C7832znb.c);
            C7471uYa.a((Object) a17, "classId.createNestedClas…AME_FOR_COMPANION_OBJECT)");
            jcb.a(a16, a17);
        }
        for (int i2 = 0; i2 < 23; i2++) {
            StringBuilder sb6 = new StringBuilder();
            sb6.append("kotlin.jvm.functions.Function");
            sb6.append(i2);
            C7280rnb a18 = C7280rnb.a(new C7349snb(sb6.toString()));
            C7471uYa.a((Object) a18, "ClassId.topLevel(FqName(…m.functions.Function$i\"))");
            C7280rnb b3 = C5301Sbb.b(i2);
            C7471uYa.a((Object) b3, "KotlinBuiltIns.getFunctionClassId(i)");
            jcb.a(a18, b3);
            StringBuilder sb7 = new StringBuilder();
            sb7.append(b);
            sb7.append(i2);
            jcb.a(new C7349snb(sb7.toString()), g);
        }
        for (int i3 = 0; i3 < 22; i3++) {
            c cVar = c.d;
            StringBuilder sb8 = new StringBuilder();
            sb8.append(cVar.b().toString());
            sb8.append(str);
            sb8.append(cVar.a());
            String sb9 = sb8.toString();
            StringBuilder sb10 = new StringBuilder();
            sb10.append(sb9);
            sb10.append(i3);
            jcb.a(new C7349snb(sb10.toString()), g);
        }
        C7349snb h2 = C5301Sbb.h.b.h();
        C7471uYa.a((Object) h2, "FQ_NAMES.nothing.toSafe()");
        jcb.a(h2, jcb.a(Void.class));
    }

    private C6721jcb() {
    }

    public final List<a> b() {
        return l;
    }

    public final boolean c(C5029Jcb jcb) {
        C7471uYa.b(jcb, "mutable");
        return j.containsKey(C6531gpb.e(jcb));
    }

    public final boolean d(C5029Jcb jcb) {
        C7471uYa.b(jcb, "readOnly");
        return k.containsKey(C6531gpb.e(jcb));
    }

    private final void b(C7280rnb rnb, C7280rnb rnb2) {
        h.put(rnb.a().g(), rnb2);
    }

    public final C7349snb a() {
        return f;
    }

    public final C7280rnb a(C7349snb snb) {
        C7471uYa.b(snb, "fqName");
        return (C7280rnb) h.get(snb.g());
    }

    public final boolean b(C7706xtb xtb) {
        C7471uYa.b(xtb, C1325gg.TYPE);
        C5029Jcb b2 = C5605aub.b(xtb);
        return b2 != null && d(b2);
    }

    public static /* synthetic */ C5029Jcb a(C6721jcb jcb, C7349snb snb, C5301Sbb sbb, Integer num, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            num = null;
        }
        return jcb.a(snb, sbb, num);
    }

    public final C5029Jcb a(C7349snb snb, C5301Sbb sbb, Integer num) {
        C7280rnb rnb;
        C7471uYa.b(snb, "fqName");
        C7471uYa.b(sbb, "builtIns");
        if (num == null || !C7471uYa.a((Object) snb, (Object) f)) {
            rnb = a(snb);
        } else {
            rnb = C5301Sbb.b(num.intValue());
        }
        if (rnb != null) {
            return sbb.a(rnb.a());
        }
        return null;
    }

    public final C5029Jcb b(C5029Jcb jcb) {
        C7471uYa.b(jcb, "readOnly");
        return a(jcb, (Map<C7487unb, C7349snb>) k, "read-only");
    }

    public final C7280rnb a(C7487unb unb) {
        C7471uYa.b(unb, "kotlinFqName");
        if (a(unb, a)) {
            return e;
        }
        if (a(unb, c)) {
            return e;
        }
        if (a(unb, b)) {
            return g;
        }
        if (a(unb, d)) {
            return g;
        }
        return (C7280rnb) i.get(unb);
    }

    private final boolean a(C7487unb unb, String str) {
        String a2 = unb.a();
        C7471uYa.a((Object) a2, "kotlinFqName.asString()");
        String b2 = Hxb.b(a2, str, "");
        boolean z = true;
        if (!(b2.length() > 0) || Hxb.c((CharSequence) b2, '0', false, 2, (Object) null)) {
            return false;
        }
        Integer c2 = Bxb.c(b2);
        if (c2 == null || c2.intValue() < 23) {
            z = false;
        }
        return z;
    }

    private final void a(a aVar) {
        C7280rnb a2 = aVar.a();
        C7280rnb b2 = aVar.b();
        C7280rnb c2 = aVar.c();
        a(a2, b2);
        C7349snb a3 = c2.a();
        String str = "mutableClassId.asSingleFqName()";
        C7471uYa.a((Object) a3, str);
        a(a3, a2);
        C7349snb a4 = b2.a();
        C7471uYa.a((Object) a4, "readOnlyClassId.asSingleFqName()");
        C7349snb a5 = c2.a();
        C7471uYa.a((Object) a5, str);
        j.put(c2.a().g(), a4);
        k.put(a4.g(), a5);
    }

    private final void a(C7280rnb rnb, C7280rnb rnb2) {
        b(rnb, rnb2);
        C7349snb a2 = rnb2.a();
        C7471uYa.a((Object) a2, "kotlinClassId.asSingleFqName()");
        a(a2, rnb);
    }

    private final void a(Class<?> cls, C7487unb unb) {
        C7349snb h2 = unb.h();
        C7471uYa.a((Object) h2, "kotlinFqName.toSafe()");
        a(cls, h2);
    }

    private final void a(Class<?> cls, C7349snb snb) {
        C7280rnb a2 = a(cls);
        C7280rnb a3 = C7280rnb.a(snb);
        C7471uYa.a((Object) a3, "ClassId.topLevel(kotlinFqName)");
        a(a2, a3);
    }

    private final void a(C7349snb snb, C7280rnb rnb) {
        i.put(snb.g(), rnb);
    }

    public final Collection<C5029Jcb> a(C7349snb snb, C5301Sbb sbb) {
        C7471uYa.b(snb, "fqName");
        C7471uYa.b(sbb, "builtIns");
        C5029Jcb a2 = a(this, snb, sbb, null, 4, null);
        if (a2 == null) {
            return SWa.a();
        }
        C7349snb snb2 = (C7349snb) k.get(C7148pqb.d(a2));
        if (snb2 == null) {
            return RWa.a(a2);
        }
        C7471uYa.a((Object) snb2, "readOnlyToMutable[kotlin…eturn setOf(kotlinAnalog)");
        List asList = Arrays.asList(new C5029Jcb[]{a2, sbb.a(snb2)});
        C7471uYa.a((Object) asList, "Arrays.asList(kotlinAnal…tlinMutableAnalogFqName))");
        return asList;
    }

    public final boolean a(C7706xtb xtb) {
        C7471uYa.b(xtb, C1325gg.TYPE);
        C5029Jcb b2 = C5605aub.b(xtb);
        return b2 != null && c(b2);
    }

    public final C5029Jcb a(C5029Jcb jcb) {
        String str = "mutable";
        C7471uYa.b(jcb, str);
        return a(jcb, (Map<C7487unb, C7349snb>) j, str);
    }

    /* access modifiers changed from: private */
    public final C7280rnb a(Class<?> cls) {
        boolean z = !cls.isPrimitive() && !cls.isArray();
        if (!TVa.a || z) {
            Class declaringClass = cls.getDeclaringClass();
            if (declaringClass == null) {
                C7280rnb a2 = C7280rnb.a(new C7349snb(cls.getCanonicalName()));
                C7471uYa.a((Object) a2, "ClassId.topLevel(FqName(clazz.canonicalName))");
                return a2;
            }
            C7280rnb a3 = a(declaringClass).a(C7694xnb.b(cls.getSimpleName()));
            C7471uYa.a((Object) a3, "classId(outer).createNes…tifier(clazz.simpleName))");
            return a3;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Invalid class: ");
        sb.append(cls);
        throw new AssertionError(sb.toString());
    }

    private final C5029Jcb a(C5029Jcb jcb, Map<C7487unb, C7349snb> map, String str) {
        C7349snb snb = (C7349snb) map.get(C6531gpb.e(jcb));
        if (snb != null) {
            C5029Jcb a2 = C7148pqb.b((C5272Rcb) jcb).a(snb);
            C7471uYa.a((Object) a2, "descriptor.builtIns.getB…Name(oppositeClassFqName)");
            return a2;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Given class ");
        sb.append(jcb);
        sb.append(" is not a ");
        sb.append(str);
        sb.append(" collection");
        throw new IllegalArgumentException(sb.toString());
    }
}
