package com.soundcloud.android.offline;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs;
import com.soundcloud.android.playback.Gd;
import com.soundcloud.android.settings.streamingquality.e;
import java.io.Closeable;
import java.io.IOException;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;

@EVa(d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\u0007\b\u0016\u0018\u0000 A2\u00020\u0001:\u0002ABBy\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\b\u0001\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u0012\u0006\u0010\u001a\u001a\u00020\u001b\u0012\u0006\u0010\u001c\u001a\u00020\u001d¢\u0006\u0002\u0010\u001eJ\b\u0010\"\u001a\u00020#H\u0016J\b\u0010$\u001a\u00020#H\u0016J\u0016\u0010%\u001a\b\u0012\u0004\u0012\u00020'0&2\u0006\u0010(\u001a\u00020'H\u0012J\u0018\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.H\u0016J\u0018\u0010/\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.H\u0012J\u0014\u00100\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020'010&H\u0016J\"\u00102\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020'010&2\f\u00103\u001a\b\u0012\u0004\u0012\u00020'04H\u0016J\u0018\u00105\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\u0006\u00106\u001a\u000207H\u0012J\u0018\u00108\u001a\u00020#2\u0006\u0010(\u001a\u00020'2\u0006\u00109\u001a\u00020:H\u0012J\u0014\u0010;\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020'0<0&H\u0016J\"\u0010=\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020'0<0&2\f\u0010>\u001a\b\u0012\u0004\u0012\u00020'04H\u0016J \u0010?\u001a\u00020#2\u0006\u0010+\u001a\u00020,2\u0006\u00106\u001a\u0002072\u0006\u0010-\u001a\u00020.H\u0012J\b\u0010@\u001a\u00020#H\u0016R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001f\u001a\u00020 8VX\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010!R\u000e\u0010\u0018\u001a\u00020\u0019X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000¨\u0006C"}, d2 = {"Lcom/soundcloud/android/offline/DownloadOperations;", "", "strictSSLHttpClient", "Lcom/soundcloud/android/offline/StrictSSLHttpClient;", "secureFileStorage", "Lcom/soundcloud/android/offline/SecureFileStorage;", "playQueueManager", "Lcom/soundcloud/android/features/playqueue/PlayQueueManager;", "urlBuilder", "Lcom/soundcloud/android/playback/StreamUrlBuilder;", "scheduler", "Lio/reactivex/Scheduler;", "assetDownloader", "Lcom/soundcloud/android/offline/OfflineTrackAssetDownloader;", "downloadConnectionHelper", "Lcom/soundcloud/android/offline/DownloadConnectionHelper;", "offlineSettingsStorage", "Lcom/soundcloud/android/offline/OfflineSettingsStorage;", "trackDownloadsStorage", "Lcom/soundcloud/android/offline/TrackDownloadsStorage;", "downloadedMediaStreamsStorage", "Lcom/soundcloud/android/tracks/mediastreams/DownloadedMediaStreamsStorage;", "streamingQualitySettings", "Lcom/soundcloud/android/settings/streamingquality/StreamingQualitySettings;", "mediaStreamsRepository", "Lcom/soundcloud/android/tracks/mediastreams/MediaStreamsRepository;", "observerFactory", "Lcom/soundcloud/android/rx/observers/ObserverFactory;", "downloadLogger", "Lcom/soundcloud/android/offline/DownloadLogger;", "(Lcom/soundcloud/android/offline/StrictSSLHttpClient;Lcom/soundcloud/android/offline/SecureFileStorage;Lcom/soundcloud/android/features/playqueue/PlayQueueManager;Lcom/soundcloud/android/playback/StreamUrlBuilder;Lio/reactivex/Scheduler;Lcom/soundcloud/android/offline/OfflineTrackAssetDownloader;Lcom/soundcloud/android/offline/DownloadConnectionHelper;Lcom/soundcloud/android/offline/OfflineSettingsStorage;Lcom/soundcloud/android/offline/TrackDownloadsStorage;Lcom/soundcloud/android/tracks/mediastreams/DownloadedMediaStreamsStorage;Lcom/soundcloud/android/settings/streamingquality/StreamingQualitySettings;Lcom/soundcloud/android/tracks/mediastreams/MediaStreamsRepository;Lcom/soundcloud/android/rx/observers/ObserverFactory;Lcom/soundcloud/android/offline/DownloadLogger;)V", "isConnectionValid", "", "()Z", "cancelCurrentDownload", "", "deleteAllFromStorage", "deleteFromFileStorage", "Lio/reactivex/Single;", "Lcom/soundcloud/android/foundation/domain/Urn;", "urn", "download", "Lcom/soundcloud/android/offline/DownloadState;", "request", "Lcom/soundcloud/android/offline/DownloadRequest;", "listener", "Lcom/soundcloud/android/offline/DownloadOperations$DownloadProgressListener;", "downloadAndStore", "getFilesMissingFromStorage", "", "getStoredFiles", "tracks", "", "mapFailureToDownloadResult", "response", "Lcom/soundcloud/android/offline/StrictSSLHttpClient$TrackFileResponse;", "parseAndStoreMediaStreamMetadata", "headers", "Lokhttp3/Headers;", "removeMissingTracks", "", "removeOfflineTracks", "requests", "saveTrack", "updateOfflineDir", "Companion", "DownloadProgressListener", "base_release"}, mv = {1, 1, 15})
/* compiled from: DownloadOperations.kt */
public class Vb {
    public static final a a = new a(null);
    private final ve b;
    /* access modifiers changed from: private */
    public final C4165se c;
    /* access modifiers changed from: private */
    public final C3814lca d;
    private final Gd e;
    private final HPa f;
    private final C4148pe g;
    private final Lb h;
    private final C4088fe i;
    /* access modifiers changed from: private */
    public final De j;
    /* access modifiers changed from: private */
    public final C6830lDa k;
    private final e l;
    private final C4735ADa m;
    private final C5606ava n;
    /* access modifiers changed from: private */
    public final Qb o;

