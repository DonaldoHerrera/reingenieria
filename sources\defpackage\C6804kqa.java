package defpackage;

import com.soundcloud.android.foundation.events.C3700b;
import com.soundcloud.android.foundation.events.C3710l;
import com.soundcloud.android.foundation.events.I;
import com.soundcloud.android.foundation.events.J;
import com.soundcloud.android.foundation.events.PromotedSourceInfo;
import com.soundcloud.android.foundation.events.SearchQuerySourceInfo;
import com.soundcloud.android.foundation.playqueue.PlaySessionSource;
import com.soundcloud.android.likes.C3983h;
import com.soundcloud.android.offline.C4088fe;
import com.soundcloud.android.offline.C4197yd;
import com.soundcloud.android.playback.C4536zc;
import com.soundcloud.android.playback.Db;
import com.soundcloud.android.playback.playqueue.C4403wa;
import com.soundcloud.android.sync.T;
import java.util.Arrays;
import java.util.List;

@EVa(d1 = {"\u0000ø\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001oB¥\u0001\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0018\u0012\u0006\u0010\u0019\u001a\u00020\u001a\u0012\u0006\u0010\u001b\u001a\u00020\u001c\u0012\u0006\u0010\u001d\u001a\u00020\u001e\u0012\u0006\u0010\u001f\u001a\u00020 \u0012\u0006\u0010!\u001a\u00020\"\u0012\u0006\u0010#\u001a\u00020$\u0012\u0006\u0010%\u001a\u00020&\u0012\b\b\u0001\u0010'\u001a\u00020(\u0012\u0006\u0010)\u001a\u00020*¢\u0006\u0002\u0010+J\u001c\u0010;\u001a\b\u0012\u0004\u0012\u00020\u00060<2\f\u0010=\u001a\b\u0012\u0004\u0012\u0002080<H\u0002J\u0016\u0010>\u001a\u00020?2\f\u0010=\u001a\b\u0012\u0004\u0012\u00020@0<H\u0002J\u001c\u0010A\u001a\b\u0012\u0004\u0012\u00020@0<2\f\u0010=\u001a\b\u0012\u0004\u0012\u00020@0<H\u0002J\u001c\u0010B\u001a\b\u0012\u0004\u0012\u00020@0<2\f\u0010=\u001a\b\u0012\u0004\u0012\u00020@0<H\u0002J\u001c\u0010C\u001a\b\u0012\u0004\u0012\u00020@0<2\f\u0010=\u001a\b\u0012\u0004\u0012\u00020@0<H\u0002J\u001c\u0010D\u001a\b\u0012\u0004\u0012\u00020\u00060<2\f\u0010=\u001a\b\u0012\u0004\u0012\u00020@0<H\u0002J\u001c\u0010E\u001a\b\u0012\u0004\u0012\u00020\u00060<2\f\u0010=\u001a\b\u0012\u0004\u0012\u00020@0<H\u0002J\u001c\u0010F\u001a\b\u0012\u0004\u0012\u00020\u00060<2\f\u0010=\u001a\b\u0012\u0004\u0012\u00020@0<H\u0002J\u001c\u0010G\u001a\b\u0012\u0004\u0012\u00020H0<2\f\u0010=\u001a\b\u0012\u0004\u0012\u00020@0<H\u0002J\u001c\u0010I\u001a\b\u0012\u0004\u0012\u00020H0<2\f\u0010=\u001a\b\u0012\u0004\u0012\u00020@0<H\u0002J\u0016\u0010J\u001a\b\u0012\u0004\u0012\u00020\u00020<2\u0006\u0010K\u001a\u00020\u0002H\u0002J\u0010\u0010L\u001a\u00020\u00032\u0006\u0010M\u001a\u00020\u0004H\u0016J\b\u0010N\u001a\u00020\u0003H\u0016J\b\u0010O\u001a\u00020\u0003H\u0016J\u0010\u0010P\u001a\u00020Q2\u0006\u0010R\u001a\u00020\u0006H\u0002J \u0010S\u001a\u00020T2\u0006\u0010U\u001a\u00020\u00062\u0006\u0010V\u001a\u00020.2\u0006\u0010W\u001a\u00020XH\u0002J\u000e\u0010Y\u001a\b\u0012\u0004\u0012\u00020\u00020<H\u0002J\u0010\u0010Z\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010<H\u0002J\u001b\u0010[\u001a\b\u0012\u0004\u0012\u00020\u00020<2\u0006\u0010\\\u001a\u00020\u0003H\u0016¢\u0006\u0002\u0010]J\u001b\u0010^\u001a\b\u0012\u0004\u0012\u00020\u00020<2\u0006\u0010\\\u001a\u00020\u0003H\u0016¢\u0006\u0002\u0010]J\u0018\u0010_\u001a\u00020?2\u0006\u0010`\u001a\u00020@2\u0006\u0010a\u001a\u00020.H\u0002J\u0010\u0010b\u001a\u00020?2\u0006\u0010`\u001a\u00020@H\u0002J\u0010\u0010c\u001a\u00020\u00032\u0006\u0010`\u001a\u00020@H\u0002J\u0018\u0010d\u001a\u00020?2\u0006\u0010R\u001a\u00020\u00062\u0006\u0010W\u001a\u00020XH\u0002J\u001c\u0010e\u001a\b\u0012\u0004\u0012\u0002080<2\f\u0010=\u001a\b\u0012\u0004\u0012\u0002080<H\u0002J\u001c\u0010f\u001a\b\u0012\u0004\u0012\u00020@0<2\f\u0010=\u001a\b\u0012\u0004\u0012\u00020@0<H\u0002J\u000e\u0010g\u001a\b\u0012\u0004\u0012\u00020h0<H\u0002J\u001e\u0010i\u001a\b\u0012\u0004\u0012\u00020j0<2\u0006\u0010`\u001a\u00020@2\u0006\u0010k\u001a\u00020.H\u0002J\u0010\u0010l\u001a\u00020:2\u0006\u0010M\u001a\u00020\u0004H\u0002J\u0010\u0010m\u001a\u00020:2\u0006\u0010M\u001a\u00020\u0004H\u0002J\u0014\u0010n\u001a\b\u0012\u0004\u0012\u00020\u00060<2\u0006\u0010\u0005\u001a\u00020\u0006R\u000e\u0010\u0019\u001a\u00020\u001aX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0004¢\u0006\u0002\n\u0000R\u001c\u0010,\u001a\u0010\u0012\f\u0012\n /*\u0004\u0018\u00010.0.0-X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\"X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u001c\u00100\u001a\u0010\u0012\f\u0012\n /*\u0004\u0018\u00010\u00060\u00060-X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020(X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020$X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000R\u000e\u00101\u001a\u000202X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020*X\u0004¢\u0006\u0002\n\u0000R(\u00103\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u000206 /*\n\u0012\u0004\u0012\u000206\u0018\u0001050504X\u0004¢\u0006\u0002\n\u0000R\u001c\u00107\u001a\u0010\u0012\f\u0012\n /*\u0004\u0018\u0001080804X\u0004¢\u0006\u0002\n\u0000R\u000e\u00109\u001a\u00020:X.¢\u0006\u0002\n\u0000¨\u0006p"}, d2 = {"Lcom/soundcloud/android/playlists/PlaylistDetailsPresenter;", "Lcom/soundcloud/android/view/collection/LegacySimplePresenter;", "Lcom/soundcloud/android/playlists/PlaylistDetailsViewModel;", "", "Lcom/soundcloud/android/playlists/PlaylistDetailsPresenter$PlaylistDetailView;", "initialUrn", "Lcom/soundcloud/android/foundation/domain/Urn;", "screen", "", "searchQuerySourceInfo", "Lcom/soundcloud/android/foundation/events/SearchQuerySourceInfo;", "promotedSourceInfo", "Lcom/soundcloud/android/foundation/events/PromotedSourceInfo;", "playlistUpsellOperations", "Lcom/soundcloud/android/playlists/PlaylistUpsellOperations;", "playbackInitiator", "Lcom/soundcloud/android/playback/PlaybackInitiator;", "playlistOperations", "Lcom/soundcloud/android/playlists/PlaylistOperations;", "playQueueHelper", "Lcom/soundcloud/android/playback/playqueue/PlayQueueHelper;", "eventBus", "Lcom/soundcloud/rx/eventbus/EventBus;", "offlineContentOperations", "Lcom/soundcloud/android/offline/OfflineContentOperations;", "analytics", "Lcom/soundcloud/android/foundation/events/Analytics;", "likeOperations", "Lcom/soundcloud/android/likes/LikeOperations;", "dataSourceProvider", "Lcom/soundcloud/android/playlists/DataSourceProvider;", "repostOperations", "Lcom/soundcloud/android/associations/RepostOperations;", "featureOperations", "Lcom/soundcloud/android/configuration/plans/FeatureOperations;", "offlineSettingsStorage", "Lcom/soundcloud/android/offline/OfflineSettingsStorage;", "playlistDetailsMetadataBuilderFactory", "Lcom/soundcloud/android/playlists/PlaylistDetailsMetadataBuilderFactory;", "mainScheduler", "Lio/reactivex/Scheduler;", "syncInitiator", "Lcom/soundcloud/android/sync/SyncInitiator;", "(Lcom/soundcloud/android/foundation/domain/Urn;Ljava/lang/String;Lcom/soundcloud/android/foundation/events/SearchQuerySourceInfo;Lcom/soundcloud/android/foundation/events/PromotedSourceInfo;Lcom/soundcloud/android/playlists/PlaylistUpsellOperations;Lcom/soundcloud/android/playback/PlaybackInitiator;Lcom/soundcloud/android/playlists/PlaylistOperations;Lcom/soundcloud/android/playback/playqueue/PlayQueueHelper;Lcom/soundcloud/rx/eventbus/EventBus;Lcom/soundcloud/android/offline/OfflineContentOperations;Lcom/soundcloud/android/foundation/events/Analytics;Lcom/soundcloud/android/likes/LikeOperations;Lcom/soundcloud/android/playlists/DataSourceProvider;Lcom/soundcloud/android/associations/RepostOperations;Lcom/soundcloud/android/configuration/plans/FeatureOperations;Lcom/soundcloud/android/offline/OfflineSettingsStorage;Lcom/soundcloud/android/playlists/PlaylistDetailsMetadataBuilderFactory;Lio/reactivex/Scheduler;Lcom/soundcloud/android/sync/SyncInitiator;)V", "editModeChangedRelay", "Lcom/jakewharton/rxrelay2/BehaviorRelay;", "", "kotlin.jvm.PlatformType", "latestUrn", "playlistDetailsMetadataBuilder", "Lcom/soundcloud/android/playlists/PlaylistDetailsMetadataBuilder;", "updateTracklistRelay", "Lcom/jakewharton/rxrelay2/PublishRelay;", "", "Lcom/soundcloud/android/playlists/PlaylistDetailItem$PlaylistDetailTrackItem;", "upsellDismissedRelay", "Lcom/soundcloud/android/playlists/PlaylistDetailItem$PlaylistDetailUpsellItem;", "urnDisposable", "Lio/reactivex/disposables/Disposable;", "actionGoToUpsellFromTrack", "Lio/reactivex/Observable;", "trigger", "actionMakeAvailableOffline", "Lio/reactivex/Completable;", "Lcom/soundcloud/android/playlists/PlaylistDetailsMetadata;", "actionMakeAvailableOfflineFailed", "actionMakeOfflineUnavailableOfflineWithWarning", "actionMakeOfflineUnavailableOfflineWithoutWarning", "actionOnMakeOfflineUpsell", "actionOnOverflowMakeOfflineUpsell", "actionPlayNext", "actionPlayPlaylist", "Lcom/soundcloud/android/playback/PlaybackResult;", "actionPlayShuffled", "applyLocalChanges", "it", "attachView", "view", "create", "destroy", "getEventContext", "Lcom/soundcloud/android/foundation/events/EventContextMetadata;", "playlistUrn", "getOfflinePlaylistTrackingEvent", "Lcom/soundcloud/android/events/OfflineInteractionEvent;", "urn", "isMarkedForOffline", "playSessionSource", "Lcom/soundcloud/android/foundation/playqueue/PlaySessionSource;", "latestDataWhenNotEditing", "latestFeatureModel", "legacyLoad", "pageParams", "(Lkotlin/Unit;)Lio/reactivex/Observable;", "legacyRefresh", "like", "metadata", "shouldLike", "makePlaylistAvailableOffline", "makePlaylistUnAvailableOffline", "offlineOperation", "onFirstTrackUpsellImpression", "onOverflowUpsellImpression", "onPlaylistDeleted", "Lcom/soundcloud/android/events/UrnStateChangedEvent;", "repost", "Lcom/soundcloud/android/associations/RepostResult;", "shouldRepost", "subscribeToCommands", "trackPageViewEvents", "updatedPlaylistUrn", "PlaylistDetailView", "base_release"}, mv = {1, 1, 15})
/* renamed from: kqa reason: default package and case insensitive filesystem */
/* compiled from: PlaylistDetailsPresenter.kt */
public final class C6804kqa extends C7318sJa<C7218qra, RVa, RVa, a> {
    /* access modifiers changed from: private */
    public final C5662bpa A;
    private final C1997DR B;
    /* access modifiers changed from: private */
    public final C2436_U C;
    /* access modifiers changed from: private */
    public final C4088fe D;
    /* access modifiers changed from: private */
    public final HPa E;
    /* access modifiers changed from: private */
    public final T F;
    /* access modifiers changed from: private */
    public final C6600hqa l;
    private final C2314UH<C3508cda> m;
    private final C2332VH<f> n;
    private final C2332VH<List<e>> o;
    private final C2314UH<Boolean> p;
    private VPa q;
    private final C3508cda r;
    /* access modifiers changed from: private */
    public final C4972Hsa s;
    /* access modifiers changed from: private */
    public final Db t;
    private final C4909Fra u;
    /* access modifiers changed from: private */
    public final C4403wa v;
    /* access modifiers changed from: private */
    public final C5327TLa w;
    /* access modifiers changed from: private */
    public final C4197yd x;
    /* access modifiers changed from: private */
    public final C3700b y;
    private final C3983h z;

