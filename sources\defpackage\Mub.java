package defpackage;

/* renamed from: Mub reason: default package */
/* compiled from: CapturedTypeApproximation.kt */
final class Mub extends C7540vYa implements _Xa<C6473fub, C6473fub> {
    final /* synthetic */ Oub a;

    Mub(Oub oub) {
        this.a = oub;
        super(1);
    }

    /* renamed from: a */
    public final C6473fub invoke(C6473fub fub) {
        C7471uYa.b(fub, "variance");
        return fub == this.a.c().pa() ? C6473fub.INVARIANT : fub;
    }
}
