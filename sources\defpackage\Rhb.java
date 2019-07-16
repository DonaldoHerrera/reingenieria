package defpackage;

import java.util.List;
import java.util.Map;

/* renamed from: Rhb reason: default package */
/* compiled from: LazyJavaPackageFragment.kt */
public final class Rhb extends C6928mfb {
    static final /* synthetic */ DZa[] f = {HYa.a((DYa) new EYa(HYa.a(Rhb.class), "binaryClasses", "getBinaryClasses$descriptors_jvm()Ljava/util/Map;")), HYa.a((DYa) new EYa(HYa.a(Rhb.class), "partToFacade", "getPartToFacade()Ljava/util/HashMap;"))};
    /* access modifiers changed from: private */
    public final C6590hhb g;
    private final Psb h = this.g.e().a((PXa<? extends T>) new Ohb<Object>(this));
    private final C7412thb i = new C7412thb(this.g, this.m, this);
    private final Psb<List<C7349snb>> j = this.g.e().a(new Qhb(this), C6918mWa.a());
    private final C6723jeb k;
    private final Psb l;
    /* access modifiers changed from: private */
    public final Xib m;

    public Rhb(C6590hhb hhb, Xib xib) {
        C6723jeb jeb;
        C7471uYa.b(hhb, "outerContext");
        C7471uYa.b(xib, "jPackage");
        super(hhb.d(), xib.q());
        this.m = xib;
        this.g = Zgb.a(hhb, (C5091Lcb) this, (C5588ajb) null, 0, 6, (Object) null);
        if (this.g.a().a().a()) {
            jeb = C6723jeb.c.a();
        } else {
            jeb = C6386ehb.a(this.g, this.m);
        }
        this.k = jeb;
        this.l = this.g.e().a((PXa<? extends T>) new Phb<Object>(this));
    }

    public C6723jeb getAnnotations() {
        return this.k;
    }

    public C7822zdb getSource() {
        return new Ekb(this);
    }

    public final Map<String, Dkb> ta() {
        return (Map) Rsb.a(this.h, (Object) this, f[0]);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Lazy Java package fragment: ");
        sb.append(q());
        return sb.toString();
    }

    public final List<C7349snb> ua() {
        return (List) this.j.d();
    }

    public final C5029Jcb a(Kib kib) {
        C7471uYa.b(kib, "jClass");
        return this.i.c().a(kib);
    }

    public C7412thb ha() {
        return this.i;
    }
}
