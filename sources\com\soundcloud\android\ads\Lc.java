package com.soundcloud.android.ads;

/* compiled from: PlayerVideoAdsController.kt */
final class Lc<T, R> implements C7118pQa<T, MPa<? extends R>> {
    final /* synthetic */ Oc a;
    final /* synthetic */ C3508cda b;

    Lc(Oc oc, C3508cda cda) {
        this.a = oc;
        this.b = cda;
    }

    /* renamed from: a */
    public final IPa<Boolean> apply(Boolean bool) {
        C7471uYa.b(bool, "isTimeToPrependAd");
        if (bool.booleanValue()) {
            return this.a.a(this.b);
        }
        IPa<Boolean> a2 = IPa.a(Boolean.valueOf(false));
        C7471uYa.a((Object) a2, "Single.just(false)");
        return a2;
    }
}
