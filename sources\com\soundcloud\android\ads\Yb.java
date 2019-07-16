package com.soundcloud.android.ads;

import com.soundcloud.android.accounts.C2526g;
import com.soundcloud.android.cast.C2732f;
import com.soundcloud.android.foundation.ads.C3675b.C0090b;
import com.soundcloud.android.foundation.ads.C3676c;
import com.soundcloud.android.foundation.ads.C3678e;
import com.soundcloud.android.foundation.ads.C3686m;
import com.soundcloud.android.foundation.ads.C3693u;
import com.soundcloud.android.foundation.ads.G;
import com.soundcloud.android.foundation.ads.K;
import com.soundcloud.android.foundation.ads.aa;
import com.soundcloud.android.foundation.ads.ba;
import com.soundcloud.android.foundation.ads.ca;
import com.soundcloud.android.foundation.events.C3699a;
import com.soundcloud.android.foundation.events.C3700b;
import com.soundcloud.android.foundation.events.C3703e;
import com.soundcloud.android.foundation.events.I;
import com.soundcloud.android.foundation.events.J;
import com.soundcloud.android.foundation.playqueue.F;
import com.soundcloud.android.foundation.playqueue.q;
import com.soundcloud.android.playback.Ba;
import com.soundcloud.android.playback.C4431ub;
import com.soundcloud.android.playback.ie;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.TimeUnit;

