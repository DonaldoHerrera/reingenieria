package com.soundcloud.android.ads;

import android.app.Activity;
import android.os.Handler;
import androidx.appcompat.app.AppCompatActivity;
import com.soundcloud.android.foundation.ads.C3678e;
import com.soundcloud.android.foundation.ads.aa;
import com.soundcloud.android.foundation.events.C3700b;
import com.soundcloud.android.foundation.events.J;
import com.soundcloud.android.foundation.playqueue.k;
import com.soundcloud.android.foundation.playqueue.q;
import com.soundcloud.android.foundation.playqueue.r;
import com.soundcloud.lightcycle.DefaultActivityLightCycle;
import java.lang.ref.WeakReference;
import java.util.concurrent.TimeUnit;

/* renamed from: com.soundcloud.android.ads.va reason: case insensitive filesystem */
/* compiled from: AdOrientationController */
public class C2633va extends DefaultActivityLightCycle<AppCompatActivity> {
    private static final long a = TimeUnit.SECONDS.toMillis(5);
    /* access modifiers changed from: private */
    public final Na b;
    private final C5327TLa c;
    private final C3700b d;
    private final C6699jHa e;
    private final C3814lca f;
    private final UPa g = new UPa();
    private final Handler h = new Handler();
    private final Yaa i;
    private final C3678e j;
    private final r k;

    /* renamed from: com.soundcloud.android.ads.va$a */
    /* compiled from: AdOrientationController */
    private final class a extends C5037Jua<k> {
        final WeakReference<Activity> d;

        a(Activity activity) {
            this.d = new WeakReference<>(activity);
        }

        public void a(k kVar) {
            Activity activity = (Activity) this.d.get();
            if (activity != null) {
                q b = kVar.b();
                if (b.k()) {
                    a(activity, (com.soundcloud.android.foundation.playqueue.C3719f.b) b);
                } else {
                    a(activity);
                }
            }
        }

        private void a(Activity activity, com.soundcloud.android.foundation.playqueue.C3719f.b bVar) {
            if (bVar.l()) {
                activity.setRequestedOrientation(1);
            }
        }

        private void a(Activity activity) {
            C2633va.this.x();
            activity.setRequestedOrientation(-1);
        }
    }

    /* renamed from: com.soundcloud.android.ads.va$b */
    /* compiled from: AdOrientationController */
    private class b extends C5037Jua<Haa> {
        final WeakReference<Activity> d;

        b(Activity activity) {
            this.d = new WeakReference<>(activity);
        }

        public void a(Haa haa) {
            Activity activity = (Activity) this.d.get();
            if (activity != null && C2633va.this.b.g()) {
                if (haa.i()) {
                    activity.setRequestedOrientation(0);
                } else if (haa.j()) {
                    activity.setRequestedOrientation(1);
                }
            }
        }
    }

    public C2633va(Na na, C5327TLa tLa, C3700b bVar, Yaa yaa, C6699jHa jha, C3814lca lca, C3678e eVar, r rVar) {
        this.b = na;
        this.c = tLa;
        this.d = bVar;
        this.i = yaa;
        this.e = jha;
        this.f = lca;
        this.j = eVar;
        this.k = rVar;
    }

    /* access modifiers changed from: private */
    public void x() {
        this.h.removeCallbacksAndMessages(null);
    }

    private void y() {
        aa aaVar = (aa) this.b.a();
        if (this.e.m()) {
            this.j.b();
            this.d.a((J) C3416DZ.d(aaVar, this.i, this.f.l()));
        } else if (this.e.k()) {
            this.j.c();
            this.d.a((J) C3416DZ.b(aaVar, this.i, this.f.l()));
        }
    }

    /* renamed from: b */
    public void onResume(AppCompatActivity appCompatActivity) {
        if (appCompatActivity.getRequestedOrientation() != -1 && this.b.f()) {
            b((Activity) appCompatActivity);
        }
        this.g.b((VPa) this.c.a(C3876taa.f).c(new b(appCompatActivity)));
        UPa uPa = this.g;
        C2350WH a2 = this.k.a();
        a aVar = new a(appCompatActivity);
        a2.c(aVar);
        uPa.b(aVar);
    }

    /* renamed from: a */
    public void onPause(AppCompatActivity appCompatActivity) {
        if (this.b.g() && appCompatActivity.isChangingConfigurations()) {
            y();
        }
        x();
        this.g.b();
    }

    private void b(Activity activity) {
        this.h.postDelayed(new C2551c(activity), a);
    }
}