    /* compiled from: DownloadOperations.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }
    }

    /* compiled from: DownloadOperations.kt */
    public interface b {
        void a(long j);
    }

    public Vb(ve veVar, C4165se seVar, C3814lca lca, Gd gd, HPa hPa, C4148pe peVar, Lb lb, C4088fe feVar, De de, C6830lDa lda, e eVar, C4735ADa aDa, C5606ava ava, Qb qb) {
        C7471uYa.b(veVar, "strictSSLHttpClient");
        C7471uYa.b(seVar, "secureFileStorage");
        C7471uYa.b(lca, "playQueueManager");
        C7471uYa.b(gd, "urlBuilder");
        C7471uYa.b(hPa, "scheduler");
        C7471uYa.b(peVar, "assetDownloader");
        C7471uYa.b(lb, "downloadConnectionHelper");
        C7471uYa.b(feVar, "offlineSettingsStorage");
        C7471uYa.b(de, "trackDownloadsStorage");
        C7471uYa.b(lda, "downloadedMediaStreamsStorage");
        C7471uYa.b(eVar, "streamingQualitySettings");
        C7471uYa.b(aDa, "mediaStreamsRepository");
        C7471uYa.b(ava, "observerFactory");
        C7471uYa.b(qb, "downloadLogger");
        this.b = veVar;
        this.c = seVar;
        this.d = lca;
        this.e = gd;
        this.f = hPa;
        this.g = peVar;
        this.h = lb;
        this.i = feVar;
        this.j = de;
        this.k = lda;
        this.l = eVar;
        this.m = aDa;
        this.n = ava;
        this.o = qb;
    }

    public void f() {
        this.c.j();
    }

    public IPa<Set<C3508cda>> b(Collection<C3508cda> collection) {
        C7471uYa.b(collection, "requests");
        IPa<Set<C3508cda>> b2 = APa.a((Iterable<? extends T>) collection).a((C7256rQa<? super T>) new C4056ac<Object>(this)).g(new C4074dc(this)).f((C7118pQa<? super T, ? extends C7669xPa<? extends R>>) new C4110jc<Object,Object>(this)).r().e(C4116kc.a).b(this.f);
        C7471uYa.a((Object) b2, "Observable.fromIterable(…  .subscribeOn(scheduler)");
        return b2;
    }

    public IPa<List<C3508cda>> c() {
        IPa<List<C3508cda>> a2 = this.j.b().a((C7118pQa<? super T, ? extends MPa<? extends R>>) new Yb<Object,Object>(this));
        C7471uYa.a((Object) a2, "trackDownloadsStorage.do…minus(actual) }\n        }");
        return a2;
    }

    public boolean d() {
        return !this.h.c() && this.h.b();
    }

