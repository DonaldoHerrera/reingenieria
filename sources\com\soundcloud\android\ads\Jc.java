package com.soundcloud.android.ads;

/* compiled from: PlayerVideoAdsController.kt */
final class Jc<T, R> implements C7118pQa<T, R> {
    public static final Jc a = new Jc();

    Jc() {
    }

    public final boolean a(Pda<C3509cea> pda) {
        C7471uYa.b(pda, "singleItemResponse");
        if (pda instanceof b) {
            return ((C3509cea) ((b) pda).a()).m();
        }
        if (pda instanceof a) {
            return ((C3509cea) ((a) pda).a()).m();
        }
        if (pda instanceof c) {
            return false;
        }
        throw new FVa();
    }

    public /* bridge */ /* synthetic */ Object apply(Object obj) {
        return Boolean.valueOf(a((Pda) obj));
    }
}
