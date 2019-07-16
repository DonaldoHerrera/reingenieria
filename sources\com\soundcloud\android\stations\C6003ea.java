package com.soundcloud.android.stations;

import com.soundcloud.android.sync.SyncJobResult;

/* renamed from: com.soundcloud.android.stations.ea reason: case insensitive filesystem */
/* compiled from: DefaultStationsRepository.kt */
final class C6003ea<T, R> implements C7118pQa<T, R> {
    public static final C6003ea a = new C6003ea();

    C6003ea() {
    }

    public final boolean a(SyncJobResult syncJobResult) {
        C7471uYa.b(syncJobResult, "it");
        return syncJobResult.f();
    }

    public /* bridge */ /* synthetic */ Object apply(Object obj) {
        return Boolean.valueOf(a((SyncJobResult) obj));
    }
}
