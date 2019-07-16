package com.soundcloud.android.ads;

import com.soundcloud.android.foundation.ads.C3676c;
import com.soundcloud.android.foundation.ads.C3680g;
import com.soundcloud.android.foundation.ads.C3686m;
import com.soundcloud.android.foundation.ads.C3691s;
import com.soundcloud.android.foundation.ads.C3693u;
import com.soundcloud.android.foundation.ads.G;
import com.soundcloud.android.foundation.ads.H;
import com.soundcloud.android.foundation.ads.J;
import com.soundcloud.android.foundation.ads.M;
import com.soundcloud.android.foundation.ads.P;
import com.soundcloud.android.foundation.ads.Q;
import com.soundcloud.android.foundation.ads.T;
import com.soundcloud.android.foundation.ads.Y;
import com.soundcloud.android.foundation.ads.aa;
import com.soundcloud.android.foundation.events.C3700b;
import com.soundcloud.android.foundation.playqueue.C3719f;
import com.soundcloud.android.foundation.playqueue.C3719f.b;
import com.soundcloud.android.foundation.playqueue.F;
import com.soundcloud.android.foundation.playqueue.q;
import com.soundcloud.android.foundation.playqueue.r;
import com.soundcloud.android.utilities.android.k;
import com.soundcloud.android.utilities.android.t;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;

