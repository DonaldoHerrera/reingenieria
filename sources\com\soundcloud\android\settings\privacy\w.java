package com.soundcloud.android.settings.privacy;

import android.content.Context;

/* compiled from: AnalyticsSettingsPresenter.kt */
public final class w implements C6968nEa {
    private final UPa a = new UPa();
    /* access modifiers changed from: private */
    public final C4655rja b;
    /* access modifiers changed from: private */
    public final Context c;
    /* access modifiers changed from: private */
    public final C3129mM d;

    public w(C4655rja rja, Context context, C3129mM mMVar) {
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

    public final void a(y yVar) {
        C7471uYa.b(yVar, "view");
        UPa uPa = this.a;
        IPa a2 = this.d.a();
        C5250Qua a3 = C5250Qua.a(new s(this, yVar));
        a2.c(a3);
        uPa.a(a3, yVar.Ua().f((C6776kQa<? super T>) new t<Object>(this)), (VPa) yVar.Va().c((C7118pQa<? super T, ? extends EPa<? extends R>>) new u<Object,Object>(this)).c(C5220Pua.a((C6776kQa<T>) v.a)));
    }

    public final void a() {
        this.a.b();
    }
}
