package com.soundcloud.android.playback.ui;

import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs;
import com.soundcloud.android.ads.C2630ub;
import com.soundcloud.android.ads.Na;
import com.soundcloud.android.foundation.ads.C3688o;
import com.soundcloud.android.foundation.ads.C3688o.b;
import com.soundcloud.android.foundation.ads.C3689p;
import com.soundcloud.android.foundation.ads.C3693u;
import com.soundcloud.android.foundation.ads.Y;
import com.soundcloud.android.foundation.playqueue.q;
import com.soundcloud.android.ia.i;
import com.soundcloud.android.ia.l;
import com.soundcloud.android.ia.p;
import com.soundcloud.android.image.N;
import com.soundcloud.android.image.ba;
import com.soundcloud.android.playback.C4431ub;
import com.soundcloud.android.playback.C4519wc;
import com.soundcloud.android.playback.ui.view.MiniplayerProgressView;
import com.soundcloud.android.playback.ui.view.RoundedColorButton;
import com.soundcloud.android.settings.C5956m;
import java.util.List;
import java.util.Set;

@EVa(d1 = {"\u0000ö\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001oBY\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\b\u0001\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0016¢\u0006\u0002\u0010\u0017J$\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010+H\u0012J\u001e\u0010,\u001a\u00020%2\u0006\u0010-\u001a\u00020.2\f\u0010/\u001a\b\u0012\u0004\u0012\u00020100H\u0016J\u0018\u00102\u001a\u00020%2\u0006\u0010-\u001a\u00020.2\u0006\u00103\u001a\u00020\u0002H\u0016J\u0010\u00104\u001a\u00020.2\u0006\u00105\u001a\u00020.H\u0016J\u0018\u00106\u001a\u00020.2\u0006\u00107\u001a\u0002082\u0006\u00109\u001a\u00020:H\u0016J\u0010\u0010;\u001a\u00020'2\u0006\u0010<\u001a\u00020.H\u0012J\u0018\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u00020@H\u0012J\u0018\u0010B\u001a\u00020%2\u0006\u0010<\u001a\u00020.2\u0006\u0010C\u001a\u00020DH\u0016J \u0010E\u001a\u00020%2\u0006\u0010-\u001a\u00020.2\u0006\u0010F\u001a\u00020G2\u0006\u0010H\u001a\u00020>H\u0017J\u0018\u0010I\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010J\u001a\u00020KH\u0012J \u0010L\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010M\u001a\u00020N2\u0006\u0010O\u001a\u00020PH\u0012J0\u0010Q\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010M\u001a\u00020R2\u000e\u0010S\u001a\n\u0012\u0004\u0012\u00020U\u0018\u00010T2\u0006\u0010V\u001a\u00020KH\u0012J\u0010\u0010W\u001a\u00020%2\u0006\u0010&\u001a\u00020'H\u0012J\u0010\u0010X\u001a\u00020%2\u0006\u0010<\u001a\u00020.H\u0016J(\u0010Y\u001a\u00020%2\u0006\u0010Z\u001a\u00020[2\u0006\u0010\\\u001a\u00020.2\u0006\u0010]\u001a\u00020>2\u0006\u0010(\u001a\u00020)H\u0012J \u0010^\u001a\u00020%2\u0006\u0010_\u001a\u00020.2\u0006\u0010`\u001a\u00020G2\u0006\u0010a\u001a\u00020>H\u0016J0\u0010b\u001a\u00020%2\u0006\u0010c\u001a\u00020.2\u0006\u0010d\u001a\u00020e2\u0006\u0010f\u001a\u00020>2\u0006\u0010g\u001a\u00020>2\u0006\u0010h\u001a\u00020>H\u0016J\u0018\u0010i\u001a\u00020%2\u0006\u0010c\u001a\u00020.2\u0006\u0010j\u001a\u00020kH\u0016J:\u0010l\u001a\u00020%2\u0006\u0010-\u001a\u00020.2\b\u0010M\u001a\u0004\u0018\u00010m2\u000e\u0010S\u001a\n\u0012\u0004\u0012\u00020U\u0018\u00010T2\u0006\u0010J\u001a\u00020K2\u0006\u0010V\u001a\u00020KH\u0012J\u0010\u0010n\u001a\u00020%2\u0006\u0010-\u001a\u00020.H\u0016R\u0014\u0010\u0011\u001a\u00020\u0012X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u000e\u0010\u001c\u001a\u00020\u001dX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\u00020\u0014X\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\nX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000¨\u0006p"}, d2 = {"Lcom/soundcloud/android/playback/ui/AudioAdPresenter;", "Lcom/soundcloud/android/playback/ui/AdPagePresenter;", "Lcom/soundcloud/android/playback/ui/AudioPlayerAd;", "imageOperations", "Lcom/soundcloud/android/image/ImageOperations;", "resources", "Landroid/content/res/Resources;", "playerOverlayControllerFactory", "Lcom/soundcloud/android/playback/ui/PlayerOverlayController$Factory;", "listener", "Lcom/soundcloud/android/playback/ui/AdPageListener;", "artworkLoader", "Lcom/soundcloud/android/playback/ui/PlayerArtworkLoader;", "scheduler", "Lio/reactivex/Scheduler;", "devImmediatelySkippableAds", "Lcom/soundcloud/android/settings/DevImmediatelySkippableAds;", "adsOperations", "Lcom/soundcloud/android/ads/AdsOperations;", "htmlRendererFactory", "Lcom/soundcloud/android/ads/overlays/HtmlVisualAdRenderer$Factory;", "companionAdLoadedStateProvider", "Lcom/soundcloud/android/ads/CompanionAdLoadedStateProvider;", "(Lcom/soundcloud/android/image/ImageOperations;Landroid/content/res/Resources;Lcom/soundcloud/android/playback/ui/PlayerOverlayController$Factory;Lcom/soundcloud/android/playback/ui/AdPageListener;Lcom/soundcloud/android/playback/ui/PlayerArtworkLoader;Lio/reactivex/Scheduler;Lcom/soundcloud/android/settings/DevImmediatelySkippableAds;Lcom/soundcloud/android/ads/AdsOperations;Lcom/soundcloud/android/ads/overlays/HtmlVisualAdRenderer$Factory;Lcom/soundcloud/android/ads/CompanionAdLoadedStateProvider;)V", "getAdsOperations", "()Lcom/soundcloud/android/ads/AdsOperations;", "getDevImmediatelySkippableAds", "()Lcom/soundcloud/android/settings/DevImmediatelySkippableAds;", "disposable", "Lio/reactivex/disposables/CompositeDisposable;", "helper", "Lcom/soundcloud/android/playback/ui/SlideAnimationHelper;", "getHtmlRendererFactory", "()Lcom/soundcloud/android/ads/overlays/HtmlVisualAdRenderer$Factory;", "getListener", "()Lcom/soundcloud/android/playback/ui/AdPageListener;", "adjustImageCompanionSize", "", "holder", "Lcom/soundcloud/android/playback/ui/AudioAdPresenter$Holder;", "adImage", "Landroid/graphics/Bitmap;", "clickThrough", "", "bindComments", "view", "Landroid/view/View;", "comments", "", "Lcom/soundcloud/android/foundation/domain/comments/CommentWithAuthor;", "bindItemView", "playerAd", "clearItemView", "convertView", "createItemView", "container", "Landroid/view/ViewGroup;", "skipListener", "Lcom/soundcloud/android/playback/ui/SkipListener;", "getViewHolder", "trackView", "isBelowStandardIabSize", "", "width", "", "height", "onPlayerSlide", "slideOffset", "", "onViewSelected", "value", "Lcom/soundcloud/android/foundation/playqueue/PlayQueueItem;", "isExpanded", "renderCompanionLessView", "monetizableTrackUrn", "Lcom/soundcloud/android/foundation/domain/Urn;", "renderHtmlCompanionView", "adCompanion", "Lcom/soundcloud/android/foundation/ads/ApiBaseAdVisualCompanion$HtmlCompanion;", "audioAd", "Lcom/soundcloud/android/foundation/ads/AudioAd;", "renderImageCompanionView", "Lcom/soundcloud/android/foundation/ads/ApiBaseAdVisualCompanion$ImageCompanion;", "errorTrackers", "", "Lcom/soundcloud/android/foundation/ads/UrlWithPlaceholder;", "adUrn", "resetAdImageLayouts", "setCollapsed", "setCompanionViews", "artworkView", "Landroid/widget/ImageView;", "clickableView", "hasCTA", "setExpanded", "trackPage", "playQueueItem", "isSelected", "setPlayState", "adView", "playState", "Lcom/soundcloud/android/playback/PlayState;", "isCurrentTrack", "isForeground", "isCommentsOpen", "setProgress", "progress", "Lcom/soundcloud/android/playback/PlaybackProgress;", "setUpImageAdCompanionViewIfPresent", "Lcom/soundcloud/android/foundation/ads/ApiBaseAdVisualCompanion;", "updatePlayQueueButton", "Holder", "base_release"}, mv = {1, 1, 15})
/* compiled from: AudioAdPresenter.kt */
public class La extends Ca<Qa> {
    private final Yb b = new Yb();
    private final UPa c = new UPa();
    private final N d;
    private final Resources e;
    private final com.soundcloud.android.playback.ui.Ab.a f;
    private final Aa g;
    private final C4504xb h;
    private final HPa i;
    private final C5956m j;
    private final Na k;
    private final defpackage.C2426_J.a l;
    /* access modifiers changed from: private */
    public final C2630ub m;

