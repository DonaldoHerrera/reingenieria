package com.soundcloud.android.ui.visualplayer;

import com.google.common.base.Predicate;
import com.soundcloud.android.foundation.playqueue.p;
import com.soundcloud.android.foundation.playqueue.q;
import com.soundcloud.android.tracks.Ca;
import java.util.ArrayList;
import java.util.List;

/* compiled from: VisualPlayerPresenter.kt */
final class s<T, R> implements C7118pQa<T, EPa<? extends R>> {
    final /* synthetic */ t a;

    s(t tVar) {
        this.a = tVar;
    }

    /* renamed from: a */
    public final APa<List<c>> apply(p pVar) {
        String str = "it";
        C7471uYa.b(pVar, str);
        List a2 = this.a.m.a((Predicate<q>) r.a);
        C7471uYa.a((Object) a2, "tracksAndAds");
        ArrayList<q> arrayList = new ArrayList<>();
        for (Object next : a2) {
            q qVar = (q) next;
            C7471uYa.a((Object) qVar, str);
            if (qVar.j()) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(C6986nWa.a((Iterable<? extends T>) arrayList, 10));
        for (q qVar2 : arrayList) {
            C7471uYa.a((Object) qVar2, str);
            arrayList2.add(qVar2.c());
        }
        return Ca.a(this.a.n, arrayList2, false, 2, null).h(new q(a2));
    }
}
