package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs;
import com.soundcloud.android.accounts.C2526g;
import com.soundcloud.android.ads.C2586ja;
import com.soundcloud.android.ads.ld;
import com.soundcloud.android.foundation.ads.C3675b.C0090b;
import com.soundcloud.android.foundation.ads.C3678e;
import com.soundcloud.android.foundation.ads.K;
import com.soundcloud.android.foundation.ads.N;
import com.soundcloud.android.foundation.ads.O;
import com.soundcloud.android.foundation.ads.P;
import com.soundcloud.android.foundation.ads.ca;
import com.soundcloud.android.foundation.events.C3700b;
import com.soundcloud.android.foundation.events.I;
import com.soundcloud.android.foundation.events.J;
import com.soundcloud.android.foundation.playqueue.q;

@EVa(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001:\u0002<=Bu\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u0012\u0006\u0010\u001a\u001a\u00020\u001b\u0012\u0006\u0010\u001c\u001a\u00020\u001d¢\u0006\u0002\u0010\u001eJ\b\u0010(\u001a\u00020)H\u0016J\u0010\u0010*\u001a\u00020)2\u0006\u0010+\u001a\u00020%H\u0016J\u0010\u0010,\u001a\u00020)2\u0006\u0010-\u001a\u00020.H\u0016J\b\u0010/\u001a\u00020)H\u0016J\u0010\u00100\u001a\u00020)2\u0006\u0010+\u001a\u00020%H\u0016J\b\u00101\u001a\u00020)H\u0016J\u0010\u00102\u001a\u00020)2\u0006\u0010-\u001a\u00020.H\u0012J\b\u00103\u001a\u00020)H\u0016J\b\u00104\u001a\u00020)H\u0016J\u0018\u00105\u001a\u00020 2\u0006\u00106\u001a\u00020 2\u0006\u00107\u001a\u00020 H\u0012J\u0018\u00108\u001a\u00020)2\u0006\u00106\u001a\u00020 2\u0006\u00107\u001a\u00020 H\u0016J\u0010\u00109\u001a\u00020)2\u0006\u0010:\u001a\u00020;H\u0012R\u000e\u0010\u0010\u001a\u00020\u0011X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010!\u001a\u00020 8VX\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0014\u0010#\u001a\u00020 8VX\u0004¢\u0006\u0006\u001a\u0004\b#\u0010\"R\u000e\u0010\u0014\u001a\u00020\u0015X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010$\u001a\u0004\u0018\u00010%X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010&\u001a\u0004\u0018\u00010'X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0004¢\u0006\u0002\n\u0000¨\u0006>"}, d2 = {"Lcom/soundcloud/android/ads/overlays/AdOverlayController;", "Lcom/soundcloud/android/ads/VisualAdListener;", "trackView", "Landroid/view/View;", "listener", "Lcom/soundcloud/android/ads/overlays/AdOverlayController$AdOverlayListener;", "context", "Landroid/content/Context;", "deviceHelper", "Lcom/soundcloud/android/utils/DeviceHelper;", "eventBus", "Lcom/soundcloud/rx/eventbus/EventBus;", "analytics", "Lcom/soundcloud/android/foundation/events/Analytics;", "playQueueManager", "Lcom/soundcloud/android/features/playqueue/PlayQueueManager;", "accountOperations", "Lcom/soundcloud/android/accounts/AccountOperations;", "interstitialPresenterFactory", "Lcom/soundcloud/android/ads/overlays/InterstitialPresenter$Factory;", "leaveBehindPresenterFactory", "Lcom/soundcloud/android/ads/overlays/LeaveBehindPresenter$Factory;", "htmlLeaveBehindPresenterFactory", "Lcom/soundcloud/android/ads/HtmlLeaveBehindPresenter$Factory;", "adViewabilityController", "Lcom/soundcloud/android/foundation/ads/AdViewabilityController;", "adErrorTrackingManager", "Lcom/soundcloud/android/ads/AdErrorTrackingManager;", "urlWithPlaceholderBuilder", "Lcom/soundcloud/android/events/UrlWithPlaceholderBuilder;", "(Landroid/view/View;Lcom/soundcloud/android/ads/overlays/AdOverlayController$AdOverlayListener;Landroid/content/Context;Lcom/soundcloud/android/utils/DeviceHelper;Lcom/soundcloud/rx/eventbus/EventBus;Lcom/soundcloud/android/foundation/events/Analytics;Lcom/soundcloud/android/features/playqueue/PlayQueueManager;Lcom/soundcloud/android/accounts/AccountOperations;Lcom/soundcloud/android/ads/overlays/InterstitialPresenter$Factory;Lcom/soundcloud/android/ads/overlays/LeaveBehindPresenter$Factory;Lcom/soundcloud/android/ads/HtmlLeaveBehindPresenter$Factory;Lcom/soundcloud/android/foundation/ads/AdViewabilityController;Lcom/soundcloud/android/ads/AdErrorTrackingManager;Lcom/soundcloud/android/events/UrlWithPlaceholderBuilder;)V", "isExpanded", "", "isNotVisible", "()Z", "isVisibleInFullscreen", "overlayData", "Lcom/soundcloud/android/foundation/ads/VisualAdData;", "presenter", "Lcom/soundcloud/android/ads/overlays/VisualAdPresenter;", "clear", "", "initialize", "data", "onAdClick", "clickThroughUrl", "", "onAdCloseButtonClick", "onAdResourceLoadFailed", "onAdResourceLoaded", "sendTrackingEvent", "setCollapsed", "setExpanded", "shouldDisplayAdOverlay", "isForeground", "isCommentsOpen", "show", "startActivity", "uri", "Landroid/net/Uri;", "AdOverlayListener", "Factory", "base_release"}, mv = {1, 1, 15})
/* renamed from: RJ reason: default package and case insensitive filesystem */
/* compiled from: AdOverlayController.kt */
public class C2259RJ implements ld {
    private ca a;
    private C3051iK b;
    private boolean c;
    private final View d;
    private final a e;
    private final Context f;
    private final C6699jHa g;
    private final C5327TLa h;
    private final C3700b i;
    private final C3814lca j;
    private final C2526g k;
    private final defpackage.C2483cK.a l;
    private final defpackage.C2975eK.a m;
    private final com.soundcloud.android.ads.Lb.a n;
    private final C3678e o;
    private final C2586ja p;
    private final Yaa q;