    @EVa(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\nH&J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\nH&J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\nH&J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\u000eH&J\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u000eH&J\u000e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u000eH&J\u000e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u000eH&J\u001a\u0010\u0015\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00100\u00160\u000eH&J\u000e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00140\u000eH&J\u000e\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00140\u000eH&J\u000e\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00140\u000eH&J\u000e\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00140\u000eH&J\u000e\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00140\u000eH&J\u000e\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00140\u000eH&J\u000e\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00040\u000eH&J\u000e\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00140\u000eH&J\u001a\u0010\u001f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00100\u00160\u000eH&J\u000e\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00140\u000eH&J\u000e\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00140\u000eH&J\u000e\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0\u000eH&J\u0014\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0%0\u000eH&J\u000e\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00120\u000eH&J\u000e\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00120\u000eH&J\u000e\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00040\u000eH&J\u0010\u0010)\u001a\u00020\u00042\u0006\u0010*\u001a\u00020+H&J\u0010\u0010,\u001a\u00020\u00042\u0006\u0010-\u001a\u00020\u0014H&J\u0010\u0010.\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010/\u001a\u00020\u00042\u0006\u00100\u001a\u000201H&J\u0010\u00102\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\nH&J\u0010\u00103\u001a\u00020\u00042\u0006\u00104\u001a\u000205H&¨\u00066"}, d2 = {"Lcom/soundcloud/android/playlists/PlaylistDetailsPresenter$PlaylistDetailView;", "Lcom/soundcloud/android/uniflow/UniflowBaseView;", "Lcom/soundcloud/android/playlists/PlaylistDetailsViewModel;", "Lcom/soundcloud/android/view/collection/LegacyError;", "", "goBack", "ignored", "", "goToContentUpsell", "urn", "Lcom/soundcloud/android/foundation/domain/Urn;", "goToCreator", "goToOfflineUpsell", "onDelete", "Lio/reactivex/Observable;", "onEditModeChanged", "", "onFirstTrackUpsellImpression", "Lcom/soundcloud/android/playlists/PlaylistDetailItem$PlaylistDetailUpsellItem;", "onGoToCreator", "Lcom/soundcloud/android/playlists/PlaylistDetailsMetadata;", "onLike", "Lkotlin/Pair;", "onMakeAvailableOffline", "onMakeOfflineOverflowUpsell", "onMakeOfflineUpsell", "onOverflowUpsellImpression", "onPlayAll", "onPlayNext", "onRefresh", "onRemoveFromOffline", "onRepost", "onShare", "onShuffleClicked", "onTrackClicked", "Lcom/soundcloud/android/playlists/PlaylistDetailItem$PlaylistDetailTrackItem;", "onTracklistUpdated", "", "onUpsellDismissed", "onUpsellItemClicked", "onVisible", "sharePlaylist", "options", "Lcom/soundcloud/android/foundation/actions/models/ShareOptions;", "showDisableOfflineCollectionConfirmation", "params", "showOfflineStorageErrorDialog", "showPlaybackResult", "playbackResult", "Lcom/soundcloud/android/playback/PlaybackResult;", "showPlaylistDetailConfirmation", "showRepostResult", "result", "Lcom/soundcloud/android/associations/RepostResult;", "base_release"}, mv = {1, 1, 15})
    /* renamed from: kqa$a */
    /* compiled from: PlaylistDetailsPresenter.kt */
    public interface a extends C7727yEa<C7218qra, C6973nJa, RVa, RVa> {

