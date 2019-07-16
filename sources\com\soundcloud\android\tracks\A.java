package com.soundcloud.android.tracks;

import com.soundcloud.android.sync.SyncJobResult;

/* compiled from: DefaultTrackRepository.kt */
final class A<T, R> implements C7118pQa<T, R> {
    public static final A a = new A();

    A() {
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