    /* renamed from: RJ$a */
    /* compiled from: AdOverlayController.kt */
    public interface a {
        void a(boolean z);

        void b(boolean z);
    }

    /* renamed from: RJ$b */
    /* compiled from: AdOverlayController.kt */
    public static class b {
        private final Context a;
        private final C6699jHa b;
        private final C5327TLa c;
        private final C3700b d;
        private final C3814lca e;
        private final C2526g f;
        private final defpackage.C2483cK.a g;
        private final defpackage.C2975eK.a h;
        private final com.soundcloud.android.ads.Lb.a i;
        private final C3678e j;
        private final C2586ja k;
        private final Yaa l;

        public b(Context context, C6699jHa jha, C5327TLa tLa, C3700b bVar, C3814lca lca, C2526g gVar, defpackage.C2483cK.a aVar, defpackage.C2975eK.a aVar2, com.soundcloud.android.ads.Lb.a aVar3, C3678e eVar, C2586ja jaVar, Yaa yaa) {
            C7471uYa.b(context, "context");
            C7471uYa.b(jha, "deviceHelper");
            C7471uYa.b(tLa, "eventBus");
            C7471uYa.b(bVar, "analytics");
            C7471uYa.b(lca, "playQueueManager");
            C7471uYa.b(gVar, "accountOperations");
            C7471uYa.b(aVar, "interstitialPresenterFactory");
            C7471uYa.b(aVar2, "leaveBehindPresenterFactory");
            C7471uYa.b(aVar3, "htmlLeaveBehindPresenterFactory");
            C7471uYa.b(eVar, "adViewabilityController");
            C7471uYa.b(jaVar, "adErrorTrackingManager");
            C7471uYa.b(yaa, "urlWithPlaceholderBuilder");
            this.a = context;
            this.b = jha;
            this.c = tLa;
            this.d = bVar;
            this.e = lca;
            this.f = gVar;
            this.g = aVar;
            this.h = aVar2;
            this.i = aVar3;
            this.j = eVar;
            this.k = jaVar;
            this.l = yaa;
        }