    public IPa<Set<C3508cda>> e() {
        IPa<Set<C3508cda>> a2 = c().a((C7118pQa<? super T, ? extends MPa<? extends R>>) new _b<Object,Object>(this));
        C7471uYa.a((Object) a2, "getFilesMissingFromStora…removeOfflineTracks(it) }");
        return a2;
    }

    /* access modifiers changed from: private */
    public IPa<C3508cda> a(C3508cda cda) {
        IPa<C3508cda> c2 = IPa.c((Callable<? extends T>) new Wb<Object>(this, cda));
        C7471uYa.a((Object) c2, "Single.fromCallable {\n  …ck(urn)\n        urn\n    }");
        return c2;
    }

    public IPa<List<C3508cda>> a(Collection<C3508cda> collection) {
        C7471uYa.b(collection, "tracks");
        IPa<List<C3508cda>> c2 = IPa.c((Callable<? extends T>) new Zb<Object>(this, collection));
        C7471uYa.a((Object) c2, "Single.fromCallable {\n  …ackStored(it) }\n        }");
        return c2;
    }

    public void a() {
        this.c.i();
    }

    public C4152qc a(C4146pc pcVar, b bVar) {
        C7471uYa.b(pcVar, "request");
        C7471uYa.b(bVar, CastExtraArgs.LISTENER);
        if (!this.i.k()) {
            this.o.a("Inaccessible storage");
            C4152qc d2 = C4152qc.d(pcVar);
            C7471uYa.a((Object) d2, "DownloadState.inaccessibleStorage(request)");
            return d2;
        } else if (!this.c.g()) {
            this.o.a("Not enough minimum space");
            C4152qc f2 = C4152qc.f(pcVar);
            C7471uYa.a((Object) f2, "DownloadState.notEnoughMinimumSpace(request)");
            return f2;
        } else if (!this.c.a(pcVar.g())) {
            Qb qb = this.o;
            StringBuilder sb = new StringBuilder();
            sb.append("Not enough space download result: ");
            sb.append(pcVar.a());
            qb.a(sb.toString());
            C4152qc g2 = C4152qc.g(pcVar);
            C7471uYa.a((Object) g2, "DownloadState.notEnoughSpace(request)");
            return g2;
        } else if (this.h.b()) {
            return b(pcVar, bVar);
        } else {
            if (this.h.c()) {
                Qb qb2 = this.o;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Connection error download result: ");
                sb2.append(pcVar.a());
                qb2.a(sb2.toString());
                C4152qc b2 = C4152qc.b(pcVar);
                C7471uYa.a((Object) b2, "DownloadState.disconnectedNetworkError(request)");
                return b2;
            }
            Qb qb3 = this.o;
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Invalid network error download result: ");
            sb3.append(pcVar.a());
            qb3.a(sb3.toString());
            C4152qc e2 = C4152qc.e(pcVar);
            C7471uYa.a((Object) e2, "DownloadState.invalidNetworkError(request)");
            return e2;
        }
    }

