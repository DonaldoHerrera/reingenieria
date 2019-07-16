package com.soundcloud.android.main;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.soundcloud.android.C2929h;
import com.soundcloud.android.deeplinks.i;
import com.soundcloud.android.playback.ui.ac.b;
import com.soundcloud.lightcycle.ActivityLightCycle;
import com.soundcloud.lightcycle.ActivityLightCycleDispatcher;
import com.soundcloud.lightcycle.LightCycle;
import com.soundcloud.lightcycle.LightCycles;

public class MainNavigationPresenter extends ActivityLightCycleDispatcher<RootActivity> implements b {
    @LightCycle
    final MainNavigationView a;
    private final C4834DJa b;
    private final C4581ija c;
    private final i d;
    private final C2436_U e;
    /* access modifiers changed from: private */
    public RootActivity f;
    private VPa g = WPa.b();

    public final class LightCycleBinder {
        public static void bind(MainNavigationPresenter mainNavigationPresenter) {
            mainNavigationPresenter.bind(LightCycles.lift((ActivityLightCycle<Source>) mainNavigationPresenter.a));
        }
    }

    private class a extends C5037Jua<Boolean> {
        private a() {
        }

        public void a(Boolean bool) {
            if (bool.booleanValue()) {
                C4834DJa.a(MainNavigationPresenter.this.f);
            } else {
                C4834DJa.b(MainNavigationPresenter.this.f);
            }
        }
    }

    MainNavigationPresenter(C4834DJa dJa, C4581ija ija, i iVar, C2436_U _u, MainNavigationView mainNavigationView) {
        this.b = dJa;
        this.c = ija;
        this.d = iVar;
        this.e = _u;
        this.a = mainNavigationView;
    }

    private void l() {
        this.g = (VPa) this.e.e().e(Boolean.valueOf(this.e.o())).c(new a());
    }

    /* renamed from: b */
    public void onDestroy(RootActivity rootActivity) {
        this.g.dispose();
        super.onDestroy(rootActivity);
    }

    public void c(RootActivity rootActivity) {
        this.b.e(rootActivity);
    }

    public void j() {
        this.a.j();
    }

    public void k() {
        this.a.k();
    }

    private void c(Intent intent) {
        Uri data = intent.getData();
        String action = intent.getAction();
        if (data != null) {
            a(data);
        } else if (C5206PKa.b(action)) {
            b(intent);
        }
    }

    /* renamed from: a */
    public void onCreate(RootActivity rootActivity, Bundle bundle) {
        super.onCreate(rootActivity, bundle);
        this.f = rootActivity;
        this.a.e(rootActivity);
        if (bundle == null) {
            c(rootActivity.getIntent());
        }
        l();
    }

    private void b(Intent intent) {
        String action = intent.getAction();
        if (action.equals(C2929h.d)) {
            this.a.a(Yca.STREAM);
        } else if (action.equals(C2929h.l)) {
            this.a.a(Yca.COLLECTIONS);
        } else if (action.equals(C2929h.f)) {
            this.a.a(Yca.DISCOVER);
        } else if (action.equals(C2929h.g) || action.equals("android.intent.action.SEARCH") || action.equals("android.media.action.MEDIA_PLAY_FROM_SEARCH")) {
            this.a.a(Yca.SEARCH_MAIN, intent.hasExtra("force_clear_stack"));
        } else if (action.equals(C2929h.m)) {
            this.a.a(Yca.MORE);
        } else if (action.equals(C2929h.u)) {
            this.d.a(com.soundcloud.android.deeplinks.i.a.SEARCH);
            this.a.a(Yca.SEARCH_MAIN);
            this.c.c((Activity) this.f);
        } else if (action.equals(C2929h.t)) {
            this.d.a(com.soundcloud.android.deeplinks.i.a.PLAY_LIKES);
            this.a.a(Yca.COLLECTIONS);
            this.c.e((Context) this.f);
        }
    }

    /* renamed from: a */
    public void onNewIntent(RootActivity rootActivity, Intent intent) {
        super.onNewIntent(rootActivity, intent);
        c(intent);
    }

    public void a(float f2) {
        this.a.a(f2);
    }

    private void a(Uri uri) {
        if (Y.c(uri)) {
            this.a.a(Yca.STREAM);
        } else if (Y.b(uri)) {
            this.a.a(Yca.SEARCH_MAIN);
        }
    }
}
