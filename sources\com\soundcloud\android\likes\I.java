package com.soundcloud.android.likes;

import com.soundcloud.android.sync.SyncJobResult;
import java.util.List;

/* compiled from: TrackLikeOperations.kt */
final class I<T, R> implements C7118pQa<T, MPa<? extends R>> {
    final /* synthetic */ C4001z a;

    /* renamed from: a */
    public final IPa<List<C3987k>> apply(SyncJobResult syncJobResult) {
        C7471uYa.b(syncJobResult, "it");
        return this.a.a(Long.MAX_VALUE);
    }
}