@EVa(d1 = {"\u0000\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u0000 l2\u00020\u0001:\u0001lBo\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0018\u0012\u0006\u0010\u0019\u001a\u00020\u001a¢\u0006\u0002\u0010\u001bJ.\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020$H\u0016J\u0010\u0010&\u001a\u00020'2\u0006\u0010\u001c\u001a\u00020\u001eH\u0016J\u0018\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,H\u0016J\u0018\u0010-\u001a\u00020'2\u0006\u0010)\u001a\u00020*2\u0006\u0010.\u001a\u00020/H\u0016J\u0018\u00100\u001a\u0002012\u0006\u00102\u001a\u0002032\u0006\u0010!\u001a\u00020\"H\u0012J\u0012\u00104\u001a\u00020'2\b\b\u0002\u00105\u001a\u00020$H\u0017J\n\u00106\u001a\u0004\u0018\u000107H\u0016J\n\u00108\u001a\u0004\u0018\u00010,H\u0016J\n\u00109\u001a\u0004\u0018\u000107H\u0016J\u001c\u0010:\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002070;0\u001d2\u0006\u0010!\u001a\u00020\"H\u0016J6\u0010<\u001a\u00020'2\u0006\u0010)\u001a\u00020*2\u0006\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u00020B2\f\u0010C\u001a\b\u0012\u0004\u0012\u00020D0;H\u0012J6\u0010E\u001a\u00020'2\u0006\u0010)\u001a\u00020*2\u0006\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u00020@2\u0006\u0010F\u001a\u00020G2\f\u0010C\u001a\b\u0012\u0004\u0012\u00020D0;H\u0012J\u0018\u0010H\u001a\u00020'2\u0006\u0010)\u001a\u00020*2\u0006\u0010=\u001a\u00020>H\u0012J\u0018\u0010I\u001a\u00020'2\u0006\u0010)\u001a\u00020*2\u0006\u0010J\u001a\u00020KH\u0016J\u0018\u0010L\u001a\u00020'2\u0006\u0010)\u001a\u00020*2\u0006\u0010M\u001a\u00020NH\u0016J.\u0010.\u001a\b\u0012\u0004\u0012\u00020/0\u001d2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020$H\u0016J\b\u0010O\u001a\u00020$H\u0016J\b\u0010P\u001a\u00020$H\u0016J\b\u0010Q\u001a\u00020$H\u0016J\b\u0010R\u001a\u00020$H\u0016J\b\u0010S\u001a\u00020$H\u0016J\b\u0010T\u001a\u00020$H\u0016J\u0014\u0010U\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002030V0\u001dH\u0016J2\u0010W\u001a\u00020'2\u0006\u0010!\u001a\u00020\"2\u0006\u00102\u001a\u0002032\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020$2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0012J2\u0010X\u001a\u00020'2\u0006\u0010!\u001a\u00020\"2\u0006\u00102\u001a\u0002032\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020$2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0012J:\u0010Y\u001a\u00020'2\u0006\u0010Z\u001a\u00020[2\u0006\u0010!\u001a\u00020\"2\u0006\u00102\u001a\u0002032\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020$2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0012J>\u0010\\\u001a\u000e\u0012\u0004\u0012\u00020^\u0012\u0004\u0012\u00020'0]2\u0006\u0010!\u001a\u00020\"2\u0006\u00102\u001a\u0002032\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020$2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0012J>\u0010_\u001a\u000e\u0012\u0004\u0012\u00020[\u0012\u0004\u0012\u00020'0]2\u0006\u0010!\u001a\u00020\"2\u0006\u00102\u001a\u0002032\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020$2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0012J\u0016\u0010`\u001a\b\u0012\u0004\u0012\u0002070a2\u0006\u0010!\u001a\u00020\"H\u0016J\u0010\u0010b\u001a\u00020'2\u0006\u0010c\u001a\u00020 H\u0012J\u0018\u0010d\u001a\u00020'2\u0006\u0010\u001c\u001a\u00020\u001e2\u0006\u0010e\u001a\u00020*H\u0016J\u0018\u0010f\u001a\u00020'2\u0006\u0010\u001c\u001a\u00020\u001e2\u0006\u0010g\u001a\u00020hH\u0016J&\u0010i\u001a\u00020'2\u0006\u0010\u001c\u001a\u00020\u001e2\u0006\u0010j\u001a\u00020 2\f\u0010b\u001a\b\u0012\u0004\u0012\u00020'0kH\u0012R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0004¢\u0006\u0002\n\u0000¨\u0006m"}, d2 = {"Lcom/soundcloud/android/ads/AdsOperations;", "", "scheduler", "Lio/reactivex/Scheduler;", "playQueueManager", "Lcom/soundcloud/android/features/playqueue/PlayQueueManager;", "featureOperations", "Lcom/soundcloud/android/configuration/plans/FeatureOperations;", "apiClientRx", "Lcom/soundcloud/android/libs/api/ApiClientRx;", "eventBus", "Lcom/soundcloud/rx/eventbus/EventBus;", "analytics", "Lcom/soundcloud/android/foundation/events/Analytics;", "kruxSegmentProvider", "Ldagger/Lazy;", "Lcom/soundcloud/android/ads/KruxSegmentProvider;", "dateProvider", "Lcom/soundcloud/android/utilities/android/date/DateProvider;", "webViewHelper", "Lcom/soundcloud/android/utilities/android/WebViewHelper;", "forceAdTestingIdRepository", "Lcom/soundcloud/android/foundation/ads/ForceAdTestingIdRepository;", "playQueueUpdates", "Lcom/soundcloud/android/foundation/playqueue/PlayQueueUpdates;", "threadChecker", "Lcom/soundcloud/android/utilities/android/ThreadChecker;", "(Lio/reactivex/Scheduler;Lcom/soundcloud/android/features/playqueue/PlayQueueManager;Lcom/soundcloud/android/configuration/plans/FeatureOperations;Lcom/soundcloud/android/libs/api/ApiClientRx;Lcom/soundcloud/rx/eventbus/EventBus;Lcom/soundcloud/android/foundation/events/Analytics;Ldagger/Lazy;Lcom/soundcloud/android/utilities/android/date/DateProvider;Lcom/soundcloud/android/utilities/android/WebViewHelper;Lcom/soundcloud/android/foundation/ads/ForceAdTestingIdRepository;Lcom/soundcloud/android/foundation/playqueue/PlayQueueUpdates;Lcom/soundcloud/android/utilities/android/ThreadChecker;)V", "ads", "Lio/reactivex/Single;", "Lcom/soundcloud/android/foundation/ads/ApiAdsForTrack;", "playQueueItem", "Lcom/soundcloud/android/foundation/playqueue/PlayQueueItem;", "requestData", "Lcom/soundcloud/android/ads/AdRequestData;", "playerVisible", "", "inForeground", "applyAdToUpcomingTrack", "", "applyErrorAdToTrack", "monetizableItem", "Lcom/soundcloud/android/foundation/playqueue/TrackQueueItem;", "errorAd", "Lcom/soundcloud/android/foundation/ads/ErrorAd;", "applyInterstitialToTrack", "interstitialAd", "Lcom/soundcloud/android/foundation/ads/InterstitialAd$ApiModel;", "buildApiRequest", "Lcom/soundcloud/android/libs/api/ApiRequest;", "endpoint", "", "clearAllAdsFromQueue", "shouldRemoveOverlays", "getCurrentTrackAdData", "Lcom/soundcloud/android/foundation/ads/AdData;", "getCurrentTrackErrorAdData", "getNextTrackAdData", "inlayAds", "", "insertAdWithHtmlLeaveBehind", "adQueueItem", "Lcom/soundcloud/android/foundation/playqueue/AdQueueItem;", "precedingAdUrn", "Lcom/soundcloud/android/foundation/domain/Urn;", "apiHtmlLeaveBehindAd", "Lcom/soundcloud/android/foundation/ads/HtmlLeaveBehindAd$ApiModel;", "errorTrackers", "Lcom/soundcloud/android/foundation/ads/UrlWithPlaceholder;", "insertAdWithLeaveBehind", "apiLeaveBehind", "Lcom/soundcloud/android/foundation/ads/LeaveBehindAd$ApiModel;", "insertAdWithoutLeaveBehind", "insertAudioAd", "apiAudioAd", "Lcom/soundcloud/android/foundation/ads/AudioAd$ApiModel;", "insertVideoAd", "apiVideoAd", "Lcom/soundcloud/android/foundation/ads/VideoAd$ApiModel;", "isCurrentItemAd", "isCurrentItemAudioAd", "isCurrentItemLetterboxVideoAd", "isCurrentItemVideoAd", "isNextItemAd", "isNextItemErrorVideoAd", "kruxSegments", "Lcom/soundcloud/java/optional/Optional;", "logRequestFailed", "logRequestSent", "logRequestSuccess", "apiAds", "Lcom/soundcloud/android/foundation/ads/AdsCollection;", "onRequestFailure", "Lkotlin/Function1;", "", "onRequestSuccess", "prestitialAd", "Lio/reactivex/Maybe;", "publishRemoveAdWithoutReplacementEvent", "playqueueItem", "replaceUpcomingErrorVideoAd", "trackQueueItem", "replaceUpcomingVideoAd", "videoItem", "Lcom/soundcloud/android/foundation/playqueue/AdQueueItem$Video;", "replaceWithHighestPriorityNonVideoAd", "updatedTrackItem", "Lkotlin/Function0;", "Companion", "base_release"}, mv = {1, 1, 15})
/* compiled from: AdsOperations.kt */
public class Na {
    public static final a a = new a(null);
    private final HPa b;
    private final C3814lca c;
    private final C2436_U d;
    /* access modifiers changed from: private */
    public final efa e;
    private final C5327TLa f;
    private final C3700b g;
    private final C4806CMa<Wb> h;
    /* access modifiers changed from: private */
    public final C5694cGa i;
    private final t j;
    private final J k;
    private final r l;
    private final k m;

