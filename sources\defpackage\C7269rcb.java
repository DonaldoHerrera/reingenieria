package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* renamed from: rcb reason: default package and case insensitive filesystem */
/* compiled from: JvmBuiltInsSettings.kt */
public class C7269rcb implements C7478ueb, C7616web {
    static final /* synthetic */ DZa[] a = {HYa.a((DYa) new EYa(HYa.a(C7269rcb.class), "ownerModuleDescriptor", "getOwnerModuleDescriptor()Lorg/jetbrains/kotlin/descriptors/ModuleDescriptor;")), HYa.a((DYa) new EYa(HYa.a(C7269rcb.class), "isAdditionalBuiltInsFeatureSupported", "isAdditionalBuiltInsFeatureSupported()Z")), HYa.a((DYa) new EYa(HYa.a(C7269rcb.class), "cloneableType", "getCloneableType()Lorg/jetbrains/kotlin/types/SimpleType;")), HYa.a((DYa) new EYa(HYa.a(C7269rcb.class), "notConsideredDeprecation", "getNotConsideredDeprecation()Lorg/jetbrains/kotlin/descriptors/annotations/Annotations;"))};
    /* access modifiers changed from: private */
    public static final Set<String> b;
    /* access modifiers changed from: private */
    public static final Set<String> c;
    /* access modifiers changed from: private */
    public static final Set<String> d;
    private static final Set<String> e;
    private static final Set<String> f;
    private static final Set<String> g;
    public static final a h = new a(null);
    /* access modifiers changed from: private */
    public final C6721jcb i = C6721jcb.m;
    private final C7744yVa j;
    private final C7744yVa k;
    private final C7706xtb l;
    private final Psb m;
    private final Fsb<C7349snb, C5029Jcb> n;
    private final Psb o;
    /* access modifiers changed from: private */
    public final C6450fdb p;

    /* renamed from: rcb$a */
    /* compiled from: JvmBuiltInsSettings.kt */
    public static final class a {
        private a() {
        }

        /* access modifiers changed from: private */
        public final Set<String> d() {
            Lkb lkb = Lkb.a;
            List<C7424tqb> b = C6918mWa.b((T[]) new C7424tqb[]{C7424tqb.BOOLEAN, C7424tqb.BYTE, C7424tqb.DOUBLE, C7424tqb.FLOAT, C7424tqb.BYTE, C7424tqb.INT, C7424tqb.LONG, C7424tqb.SHORT});
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (C7424tqb d : b) {
                String a = d.d().e().a();
                C7471uYa.a((Object) a, "it.wrapperFqName.shortName().asString()");
                String[] a2 = lkb.a("Ljava/lang/String;");
                C7331sWa.a((Collection<? super T>) linkedHashSet, (Iterable<? extends T>) lkb.b(a, (String[]) Arrays.copyOf(a2, a2.length)));
            }
            return linkedHashSet;
        }

        /* access modifiers changed from: private */
        public final Set<String> e() {
            Lkb lkb = Lkb.a;
            List<C7424tqb> b = C6918mWa.b((T[]) new C7424tqb[]{C7424tqb.BOOLEAN, C7424tqb.CHAR});
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (C7424tqb tqb : b) {
                String a = tqb.d().e().a();
                C7471uYa.a((Object) a, "it.wrapperFqName.shortName().asString()");
                StringBuilder sb = new StringBuilder();
                sb.append(tqb.b());
                sb.append("Value()");
                sb.append(tqb.a());
                C7331sWa.a((Collection<? super T>) linkedHashSet, (Iterable<? extends T>) lkb.b(a, sb.toString()));
            }
            return linkedHashSet;
        }

        public final Set<String> c() {
            return C7269rcb.d;
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }

        /* access modifiers changed from: private */
        public final boolean b(C7487unb unb) {
            return C7471uYa.a((Object) unb, (Object) C5301Sbb.h.h) || C5301Sbb.a(unb);
        }

