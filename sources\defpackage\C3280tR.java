package defpackage;

import com.soundcloud.android.sync.SyncJobResult;

/* renamed from: tR reason: default package and case insensitive filesystem */
/* compiled from: FollowingStateProvider.kt */
final class C3280tR<T, R> implements C7118pQa<T, EPa<? extends R>> {
    final /* synthetic */ C3360xR a;

    C3280tR(C3360xR xRVar) {
        this.a = xRVar;
    }

    /* renamed from: a */
    public final C6713jVa<C3400zR> apply(SyncJobResult syncJobResult) {
        C7471uYa.b(syncJobResult, "it");
        return this.a.a;
    }
}
