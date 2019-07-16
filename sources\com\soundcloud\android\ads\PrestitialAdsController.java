package com.soundcloud.android.ads;

import android.content.Intent;
import com.soundcloud.android.foundation.ads.C3676c;
import com.soundcloud.android.foundation.events.C3700b;
import com.soundcloud.android.foundation.events.J;
import com.soundcloud.android.main.RootActivity;
import com.soundcloud.android.playback.C4416rb;
import com.soundcloud.lightcycle.ActivityLightCycleDispatcher;

public class PrestitialAdsController extends ActivityLightCycleDispatcher<RootActivity> {
    private final Yb a;
    private final gd b;
    private final Na c;
    private final C4416rb d;
    /* access modifiers changed from: private */
    public final C4655rja e;
    private final C2571fb f;
    /* access modifiers changed from: private */
    public final C3700b g;
    private VPa h = C4881Eua.b();
    /* access modifiers changed from: private */
    public C4928GKa<C3676c> i = C4928GKa.a();

    private class a extends C5005Iua<C3676c> {
        private final String d;

        a(String str) {
            this.d = str;
        }

        /* renamed from: a */
        public void onSuccess(C3676c cVar) {
            C3410BZ a = C3410BZ.a(cVar.f(), this.d, C4928GKa.c(cVar.k()));
            PrestitialAdsController.this.i = C4928GKa.c(cVar);
            PrestitialAdsController.this.g.a((J) a);
            PrestitialAdsController.this.e.a(C4621nja.u());
        }
    }

    PrestitialAdsController(Yb yb, gd gdVar, Na na, C4416rb rbVar, C4655rja rja, C2571fb fbVar, C3700b bVar) {
        this.a = yb;
        this.b = gdVar;
        this.c = na;
        this.d = rbVar;
        this.e = rja;
        this.f = fbVar;
        this.g = bVar;
    }

    /* renamed from: c */
    public void onPause(RootActivity rootActivity) {
        this.h.dispose();
        super.onPause(rootActivity);
    }

    /* renamed from: d */
    public void onResume(RootActivity rootActivity) {
        b(rootActivity.getIntent());
        super.onResume(rootActivity);
    }

    /* access modifiers changed from: 0000 */
    public void l() {
        SDb.a("ScAds").a("Clearing all inserted ads", new Object[0]);
        this.a.a();
        this.b.a();
    }

    /* access modifiers changed from: 0000 */
    public C4928GKa<C3676c> m() {
        return this.i;
    }

    /* renamed from: b */
    public void onDestroy(RootActivity rootActivity) {
        this.i = C4928GKa.a();
        super.onDestroy(rootActivity);
    }

    /* renamed from: a */
    public void onNewIntent(RootActivity rootActivity, Intent intent) {
        super.onNewIntent(rootActivity, intent);
        b(intent);
    }

    private void b(Intent intent) {
        String str = "EXTRA_FROM_LAUNCHER";
        if ((intent.getBooleanExtra(str, false) || this.f.b()) && !this.d.isPlaying()) {
            intent.putExtra(str, false);
            Fa a2 = Fa.a.a(C4928GKa.a());
            C7531vPa b2 = this.c.b(a2);
            a aVar = new a(a2.h());
            b2.c(aVar);
            this.h = aVar;
        }
    }
}
