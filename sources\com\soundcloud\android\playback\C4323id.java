package com.soundcloud.android.playback;

import android.annotation.SuppressLint;
import android.content.Context;
import com.soundcloud.android.cast.C2732f;
import com.soundcloud.android.foundation.playqueue.F;
import com.soundcloud.android.foundation.playqueue.q;
import com.soundcloud.android.foundation.playqueue.r;
import com.soundcloud.android.offline.Vd;
import com.soundcloud.android.playback.core.PreloadItem;
import com.soundcloud.android.settings.streamingquality.e;
import java.util.concurrent.TimeUnit;

@EVa(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 (2\u00020\u0001:\u0003()*B_\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017¢\u0006\u0002\u0010\u0018J\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0002J\u0010\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0002J\u0006\u0010%\u001a\u00020\"J\f\u0010&\u001a\u00020\u001e*\u00020'H\u0002R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u00020\u001a8\u0002X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006+"}, d2 = {"Lcom/soundcloud/android/playback/StreamPreloader;", "", "context", "Landroid/content/Context;", "eventBus", "Lcom/soundcloud/rx/eventbus/EventBus;", "trackRepository", "Lcom/soundcloud/android/foundation/domain/tracks/TrackRepository;", "playQueueManager", "Lcom/soundcloud/android/features/playqueue/PlayQueueManager;", "castConnectionHelper", "Lcom/soundcloud/android/cast/CastConnectionHelper;", "offlinePlaybackOperations", "Lcom/soundcloud/android/offline/OfflinePlaybackOperations;", "streamingQualitySettings", "Lcom/soundcloud/android/settings/streamingquality/StreamingQualitySettings;", "metadataOperations", "Lcom/soundcloud/android/playback/mediasession/MetadataOperations;", "playbackItemRepository", "Lcom/soundcloud/android/playback/PlaybackItemRepository;", "playQueueUpdates", "Lcom/soundcloud/android/foundation/playqueue/PlayQueueUpdates;", "connectivityHelper", "Lcom/soundcloud/android/utilities/android/network/ConnectionHelper;", "(Landroid/content/Context;Lcom/soundcloud/rx/eventbus/EventBus;Lcom/soundcloud/android/foundation/domain/tracks/TrackRepository;Lcom/soundcloud/android/features/playqueue/PlayQueueManager;Lcom/soundcloud/android/cast/CastConnectionHelper;Lcom/soundcloud/android/offline/OfflinePlaybackOperations;Lcom/soundcloud/android/settings/streamingquality/StreamingQualitySettings;Lcom/soundcloud/android/playback/mediasession/MetadataOperations;Lcom/soundcloud/android/playback/PlaybackItemRepository;Lcom/soundcloud/android/foundation/playqueue/PlayQueueUpdates;Lcom/soundcloud/android/utilities/android/network/ConnectionHelper;)V", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "preloadDisposable", "Lio/reactivex/disposables/Disposable;", "areNetworkAndProgressConditionsMet", "", "playbackNetworkState", "Lcom/soundcloud/android/playback/StreamPreloader$PlaybackNetworkState;", "performPreload", "", "preloadBundle", "Lcom/soundcloud/android/playback/StreamPreloader$PreloadBundle;", "subscribe", "isNotBlockedTrack", "Lcom/soundcloud/android/foundation/playqueue/PlayQueueItem;", "Companion", "PlaybackNetworkState", "PreloadBundle", "base_release"}, mv = {1, 1, 15})
/* renamed from: com.soundcloud.android.playback.id reason: case insensitive filesystem */
/* compiled from: StreamPreloader.kt */
public final class C4323id {
    public static final long a = TimeUnit.SECONDS.toMillis(30);
    public static final a b = new a(null);
    /* access modifiers changed from: private */
    public VPa c = C4881Eua.b();
    @SuppressLint({"sc.MissingCompositeDisposableRecycle"})
    private final UPa d = new UPa();
    private final Context e;
    /* access modifiers changed from: private */
    public final C5327TLa f;
    /* access modifiers changed from: private */
    public final C3760eea g;
    /* access modifiers changed from: private */
    public final C3814lca h;
    /* access modifiers changed from: private */
    public final C2732f i;
    /* access modifiers changed from: private */
    public final Vd j;
    private final e k;
    private final Fma l;
    /* access modifiers changed from: private */
    public final Ub m;
    private final r n;
    private final C6834lGa o;

    /* renamed from: com.soundcloud.android.playback.id$a */
    /* compiled from: StreamPreloader.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }
    }

    /* renamed from: com.soundcloud.android.playback.id$b */
    /* compiled from: StreamPreloader.kt */
    private static final class b {
        private final C4431ub a;
        private final C4519wc b;
        private final C6902mGa c;

        public b(C4431ub ubVar, C4519wc wcVar, C6902mGa mga) {
            C7471uYa.b(ubVar, "playState");
            C7471uYa.b(wcVar, "playbackProgress");
            C7471uYa.b(mga, "connectionType");
            this.a = ubVar;
            this.b = wcVar;
            this.c = mga;
        }

        public final C4431ub a() {
            return this.a;
        }

