package defpackage;

import java.util.List;

/* renamed from: ghb reason: default package and case insensitive filesystem */
/* compiled from: LazyJavaPackageFragmentProvider.kt */
public final class C6522ghb implements C6858ldb {
    /* access modifiers changed from: private */
    public final C6590hhb a;
    private final Fsb<C7349snb, Rhb> b = this.a.e().a();

    public C6522ghb(_gb _gb) {
        C7471uYa.b(_gb, "components");
        this.a = new C6590hhb(_gb, a.a, CVa.a(null));
    }

    private final Rhb b(C7349snb snb) {
        Xib a2 = this.a.a().d().a(snb);
        if (a2 != null) {
            return (Rhb) this.b.a(snb, new C6454fhb(this, a2));
        }
        return null;
    }

    public List<Rhb> a(C7349snb snb) {
        C7471uYa.b(snb, "fqName");
        return C6918mWa.b((Object) b(snb));
    }

    public List<C7349snb> a(C7349snb snb, _Xa<? super C7694xnb, Boolean> _xa) {
        C7471uYa.b(snb, "fqName");
        C7471uYa.b(_xa, "nameFilter");
        Rhb b2 = b(snb);
        List<C7349snb> ua = b2 != null ? b2.ua() : null;
        return ua != null ? ua : C6918mWa.a();
    }
}