        /* renamed from: kqa$a$a reason: collision with other inner class name */
        /* compiled from: PlaylistDetailsPresenter.kt */
        public static final class C0182a {
            public static APa<RVa> a(a aVar) {
                return defpackage.C7727yEa.a.a(aVar);
            }
        }

        APa<C6532gqa> Wa();

        APa<f> Xa();

        APa<HVa<C6532gqa, Boolean>> Za();

        APa<C3508cda> _a();

        void a(C2037FR fr);

        void a(Mca mca);

        void a(C4536zc zcVar);

        void a(C6532gqa gqa);

        void a(Object obj);

        APa<C6532gqa> ab();

        void b(C3508cda cda);

        void b(Object obj);

        void c(C3508cda cda);

        APa<C6532gqa> cb();

        APa<RVa> d();

        void d(C3508cda cda);

        APa<List<e>> db();

        void e(C3508cda cda);

        APa<HVa<C6532gqa, Boolean>> eb();

        APa<C6532gqa> fb();

        APa<f> hb();

        APa<Boolean> ib();

        APa<C6532gqa> jb();

        APa<C6532gqa> kb();

        APa<C6532gqa> lb();

        APa<C6532gqa> mb();

        APa<e> n();

        APa<f> nb();

        APa<C6532gqa> ob();

