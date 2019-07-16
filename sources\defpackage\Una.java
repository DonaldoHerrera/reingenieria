package defpackage;

/* renamed from: Una reason: default package */
/* compiled from: ViewPlaybackStateEmitter.kt */
final class Una<T1, T2, R> implements C6504gQa<a, Mna, Nna> {
    final /* synthetic */ Ona a;
    final /* synthetic */ Ina b;

    Una(Ona ona, Ina ina) {
        this.a = ona;
        this.b = ina;
    }

    /* renamed from: a */
    public final Nna apply(a aVar, Mna mna) {
        C7471uYa.b(aVar, "combinedProgresses");
        C7471uYa.b(mna, "scrubState");
        Ona ona = this.a;
        return ona.a(this.b, mna, ona.a(aVar, mna), aVar.a().e());
    }
}