        public final C4519wc b() {
            return this.b;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0024, code lost:
            if (defpackage.C7471uYa.a((java.lang.Object) r2.c, (java.lang.Object) r3.c) != false) goto L_0x0029;
         */
        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof b) {
                    b bVar = (b) obj;
                    if (C7471uYa.a((Object) this.a, (Object) bVar.a)) {
                        if (C7471uYa.a((Object) this.b, (Object) bVar.b)) {
                        }
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            C4431ub ubVar = this.a;
            int i = 0;
            int hashCode = (ubVar != null ? ubVar.hashCode() : 0) * 31;
            C4519wc wcVar = this.b;
            int hashCode2 = (hashCode + (wcVar != null ? wcVar.hashCode() : 0)) * 31;
            C6902mGa mga = this.c;
            if (mga != null) {
                i = mga.hashCode();
            }
            return hashCode2 + i;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("PlaybackNetworkState(playState=");
            sb.append(this.a);
            sb.append(", playbackProgress=");
            sb.append(this.b);
            sb.append(", connectionType=");
            sb.append(this.c);
            sb.append(")");
            return sb.toString();
        }
    }

    /* renamed from: com.soundcloud.android.playback.id$c */
    /* compiled from: StreamPreloader.kt */
    private static final class c {
        private final C3508cda a;
        private final PreloadItem b;

        public c(C3508cda cda, PreloadItem preloadItem) {
            C7471uYa.b(cda, "urn");
            C7471uYa.b(preloadItem, "preloadItem");
            this.a = cda;
            this.b = preloadItem;
        }

        public final PreloadItem a() {
            return this.b;
        }

        public final C3508cda b() {
            return this.a;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
            if (defpackage.C7471uYa.a((java.lang.Object) r2.b, (java.lang.Object) r3.b) != false) goto L_0x001f;
         */
        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof c) {
                    c cVar = (c) obj;
                    if (C7471uYa.a((Object) this.a, (Object) cVar.a)) {
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            C3508cda cda = this.a;
            int i = 0;
            int hashCode = (cda != null ? cda.hashCode() : 0) * 31;
            PreloadItem preloadItem = this.b;
            if (preloadItem != null) {
                i = preloadItem.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("PreloadBundle(urn=");
            sb.append(this.a);
            sb.append(", preloadItem=");
            sb.append(this.b);
            sb.append(")");
            return sb.toString();
        }
    }

    public C4323id(Context context, C5327TLa tLa, C3760eea eea, C3814lca lca, C2732f fVar, Vd vd, e eVar, Fma fma, Ub ub, r rVar, C6834lGa lga) {
        C7471uYa.b(context, "context");
        C7471uYa.b(tLa, "eventBus");
        C7471uYa.b(eea, "trackRepository");
        C7471uYa.b(lca, "playQueueManager");
        C7471uYa.b(fVar, "castConnectionHelper");
        C7471uYa.b(vd, "offlinePlaybackOperations");
        C7471uYa.b(eVar, "streamingQualitySettings");
        C7471uYa.b(fma, "metadataOperations");
        C7471uYa.b(ub, "playbackItemRepository");
        C7471uYa.b(rVar, "playQueueUpdates");
        C7471uYa.b(lga, "connectivityHelper");
        this.e = context;
        this.f = tLa;
        this.g = eea;
        this.h = lca;
        this.i = fVar;
        this.j = vd;
        this.k = eVar;
        this.l = fma;
        this.m = ub;
        this.n = rVar;
        this.o = lga;
    }

    public final void a() {
        _Ua _ua = _Ua.a;
        C2350WH a2 = this.n.a();
        APa e2 = this.k.d().e(this.k.e());
        C7471uYa.a((Object) e2, "streamingQualitySettings…amingQualityPreference())");
        this.d.b(APa.a((EPa<? extends T1>) a2, (EPa<? extends T2>) e2, (C6504gQa<? super T1, ? super T2, ? extends R>) new C4328jd<Object,Object,Object>()).d((C6776kQa<? super T>) new C4333kd<Object>(this)).a((C7256rQa<? super T>) new C4338ld<Object>(this)).a((C7256rQa<? super T>) new C4343md<Object>(this)).h(new C4348nd(this)).f((C6776kQa<? super T>) new C4515vd<Object>(this)));
    }

    /* access modifiers changed from: private */
    public final boolean a(q qVar) {
        if (!(qVar instanceof F)) {
            qVar = null;
        }
        F f2 = (F) qVar;
        if (f2 != null) {
            return !f2.s();
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    /* access modifiers changed from: private */
    public final boolean a(b bVar) {
        boolean z = false;
        if (!this.o.d() || !bVar.a().j()) {
            return false;
        }
        if (!this.o.c()) {
            return true;
        }
        C4519wc b2 = bVar.b();
        if (b2.f() && b2.c() - b2.d() < a) {
            z = true;
        }
        return z;
    }

    /* access modifiers changed from: private */
    public final void a(c cVar) {
        com.soundcloud.android.playback.players.MediaService.b.a.b(this.e, cVar.a());
        this.l.a(cVar.b());
    }
}
