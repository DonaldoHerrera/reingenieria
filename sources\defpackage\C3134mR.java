package defpackage;

import com.soundcloud.android.sync.ia;

/* renamed from: mR reason: default package and case insensitive filesystem */
/* compiled from: FollowingOperations.kt */
final class C3134mR<T, R> implements C7118pQa<T, R> {
    final /* synthetic */ C3153nR a;
    final /* synthetic */ Long b;

    C3134mR(C3153nR nRVar, Long l) {
        this.a = nRVar;
        this.b = l;
    }

    /* renamed from: a */
    public final C3900waa apply(ia iaVar) {
        C7471uYa.b(iaVar, "it");
        C3153nR nRVar = this.a;
        String str = "followingCount";
        if (nRVar.b) {
            C3508cda cda = nRVar.c;
            Long l = this.b;
            C7471uYa.a((Object) l, str);
            return C3900waa.a(cda, l.longValue());
        }
        C3508cda cda2 = nRVar.c;
        Long l2 = this.b;
        C7471uYa.a((Object) l2, str);
        return C3900waa.b(cda2, l2.longValue());
    }
}