        APa<C6532gqa> pb();
    }

    public C6804kqa(C3508cda cda, String str, SearchQuerySourceInfo searchQuerySourceInfo, PromotedSourceInfo promotedSourceInfo, C4972Hsa hsa, Db db, C4909Fra fra, C4403wa waVar, C5327TLa tLa, C4197yd ydVar, C3700b bVar, C3983h hVar, C5662bpa bpa, C1997DR dr, C2436_U _u, C4088fe feVar, C6668iqa iqa, HPa hPa, T t2) {
        C3508cda cda2 = cda;
        String str2 = str;
        C4972Hsa hsa2 = hsa;
        Db db2 = db;
        C4909Fra fra2 = fra;
        C4403wa waVar2 = waVar;
        C5327TLa tLa2 = tLa;
        C4197yd ydVar2 = ydVar;
        C3700b bVar2 = bVar;
        C3983h hVar2 = hVar;
        C5662bpa bpa2 = bpa;
        C1997DR dr2 = dr;
        C2436_U _u2 = _u;
        C4088fe feVar2 = feVar;
        C6668iqa iqa2 = iqa;
        HPa hPa2 = hPa;
        C7471uYa.b(cda2, "initialUrn");
        C7471uYa.b(str2, "screen");
        C7471uYa.b(hsa2, "playlistUpsellOperations");
        C7471uYa.b(db2, "playbackInitiator");
        C7471uYa.b(fra2, "playlistOperations");
        C7471uYa.b(waVar2, "playQueueHelper");
        C7471uYa.b(tLa2, "eventBus");
        C7471uYa.b(ydVar2, "offlineContentOperations");
        C7471uYa.b(bVar2, "analytics");
        C7471uYa.b(hVar2, "likeOperations");
        C7471uYa.b(bpa2, "dataSourceProvider");
        C7471uYa.b(dr2, "repostOperations");
        C7471uYa.b(_u2, "featureOperations");
        C7471uYa.b(feVar2, "offlineSettingsStorage");
        C7471uYa.b(iqa2, "playlistDetailsMetadataBuilderFactory");
        C7471uYa.b(hPa, "mainScheduler");
        T t3 = t2;
        C7471uYa.b(t3, "syncInitiator");
        HPa hPa3 = hPa;
        super(hPa3);
        this.r = cda2;
        this.s = hsa2;
        this.t = db2;
        this.u = fra2;
        this.v = waVar2;
        this.w = tLa2;
        this.x = ydVar2;
        this.y = bVar2;
        this.z = hVar2;
        this.A = bpa2;
        this.B = dr2;
        this.C = _u2;
        this.D = feVar2;
        this.E = hPa3;
        this.F = t3;
        C6668iqa iqa3 = iqa;
        this.l = iqa3.a(str, promotedSourceInfo, searchQuerySourceInfo);
        C2314UH<C3508cda> s2 = C2314UH.s();
        C7471uYa.a((Object) s2, "BehaviorRelay.create<Urn>()");
        this.m = s2;
        C2332VH<f> s3 = C2332VH.s();
        C7471uYa.a((Object) s3, "PublishRelay.create<Play…aylistDetailUpsellItem>()");
        this.n = s3;
        C2332VH<List<e>> s4 = C2332VH.s();
        C7471uYa.a((Object) s4, "PublishRelay.create<List…aylistDetailTrackItem>>()");
        this.o = s4;
        C2314UH<Boolean> f = C2314UH.f(Boolean.valueOf(false));
        C7471uYa.a((Object) f, "BehaviorRelay.createDefault(false)");
        this.p = f;
    }

