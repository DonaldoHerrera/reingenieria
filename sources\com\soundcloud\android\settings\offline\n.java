package com.soundcloud.android.settings.offline;

import android.content.Context;
import com.soundcloud.android.foundation.events.C3700b;
import com.soundcloud.android.foundation.events.J;
import com.soundcloud.android.offline.C4088fe;
import com.soundcloud.android.offline.C4197yd;
import com.soundcloud.android.offline.Oc;
import com.soundcloud.android.properties.j;
import com.soundcloud.android.settings.C5988u;
import com.soundcloud.android.settings.offline.I.a.C0169a;
import com.soundcloud.android.settings.offline.I.a.b;
import com.soundcloud.android.settings.streamingquality.e;
import com.soundcloud.android.settings.streamingquality.e.b.C0171b;

@EVa(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u00010Bq\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u0012\b\b\u0001\u0010\u001a\u001a\u00020\u001b¢\u0006\u0002\u0010\u001cJ\u000e\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&J\b\u0010'\u001a\u00020(H\u0002J\u0006\u0010)\u001a\u00020$J\b\u0010*\u001a\u00020$H\u0002J\b\u0010+\u001a\u00020,H\u0002J\b\u0010-\u001a\u00020$H\u0002J\f\u0010.\u001a\u00020$*\u00020/H\u0002R\u000e\u0010\u0014\u001a\u00020\u0015X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u001f\u001a\u0010\u0012\f\u0012\n \"*\u0004\u0018\u00010!0!0 X\u0004¢\u0006\u0002\n\u0000¨\u00061"}, d2 = {"Lcom/soundcloud/android/settings/offline/OfflineSettingsPresenter;", "Lcom/soundcloud/android/uniflow/LiveAndDie;", "context", "Landroid/content/Context;", "offlineUsage", "Lcom/soundcloud/android/settings/OfflineUsage;", "offlineSettings", "Lcom/soundcloud/android/offline/OfflineSettingsStorage;", "offlineContentOperations", "Lcom/soundcloud/android/offline/OfflineContentOperations;", "offlinePropertiesProvider", "Lcom/soundcloud/android/foundation/domain/offline/OfflinePropertiesProvider;", "observerFactory", "Lcom/soundcloud/android/rx/observers/ObserverFactory;", "featureOperations", "Lcom/soundcloud/android/configuration/plans/FeatureOperations;", "errorReporter", "Lcom/soundcloud/android/error/reporting/ErrorReporter;", "applicationProperties", "Lcom/soundcloud/android/properties/ApplicationProperties;", "analytics", "Lcom/soundcloud/android/foundation/events/Analytics;", "navigator", "Lcom/soundcloud/android/navigation/Navigator;", "streamingQualitySettings", "Lcom/soundcloud/android/settings/streamingquality/StreamingQualitySettings;", "mainThreadScheduler", "Lio/reactivex/Scheduler;", "(Landroid/content/Context;Lcom/soundcloud/android/settings/OfflineUsage;Lcom/soundcloud/android/offline/OfflineSettingsStorage;Lcom/soundcloud/android/offline/OfflineContentOperations;Lcom/soundcloud/android/foundation/domain/offline/OfflinePropertiesProvider;Lcom/soundcloud/android/rx/observers/ObserverFactory;Lcom/soundcloud/android/configuration/plans/FeatureOperations;Lcom/soundcloud/android/error/reporting/ErrorReporter;Lcom/soundcloud/android/properties/ApplicationProperties;Lcom/soundcloud/android/foundation/events/Analytics;Lcom/soundcloud/android/navigation/Navigator;Lcom/soundcloud/android/settings/streamingquality/StreamingQualitySettings;Lio/reactivex/Scheduler;)V", "disposables", "Lio/reactivex/disposables/CompositeDisposable;", "viewModelSubject", "Lio/reactivex/subjects/PublishSubject;", "Lcom/soundcloud/android/settings/offline/OfflineSettingsViewModel;", "kotlin.jvm.PlatformType", "attachView", "", "view", "Lcom/soundcloud/android/settings/offline/OfflineSettingsView;", "changeStorageLocationSetting", "Lcom/soundcloud/android/settings/offline/OfflineSettingsViewModel$ChangeStorageLocationSetting;", "detachView", "emitViewModel", "isUserEligibleForUpsell", "", "resetOfflineFeature", "track", "Lcom/soundcloud/android/foundation/events/TrackingEvent;", "CannotSellHighQualityAudioDownloadsFeatureException", "base_release"}, mv = {1, 1, 15})
/* compiled from: OfflineSettingsPresenter.kt */
public final class n implements C6968nEa {
    private final C6781kVa<I> a;
    private final UPa b = new UPa();
    /* access modifiers changed from: private */
    public final Context c;
    private final C5988u d;
    /* access modifiers changed from: private */
    public final C4088fe e;
    /* access modifiers changed from: private */
    public final C4197yd f;
    private final C3815lda g;
    /* access modifiers changed from: private */
    public final C5606ava h;
    /* access modifiers changed from: private */
    public final C2436_U i;
    /* access modifiers changed from: private */
    public final C3469VY j;
    private final j k;
    private final C3700b l;
    /* access modifiers changed from: private */
    public final C4655rja m;
    /* access modifiers changed from: private */
    public final e n;
    private final HPa o;

    /* compiled from: OfflineSettingsPresenter.kt */
    private static final class a extends IllegalStateException {
        public a() {
            super("User cannot receive upsell to download high quality but clicked the setting!");
        }
    }

    public n(Context context, C5988u uVar, C4088fe feVar, C4197yd ydVar, C3815lda lda, C5606ava ava, C2436_U _u, C3469VY vy, j jVar, C3700b bVar, C4655rja rja, e eVar, HPa hPa) {
        C7471uYa.b(context, "context");
        C7471uYa.b(uVar, "offlineUsage");
        C7471uYa.b(feVar, "offlineSettings");
        C7471uYa.b(ydVar, "offlineContentOperations");
        C7471uYa.b(lda, "offlinePropertiesProvider");
        C7471uYa.b(ava, "observerFactory");
        C7471uYa.b(_u, "featureOperations");
        C7471uYa.b(vy, "errorReporter");
        C7471uYa.b(jVar, "applicationProperties");
        C7471uYa.b(bVar, "analytics");
        C7471uYa.b(rja, "navigator");
        C7471uYa.b(eVar, "streamingQualitySettings");
        C7471uYa.b(hPa, "mainThreadScheduler");
        this.c = context;
        this.d = uVar;
        this.e = feVar;
        this.f = ydVar;
        this.g = lda;
        this.h = ava;
        this.i = _u;
        this.j = vy;
        this.k = jVar;
        this.l = bVar;
        this.m = rja;
        this.n = eVar;
        this.o = hPa;
        C6781kVa<I> s = C6781kVa.s();
        C7471uYa.a((Object) s, "PublishSubject.create<OfflineSettingsViewModel>()");
        this.a = s;
    }

    public void create() {
        defpackage.C6968nEa.a.a(this);
    }

    public void destroy() {
        defpackage.C6968nEa.a.b(this);
    }

    private final com.soundcloud.android.settings.offline.I.a b() {
        if (!(this.e.c() == Oc.SD_CARD || C6698jGa.f(this.c))) {
            return C0169a.a;
        }
        Oc c2 = this.e.c();
        C7471uYa.a((Object) c2, "offlineSettings.offlineContentLocation");
        return new b(c2);
    }

    /* access modifiers changed from: private */
    public final void c() {
        this.a.a(new I(this.f.j(), this.e.l(), b(), this.n.b() instanceof C0171b));
    }

    private final boolean d() {
        return !this.i.d() && this.i.t();
    }

    /* access modifiers changed from: private */
    public final void e() {
        C3924zaa a2 = C3924zaa.a(Yca.SETTINGS_OFFLINE.a());
        C7471uYa.a((Object) a2, "OfflineInteractionEvent.…n.SETTINGS_OFFLINE.get())");
        a((J) a2);
        UPa uPa = this.b;
        IPa a3 = this.f.c().a(this.o);
        TUa c2 = this.h.c(new F(this));
        a3.c(c2);
        C7471uYa.a((Object) c2, "offlineContentOperations…iewModel()\n            })");
        XUa.a(uPa, c2);
    }

    public final void a(H h2) {
        C7471uYa.b(h2, "view");
        h2.a(this.d);
        UPa uPa = this.b;
        C6781kVa<I> kva = this.a;
        SUa b2 = this.h.b(new w(h2));
        kva.c(b2);
        C7471uYa.a((Object) b2, "viewModelSubject\n       …render(it)\n            })");
        XUa.a(uPa, b2);
        UPa uPa2 = this.b;
        GPa c2 = this.g.d().a(this.o).c(this.h.b(new x(this)));
        C7471uYa.a((Object) c2, "offlinePropertiesProvide…iewModel()\n            })");
        XUa.a(uPa2, (VPa) c2);
        UPa uPa3 = this.b;
        GPa c3 = this.e.d().a(this.o).c(this.h.b(new y(this)));
        C7471uYa.a((Object) c3, "offlineSettings.offlineC…iewModel()\n            })");
        XUa.a(uPa3, (VPa) c3);
        UPa uPa4 = this.b;
        GPa c4 = this.n.c().a(this.o).c(this.h.b(new z(this, h2)));
        C7471uYa.a((Object) c4, "streamingQualitySettings…iewModel()\n            })");
        XUa.a(uPa4, (VPa) c4);
        UPa uPa5 = this.b;
        GPa c5 = h2.tb().c(this.h.b(new A(this, h2)));
        C7471uYa.a((Object) c5, "view.onAutomaticCollecti…         }\n            })");
        XUa.a(uPa5, (VPa) c5);
        UPa uPa6 = this.b;
        GPa c6 = h2.Eb().c(this.h.b(new B(this)));
        C7471uYa.a((Object) c6, "view.onDisableOfflineCol…eFeature()\n            })");
        XUa.a(uPa6, (VPa) c6);
        UPa uPa7 = this.b;
        GPa c7 = h2.Ib().c(C5606ava.a(this.h, (_Xa) null, 1, (Object) null));
        C7471uYa.a((Object) c7, "view.onDisableOfflineCol…serverFactory.observer())");
        XUa.a(uPa7, (VPa) c7);
        UPa uPa8 = this.b;
        GPa c8 = h2.Gb().c(this.h.b(new C(this)));
        C7471uYa.a((Object) c8, "view.onWifiOnlySyncClick…iewModel()\n            })");
        XUa.a(uPa8, (VPa) c8);
        UPa uPa9 = this.b;
        GPa c9 = h2.sb().c(this.h.b(new D(this)));
        C7471uYa.a((Object) c9, "view.onDownloadHighQuali…         }\n            })");
        XUa.a(uPa9, (VPa) c9);
        UPa uPa10 = this.b;
        GPa c10 = h2.xb().c(this.h.b(new E(this)));
        C7471uYa.a((Object) c10, "view.onChangeStorageLoca…ettings())\n            })");
        XUa.a(uPa10, (VPa) c10);
        UPa uPa11 = this.b;
        GPa c11 = h2.Cb().c(this.h.b(new o(this, h2)));
        C7471uYa.a((Object) c11, "view.onRemoveOfflineCont…onEnabled)\n            })");
        XUa.a(uPa11, (VPa) c11);
        UPa uPa12 = this.b;
        GPa c12 = h2.vb().c(this.h.b(new p(this)));
        C7471uYa.a((Object) c12, "view.onRemoveOfflineCont…eFeature()\n            })");
        XUa.a(uPa12, (VPa) c12);
        UPa uPa13 = this.b;
        C6979nPa d2 = h2.Mb().a((C7256rQa<? super T>) q.a).d((C6776kQa<? super T>) new r<Object>(this)).d((C7118pQa<? super T, ? extends C7255rPa>) new s<Object,Object>(this));
        QUa a2 = C5606ava.a(this.h, (PXa) null, 1, (Object) null);
        d2.c(a2);
        C7471uYa.a((Object) a2, "view.onRedownloadOffline…ry.completableObserver())");
        XUa.a(uPa13, a2);
        UPa uPa14 = this.b;
        GPa c13 = h2.Mb().a((C7256rQa<? super T>) t.a).c(this.h.b(new u(this)));
        C7471uYa.a((Object) c13, "view.onRedownloadOffline…)).track()\n            })");
        XUa.a(uPa14, (VPa) c13);
        UPa uPa15 = this.b;
        GPa c14 = h2.Pb().c(this.h.b(new v(this, h2)));
        C7471uYa.a((Object) c14, "view.onStorageUsageLimit…t(context)\n            })");
        XUa.a(uPa15, (VPa) c14);
        if (d()) {
            Waa B = Waa.B();
            C7471uYa.a((Object) B, "UpgradeFunnelEvent.forHi…tyOfflineSyncImpression()");
            a((J) B);
        }
        c();
    }

    /* access modifiers changed from: private */
    public final void a(J j2) {
        this.l.a(j2);
    }

    public final void a() {
        this.b.b();
    }
}
