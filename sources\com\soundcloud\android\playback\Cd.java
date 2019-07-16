package com.soundcloud.android.playback;

import com.soundcloud.android.playback.C4527xd.d;
import com.soundcloud.android.playback.Id.b;

/* compiled from: StreamSelector.kt */
final class Cd<T, R> implements C7118pQa<T, R> {
    final /* synthetic */ C4527xd a;
    final /* synthetic */ C3509cea b;

    Cd(C4527xd xdVar, C3509cea cea) {
        this.a = xdVar;
        this.b = cea;
    }

    /* renamed from: a */
    public final b apply(b bVar) {
        C7471uYa.b(bVar, "it");
        if (bVar.b() == null || bVar.a() == null) {
            C3469VY a2 = this.a.k;
            StringBuilder sb = new StringBuilder();
            sb.append("Could not select urls for track ");
            sb.append(this.b.y());
            sb.append(": ");
            sb.append(bVar);
            a.a(a2, new d(sb.toString()), null, 2, null);
            return this.a.c(this.b);
        }
        b a3 = SDb.a("StreamSelector");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Selected urls from payload: ");
        sb2.append(bVar);
        a3.a(sb2.toString(), new Object[0]);
        String a4 = this.a.c.a(bVar.b().d());
        C7471uYa.a((Object) a4, "streamUrlBuilder.appendQ…it.progressiveStream.url)");
        C4308fd fdVar = new C4308fd(a4, bVar.b().a().b(), bVar.b().b(), bVar.b().c(), this.a.a(bVar.b()));
        String a5 = this.a.b.a(bVar.a().d());
        C7471uYa.a((Object) a5, "hlsStreamUrlBuilder.appe…yParams(it.hlsStream.url)");
        C4308fd fdVar2 = new C4308fd(a5, bVar.a().a().b(), bVar.a().b(), bVar.a().c(), this.a.a(bVar.a()));
        return new b(fdVar, fdVar2);
    }
}