    public void create() {
        super.create();
        VPa f = a(this.r).f((C6776kQa<? super T>) this.m);
        C7471uYa.a((Object) f, "updatedPlaylistUrn(initi…Urn).subscribe(latestUrn)");
        this.q = f;
    }

    public void destroy() {
        VPa vPa = this.q;
        if (vPa != null) {
            vPa.dispose();
            super.destroy();
            return;
        }
        C7471uYa.b("urnDisposable");
        throw null;
    }

    private final VPa c(a aVar) {
        _Ua _ua = _Ua.a;
        APa d = aVar.d();
        APa h = c().a((C7256rQa<? super T>) C6670ira.a).h(C6738jra.a);
        C7471uYa.a((Object) h, "loader.filter { it.data …requireNotNull(it.data) }");
        VPa c = APa.a((EPa<? extends T1>) d, (EPa<? extends T2>) h, (C6504gQa<? super T1, ? super T2, ? extends R>) new C6602hra<Object,Object,Object>()).f().c((C6776kQa<? super T>) new C6806kra<Object>(this));
        C7471uYa.a((Object) c, "Observables.combineLates…AILS, urn))\n            }");
        return c;
    }

    private final APa<C6532gqa> d(APa<C6532gqa> aPa) {
        APa<C6532gqa> a2 = aPa.a((C7256rQa<? super T>) new C7216qqa<Object>(this));
        C7471uYa.a((Object) a2, "trigger.filter { offline…fflineCollectionEnabled }");
        return a2;
    }

