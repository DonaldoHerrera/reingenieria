package defpackage;

/* renamed from: S_a reason: default package */
/* compiled from: KDeclarationContainerImpl.kt */
public final class S_a extends Reb<C6922m_a<?>, RVa> {
    final /* synthetic */ N_a a;

    S_a(N_a n_a) {
        this.a = n_a;
    }

    public /* bridge */ /* synthetic */ Object a(C5242Qcb qcb, Object obj) {
        a(qcb, (RVa) obj);
        throw null;
    }

    public C6922m_a<?> a(C7408tdb tdb, RVa rVa) {
        C7471uYa.b(tdb, "descriptor");
        C7471uYa.b(rVa, "data");
        return this.a.a(tdb);
    }

    public C6922m_a<?> a(C5582adb adb, RVa rVa) {
        C7471uYa.b(adb, "descriptor");
        C7471uYa.b(rVa, "data");
        return new W_a(this.a, adb);
    }

    public C6922m_a<?> a(C5242Qcb qcb, RVa rVa) {
        C7471uYa.b(qcb, "descriptor");
        C7471uYa.b(rVa, "data");
        StringBuilder sb = new StringBuilder();
        sb.append("No constructors should appear in this scope: ");
        sb.append(qcb);
        throw new IllegalStateException(sb.toString());
    }
}
