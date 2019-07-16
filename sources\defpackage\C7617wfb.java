package defpackage;

/* renamed from: wfb reason: default package and case insensitive filesystem */
/* compiled from: TypeAliasConstructorDescriptor.kt */
final class C7617wfb extends C7540vYa implements PXa<C7548vfb> {
    final /* synthetic */ C7548vfb a;
    final /* synthetic */ C4997Icb b;

    C7617wfb(C7548vfb vfb, C4997Icb icb) {
        this.a = vfb;
        this.b = icb;
        super(0);
    }

    public final C7548vfb d() {
        Ssb ta = this.a.ta();
        C4874Edb ua = this.a.ua();
        C4997Icb icb = this.b;
        C7548vfb vfb = this.a;
        C6723jeb annotations = icb.getAnnotations();
        a g = this.b.g();
        C7471uYa.a((Object) g, "underlyingConstructorDescriptor.kind");
        C7822zdb source = this.a.ua().getSource();
        C7471uYa.a((Object) source, "typeAliasDescriptor.source");
        C7548vfb vfb2 = new C7548vfb(ta, ua, icb, vfb, annotations, g, source, null);
        _tb a2 = C7548vfb.E.a(this.a.ua());
        if (a2 == null) {
            return null;
        }
        C7615wdb k = this.b.k();
        vfb2.a(null, k != null ? k.a(a2) : null, this.a.ua().B(), this.a.f(), this.a.a(), C6314ddb.FINAL, this.a.ua().d());
        return vfb2;
    }
}
