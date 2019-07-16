package com.soundcloud.android.offline;

/* renamed from: com.soundcloud.android.offline.bd reason: case insensitive filesystem */
/* compiled from: OfflineContentOperations.kt */
final class C4063bd<T> implements C6776kQa<Id> {
    final /* synthetic */ C4197yd a;

    C4063bd(C4197yd ydVar) {
        this.a = ydVar;
    }

    /* renamed from: a */
    public final void accept(Id id) {
        Qb g = this.a.t;
        StringBuilder sb = new StringBuilder();
        sb.append("OfflineContentUpdates ");
        sb.append(id.c());
        g.a(sb.toString());
    }
}
