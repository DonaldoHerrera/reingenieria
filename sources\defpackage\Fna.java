package defpackage;

import com.google.android.gms.common.internal.ImagesContract;
import com.soundcloud.android.playback.core.PlaybackItem;
import com.soundcloud.android.playback.core.Stream;
import java.util.Map;

/* renamed from: Fna reason: default package */
/* compiled from: PlayerTrackingEventsFactory.kt */
public final class Fna {
    public static final Fna a = new Fna();

    private Fna() {
    }

    public final Ela a(PlaybackItem playbackItem, Stream stream, String str, String str2, long j) {
        C7471uYa.b(playbackItem, "playbackItem");
        C7471uYa.b(stream, "stream");
        C7471uYa.b(str, "playerType");
        Map c = LWa.c(NVa.a(C1325gg.TYPE, "play"), NVa.a("player_type", str), NVa.a("latency", Long.valueOf(j)), NVa.a(ImagesContract.URL, stream.b()));
        if (str2 != null) {
            HVa a2 = NVa.a("player_version", str2);
            c.put(a2.c(), a2.d());
        }
        Ela ela = new Ela(0, playbackItem, stream, c, 1, null);
        return ela;
    }

    public final Ela b(PlaybackItem playbackItem, Stream stream, String str, String str2) {
        C7471uYa.b(playbackItem, "playbackItem");
        C7471uYa.b(stream, "stream");
        C7471uYa.b(str, "playerType");
        Map c = LWa.c(NVa.a(C1325gg.TYPE, "fallback_triggered"), NVa.a("player_type", str), NVa.a(ImagesContract.URL, stream.b()));
        if (str2 != null) {
            HVa a2 = NVa.a("host", str2);
            c.put(a2.c(), a2.d());
        }
        Ela ela = new Ela(0, playbackItem, stream, c, 1, null);
        return ela;
    }

    public static /* synthetic */ Fla a(Fna fna, a aVar, String str, String str2, String str3, String str4, String str5, int i, String str6, int i2, Object obj) {
        return fna.a(aVar, str, str2, str3, str4, str5, (i2 & 64) != 0 ? 0 : i, str6);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0029, code lost:
        if (r1 != null) goto L_0x002e;
     */
    public final Fla a(a aVar, String str, String str2, String str3, String str4, String str5, int i, String str6) {
        String str7;
        String str8 = str;
        C7471uYa.b(str, "playerType");
        C7471uYa.b(str4, "category");
        C7471uYa.b(str5, "sourceFile");
        C7471uYa.b(str6, "message");
        if (aVar != null) {
            Stream b = aVar.b();
            if (b != null) {
                str7 = b.b();
            }
        }
        str7 = "";
        b bVar = new b(aVar, str, str2, str3, str4, str5, i, str6, str7);
        return bVar;
    }

    public final Ela a(PlaybackItem playbackItem, Stream stream, String str, String str2) {
        C7471uYa.b(playbackItem, "playbackItem");
        C7471uYa.b(stream, "stream");
        C7471uYa.b(str, "playerType");
        Map c = LWa.c(NVa.a(C1325gg.TYPE, "fallback_succeeded"), NVa.a("player_type", str), NVa.a(ImagesContract.URL, stream.b()));
        if (str2 != null) {
            HVa a2 = NVa.a("host", str2);
            c.put(a2.c(), a2.d());
        }
        Ela ela = new Ela(0, playbackItem, stream, c, 1, null);
        return ela;
    }

    public final Ela a(PlaybackItem playbackItem, Stream stream, String str, int i) {
        C7471uYa.b(playbackItem, "playbackItem");
        C7471uYa.b(stream, "stream");
        C7471uYa.b(str, "playerType");
        PlaybackItem playbackItem2 = playbackItem;
        Stream stream2 = stream;
        Ela ela = new Ela(0, playbackItem2, stream2, LWa.b(NVa.a(C1325gg.TYPE, "player_retry"), NVa.a("player_type", str), NVa.a(ImagesContract.URL, stream.b()), NVa.a("latency", Integer.valueOf(i))), 1, null);
        return ela;
    }
}
