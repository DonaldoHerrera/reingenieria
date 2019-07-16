package defpackage;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: Shb reason: default package */
/* compiled from: LazyJavaPackageScope.kt */
public final class Shb extends C6795kib {
    private final Qsb<Set<String>> j;
    private final Nsb<a, C5029Jcb> k;
    private final Xib l;
    private final Rhb m;

    /* renamed from: Shb$a */
    /* compiled from: LazyJavaPackageScope.kt */
    private static final class a {
        private final C7694xnb a;
        private final Kib b;

        public a(C7694xnb xnb, Kib kib) {
            C7471uYa.b(xnb, "name");
            this.a = xnb;
            this.b = kib;
        }

        public final Kib a() {
            return this.b;
        }

        public final C7694xnb b() {
            return this.a;
        }

        public boolean equals(Object obj) {
            return (obj instanceof a) && C7471uYa.a((Object) this.a, (Object) ((a) obj).a);
        }

        public int hashCode() {
            return this.a.hashCode();
        }
    }

    /* renamed from: Shb$b */
    /* compiled from: LazyJavaPackageScope.kt */
    private static abstract class b {

        /* renamed from: Shb$b$a */
        /* compiled from: LazyJavaPackageScope.kt */
        public static final class a extends b {
            private final C5029Jcb a;

            public a(C5029Jcb jcb) {
                C7471uYa.b(jcb, "descriptor");
                super(null);
                this.a = jcb;
            }

            public final C5029Jcb a() {
                return this.a;
            }
        }

        /* renamed from: Shb$b$b reason: collision with other inner class name */
        /* compiled from: LazyJavaPackageScope.kt */
        public static final class C0153b extends b {
            public static final C0153b a = new C0153b();

            private C0153b() {
                super(null);
            }
        }

        /* renamed from: Shb$b$c */
        /* compiled from: LazyJavaPackageScope.kt */
        public static final class c extends b {
            public static final c a = new c();

            private c() {
                super(null);
            }
        }

        private b() {
        }

        public /* synthetic */ b(C7264rYa rya) {
            this();
        }
    }

    public Shb(C6590hhb hhb, Xib xib, Rhb rhb) {
        C7471uYa.b(hhb, "c");
        C7471uYa.b(xib, "jPackage");
        C7471uYa.b(rhb, "ownerDescriptor");
        super(hhb);
        this.l = xib;
        this.m = rhb;
        this.j = hhb.e().b((PXa<? extends T>) new Uhb<Object>(this, hhb));
        this.k = hhb.e().a((_Xa<? super K, ? extends V>) new Thb<Object,Object>(this, hhb));
    }

    /* access modifiers changed from: protected */
    public void a(Collection<C7684xdb> collection, C7694xnb xnb) {
        C7471uYa.b(collection, "result");
        C7471uYa.b(xnb, "name");
    }

    public Collection<C7408tdb> c(C7694xnb xnb, Dfb dfb) {
        C7471uYa.b(xnb, "name");
        C7471uYa.b(dfb, "location");
        return C6918mWa.a();
    }

    /* access modifiers changed from: protected */
    public Set<C7694xnb> d(C7700xqb xqb, _Xa<? super C7694xnb, Boolean> _xa) {
        C7471uYa.b(xqb, "kindFilter");
        return SWa.a();
    }

    /* access modifiers changed from: private */
    public final b a(Dkb dkb) {
        if (dkb == null) {
            return C0153b.a;
        }
        if (dkb.a().c() != defpackage.Rkb.a.CLASS) {
            return c.a;
        }
        C5029Jcb b2 = d().a().b().b(dkb);
        return b2 != null ? new a(b2) : C0153b.a;
    }

    public C5029Jcb b(C7694xnb xnb, Dfb dfb) {
        C7471uYa.b(xnb, "name");
        C7471uYa.b(dfb, "location");
        return a(xnb, (Kib) null);
    }

    /* access modifiers changed from: protected */
    public C7205qhb c() {
        return defpackage.C7205qhb.a.a;
    }

    /* access modifiers changed from: protected */
    public Rhb g() {
        return this.m;
    }

    /* access modifiers changed from: protected */
    public Set<C7694xnb> b(C7700xqb xqb, _Xa<? super C7694xnb, Boolean> _xa) {
        C7471uYa.b(xqb, "kindFilter");
        if (!xqb.a(C7700xqb.x.d())) {
            return SWa.a();
        }
        Set<String> set = (Set) this.j.d();
        if (set != null) {
            HashSet hashSet = new HashSet();
            for (String b2 : set) {
                hashSet.add(C7694xnb.b(b2));
            }
            return hashSet;
        }
        Xib xib = this.l;
        if (_xa == null) {
            _xa = C7779yvb.a();
        }
        Collection<Kib> a2 = xib.a(_xa);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Kib kib : a2) {
            C7694xnb name = kib.u() == C6320djb.a ? null : kib.getName();
            if (name != null) {
                linkedHashSet.add(name);
            }
        }
        return linkedHashSet;
    }

    /* access modifiers changed from: protected */
    public Set<C7694xnb> c(C7700xqb xqb, _Xa<? super C7694xnb, Boolean> _xa) {
        C7471uYa.b(xqb, "kindFilter");
        return SWa.a();
    }

    private final C5029Jcb a(C7694xnb xnb, Kib kib) {
        if (!C7832znb.a(xnb)) {
            return null;
        }
        Set set = (Set) this.j.d();
        if (kib != null || set == null || set.contains(xnb.a())) {
            return (C5029Jcb) this.k.invoke(new a(xnb, kib));
        }
        return null;
    }

    public final C5029Jcb a(Kib kib) {
        C7471uYa.b(kib, "javaClass");
        return a(kib.getName(), kib);
    }

    public Collection<C5272Rcb> a(C7700xqb xqb, _Xa<? super C7694xnb, Boolean> _xa) {
        C7471uYa.b(xqb, "kindFilter");
        C7471uYa.b(_xa, "nameFilter");
        return a(xqb, _xa, (Dfb) Ffb.WHEN_GET_ALL_DESCRIPTORS);
    }
}
