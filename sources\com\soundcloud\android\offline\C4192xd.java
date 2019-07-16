package com.soundcloud.android.offline;

import java.util.Collection;

/* renamed from: com.soundcloud.android.offline.xd reason: case insensitive filesystem */
/* compiled from: OfflineContentOperations.kt */
final class C4192xd<T, R> implements C7118pQa<Collection<C3508cda>, C7255rPa> {
    final /* synthetic */ C4197yd a;

    C4192xd(C4197yd ydVar) {
        this.a = ydVar;
    }

    /* renamed from: a */
    public final C7255rPa apply(Collection<C3508cda> collection) {
        C7471uYa.b(collection, "urns");
        return collection.isEmpty() ? C6979nPa.e() : this.a.f.a(collection).e();
    }
}
