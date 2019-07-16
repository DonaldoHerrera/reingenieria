package defpackage;

import java.util.ArrayList;
import java.util.concurrent.Callable;

/* renamed from: ADa reason: default package and case insensitive filesystem */
/* compiled from: MediaStreamsRepository.kt */
public class C4735ADa {
    private final C4797CDa a;
    private final C6830lDa b;
    private final C3760eea c;
    private final HPa d;

    public C4735ADa(C4797CDa cDa, C6830lDa lda, C3760eea eea, HPa hPa) {
        C7471uYa.b(cDa, "mediaStreamsStorage");
        C7471uYa.b(lda, "downloadedMediaStreamsStorage");
        C7471uYa.b(eea, "trackRepository");
        C7471uYa.b(hPa, "scheduler");
        this.a = cDa;
        this.b = lda;
        this.c = eea;
        this.d = hPa;
    }

    /* access modifiers changed from: private */
    public C7531vPa<String> c(C3508cda cda) {
        C7531vPa<String> b2 = this.a.a(cda).b(this.d);
        C7471uYa.a((Object) b2, "mediaStreamsStorage.getP…n).subscribeOn(scheduler)");
        return b2;
    }

    /* access modifiers changed from: private */
    public C7531vPa<String> d(C3508cda cda) {
        C7531vPa<String> a2 = Nda.a(this.c.a(cda, a.SYNCED)).a((C7118pQa<? super T, ? extends C7669xPa<? extends R>>) new C7794zDa<Object,Object>(this, cda));
        C7471uYa.a((Object) a2, "trackRepository.track(ur…{ mediaFromStorage(urn) }");
        return a2;
    }

    public void a() {
        this.a.a();
        this.b.a();
    }

    public C7531vPa<String> b(C3508cda cda) {
        C7471uYa.b(cda, "urn");
        C7531vPa<String> a2 = c(cda).a((C7669xPa<? extends T>) C7531vPa.a((Callable<? extends C7669xPa<? extends T>>) new C7725yDa<Object>(this, cda)));
        C7471uYa.a((Object) a2, "mediaFromStorage(urn)\n  …nLoadMediaStreams(urn) })");
        return a2;
    }

    public C7531vPa<C6762kDa> a(C3508cda cda) {
        C7471uYa.b(cda, "urn");
        C7531vPa<C6762kDa> b2 = this.b.a(cda).f(C7656xDa.a).b(this.d);
        C7471uYa.a((Object) b2, "downloadedMediaStreamsSt…  .subscribeOn(scheduler)");
        return b2;
    }

    public C6979nPa a(Iterable<C6762kDa> iterable) {
        C7471uYa.b(iterable, "mediaStreamEntries");
        C6830lDa lda = this.b;
        ArrayList arrayList = new ArrayList(C6986nWa.a((Iterable) iterable, 10));
        for (C6762kDa kda : iterable) {
            arrayList.add(new a(kda.d(), kda.b(), kda.c(), kda.a()));
        }
        return lda.b(arrayList);
    }
}