    /* compiled from: AdsOperations.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }
    }

    public Na(HPa hPa, C3814lca lca, C2436_U _u, efa efa, C5327TLa tLa, C3700b bVar, C4806CMa<Wb> cMa, C5694cGa cga, t tVar, J j2, r rVar, k kVar) {
        C7471uYa.b(hPa, "scheduler");
        C7471uYa.b(lca, "playQueueManager");
        C7471uYa.b(_u, "featureOperations");
        C7471uYa.b(efa, "apiClientRx");
        C7471uYa.b(tLa, "eventBus");
        C7471uYa.b(bVar, "analytics");
        C7471uYa.b(cMa, "kruxSegmentProvider");
        C7471uYa.b(cga, "dateProvider");
        C7471uYa.b(tVar, "webViewHelper");
        C7471uYa.b(j2, "forceAdTestingIdRepository");
        C7471uYa.b(rVar, "playQueueUpdates");
        C7471uYa.b(kVar, "threadChecker");
        this.b = hPa;
        this.c = lca;
        this.d = _u;
        this.e = efa;
        this.f = tLa;
        this.g = bVar;
        this.h = cMa;
        this.i = cga;
        this.j = tVar;
        this.k = j2;
        this.l = rVar;
        this.m = kVar;
    }

    public C3676c c() {
        q n = this.c.n();
        C7471uYa.a((Object) n, "playQueueManager.nextPlayQueueItem");
        return (C3676c) n.a().d();
    }

    public boolean d() {
        q h2 = this.c.h();
        C7471uYa.a((Object) h2, "playQueueManager.currentPlayQueueItem");
        return h2.e();
    }

    public boolean e() {
        q h2 = this.c.h();
        C7471uYa.a((Object) h2, "playQueueManager.currentPlayQueueItem");
        return h2.f();
    }

    public boolean f() {
        if (g()) {
            q h2 = this.c.h();
            if (!(h2 instanceof b)) {
                h2 = null;
            }
            b bVar = (b) h2;
            if (bVar != null && !bVar.l()) {
                return true;
            }
        }
        return false;
    }

    public boolean g() {
        q h2 = this.c.h();
        C7471uYa.a((Object) h2, "playQueueManager.currentPlayQueueItem");
        return h2.k();
    }

    public boolean h() {
        q n = this.c.n();
        C7471uYa.a((Object) n, "playQueueManager.nextPlayQueueItem");
        return n.e();
    }

    public boolean i() {
        C3676c c2 = c();
        return c2 != null && c2.k() == com.soundcloud.android.foundation.ads.C3676c.a.ERROR_VIDEO_AD;
    }

    public IPa<C4928GKa<String>> j() {
        IPa<C4928GKa<String>> a2 = IPa.a(this.d.r() ? ((Wb) this.h.get()).a() : C4928GKa.a());
        C7471uYa.a((Object) a2, "Single.just(if (featureO…) else Optional.absent())");
        return a2;
    }

    private _Xa<Throwable, RVa> c(Fa fa, String str, boolean z, boolean z2, q qVar) {
        Xa xa = new Xa(this, str, fa, z, z2, qVar);
        return xa;
    }

    private _Xa<C3680g, RVa> d(Fa fa, String str, boolean z, boolean z2, q qVar) {
        Ya ya = new Ya(this, str, fa, z, z2, qVar);
        return ya;
    }

    public G b() {
        q h2 = this.c.h();
        C7471uYa.a((Object) h2, "playQueueManager.currentPlayQueueItem");
        Object d2 = h2.a().d();
        if (!(d2 instanceof G)) {
            d2 = null;
        }
        return (G) d2;
    }

    /* JADX WARNING: type inference failed for: r2v7 */
    /* JADX WARNING: type inference failed for: r11v3 */
    /* JADX WARNING: type inference failed for: r12v3, types: [com.soundcloud.android.ads.db] */
    /* JADX WARNING: type inference failed for: r3v4, types: [com.soundcloud.android.ads.db] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    public IPa<com.soundcloud.android.foundation.ads.P.a> b(q qVar, Fa fa, boolean z, boolean z2) {
        C7471uYa.b(qVar, "playQueueItem");
        C7471uYa.b(fa, "requestData");
        C3508cda f2 = fa.f();
        if (f2 != null) {
            String M = f2.M();
            Object[] objArr = {M};
            String format = String.format(C2226PO.INTERSTITIAL.a(), Arrays.copyOf(objArr, objArr.length));
            C7471uYa.a((Object) format, "java.lang.String.format(this, *args)");
            IPa a2 = IPa.c((Callable<? extends T>) new Ua<Object>(this, format, fa)).a((C7118pQa<? super T, ? extends MPa<? extends R>>) new Va<Object,Object>(this));
            Wa wa = new Wa(this, fa, format, z, z2, qVar);
            IPa b2 = a2.b((C6776kQa<? super VPa>) wa).b(this.b);
            _Xa c2 = c(fa, format, z, z2, qVar);
            if (c2 != 0) {
                c2 = new C2563db(c2);
            }
            IPa a3 = b2.a((C6776kQa) c2);
            _Xa d2 = d(fa, format, z, z2, qVar);
            if (d2 != 0) {
                d2 = new C2563db(d2);
            }
            IPa<com.soundcloud.android.foundation.ads.P.a> c3 = a3.c((C6776kQa) d2);
            C7471uYa.a((Object) c3, "Single.fromCallable {  b…reground, playQueueItem))");
            return c3;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public C3676c a() {
        q h2 = this.c.h();
        C7471uYa.a((Object) h2, "playQueueManager.currentPlayQueueItem");
        return (C3676c) h2.a().d();
    }

    /* JADX WARNING: type inference failed for: r2v7 */
    /* JADX WARNING: type inference failed for: r11v3 */
    /* JADX WARNING: type inference failed for: r12v3, types: [com.soundcloud.android.ads.db] */
    /* JADX WARNING: type inference failed for: r3v4, types: [com.soundcloud.android.ads.db] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    public IPa<C3686m> a(q qVar, Fa fa, boolean z, boolean z2) {
        C7471uYa.b(qVar, "playQueueItem");
        C7471uYa.b(fa, "requestData");
        C3508cda f2 = fa.f();
        if (f2 != null) {
            String M = f2.M();
            Object[] objArr = {M};
            String format = String.format(C2226PO.ADS.a(), Arrays.copyOf(objArr, objArr.length));
            C7471uYa.a((Object) format, "java.lang.String.format(this, *args)");
            IPa a2 = IPa.c((Callable<? extends T>) new Oa<Object>(this, format, fa)).a((C7118pQa<? super T, ? extends MPa<? extends R>>) new Pa<Object,Object>(this));
            Qa qa = new Qa(this, fa, format, z, z2, qVar);
            IPa b2 = a2.b((C6776kQa<? super VPa>) qa).b(this.b);
            _Xa c2 = c(fa, format, z, z2, qVar);
            if (c2 != 0) {
                c2 = new C2563db(c2);
            }
            IPa a3 = b2.a((C6776kQa) c2);
            _Xa d2 = d(fa, format, z, z2, qVar);
            if (d2 != 0) {
                d2 = new C2563db(d2);
            }
            IPa<C3686m> c3 = a3.c((C6776kQa) d2);
            C7471uYa.a((Object) c3, "Single.fromCallable {  b…reground, playQueueItem))");
            return c3;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    /* JADX WARNING: type inference failed for: r1v5 */
    /* JADX WARNING: type inference failed for: r9v2 */
    /* JADX WARNING: type inference failed for: r0v5, types: [com.soundcloud.android.ads.db] */
    /* JADX WARNING: type inference failed for: r2v4, types: [com.soundcloud.android.ads.db] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    public C7531vPa<C3676c> b(Fa fa) {
        C7471uYa.b(fa, "requestData");
        String a2 = C2226PO.PRESTITIALS.a();
        IPa b2 = IPa.c((Callable<? extends T>) new Za<Object>(this, a2, fa)).a((C7118pQa<? super T, ? extends MPa<? extends R>>) new _a<Object,Object>(this)).b(this.b);
        _Xa c2 = c(fa, a2, false, true, null);
        if (c2 != 0) {
            c2 = new C2563db(c2);
        }
        IPa a3 = b2.a((C6776kQa) c2);
        _Xa d2 = d(fa, a2, false, true, null);
        if (d2 != 0) {
            d2 = new C2563db(d2);
        }
        C7531vPa<C3676c> c3 = a3.c((C6776kQa) d2).c((C7118pQa<? super T, ? extends C7669xPa<? extends R>>) C2545ab.a);
        C7471uYa.a((Object) c3, "Single.fromCallable {  b…ybe.empty()\n            }");
        return c3;
    }

    /* JADX WARNING: type inference failed for: r1v5 */
    /* JADX WARNING: type inference failed for: r9v2 */
    /* JADX WARNING: type inference failed for: r0v5, types: [com.soundcloud.android.ads.db] */
    /* JADX WARNING: type inference failed for: r2v4, types: [com.soundcloud.android.ads.db] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    public IPa<List<C3676c>> a(Fa fa) {
        C7471uYa.b(fa, "requestData");
        String a2 = C2226PO.INLAY_ADS.a();
        IPa b2 = IPa.c((Callable<? extends T>) new Ra<Object>(this, a2, fa)).a((C7118pQa<? super T, ? extends MPa<? extends R>>) new Sa<Object,Object>(this)).b(this.b);
        _Xa c2 = c(fa, a2, false, true, null);
        if (c2 != 0) {
            c2 = new C2563db(c2);
        }
        IPa a3 = b2.a((C6776kQa) c2);
        _Xa d2 = d(fa, a2, false, true, null);
        if (d2 != 0) {
            d2 = new C2563db(d2);
        }
        IPa<List<C3676c>> e2 = a3.c((C6776kQa) d2).e(new Ta(this));
        C7471uYa.a((Object) e2, "Single.fromCallable {  b…it.getAds(dateProvider) }");
        return e2;
    }

    /* access modifiers changed from: private */
    public void b(Fa fa, String str, boolean z, boolean z2, q qVar) {
        C3700b bVar = this.g;
        c cVar = new c(fa.h(), z2, z, fa.f(), str, qVar, 0, 64, null);
        bVar.a((com.soundcloud.android.foundation.events.J) cVar);
    }

