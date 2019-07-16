package com.soundcloud.android.tracks;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@EVa(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u0000 \u00122\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0012B!\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ(\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\r0\f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\u000fH\u0016J\u001e\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\r*\b\u0012\u0004\u0012\u00020\u00030\u0011H\u0012R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/soundcloud/android/tracks/TrackNetworkFetcher;", "Lcom/soundcloud/android/libs/vault/network/NetworkFetcher;", "Lcom/soundcloud/android/foundation/domain/Urn;", "Lcom/soundcloud/android/foundation/domain/tracks/ApiTrack;", "apiClientRx", "Lcom/soundcloud/android/libs/api/ApiClientRx;", "timeToLiveStrategy", "Lcom/soundcloud/android/libs/vault/timetolive/TimeToLiveStrategy;", "scheduler", "Lio/reactivex/Scheduler;", "(Lcom/soundcloud/android/libs/api/ApiClientRx;Lcom/soundcloud/android/libs/vault/timetolive/TimeToLiveStrategy;Lio/reactivex/Scheduler;)V", "fetch", "Lio/reactivex/Single;", "Lcom/soundcloud/android/libs/vault/network/NetworkFetchResult;", "keys", "", "toEnrichedResponse", "Lcom/soundcloud/android/foundation/api/ModelCollection;", "Companion", "base_release"}, mv = {1, 1, 15})
/* compiled from: TrackNetworkFetcher.kt */
public class Ja implements C3961cga<C3508cda, Yda> {
    private static final Ia a = new Ia();
    public static final a b = new a(null);
    private final efa c;
    private final C4643qga d;
    private final HPa e;

    /* compiled from: TrackNetworkFetcher.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }
    }

    public Ja(efa efa, C4643qga qga, HPa hPa) {
        C7471uYa.b(efa, "apiClientRx");
        C7471uYa.b(qga, "timeToLiveStrategy");
        C7471uYa.b(hPa, "scheduler");
        this.c = efa;
        this.d = qga;
        this.e = hPa;
    }

    public IPa<C3953bga<C3508cda, Yda>> a(Set<C3508cda> set) {
        C7471uYa.b(set, "keys");
        b c2 = hfa.c(C2226PO.TRACKS_FETCH.a()).c();
        ArrayList arrayList = new ArrayList(C6986nWa.a((Iterable<? extends T>) set, 10));
        for (C3508cda b2 : set) {
            arrayList.add(b2.b());
        }
        IPa e2 = this.c.a(c2.a((Object) KWa.a(NVa.a("urns", arrayList))).b(), (C4990IKa<T>) a).e(new Ka(this));
        C7471uYa.a((Object) e2, "apiClientRx.mappedRespon…it.toEnrichedResponse() }");
        IPa<C3953bga<C3508cda, Yda>> b3 = SV.a(e2).b(this.e);
        C7471uYa.a((Object) b3, "apiClientRx.mappedRespon…  .subscribeOn(scheduler)");
        return b3;
    }

    /* access modifiers changed from: private */
    public C3953bga<C3508cda, Yda> a(Pca<Yda> pca) {
        List<Yda> f = pca.f();
        C7471uYa.a((Object) f, "collection");
        ArrayList arrayList = new ArrayList(C6986nWa.a((Iterable<? extends T>) f, 10));
        for (Yda yda : f) {
            long a2 = this.d.a();
            Tfa.a(a2);
            arrayList.add(new Ufa(yda, a2, null));
        }
        return new b(new C3945aga(arrayList, C6918mWa.a()));
    }
}