    public void b() {
        this.k.a();
        this.c.b();
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x010d */
    /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x011a */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:35:0x011a=Splitter:B:35:0x011a, B:31:0x010d=Splitter:B:31:0x010d} */
    private C4152qc b(C4146pc pcVar, b bVar) {
        com.soundcloud.android.offline.ve.b bVar2;
        C4152qc qcVar;
        bVar2 = null;
        try {
            String a2 = this.e.a(pcVar.a(), this.l.b());
            ve veVar = this.b;
            C7471uYa.a((Object) a2, "streamUrl");
            bVar2 = veVar.a(a2);
            if (bVar2.c()) {
                a(pcVar, bVar2, bVar);
                C7026nyb b2 = bVar2.b();
                String str = "request.urn";
                if (b2 != null) {
                    Qb qb = this.o;
                    StringBuilder sb = new StringBuilder();
                    sb.append("Will store download metadata for urn ");
                    sb.append(pcVar.a());
                    qb.a(sb.toString());
                    C3508cda a3 = pcVar.a();
                    C7471uYa.a((Object) a3, str);
                    a(a3, b2);
                }
                this.g.a(pcVar);
                C4148pe peVar = this.g;
                C3508cda a4 = pcVar.a();
                C7471uYa.a((Object) a4, str);
                String i2 = pcVar.i();
                C7471uYa.a((Object) i2, "request.waveformUrl");
                peVar.a(a4, i2);
                Qb qb2 = this.o;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Successful download result: ");
                sb2.append(pcVar.a());
                qb2.a(sb2.toString());
                C4152qc h2 = C4152qc.h(pcVar);
                C7471uYa.a((Object) h2, "DownloadState.success(request)");
                C6698jGa.a((Closeable) bVar2);
                return h2;
            }
            C4152qc a5 = a(pcVar, bVar2);
            C6698jGa.a((Closeable) bVar2);
            return a5;
        } catch (C3384yV ) {
            Qb qb3 = this.o;
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Download cancelled: ");
            sb3.append(pcVar.a());
            qb3.a(sb3.toString());
            C4152qc a6 = C4152qc.a(pcVar);
            C7471uYa.a((Object) a6, "DownloadState.canceled(request)");
            C6698jGa.a((Closeable) bVar2);
            return a6;
        } catch (C3364xV ) {
            C4152qc c2 = C4152qc.c(pcVar);
            C7471uYa.a((Object) c2, "DownloadState.error(request)");
            C6698jGa.a((Closeable) bVar2);
            return c2;
        } catch (IOException e2) {
            if (!this.i.k()) {
                this.o.a("Inaccessible storage");
                C4152qc d2 = C4152qc.d(pcVar);
                C7471uYa.a((Object) d2, "DownloadState.inaccessibleStorage(request)");
                C6698jGa.a((Closeable) bVar2);
                return d2;
            }
            if (this.h.c()) {
                Qb qb4 = this.o;
                StringBuilder sb4 = new StringBuilder();
                sb4.append("Connection error download result: ");
                sb4.append(pcVar.a());
                qb4.a(sb4.toString());
                qcVar = C4152qc.b(pcVar);
                C7471uYa.a((Object) qcVar, "DownloadState.disconnectedNetworkError(request)");
            } else {
                Qb qb5 = this.o;
                StringBuilder sb5 = new StringBuilder();
                sb5.append("Invalid network error download result: ");
                sb5.append(pcVar.a());
                qb5.a(sb5.toString(), e2);
                qcVar = C4152qc.e(pcVar);
                C7471uYa.a((Object) qcVar, "DownloadState.invalidNetworkError(request)");
            }
            C6698jGa.a((Closeable) bVar2);
            return qcVar;
        } catch (Throwable th) {
            C6698jGa.a((Closeable) bVar2);
            throw th;
        }
    }

    private void a(C3508cda cda, C7026nyb nyb) {
        String b2 = nyb.b("X-SC-Preset");
        String str = "Required value was null.";
        if (b2 != null) {
            String b3 = nyb.b("X-SC-Quality");
            if (b3 != null) {
                String b4 = nyb.b("X-SC-Mime-Type");
                if (b4 != null) {
                    this.m.a((Iterable<C6762kDa>) C6850lWa.a(new C6762kDa(cda, b2, b3, b4))).a((C7117pPa) C5606ava.a(this.n, (PXa) null, 1, (Object) null));
                    return;
                }
                throw new IllegalArgumentException(str);
            }
            throw new IllegalArgumentException(str);
        }
        throw new IllegalArgumentException(str);
    }

    private C4152qc a(C4146pc pcVar, com.soundcloud.android.offline.ve.b bVar) {
        if (bVar.d()) {
            Qb qb = this.o;
            StringBuilder sb = new StringBuilder();
            sb.append("Unavailable download result: ");
            sb.append(pcVar.a());
            qb.a(sb.toString());
            C4152qc i2 = C4152qc.i(pcVar);
            C7471uYa.a((Object) i2, "DownloadState.unavailable(request)");
            return i2;
        }
        Qb qb2 = this.o;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Download error: ");
        sb2.append(pcVar.a());
        qb2.a(sb2.toString());
        C4152qc c2 = C4152qc.c(pcVar);
        C7471uYa.a((Object) c2, "DownloadState.error(request)");
        return c2;
    }

    private void a(C4146pc pcVar, com.soundcloud.android.offline.ve.b bVar, b bVar2) throws IOException, C3364xV {
        C4165se seVar = this.c;
        C3508cda a2 = pcVar.a();
        C7471uYa.a((Object) a2, "request.urn");
        seVar.a(a2, bVar.a(), new C4122lc(bVar2));
        Qb qb = this.o;
        StringBuilder sb = new StringBuilder();
        sb.append("Track stored on device: ");
        sb.append(pcVar.a());
        qb.a(sb.toString());
    }
}