    /* access modifiers changed from: private */
    public hfa a(String str, Fa fa) {
        this.m.a("Building API request may not happen on the UI thread.");
        b a2 = hfa.b(str).c().a("correlator", fa.h()).a("cs_player_state", fa.g().a()).a("cs_connection_type", fa.b().a()).a("cs_device_type", fa.d().a()).a("cs_orientation", fa.c().a()).a("requires_frequency_cap_duration", Boolean.valueOf(true));
        String e2 = fa.e();
        if (e2 != null) {
            a2.a("krux_segments", e2);
        }
        if (fa.a() != null) {
            a2.a("cs_app_state", fa.a().a());
        }
        String a3 = this.j.a();
        if (a3 != null) {
            a2.b("Webview-User-Agent", a3);
        }
        if (this.k.d()) {
            a2.a("creativeid", this.k.b());
            a2.a("lineid", this.k.e());
        }
        hfa b2 = a2.b();
        C7471uYa.a((Object) b2, "request.build()");
        return b2;
    }

    /* access modifiers changed from: private */
    public void a(C3680g gVar, Fa fa, String str, boolean z, boolean z2, q qVar) {
        C3700b bVar = this.g;
        d dVar = new d(gVar.k(), fa.h(), z2, z, fa.f(), str, qVar, 0, 128, null);
        bVar.a((com.soundcloud.android.foundation.events.J) dVar);
    }

