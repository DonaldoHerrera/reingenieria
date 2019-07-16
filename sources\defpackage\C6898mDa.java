package defpackage;

import com.soundcloud.android.tracks.F.c;
import com.soundcloud.android.tracks.W;

/* renamed from: mDa reason: default package and case insensitive filesystem */
/* compiled from: DownloadedMediaStreamsStorage.kt */
final class C6898mDa extends C7540vYa implements PXa<RVa> {
    final /* synthetic */ W a;
    final /* synthetic */ Iterable b;

    C6898mDa(W w, Iterable iterable) {
        this.a = w;
        this.b = iterable;
        super(0);
    }

    public final void d() {
        c cVar = new c(this.a.a(), a.b);
        for (C3508cda a2 : this.b) {
            cVar.a(a2);
            this.a.c("DownloadedMediaStreams", (Yd) cVar);
        }
    }
}
