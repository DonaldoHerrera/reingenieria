package com.soundcloud.android.collection.playhistory;

import com.soundcloud.android.tracks.C6185ma;
import java.util.List;

/* compiled from: PlayHistoryOperations.kt */
final class ia<T, R> implements C7118pQa<T, EPa<? extends R>> {
    final /* synthetic */ Z a;
    final /* synthetic */ boolean b;
    final /* synthetic */ int c;

    ia(Z z, boolean z2, int i) {
        this.a = z;
        this.b = z2;
        this.c = i;
    }

    /* renamed from: a */
    public final APa<List<C6185ma>> apply(List<C3508cda> list) {
        C7471uYa.b(list, "trackList");
        return this.a.h.a(list, this.b).a((EPa<? extends U>) this.a.i.c().f(C2779ga.a).g(), (C6504gQa<? super T, ? super U, ? extends R>) new ha<Object,Object,Object>(this, list));
    }
}