@EVa(d1 = {"\u0000\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0017\u0018\u0000 ~2\u00020\u0001:\u0005}~\u0001B\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u0012\u0006\u0010\u001a\u001a\u00020\u001b\u0012\u0006\u0010\u001c\u001a\u00020\u001d\u0012\u0006\u0010\u001e\u001a\u00020\u001f¢\u0006\u0002\u0010 B\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010!\u001a\u00020\"\u0012\u0006\u0010#\u001a\u00020$\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u0012\u0006\u0010\u001a\u001a\u00020\u001b\u0012\u0006\u0010\u001e\u001a\u00020\u001f\u0012\u0006\u0010\u001c\u001a\u00020\u001d¢\u0006\u0002\u0010%J\u0010\u0010<\u001a\u00020'2\u0006\u0010=\u001a\u00020>H\u0012J\b\u0010?\u001a\u00020@H\u0012J\b\u0010A\u001a\u00020@H\u0016J\u0010\u0010B\u001a\u00020C2\u0006\u0010D\u001a\u00020EH\u0012J\u001e\u0010F\u001a\u00020G2\u0006\u0010H\u001a\u00020*2\f\u0010I\u001a\b\u0012\u0004\u0012\u00020+0JH\u0012J\u001e\u0010K\u001a\u00020@2\u0006\u0010=\u001a\u00020>2\f\u0010L\u001a\b\u0012\u0004\u0012\u00020-0MH\u0012J\u0010\u0010N\u001a\u00020O2\u0006\u0010P\u001a\u000205H\u0012J\u001e\u0010Q\u001a\u00020@2\u0006\u0010=\u001a\u00020>2\f\u0010L\u001a\b\u0012\u0004\u0012\u00020R0MH\u0012J\u0010\u0010S\u001a\u00020T2\u0006\u0010P\u001a\u00020UH\u0012J\b\u0010V\u001a\u00020@H\u0012J\b\u0010W\u001a\u00020@H\u0012J\u0010\u0010X\u001a\u00020'2\u0006\u0010Y\u001a\u00020*H\u0012J\u0015\u0010Z\u001a\u00020@2\u0006\u0010[\u001a\u00020\\H\u0010¢\u0006\u0002\b]J\u0010\u0010^\u001a\u00020@2\u0006\u0010_\u001a\u00020`H\u0016J\u0010\u0010a\u001a\u00020@2\u0006\u0010P\u001a\u00020EH\u0016J\u0010\u0010b\u001a\u00020@2\u0006\u00102\u001a\u00020'H\u0016J\b\u0010c\u001a\u00020@H\u0016J\u0015\u0010d\u001a\u00020@2\u0006\u0010e\u001a\u00020'H\u0010¢\u0006\u0002\bfJ\b\u0010g\u001a\u00020@H\u0016J\b\u0010h\u001a\u00020@H\u0016J\u0010\u0010i\u001a\u00020@2\u0006\u0010j\u001a\u000205H\u0016J\u0010\u0010k\u001a\u00020@2\u0006\u0010[\u001a\u00020lH\u0016J\r\u0010m\u001a\u00020@H\u0010¢\u0006\u0002\bnJ\u0010\u0010o\u001a\u00020@2\u0006\u0010P\u001a\u00020UH\u0016J\b\u0010p\u001a\u00020@H\u0016J\b\u0010q\u001a\u00020@H\u0016J\b\u0010r\u001a\u00020'H\u0012J\b\u0010s\u001a\u00020'H\u0012J\u0010\u0010t\u001a\u00020@2\u0006\u0010P\u001a\u000205H\u0012J\u0016\u0010u\u001a\b\u0012\u0004\u0012\u00020G0v2\u0006\u0010=\u001a\u00020>H\u0012J\b\u0010w\u001a\u00020@H\u0012J\b\u0010x\u001a\u00020@H\u0016J\u0010\u0010y\u001a\u00020@2\u0006\u0010j\u001a\u000205H\u0012J\f\u0010z\u001a\u00020'*\u00020UH\u0012J\f\u0010{\u001a\u00020'*\u000205H\u0012J\f\u0010|\u001a\u00020'*\u00020EH\u0012R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020'X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010(\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020+0)X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010,\u001a\u0004\u0018\u00010-X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0004¢\u0006\u0002\n\u0000R\u001e\u0010.\u001a\u0012\u0012\u0004\u0012\u00020*\u0012\b\u0012\u00060/R\u00020\u00000)X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020$X\u0004¢\u0006\u0002\n\u0000R\u000e\u00100\u001a\u00020'X\u000e¢\u0006\u0002\n\u0000R\u000e\u00101\u001a\u00020'X\u000e¢\u0006\u0002\n\u0000R\u000e\u00102\u001a\u00020'X\u000e¢\u0006\u0002\n\u0000R\u000e\u00103\u001a\u00020'X\u000e¢\u0006\u0002\n\u0000R\u000e\u00104\u001a\u000205X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\"X\u0004¢\u0006\u0002\n\u0000R\u000e\u00106\u001a\u000207X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u0014\u00108\u001a\u00020*8RX\u0004¢\u0006\u0006\u001a\u0004\b9\u0010:R\u000e\u0010\u001e\u001a\u00020\u001fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010;\u001a\u00020'X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0001"}, d2 = {"Lcom/soundcloud/android/ads/PlayerAdsController;", "", "analytics", "Lcom/soundcloud/android/foundation/events/Analytics;", "accountOperations", "Lcom/soundcloud/android/accounts/AccountOperations;", "adsOperations", "Lcom/soundcloud/android/ads/AdsOperations;", "featureOperations", "Lcom/soundcloud/android/configuration/plans/FeatureOperations;", "videoSourceProvider", "Lcom/soundcloud/android/playback/VideoSourceProvider;", "playQueueManager", "Lcom/soundcloud/android/features/playqueue/PlayQueueManager;", "trackRepository", "Lcom/soundcloud/android/foundation/domain/tracks/TrackRepository;", "castConnectionHelper", "Lcom/soundcloud/android/cast/CastConnectionHelper;", "connectionHelper", "Lcom/soundcloud/android/utilities/android/network/ConnectionHelper;", "deviceHelper", "Lcom/soundcloud/android/utils/DeviceHelper;", "adTimerHelper", "Lcom/soundcloud/android/ads/AdTimerHelper;", "errorAdController", "Lcom/soundcloud/android/ads/ErrorAdController;", "adErrorTrackingManager", "Lcom/soundcloud/android/ads/AdErrorTrackingManager;", "adViewabilityController", "Lcom/soundcloud/android/foundation/ads/AdViewabilityController;", "urlWithPlaceholderBuilder", "Lcom/soundcloud/android/events/UrlWithPlaceholderBuilder;", "(Lcom/soundcloud/android/foundation/events/Analytics;Lcom/soundcloud/android/accounts/AccountOperations;Lcom/soundcloud/android/ads/AdsOperations;Lcom/soundcloud/android/configuration/plans/FeatureOperations;Lcom/soundcloud/android/playback/VideoSourceProvider;Lcom/soundcloud/android/features/playqueue/PlayQueueManager;Lcom/soundcloud/android/foundation/domain/tracks/TrackRepository;Lcom/soundcloud/android/cast/CastConnectionHelper;Lcom/soundcloud/android/utilities/android/network/ConnectionHelper;Lcom/soundcloud/android/utils/DeviceHelper;Lcom/soundcloud/android/ads/AdTimerHelper;Lcom/soundcloud/android/ads/ErrorAdController;Lcom/soundcloud/android/ads/AdErrorTrackingManager;Lcom/soundcloud/android/foundation/ads/AdViewabilityController;Lcom/soundcloud/android/events/UrlWithPlaceholderBuilder;)V", "scheduler", "Lio/reactivex/Scheduler;", "fetchOperationStaleTime", "", "(Lcom/soundcloud/android/foundation/events/Analytics;Lcom/soundcloud/android/accounts/AccountOperations;Lcom/soundcloud/android/ads/AdsOperations;Lcom/soundcloud/android/configuration/plans/FeatureOperations;Lcom/soundcloud/android/playback/VideoSourceProvider;Lcom/soundcloud/android/features/playqueue/PlayQueueManager;Lcom/soundcloud/android/foundation/domain/tracks/TrackRepository;Lcom/soundcloud/android/cast/CastConnectionHelper;Lio/reactivex/Scheduler;JLcom/soundcloud/android/utilities/android/network/ConnectionHelper;Lcom/soundcloud/android/utils/DeviceHelper;Lcom/soundcloud/android/ads/AdTimerHelper;Lcom/soundcloud/android/ads/ErrorAdController;Lcom/soundcloud/android/ads/AdErrorTrackingManager;Lcom/soundcloud/android/events/UrlWithPlaceholderBuilder;Lcom/soundcloud/android/foundation/ads/AdViewabilityController;)V", "adOverlayImpressionEventEmitted", "", "adRequestIds", "Ljava/util/HashMap;", "Lcom/soundcloud/android/foundation/domain/Urn;", "", "adsForNextTrack", "Lcom/soundcloud/android/foundation/ads/ApiAdsForTrack;", "currentAdsFetches", "Lcom/soundcloud/android/ads/PlayerAdsController$AdsFetchOperation;", "isCommentsOpen", "isForeground", "isInAdRequestWindow", "isPlayerExpanded", "lastPlayStateEvent", "Lcom/soundcloud/android/playback/PlayState;", "skipFailedAdDisposable", "Lio/reactivex/disposables/Disposable;", "upcomingMonetizableUrn", "getUpcomingMonetizableUrn", "()Lcom/soundcloud/android/foundation/domain/Urn;", "visualAdImpressionEventEmitted", "alreadyFetchedAdForTrack", "playQueueItem", "Lcom/soundcloud/android/foundation/playqueue/PlayQueueItem;", "checkAndFetchInterstitialForCurrentTrack", "", "clearAds", "createAdOverlayImpressionEvent", "Lcom/soundcloud/android/events/AdOverlayTrackingEvent;", "adOverlayImpressionState", "Lcom/soundcloud/android/ads/AdOverlayImpressionState;", "createAdRequestData", "Lcom/soundcloud/android/ads/AdRequestData;", "monetizableTrackUrn", "kruxSegments", "Lcom/soundcloud/java/optional/Optional;", "createAdsFetchObservable", "adObserver", "Lcom/soundcloud/android/rx/observers/DefaultObserver;", "createErrorEvent", "Lcom/soundcloud/android/foundation/events/TrackingEvent;", "state", "createInterstitialFetchObservable", "Lcom/soundcloud/android/foundation/ads/InterstitialAd$ApiModel;", "createVisualAdImpressionEvent", "Lcom/soundcloud/android/events/VisualAdImpressionEvent;", "Lcom/soundcloud/android/ads/VisualAdImpressionState;", "fetchAdForNextTrack", "fetchInterstitialForCurrentTrack", "isNotCurrentOrNextItem", "monetizableUrn", "onActivityLifeCycleEvent", "latestState", "Lcom/soundcloud/android/foundation/events/ActivityLifeCycleEvent;", "onActivityLifeCycleEvent$base_release", "onAdOverlayEvent", "event", "Lcom/soundcloud/android/events/AdOverlayEvent;", "onAdOverlayImpressionState", "onAdRequestWindowChanged", "onAdTimerFinished", "onCommentsVisibilityEvent", "boolean", "onCommentsVisibilityEvent$base_release", "onCurrentPlayQueueItem", "onPlaybackEnded", "onPlaybackStateChanged", "playStateEvent", "onPlayerState", "Lcom/soundcloud/android/events/PlayerUIEvent;", "onQueueUpdate", "onQueueUpdate$base_release", "onVisualAdImpressionState", "publishAdDeliveryEventIfUpcoming", "reconfigureAdForNextTrack", "shouldFetchAdsForCurrentTrack", "shouldFetchAdsForNextTrack", "skipFailedAd", "trackKruxObservable", "Lio/reactivex/Observable;", "trackVideoAdLoadingError", "unlockVisualAdImpression", "unsubscribeFailedAdSkip", "isAdVisible", "isBufferingAd", "isVisibleWithImpressionNotEmitted", "AdsFetchOperation", "Companion", "CurrentTrackInterstitialSubscriber", "NextTrackSubscriber", "base_release"}, mv = {1, 1, 15})
/* compiled from: PlayerAdsController.kt */
public class Yb {
    private static final long a = TimeUnit.MINUTES.toMillis(10);
    public static final b b = new b(null);
    private final Cb A;
    /* access modifiers changed from: private */
    public final C2586ja B;
    private final Yaa C;
    private final C3678e D;
    private final HashMap<C3508cda, a> c;
    /* access modifiers changed from: private */
    public final HashMap<C3508cda, String> d;
    private VPa e;
    /* access modifiers changed from: private */
    public C3686m f;
    private boolean g;
    /* access modifiers changed from: private */
    public boolean h;
    /* access modifiers changed from: private */
    public boolean i;
    private boolean j;
    private boolean k;
    private boolean l;
    private C4431ub m;
    /* access modifiers changed from: private */
    public final C3700b n;
    private final C2526g o;
    /* access modifiers changed from: private */
    public final Na p;
    private final C2436_U q;
    private final ie r;
    /* access modifiers changed from: private */
    public final C3814lca s;
    private final C3760eea t;
    private final C2732f u;
    private final HPa v;
    /* access modifiers changed from: private */
    public final long w;
    private final C6834lGa x;
    private final C6699jHa y;
    private final Ia z;

