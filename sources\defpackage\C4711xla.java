package defpackage;

import android.annotation.SuppressLint;
import com.soundcloud.android.foundation.events.C3707i;
import com.soundcloud.android.foundation.playqueue.r;
import com.soundcloud.android.playback.C4431ub;

/* renamed from: xla reason: default package and case insensitive filesystem */
/* compiled from: PeripheralsControllerProxy.kt */
public final class C4711xla {
    @SuppressLint({"sc.MissingCompositeDisposableRecycle"})
    private final UPa a = new UPa();
    private final C5327TLa b;
    private final C7054oVa<C4675tla> c;
    private final r d;

    public C4711xla(C5327TLa tLa, C7054oVa<C4675tla> ova, r rVar) {
        C7471uYa.b(tLa, "eventBus");
        C7471uYa.b(ova, "controller");
        C7471uYa.b(rVar, "playQueueUpdates");
        this.b = tLa;
        this.c = ova;
        this.d = rVar;
    }

    public final C7054oVa<C4675tla> a() {
        return this.c;
    }

    public final void b() {
        UPa uPa = this.a;
        C5327TLa tLa = this.b;
        C5443XLa<C3707i> xLa = C3876taa.i;
        C7471uYa.a((Object) xLa, "EventQueue.CURRENT_USER_CHANGED");
        XUa.a(uPa, tLa.a(xLa, (C6776kQa<E>) new C4684ula<E>(this)));
        UPa uPa2 = this.a;
        C5327TLa tLa2 = this.b;
        C5443XLa<C4431ub> xLa2 = C3876taa.b;
        C7471uYa.a((Object) xLa2, "EventQueue.PLAYBACK_STATE_CHANGED");
        XUa.a(uPa2, tLa2.a(xLa2, (C6776kQa<E>) new C4693vla<E>(this)));
        UPa uPa3 = this.a;
        VPa f = this.d.a().f((C6776kQa<? super T>) new C4702wla<Object>(this));
        C7471uYa.a((Object) f, "playQueueUpdates.current…urrentPlayQueueItem(it) }");
        XUa.a(uPa3, f);
    }
}
