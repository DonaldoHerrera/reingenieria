package com.soundcloud.android.ads;

import com.soundcloud.android.foundation.ads.C3675b.C0090b;
import com.soundcloud.android.foundation.ads.G;
import com.soundcloud.android.foundation.ads.Y;
import com.soundcloud.android.foundation.events.C3700b;
import com.soundcloud.android.foundation.events.J;
import java.util.List;

@EVa(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0016\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0012J\u001a\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0012J\u0010\u0010\u0011\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000eH\u0012J\u001c\u0010\u0012\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/soundcloud/android/ads/ErrorAdController;", "", "analytics", "Lcom/soundcloud/android/foundation/events/Analytics;", "urlWithPlaceholderBuilder", "Lcom/soundcloud/android/events/UrlWithPlaceholderBuilder;", "(Lcom/soundcloud/android/foundation/events/Analytics;Lcom/soundcloud/android/events/UrlWithPlaceholderBuilder;)V", "fireErrorTrackerEvents", "", "errorTrackers", "", "Lcom/soundcloud/android/foundation/ads/UrlWithPlaceholder;", "fireFakeImpression", "errorAd", "Lcom/soundcloud/android/foundation/ads/ErrorAd;", "originScreen", "", "fireUnsuccessfulAdOpportunity", "trackImpression", "Companion", "base_release"}, mv = {1, 1, 15})
/* compiled from: ErrorAdController.kt */
public class Cb {
    public static final a a = new a(null);
    private final C3700b b;
    private final Yaa c;

    /* compiled from: ErrorAdController.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }
    }

    public Cb(C3700b bVar, Yaa yaa) {
        C7471uYa.b(bVar, "analytics");
        C7471uYa.b(yaa, "urlWithPlaceholderBuilder");
        this.b = bVar;
        this.c = yaa;
    }

    private void b(G g, String str) {
        C3508cda f = g.f();
        C3508cda i = g.i();
        if (i != null) {
            C3892vaa vaa = new C3892vaa(f, i, "error_ad", g.k(), str);
            this.b.a((J) vaa);
            return;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public void a(G g, String str) {
        C7471uYa.b(g, "errorAd");
        if (!g.d().isEmpty()) {
            a(g.d());
        }
        if (g.m()) {
            b(g, str);
        } else {
            a(g);
        }
    }

    private void a(List<Y> list) {
        this.b.a((J) new C3413CZ(Yaa.a(this.c, (List) list, (C0090b) null, 2, (Object) null)));
    }

    private void a(G g) {
        C3508cda f = g.f();
        C3508cda i = g.i();
        if (i != null) {
            this.b.a((J) new C3868saa(f, i));
            return;
        }
        throw new IllegalArgumentException("Required value was null.");
    }
}
