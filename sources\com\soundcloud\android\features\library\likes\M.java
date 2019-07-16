package com.soundcloud.android.features.library.likes;

import com.soundcloud.android.likes.V;
import com.soundcloud.android.likes.la;
import java.util.ArrayList;
import java.util.List;

/* compiled from: TrackLikesPresenter.kt */
final class M<T, R> implements C7118pQa<T, R> {
    final /* synthetic */ z a;
    final /* synthetic */ boolean b;

    M(z zVar, boolean z) {
        this.a = zVar;
        this.b = z;
    }

    /* renamed from: a */
    public final List<la> apply(List<? extends la> list) {
        C7471uYa.b(list, "model");
        if (this.b) {
            ArrayList arrayList = new ArrayList();
            for (Object next : list) {
                if (next instanceof V) {
                    arrayList.add(next);
                }
            }
            if (!arrayList.isEmpty()) {
                this.a.f().accept(arrayList);
            }
        }
        return list;
    }
}
