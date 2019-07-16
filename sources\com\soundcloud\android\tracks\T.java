package com.soundcloud.android.tracks;

import java.util.ArrayList;
import java.util.List;

/* compiled from: LegacyTrackWriter.kt */
public class T implements C3768fea {
    /* access modifiers changed from: private */
    public final C5014JDa a;
    private final Ya b;

    public T(C5014JDa jDa, Ya ya) {
        C7471uYa.b(jDa, "mediaStreamsStorageWriter");
        C7471uYa.b(ya, "trackStorage");
        this.a = jDa;
        this.b = ya;
    }

    /* access modifiers changed from: private */
    public List<C7587wDa> c(Iterable<Yda> iterable) {
        ArrayList arrayList = new ArrayList(C6986nWa.a(iterable, 10));
        for (Yda yda : iterable) {
            arrayList.add(new C7587wDa(yda.w(), yda.i()));
        }
        return arrayList;
    }

    public IPa<Iterable<Yda>> b(Iterable<Yda> iterable) {
        C7471uYa.b(iterable, "apiTracks");
        IPa<Iterable<Yda>> e = this.b.a(iterable).c((C6776kQa<? super T>) new Q<Object>(this, iterable)).e(new S(iterable));
        C7471uYa.a((Object) e, "trackStorage.asyncStoreT…       .map { apiTracks }");
        return e;
    }

    public boolean a(Iterable<Yda> iterable) {
        C7471uYa.b(iterable, "apiTracks");
        if (!this.b.b(iterable).b()) {
            return false;
        }
        this.a.a(c(iterable));
        return true;
    }
}
