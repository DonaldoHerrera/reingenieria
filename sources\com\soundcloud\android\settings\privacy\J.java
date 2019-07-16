package com.soundcloud.android.settings.privacy;

import android.content.Context;

/* compiled from: CommunicationsSettingsPresenter.kt */
public final class J implements C6968nEa {
    private final UPa a = new UPa();
    /* access modifiers changed from: private */
    public final C4655rja b;
    /* access modifiers changed from: private */
    public final Context c;
    /* access modifiers changed from: private */
    public final C3129mM d;

    public J(C4655rja rja, Context context, C3129mM mMVar) {
        C7471uYa.b(rja, "navigator");
        C7471uYa.b(context, "context");
        C7471uYa.b(mMVar, "privacySettingsOperations");
        this.b = rja;
        this.c = context;
        this.d = mMVar;
    }

    public void create() {
        a.a(this);
    }

    public void destroy() {
        a.b(this);
    }

    public final void a(L l) {
        C7471uYa.b(l, "view");
        UPa uPa = this.a;
        IPa b2 = this.d.b();
        C5250Qua a2 = C5250Qua.a(new F(this, l));
        b2.c(a2);
        uPa.a(a2, l.Ua().f((C6776kQa<? super T>) new G<Object>(this)), (VPa) l.Va().c((C7118pQa<? super T, ? extends EPa<? extends R>>) new H<Object,Object>(this)).c(C5220Pua.a((C6776kQa<T>) I.a)));
    }

    public final void a() {
        this.a.b();
    }
}
