package com.google.android.gms.internal.firebase-perf;

import java.util.AbstractMap.SimpleImmutableEntry;
import java.util.Map.Entry;

/* renamed from: com.google.android.gms.internal.firebase-perf.c reason: case insensitive filesystem */
final class C0823c extends ud<Entry<K, V>> {
    private final /* synthetic */ C0828d c;

    C0823c(C0828d dVar) {
        this.c = dVar;
    }

    public final /* synthetic */ Object get(int i) {
        Db.a(i, this.c.f);
        Object[] b = this.c.d;
        int i2 = i * 2;
        C0828d dVar = this.c;
        Object obj = b[i2];
        Object[] b2 = dVar.d;
        C0828d dVar2 = this.c;
        return new SimpleImmutableEntry(obj, b2[i2 + 1]);
    }

    public final int size() {
        return this.c.f;
    }
}