    /* access modifiers changed from: private */
    public void a(Fa fa, String str, boolean z, boolean z2, q qVar) {
        C3700b bVar = this.g;
        b bVar2 = new b(fa.h(), z2, z, fa.f(), str, qVar, 0, 64, null);
        bVar.a((com.soundcloud.android.foundation.events.J) bVar2);
    }

    public void a(C3686m mVar) {
        C7471uYa.b(mVar, "ads");
        q n = this.c.n();
        if (n instanceof F) {
            T n2 = mVar.n();
            if (n2 == null) {
                return;
            }
            if (n2 instanceof com.soundcloud.android.foundation.ads.aa.a) {
                a((F) n, (com.soundcloud.android.foundation.ads.aa.a) n2);
            } else if (n2 instanceof com.soundcloud.android.foundation.ads.P.a) {
                a((F) n, (com.soundcloud.android.foundation.ads.P.a) n2);
            } else if (n2 instanceof com.soundcloud.android.foundation.ads.C3693u.a) {
                a((F) n, (com.soundcloud.android.foundation.ads.C3693u.a) n2);
            } else {
                String str = "monetizableItem.urn";
                if (n2 instanceof com.soundcloud.android.foundation.ads.C3691s.a) {
                    F f2 = (F) n;
                    com.soundcloud.android.foundation.ads.C3691s.a aVar = (com.soundcloud.android.foundation.ads.C3691s.a) n2;
                    C3508cda c2 = f2.c();
                    C7471uYa.a((Object) c2, str);
                    a(f2, (G) H.a(aVar, c2));
                } else if (n2 instanceof C3691s.b) {
                    F f3 = (F) n;
                    C3691s.b bVar = (C3691s.b) n2;
                    C3508cda c3 = f3.c();
                    C7471uYa.a((Object) c3, str);
                    a(f3, (G) H.a(bVar, c3));
                }
            }
        }
    }

