package com.soundcloud.android.tracks;

import java.util.ArrayList;
import java.util.Collection;

/* compiled from: TrackStorageWriter.kt */
final class Ab<T> implements C6776kQa<Iterable<? extends Yda>> {
    final /* synthetic */ Eb a;

    Ab(Eb eb) {
        this.a = eb;
    }

    /* renamed from: a */
    public final void accept(Iterable<Yda> iterable) {
        Eb eb = this.a;
        C7471uYa.a((Object) iterable, "it");
        ArrayList arrayList = new ArrayList(C6986nWa.a(iterable, 10));
        for (Yda a2 : iterable) {
            arrayList.add(this.a.a(a2));
        }
        eb.b((Collection<Ufa<Yda>>) arrayList);
    }
}
