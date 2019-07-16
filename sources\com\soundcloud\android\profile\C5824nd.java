package com.soundcloud.android.profile;

/* renamed from: com.soundcloud.android.profile.nd reason: case insensitive filesystem */
/* compiled from: UserProfileOperations.kt */
final class C5824nd<T, R> implements C7118pQa<T, MPa<? extends R>> {
    final /* synthetic */ Lc a;

    C5824nd(Lc lc) {
        this.a = lc;
    }

    /* renamed from: a */
    public final IPa<C2035FP> apply(C2035FP fp) {
        C7471uYa.b(fp, "profileInfo");
        return this.a.c.a(RWa.a(fp.c())).e(new C5819md(fp));
    }
}
