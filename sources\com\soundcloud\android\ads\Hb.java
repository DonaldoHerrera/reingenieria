package com.soundcloud.android.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.soundcloud.android.foundation.ads.C3678e;
import com.soundcloud.android.foundation.ads.aa;
import com.soundcloud.android.foundation.events.C3700b;
import com.soundcloud.android.foundation.events.I;
import com.soundcloud.android.foundation.events.J;
import com.soundcloud.android.playback.C4431ub;
import com.soundcloud.android.playback.ke.b;
import com.soundcloud.lightcycle.DefaultActivityLightCycle;
import java.lang.ref.WeakReference;

/* compiled from: FullScreenVideoPresenter */
class Hb extends DefaultActivityLightCycle<AppCompatActivity> implements a {
    private final Jb a;
    private final C2645ya b;
    private final Ga c;
    private final C5694cGa d;
    private final C5327TLa e;
    private final C3700b f;
    private final I g;
    private final gd h;
    private final C3678e i;
    private final C4655rja j;
    private final Yaa k;
    private C4928GKa<aa> l = C4928GKa.a();
    private VPa m = C4881Eua.b();
    /* access modifiers changed from: private */
    public WeakReference<Activity> n;

    /* compiled from: FullScreenVideoPresenter */
    private class a extends C5037Jua<defpackage.C3431IZ.a> {
        private a() {
        }

        public void a(defpackage.C3431IZ.a aVar) {
            if (Hb.this.x()) {
                Hb hb = Hb.this;
                hb.a((Activity) hb.n.get(), aVar);
            }
        }
    }

    Hb(Jb jb, C3678e eVar, Ga ga, gd gdVar, C5694cGa cga, C2645ya yaVar, C5327TLa tLa, C3700b bVar, Yaa yaa, C4655rja rja) {
        this.f = bVar;
        this.j = rja;
        jb.b((a) this);
        this.a = jb;
        this.b = yaVar;
        this.c = ga;
        this.d = cga;
        this.e = tLa;
        this.h = gdVar;
        this.k = yaa;
        this.i = eVar;
        this.g = new I(Yca.VIDEO_FULLSCREEN.a(), true);
    }

    /* access modifiers changed from: private */
    public boolean x() {
        WeakReference<Activity> weakReference = this.n;
        return (weakReference == null || weakReference.get() == null) ? false : true;
    }

    public /* synthetic */ void c(aa aaVar) {
        this.a.a(aaVar.I(), b.FULLSCREEN);
    }

    public /* synthetic */ void d(aa aaVar) {
        this.e.c(C3876taa.h, new c(this.d.b(), -1, aaVar));
    }

    public void s() {
        if (x()) {
            ((Activity) this.n.get()).finish();
        }
    }

    public void w() {
        this.l.a((C7733yKa<? super T>) new C2605o<Object>(this));
    }

    /* renamed from: b */
    public void onCreate(AppCompatActivity appCompatActivity, Bundle bundle) {
        Bundle extras = appCompatActivity.getIntent().getExtras();
        String str = "EXTRA_AD_URN";
        if (extras.containsKey(str)) {
            this.l = this.b.a();
            this.n = new WeakReference<>(appCompatActivity);
            a(C5526_Ha.b(extras, str), appCompatActivity);
            return;
        }
        appCompatActivity.finish();
    }

    /* renamed from: c */
    public void onResume(AppCompatActivity appCompatActivity) {
        this.l.a((C7733yKa<? super T>) new C2601n<Object>(this));
        this.m = (VPa) this.e.a(C3876taa.h).a((C7256rQa<? super T>) C2578ha.a).a(defpackage.C3431IZ.a.class).c(new a());
    }

    private void a(C3508cda cda, AppCompatActivity appCompatActivity) {
        if (!this.l.c() || !((aa) this.l.b()).f().equals(cda)) {
            appCompatActivity.finish();
            return;
        }
        aa aaVar = (aa) this.l.b();
        a(aaVar, true);
        this.a.a(appCompatActivity, aaVar);
        this.c.a(aaVar.I()).a((C7733yKa<? super T>) new C2597m<Object>(this, appCompatActivity));
        this.f.a((J) C3416DZ.b(aaVar, this.k, this.g));
    }

    /* renamed from: b */
    public void onPause(AppCompatActivity appCompatActivity) {
        this.h.g();
        this.m.dispose();
    }

    public /* synthetic */ void b(aa aaVar, Long l2) {
        this.i.d(aaVar.I(), l2.longValue());
    }

    /* access modifiers changed from: private */
    public void a(Activity activity, defpackage.C3431IZ.a aVar) {
        C4431ub j2 = aVar.j();
        if (j2.r()) {
            activity.finish();
        } else {
            this.a.a(j2);
        }
    }

    public void b(Context context) {
        this.l.a((C7733yKa<? super T>) new r<Object>(this));
    }

    public /* synthetic */ void b(aa aaVar) {
        this.j.a(C4621nja.a(aaVar.c()));
        this.f.a((J) C3416DZ.a(aaVar, this.k, this.g));
    }

    /* renamed from: a */
    public void onDestroy(AppCompatActivity appCompatActivity) {
        this.l.a((C7733yKa<? super T>) new C2593l<Object>(this));
    }

    public /* synthetic */ void a(aa aaVar) {
        a(aaVar, false);
        this.a.a(b.FULLSCREEN);
        this.f.a((J) C3416DZ.d(aaVar, this.k, this.g));
        this.l = C4928GKa.a();
    }

    public /* synthetic */ void a(aa aaVar, Long l2) {
        this.i.e(aaVar.I(), l2.longValue());
    }

    private void a(aa aaVar, boolean z) {
        if (z) {
            this.b.b(aaVar).a((C7733yKa<? super T>) new C2609p<Object>(this, aaVar));
        } else {
            this.b.b(aaVar).a((C7733yKa<? super T>) new C2613q<Object>(this, aaVar));
        }
    }
}