        public final boolean a(C7487unb unb) {
            C7471uYa.b(unb, "fqName");
            if (b(unb)) {
                return true;
            }
            C7280rnb a = C6721jcb.m.a(unb);
            if (a != null) {
                try {
                    return Serializable.class.isAssignableFrom(Class.forName(a.a().a()));
                } catch (ClassNotFoundException unused) {
                }
            }
            return false;
        }

        public final Set<String> b() {
            return C7269rcb.b;
        }

        public final Set<String> a() {
            return C7269rcb.c;
        }
    }

    /* renamed from: rcb$b */
    /* compiled from: JvmBuiltInsSettings.kt */
    private enum b {
        BLACK_LIST,
        WHITE_LIST,
        NOT_CONSIDERED,
        DROP
    }

    static {
        String str = "Collection";
        b = TWa.b((Set<? extends T>) Lkb.a.c(str, "toArray()[Ljava/lang/Object;", "toArray([Ljava/lang/Object;)[Ljava/lang/Object;"), "java/lang/annotation/Annotation.annotationType()Ljava/lang/Class;");
        Lkb lkb = Lkb.a;
        String str2 = "sort(Ljava/util/Comparator;)V";
        String str3 = "List";
        String str4 = "String";
        Set b2 = TWa.b(TWa.b(h.e(), (Iterable<? extends T>) lkb.c(str3, str2)), (Iterable<? extends T>) lkb.b(str4, "codePointAt(I)I", "codePointBefore(I)I", "codePointCount(II)I", "compareToIgnoreCase(Ljava/lang/String;)I", "concat(Ljava/lang/String;)Ljava/lang/String;", "contains(Ljava/lang/CharSequence;)Z", "contentEquals(Ljava/lang/CharSequence;)Z", "contentEquals(Ljava/lang/StringBuffer;)Z", "endsWith(Ljava/lang/String;)Z", "equalsIgnoreCase(Ljava/lang/String;)Z", "getBytes()[B", "getBytes(II[BI)V", "getBytes(Ljava/lang/String;)[B", "getBytes(Ljava/nio/charset/Charset;)[B", "getChars(II[CI)V", "indexOf(I)I", "indexOf(II)I", "indexOf(Ljava/lang/String;)I", "indexOf(Ljava/lang/String;I)I", "intern()Ljava/lang/String;", "isEmpty()Z", "lastIndexOf(I)I", "lastIndexOf(II)I", "lastIndexOf(Ljava/lang/String;)I", "lastIndexOf(Ljava/lang/String;I)I", "matches(Ljava/lang/String;)Z", "offsetByCodePoints(II)I", "regionMatches(ILjava/lang/String;II)Z", "regionMatches(ZILjava/lang/String;II)Z", "replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "replace(CC)Ljava/lang/String;", "replaceFirst(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;", "split(Ljava/lang/String;I)[Ljava/lang/String;", "split(Ljava/lang/String;)[Ljava/lang/String;", "startsWith(Ljava/lang/String;I)Z", "startsWith(Ljava/lang/String;)Z", "substring(II)Ljava/lang/String;", "substring(I)Ljava/lang/String;", "toCharArray()[C", "toLowerCase()Ljava/lang/String;", "toLowerCase(Ljava/util/Locale;)Ljava/lang/String;", "toUpperCase()Ljava/lang/String;", "toUpperCase(Ljava/util/Locale;)Ljava/lang/String;", "trim()Ljava/lang/String;", "isBlank()Z", "lines()Ljava/util/stream/Stream;", "repeat(I)Ljava/lang/String;"));
        String str5 = "isNaN()Z";
        String str6 = "isInfinite()Z";
        String[] strArr = {str6, str5};
        String str7 = "Float";
        c = TWa.b(TWa.b(TWa.b(b2, (Iterable<? extends T>) lkb.b("Double", str6, str5)), (Iterable<? extends T>) lkb.b(str7, strArr)), (Iterable<? extends T>) lkb.b("Enum", "getDeclaringClass()Ljava/lang/Class;", "finalize()V"));
        Lkb lkb2 = Lkb.a;
        String str8 = "spliterator()Ljava/util/Spliterator;";
        String str9 = "Throwable";
        Set b3 = TWa.b(TWa.b(TWa.b((Set<? extends T>) lkb2.b("CharSequence", "codePoints()Ljava/util/stream/IntStream;", "chars()Ljava/util/stream/IntStream;"), (Iterable<? extends T>) lkb2.c("Iterator", "forEachRemaining(Ljava/util/function/Consumer;)V")), (Iterable<? extends T>) lkb2.b("Iterable", "forEach(Ljava/util/function/Consumer;)V", str8)), (Iterable<? extends T>) lkb2.b(str9, "setStackTrace([Ljava/lang/StackTraceElement;)V", "fillInStackTrace()Ljava/lang/Throwable;", "getLocalizedMessage()Ljava/lang/String;", "printStackTrace()V", "printStackTrace(Ljava/io/PrintStream;)V", "printStackTrace(Ljava/io/PrintWriter;)V", "getStackTrace()[Ljava/lang/StackTraceElement;", "initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;", "getSuppressed()[Ljava/lang/Throwable;", "addSuppressed(Ljava/lang/Throwable;)V"));
        String str10 = "removeIf(Ljava/util/function/Predicate;)Z";
        Set b4 = TWa.b(b3, (Iterable<? extends T>) lkb2.c(str, str8, "parallelStream()Ljava/util/stream/Stream;", "stream()Ljava/util/stream/Stream;", str10));
        String str11 = "replaceAll(Ljava/util/function/UnaryOperator;)V";
        String str12 = "Map";
        d = TWa.b(TWa.b(b4, (Iterable<? extends T>) lkb2.c(str3, str11)), (Iterable<? extends T>) lkb2.c(str12, "getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "forEach(Ljava/util/function/BiConsumer;)V", "replaceAll(Ljava/util/function/BiFunction;)V", "merge(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "computeIfPresent(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "replace(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z", "replace(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;", "compute(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;"));
        Lkb lkb3 = Lkb.a;
        e = TWa.b(TWa.b((Set<? extends T>) lkb3.c(str, str10), (Iterable<? extends T>) lkb3.c(str3, str11, str2)), (Iterable<? extends T>) lkb3.c(str12, "computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;", "computeIfPresent(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "compute(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "merge(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "remove(Ljava/lang/Object;Ljava/lang/Object;)Z", "replaceAll(Ljava/util/function/BiFunction;)V", "replace(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "replace(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z"));
        Lkb lkb4 = Lkb.a;
        Set a2 = h.d();
        String[] a3 = lkb4.a("D");
        Set b5 = TWa.b(a2, (Iterable<? extends T>) lkb4.b(str7, (String[]) Arrays.copyOf(a3, a3.length)));
        String[] a4 = lkb4.a("[C", "[CII", "[III", "[BIILjava/lang/String;", "[BIILjava/nio/charset/Charset;", "[BLjava/lang/String;", "[BLjava/nio/charset/Charset;", "[BII", "[B", "Ljava/lang/StringBuffer;", "Ljava/lang/StringBuilder;");
        f = TWa.b(b5, (Iterable<? extends T>) lkb4.b(str4, (String[]) Arrays.copyOf(a4, a4.length)));
        Lkb lkb5 = Lkb.a;
        String[] a5 = lkb5.a("Ljava/lang/String;Ljava/lang/Throwable;ZZ");
        g = lkb5.b(str9, (String[]) Arrays.copyOf(a5, a5.length));
    }

    public C7269rcb(C6450fdb fdb, Ssb ssb, PXa<? extends C6450fdb> pXa, PXa<Boolean> pXa2) {
        C7471uYa.b(fdb, "moduleDescriptor");
        C7471uYa.b(ssb, "storageManager");
        C7471uYa.b(pXa, "deferredOwnerModuleDescriptor");
        C7471uYa.b(pXa2, "isAdditionalBuiltInsFeatureSupported");
        this.p = fdb;
        this.j = BVa.a(pXa);
        this.k = BVa.a(pXa2);
        this.l = a(ssb);
        this.m = ssb.a((PXa<? extends T>) new C7407tcb<Object>(this, ssb));
        this.n = ssb.a();
        this.o = ssb.a((PXa<? extends T>) new C4842Dcb<Object>(this));
    }

    private final Etb d() {
        return (Etb) Rsb.a(this.m, (Object) this, a[2]);
    }

    /* access modifiers changed from: private */
    public final C7757yhb d(C5029Jcb jcb) {
        if (C5301Sbb.a(jcb) || !C5301Sbb.e((C5272Rcb) jcb)) {
            return null;
        }
        C7487unb d2 = C7148pqb.d(jcb);
        if (!d2.c()) {
            return null;
        }
        C7280rnb a2 = this.i.a(d2);
        if (a2 != null) {
            C7349snb a3 = a2.a();
            if (a3 != null) {
                C7471uYa.a((Object) a3, "j2kClassMap.mapKotlinToJ…leFqName() ?: return null");
                C5029Jcb a4 = C5419Wcb.a(f(), a3, Ffb.FROM_BUILTINS);
                if (!(a4 instanceof C7757yhb)) {
                    a4 = null;
                }
                return (C7757yhb) a4;
            }
        }
        return null;
    }

    private final C6723jeb e() {
        return (C6723jeb) Rsb.a(this.o, (Object) this, a[3]);
    }

    /* access modifiers changed from: private */
    public final C6450fdb f() {
        C7744yVa yva = this.j;
        DZa dZa = a[0];
        return (C6450fdb) yva.getValue();
    }

    private final boolean g() {
        C7744yVa yva = this.k;
        DZa dZa = a[1];
        return ((Boolean) yva.getValue()).booleanValue();
    }

    public Collection<C7706xtb> b(C5029Jcb jcb) {
        C7471uYa.b(jcb, "classDescriptor");
        C7487unb d2 = C7148pqb.d(jcb);
        if (h.b(d2)) {
            Etb d3 = d();
            C7471uYa.a((Object) d3, "cloneableType");
            return C6918mWa.b((T[]) new C7706xtb[]{d3, this.l});
        } else if (h.a(d2)) {
            return C6850lWa.a(this.l);
        } else {
            return C6918mWa.a();
        }
    }

    private final C7706xtb a(Ssb ssb) {
        Neb neb = new Neb(new C7476ucb(this, this.p, new C7349snb("java.io")), C7694xnb.b("Serializable"), C6314ddb.ABSTRACT, C5060Kcb.INTERFACE, C6850lWa.a(new Atb(ssb, new C7545vcb(this))), C7822zdb.a, false, ssb);
        neb.a(defpackage.Eqb.b.a, SWa.a(), null);
        Etb z = neb.z();
        C7471uYa.a((Object) z, "mockSerializableClass.defaultType");
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0020, code lost:
        if (r2 != null) goto L_0x0027;
     */
    public Set<C7694xnb> c(C5029Jcb jcb) {
        Set<C7694xnb> set;
        C7471uYa.b(jcb, "classDescriptor");
        if (!g()) {
            return SWa.a();
        }
        C7757yhb d2 = d(jcb);
        if (d2 != null) {
            Mhb J = d2.J();
            if (J != null) {
                set = J.a();
            }
        }
        set = SWa.a();
        return set;
    }

    /* JADX WARNING: Removed duplicated region for block: B:47:0x0124  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00af A[SYNTHETIC] */
    public Collection<C7684xdb> a(C7694xnb xnb, C5029Jcb jcb) {
        C7471uYa.b(xnb, "name");
        C7471uYa.b(jcb, "classDescriptor");
        if (C7471uYa.a((Object) xnb, (Object) C6585hcb.e.a()) && (jcb instanceof C6333dsb) && C5301Sbb.b(jcb)) {
            C6333dsb dsb = (C6333dsb) jcb;
            List u = dsb.b().u();
            C7471uYa.a((Object) u, "classDescriptor.classProto.functionList");
            boolean z = false;
            if (!(u instanceof Collection) || !u.isEmpty()) {
                Iterator it = u.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Blb blb = (Blb) it.next();
                    Emb e2 = dsb.a().e();
                    C7471uYa.a((Object) blb, "functionProto");
                    if (C7471uYa.a((Object) Drb.b(e2, blb.o()), (Object) C6585hcb.e.a())) {
                        z = true;
                        break;
                    }
                }
            }
            if (z) {
                return C6918mWa.a();
            }
            return C6850lWa.a(a(dsb, (C7684xdb) C7676xWa.m(d().ha().a(xnb, Ffb.FROM_BUILTINS))));
        } else if (!g()) {
            return C6918mWa.a();
        } else {
            Collection<C7684xdb> a2 = a(jcb, (_Xa<? super Eqb, ? extends Collection<? extends C7684xdb>>) new C7752ycb<Object,Object>(xnb));
            ArrayList arrayList = new ArrayList();
            for (C7684xdb xdb : a2) {
                C5272Rcb e3 = xdb.e();
                if (e3 != null) {
                    C5582adb a3 = xdb.a(C4873Ecb.a((C5029Jcb) e3, jcb).c());
                    if (a3 != null) {
                        defpackage.C5582adb.a x = ((C7684xdb) a3).x();
                        x.a((C5272Rcb) jcb);
                        x.a(jcb.O());
                        x.d();
                        int i2 = C7338scb.a[a((C5582adb) xdb).ordinal()];
                        C7684xdb xdb2 = null;
                        if (i2 == 1) {
                            if (!C6382edb.a(jcb)) {
                                C7471uYa.a((Object) x.b(), "setHiddenForResolutionEverywhereBesideSupercalls()");
                            }
                            if (xdb2 != null) {
                            }
                        } else if (i2 != 2) {
                            if (i2 != 3) {
                            }
                            if (xdb2 != null) {
                                arrayList.add(xdb2);
                            }
                        } else {
                            C7471uYa.a((Object) x.a(e()), "setAdditionalAnnotations(notConsideredDeprecation)");
                        }
                        C5582adb build = x.build();
                        if (build != null) {
                            xdb2 = (C7684xdb) build;
                            if (xdb2 != null) {
                            }
                        } else {
                            C7471uYa.a();
                            throw null;
                        }
                    } else {
                        throw new OVa("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.SimpleFunctionDescriptor");
                    }
                } else {
                    throw new OVa("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                }
            }
            return arrayList;
        }
    }

    private final Collection<C7684xdb> a(C5029Jcb jcb, _Xa<? super Eqb, ? extends Collection<? extends C7684xdb>> _xa) {
        boolean z;
        C7757yhb d2 = d(jcb);
        if (d2 == null) {
            return C6918mWa.a();
        }
        Collection<C5029Jcb> a2 = this.i.a(C7148pqb.c(d2), C6653icb.p.a());
        C5029Jcb jcb2 = (C5029Jcb) C7676xWa.j((Iterable<? extends T>) a2);
        if (jcb2 == null) {
            return C6918mWa.a();
        }
        defpackage.Gvb.b bVar = Gvb.b;
        ArrayList arrayList = new ArrayList(C6986nWa.a((Iterable<? extends T>) a2, 10));
        for (C5029Jcb c2 : a2) {
            arrayList.add(C7148pqb.c(c2));
        }
        Gvb a3 = bVar.a(arrayList);
        boolean c3 = this.i.c(jcb);
        Eqb J = ((C5029Jcb) this.n.a(C7148pqb.c(d2), new C7614wcb(d2, jcb2))).J();
        C7471uYa.a((Object) J, "fakeJavaClassDescriptor.unsubstitutedMemberScope");
        Iterable iterable = (Iterable) _xa.invoke(J);
        ArrayList arrayList2 = new ArrayList();
        for (Object next : iterable) {
            C7684xdb xdb = (C7684xdb) next;
            boolean z2 = false;
            if (xdb.g() == defpackage.C4935Gcb.a.DECLARATION && xdb.d().b() && !C5301Sbb.d((C5272Rcb) xdb)) {
                Collection j2 = xdb.j();
                C7471uYa.a((Object) j2, "analogueMember.overriddenDescriptors");
                if (!(j2 instanceof Collection) || !j2.isEmpty()) {
                    Iterator it = j2.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        C5582adb adb = (C5582adb) it.next();
                        C7471uYa.a((Object) adb, "it");
                        C5272Rcb e2 = adb.e();
                        C7471uYa.a((Object) e2, "it.containingDeclaration");
                        if (a3.contains(C7148pqb.c(e2))) {
                            z = true;
                            break;
                        }
                    }
                }
                z = false;
                if (!z && !a(xdb, c3)) {
                    z2 = true;
                }
            }
            if (z2) {
                arrayList2.add(next);
            }
        }
        return arrayList2;
    }

    private final C7684xdb a(C6333dsb dsb, C7684xdb xdb) {
        defpackage.C5582adb.a x = xdb.x();
        x.a((C5272Rcb) dsb);
        x.a(_db.e);
        x.a((C7706xtb) dsb.z());
        x.a(dsb.O());
        C5582adb build = x.build();
        if (build != null) {
            return (C7684xdb) build;
        }
        C7471uYa.a();
        throw null;
    }

    private final boolean a(C7684xdb xdb, boolean z) {
        C5272Rcb e2 = xdb.e();
        if (e2 != null) {
            if (z ^ e.contains(Lkb.a.a((C5029Jcb) e2, Hkb.a(xdb, false, false, 3, null)))) {
                return true;
            }
            Boolean a2 = C7227qvb.a((Collection<N>) C6850lWa.a(xdb), (defpackage.C7227qvb.b<N>) C4780Bcb.a, (_Xa<N, Boolean>) new C4811Ccb<N,Boolean>(this));
            C7471uYa.a((Object) a2, "DFS.ifAny<CallableMember…lassDescriptor)\n        }");
            return a2.booleanValue();
        }
        throw new OVa("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
    }

    private final b a(C5582adb adb) {
        C5272Rcb e2 = adb.e();
        if (e2 != null) {
            C5029Jcb jcb = (C5029Jcb) e2;
            String a2 = Hkb.a(adb, false, false, 3, null);
            GYa gYa = new GYa();
            gYa.a = null;
            Object a3 = C7227qvb.a((Collection<N>) C6850lWa.a(jcb), (defpackage.C7227qvb.b<N>) new C7821zcb<N>(this), (c<N, R>) new C4749Acb<N,R>(a2, gYa));
            C7471uYa.a(a3, "DFS.dfs<ClassDescriptor,…CONSIDERED\n            })");
            return (b) a3;
        }
        throw new OVa("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x004e A[SYNTHETIC] */
    public Collection<C4997Icb> a(C5029Jcb jcb) {
        String str;
        boolean z;
        boolean z2;
        C5029Jcb jcb2 = jcb;
        C7471uYa.b(jcb2, "classDescriptor");
        if (jcb.g() != C5060Kcb.CLASS || !g()) {
            return C6918mWa.a();
        }
        C7757yhb d2 = d(jcb);
        if (d2 == null) {
            return C6918mWa.a();
        }
        C5029Jcb a2 = C6721jcb.a(this.i, C7148pqb.c(d2), C6653icb.p.a(), null, 4, null);
        if (a2 == null) {
            return C6918mWa.a();
        }
        _tb c2 = C4873Ecb.a(a2, d2).c();
        C7683xcb xcb = new C7683xcb(c2);
        List i2 = d2.i();
        ArrayList<C4997Icb> arrayList = new ArrayList<>();
        Iterator it = i2.iterator();
        while (true) {
            str = "javaConstructor";
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            C4997Icb icb = (C4997Icb) next;
            C7471uYa.a((Object) icb, str);
            if (icb.d().b()) {
                Collection i3 = a2.i();
                C7471uYa.a((Object) i3, "defaultKotlinVersion.constructors");
                if (!(i3 instanceof Collection) || !i3.isEmpty()) {
                    Iterator it2 = i3.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        C4997Icb icb2 = (C4997Icb) it2.next();
                        C7471uYa.a((Object) icb2, "it");
                        if (xcb.a(icb2, icb)) {
                            z2 = false;
                            break;
                        }
                    }
                    if (z2 && !a((C5242Qcb) icb, jcb2) && !C5301Sbb.d((C5272Rcb) icb) && !f.contains(Lkb.a.a((C5029Jcb) d2, Hkb.a(icb, false, false, 3, null)))) {
                        z = true;
                        if (z) {
                            arrayList.add(next);
                        }
                    }
                }
                z2 = true;
                z = true;
                if (z) {
                }
            }
            z = false;
            if (z) {
            }
        }
        ArrayList arrayList2 = new ArrayList(C6986nWa.a((Iterable<? extends T>) arrayList, 10));
        for (C4997Icb icb3 : arrayList) {
            defpackage.C5582adb.a x = icb3.x();
            x.a((C5272Rcb) jcb2);
            x.a((C7706xtb) jcb.z());
            x.d();
            x.a(c2.a());
            Set<String> set = g;
            Lkb lkb = Lkb.a;
            C7471uYa.a((Object) icb3, str);
            if (!set.contains(lkb.a((C5029Jcb) d2, Hkb.a(icb3, false, false, 3, null)))) {
                x.a(e());
            }
            C5582adb build = x.build();
            if (build != null) {
                arrayList2.add((C4997Icb) build);
            } else {
                throw new OVa("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassConstructorDescriptor");
            }
        }
        return arrayList2;
    }

    public boolean a(C5029Jcb jcb, C7684xdb xdb) {
        C7471uYa.b(jcb, "classDescriptor");
        C7471uYa.b(xdb, "functionDescriptor");
        C7757yhb d2 = d(jcb);
        if (d2 == null || !xdb.getAnnotations().b(C7685xeb.a())) {
            return true;
        }
        boolean z = false;
        if (!g()) {
            return false;
        }
        String a2 = Hkb.a(xdb, false, false, 3, null);
        Mhb J = d2.J();
        C7694xnb name = xdb.getName();
        C7471uYa.a((Object) name, "functionDescriptor.name");
        Collection a3 = J.a(name, (Dfb) Ffb.FROM_BUILTINS);
        if (!(a3 instanceof Collection) || !a3.isEmpty()) {
            Iterator it = a3.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (C7471uYa.a((Object) Hkb.a((C7684xdb) it.next(), false, false, 3, null), (Object) a2)) {
                        z = true;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        return z;
    }

    private final boolean a(C5242Qcb qcb, C5029Jcb jcb) {
        if (qcb.f().size() == 1) {
            List f2 = qcb.f();
            C7471uYa.a((Object) f2, "valueParameters");
            Object j2 = C7676xWa.j(f2);
            C7471uYa.a(j2, "valueParameters.single()");
            C5122Mcb c2 = ((C5061Kdb) j2).getType().za().c();
            if (C7471uYa.a((Object) c2 != null ? C7148pqb.d(c2) : null, (Object) C7148pqb.d(jcb))) {
                return true;
            }
        }
        return false;
    }
}
