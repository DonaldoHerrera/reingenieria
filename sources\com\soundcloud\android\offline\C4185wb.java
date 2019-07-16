package com.soundcloud.android.offline;

import java.util.Map.Entry;

/* renamed from: com.soundcloud.android.offline.wb reason: case insensitive filesystem */
/* compiled from: DefaultOfflinePropertiesProvider.kt */
final class C4185wb<T, R> implements C7118pQa<T, R> {
    final /* synthetic */ Entry a;

    C4185wb(Entry entry) {
        this.a = entry;
    }

    /* renamed from: a */
    public final HVa<C3823mda, C3508cda> apply(C3508cda cda) {
        C7471uYa.b(cda, "urn");
        return NVa.a(this.a.getKey(), cda);
    }
}
