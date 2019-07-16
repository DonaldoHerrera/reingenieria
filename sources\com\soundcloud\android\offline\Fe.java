package com.soundcloud.android.offline;

import java.util.List;

/* compiled from: TrackDownloadsStorage.kt */
final /* synthetic */ class Fe extends C7402tYa implements _Xa<List<? extends C3508cda>, IPa<List<? extends Be>>> {
    Fe(De de) {
        super(1, de);
    }

    /* renamed from: a */
    public final IPa<List<Be>> invoke(List<C3508cda> list) {
        C7471uYa.b(list, "p1");
        return ((De) this.c).b(list);
    }

    public final String getName() {
        return "getOfflineStateBatch";
    }

    public final C7610wZa h() {
        return HYa.a(De.class);
    }

    public final String j() {
        return "getOfflineStateBatch(Ljava/util/List;)Lio/reactivex/Single;";
    }
}