    public void a(F f2, G g2) {
        C7471uYa.b(f2, "monetizableItem");
        C7471uYa.b(g2, "errorAd");
        this.c.a((q) f2, C6850lWa.a(((com.soundcloud.android.foundation.playqueue.F.a) new com.soundcloud.android.foundation.playqueue.F.a(f2).a((C3676c) g2)).c()));
    }

    public void a(F f2, com.soundcloud.android.foundation.ads.P.a aVar) {
        C7471uYa.b(f2, "monetizableItem");
        C7471uYa.b(aVar, "interstitialAd");
        com.soundcloud.android.foundation.playqueue.F.a aVar2 = new com.soundcloud.android.foundation.playqueue.F.a(f2);
        P.b bVar = P.g;
        C3508cda c2 = f2.c();
        C7471uYa.a((Object) c2, "monetizableItem.urn");
        this.c.a((q) f2, C6850lWa.a(((com.soundcloud.android.foundation.playqueue.F.a) aVar2.a((C3676c) bVar.a(aVar, c2))).c()));
    }

    public void a(F f2, com.soundcloud.android.foundation.ads.C3693u.a aVar) {
        C7471uYa.b(f2, "monetizableItem");
        C7471uYa.b(aVar, "apiAudioAd");
        C3693u.b bVar = C3693u.e;
        C3508cda c2 = f2.c();
        C7471uYa.a((Object) c2, "monetizableItem.urn");
        C3693u a2 = bVar.a(aVar, c2);
        if (aVar.i() != null) {
            com.soundcloud.android.foundation.playqueue.C3719f.a aVar2 = new com.soundcloud.android.foundation.playqueue.C3719f.a(a2);
            C3508cda f3 = a2.f();
            com.soundcloud.android.foundation.ads.M.a i2 = aVar.i();
            if (i2 != null) {
                a(f2, (C3719f) aVar2, f3, i2, a2.d());
                return;
            }
            C7471uYa.a();
            throw null;
        } else if (aVar.k() != null) {
            com.soundcloud.android.foundation.playqueue.C3719f.a aVar3 = new com.soundcloud.android.foundation.playqueue.C3719f.a(a2);
            C3508cda f4 = a2.f();
            com.soundcloud.android.foundation.ads.Q.a k2 = aVar.k();
            if (k2 != null) {
                a(f2, (C3719f) aVar3, f4, k2, a2.d());
                return;
            }
            C7471uYa.a();
            throw null;
        } else {
            a(f2, (C3719f) new com.soundcloud.android.foundation.playqueue.C3719f.a(a2));
        }
    }

