package com.soundcloud.android.offline;

import java.util.HashMap;
import java.util.List;

/* compiled from: TrackDownloadsStorage.kt */
final /* synthetic */ class Je extends C7402tYa implements _Xa<List<? extends Be>, HashMap<C3508cda, C3823mda>> {
    Je(De de) {
        super(1, de);
    }

    /* renamed from: a */
    public final HashMap<C3508cda, C3823mda> invoke(List<? extends Be> list) {
        C7471uYa.b(list, "p1");
        return ((De) this.c).a(list);
    }

    public final String getName() {
        return "dbModelsToOfflineStates";
    }

    public final C7610wZa h() {
        return HYa.a(De.class);
    }

    public final String j() {
        return "dbModelsToOfflineStates(Ljava/util/List;)Ljava/util/HashMap;";
    }
}
