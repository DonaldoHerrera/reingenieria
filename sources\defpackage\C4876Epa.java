package defpackage;

import com.soundcloud.android.sync.SyncJobResult;

/* renamed from: Epa reason: default package and case insensitive filesystem */
/* compiled from: DefaultPlaylistRepository.kt */
final class C4876Epa<T, R> implements C7118pQa<T, R> {
    public static final C4876Epa a = new C4876Epa();

    C4876Epa() {
    }

    /* renamed from: a */
    public final MV apply(SyncJobResult syncJobResult) {
        C7471uYa.b(syncJobResult, "it");
        b bVar = b.a;
        if (bVar != null) {
            return bVar;
        }
        throw new OVa("null cannot be cast to non-null type com.soundcloud.android.data.FetchResult");
    }
}
