package defpackage;

import android.annotation.SuppressLint;
import android.view.View;
import com.soundcloud.android.foundation.ads.C3675b.a;
import com.soundcloud.android.foundation.ads.C3678e;
import com.soundcloud.android.foundation.ads.VideoAdTracking;
import com.soundcloud.android.foundation.ads.ca;
import com.soundcloud.android.foundation.events.C3700b;
import com.soundcloud.android.foundation.events.C3702d;
import com.soundcloud.android.foundation.events.C3702d.a.b;
import java.util.List;

/* renamed from: iJ reason: default package and case insensitive filesystem */
/* compiled from: OMAdViewabilityController.kt */
public final class C3050iJ implements C3678e {
    /* access modifiers changed from: private */
    public final C1988DI a;
    /* access modifiers changed from: private */
    public final C2068HI b;
    private final C3469VY c;
    private final C3700b d;
    private final HPa e;

    public C3050iJ(C1988DI di, C2068HI hi, C3469VY vy, C3700b bVar, HPa hPa) {
        C7471uYa.b(di, "omAdSessionManager");
        C7471uYa.b(hi, "omAdSessionWrapper");
        C7471uYa.b(vy, "errorReporter");
        C7471uYa.b(bVar, "analytics");
        C7471uYa.b(hPa, "scheduler");
        this.a = di;
        this.b = hi;
        this.c = vy;
        this.d = bVar;
        this.e = hPa;
    }

    public void a(View view, ca caVar) {
        C7471uYa.b(view, "imageView");
        C7471uYa.b(caVar, "adData");
    }

    public void a(String str) {
        C7471uYa.b(str, "uuid");
    }

    public void a(String str, boolean z) {
        C7471uYa.b(str, "uuid");
    }

    public void b(String str) {
        C7471uYa.b(str, "uuid");
    }

    public void c(String str) {
        C7471uYa.b(str, "uuid");
    }

    @SuppressLint({"CheckResult"})
    public void d(String str) {
        C7471uYa.b(str, "uuid");
        StringBuilder sb = new StringBuilder();
        sb.append("trackVideoAdLoadingError() is called for video ad ");
        sb.append(str);
        e(sb.toString());
        this.a.b().a(this.e).f().a((C7256rQa<? super T>) C2993fJ.a).c((C6776kQa<? super T>) new C3031hJ<Object>(this));
    }

    public void e() {
    }

    public void e(String str, long j) {
        C7471uYa.b(str, "uuid");
        StringBuilder sb = new StringBuilder();
        sb.append("onVideoEnterFullscreen() is called for video ad ");
        sb.append(str);
        e(sb.toString());
        b((_Xa<? super C1948BI, RVa>) new C2296TI<Object,RVa>(this));
    }

    public void f(String str, long j) {
        C7471uYa.b(str, "uuid");
        StringBuilder sb = new StringBuilder();
        sb.append("onVideoSecondQuartile() is called for video ad ");
        sb.append(str);
        e(sb.toString());
        b((_Xa<? super C1948BI, RVa>) new C2425_I<Object,RVa>(this));
    }

    public void g(String str, long j) {
        C7471uYa.b(str, "uuid");
        StringBuilder sb = new StringBuilder();
        sb.append("onVideoThirdQuartile() is called for video ad ");
        sb.append(str);
        e(sb.toString());
        b((_Xa<? super C1948BI, RVa>) new C2955dJ<Object,RVa>(this));
    }

    public void h(String str, long j) {
        C7471uYa.b(str, "uuid");
        StringBuilder sb = new StringBuilder();
        sb.append("onVideoPause() is called for video ad ");
        sb.append(str);
        e(sb.toString());
        b((_Xa<? super C1948BI, RVa>) new C2387YI<Object,RVa>(this));
    }

    public void b(String str, long j) {
        C7471uYa.b(str, "uuid");
        StringBuilder sb = new StringBuilder();
        sb.append("onVideoResume() is called for video ad ");
        sb.append(str);
        e(sb.toString());
        b((_Xa<? super C1948BI, RVa>) new C2406ZI<Object,RVa>(this));
    }

    public void c(String str, long j) {
        C7471uYa.b(str, "uuid");
        StringBuilder sb = new StringBuilder();
        sb.append("onVideoFirstQuartile() is called for video ad ");
        sb.append(str);
        e(sb.toString());
        b((_Xa<? super C1948BI, RVa>) new C2369XI<Object,RVa>(this));
    }

    private final void e(String str) {
        SDb.a("OM_TRACKING").d(str, new Object[0]);
    }

    /* access modifiers changed from: private */
    public final void f() {
        e("Clear video ad session");
        this.a.a();
    }

    public void b() {
        e("onVideoExitFullscreen() is called");
        b((_Xa<? super C1948BI, RVa>) new C2351WI<Object,RVa>(this));
    }

    public void c() {
        e("onVideoEnterFullscreen() is called");
        b((_Xa<? super C1948BI, RVa>) new C2315UI<Object,RVa>(this));
    }

