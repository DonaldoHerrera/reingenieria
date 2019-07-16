package com.soundcloud.android.playback;

import com.soundcloud.android.foundation.ads.C3693u;
import com.soundcloud.android.offline.C4165se;
import com.soundcloud.android.settings.streamingquality.e;
import com.soundcloud.android.settings.streamingquality.e.b.C0171b;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

@EVa(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\f\b\u0016\u0018\u0000 82\u00020\u0001:\u000489:;BW\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015¢\u0006\u0002\u0010\u0016J\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0012J\u0016\u0010\"\u001a\b\u0012\u0004\u0012\u00020$0#2\u0006\u0010 \u001a\u00020!H\u0016J\u0016\u0010%\u001a\b\u0012\u0004\u0012\u00020\u001f0&2\u0006\u0010'\u001a\u00020(H\u0016J\u0016\u0010%\u001a\b\u0012\u0004\u0012\u00020\u001f0#2\u0006\u0010 \u001a\u00020!H\u0016J\u0018\u0010)\u001a\n +*\u0004\u0018\u00010*0*2\u0006\u0010,\u001a\u00020\u0018H\u0012J\u0016\u0010-\u001a\u00020.2\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u001c00H\u0012J\u0016\u00101\u001a\u00020.2\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u001c00H\u0012J\u0016\u00102\u001a\u00020.2\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u001c00H\u0012J\u0016\u00103\u001a\u00020.2\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u001c00H\u0012J\u0018\u00104\u001a\b\u0012\u0004\u0012\u00020\u001c00*\b\u0012\u0004\u0012\u00020\u001c00H\u0012J\u0018\u00105\u001a\b\u0012\u0004\u0012\u00020\u001c00*\b\u0012\u0004\u0012\u00020\u001c00H\u0012J\u0018\u00106\u001a\b\u0012\u0004\u0012\u00020\u001c00*\b\u0012\u0004\u0012\u00020\u001c00H\u0012J\u0018\u00107\u001a\b\u0012\u0004\u0012\u00020\u001c00*\b\u0012\u0004\u0012\u00020\u001c00H\u0012R\u000e\u0010\u0010\u001a\u00020\u0011X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0017\u001a\u00020\u0018*\u00020\u00198RX\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0018\u0010\u0017\u001a\u00020\u0018*\u00020\u001c8RX\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001d¨\u0006<"}, d2 = {"Lcom/soundcloud/android/playback/StreamSelector;", "", "hlsStreamUrlBuilder", "Lcom/soundcloud/android/playback/HlsStreamUrlBuilder;", "streamUrlBuilder", "Lcom/soundcloud/android/playback/StreamUrlBuilder;", "secureFileStorage", "Lcom/soundcloud/android/offline/SecureFileStorage;", "mediaStreamsRepository", "Lcom/soundcloud/android/tracks/mediastreams/MediaStreamsRepository;", "streamingQualitySettings", "Lcom/soundcloud/android/settings/streamingquality/StreamingQualitySettings;", "flipperKit", "Lcom/soundcloud/android/playback/flipper/FlipperKit;", "exoPlayerKit", "Lcom/soundcloud/android/exoplayer/ExoPlayerKit;", "connectionHelper", "Lcom/soundcloud/android/utilities/android/network/ConnectionHelper;", "jsonTransformer", "Lcom/soundcloud/android/json/JsonTransformer;", "errorReporter", "Lcom/soundcloud/android/error/reporting/ErrorReporter;", "(Lcom/soundcloud/android/playback/HlsStreamUrlBuilder;Lcom/soundcloud/android/playback/StreamUrlBuilder;Lcom/soundcloud/android/offline/SecureFileStorage;Lcom/soundcloud/android/tracks/mediastreams/MediaStreamsRepository;Lcom/soundcloud/android/settings/streamingquality/StreamingQualitySettings;Lcom/soundcloud/android/playback/flipper/FlipperKit;Lcom/soundcloud/android/exoplayer/ExoPlayerKit;Lcom/soundcloud/android/utilities/android/network/ConnectionHelper;Lcom/soundcloud/android/json/JsonTransformer;Lcom/soundcloud/android/error/reporting/ErrorReporter;)V", "description", "", "Lcom/soundcloud/android/tracks/mediastreams/DownloadedMediaStreamsEntry;", "getDescription", "(Lcom/soundcloud/android/tracks/mediastreams/DownloadedMediaStreamsEntry;)Ljava/lang/String;", "Lcom/soundcloud/android/tracks/mediastreams/MediaStream;", "(Lcom/soundcloud/android/tracks/mediastreams/MediaStream;)Ljava/lang/String;", "fallbackWebStreamUrls", "Lcom/soundcloud/android/playback/StreamUrls$WebStreamUrls;", "track", "Lcom/soundcloud/android/foundation/domain/tracks/Track;", "getFileStreamUrl", "Lio/reactivex/Maybe;", "Lcom/soundcloud/android/playback/StreamUrls$FileStreamUrl;", "getWebStreamsUrl", "Lio/reactivex/Single;", "audioAd", "Lcom/soundcloud/android/foundation/ads/AudioAd;", "parseMediaPayload", "Lcom/soundcloud/android/tracks/mediastreams/MediaPayload;", "kotlin.jvm.PlatformType", "payload", "selectStreams", "Lcom/soundcloud/android/playback/StreamSelector$SelectedStreamsFromPayload;", "transcodings", "", "selectStreamsForAutoQualityPreference", "selectStreamsForHighQualityPreference", "selectedStreamsForStandardQualityPreference", "highQuality", "hls", "progressive", "standardQuality", "Companion", "SelectedStreamsFromPayload", "WebStreamsPayloadNotFoundException", "WebStreamsUrlNotSelectedException", "base_release"}, mv = {1, 1, 15})
/* renamed from: com.soundcloud.android.playback.xd reason: case insensitive filesystem */
/* compiled from: StreamSelector.kt */
public class C4527xd {
    public static final a a = new a(null);
    /* access modifiers changed from: private */
    public final C4517wa b;
    /* access modifiers changed from: private */
    public final Gd c;
    private final C4165se d;
    private final C4735ADa e;
    private final e f;
    private final Yla g;
    private final C3789iba h;
    private final C6834lGa i;
    private final Nea j;
    /* access modifiers changed from: private */
    public final C3469VY k;