    /* compiled from: AudioAdPresenter.kt */
    public static final class a extends com.soundcloud.android.playback.ui.Ca.a {
        private final TextView A;
        private final WebView B;
        private final Ab C;
        private boolean D;
        private final Iterable<View> E;
        private final View r;
        private final ImageView s;
        private final ImageView t;
        private final View u;
        private final View v;
        private final PlayPauseButton w;
        private final MiniplayerProgressView x;
        private final View y;
        private final View z;

        public a(View view, com.soundcloud.android.playback.ui.Ab.a aVar, Aa aa) {
            C7471uYa.b(view, "adView");
            C7471uYa.b(aVar, "playerOverlayControllerFactory");
            C7471uYa.b(aa, CastExtraArgs.LISTENER);
            super(view);
            View findViewById = view.findViewById(i.artwork_overlay);
            C7471uYa.a((Object) findViewById, "adView.findViewById(R.id.artwork_overlay)");
            this.r = findViewById;
            View findViewById2 = view.findViewById(i.fullbleed_ad_artwork);
            C7471uYa.a((Object) findViewById2, "adView.findViewById(R.id.fullbleed_ad_artwork)");
            this.s = (ImageView) findViewById2;
            View findViewById3 = view.findViewById(i.centered_ad_artwork);
            C7471uYa.a((Object) findViewById3, "adView.findViewById(R.id.centered_ad_artwork)");
            this.t = (ImageView) findViewById3;
            View findViewById4 = view.findViewById(i.centered_ad_clickable_overlay);
            C7471uYa.a((Object) findViewById4, "adView.findViewById(R.id…red_ad_clickable_overlay)");
            this.u = findViewById4;
            View findViewById5 = view.findViewById(i.companionless_ad_text);
            C7471uYa.a((Object) findViewById5, "adView.findViewById(R.id.companionless_ad_text)");
            this.v = findViewById5;
            View findViewById6 = view.findViewById(i.footer_play_pause);
            C7471uYa.a((Object) findViewById6, "adView.findViewById(R.id.footer_play_pause)");
            this.w = (PlayPauseButton) findViewById6;
            View findViewById7 = view.findViewById(i.player_footer_progress);
            C7471uYa.a((Object) findViewById7, "adView.findViewById(R.id.player_footer_progress)");
            this.x = (MiniplayerProgressView) findViewById7;
            View findViewById8 = view.findViewById(i.player_expanded_top_bar);
            C7471uYa.a((Object) findViewById8, "adView.findViewById(R.id.player_expanded_top_bar)");
            this.y = findViewById8;
            View findViewById9 = view.findViewById(i.footer_controls);
            C7471uYa.a((Object) findViewById9, "adView.findViewById(R.id.footer_controls)");
            this.z = findViewById9;
            View findViewById10 = view.findViewById(i.footer_ad_text);
            C7471uYa.a((Object) findViewById10, "adView.findViewById(R.id.footer_ad_text)");
            this.A = (TextView) findViewById10;
            View findViewById11 = view.findViewById(i.companion_web_view);
            C7471uYa.a((Object) findViewById11, "adView.findViewById(R.id.companion_web_view)");
            this.B = (WebView) findViewById11;
            Ab a = aVar.a(this.r);
            if (a != null) {
                this.C = a;
                this.E = C6918mWa.c(this.t, this.u, this.s, this.k);
                TextView textView = this.A;
                textView.setText(textView.getResources().getString(p.ads_advertisement));
                for (View onClickListener : C6918mWa.c(this.w, this.a, this.s, this.r)) {
                    onClickListener.setOnClickListener(new Da(aa));
                }
                for (View onClickListener2 : C6918mWa.b((Object[]) new View[]{this.u, this.t, this.k})) {
                    onClickListener2.setOnClickListener(new Ea(aa));
                }
                for (View onClickListener3 : C6918mWa.b((Object[]) new View[]{this.y, this.h})) {
                    onClickListener3.setOnClickListener(new Fa(aa));
                }
                View view2 = this.b;
                if (view2 != null) {
                    view2.setOnClickListener(new Ga(aa));
                }
                View view3 = this.c;
                if (view3 != null) {
                    view3.setOnClickListener(new Ha(aa));
                }
                this.z.setOnClickListener(new Ia(aa));
                this.l.setOnClickListener(new Ja(aa));
                this.e.setOnClickListener(new Ka(aa));
                return;
            }
            C7471uYa.a();
            throw null;
        }

