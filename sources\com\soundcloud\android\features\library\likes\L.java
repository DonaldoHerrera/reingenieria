package com.soundcloud.android.features.library.likes;

import com.soundcloud.android.likes.la;
import com.soundcloud.android.tracks.C6185ma;
import java.util.List;

/* compiled from: TrackLikesPresenter.kt */
final class L<T, R> implements C7118pQa<T, EPa<? extends R>> {
    final /* synthetic */ z a;

    L(z zVar) {
        this.a = zVar;
    }

    /* renamed from: a */
    public final APa<? extends List<la>> apply(List<? extends C6185ma> list) {
        C7471uYa.b(list, "model");
        return this.a.a(list);
    }
}
