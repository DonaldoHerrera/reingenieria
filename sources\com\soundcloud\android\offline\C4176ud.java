package com.soundcloud.android.offline;

import java.util.List;

/* renamed from: com.soundcloud.android.offline.ud reason: case insensitive filesystem */
/* compiled from: OfflineContentOperations.kt */
final /* synthetic */ class C4176ud extends C7402tYa implements _Xa<List<C3508cda>, C6979nPa> {
    C4176ud(Gd gd) {
        super(1, gd);
    }

    /* renamed from: a */
    public final C6979nPa invoke(List<C3508cda> list) {
        return ((Gd) this.c).e(list);
    }

    public final String getName() {
        return "resetOfflinePlaylists";
    }

    public final C7610wZa h() {
        return HYa.a(Gd.class);
    }

    public final String j() {
        return "resetOfflinePlaylists(Ljava/util/List;)Lio/reactivex/Completable;";
    }
}
