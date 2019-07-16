package com.soundcloud.android.ads;

import android.view.View;
import android.view.ViewStub;
import android.webkit.WebView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs;
import com.soundcloud.android.foundation.ads.N;
import com.soundcloud.android.foundation.ads.ca;
import com.soundcloud.android.foundation.events.I;
import com.soundcloud.android.foundation.playqueue.q;
import com.soundcloud.android.ia.i;

@EVa(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001:\u0001*B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u0018H\u0016J\b\u0010\u001c\u001a\u00020\u0018H\u0016J \u0010\u001d\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010 \u001a\u00020!H\u0016J0\u0010\"\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010#\u001a\u00020\u00122\u0006\u0010$\u001a\u00020\u00122\u0006\u0010%\u001a\u00020\u00122\u0006\u0010&\u001a\u00020\u0012H\u0016J\u0010\u0010'\u001a\u00020\u00182\u0006\u0010(\u001a\u00020)H\u0012R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\tX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u0012XD¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u0012X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u000e\u0010\u0015\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006+"}, d2 = {"Lcom/soundcloud/android/ads/HtmlLeaveBehindPresenter;", "Lcom/soundcloud/android/ads/overlays/VisualAdPresenter;", "trackView", "Landroid/view/View;", "listener", "Lcom/soundcloud/android/ads/VisualAdListener;", "renderer", "Lcom/soundcloud/android/ads/overlays/HtmlVisualAdRenderer;", "eventBus", "Lcom/soundcloud/rx/eventbus/EventBus;", "(Landroid/view/View;Lcom/soundcloud/android/ads/VisualAdListener;Lcom/soundcloud/android/ads/overlays/HtmlVisualAdRenderer;Lcom/soundcloud/rx/eventbus/EventBus;)V", "adWebView", "Landroid/webkit/WebView;", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "getEventBus", "()Lcom/soundcloud/rx/eventbus/EventBus;", "isFullScreen", "", "()Z", "isNotVisible", "leaveBehindHeader", "overlay", "bind", "", "data", "Lcom/soundcloud/android/foundation/ads/VisualAdData;", "clear", "onAdNotVisible", "onAdVisible", "playQueueItem", "Lcom/soundcloud/android/foundation/playqueue/PlayQueueItem;", "trackSourceInfo", "Lcom/soundcloud/android/foundation/events/TrackSourceInfo;", "shouldDisplayOverlay", "isExpanded", "isPortrait", "isForeground", "isCommentsOpen", "subscribeToHtmlLoadingEvents", "htmlAdData", "Lcom/soundcloud/android/foundation/ads/HtmlVisualAdData;", "Factory", "base_release"}, mv = {1, 1, 15})
/* compiled from: HtmlLeaveBehindPresenter.kt */
public class Lb implements C3051iK {
    private final UPa a = new UPa();
    private View b;
    private final View c;
    private final WebView d;
    private final boolean e;
    private final boolean f;
    /* access modifiers changed from: private */
    public final ld g;
    private final C2426_J h;
    private final C5327TLa i;

    /* compiled from: HtmlLeaveBehindPresenter.kt */
    public static class a {
        private final C5327TLa a;
        private final C6699jHa b;

        public a(C5327TLa tLa, C6699jHa jha) {
            C7471uYa.b(tLa, "eventBus");
            C7471uYa.b(jha, "deviceHelper");
            this.a = tLa;
            this.b = jha;
        }

        public C3051iK a(View view, ld ldVar) {
            C7471uYa.b(view, "trackView");
            C7471uYa.b(ldVar, CastExtraArgs.LISTENER);
            return new Lb(view, ldVar, new C2426_J(this.b), this.a);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0040, code lost:
        if (r3 != null) goto L_0x0042;
     */
    public Lb(View view, ld ldVar, C2426_J _j, C5327TLa tLa) {
        C7471uYa.b(view, "trackView");
        C7471uYa.b(ldVar, CastExtraArgs.LISTENER);
        C7471uYa.b(_j, "renderer");
        C7471uYa.b(tLa, "eventBus");
        this.g = ldVar;
        this.h = _j;
        this.i = tLa;
        View findViewById = view.findViewById(i.leave_behind);
        if (findViewById == null) {
            View findViewById2 = view.findViewById(i.leave_behind_stub);
            if (!(findViewById2 instanceof ViewStub)) {
                findViewById2 = null;
            }
            ViewStub viewStub = (ViewStub) findViewById2;
            if (viewStub != null) {
                findViewById = viewStub.inflate();
            }
            throw new C2297TJ("Cannot find view to create ad overlay for the html leave behind");
        }
        this.b = findViewById;
        View findViewById3 = this.b.findViewById(i.leave_behind_header);
        C7471uYa.a((Object) findViewById3, "overlay.findViewById(R.id.leave_behind_header)");
        this.c = findViewById3;
        View findViewById4 = this.b.findViewById(i.leaveBehindWebView);
        C7471uYa.a((Object) findViewById4, "overlay.findViewById(R.id.leaveBehindWebView)");
        this.d = (WebView) findViewById4;
        this.e = this.d.getVisibility() == 8;
    }

    public boolean b() {
        return this.e;
    }

    public void c() {
        this.b.setClickable(false);
        this.d.setVisibility(8);
        this.c.setVisibility(8);
        C5327TLa d2 = d();
        C5443XLa<C3422FZ> xLa = C3876taa.g;
        C7471uYa.a((Object) xLa, "EventQueue.AD_OVERLAY");
        d2.c(xLa, C3422FZ.e());
    }

    public void clear() {
        this.a.b();
        c();
    }

    /* access modifiers changed from: protected */
    public C5327TLa d() {
        return this.i;
    }

    public boolean a() {
        return this.f;
    }

    public boolean a(ca caVar, boolean z, boolean z2, boolean z3, boolean z4) {
        C7471uYa.b(caVar, "data");
        if (!z4 && z2) {
            if (caVar.p() && !caVar.o()) {
                return true;
            }
        }
        return false;
    }

    public void a(q qVar, ca caVar, I i2) {
        C7471uYa.b(qVar, "playQueueItem");
        C7471uYa.b(caVar, "data");
        C7471uYa.b(i2, "trackSourceInfo");
        this.b.setClickable(true);
        this.b.setOnClickListener(new Mb(this));
        this.d.setVisibility(0);
        this.c.setVisibility(0);
        C5327TLa d2 = d();
        C5443XLa<C3422FZ> xLa = C3876taa.g;
        C7471uYa.a((Object) xLa, "EventQueue.AD_OVERLAY");
        d2.c(xLa, C3422FZ.a(qVar.c(), caVar, i2));
    }

    public void a(ca caVar) {
        C7471uYa.b(caVar, "data");
        N n = (N) caVar;
        if (this.a.c() == 0) {
            a(n);
            this.h.a(this.d, n.w(), n.x(), n.v(), false);
            return;
        }
        this.a.b();
        a(n);
    }

    private void a(N n) {
        this.a.a(this.h.a().f((C6776kQa<? super T>) new Nb<Object>(this, n)));
    }
}