        public final ImageView a() {
            return this.t;
        }

        public final View b() {
            return this.u;
        }

        public final View c() {
            return this.y;
        }

        public final Iterable<View> d() {
            return this.E;
        }

        public final WebView e() {
            return this.B;
        }

        public final View f() {
            return this.v;
        }

        public final View g() {
            return this.z;
        }

        public final PlayPauseButton h() {
            return this.w;
        }

        public final MiniplayerProgressView i() {
            return this.x;
        }

        public final ImageView j() {
            return this.s;
        }

        public final Ab k() {
            return this.C;
        }

        public final boolean l() {
            return this.D;
        }

        public final void a(boolean z2) {
            this.D = z2;
        }
    }

    public La(N n, Resources resources, com.soundcloud.android.playback.ui.Ab.a aVar, Aa aa, C4504xb xbVar, HPa hPa, C5956m mVar, Na na, defpackage.C2426_J.a aVar2, C2630ub ubVar) {
        C7471uYa.b(n, "imageOperations");
        C7471uYa.b(resources, "resources");
        C7471uYa.b(aVar, "playerOverlayControllerFactory");
        C7471uYa.b(aa, CastExtraArgs.LISTENER);
        C7471uYa.b(xbVar, "artworkLoader");
        C7471uYa.b(hPa, "scheduler");
        C7471uYa.b(mVar, "devImmediatelySkippableAds");
        C7471uYa.b(na, "adsOperations");
        C7471uYa.b(aVar2, "htmlRendererFactory");
        C7471uYa.b(ubVar, "companionAdLoadedStateProvider");
        super(mVar);
        this.d = n;
        this.e = resources;
        this.f = aVar;
        this.g = aa;
        this.h = xbVar;
        this.i = hPa;
        this.j = mVar;
        this.k = na;
        this.l = aVar2;
        this.m = ubVar;
    }

