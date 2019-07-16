package defpackage;

import com.soundcloud.android.tracks.C6149aa.e;

/* renamed from: IDa reason: default package and case insensitive filesystem */
/* compiled from: MediaStreamsStorage.kt */
final class C4983IDa extends C7540vYa implements PXa<RVa> {
    final /* synthetic */ C4797CDa a;
    final /* synthetic */ Iterable b;

    C4983IDa(C4797CDa cDa, Iterable iterable) {
        this.a = cDa;
        this.b = iterable;
        super(0);
    }

    public final void d() {
        e eVar = new e(this.a.a.a(), b.b);
        for (a aVar : this.b) {
            eVar.a(aVar.b(), aVar.a());
            this.a.a.a("MediaStreams", (Yd) eVar);
        }
    }
}
