package defpackage;

/* renamed from: mab reason: default package and case insensitive filesystem */
/* compiled from: KParameterImpl.kt */
public final class C6923mab implements CZa {
    static final /* synthetic */ DZa[] a = {HYa.a((DYa) new EYa(HYa.a(C6923mab.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/ParameterDescriptor;")), HYa.a((DYa) new EYa(HYa.a(C6923mab.class), "annotations", "getAnnotations()Ljava/util/List;"))};
    private final a b;
    private final a c = C5300Sab.b(new C6787kab(this));
    private final C6922m_a<?> d;
    private final int e;
    private final a f;

    public C6923mab(C6922m_a<?> m_a, int i, a aVar, PXa<? extends C7201qdb> pXa) {
        C7471uYa.b(m_a, "callable");
        C7471uYa.b(aVar, "kind");
        C7471uYa.b(pXa, "computeDescriptor");
        this.d = m_a;
        this.e = i;
        this.f = aVar;
        this.b = C5300Sab.b(pXa);
    }

    /* access modifiers changed from: private */
    public final C7201qdb c() {
        return (C7201qdb) this.b.a(this, a[0]);
    }

    public int b() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C6923mab) {
            C6923mab mab = (C6923mab) obj;
            if (C7471uYa.a((Object) this.d, (Object) mab.d) && C7471uYa.a((Object) c(), (Object) mab.c())) {
                return true;
            }
        }
        return false;
    }

    public a g() {
        return this.f;
    }

    public String getName() {
        C7201qdb c2 = c();
        String str = null;
        if (!(c2 instanceof C5061Kdb)) {
            c2 = null;
        }
        C5061Kdb kdb = (C5061Kdb) c2;
        if (kdb != null) {
            if (kdb.e().o()) {
                return null;
            }
            C7694xnb name = kdb.getName();
            C7471uYa.a((Object) name, "valueParameter.name");
            if (!name.c()) {
                str = name.a();
            }
        }
        return str;
    }

    public HZa getType() {
        C7706xtb type = c().getType();
        C7471uYa.a((Object) type, "descriptor.type");
        return new C5120Mab(type, new C6855lab(this));
    }

    public boolean h() {
        C7201qdb c2 = c();
        if (!(c2 instanceof C5061Kdb)) {
            c2 = null;
        }
        C5061Kdb kdb = (C5061Kdb) c2;
        if (kdb != null) {
            return C7148pqb.a(kdb);
        }
        return false;
    }

    public int hashCode() {
        return (this.d.hashCode() * 31) + c().hashCode();
    }

    public String toString() {
        return C5475Yab.b.a(this);
    }

    public final C6922m_a<?> a() {
        return this.d;
    }
}
