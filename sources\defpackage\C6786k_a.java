package defpackage;

/* renamed from: k_a reason: default package and case insensitive filesystem */
/* compiled from: KCallableImpl.kt */
final class C6786k_a extends C7540vYa implements PXa<C5120Mab> {
    final /* synthetic */ C6922m_a a;

    C6786k_a(C6922m_a m_a) {
        this.a = m_a;
        super(0);
    }

    public final C5120Mab d() {
        C7706xtb a2 = this.a.i().a();
        if (a2 != null) {
            C7471uYa.a((Object) a2, "descriptor.returnType!!");
            return new C5120Mab(a2, new C6718j_a(this));
        }
        C7471uYa.a();
        throw null;
    }
}
