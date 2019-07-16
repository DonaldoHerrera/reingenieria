package defpackage;

import com.soundcloud.android.likes.C3989m;
import java.util.List;

/* renamed from: SS reason: default package and case insensitive filesystem */
/* compiled from: MyPlaylistsUniflowOperations.kt */
public class C2287SS {
    private final C5327TLa a;
    private final C3989m b;
    /* access modifiers changed from: private */
    public final C1938AS c;

    public C2287SS(C5327TLa tLa, C3989m mVar, C1938AS as) {
        C7471uYa.b(tLa, "eventBus");
        C7471uYa.b(mVar, "likesStateProvider");
        C7471uYa.b(as, "myPlaylistBaseOperations");
        this.a = tLa;
        this.b = mVar;
        this.c = as;
    }

    public APa<List<C3863rda>> b(C3871sda sda) {
        C7471uYa.b(sda, "options");
        return a((PXa<? extends APa<List<C3863rda>>>) new C2268RS<Object>(this, sda));
    }

    public APa<List<C3863rda>> a(C3871sda sda) {
        C7471uYa.b(sda, "options");
        return a((PXa<? extends APa<List<C3863rda>>>) new C2173MS<Object>(this, sda));
    }

    private APa<List<C3863rda>> a(PXa<? extends APa<List<C3863rda>>> pXa) {
        C5327TLa tLa = this.a;
        C5443XLa<Jaa> xLa = C3876taa.q;
        C7471uYa.a((Object) xLa, "EventQueue.PLAYLIST_CHANGED");
        APa a2 = tLa.a(xLa).a((C7256rQa<? super T>) C2192NS.a);
        C5327TLa tLa2 = this.a;
        C5443XLa<C3490aba> xLa2 = C3876taa.o;
        C7471uYa.a((Object) xLa2, "EventQueue.URN_STATE_CHANGED");
        APa<List<C3863rda>> d = APa.a((EPa<? extends T>) a2, (EPa<? extends T>) tLa2.a(xLa2).a((C7256rQa<? super T>) C2211OS.a), (EPa<? extends T>) this.b.d()).h(C2230PS.a).e(RVa.a).k(new C2249QS(pXa)).d();
        C7471uYa.a((Object) d, "Observable.merge(\n      …  .distinctUntilChanged()");
        return d;
    }
}