    private boolean a(int i2, int i3) {
        return i2 <= 600 && i3 <= 500;
    }

    private a j(View view) {
        Object tag = view.getTag();
        if (tag != null) {
            return (a) tag;
        }
        throw new OVa("null cannot be cast to non-null type com.soundcloud.android.playback.ui.AudioAdPresenter.Holder");
    }

    public void a(View view, Set<C3799jda> set) {
        C7471uYa.b(view, "view");
        C7471uYa.b(set, "comments");
    }

    public Aa b() {
        return this.g;
    }

    public View g(View view) {
        C7471uYa.b(view, "convertView");
        a j2 = j(view);
        TextView textView = j2.i;
        C7471uYa.a((Object) textView, "previewTitle");
        textView.setText("");
        j2.i().a();
        a(j2);
        j2.e().setTag(null);
        this.c.b();
        return view;
    }

    public void h(View view) {
        C7471uYa.b(view, "view");
    }

    @SuppressLint({"CheckResult"})
    public void b(View view, q qVar, boolean z) {
        C7471uYa.b(view, "view");
        C7471uYa.b(qVar, "value");
        a j2 = j(view);
        if (j2.e().getTag() == null) {
            Object b2 = qVar.a().b();
            if (b2 != null) {
                C3693u uVar = (C3693u) b2;
                C3688o A = uVar.A();
                if (A instanceof com.soundcloud.android.foundation.ads.C3688o.a) {
                    a(j(view), C3689p.c(A), uVar);
                    j2.e().setTag(A);
                }
                return;
            }
            throw new OVa("null cannot be cast to non-null type com.soundcloud.android.foundation.ads.AudioAd");
        }
    }

