package defpackage;

import com.soundcloud.android.tracks.C6149aa.c;

/* renamed from: DDa reason: default package and case insensitive filesystem */
/* compiled from: MediaStreamsStorage.kt */
final class C4828DDa extends C7540vYa implements PXa<RVa> {
    final /* synthetic */ C4797CDa a;
    final /* synthetic */ Iterable b;

    C4828DDa(C4797CDa cDa, Iterable iterable) {
        this.a = cDa;
        this.b = iterable;
        super(0);
    }

    public final void d() {
        c cVar = new c(this.a.a.a(), b.b);
        for (C3508cda a2 : this.b) {
            cVar.a(a2);
            this.a.a.c("MediaStreams", (Yd) cVar);
        }
    }
}