    private final APa<C6532gqa> e(APa<C6532gqa> aPa) {
        APa<C6532gqa> a2 = aPa.a((C7256rQa<? super T>) new C7285rqa<Object>(this));
        C7471uYa.a((Object) a2, "trigger.filter { !offlin…fflineCollectionEnabled }");
        return a2;
    }

    private final APa<C3490aba> h() {
        APa<C3490aba> k = this.m.k(new C5156Nqa(this));
        C7471uYa.a((Object) k, "latestUrn.switchMap { pl…(mainScheduler)\n        }");
        return k;
    }

    private final APa<C4536zc> i(APa<C6532gqa> aPa) {
        APa<C4536zc> m2 = aPa.m(new C7699xqa(this));
        C7471uYa.a((Object) m2, "trigger.switchMapSingle …arams(it.playAllParams) }");
        return m2;
    }

    private final APa<C4536zc> j(APa<C6532gqa> aPa) {
        APa<C4536zc> m2 = aPa.m(new C7837zqa(this));
        C7471uYa.a((Object) m2, "trigger.switchMapSingle …tadata.urn))) }\n        }");
        return m2;
    }

    private final APa<f> k(APa<f> aPa) {
        APa<f> d = aPa.d((C6776kQa<? super T>) new C5033Jqa<Object>(this));
        C7471uYa.a((Object) d, "trigger.doOnNext { analy…ession(it.playlistUrn)) }");
        return d;
    }

    private final APa<C6532gqa> l(APa<C6532gqa> aPa) {
        APa<C6532gqa> d = aPa.d((C6776kQa<? super T>) new C5064Kqa<Object>(this));
        C7471uYa.a((Object) d, "trigger.doOnNext { analy…flowImpression(it.urn)) }");
        return d;
    }

    private final APa<C7218qra> f() {
        APa a2 = APa.a((EPa<? extends T1>) g(), (EPa<? extends T2>) this.p, (C6504gQa<? super T1, ? super T2, ? extends R>) C4784Bqa.a);
        C7471uYa.a((Object) a2, "Observable.combineLatest…}\n            }\n        )");
        return Yl.a(a2);
    }