    /* compiled from: PlayerAdsController.kt */
    private final class a {
        private final long a = System.currentTimeMillis();
        private final VPa b;
        final /* synthetic */ Yb c;

        public a(Yb yb, VPa vPa) {
            C7471uYa.b(vPa, "disposable");
            this.c = yb;
            this.b = vPa;
        }

        public final void a() {
            this.b.dispose();
        }

        public final boolean b() {
            return System.currentTimeMillis() - this.a > this.c.w;
        }
    }

    /* compiled from: PlayerAdsController.kt */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(C7264rYa rya) {
            this();
        }
    }

    /* compiled from: PlayerAdsController.kt */
    private final class c extends C5037Jua<com.soundcloud.android.foundation.ads.P.a> {
        private final q d;
        final /* synthetic */ Yb e;

        public c(Yb yb, q qVar) {
            C7471uYa.b(qVar, "currentItem");
            this.e = yb;
            this.d = qVar;
        }

        public void a(com.soundcloud.android.foundation.ads.P.a aVar) {
            C7471uYa.b(aVar, "interstitialAd");
            if (this.e.s.b(this.d) && (this.d instanceof F)) {
                this.e.p.a((F) this.d, aVar);
            }
        }
    }

    /* compiled from: PlayerAdsController.kt */
    private final class d extends C5037Jua<C3686m> {
        private final q d;
        final /* synthetic */ Yb e;

        public d(Yb yb, q qVar) {
            C7471uYa.b(qVar, "currentItem");
            this.e = yb;
            this.d = qVar;
        }

        public void a(C3686m mVar) {
            C7471uYa.b(mVar, "apiAdsForTrack");
            if (this.e.s.b(this.d)) {
                this.e.f = mVar;
                this.e.p.a(mVar);
            }
        }
    }

    public Yb(C3700b bVar, C2526g gVar, Na na, C2436_U _u, ie ieVar, C3814lca lca, C3760eea eea, C2732f fVar, HPa hPa, long j2, C6834lGa lga, C6699jHa jha, Ia ia, Cb cb, C2586ja jaVar, Yaa yaa, C3678e eVar) {
        C3700b bVar2 = bVar;
        C2526g gVar2 = gVar;
        Na na2 = na;
        C2436_U _u2 = _u;
        ie ieVar2 = ieVar;
        C3814lca lca2 = lca;
        C3760eea eea2 = eea;
        C2732f fVar2 = fVar;
        HPa hPa2 = hPa;
        C6834lGa lga2 = lga;
        C6699jHa jha2 = jha;
        Ia ia2 = ia;
        Cb cb2 = cb;
        C2586ja jaVar2 = jaVar;
        Yaa yaa2 = yaa;
        C7471uYa.b(bVar2, "analytics");
        C7471uYa.b(gVar2, "accountOperations");
        C7471uYa.b(na2, "adsOperations");
        C7471uYa.b(_u2, "featureOperations");
        C7471uYa.b(ieVar2, "videoSourceProvider");
        C7471uYa.b(lca2, "playQueueManager");
        C7471uYa.b(eea2, "trackRepository");
        C7471uYa.b(fVar2, "castConnectionHelper");
        C7471uYa.b(hPa2, "scheduler");
        C7471uYa.b(lga2, "connectionHelper");
        C7471uYa.b(jha2, "deviceHelper");
        C7471uYa.b(ia2, "adTimerHelper");
        C7471uYa.b(cb2, "errorAdController");
        C7471uYa.b(jaVar2, "adErrorTrackingManager");
        C7471uYa.b(yaa2, "urlWithPlaceholderBuilder");
        C3678e eVar2 = eVar;
        C7471uYa.b(eVar2, "adViewabilityController");
        this.n = bVar2;
        this.o = gVar2;
        this.p = na2;
        this.q = _u2;
        this.r = ieVar2;
        this.s = lca2;
        this.t = eea2;
        this.u = fVar2;
        this.v = hPa2;
        this.w = j2;
        this.x = lga2;
        this.y = jha2;
        this.z = ia2;
        this.A = cb2;
        this.B = jaVar2;
        this.C = yaa;
        this.D = eVar2;
        this.c = new HashMap<>(2);
        this.d = new HashMap<>(2);
        this.e = C4881Eua.b();
        this.m = Ba.a;
    }

    private void j() {
        q n2 = this.s.n();
        q h2 = this.s.h();
        C7471uYa.a((Object) h2, "playQueueManager.currentPlayQueueItem");
        d dVar = new d(this, h2);
        C7471uYa.a((Object) n2, "nextItem");
        a(n2, (C5037Jua<C3686m>) dVar);
    }

    private void k() {
        q h2 = this.s.h();
        C7471uYa.a((Object) h2, "currentItem");
        b(h2, new c(this, h2));
    }

    private C3508cda l() {
        Object obj;
        List c2 = this.s.c(2);
        Set keySet = this.c.keySet();
        C7471uYa.a((Object) keySet, "currentAdsFetches.keys");
        Iterator it = keySet.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (c2.contains((C3508cda) obj)) {
                break;
            }
        }
        C3508cda cda = (C3508cda) obj;
        if (cda != null) {
            return cda;
        }
        C3508cda cda2 = C3508cda.a;
        C7471uYa.a((Object) cda2, "Urn.NOT_SET");
        return cda2;
    }

    private boolean m() {
        if (this.q.j() && !this.z.a() && !this.u.e()) {
            q h2 = this.s.h();
            String str = "playQueueManager.currentPlayQueueItem";
            C7471uYa.a((Object) h2, str);
            if (h2.j() && !this.p.d()) {
                q h3 = this.s.h();
                C7471uYa.a((Object) h3, str);
                if (!a(h3)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean n() {
        if (this.q.j() && !this.z.a() && this.g && !this.u.e() && this.s.v() && !this.p.h() && !this.p.d()) {
            q n2 = this.s.n();
            C7471uYa.a((Object) n2, "playQueueManager.nextPlayQueueItem");
            if (!a(n2)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: private */
    public void o() {
        C3676c a2 = this.p.a();
        if (a2 instanceof aa) {
            this.D.d(((aa) a2).I());
        }
    }

    private void i() {
        if (m()) {
            k();
        }
    }

    public void b(boolean z2) {
        this.j = z2;
    }

    public void c() {
        String str = null;
        this.f = null;
        Iterator it = this.c.entrySet().iterator();
        while (it.hasNext()) {
            Object next = it.next();
            C7471uYa.a(next, "iter.next()");
            Entry entry = (Entry) next;
            Object key = entry.getKey();
            C7471uYa.a(key, "operation.key");
            if (a((C3508cda) key) || ((a) entry.getValue()).b()) {
                ((a) entry.getValue()).a();
                it.remove();
            }
        }
        this.e.dispose();
        if (!this.p.d()) {
            Na.a(this.p, false, 1, (Object) null);
        }
        G b2 = this.p.b();
        if (b2 != null) {
            Cb cb = this.A;
            I l2 = this.s.l();
            if (l2 != null) {
                str = l2.b();
            }
            cb.a(b2, str);
            C3814lca lca = this.s;
            lca.d(lca.h());
        }
        i();
    }

    public void d() {
        if (this.p.d()) {
            C3676c c2 = this.p.c();
            if (!(c2 instanceof ca)) {
                c2 = null;
            }
            ca caVar = (ca) c2;
            if (caVar != null) {
                caVar.t();
            }
        }
    }

    public void e() {
        if (n()) {
            j();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0026, code lost:
        if (r2 != null) goto L_0x002b;
     */
    public void f() {
        C3508cda cda;
        C3508cda l2 = l();
        if ((!C7471uYa.a((Object) l2, (Object) C3508cda.a)) && this.f != null && this.d.containsKey(l2)) {
            C3676c c2 = this.p.c();
            if (c2 != null) {
                cda = c2.f();
            }
            cda = C3508cda.a;
            C3508cda cda2 = cda;
            C3700b bVar = this.n;
            C3410BZ a2 = C3410BZ.a(C4928GKa.c(l2), cda2, (String) this.d.get(l2), this.i, this.h, C4928GKa.b(c2 != null ? c2.k() : null));
            C7471uYa.a((Object) a2, "AdDeliveryEvent.adDelive…onType)\n                )");
            bVar.a((J) a2);
        }
    }

    public void g() {
        boolean z2 = !this.h || this.j;
        C3686m mVar = this.f;
        if (z2 && mVar != null && this.s.t()) {
            q n2 = this.s.n();
            if (n2 instanceof com.soundcloud.android.foundation.playqueue.C3719f.b) {
                this.p.a(mVar, (com.soundcloud.android.foundation.playqueue.C3719f.b) n2);
            } else if (!(n2 instanceof F)) {
            } else {
                if (this.p.i()) {
                    this.p.a(mVar, (F) n2);
                    return;
                }
                com.soundcloud.android.foundation.ads.C3693u.a l2 = mVar.l();
                if (l2 != null) {
                    this.p.a((F) n2, l2);
                }
            }
        }
    }

    public void h() {
        this.l = false;
    }

    private C3506cba b(kd kdVar) {
        C3676c a2 = kdVar.a();
        if (!(a2 instanceof C3693u)) {
            a2 = null;
        }
        C3506cba a3 = C3506cba.a((C3693u) a2, this.o.c(), this.s.l(), this.C);
        C7471uYa.a((Object) a3, "VisualAdImpressionEvent.…ceholderBuilder\n        )");
        return a3;
    }

    private void d(C4431ub ubVar) {
        this.e.dispose();
        IPa c2 = IPa.c((long) 6, TimeUnit.SECONDS, this.v);
        C5250Qua a2 = C5250Qua.a(new C2546ac(this, ubVar));
        c2.c(a2);
        C7471uYa.a((Object) a2, "Single.timer(FAILED_AD_W…ableItem()\n            })");
        this.e = a2;
    }

    private void e(C4431ub ubVar) {
        if (ubVar.j() || ubVar.k()) {
            this.e.dispose();
        } else if (ubVar.l() && this.p.d()) {
            SDb.a("ScAds").d("Error play state event is reported for the current ad item.", new Object[0]);
            C2586ja jaVar = this.B;
            C0090b bVar = C0090b.GENERAL_LINEAR_FAIL;
            C3676c a2 = this.p.a();
            List list = null;
            if (!(a2 instanceof K)) {
                a2 = null;
            }
            K k2 = (K) a2;
            if (k2 != null) {
                list = k2.d();
            }
            jaVar.a(bVar, list);
            this.e.dispose();
            o();
            this.s.c();
        }
    }

    public void a(C3422FZ fz) {
        C7471uYa.b(fz, "event");
        if (fz.c() == 1) {
            this.k = false;
        }
    }

    public Yb(C3700b bVar, C2526g gVar, Na na, C2436_U _u, ie ieVar, C3814lca lca, C3760eea eea, C2732f fVar, C6834lGa lga, C6699jHa jha, Ia ia, Cb cb, C2586ja jaVar, C3678e eVar, Yaa yaa) {
        C3700b bVar2 = bVar;
        C2526g gVar2 = gVar;
        Na na2 = na;
        C2436_U _u2 = _u;
        ie ieVar2 = ieVar;
        C3814lca lca2 = lca;
        C3760eea eea2 = eea;
        C2732f fVar2 = fVar;
        C6834lGa lga2 = lga;
        C6699jHa jha2 = jha;
        Ia ia2 = ia;
        Cb cb2 = cb;
        C2586ja jaVar2 = jaVar;
        C3678e eVar2 = eVar;
        Yaa yaa2 = yaa;
        C7471uYa.b(bVar, "analytics");
        C7471uYa.b(gVar, "accountOperations");
        C7471uYa.b(na, "adsOperations");
        C7471uYa.b(_u, "featureOperations");
        C7471uYa.b(ieVar, "videoSourceProvider");
        C7471uYa.b(lca, "playQueueManager");
        C7471uYa.b(eea, "trackRepository");
        C7471uYa.b(fVar, "castConnectionHelper");
        C7471uYa.b(lga, "connectionHelper");
        C7471uYa.b(jha, "deviceHelper");
        C7471uYa.b(ia, "adTimerHelper");
        C7471uYa.b(cb, "errorAdController");
        C7471uYa.b(jaVar, "adErrorTrackingManager");
        C7471uYa.b(eVar, "adViewabilityController");
        C7471uYa.b(yaa, "urlWithPlaceholderBuilder");
        HPa a2 = RPa.a();
        HPa hPa = a2;
        C7471uYa.a((Object) a2, "AndroidSchedulers.mainThread()");
        this(bVar2, gVar2, na2, _u2, ieVar2, lca2, eea2, fVar2, hPa, a, lga2, jha2, ia2, cb2, jaVar2, yaa2, eVar2);
    }

    public void a(C2641xa xaVar) {
        C7471uYa.b(xaVar, "state");
        if (c(xaVar)) {
            C3425GZ b2 = b(xaVar);
            this.k = true;
            this.n.a((J) b2);
        }
    }

    private C3425GZ b(C2641xa xaVar) {
        C3425GZ a2 = C3425GZ.a(xaVar.a(), xaVar.b(), this.o.c(), xaVar.c(), this.C);
        C7471uYa.a((Object) a2, "AdOverlayTrackingEvent.f…ceholderBuilder\n        )");
        return a2;
    }

    public void a(kd kdVar) {
        C7471uYa.b(kdVar, "state");
        if (c(kdVar)) {
            C3506cba b2 = b(kdVar);
            this.l = true;
            this.n.a((J) b2);
        }
    }

    private void b(q qVar, C5037Jua<com.soundcloud.android.foundation.ads.P.a> jua) {
        APa a2 = b(qVar).g(new _b(this, qVar)).a(RPa.a());
        HashMap<C3508cda, a> hashMap = this.c;
        C3508cda c2 = qVar.c();
        C7471uYa.a((Object) c2, "playQueueItem.urn");
        GPa c3 = a2.c(jua);
        C7471uYa.a((Object) c3, "apiAdsForTrack.subscribeWith(adObserver)");
        hashMap.put(c2, new a(this, (VPa) c3));
    }

    public void a() {
        this.f = null;
        this.p.a(true);
    }

    private APa<Fa> b(q qVar) {
        C3760eea eea = this.t;
        C3508cda c2 = qVar.c();
        C7471uYa.a((Object) c2, "playQueueItem.urn");
        APa<Fa> b2 = APa.b((EPa<? extends T1>) Nda.a(eea.a(c2, defpackage.C3760eea.a.SYNC_MISSING)).g().a((C7256rQa<? super T>) C2550bc.a).h(C2554cc.a), (EPa<? extends T2>) this.p.j().j(), (C6504gQa<? super T1, ? super T2, ? extends R>) new C2564dc<Object,Object,Object>(this));
        C7471uYa.a((Object) b2, "Observable.zip(\n        …xSegments)\n            })");
        return b2;
    }

    private boolean c(kd kdVar) {
        return !this.l && kdVar.c() && kdVar.a() != null && kdVar.e() && kdVar.b() && !kdVar.d();
    }

    public void a(boolean z2) {
        this.g = z2;
        if (n()) {
            j();
        }
    }

    private boolean c(C2641xa xaVar) {
        return !this.k && xaVar.d() && xaVar.g() && xaVar.e() && !xaVar.f();
    }

    private boolean c(C4431ub ubVar) {
        return ubVar.f() && this.p.d();
    }

    public void a(C4431ub ubVar) {
        C7471uYa.b(ubVar, "playStateEvent");
        this.m = ubVar;
        e(ubVar);
        if (c(ubVar)) {
            d(ubVar);
        }
    }

    /* access modifiers changed from: private */
    public J b(C4431ub ubVar) {
        C3676c a2 = this.p.a();
        String str = "Required value was null.";
        if (a2 != null) {
            C3508cda i2 = a2.i();
            if (i2 == null) {
                throw new IllegalArgumentException(str);
            } else if (a2 instanceof aa) {
                defpackage.C3428HZ.c cVar = new defpackage.C3428HZ.c(i2, ubVar.a(), ubVar.n(), (ba) this.r.a().d(), 0, null, 48, null);
                return cVar;
            } else {
                defpackage.C3428HZ.a aVar = new defpackage.C3428HZ.a(i2, ubVar.a(), ubVar.n(), 0, null, 24, null);
                return aVar;
            }
        } else {
            throw new IllegalArgumentException(str);
        }
    }

    public void a(C3699a aVar) {
        C7471uYa.b(aVar, "latestState");
        this.h = aVar.b();
    }

    public void a(Iaa iaa) {
        C7471uYa.b(iaa, "latestState");
        this.i = iaa.c() == 0;
    }

    private boolean a(q qVar) {
        return this.c.containsKey(qVar.c());
    }

    private void a(q qVar, C5037Jua<C3686m> jua) {
        APa a2 = b(qVar).g(new Zb(this, qVar)).a(RPa.a());
        HashMap<C3508cda, a> hashMap = this.c;
        C3508cda c2 = qVar.c();
        C7471uYa.a((Object) c2, "playQueueItem.urn");
        GPa c3 = a2.c(jua);
        C7471uYa.a((Object) c3, "apiAdsForTrack.subscribeWith(adObserver)");
        hashMap.put(c2, new a(this, (VPa) c3));
    }

    public void b() {
        SDb.a("ScAds").a("Ad timer finished, resuming ads requests", new Object[0]);
        if (n()) {
            j();
        }
    }

    /* access modifiers changed from: private */
    public Fa a(C3508cda cda, C4928GKa<String> gKa) {
        return Fa.a.a(cda, gKa, this.y.d(), this.x.b(), this.i ? com.soundcloud.android.foundation.ads.C3675b.c.EXPANDED : com.soundcloud.android.foundation.ads.C3675b.c.COLLAPSED, this.y.f(), this.h ? C3703e.FOREGROUND : C3703e.BACKGROUND);
    }

    private boolean a(C3508cda cda) {
        q h2 = this.s.h();
        C7471uYa.a((Object) h2, "playQueueManager.currentPlayQueueItem");
        C3508cda d2 = h2.d();
        q n2 = this.s.n();
        C7471uYa.a((Object) n2, "playQueueManager.nextPlayQueueItem");
        return (C7471uYa.a((Object) d2, (Object) cda) ^ true) && (C7471uYa.a((Object) n2.d(), (Object) cda) ^ true);
    }
}
