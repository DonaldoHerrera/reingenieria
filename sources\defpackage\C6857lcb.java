package defpackage;

import java.util.Collection;

/* renamed from: lcb reason: default package and case insensitive filesystem */
/* compiled from: JvmBuiltInClassDescriptorFactory.kt */
public final class C6857lcb implements C7547veb {
    static final /* synthetic */ DZa[] a = {HYa.a((DYa) new EYa(HYa.a(C6857lcb.class), "cloneable", "getCloneable()Lorg/jetbrains/kotlin/descriptors/impl/ClassDescriptorImpl;"))};
    /* access modifiers changed from: private */
    public static final C7349snb b = C5301Sbb.b;
    /* access modifiers changed from: private */
    public static final C7694xnb c;
    /* access modifiers changed from: private */
    public static final C7280rnb d;
    public static final a e = new a(null);
    private final Psb f;
    /* access modifiers changed from: private */
    public final C6450fdb g;
    /* access modifiers changed from: private */
    public final _Xa<C6450fdb, C5272Rcb> h;

    /* renamed from: lcb$a */
    /* compiled from: JvmBuiltInClassDescriptorFactory.kt */
    public static final class a {
        private a() {
        }

        public final C7280rnb a() {
            return C6857lcb.d;
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }
    }

    static {
        C7694xnb f2 = C5301Sbb.h.c.f();
        C7471uYa.a((Object) f2, "KotlinBuiltIns.FQ_NAMES.cloneable.shortName()");
        c = f2;
        C7280rnb a2 = C7280rnb.a(C5301Sbb.h.c.h());
        C7471uYa.a((Object) a2, "ClassId.topLevel(KotlinB…NAMES.cloneable.toSafe())");
        d = a2;
    }

    public C6857lcb(Ssb ssb, C6450fdb fdb, _Xa<? super C6450fdb, ? extends C5272Rcb> _xa) {
        C7471uYa.b(ssb, "storageManager");
        C7471uYa.b(fdb, "moduleDescriptor");
        C7471uYa.b(_xa, "computeContainingDeclaration");
        this.g = fdb;
        this.h = _xa;
        this.f = ssb.a((PXa<? extends T>) new C6925mcb<Object>(this, ssb));
    }

    private final Neb d() {
        return (Neb) Rsb.a(this.f, (Object) this, a[0]);
    }

    public /* synthetic */ C6857lcb(Ssb ssb, C6450fdb fdb, _Xa _xa, int i, C7264rYa rya) {
        if ((i & 4) != 0) {
            _xa = C6789kcb.a;
        }
        this(ssb, fdb, _xa);
    }

    public boolean a(C7349snb snb, C7694xnb xnb) {
        C7471uYa.b(snb, "packageFqName");
        C7471uYa.b(xnb, "name");
        return C7471uYa.a((Object) xnb, (Object) c) && C7471uYa.a((Object) snb, (Object) b);
    }

    public C5029Jcb a(C7280rnb rnb) {
        C7471uYa.b(rnb, "classId");
        if (C7471uYa.a((Object) rnb, (Object) d)) {
            return d();
        }
        return null;
    }

    public Collection<C5029Jcb> a(C7349snb snb) {
        C7471uYa.b(snb, "packageFqName");
        if (C7471uYa.a((Object) snb, (Object) b)) {
            return RWa.a(d());
        }
        return SWa.a();
    }
}
