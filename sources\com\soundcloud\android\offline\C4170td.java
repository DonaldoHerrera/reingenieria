package com.soundcloud.android.offline;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.soundcloud.android.offline.td reason: case insensitive filesystem */
/* compiled from: OfflineContentOperations.kt */
final class C4170td<T, R> implements C7118pQa<T, R> {
    public static final C4170td a = new C4170td();

    C4170td() {
    }

    /* renamed from: a */
    public final List<C3508cda> apply(List<? extends C3863rda> list) {
        C7471uYa.b(list, "playlists");
        ArrayList arrayList = new ArrayList(C6986nWa.a((Iterable) list, 10));
        for (C3863rda a2 : list) {
            arrayList.add(a2.a());
        }
        return arrayList;
    }
}
