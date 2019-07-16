package defpackage;

import com.soundcloud.android.sync.SyncJobResult;

/* renamed from: pFa reason: default package and case insensitive filesystem */
/* compiled from: DefaultUserRepository.kt */
final class C7107pFa<T, R> implements C7118pQa<T, C7669xPa<? extends R>> {
    final /* synthetic */ C7728yFa a;
    final /* synthetic */ C3508cda b;

    C7107pFa(C7728yFa yfa, C3508cda cda) {
        this.a = yfa;
        this.b = cda;
    }

    /* renamed from: a */
    public final C7531vPa<C3784hea> apply(SyncJobResult syncJobResult) {
        C7471uYa.b(syncJobResult, "it");
        return this.a.a.a(this.b);
    }
}
