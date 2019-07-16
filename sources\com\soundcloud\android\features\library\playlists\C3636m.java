package com.soundcloud.android.features.library.playlists;

import com.soundcloud.android.features.library.playlists.C3635l.a;
import com.soundcloud.android.features.library.playlists.C3635l.b;
import com.soundcloud.android.features.library.playlists.C3635l.c;
import com.soundcloud.android.features.library.playlists.C3635l.d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: com.soundcloud.android.features.library.playlists.m reason: case insensitive filesystem */
/* compiled from: PlaylistCollectionPresenter.kt */
public class C3636m {
    public List<C3635l> a(List<? extends C3863rda> list, C3871sda sda) {
        List list2;
        C7471uYa.b(list, "playlistItems");
        C7471uYa.b(sda, "options");
        List a = C6850lWa.a(new b(list.size()));
        ArrayList arrayList = new ArrayList(C6986nWa.a((Iterable) list, 10));
        for (C3863rda cVar : list) {
            c cVar2 = new c(cVar, null, null, 6, null);
            arrayList.add(cVar2);
        }
        if (a(sda)) {
            list2 = C6850lWa.a(d.d);
        } else if (arrayList.isEmpty()) {
            list2 = C6850lWa.a(a.d);
        } else {
            list2 = C6918mWa.a();
        }
        return C7676xWa.c((Collection) C7676xWa.c((Collection) a, (Iterable) arrayList), (Iterable) list2);
    }

    private boolean a(C3871sda sda) {
        return sda.b() || (sda.a() && !sda.c()) || (!sda.a() && sda.c());
    }
}
