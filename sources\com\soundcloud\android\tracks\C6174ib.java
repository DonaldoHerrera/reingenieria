package com.soundcloud.android.tracks;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: com.soundcloud.android.tracks.ib reason: case insensitive filesystem */
/* compiled from: TrackStorage.kt */
final class C6174ib<T, R> implements C7118pQa<T, R> {
    final /* synthetic */ C6177jb a;

    C6174ib(C6177jb jbVar) {
        this.a = jbVar;
    }

    /* renamed from: a */
    public final List<C3509cea> apply(List<C5631bLa> list) {
        C7471uYa.b(list, "results");
        ArrayList arrayList = new ArrayList();
        for (C5631bLa bla : list) {
            Ya ya = this.a.a;
            C7471uYa.a((Object) bla, "r");
            C7331sWa.a((Collection) arrayList, (Iterable) ya.a(bla));
        }
        return arrayList;
    }
}
