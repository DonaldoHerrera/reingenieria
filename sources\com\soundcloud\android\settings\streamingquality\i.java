package com.soundcloud.android.settings.streamingquality;

import android.content.Context;
import com.soundcloud.android.foundation.events.C3700b;
import com.soundcloud.android.foundation.events.J;
import com.soundcloud.android.foundation.events.K;
import com.soundcloud.android.foundation.events.K.f;
import com.soundcloud.android.ia.p;
import com.soundcloud.android.settings.streamingquality.e.b;
import com.soundcloud.android.settings.streamingquality.e.b.C0171b;
import com.soundcloud.android.settings.streamingquality.e.b.c;
import java.util.List;

@EVa(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u00017BQ\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\b\b\u0001\u0010\u0012\u001a\u00020\u0013¢\u0006\u0002\u0010\u0014J\u000e\u0010%\u001a\u00020&2\u0006\u0010\u001f\u001a\u00020 J\u0006\u0010'\u001a\u00020&J\b\u0010(\u001a\u00020)H\u0002J\b\u0010*\u001a\u00020&H\u0002J\b\u0010+\u001a\u00020&H\u0002J\b\u0010,\u001a\u00020&H\u0002J\u0010\u0010-\u001a\u00020&2\u0006\u0010.\u001a\u00020\u0016H\u0002J\u001e\u0010/\u001a\u00020&2\u0006\u00100\u001a\u0002012\f\u00102\u001a\b\u0012\u0004\u0012\u00020&03H\u0002J\f\u00104\u001a\u00020\u0016*\u000201H\u0002J\f\u00105\u001a\u00020&*\u000206H\u0002R\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0016X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00160\u001b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u000e\u0010\u001e\u001a\u00020\u0016X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u001f\u001a\u0004\u0018\u00010 X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$¨\u00068"}, d2 = {"Lcom/soundcloud/android/settings/streamingquality/StreamingQualitySettingsPresenter;", "Lcom/soundcloud/android/uniflow/LiveAndDie;", "context", "Landroid/content/Context;", "streamingQualitySettings", "Lcom/soundcloud/android/settings/streamingquality/StreamingQualitySettings;", "featureOperations", "Lcom/soundcloud/android/configuration/plans/FeatureOperations;", "errorReporter", "Lcom/soundcloud/android/error/reporting/ErrorReporter;", "navigator", "Lcom/soundcloud/android/navigation/Navigator;", "eventBus", "Lcom/soundcloud/rx/eventbus/EventBus;", "analytics", "Lcom/soundcloud/android/foundation/events/Analytics;", "observerFactory", "Lcom/soundcloud/android/rx/observers/ObserverFactory;", "mainThreadScheduler", "Lio/reactivex/Scheduler;", "(Landroid/content/Context;Lcom/soundcloud/android/settings/streamingquality/StreamingQualitySettings;Lcom/soundcloud/android/configuration/plans/FeatureOperations;Lcom/soundcloud/android/error/reporting/ErrorReporter;Lcom/soundcloud/android/navigation/Navigator;Lcom/soundcloud/rx/eventbus/EventBus;Lcom/soundcloud/android/foundation/events/Analytics;Lcom/soundcloud/android/rx/observers/ObserverFactory;Lio/reactivex/Scheduler;)V", "autoQualitySetting", "Lcom/soundcloud/android/settings/streamingquality/Setting;", "disposables", "Lio/reactivex/disposables/CompositeDisposable;", "highQualitySetting", "settings", "", "getSettings", "()Ljava/util/List;", "standardQualitySetting", "view", "Lcom/soundcloud/android/settings/streamingquality/StreamingQualitySettingsView;", "getView", "()Lcom/soundcloud/android/settings/streamingquality/StreamingQualitySettingsView;", "setView", "(Lcom/soundcloud/android/settings/streamingquality/StreamingQualitySettingsView;)V", "attachView", "", "detachView", "isUserEligibleForUpsell", "", "onAutoQualitySettingClicked", "onHighQualitySettingClicked", "onStandardQualitySettingClicked", "render", "selectedSetting", "saveQualityPreferenceOrUpsell", "qualityPreference", "Lcom/soundcloud/android/settings/streamingquality/StreamingQualitySettings$StreamingQuality;", "onUpsellFlowTriggered", "Lkotlin/Function0;", "toSetting", "track", "Lcom/soundcloud/android/foundation/events/TrackingEvent;", "CannotSellHighQualityAudioFeatureException", "base_release"}, mv = {1, 1, 15})
/* compiled from: StreamingQualitySettingsPresenter.kt */
public final class i implements C6968nEa {
    /* access modifiers changed from: private */
    public final a a;
    private final a b;
    /* access modifiers changed from: private */
    public final a c;
    private final List<a> d = C6918mWa.c(this.a, this.b, this.c);
    private final UPa e = new UPa();
    private q f;
    private final e g;
    private final C2436_U h;
    private final C3469VY i;
    private final C4655rja j;
    private final C5327TLa k;
    /* access modifiers changed from: private */
    public final C3700b l;
    private final C5606ava m;
    private final HPa n;

    /* compiled from: StreamingQualitySettingsPresenter.kt */
    private static final class a extends IllegalStateException {
        public a() {
            super("User cannot receive upsell to high quality but clicked the setting!");
        }
    }

    public i(Context context, e eVar, C2436_U _u, C3469VY vy, C4655rja rja, C5327TLa tLa, C3700b bVar, C5606ava ava, HPa hPa) {
        C7471uYa.b(context, "context");
        C7471uYa.b(eVar, "streamingQualitySettings");
        C7471uYa.b(_u, "featureOperations");
        C7471uYa.b(vy, "errorReporter");
        C7471uYa.b(rja, "navigator");
        C7471uYa.b(tLa, "eventBus");
        C7471uYa.b(bVar, "analytics");
        C7471uYa.b(ava, "observerFactory");
        C7471uYa.b(hPa, "mainThreadScheduler");
        this.g = eVar;
        this.h = _u;
        this.i = vy;
        this.j = rja;
        this.k = tLa;
        this.l = bVar;
        this.m = ava;
        this.n = hPa;
        String string = context.getString(p.streaming_quality_auto);
        C7471uYa.a((Object) string, "context.getString(R.string.streaming_quality_auto)");
        this.a = new a(string);
        String string2 = context.getString(p.streaming_quality_standard);
        C7471uYa.a((Object) string2, "context.getString(R.stri…reaming_quality_standard)");
        this.b = new a(string2);
        String string3 = context.getString(p.streaming_quality_best);
        C7471uYa.a((Object) string3, "context.getString(R.string.streaming_quality_best)");
        this.c = new a(string3);
    }

    public void create() {
        defpackage.C6968nEa.a.a(this);
    }

    public void destroy() {
        defpackage.C6968nEa.a.b(this);
    }

    private final boolean c() {
        return !this.h.d() && this.h.t();
    }

    /* access modifiers changed from: private */
    public final void d() {
        f fVar = K.a;
        q qVar = this.f;
        if (qVar != null) {
            a((J) fVar.a(qVar.Ta()));
            a((b) com.soundcloud.android.settings.streamingquality.e.b.a.a, (PXa<RVa>) new n<RVa>(this));
            return;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    /* access modifiers changed from: private */
    public final void e() {
        f fVar = K.a;
        q qVar = this.f;
        if (qVar != null) {
            a((J) fVar.b(qVar.Ta()));
            a((b) C0171b.a, (PXa<RVa>) new o<RVa>(this));
            return;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    /* access modifiers changed from: private */
    public final void f() {
        f fVar = K.a;
        q qVar = this.f;
        if (qVar != null) {
            a((J) fVar.g(qVar.Ta()));
            this.g.b(c.a);
            return;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public final List<a> b() {
        return this.d;
    }

    public final void a(q qVar) {
        C7471uYa.b(qVar, "view");
        this.f = qVar;
        a(a(this.g.e()));
        if (c()) {
            Waa D = Waa.D();
            C7471uYa.a((Object) D, "UpgradeFunnelEvent.forHi…lityStreamingImpression()");
            a((J) D);
            Waa n2 = Waa.n();
            C7471uYa.a((Object) n2, "UpgradeFunnelEvent.forAu…lityStreamingImpression()");
            a((J) n2);
        }
        UPa uPa = this.e;
        GPa c2 = qVar.d().c(this.m.b(new j(this, qVar)));
        C7471uYa.a((Object) c2, "view.onVisible().subscri…n = view.getScreen())) })");
        XUa.a(uPa, (VPa) c2);
        UPa uPa2 = this.e;
        VPa f2 = qVar.Jb().h(new k(this)).f((C6776kQa<? super T>) new l<Object>(this));
        C7471uYa.a((Object) f2, "view.onSettingPositionCl…          }\n            }");
        XUa.a(uPa2, f2);
        UPa uPa3 = this.e;
        GPa c3 = this.g.d().a(this.n).c(C7362sua.a((C6776kQa<T>) new m<T>(this)));
        C7471uYa.a((Object) c3, "streamingQualitySettings…Setting())\n            })");
        XUa.a(uPa3, (VPa) c3);
    }

    /* access modifiers changed from: private */
    public final a a(b bVar) {
        if (C7471uYa.a((Object) bVar, (Object) c.a)) {
            return this.b;
        }
        if (C7471uYa.a((Object) bVar, (Object) C0171b.a)) {
            return this.c;
        }
        if (C7471uYa.a((Object) bVar, (Object) com.soundcloud.android.settings.streamingquality.e.b.a.a)) {
            return this.a;
        }
        throw new FVa();
    }

    private final void a(b bVar, PXa<RVa> pXa) {
        if (this.h.d()) {
            this.g.b(bVar);
        } else if (this.h.t()) {
            pXa.d();
            C4655rja rja = this.j;
            C4621nja a2 = C4621nja.a(C3920yea.HIGH_QUALITY_STREAMING);
            C7471uYa.a((Object) a2, "NavigationTarget.forUpgr…t.HIGH_QUALITY_STREAMING)");
            rja.a(a2);
        } else {
            SDb.b("User selected HQ setting but are they don't have access to the feature nor can receive the upsell!", new Object[0]);
            defpackage.C3469VY.a.a(this.i, new a(), null, 2, null);
        }
    }

    public final void a() {
        this.e.b();
        this.f = null;
    }

    /* access modifiers changed from: private */
    public final void a(a aVar) {
        q qVar = this.f;
        if (qVar != null) {
            List<a> list = this.d;
            qVar.a(new r(list, list.indexOf(aVar)));
            return;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    /* access modifiers changed from: private */
    public final void a(J j2) {
        this.l.a(j2);
    }
}
