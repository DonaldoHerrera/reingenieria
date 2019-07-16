package com.soundcloud.android.upgrade;

import android.app.Activity;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.soundcloud.android.foundation.events.C3700b;
import com.soundcloud.android.foundation.events.C3702d;
import com.soundcloud.android.foundation.events.J;
import com.soundcloud.lightcycle.DefaultActivityLightCycle;

/* compiled from: GoOnboardingPresenter */
class h extends DefaultActivityLightCycle<AppCompatActivity> implements a {
    /* access modifiers changed from: private */
    public final C4581ija a;
    private final C3184oU b;
    /* access modifiers changed from: private */
    public final C3363xU c;
    /* access modifiers changed from: private */
    public final k d;
    /* access modifiers changed from: private */
    public final C3700b e;
    /* access modifiers changed from: private */
    public AppCompatActivity f;
    /* access modifiers changed from: private */
    public VPa g = C4881Eua.b();
    /* access modifiers changed from: private */
    public C2455aV h;
    /* access modifiers changed from: private */
    public d i;
    /* access modifiers changed from: private */
    public e j;
    /* access modifiers changed from: private */
    public int k = 0;

    /* compiled from: GoOnboardingPresenter */
    private class a implements d {
        private final boolean a;

        public d a() {
            h hVar = h.this;
            hVar.i = this.a ? new c().a() : new c();
            h hVar2 = h.this;
            hVar2.g = (VPa) hVar2.c.a(h.this.h).a(RPa.a()).c(new C0178h());
            return h.this.i;
        }

        private a(boolean z) {
            this.a = z;
        }
    }

    /* compiled from: GoOnboardingPresenter */
    private class b implements d {
        private b() {
        }

        public d a() {
            h.this.d.b();
            return h.this.y();
        }
    }

    /* compiled from: GoOnboardingPresenter */
    private class c implements d {
        private c() {
        }

        public d a() {
            if (h.this.j == e.USER_CLICKED_START) {
                h.this.d.c();
            }
            return this;
        }
    }

    /* compiled from: GoOnboardingPresenter */
    interface d {
        d a();
    }

    /* compiled from: GoOnboardingPresenter */
    private enum e {
        USER_NO_ACTION,
        USER_CLICKED_START
    }

    /* compiled from: GoOnboardingPresenter */
    private class f implements d {
        private f() {
        }

        public d a() {
            if (h.this.j == e.USER_CLICKED_START) {
                h.this.a.a((Activity) h.this.f);
                h.this.e.a((J) C3924zaa.p());
                h.this.d.a();
            }
            return this;
        }
    }

    /* compiled from: GoOnboardingPresenter */
    private class g implements d {
        private g() {
        }

        public d a() {
            h.this.d.b();
            if (h.this.k >= 1) {
                h.this.d.a(h.this.f.getSupportFragmentManager());
            }
            return h.this.y();
        }
    }

    /* renamed from: com.soundcloud.android.upgrade.h$h reason: collision with other inner class name */
    /* compiled from: GoOnboardingPresenter */
    private class C0178h extends C5037Jua<Object> {
        private boolean d;

        private C0178h() {
            this.d = false;
        }

        public void a(Object obj) {
            this.d = true;
        }

        public void onComplete() {
            if (this.d) {
                h.this.b("success");
                h hVar = h.this;
                hVar.i = new f().a();
            } else {
                h.this.b("timeout");
                h hVar2 = h.this;
                hVar2.i = new g().a();
            }
            super.onComplete();
        }

        public void a(Throwable th) {
            if (C7316sHa.h(th)) {
                h.this.b("network_error");
                h hVar = h.this;
                hVar.i = new b().a();
            } else {
                h.this.b("other_error");
                h hVar2 = h.this;
                hVar2.i = new g().a();
            }
            super.a(th);
        }
    }

    h(C4581ija ija, C3184oU oUVar, C3363xU xUVar, k kVar, C3700b bVar) {
        this.a = ija;
        this.b = oUVar;
        this.c = xUVar;
        this.d = kVar;
        this.e = bVar;
    }

    private a x() {
        return new a(false);
    }

    /* access modifiers changed from: private */
    public a y() {
        this.k++;
        return new a(true);
    }

    public void t() {
        this.j = e.USER_CLICKED_START;
        this.i = this.i.a();
    }

    /* renamed from: b */
    public void onCreate(AppCompatActivity appCompatActivity, Bundle bundle) {
        a(bundle);
        b(bundle);
        this.d.a((Activity) appCompatActivity, (a) this, this.h);
        this.f = appCompatActivity;
        this.j = e.USER_NO_ACTION;
        this.i = x().a();
    }

    /* renamed from: c */
    public void onSaveInstanceState(AppCompatActivity appCompatActivity, Bundle bundle) {
        bundle.putSerializable("pending_plan", this.h);
        bundle.putInt("retry_count", this.k);
        super.onSaveInstanceState(appCompatActivity, bundle);
    }

    private void a(Bundle bundle) {
        if (bundle != null) {
            String str = "pending_plan";
            if (bundle.containsKey(str)) {
                this.h = (C2455aV) bundle.getSerializable(str);
                return;
            }
        }
        this.h = this.b.c();
        C2455aV aVVar = this.h;
        if (aVVar == C2455aV.UNDEFINED || aVVar == C2455aV.FREE_TIER) {
            StringBuilder sb = new StringBuilder();
            sb.append("Cannot upgrade to plan: ");
            sb.append(this.h.a());
            throw new IllegalStateException(sb.toString());
        }
    }

    private void b(Bundle bundle) {
        if (bundle != null) {
            this.k = bundle.getInt("retry_count");
        }
    }

    /* access modifiers changed from: private */
    public void b(String str) {
        this.e.a((C3702d) new com.soundcloud.android.foundation.events.C3702d.C0096d.b(str));
    }

    /* renamed from: a */
    public void onDestroy(AppCompatActivity appCompatActivity) {
        this.g.dispose();
        this.f = null;
    }
}
