package com.soundcloud.android.settings.privacy;

import android.content.Context;

/* renamed from: com.soundcloud.android.settings.privacy.j reason: case insensitive filesystem */
/* compiled from: AdvertisingSettingsPresenter.kt */
public final class C5979j implements C6968nEa {
    private final UPa a = new UPa();
    /* access modifiers changed from: private */
    public final C4655rja b;
    /* access modifiers changed from: private */
    public final Context c;
    /* access modifiers changed from: private */
    public final C3129mM d;

    public C5979j(C4655rja rja, Context context, C3129mM mMVar) {
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

    public final void a(C5981l lVar) {
        C7471uYa.b(lVar, "view");
        UPa uPa = this.a;
        IPa e = this.d.e();
        C5250Qua a2 = C5250Qua.a(new C5975f(this, lVar));
        e.c(a2);
        uPa.a(a2, lVar.Ua().f((C6776kQa<? super T>) new C5976g<Object>(this)), lVar.Va().c((C7118pQa<? super T, ? extends EPa<? extends R>>) new C5977h<Object,Object>(this)).f((C6776kQa<? super T>) C5978i.a));
    }

    public final void a() {
        this.a.b();
    }
}
