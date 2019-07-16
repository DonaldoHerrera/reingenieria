package com.soundcloud.android.accounts;

import androidx.appcompat.app.AppCompatActivity;
import com.soundcloud.android.playback.C4412qb;
import com.soundcloud.lightcycle.DefaultActivityLightCycle;

/* compiled from: LoggedInController.kt */
public final class A extends DefaultActivityLightCycle<AppCompatActivity> {
    private VPa a = C4881Eua.b();
    private final Ica b;
    /* access modifiers changed from: private */
    public final C2526g c;
    /* access modifiers changed from: private */
    public final C4412qb d;
    private final HPa e;
    private final HPa f;

    public A(Ica ica, C2526g gVar, C4412qb qbVar, HPa hPa, HPa hPa2) {
        C7471uYa.b(ica, "sessionProvider");
        C7471uYa.b(gVar, "accountOperations");
        C7471uYa.b(qbVar, "playSessionController");
        C7471uYa.b(hPa, "scheduler");
        C7471uYa.b(hPa2, "mainThreadScheduler");
        this.b = ica;
        this.c = gVar;
        this.d = qbVar;
        this.e = hPa;
        this.f = hPa2;
    }

    /* renamed from: a */
    public void onPause(AppCompatActivity appCompatActivity) {
        C7471uYa.b(appCompatActivity, "host");
        this.a.dispose();
        super.onPause(appCompatActivity);
    }

    /* renamed from: b */
    public void onResume(AppCompatActivity appCompatActivity) {
        C7471uYa.b(appCompatActivity, "activity");
        VPa c2 = this.b.a().a((C7256rQa<? super T>) y.a).b(this.e).a(this.f).c((C6776kQa<? super T>) new z<Object>(this, appCompatActivity));
        C7471uYa.a((Object) c2, "sessionProvider.isUserLo…inish()\n                }");
        this.a = c2;
    }
}