        public C2259RJ a(View view, a aVar) {
            View view2 = view;
            C7471uYa.b(view2, "trackView");
            a aVar2 = aVar;
            C7471uYa.b(aVar2, CastExtraArgs.LISTENER);
            C2259RJ rj = new C2259RJ(view2, aVar2, this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l);
            return rj;
        }
    }

    public C2259RJ(View view, a aVar, Context context, C6699jHa jha, C5327TLa tLa, C3700b bVar, C3814lca lca, C2526g gVar, defpackage.C2483cK.a aVar2, defpackage.C2975eK.a aVar3, com.soundcloud.android.ads.Lb.a aVar4, C3678e eVar, C2586ja jaVar, Yaa yaa) {
        C7471uYa.b(view, "trackView");
        C7471uYa.b(aVar, CastExtraArgs.LISTENER);
        C7471uYa.b(context, "context");
        C7471uYa.b(jha, "deviceHelper");
        C7471uYa.b(tLa, "eventBus");
        C7471uYa.b(bVar, "analytics");
        C7471uYa.b(lca, "playQueueManager");
        C7471uYa.b(gVar, "accountOperations");
        C7471uYa.b(aVar2, "interstitialPresenterFactory");
        C7471uYa.b(aVar3, "leaveBehindPresenterFactory");
        C7471uYa.b(aVar4, "htmlLeaveBehindPresenterFactory");
        C7471uYa.b(eVar, "adViewabilityController");
        C7471uYa.b(jaVar, "adErrorTrackingManager");
        C7471uYa.b(yaa, "urlWithPlaceholderBuilder");
        this.d = view;
        this.e = aVar;
        this.f = context;
        this.g = jha;
        this.h = tLa;
        this.i = bVar;
        this.j = lca;
        this.k = gVar;
        this.l = aVar2;
        this.m = aVar3;
        this.n = aVar4;
        this.o = eVar;
        this.p = jaVar;
        this.q = yaa;
    }

    public void a() {
        q h2 = this.j.h();
        String str = "playQueueManager.currentPlayQueueItem";
        C7471uYa.a((Object) h2, str);
        if (h2.j()) {
            C3051iK iKVar = this.b;
            if (iKVar != null) {
                q h3 = this.j.h();
                C7471uYa.a((Object) h3, str);
                ca caVar = this.a;
                String str2 = "Required value was null.";
                if (caVar != null) {
                    I l2 = this.j.l();
                    if (l2 != null) {
                        iKVar.a(h3, caVar, l2);
                        this.e.a(iKVar.a());
                        return;
                    }
                    throw new IllegalArgumentException(str2);
                }
                throw new IllegalArgumentException(str2);
            }
        }
    }

    public void b() {
        c();
    }

    public void c() {
        ca caVar = this.a;
        if (caVar != null) {
            C5327TLa tLa = this.h;
            C5443XLa<C3431IZ> xLa = C3876taa.h;
            C7471uYa.a((Object) xLa, "EventQueue.AD_PLAYBACK");
            tLa.c(xLa, new c(C6918mWa.b((Object) caVar.i()), defpackage.C3431IZ.c.a.CLEARED_BY_PLAYER));
        }
        ca caVar2 = this.a;
        if (caVar2 != null) {
            caVar2.r();
        }
        ca caVar3 = this.a;
        if (caVar3 != null) {
            caVar3.u();
        }
        C3051iK iKVar = this.b;
        if (iKVar != null) {
            iKVar.clear();
            this.e.b(iKVar.a());
            if (iKVar instanceof C2334VJ) {
                this.o.e();
            }
        }
        this.b = null;
        this.a = null;
    }