    public void a(C3508cda cda, long j, View view, List<? extends View> list, VideoAdTracking videoAdTracking) {
        C7471uYa.b(cda, "adUrn");
        C7471uYa.b(view, "viewabilityLayer");
        C7471uYa.b(list, "adObstructionViews");
        C7471uYa.b(videoAdTracking, "videoAdTracking");
        e("Start video ad session");
        C1988DI di = this.a;
        a aVar = a.VIDEO_AD;
        List a2 = videoAdTracking.a();
        if (a2 == null) {
            a2 = C6918mWa.a();
        }
        di.a(aVar, view, list, a2);
    }

    private final VPa b(_Xa<? super C1948BI, RVa> _xa) {
        VPa q = a(_xa).q();
        C7471uYa.a((Object) q, "createEventTrackingObser…kingFunction).subscribe()");
        return q;
    }

    public void a(VideoAdTracking videoAdTracking) {
        C7471uYa.b(videoAdTracking, "videoAdTracking");
        e("trackVideoAdImpression() is called");
        b((_Xa<? super C1948BI, RVa>) new C2974eJ<Object,RVa>(this, videoAdTracking));
    }

    @SuppressLint({"CheckResult"})
    public void d() {
        e("onVideoSkip() is called");
        a((_Xa<? super C1948BI, RVa>) new C2444aJ<Object,RVa>(this)).f((C6776kQa<? super T>) new C2463bJ<Object>(this));
    }

    @SuppressLint({"CheckResult"})
    public void a(String str, View view) {
        C7471uYa.b(str, "uuid");
        C7471uYa.b(view, "view");
        StringBuilder sb = new StringBuilder();
        sb.append("dispatchVideoViewUpdate() is called for video ad ");
        sb.append(str);
        e(sb.toString());
        this.a.b().a(this.e).f().a((C7256rQa<? super T>) C2182NI.a).c((C6776kQa<? super T>) new C2220PI<Object>(this, view));
    }

    public void d(String str, long j) {
        C7471uYa.b(str, "uuid");
        StringBuilder sb = new StringBuilder();
        sb.append("onVideoExitFullscreen() is called for video ad ");
        sb.append(str);
        e(sb.toString());
        b((_Xa<? super C1948BI, RVa>) new C2333VI<Object,RVa>(this));
    }

    public void a(String str, long j, float f) {
        C7471uYa.b(str, "uuid");
        StringBuilder sb = new StringBuilder();
        sb.append("onVideoStart() is called for video ad ");
        sb.append(str);
        e(sb.toString());
        b((_Xa<? super C1948BI, RVa>) new C2482cJ<Object,RVa>(this, f));
    }

    @SuppressLint({"CheckResult"})
    public void a(String str, long j) {
        C7471uYa.b(str, "uuid");
        StringBuilder sb = new StringBuilder();
        sb.append("onVideoCompletion() is called for video ad ");
        sb.append(str);
        e(sb.toString());
        a((_Xa<? super C1948BI, RVa>) new C2258RI<Object,RVa>(this)).f((C6776kQa<? super T>) new C2277SI<Object>(this));
    }

    public void a() {
        e("onVideoAdClick() is called");
        b((_Xa<? super C1948BI, RVa>) new C2239QI<Object,RVa>(this));
    }

    public final APa<b> a(_Xa<? super C1948BI, RVa> _xa) {
        C7471uYa.b(_xa, "eventTrackingFunction");
        APa<b> h = this.a.b().a(this.e).b((C7256rQa<? super T>) C2125KI.a).a((C7256rQa<? super T>) C2144LI.a).h(new C2163MI(this, _xa));
        C7471uYa.a((Object) h, "omAdSessionManager.getAd…ssionResult\n            }");
        return h;
    }

    /* access modifiers changed from: private */
    public final void a(b bVar, _Xa<? super C1948BI, RVa> _xa) {
        if (bVar instanceof c) {
            try {
                _xa.invoke(((c) bVar).a());
            } catch (IllegalStateException e2) {
                a((Throwable) e2);
            }
        }
    }

    private final void a(Throwable th) {
        C3700b bVar = this.d;
        String a2 = C3272tJ.OM_EVENT_TRACKING_FAILED.a();
        String message = th.getMessage();
        if (message != null) {
            bVar.a((C3702d) new b(a2, message));
            b a3 = SDb.a("OM_TRACKING");
            StringBuilder sb = new StringBuilder();
            sb.append("Error thrown when tracking: ");
            sb.append(th.getMessage());
            a3.a(th, sb.toString(), new Object[0]);
            a.a(this.c, th, null, 2, null);
            return;
        }
        C7471uYa.a();
        throw null;
    }

    /* access modifiers changed from: private */
    public final void a(C1948BI bi, VideoAdTracking videoAdTracking) {
        if (videoAdTracking.f()) {
            this.b.a(bi, (float) videoAdTracking.d(), true);
        } else {
            this.b.a(bi, true);
        }
    }

    /* access modifiers changed from: private */
    public final void a(String str, C1948BI bi) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" with session ad id: ");
        sb.append(bi.b().b());
        e(sb.toString());
    }
}