    private final APa<C7218qra> g() {
        return this.m.k(new C4815Cqa(this)).h(new C4846Dqa(this));
    }

    private final APa<C3508cda> h(APa<C6532gqa> aPa) {
        APa<C3508cda> h = aPa.h(C7630wqa.a);
        C7471uYa.a((Object) h, "trigger.map { it.urn }");
        return h;
    }

    /* renamed from: b */
    public APa<C7218qra> g(RVa rVa) {
        C7471uYa.b(rVa, "pageParams");
        APa<C7218qra> k = this.m.m(new C4908Fqa(this)).k(new C4939Gqa(this));
        C7471uYa.a((Object) k, "latestUrn.switchMapSingl…hMap { legacyLoad(Unit) }");
        return k;
    }

    private final VPa b(a aVar) {
        return new UPa(c(aVar), aVar._a().f((C6776kQa<? super T>) new C5509Zqa<Object>(aVar)), aVar.mb().h(C5538_qa.a).f((C6776kQa<? super T>) new C5598ara<Object>(aVar)), aVar.eb().l(new C5666bra(this)).g(), aVar.Za().k(new C6262cra(this)).a(this.E).f((C6776kQa<? super T>) new C6330dra<Object>(aVar)), aVar.fb().f((C6776kQa<? super T>) new C6398era<Object>(aVar)), f(aVar.cb()).f((C6776kQa<? super T>) new C6466fra<Object>(aVar)), g(aVar.jb()).f((C6776kQa<? super T>) new C6534gra<Object>(aVar)), a(aVar.hb()).f((C6776kQa<? super T>) new C5216Pqa<Object>(aVar)), h(aVar.Wa()).f((C6776kQa<? super T>) new C5246Qqa<Object>(this)), aVar.n().m(new C5276Rqa(this)).f((C6776kQa<? super T>) new C5306Sqa<Object>(aVar)), j(aVar.pb()).f((C6776kQa<? super T>) new C5335Tqa<Object>(aVar)), i(aVar.kb()).f((C6776kQa<? super T>) new C5364Uqa<Object>(aVar)), b(aVar.ab()).g(), c(aVar.ab()).f((C6776kQa<? super T>) new C5393Vqa<Object>(aVar)), e(aVar.ob()).f((C6776kQa<? super T>) new C5422Wqa<Object>(this)), d(aVar.ob()).f((C6776kQa<? super T>) new C5451Xqa<Object>(aVar)), l(aVar.lb()).q(), k(aVar.nb()).q(), h().f((C6776kQa<? super T>) new C5480Yqa<Object>(aVar)));
    }

    private final APa<C3508cda> g(APa<C6532gqa> aPa) {
        APa<C3508cda> d = aPa.h(C7492uqa.a).d((C6776kQa<? super T>) new C7561vqa<Object>(this));
        C7471uYa.a((Object) d, "trigger.map { it.urn }.d…listOverflowClick(urn)) }");
        return d;
    }

    public final APa<C3508cda> a(C3508cda cda) {
        C7471uYa.b(cda, "initialUrn");
        C5327TLa tLa = this.w;
        C5443XLa<Jaa> xLa = C3876taa.q;
        C7471uYa.a((Object) xLa, "EventQueue.PLAYLIST_CHANGED");
        APa<C3508cda> e = tLa.a(xLa).a((C7256rQa<? super T>) C6874lra.a).a((C7256rQa<? super T>) new C6942mra<Object>(cda)).h(new C7011nra(cda)).e(cda);
        C7471uYa.a((Object) e, "eventBus.queue(EventQueu…   .startWith(initialUrn)");
        return e;
    }

    private final APa<C3508cda> f(APa<C6532gqa> aPa) {
        APa<C3508cda> d = aPa.h(C7354sqa.a).d((C6776kQa<? super T>) new C7423tqa<Object>(this));
        C7471uYa.a((Object) d, "trigger.map { it.urn }.d…PlaylistPageClick(urn)) }");
        return d;
    }

    private final APa<C6532gqa> c(APa<C6532gqa> aPa) {
        APa<C6532gqa> a2 = aPa.a((C7256rQa<? super T>) new C7147pqa<Object>(this));
        C7471uYa.a((Object) a2, "trigger.filter { !offlin…fflineContentAccessible }");
        return a2;
    }