    public defpackage.C2426_J.a a() {
        return this.l;
    }

    public View a(ViewGroup viewGroup, Xb xb) {
        C7471uYa.b(viewGroup, "container");
        C7471uYa.b(xb, "skipListener");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(l.player_ad_page, viewGroup, false);
        C7471uYa.a((Object) inflate, "adView");
        inflate.setTag(new a(inflate, this.f, b()));
        return inflate;
    }

    public void a(View view, Qa qa) {
        C7471uYa.b(view, "view");
        C7471uYa.b(qa, "playerAd");
        a j2 = j(view);
        a((C4489sb) qa, (com.soundcloud.android.playback.ui.Ca.a) j2, this.d, this.e);
        a((com.soundcloud.android.playback.ui.Ca.a) j2, (C4489sb) qa, this.e);
        a((com.soundcloud.android.playback.ui.Ca.a) j2, qa);
        if (!(qa.q() instanceof com.soundcloud.android.foundation.ads.C3688o.a)) {
            C3688o q = qa.q();
            List r = qa.r();
            C3508cda m2 = qa.m();
            if (m2 != null) {
                a(view, q, r, m2, qa.h());
                return;
            }
            C7471uYa.a();
            throw null;
        }
    }

    public void a(View view, C4519wc wcVar) {
        C7471uYa.b(view, "adView");
        C7471uYa.b(wcVar, "progress");
        a j2 = j(view);
        a((com.soundcloud.android.playback.ui.Ca.a) j2, wcVar, this.e);
        MiniplayerProgressView i2 = j2.i();
        Kna kna = new Kna(wcVar.d(), wcVar.c(), wcVar.c(), wcVar.b());
        i2.setProgress(kna);
    }

    public void a(View view, C4431ub ubVar, boolean z, boolean z2, boolean z3) {
        C7471uYa.b(view, "adView");
        C7471uYa.b(ubVar, "playState");
        a j2 = j(view);
        boolean p = ubVar.p();
        View view2 = j2.d;
        C7471uYa.a((Object) view2, "playControlsHolder");
        view2.setVisibility(p ^ true ? 0 : 8);
        if (!p || !j2.l()) {
            j2.f().setVisibility(8);
        } else {
            C5466YFa.b(j2.f(), true);
        }
        j2.h().setPlayState(p);
        PlayPauseButton h2 = j2.h();
        String string = view.getResources().getString(p.ads_advertisement);
        C7471uYa.a((Object) string, "adView.resources.getStri…string.ads_advertisement)");
        h2.setPlayInfo(string);
        j2.k().a(ubVar);
    }

