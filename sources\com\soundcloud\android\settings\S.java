package com.soundcloud.android.settings;

import com.soundcloud.android.foundation.events.C3700b;
import com.soundcloud.android.foundation.events.J;

/* compiled from: SettingsPresenter.kt */
public final class S implements C6968nEa {
    private final UPa a = new UPa();
    private final C4655rja b;
    private final C5327TLa c;
    private final C3700b d;
    private final C2436_U e;

    public S(C4655rja rja, C5327TLa tLa, C3700b bVar, C2436_U _u) {
        C7471uYa.b(rja, "navigator");
        C7471uYa.b(tLa, "eventBus");
        C7471uYa.b(bVar, "analytics");
        C7471uYa.b(_u, "featureOperations");
        this.b = rja;
        this.c = tLa;
        this.d = bVar;
        this.e = _u;
    }

    public final void a(U u) {
        C7471uYa.b(u, "view");
        b(u);
        c(u);
        if (this.e.b()) {
            C3700b bVar = this.d;
            Waa H = Waa.H();
            C7471uYa.a((Object) H, "UpgradeFunnelEvent.forOf…eSyncSettingsImpression()");
            bVar.a((J) H);
        }
        UPa uPa = this.a;
        VPa f = u.rb().f((C6776kQa<? super T>) new K<Object>(this));
        C7471uYa.a((Object) f, "view.basicSettingsClick.…get.forBasicSettings()) }");
        XUa.a(uPa, f);
        UPa uPa2 = this.a;
        VPa f2 = u.ub().f((C6776kQa<? super T>) new L<Object>(this));
        C7471uYa.a((Object) f2, "view.notificationSetting…ificationPreferences()) }");
        XUa.a(uPa2, f2);
        UPa uPa3 = this.a;
        VPa f3 = u.Ab().f((C6776kQa<? super T>) new M<Object>(this));
        C7471uYa.a((Object) f3, "view.streamingQualitySet…ngQualityPreferences()) }");
        XUa.a(uPa3, f3);
        UPa uPa4 = this.a;
        VPa f4 = u.Hb().f((C6776kQa<? super T>) new N<Object>(this));
        C7471uYa.a((Object) f4, "view.downloadsSettingsCl…)\n            }\n        }");
        XUa.a(uPa4, f4);
        UPa uPa5 = this.a;
        VPa f5 = u.wb().f((C6776kQa<? super T>) new O<Object>(this));
        C7471uYa.a((Object) f5, "view.analyticsSettingsCl…forAnalyticsSettings()) }");
        XUa.a(uPa5, f5);
        UPa uPa6 = this.a;
        VPa f6 = u.Lb().f((C6776kQa<? super T>) new P<Object>(this));
        C7471uYa.a((Object) f6, "view.advertisingSettings…rAdvertisingSettings()) }");
        XUa.a(uPa6, f6);
        UPa uPa7 = this.a;
        VPa f7 = u.Nb().f((C6776kQa<? super T>) new Q<Object>(this));
        C7471uYa.a((Object) f7, "view.communicationsSetti…mmunicationsSettings()) }");
        XUa.a(uPa7, f7);
    }

    public final C3700b b() {
        return this.d;
    }

    public final C2436_U c() {
        return this.e;
    }

    public void create() {
        a.a(this);
    }

    public final C4655rja d() {
        return this.b;
    }

    public void destroy() {
        a.b(this);
    }

    private final void b(U u) {
        if (this.e.l() || this.e.b()) {
            u.zb();
        } else {
            u.Ob();
        }
    }

    private final void c(U u) {
        if (this.e.d() || this.e.t()) {
            u.yb();
        } else {
            u.Fb();
        }
    }

    public final void a() {
        this.a.b();
    }
}
