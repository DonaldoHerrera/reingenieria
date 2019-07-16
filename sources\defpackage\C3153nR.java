package defpackage;

import com.soundcloud.android.sync.na;

/* renamed from: nR reason: default package and case insensitive filesystem */
/* compiled from: FollowingOperations.kt */
final class C3153nR<T, R> implements C7118pQa<T, MPa<? extends R>> {
    final /* synthetic */ C3240rR a;
    final /* synthetic */ boolean b;
    final /* synthetic */ C3508cda c;

    C3153nR(C3240rR rRVar, boolean z, C3508cda cda) {
        this.a = rRVar;
        this.b = z;
        this.c = cda;
    }

    /* renamed from: a */
    public final IPa<C3900waa> apply(Long l) {
        C7471uYa.b(l, "followingCount");
        return this.a.e.a(na.MY_FOLLOWINGS).e(new C3134mR(this, l));
    }
}
