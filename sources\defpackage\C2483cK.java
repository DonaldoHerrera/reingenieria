package defpackage;

import android.content.res.Resources;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs;
import com.soundcloud.android.ads.ld;
import com.soundcloud.android.foundation.ads.ca;
import com.soundcloud.android.foundation.events.I;
import com.soundcloud.android.foundation.playqueue.q;
import com.soundcloud.android.ia.e;
import com.soundcloud.android.ia.i;
import com.soundcloud.android.ia.p;
import com.soundcloud.android.image.C3721b;
import com.soundcloud.android.image.N;
import com.soundcloud.android.playback.playqueue.Ua;

@EVa(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u00002\u00020\u0001:\u0001'B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u0019H\u0016J \u0010\u001d\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020!H\u0016J0\u0010\"\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010#\u001a\u00020\u00112\u0006\u0010$\u001a\u00020\u00112\u0006\u0010%\u001a\u00020\u00112\u0006\u0010&\u001a\u00020\u0011H\u0016R\u000e\u0010\u000f\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\u00020\u0011XD¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\u0014X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Lcom/soundcloud/android/ads/overlays/InterstitialPresenter;", "Lcom/soundcloud/android/ads/overlays/AdOverlayPresenter;", "trackView", "Landroid/view/View;", "listener", "Lcom/soundcloud/android/ads/VisualAdListener;", "eventBus", "Lcom/soundcloud/rx/eventbus/EventBus;", "imageOperations", "Lcom/soundcloud/android/image/ImageOperations;", "resources", "Landroid/content/res/Resources;", "observerFactory", "Lcom/soundcloud/android/rx/observers/ObserverFactory;", "(Landroid/view/View;Lcom/soundcloud/android/ads/VisualAdListener;Lcom/soundcloud/rx/eventbus/EventBus;Lcom/soundcloud/android/image/ImageOperations;Landroid/content/res/Resources;Lcom/soundcloud/android/rx/observers/ObserverFactory;)V", "interstitialImageHolder", "isFullScreen", "", "()Z", "nowPlayingTitleView", "Landroid/widget/TextView;", "previewContainer", "previewImage", "Landroid/widget/ImageView;", "bind", "", "data", "Lcom/soundcloud/android/foundation/ads/VisualAdData;", "onAdNotVisible", "onAdVisible", "playQueueItem", "Lcom/soundcloud/android/foundation/playqueue/PlayQueueItem;", "trackSourceInfo", "Lcom/soundcloud/android/foundation/events/TrackSourceInfo;", "shouldDisplayOverlay", "isExpanded", "isPortrait", "isForeground", "isCommentsOpen", "Factory", "base_release"}, mv = {1, 1, 15})
/* renamed from: cK reason: default package and case insensitive filesystem */
/* compiled from: InterstitialPresenter.kt */
public class C2483cK extends C2334VJ {
    private final View k;
    private final View l;
    private final ImageView m;
    private final TextView n;
    private final boolean o = true;
    private final Resources p;

    /* renamed from: cK$a */
    /* compiled from: InterstitialPresenter.kt */
    public static class a {
        private final C5327TLa a;
        private final N b;
        private final Resources c;
        private final C5606ava d;

        public a(C5327TLa tLa, N n, Resources resources, C5606ava ava) {
            C7471uYa.b(tLa, "eventBus");
            C7471uYa.b(n, "imageOperations");
            C7471uYa.b(resources, "resources");
            C7471uYa.b(ava, "observerFactory");
            this.a = tLa;
            this.b = n;
            this.c = resources;
            this.d = ava;
        }

        public C2483cK a(View view, ld ldVar) {
            C7471uYa.b(view, "trackView");
            C7471uYa.b(ldVar, CastExtraArgs.LISTENER);
            C2483cK cKVar = new C2483cK(view, ldVar, this.a, this.b, this.c, this.d);
            return cKVar;
        }
    }

    public C2483cK(View view, ld ldVar, C5327TLa tLa, N n2, Resources resources, C5606ava ava) {
        View view2 = view;
        Resources resources2 = resources;
        C7471uYa.b(view, "trackView");
        ld ldVar2 = ldVar;
        C7471uYa.b(ldVar2, CastExtraArgs.LISTENER);
        C5327TLa tLa2 = tLa;
        C7471uYa.b(tLa2, "eventBus");
        N n3 = n2;
        C7471uYa.b(n3, "imageOperations");
        C7471uYa.b(resources2, "resources");
        C5606ava ava2 = ava;
        C7471uYa.b(ava2, "observerFactory");
        super(view, i.interstitial, i.interstitial_stub, i.interstitial_image, i.interstitial_image_holder, i.interstitial_header, ldVar2, n3, tLa2, ava2);
        this.p = resources2;
        View findViewById = view.findViewById(i.interstitial_preview_container);
        C7471uYa.a((Object) findViewById, "trackView.findViewById(R…titial_preview_container)");
        this.k = findViewById;
        View findViewById2 = view.findViewById(i.interstitial_image_holder);
        C7471uYa.a((Object) findViewById2, "trackView.findViewById(R…nterstitial_image_holder)");
        this.l = findViewById2;
        View findViewById3 = view.findViewById(i.interstitial_now_playing_artwork);
        C7471uYa.a((Object) findViewById3, "trackView.findViewById(R…tial_now_playing_artwork)");
        this.m = (ImageView) findViewById3;
        View findViewById4 = view.findViewById(i.interstitial_now_playing_title);
        C7471uYa.a((Object) findViewById4, "trackView.findViewById(R…titial_now_playing_title)");
        this.n = (TextView) findViewById4;
    }

    public boolean a(ca caVar, boolean z, boolean z2, boolean z3, boolean z4) {
        C7471uYa.b(caVar, "data");
        return z && z3 && !z4 && this.p.getBoolean(e.allow_interstitials) && !caVar.q();
    }

    public void c() {
        super.c();
        this.l.setVisibility(8);
        this.k.setVisibility(8);
    }

    public boolean a() {
        return this.o;
    }

    public void a(q qVar, ca caVar, I i) {
        C7471uYa.b(qVar, "playQueueItem");
        C7471uYa.b(caVar, "data");
        C7471uYa.b(i, "trackSourceInfo");
        super.a(qVar, caVar, i);
        this.l.setVisibility(0);
        this.k.setVisibility(0);
        C5327TLa f = f();
        C5443XLa<Ua> xLa = C3876taa.e;
        C7471uYa.a((Object) xLa, "EventQueue.PLAY_QUEUE_UI");
        f.c(xLa, Ua.b());
    }

    public void a(ca caVar) {
        C7471uYa.b(caVar, "data");
        super.a(caVar);
        C3721b c = C3721b.c(this.m.getResources());
        N g = g();
        C3508cda i = caVar.i();
        if (i != null) {
            C4928GKa a2 = C4928GKa.a();
            C7471uYa.a((Object) a2, "Optional.absent()");
            C7471uYa.a((Object) c, "listItemImageSize");
            g.c(i, a2, c, this.m);
            if (caVar.l()) {
                this.n.setText(this.p.getString(p.ads_now_playing_tracktitle_username, new Object[]{caVar.h(), caVar.g()}));
                return;
            }
            this.n.setText(p.ads_now_playing);
            StringBuilder sb = new StringBuilder();
            sb.append("Interstitial missing track data: ");
            sb.append(caVar);
            C7316sHa.d(new IllegalStateException(sb.toString()));
            return;
        }
        throw new IllegalArgumentException("Required value was null.");
    }
}
