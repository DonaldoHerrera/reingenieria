package com.soundcloud.android.downgrade;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.soundcloud.android.foundation.events.C3700b;
import com.soundcloud.android.foundation.events.J;
import com.soundcloud.lightcycle.DefaultSupportFragmentLightCycle;

/* compiled from: GoOffboardingPresenter */
class f extends DefaultSupportFragmentLightCycle<Fragment> {
    /* access modifiers changed from: private */
    public final C4581ija a;
    /* access modifiers changed from: private */
    public final C3363xU b;
    /* access modifiers changed from: private */
    public final h c;
    /* access modifiers changed from: private */
    public final C3700b d;
    /* access modifiers changed from: private */
    public final C4655rja e;
    private final C2455aV f;
    /* access modifiers changed from: private */
    public Fragment g;
    /* access modifiers changed from: private */
    public VPa h = C4881Eua.b();
    /* access modifiers changed from: private */
    public e i;
    /* access modifiers changed from: private */
    public C0075f j;

    /* compiled from: GoOffboardingPresenter */
    private class a extends C5037Jua<Object> {
        private a() {
        }

        public void a(Throwable th) {
            if (C7316sHa.h(th)) {
                f fVar = f.this;
                fVar.i = new c(fVar, null).a();
            } else {
                f fVar2 = f.this;
                fVar2.i = new h(fVar2, null).a();
            }
            super.a(th);
        }

        public void onComplete() {
            f fVar = f.this;
            fVar.i = new g(fVar, null).a();
        }

        /* synthetic */ a(f fVar, e eVar) {
            this();
        }
    }

    /* compiled from: GoOffboardingPresenter */
    private class b implements e {
        private boolean a;

        /* synthetic */ b(f fVar, boolean z, e eVar) {
            this(z);
        }

        public e a() {
            f fVar = f.this;
            fVar.i = this.a ? new d(fVar, null).a() : new d(fVar, null);
            f.this.h.dispose();
            f fVar2 = f.this;
            fVar2.h = (VPa) fVar2.b.a().a(RPa.a()).c(new a(f.this, null));
            return f.this.i;
        }

        private b(boolean z) {
            this.a = z;
        }
    }

    /* compiled from: GoOffboardingPresenter */
    private class c implements e {
        private c() {
        }

        public e a() {
            int i = e.a[f.this.j.ordinal()];
            if (i == 1) {
                f.this.c.b();
                return f.this.k();
            } else if (i != 2) {
                return this;
            } else {
                f.this.c.d();
                return f.this.k();
            }
        }

        /* synthetic */ c(f fVar, e eVar) {
            this();
        }
    }

    /* compiled from: GoOffboardingPresenter */
    private class d implements e {
        private d() {
        }

        public e a() {
            int i = e.a[f.this.j.ordinal()];
            if (i == 1) {
                f.this.c.c();
                return this;
            } else if (i != 2) {
                return this;
            } else {
                f.this.c.e();
                return this;
            }
        }

        /* synthetic */ d(f fVar, e eVar) {
            this();
        }
    }

    /* compiled from: GoOffboardingPresenter */
    interface e {
        e a();
    }

    /* renamed from: com.soundcloud.android.downgrade.f$f reason: collision with other inner class name */
    /* compiled from: GoOffboardingPresenter */
    private enum C0075f {
        USER_NO_ACTION,
        USER_CONTINUE,
        USER_RESUBSCRIBE
    }

    /* compiled from: GoOffboardingPresenter */
    private class g implements e {
        private g() {
        }

        public e a() {
            int i = e.a[f.this.j.ordinal()];
            if (i == 1) {
                f.this.a.b((Activity) f.this.g.getActivity());
                f.this.c.a();
                return this;
            } else if (i != 2) {
                return this;
            } else {
                f.this.e.a(C4621nja.a(C3920yea.GENERAL));
                f.this.d.a((J) Waa.I());
                f.this.c.a();
                f.this.g.getActivity().finish();
                return this;
            }
        }

        /* synthetic */ g(f fVar, e eVar) {
            this();
        }
    }

    /* compiled from: GoOffboardingPresenter */
    private class h implements e {
        private h() {
        }

        public e a() {
            int i = e.a[f.this.j.ordinal()];
            if (i == 1) {
                f.this.c.b();
                f.this.c.a(f.this.g.getFragmentManager());
                return f.this.k();
            } else if (i != 2) {
                return this;
            } else {
                f.this.c.d();
                f.this.c.a(f.this.g.getFragmentManager());
                return f.this.k();
            }
        }

        /* synthetic */ h(f fVar, e eVar) {
            this();
        }
    }

    f(C4581ija ija, C3184oU oUVar, C3363xU xUVar, C4655rja rja, h hVar, C3700b bVar) {
        this.a = ija;
        this.b = xUVar;
        this.e = rja;
        this.c = hVar;
        this.d = bVar;
        this.f = oUVar.b();
    }

    /* access modifiers changed from: private */
    public b k() {
        return new b(this, true, null);
    }

    private b j() {
        return new b(this, false, null);
    }

    /* renamed from: b */
    public void onDestroyView(Fragment fragment) {
        this.c.f();
    }

    /* access modifiers changed from: 0000 */
    public void g() {
        this.j = C0075f.USER_CONTINUE;
        this.i = this.i.a();
    }

    /* access modifiers changed from: 0000 */
    public void h() {
        this.j = C0075f.USER_RESUBSCRIBE;
        this.i = this.i.a();
    }

    /* access modifiers changed from: 0000 */
    public void i() {
        this.d.a((J) Waa.J());
    }

    /* renamed from: a */
    public void onViewCreated(Fragment fragment, View view, Bundle bundle) {
        C2455aV aVVar = this.f;
        if (aVVar == C2455aV.UNDEFINED || aVVar == C2455aV.HIGH_TIER) {
            StringBuilder sb = new StringBuilder();
            sb.append("Cannot downgrade to plan: ");
            sb.append(this.f.a());
            throw new IllegalStateException(sb.toString());
        }
        this.g = fragment;
        this.c.a(fragment.getActivity(), this, this.f);
        this.j = C0075f.USER_NO_ACTION;
        this.i = j().a();
    }

    /* renamed from: a */
    public void onDestroy(Fragment fragment) {
        this.h.dispose();
        this.g = null;
    }
}
