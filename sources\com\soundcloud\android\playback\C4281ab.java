package com.soundcloud.android.playback;

import com.soundcloud.android.foundation.playqueue.PlaySessionSource;
import com.soundcloud.android.foundation.playqueue.o;
import java.util.Arrays;

/* renamed from: com.soundcloud.android.playback.ab reason: case insensitive filesystem */
/* compiled from: PlayQueueExtenderOperations.kt */
public class C4281ab {
    private final efa a;
    /* access modifiers changed from: private */
    public final C3768fea b;
    private final HPa c;

    public C4281ab(efa efa, C3768fea fea, HPa hPa) {
        C7471uYa.b(efa, "apiClientRx");
        C7471uYa.b(fea, "trackWriter");
        C7471uYa.b(hPa, "scheduler");
        this.a = efa;
        this.b = fea;
        this.c = hPa;
    }

    public IPa<o> a(C3508cda cda, boolean z, PlaySessionSource playSessionSource) {
        C7471uYa.b(cda, "seedTrack");
        C7471uYa.b(playSessionSource, "playSessionSource");
        IPa<o> e = a(cda, z).e(new _a(cda, z, playSessionSource));
        C7471uYa.a((Object) e, "relatedTracks(seedTrack,…)\n            }\n        }");
        return e;
    }

    public IPa<Qca> a(C3508cda cda, boolean z) {
        C7471uYa.b(cda, "seedTrack");
        Object[] objArr = {cda.M()};
        String format = String.format(C2226PO.RELATED_TRACKS.a(), Arrays.copyOf(objArr, objArr.length));
        C7471uYa.a((Object) format, "java.lang.String.format(this, *args)");
        b c2 = hfa.b(format).c();
        Object[] objArr2 = new Object[1];
        objArr2[0] = z ? "true" : "false";
        IPa<Qca> b2 = this.a.a(c2.a("continuous_play", objArr2).b(), Qca.class).c((C6776kQa<? super T>) new Za<Object>(this)).b(this.c);
        C7471uYa.a((Object) b2, "apiClientRx.mappedRespon…  .subscribeOn(scheduler)");
        return b2;
    }
}
