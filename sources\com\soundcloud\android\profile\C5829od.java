package com.soundcloud.android.profile;

/* renamed from: com.soundcloud.android.profile.od reason: case insensitive filesystem */
/* compiled from: UserProfileOperations.kt */
final class C5829od<T> implements C6776kQa<C2035FP> {
    final /* synthetic */ Lc a;

    C5829od(Lc lc) {
        this.a = lc;
    }

    /* renamed from: a */
    public final void accept(C2035FP fp) {
        C5327TLa a2 = this.a.f;
        C5443XLa<C3498bba> xLa = C3876taa.r;
        C7471uYa.a((Object) xLa, "EventQueue.USER_CHANGED");
        C7471uYa.a((Object) fp, "userProfileInfo");
        C3776gea c = fp.c();
        C7471uYa.a((Object) c, "userProfileInfo.user");
        a2.c(xLa, C3498bba.a(C3775gda.a(c)));
    }
}
