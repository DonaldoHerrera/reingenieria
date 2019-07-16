package com.soundcloud.android.tracks;

import java.util.ArrayList;
import java.util.Collection;

/* compiled from: TrackStorageWriter.kt */
public class Eb implements C4618nga<Yda>, C3768fea {
    private final Ya a;
    private final WV b;
    private final C4643qga c;
    private final C5014JDa d;
    private final HPa e;

    public Eb(Ya ya, WV wv, C4643qga qga, C5014JDa jDa, HPa hPa) {
        C7471uYa.b(ya, "trackStorage");
        C7471uYa.b(wv, "timeToLiveStorage");
        C7471uYa.b(qga, "timeToLiveStrategy");
        C7471uYa.b(jDa, "mediaStreamsStorageWriter");
        C7471uYa.b(hPa, "scheduler");
        this.a = ya;
        this.b = wv;
        this.c = qga;
        this.d = jDa;
        this.e = hPa;
    }

    /* access modifiers changed from: private */
    public void c(Iterable<Yda> iterable) {
        C5014JDa jDa = this.d;
        ArrayList arrayList = new ArrayList(C6986nWa.a(iterable, 10));
        for (Yda yda : iterable) {
            arrayList.add(new C7587wDa(yda.w(), yda.i()));
        }
        jDa.a(arrayList);
    }

    public IPa<Iterable<Yda>> b(Iterable<Yda> iterable) {
        C7471uYa.b(iterable, "apiTracks");
        IPa<Iterable<Yda>> b2 = this.a.a(iterable).e(new yb(iterable)).c((C6776kQa<? super T>) new zb<Object>(this)).c((C6776kQa<? super T>) new Ab<Object>(this)).b(this.e);
        C7471uYa.a((Object) b2, "trackStorage.asyncStoreT…  .subscribeOn(scheduler)");
        return b2;
    }

    public boolean a(Iterable<Yda> iterable) {
        C7471uYa.b(iterable, "apiTracks");
        C6499gLa b2 = this.a.b(iterable);
        if (b2.b()) {
            ArrayList arrayList = new ArrayList(C6986nWa.a(iterable, 10));
            for (Yda a2 : iterable) {
                arrayList.add(a(a2));
            }
            b((Collection<Ufa<Yda>>) arrayList);
            c(iterable);
        }
        return b2.b();
    }

    /* access modifiers changed from: private */
    public void b(Collection<Ufa<Yda>> collection) {
        for (Ufa ufa : collection) {
            this.b.a(((Yda) ufa.b()).w(), ufa.a());
        }
    }

    /* access modifiers changed from: private */
    public Ufa<Yda> a(Yda yda) {
        long a2 = this.c.a();
        Tfa.a(a2);
        return new Ufa<>(yda, a2, null);
    }

    public C6979nPa a(Collection<Ufa<Yda>> collection) {
        C7471uYa.b(collection, "models");
        ArrayList arrayList = new ArrayList(C6986nWa.a((Iterable<? extends T>) collection, 10));
        for (Ufa b2 : collection) {
            arrayList.add((Yda) b2.b());
        }
        C6979nPa b3 = this.a.a((Iterable<Yda>) arrayList).c((C6776kQa<? super T>) new Bb<Object>(this, arrayList)).c((C6776kQa<? super T>) new Cb<Object>(this, collection)).b((C7118pQa<? super T, ? extends C7255rPa>) Db.a);
        C7471uYa.a((Object) b3, "trackStorage.asyncStoreT…          }\n            }");
        return b3;
    }
}
