package com.soundcloud.android.search.history;

import android.annotation.SuppressLint;
import com.soundcloud.android.foundation.events.C3707i;

/* compiled from: SearchHistoryStorageProxy.kt */
public final class G {
    @SuppressLint({"sc.MissingCompositeDisposableRecycle"})
    private final UPa a = new UPa();
    private final C5327TLa b;
    /* access modifiers changed from: private */
    public final C4806CMa<A> c;
    private final HPa d;

    public G(C5327TLa tLa, C4806CMa<A> cMa, HPa hPa) {
        C7471uYa.b(tLa, "eventBus");
        C7471uYa.b(cMa, "searchHistoryStorage");
        C7471uYa.b(hPa, "scheduler");
        this.b = tLa;
        this.c = cMa;
        this.d = hPa;
    }

    public final void b() {
        UPa uPa = this.a;
        VPa g = C6979nPa.b((C6368eQa) new F(this)).b(this.d).g();
        C7471uYa.a((Object) g, "Completable.fromAction {…\n            .subscribe()");
        XUa.a(uPa, g);
    }

    public final void a() {
        UPa uPa = this.a;
        C5327TLa tLa = this.b;
        C5443XLa<C3707i> xLa = C3876taa.i;
        C7471uYa.a((Object) xLa, "EventQueue.CURRENT_USER_CHANGED");
        VPa f = tLa.a(xLa).a((C7256rQa<? super T>) D.a).f((C6776kQa<? super T>) new E<Object>(this));
        C7471uYa.a((Object) f, "eventBus.queue(EventQueu…ryStorage.get().clear() }");
        XUa.a(uPa, f);
    }
}