    public void a(F f2, com.soundcloud.android.foundation.ads.aa.a aVar) {
        C7471uYa.b(f2, "monetizableItem");
        C7471uYa.b(aVar, "apiVideoAd");
        aa.b bVar = aa.e;
        long a2 = this.i.a();
        C3508cda c2 = f2.c();
        C7471uYa.a((Object) c2, "monetizableItem.urn");
        aa a3 = bVar.a(aVar, a2, c2);
        String str = "Required value was null.";
        if (aVar.k() != null) {
            b bVar2 = new b(a3);
            C3508cda f3 = a3.f();
            com.soundcloud.android.foundation.ads.M.a k2 = aVar.k();
            if (k2 != null) {
                a(f2, (C3719f) bVar2, f3, k2, a3.d());
                return;
            }
            throw new IllegalArgumentException(str);
        } else if (aVar.l() != null) {
            b bVar3 = new b(a3);
            C3508cda f4 = a3.f();
            com.soundcloud.android.foundation.ads.Q.a l2 = aVar.l();
            if (l2 != null) {
                a(f2, (C3719f) bVar3, f4, l2, a3.d());
                return;
            }
            throw new IllegalArgumentException(str);
        } else {
            a(f2, (C3719f) new b(a3));
        }
    }

    private void a(F f2, C3719f fVar, C3508cda cda, com.soundcloud.android.foundation.ads.Q.a aVar, List<Y> list) {
        Q a2 = Q.g.a(aVar, cda, list);
        this.c.a((q) f2, C6918mWa.b((Object[]) new q[]{fVar, ((com.soundcloud.android.foundation.playqueue.F.a) new com.soundcloud.android.foundation.playqueue.F.a(f2).a((C3676c) a2)).c()}));
    }

    private void a(F f2, C3719f fVar, C3508cda cda, com.soundcloud.android.foundation.ads.M.a aVar, List<Y> list) {
        M a2 = M.g.a(aVar, cda, list);
        this.c.a((q) f2, C6918mWa.b((Object[]) new q[]{fVar, ((com.soundcloud.android.foundation.playqueue.F.a) new com.soundcloud.android.foundation.playqueue.F.a(f2).a((C3676c) a2)).c()}));
    }

    private void a(F f2, C3719f fVar) {
        this.c.a((q) f2, C6918mWa.b((Object[]) new q[]{fVar, ((com.soundcloud.android.foundation.playqueue.F.a) new com.soundcloud.android.foundation.playqueue.F.a(f2).b()).c()}));
    }

    public void a(C3686m mVar, b bVar) {
        C7471uYa.b(mVar, "ads");
        C7471uYa.b(bVar, "videoItem");
        this.c.a((q) bVar, mVar.l() == null && mVar.p() == null);
        q n = this.c.n();
        C7471uYa.a((Object) n, "nextPlayQueueItem");
        if (n.a() != null) {
            q d2 = this.c.d(n);
            if (d2 != null) {
                n = d2;
            }
        }
        C7471uYa.a((Object) n, "nextUpdatedPlayQueueItem");
        a(mVar, n, (PXa<RVa>) new C2553cb<RVa>(this, bVar));
    }