    public void a(a aVar) {
        C7471uYa.b(aVar, "view");
        super.a(aVar);
        b().a(aVar.db().f((C6776kQa<? super T>) this.o), aVar.Xa().f((C6776kQa<? super T>) this.n), aVar.ib().f((C6776kQa<? super T>) this.p), b(aVar));
    }

    /* renamed from: a */
    public APa<C7218qra> f(RVa rVa) {
        C7471uYa.b(rVa, "pageParams");
        APa<C7218qra> k = f().k(new C4877Eqa(this));
        C7471uYa.a((Object) k, "latestDataWhenNotEditing…{ applyLocalChanges(it) }");
        return k;
    }

    /* access modifiers changed from: private */
    public final APa<C7218qra> a(C7218qra qra) {
        APa<C7218qra> b = APa.b((Iterable<? extends EPa<? extends T>>) Arrays.asList(new APa[]{C5366Usa.a.a(this.o, qra.c().a(), this.u, this.l), C5063Kpa.a.a(this.n, this.s), C5155Npa.a.a(this.p)})).b(qra, (C6504gQa<R, ? super T, R>) C4753Aqa.a);
        C7471uYa.a((Object) b, "Observable\n            .… result.apply(previous) }");
        return b;
    }

    private final C6979nPa b(APa<C6532gqa> aPa) {
        C6979nPa l2 = aPa.a((C7256rQa<? super T>) new C7009nqa<Object>(this)).l(new C7078oqa(this));
        C7471uYa.a((Object) l2, "trigger.filter { offline…istAvailableOffline(it) }");
        return l2;
    }

    /* access modifiers changed from: private */
    public final C6979nPa a(C6532gqa gqa) {
        if (gqa.l().o() || gqa.r()) {
            return a(gqa.a(), gqa.k());
        }
        C6979nPa a2 = this.z.a(gqa.a(), true).a((C7255rPa) a(gqa.a(), gqa.k()));
        C7471uYa.a((Object) a2, "likeOperations.toggleLik…adata.playSessionSource))");
        return a2;
    }

    /* access modifiers changed from: private */
    public final void b(C6532gqa gqa) {
        this.x.c(gqa.a()).g();
        this.y.a((J) a(gqa.a(), false, gqa.k()));
    }

    /* access modifiers changed from: private */
    public final APa<C2037FR> b(C6532gqa gqa, boolean z2) {
        APa<C2037FR> j = this.B.a(gqa.a(), z2).c((C6776kQa<? super T>) new C5186Oqa<Object>(this, z2, gqa)).j();
        C7471uYa.a((Object) j, "repostOperations.toggleR…         }.toObservable()");
        return j;
    }

    private final C6979nPa a(C3508cda cda, PlaySessionSource playSessionSource) {
        C6979nPa a2 = this.x.b(cda).a((C6368eQa) new C5001Iqa(this, cda, playSessionSource));
        C7471uYa.a((Object) a2, "offlineContentOperations…vent(event)\n            }");
        return a2;
    }

    /* access modifiers changed from: private */
    public final C3710l b(C3508cda cda) {
        return C3710l.a.a(cda, Yca.PLAYLIST_DETAILS.a(), (I) null, false);
    }

    private final APa<C3508cda> a(APa<f> aPa) {
        APa<C3508cda> d = aPa.h(C6872lqa.a).d((C6776kQa<? super T>) new C6940mqa<Object>(this));
        C7471uYa.a((Object) d, "trigger.map { it.playlis…aylistTracksClick(urn)) }");
        return d;
    }

    /* access modifiers changed from: private */
    public final C6979nPa a(C6532gqa gqa, boolean z2) {
        C6979nPa a2 = this.z.a(gqa.a(), z2).a((C6368eQa) new C4970Hqa(this, z2, gqa));
        C7471uYa.a((Object) a2, "likeOperations.toggleLik…)\n            )\n        }");
        return a2;
    }

    /* access modifiers changed from: private */
    public final C3924zaa a(C3508cda cda, boolean z2, PlaySessionSource playSessionSource) {
        String str = "OfflineInteractionEvent.…ource.promotedSourceInfo)";
        if (z2) {
            C3924zaa a2 = C3924zaa.a(Yca.PLAYLIST_DETAILS.a(), cda, playSessionSource.h());
            C7471uYa.a((Object) a2, str);
            return a2;
        }
        C3924zaa b = C3924zaa.b(Yca.PLAYLIST_DETAILS.a(), cda, playSessionSource.h());
        C7471uYa.a((Object) b, str);
        return b;
    }
}
