package com.soundcloud.android.features.library.downloads;

import com.soundcloud.android.features.library.downloads.s.b;
import com.soundcloud.android.foundation.playqueue.PlaySessionSource;
import com.soundcloud.android.playback.C4536zc;
import com.soundcloud.android.playback.Db;
import com.soundcloud.android.playback.Db.a;
import java.util.ArrayList;
import java.util.List;

/* compiled from: DownloadsPresenter.kt */
final class C<T, R> implements C7118pQa<T, MPa<? extends R>> {
    final /* synthetic */ E a;

    C(E e) {
        this.a = e;
    }

    /* renamed from: a */
    public final IPa<C4536zc> apply(HVa<? extends s, ? extends List<? extends s>> hVa) {
        C7471uYa.b(hVa, "<name for destructuring parameter 0>");
        s sVar = (s) hVa.a();
        List list = (List) hVa.b();
        ArrayList<s> arrayList = new ArrayList<>();
        for (Object next : list) {
            if (((s) next) instanceof b) {
                arrayList.add(next);
            }
        }
        Db c = this.a.o;
        ArrayList arrayList2 = new ArrayList(C6986nWa.a((Iterable) arrayList, 10));
        for (s a2 : arrayList) {
            arrayList2.add(this.a.a(a2));
        }
        return c.a(new a(arrayList2, arrayList.indexOf(sVar), new PlaySessionSource(Yca.DOWNLOADS)));
    }
}