    public void a(C3686m mVar, F f2) {
        C7471uYa.b(mVar, "ads");
        C7471uYa.b(f2, "trackQueueItem");
        F d2 = this.c.d((q) f2);
        C7471uYa.a((Object) d2, "updatedTrackItem");
        a(mVar, (q) d2, (PXa<RVa>) new C2549bb<RVa>(this, f2));
    }

    private void a(C3686m mVar, q qVar, PXa<RVa> pXa) {
        T o = mVar.o();
        String str = " not of type ";
        String str2 = "Input ";
        if (o instanceof com.soundcloud.android.foundation.ads.C3693u.a) {
            if (qVar instanceof F) {
                a((F) qVar, (com.soundcloud.android.foundation.ads.C3693u.a) o);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append(qVar);
            sb.append(str);
            sb.append(F.class.getSimpleName());
            throw new IllegalArgumentException(sb.toString());
        } else if (o instanceof com.soundcloud.android.foundation.ads.P.a) {
            if (qVar instanceof F) {
                a((F) qVar, (com.soundcloud.android.foundation.ads.P.a) o);
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str2);
            sb2.append(qVar);
            sb2.append(str);
            sb2.append(F.class.getSimpleName());
            throw new IllegalArgumentException(sb2.toString());
        } else if (!(o instanceof com.soundcloud.android.foundation.ads.C3691s.a)) {
            pXa.d();
        } else if (qVar instanceof F) {
            F f2 = (F) qVar;
            com.soundcloud.android.foundation.ads.C3691s.a aVar = (com.soundcloud.android.foundation.ads.C3691s.a) o;
            C3508cda c2 = qVar.c();
            C7471uYa.a((Object) c2, "updatedTrackItem.urn");
            a(f2, (G) H.a(aVar, c2));
        } else {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str2);
            sb3.append(qVar);
            sb3.append(str);
            sb3.append(F.class.getSimpleName());
            throw new IllegalArgumentException(sb3.toString());
        }
    }

    /* access modifiers changed from: private */
    public void a(q qVar) {
        C3676c cVar = (C3676c) qVar.a().d();
        if (cVar != null) {
            C3508cda i2 = cVar.i();
            if (i2 != null) {
                C5327TLa tLa = this.f;
                C5443XLa<C3431IZ> xLa = C3876taa.h;
                C7471uYa.a((Object) xLa, "EventQueue.AD_PLAYBACK");
                tLa.c(xLa, new c(C6850lWa.a(i2), defpackage.C3431IZ.c.a.INCOMPATIBLE_DEVICE_STATE));
            }
        }
    }

    public static /* synthetic */ void a(Na na, boolean z, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 1) != 0) {
                z = false;
            }
            na.a(z);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clearAllAdsFromQueue");
    }

    public void a(boolean z) {
        List<q> b2 = this.c.b(Ma.a);
        List<C3676c> D = z ? this.c.D() : C6918mWa.a();
        C7471uYa.a((Object) b2, "itemsRemoved");
        String str = "overlaysRemoved";
        if (!(!b2.isEmpty())) {
            C7471uYa.a((Object) D, str);
            if (!(!D.isEmpty())) {
                return;
            }
        }
        C2350WH b3 = this.l.b();
        C3508cda e2 = this.c.e();
        C7471uYa.a((Object) e2, "playQueueManager.collectionUrn");
        b3.accept(new com.soundcloud.android.foundation.playqueue.p.a(e2));
        ArrayList arrayList = new ArrayList();
        for (q qVar : b2) {
            C7471uYa.a((Object) qVar, "it");
            C3508cda f2 = ((C3676c) qVar.a().b()).f();
            if (f2 != null) {
                arrayList.add(f2);
            }
        }
        C7471uYa.a((Object) D, str);
        ArrayList arrayList2 = new ArrayList();
        for (C3676c i2 : D) {
            C3508cda i3 = i2.i();
            if (i3 != null) {
                arrayList2.add(i3);
            }
        }
        List c2 = C7676xWa.c((Collection) arrayList, (Iterable) arrayList2);
        C5327TLa tLa = this.f;
        C5443XLa<C3431IZ> xLa = C3876taa.h;
        C7471uYa.a((Object) xLa, "EventQueue.AD_PLAYBACK");
        tLa.c(xLa, new c(c2, null, 2, null));
    }
}
