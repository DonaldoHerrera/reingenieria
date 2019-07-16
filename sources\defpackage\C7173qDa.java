package defpackage;

import com.soundcloud.android.tracks.F.e;

/* renamed from: qDa reason: default package and case insensitive filesystem */
/* compiled from: DownloadedMediaStreamsStorage.kt */
final class C7173qDa extends C7540vYa implements PXa<RVa> {
    final /* synthetic */ C7242rDa a;

    C7173qDa(C7242rDa rda) {
        this.a = rda;
        super(0);
    }

    public final void d() {
        e eVar = new e(this.a.a.a.a(), a.b);
        for (a aVar : this.a.b) {
            eVar.a(aVar.d(), aVar.b(), aVar.c(), aVar.a());
            this.a.a.a.a("DownloadedMediaStreams", (Yd) eVar);
        }
    }
}