    /* renamed from: com.soundcloud.android.playback.xd$a */
    /* compiled from: StreamSelector.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }
    }

    /* renamed from: com.soundcloud.android.playback.xd$b */
    /* compiled from: StreamSelector.kt */
    private static final class b {
        private final C7449uDa a;
        private final C7449uDa b;

        public b(C7449uDa uda, C7449uDa uda2) {
            this.a = uda;
            this.b = uda2;
        }

        public final C7449uDa a() {
            return this.b;
        }

        public final C7449uDa b() {
            return this.a;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
            if (defpackage.C7471uYa.a((java.lang.Object) r2.b, (java.lang.Object) r3.b) != false) goto L_0x001f;
         */
        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof b) {
                    b bVar = (b) obj;
                    if (C7471uYa.a((Object) this.a, (Object) bVar.a)) {
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            C7449uDa uda = this.a;
            int i = 0;
            int hashCode = (uda != null ? uda.hashCode() : 0) * 31;
            C7449uDa uda2 = this.b;
            if (uda2 != null) {
                i = uda2.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("SelectedStreamsFromPayload(progressiveStream=");
            sb.append(this.a);
            sb.append(", hlsStream=");
            sb.append(this.b);
            sb.append(")");
            return sb.toString();
        }
    }

    /* renamed from: com.soundcloud.android.playback.xd$c */
    /* compiled from: StreamSelector.kt */
    public static final class c extends IllegalStateException {
        public c(String str) {
            C7471uYa.b(str, "message");
            super(str);
        }
    }

    /* renamed from: com.soundcloud.android.playback.xd$d */
    /* compiled from: StreamSelector.kt */
    public static final class d extends IllegalStateException {
        public d(String str) {
            C7471uYa.b(str, "message");
            super(str);
        }
    }

    public C4527xd(C4517wa waVar, Gd gd, C4165se seVar, C4735ADa aDa, e eVar, Yla yla, C3789iba iba, C6834lGa lga, Nea nea, C3469VY vy) {
        C7471uYa.b(waVar, "hlsStreamUrlBuilder");
        C7471uYa.b(gd, "streamUrlBuilder");
        C7471uYa.b(seVar, "secureFileStorage");
        C7471uYa.b(aDa, "mediaStreamsRepository");
        C7471uYa.b(eVar, "streamingQualitySettings");
        C7471uYa.b(yla, "flipperKit");
        C7471uYa.b(iba, "exoPlayerKit");
        C7471uYa.b(lga, "connectionHelper");
        C7471uYa.b(nea, "jsonTransformer");
        C7471uYa.b(vy, "errorReporter");
        this.b = waVar;
        this.c = gd;
        this.d = seVar;
        this.e = aDa;
        this.f = eVar;
        this.g = yla;
        this.h = iba;
        this.i = lga;
        this.j = nea;
        this.k = vy;
    }

    /* access modifiers changed from: private */
    public b d(List<C7449uDa> list) {
        com.soundcloud.android.settings.streamingquality.e.b e2 = this.f.e();
        if (C7471uYa.a((Object) e2, (Object) com.soundcloud.android.settings.streamingquality.e.b.c.a)) {
            return g(list);
        }
        if (C7471uYa.a((Object) e2, (Object) C0171b.a)) {
            return f(list);
        }
        if (C7471uYa.a((Object) e2, (Object) com.soundcloud.android.settings.streamingquality.e.b.a.a)) {
            return e(list);
        }
        throw new FVa();
    }

    private b e(List<C7449uDa> list) {
        if (this.i.a()) {
            return f(list);
        }
        return g(list);
    }

    private b f(List<C7449uDa> list) {
        C7449uDa uda = (C7449uDa) C7676xWa.g(c(a(list)));
        if (uda == null) {
            uda = (C7449uDa) C7676xWa.g(c(h(list)));
        }
        C7449uDa uda2 = (C7449uDa) C7676xWa.g(b(a(list)));
        if (uda2 == null) {
            uda2 = (C7449uDa) C7676xWa.g(b(h(list)));
        }
        return new b(uda, uda2);
    }

    private b g(List<C7449uDa> list) {
        return new b((C7449uDa) C7676xWa.g(c(h(list))), (C7449uDa) C7676xWa.g(b(h(list))));
    }

    private List<C7449uDa> h(List<C7449uDa> list) {
        ArrayList arrayList = new ArrayList();
        for (Object next : list) {
            if (C7471uYa.a((Object) ((C7449uDa) next).c(), (Object) com.soundcloud.android.settings.streamingquality.e.b.c.a.a())) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    public com.soundcloud.android.playback.Id.b c(C3509cea cea) {
        String a2 = this.c.a(cea.y());
        C7471uYa.a((Object) a2, "streamUrlBuilder.buildHttpsStreamUrl(track.urn)");
        C4308fd fdVar = new C4308fd(a2, null, null, null, "in-app generated stream", 14, null);
        String a3 = this.b.a(cea.y(), cea.s());
        C7471uYa.a((Object) a3, "hlsStreamUrlBuilder.buil…track.urn, track.snipped)");
        C4308fd fdVar2 = new C4308fd(a3, null, null, null, "in-app generated stream", 14, null);
        return new com.soundcloud.android.playback.Id.b(fdVar, fdVar2);
    }

    public C7531vPa<com.soundcloud.android.playback.Id.b> b(C3509cea cea) {
        C7471uYa.b(cea, "track");
        C7531vPa<com.soundcloud.android.playback.Id.b> a2 = this.e.b(cea.y()).b((C6776kQa<? super T>) new C4537zd<Object>(cea)).f(new Ad(this)).f(new Bd(this)).f(new Cd(this, cea)).a((C7669xPa<? extends T>) C7531vPa.a((Callable<? extends C7669xPa<? extends T>>) new Dd<Object>(this, cea)).b((C6776kQa<? super T>) new Ed<Object>(this, cea)));
        C7471uYa.a((Object) a2, "mediaStreamsRepository.g…          }\n            )");
        return a2;
    }

    private List<C7449uDa> c(List<C7449uDa> list) {
        ArrayList arrayList = new ArrayList();
        for (Object next : list) {
            C7449uDa uda = (C7449uDa) next;
            if (this.h.b().contains(new com.soundcloud.android.playback.core.e(uda.a().b(), uda.a().a()))) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    public C7380tDa a(String str) {
        Nea nea = this.j;
        C4990IKa a2 = C4990IKa.a(C7380tDa.class);
        C7471uYa.a((Object) a2, "TypeToken.of(MediaPayload::class.java)");
        return (C7380tDa) nea.a(str, a2);
    }

    public C7531vPa<com.soundcloud.android.playback.Id.a> a(C3509cea cea) {
        C7471uYa.b(cea, "track");
        String uri = this.d.b(cea.y()).toString();
        C7471uYa.a((Object) uri, "secureFileStorage.getFil…ack(track.urn).toString()");
        C7531vPa f2 = this.e.a(cea.y()).f(new C4532yd(this, uri));
        C4308fd fdVar = new C4308fd(uri, "file", null, null, "in-app file-stream", 12, null);
        C7531vPa<com.soundcloud.android.playback.Id.a> b2 = f2.b(new com.soundcloud.android.playback.Id.a(fdVar));
        C7471uYa.a((Object) b2, "mediaStreamsRepository.g…          )\n            )");
        return b2;
    }

    private List<C7449uDa> b(List<C7449uDa> list) {
        ArrayList arrayList = new ArrayList();
        for (Object next : list) {
            C7449uDa uda = (C7449uDa) next;
            if (this.g.b().contains(new com.soundcloud.android.playback.core.e(uda.a().b(), uda.a().a()))) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public IPa<com.soundcloud.android.playback.Id.b> a(C3693u uVar) {
        C3693u uVar2 = uVar;
        C7471uYa.b(uVar2, "audioAd");
        String a2 = this.c.a(uVar2);
        C7471uYa.a((Object) a2, "streamUrlBuilder.buildAudioAdStreamUrl(audioAd)");
        C4308fd fdVar = new C4308fd(a2, null, null, null, null, 30, null);
        String a3 = this.b.a(uVar2);
        C7471uYa.a((Object) a3, "hlsStreamUrlBuilder.buildAudioAdStreamUrl(audioAd)");
        C4308fd fdVar2 = new C4308fd(a3, null, null, null, null, 30, null);
        IPa<com.soundcloud.android.playback.Id.b> a4 = IPa.a(new com.soundcloud.android.playback.Id.b(fdVar, fdVar2));
        C7471uYa.a((Object) a4, "Single.just(\n           …)\n            )\n        )");
        return a4;
    }

    /* access modifiers changed from: private */
    public String a(C7449uDa uda) {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        sb.append(uda.c());
        sb.append("] ");
        sb.append(uda.b());
        return sb.toString();
    }

    /* access modifiers changed from: private */
    public String a(C6762kDa kda) {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        sb.append(kda.c());
        sb.append("] ");
        sb.append(kda.b());
        return sb.toString();
    }

    private List<C7449uDa> a(List<C7449uDa> list) {
        ArrayList arrayList = new ArrayList();
        for (Object next : list) {
            if (C7471uYa.a((Object) ((C7449uDa) next).c(), (Object) C0171b.a.a())) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }
}
