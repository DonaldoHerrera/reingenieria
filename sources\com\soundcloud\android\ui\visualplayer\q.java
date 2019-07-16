package com.soundcloud.android.ui.visualplayer;

import com.soundcloud.android.foundation.playqueue.F;
import com.soundcloud.android.tracks.C6185ma;
import com.soundcloud.android.ui.visualplayer.c.C0175c;
import com.soundcloud.android.ui.visualplayer.c.a;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: VisualPlayerPresenter.kt */
final class q<T, R> implements C7118pQa<T, R> {
    final /* synthetic */ List a;

    q(List list) {
        this.a = list;
    }

    /* renamed from: a */
    public final List<c> apply(Map<C3508cda, ? extends C6185ma> map) {
        Object obj;
        C7471uYa.b(map, "tracksByUrn");
        List<com.soundcloud.android.foundation.playqueue.q> list = this.a;
        C7471uYa.a((Object) list, "tracksAndAds");
        ArrayList arrayList = new ArrayList(C6986nWa.a((Iterable<? extends T>) list, 10));
        for (com.soundcloud.android.foundation.playqueue.q qVar : list) {
            C7471uYa.a((Object) qVar, "playQueueItem");
            if (qVar.j() && (qVar instanceof F)) {
                C3508cda c = ((F) qVar).c();
                C7471uYa.a((Object) c, "playQueueItem.urn");
                obj = new C0175c((C6185ma) LWa.b(map, c));
            } else if (qVar.e()) {
                obj = new a(qVar);
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Cannot display item ");
                sb.append(qVar);
                throw new j(sb.toString());
            }
            arrayList.add(obj);
        }
        return arrayList;
    }
}