    private void a(View view, C3688o oVar, List<Y> list, C3508cda cda, C3508cda cda2) {
        a j2 = j(view);
        if (oVar instanceof b) {
            a(j2, C3689p.d(oVar), list, cda2);
        } else if (oVar == null) {
            a(j2, cda);
        } else {
            new IllegalStateException("This method is called only to render image companion or companionless views.");
        }
    }

    private void a(a aVar, com.soundcloud.android.foundation.ads.C3688o.a aVar2, C3693u uVar) {
        C2426_J a2 = a().a();
        a2.a(aVar.e(), aVar2.e(), aVar2.f(), aVar2.d(), aVar2.g());
        this.c.b(a2.a().f((C6776kQa<? super T>) new Na<Object>(this, a2, aVar, uVar)));
    }

    private void a(a aVar, b bVar, List<Y> list, C3508cda cda) {
        String g2 = bVar.g();
        N n = this.d;
        Uri parse = Uri.parse(g2);
        C7471uYa.a((Object) parse, "Uri.parse(imageUrl)");
        APa a2 = n.a(parse, ba.AD).b(this.i).a(RPa.a());
        Oa oa = new Oa(this, aVar, bVar, cda, list);
        this.c.b(a2.f((C6776kQa<? super T>) oa));
    }

    private void a(a aVar, C3508cda cda) {
        this.c.b(this.h.a(cda).b(this.i).a(RPa.a()).c((C6776kQa<? super T>) new Ma<Object>(this, aVar)));
        aVar.k().a(true);
        aVar.f().setVisibility(0);
        aVar.a(true);
    }

    static /* synthetic */ void a(La la, a aVar, Bitmap bitmap, String str, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 4) != 0) {
                str = null;
            }
            la.a(aVar, bitmap, str);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: adjustImageCompanionSize");
    }

    /* access modifiers changed from: private */
    public void a(a aVar, Bitmap bitmap, String str) {
        boolean z = str != null;
        if (a(bitmap.getWidth(), bitmap.getHeight())) {
            a(aVar.a(), aVar.b(), z, bitmap);
            return;
        }
        ImageView j2 = aVar.j();
        RoundedColorButton roundedColorButton = aVar.k;
        C7471uYa.a((Object) roundedColorButton, "holder.ctaButton");
        a(j2, (View) roundedColorButton, z, bitmap);
    }

    public void a(View view) {
        C7471uYa.b(view, "trackView");
        a(view, 0.0f);
    }

    public void a(View view, q qVar, boolean z) {
        C7471uYa.b(view, "trackPage");
        C7471uYa.b(qVar, "playQueueItem");
        a(view, 1.0f);
    }

    public void a(View view, float f2) {
        C7471uYa.b(view, "trackView");
        a j2 = j(view);
        boolean z = true;
        this.b.a(f2, j2.g(), j2.c(), j2.k());
        int i2 = (f2 > ((float) 0) ? 1 : (f2 == ((float) 0) ? 0 : -1));
        j2.c().setVisibility(i2 > 0 ? 0 : 8);
        View view2 = j2.l;
        C7471uYa.a((Object) view2, "whyAds");
        if (i2 <= 0) {
            z = false;
        }
        view2.setEnabled(z);
        j2.i().a(f2);
    }

    private void a(a aVar) {
        aVar.a().setImageDrawable(null);
        aVar.j().setImageDrawable(null);
        aVar.k().a(false);
        aVar.f().setVisibility(8);
        aVar.a(false);
        b(false, aVar.d());
        aVar.e().setVisibility(8);
    }

    private void a(ImageView imageView, View view, boolean z, Bitmap bitmap) {
        imageView.setImageBitmap(bitmap);
        int i2 = 0;
        imageView.setVisibility(0);
        if (!z) {
            i2 = 8;
        }
        view.setVisibility(i2);
    }
}
