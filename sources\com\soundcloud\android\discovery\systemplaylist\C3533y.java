package com.soundcloud.android.discovery.systemplaylist;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.soundcloud.android.discovery.systemplaylist.y reason: case insensitive filesystem */
/* compiled from: SystemPlaylistItemMapper.kt */
final class C3533y<T, R> implements C7118pQa<T, R> {
    public static final C3533y a = new C3533y();

    C3533y() {
    }

    /* renamed from: a */
    public final List<C3508cda> apply(List<C3509cea> list) {
        C7471uYa.b(list, "tracks");
        ArrayList arrayList = new ArrayList(C6986nWa.a((Iterable) list, 10));
        for (C3509cea y : list) {
            arrayList.add(y.y());
        }
        return arrayList;
    }
}
