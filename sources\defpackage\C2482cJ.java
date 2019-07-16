package defpackage;

/* renamed from: cJ reason: default package and case insensitive filesystem */
/* compiled from: OMAdViewabilityController.kt */
final class C2482cJ extends C7540vYa implements _Xa<C1948BI, RVa> {
    final /* synthetic */ C3050iJ a;
    final /* synthetic */ float b;

    C2482cJ(C3050iJ iJVar, float f) {
        this.a = iJVar;
        this.b = f;
        super(1);
    }

    public final void a(C1948BI bi) {
        C7471uYa.b(bi, "sessionData");
        this.a.a("Track video ad start", bi);
        this.a.b.a(bi, this.b, 1.0f);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((C1948BI) obj);
        return RVa.a;
    }
}