    public boolean d() {
        C3051iK iKVar = this.b;
        if (iKVar != null) {
            if (iKVar == null) {
                throw new IllegalArgumentException("Required value was null.");
            } else if (!iKVar.b()) {
                return false;
            }
        }
        return true;
    }

    public boolean e() {
        if (!d()) {
            C3051iK iKVar = this.b;
            if (iKVar == null) {
                throw new IllegalArgumentException("Required value was null.");
            } else if (iKVar.a()) {
                return true;
            }
        }
        return false;
    }

    public void f() {
        this.c = false;
    }

    public void g() {
        this.c = true;
    }

    private void b(String str) {
        q h2 = this.j.h();
        ca caVar = this.a;
        if (caVar != null) {
            C7471uYa.a((Object) h2, "playQueueItem");
            C3425GZ a2 = C3425GZ.a(caVar, h2.c(), this.k.c(), this.j.l(), this.q, str);
            C3700b bVar = this.i;
            C7471uYa.a((Object) a2, "event");
            bVar.a((J) a2);
            return;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public void a(String str) {
        C7471uYa.b(str, "clickThroughUrl");
        Uri parse = Uri.parse(str);
        C7471uYa.a((Object) parse, "Uri.parse(clickThroughUrl)");
        a(parse);
        b(str);
        c();
    }

    public void a(ca caVar) {
        C7471uYa.b(caVar, "data");
        C3700b bVar = this.i;
        C3419EZ a2 = C3419EZ.a(caVar.i(), caVar.f());
        C7471uYa.a((Object) a2, "AdImageErrorEvent.create…ableTrackUrn, data.adUrn)");
        bVar.a((J) a2);
        if (caVar instanceof K) {
            this.p.a(C0090b.GENERAL_COMPANION_FAIL, ((K) caVar).d());
        }
    }

    public void b(ca caVar) {
        C3051iK iKVar;
        C7471uYa.b(caVar, "data");
        this.a = caVar;
        if (caVar instanceof P) {
            iKVar = this.l.a(this.d, this);
        } else if (caVar instanceof O) {
            iKVar = this.m.a(this.d, this);
        } else if (caVar instanceof N) {
            iKVar = this.n.a(this.d, this);
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("The data type ");
            sb.append(caVar.getClass().getSimpleName());
            sb.append(" is not supported for an ad overlay");
            throw new IllegalStateException(sb.toString());
        }
        iKVar.c();
        this.b = iKVar;
    }

    private void a(Uri uri) {
        Context context = this.f;
        Intent intent = new Intent("android.intent.action.VIEW", uri);
        intent.setFlags(268435456);
        context.startActivity(intent);
    }

    public void a(boolean z, boolean z2) {
        if (b(z, z2)) {
            ca caVar = this.a;
            String str = "Required value was null.";
            if (caVar != null) {
                C3051iK iKVar = this.b;
                if (iKVar != null) {
                    if (iKVar instanceof C2334VJ) {
                        this.o.a((View) ((C2334VJ) iKVar).e(), caVar);
                    }
                    iKVar.a(caVar);
                    caVar.r();
                    return;
                }
                throw new IllegalArgumentException(str);
            }
            throw new IllegalArgumentException(str);
        }
    }

    private boolean b(boolean z, boolean z2) {
        boolean z3 = this.g.d() == C6903mHa.PORTRAIT;
        C3051iK iKVar = this.b;
        if (iKVar == null) {
            return false;
        }
        ca caVar = this.a;
        if (caVar != null) {
            return iKVar.a(caVar, this.c, z3, z, z2);
        }
        throw new IllegalArgumentException("Required value was null.");
    }
}
