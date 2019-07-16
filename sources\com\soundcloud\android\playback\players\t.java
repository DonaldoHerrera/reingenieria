package com.soundcloud.android.playback.players;

import android.content.Context;
import android.view.Surface;
import com.soundcloud.android.playback.core.PlaybackItem;
import com.soundcloud.android.playback.core.PreloadItem;
import com.soundcloud.android.playback.core.k;
import com.soundcloud.android.playback.core.m;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

@EVa(d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0016\u0018\u0000 Q2\u00020\u00012\u00020\u0002:\u0004QRSTB-\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u000fH\u0012J\b\u0010\u001e\u001a\u00020\u001cH\u0016J\"\u0010\u001f\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%H\u0012J\u0010\u0010&\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020!H\u0012J\u0012\u0010'\u001a\u0004\u0018\u00010\u000f2\u0006\u0010(\u001a\u00020#H\u0012J\n\u0010)\u001a\u0004\u0018\u00010*H\u0016J\u0012\u0010+\u001a\u0004\u0018\u00010\u000f2\u0006\u0010,\u001a\u00020*H\u0012J\b\u0010-\u001a\u00020.H\u0016J\b\u0010/\u001a\u000200H\u0016J\b\u00101\u001a\u000202H\u0016J\u0010\u00103\u001a\u00020\u001c2\u0006\u00104\u001a\u000205H\u0016J\u0010\u00106\u001a\u00020\u001c2\u0006\u00107\u001a\u000208H\u0016J\u0010\u00109\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020!H\u0016J\u0010\u0010:\u001a\u00020\u001c2\u0006\u0010;\u001a\u00020<H\u0016J\b\u0010=\u001a\u00020\u001cH\u0016J\u0010\u0010>\u001a\u00020\u001c2\u0006\u0010,\u001a\u00020*H\u0016J\u0010\u0010?\u001a\u00020\u001c2\u0006\u0010@\u001a\u00020AH\u0016J\b\u0010B\u001a\u00020\u001cH\u0016J\u0010\u0010C\u001a\u00020\u001c2\u0006\u0010D\u001a\u00020.H\u0016J\u0010\u0010E\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u0002H\u0016J\u0010\u0010E\u001a\u00020\u001c2\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0010\u0010F\u001a\u00020\u001c2\u0006\u0010\u0018\u001a\u00020\u0001H\u0016J\u001c\u0010G\u001a\u00020\u001c2\n\u0010H\u001a\u00060%j\u0002`I2\u0006\u0010J\u001a\u00020KH\u0016J\u0010\u0010L\u001a\u00020\u001c2\u0006\u0010M\u001a\u000200H\u0016J\u0010\u0010N\u001a\u0002022\u0006\u0010O\u001a\u00020!H\u0012J\b\u0010P\u001a\u00020\u001cH\u0016R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0002X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001aX\u0004¢\u0006\u0002\n\u0000¨\u0006U"}, d2 = {"Lcom/soundcloud/android/playback/players/StreamPlayer;", "Lcom/soundcloud/android/playback/core/Player$PlayerStateListener;", "Lcom/soundcloud/android/playback/core/Player$PlayerPerformanceListener;", "exoPlayerKit", "Lcom/soundcloud/android/exoplayer/ExoPlayerKit;", "kits", "Lcom/soundcloud/android/playback/core/Kits;", "playerPicker", "Lcom/soundcloud/android/playback/players/PlayerPicker;", "connectionHelper", "Lcom/soundcloud/android/utilities/android/network/ConnectionHelper;", "logger", "Lcom/soundcloud/android/playback/core/Logger;", "(Lcom/soundcloud/android/exoplayer/ExoPlayerKit;Lcom/soundcloud/android/playback/core/Kits;Lcom/soundcloud/android/playback/players/PlayerPicker;Lcom/soundcloud/android/utilities/android/network/ConnectionHelper;Lcom/soundcloud/android/playback/core/Logger;)V", "currentPlayer", "Lcom/soundcloud/android/playback/core/Player;", "exoPlayerAdapter", "lastFallbackAttempt", "Lcom/soundcloud/android/playback/players/StreamPlayer$FallbackAttempt;", "lastPlaybackState", "Lcom/soundcloud/android/playback/players/StreamPlayer$State;", "performanceListener", "Lcom/soundcloud/android/playback/players/PerformanceListener;", "playerPerformanceListener", "playerStateListener", "players", "", "configureNextPlayerToUse", "", "nextPlayer", "destroy", "dispatchFallbackSucceededEvent", "playerStateChangedEvent", "Lcom/soundcloud/android/playback/core/event/PlayerStateChangeEvent;", "originalPlayerType", "Lcom/soundcloud/android/playback/core/PlayerType;", "originalErrorCode", "", "dispatchFallbackTriggeredEvent", "findPlayerByPlayerType", "playerType", "getCurrentPlaybackItem", "Lcom/soundcloud/android/playback/core/PlaybackItem;", "getPlayerForItem", "playbackItem", "getProgress", "", "getVolume", "", "isBufferingOrPlaying", "", "onPerformanceEvent", "audioPerformanceEvent", "Lcom/soundcloud/android/playback/core/event/AudioPerformanceEvent;", "onPlayerError", "error", "Lcom/soundcloud/android/playback/core/event/PlayerError;", "onPlayerStateChanged", "onProgressEvent", "progressChangeEvent", "Lcom/soundcloud/android/playback/core/event/ProgressChangeEvent;", "pause", "play", "preload", "preloadItem", "Lcom/soundcloud/android/playback/core/PreloadItem;", "resume", "seek", "ms", "setPerformanceListener", "setStateListener", "setSurface", "playbackItemId", "Lcom/soundcloud/android/playback/core/PlaybackItemId;", "surface", "Landroid/view/Surface;", "setVolume", "volume", "shouldFallbackToFallbackPlayer", "event", "stop", "Companion", "Factory", "FallbackAttempt", "State", "players_release"}, mv = {1, 1, 15})
/* compiled from: StreamPlayer.kt */
public class t implements com.soundcloud.android.playback.core.k.c, com.soundcloud.android.playback.core.k.b {
    public static final a a = new a(null);
    private final k b;
    private final List<k> c;
    private k d;
    private com.soundcloud.android.playback.core.k.c e;
    private com.soundcloud.android.playback.core.k.b f;
    private k g;
    private c h;
    private d i;
    private final o j;
    private final C6834lGa k;
    private final com.soundcloud.android.playback.core.d l;

    /* compiled from: StreamPlayer.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }
    }

    /* compiled from: StreamPlayer.kt */
    public static class b {
        private final Context a;
        private final C3781hba b;
        private final C6834lGa c;
        private final C5694cGa d;

        public b(Context context, C3781hba hba, C6834lGa lga, C5694cGa cga) {
            C7471uYa.b(context, "context");
            C7471uYa.b(hba, "exoPlayerConfiguration");
            C7471uYa.b(lga, "connectionHelper");
            C7471uYa.b(cga, "dateProvider");
            this.a = context;
            this.b = hba;
            this.c = lga;
            this.d = cga;
        }

        public t a(com.soundcloud.android.playback.core.c cVar, o oVar, com.soundcloud.android.playback.core.d dVar) {
            C7471uYa.b(cVar, "kits");
            C7471uYa.b(oVar, "playerPicker");
            C7471uYa.b(dVar, "logger");
            com.soundcloud.android.playback.core.d dVar2 = dVar;
            C3789iba iba = new C3789iba(this.a, this.b, this.c, this.d, dVar2);
            t tVar = new t(iba, cVar, oVar, this.c, dVar2);
            return tVar;
        }
    }

    /* compiled from: StreamPlayer.kt */
    private static final class c {
        private final String a;
        private final m b;
        private final String c;

        public c(String str, m mVar, String str2) {
            C7471uYa.b(str, "playbackItemId");
            C7471uYa.b(mVar, "originalPlayerType");
            this.a = str;
            this.b = mVar;
            this.c = str2;
        }

        public final String a() {
            return this.c;
        }

        public final m b() {
            return this.b;
        }

        public final String c() {
            return this.a;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0024, code lost:
            if (defpackage.C7471uYa.a((java.lang.Object) r2.c, (java.lang.Object) r3.c) != false) goto L_0x0029;
         */
        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof c) {
                    c cVar = (c) obj;
                    if (C7471uYa.a((Object) this.a, (Object) cVar.a)) {
                        if (C7471uYa.a((Object) this.b, (Object) cVar.b)) {
                        }
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            String str = this.a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            m mVar = this.b;
            int hashCode2 = (hashCode + (mVar != null ? mVar.hashCode() : 0)) * 31;
            String str2 = this.c;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return hashCode2 + i;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("FallbackAttempt(playbackItemId=");
            sb.append(this.a);
            sb.append(", originalPlayerType=");
            sb.append(this.b);
            sb.append(", originalErrorCode=");
            sb.append(this.c);
            sb.append(")");
            return sb.toString();
        }
    }

    /* compiled from: StreamPlayer.kt */
    private static final class d {
        private final Kla a;
        private final Jla b;

        public d(Kla kla, Jla jla) {
            C7471uYa.b(kla, "state");
            C7471uYa.b(jla, "reason");
            this.a = kla;
            this.b = jla;
        }

        public final Kla a() {
            return this.a;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
            if (defpackage.C7471uYa.a((java.lang.Object) r2.b, (java.lang.Object) r3.b) != false) goto L_0x001f;
         */
        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof d) {
                    d dVar = (d) obj;
                    if (C7471uYa.a((Object) this.a, (Object) dVar.a)) {
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            Kla kla = this.a;
            int i = 0;
            int hashCode = (kla != null ? kla.hashCode() : 0) * 31;
            Jla jla = this.b;
            if (jla != null) {
                i = jla.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("State(state=");
            sb.append(this.a);
            sb.append(", reason=");
            sb.append(this.b);
            sb.append(")");
            return sb.toString();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0061, code lost:
        if (r2 != null) goto L_0x0066;
     */
    /* JADX WARNING: Incorrect type for immutable var: ssa=com.soundcloud.android.playback.core.c, code=com.soundcloud.android.playback.core.c<com.soundcloud.android.playback.core.b>, for r3v0, types: [com.soundcloud.android.playback.core.c<com.soundcloud.android.playback.core.b>, com.soundcloud.android.playback.core.c, java.lang.Object, java.lang.Iterable] */
    public t(C3789iba iba, com.soundcloud.android.playback.core.c<com.soundcloud.android.playback.core.b> cVar, o oVar, C6834lGa lga, com.soundcloud.android.playback.core.d dVar) {
        k kVar;
        C7471uYa.b(iba, "exoPlayerKit");
        C7471uYa.b(cVar, "kits");
        C7471uYa.b(oVar, "playerPicker");
        C7471uYa.b(lga, "connectionHelper");
        C7471uYa.b(dVar, "logger");
        this.j = oVar;
        this.k = lga;
        this.l = dVar;
        this.b = iba.a();
        List a2 = C6850lWa.a(this.b);
        ArrayList arrayList = new ArrayList(C6986nWa.a((Iterable) cVar, 10));
        for (com.soundcloud.android.playback.core.b a3 : cVar) {
            arrayList.add(a3.a());
        }
        this.c = C7676xWa.c((Collection) a2, (Iterable) arrayList);
        m d2 = cVar.d();
        if (d2 != null) {
            kVar = a(d2);
        }
        kVar = this.b;
        this.d = kVar;
        this.i = new d(Kla.IDLE, Jla.NONE);
    }

    public void a(float f2) {
        this.d.a(f2);
    }

    public long b() {
        return this.d.d();
    }

    public float c() {
        return this.d.c();
    }

    public boolean d() {
        return this.i.a().b();
    }

    public void e() {
        this.d.pause();
    }

    public void f() {
        this.d.b();
    }

    public void g() {
        this.d.stop();
    }

    private k b(PlaybackItem playbackItem) {
        for (m a2 : this.j.b(playbackItem)) {
            k a3 = a(a2);
            if (a3 != null) {
                return a3;
            }
        }
        return null;
    }

    private boolean c(Hla hla) {
        return this.d != this.b && hla.c() == Jla.ERROR_RECOVERABLE && this.k.d() && this.j.a(hla.d());
    }

    public void a(k kVar) {
        C7471uYa.b(kVar, "performanceListener");
        this.g = kVar;
    }

    public void a(PlaybackItem playbackItem) {
        C7471uYa.b(playbackItem, "playbackItem");
        k b2 = b(playbackItem);
        com.soundcloud.android.playback.core.d dVar = this.l;
        StringBuilder sb = new StringBuilder();
        sb.append("play() received: will forward to player ");
        sb.append(b2 != null ? b2.a() : null);
        dVar.b("StreamPlayer", sb.toString());
        if (b2 != null) {
            a(b2);
            this.d.a(playbackItem);
            return;
        }
        k kVar = this.g;
        if (kVar != null) {
            kVar.a(new Gla(playbackItem, this.d.a().a()));
        }
    }

    private void b(Hla hla) {
        com.soundcloud.android.playback.core.k.b bVar = this.f;
        if (bVar != null) {
            bVar.a(Fna.a.b(hla.d(), hla.h(), hla.f(), hla.b()));
        }
    }

    public void a(PreloadItem preloadItem) {
        C7471uYa.b(preloadItem, "preloadItem");
        com.soundcloud.android.playback.core.d dVar = this.l;
        StringBuilder sb = new StringBuilder();
        sb.append("preload() called for ");
        sb.append(this.d.a());
        dVar.a("StreamPlayer", sb.toString());
        this.d.a(preloadItem);
    }

    public void a(long j2) {
        this.d.a(j2);
    }

    public void a(String str, Surface surface) {
        C7471uYa.b(str, "playbackItemId");
        C7471uYa.b(surface, "surface");
        this.d.a(str, surface);
    }

    public void a() {
        for (k destroy : this.c) {
            destroy.destroy();
        }
    }

    public void a(com.soundcloud.android.playback.core.k.c cVar) {
        C7471uYa.b(cVar, "playerStateListener");
        this.e = cVar;
        this.d.a(cVar);
    }

    public void a(com.soundcloud.android.playback.core.k.b bVar) {
        C7471uYa.b(bVar, "playerPerformanceListener");
        this.f = bVar;
        this.d.a(bVar);
    }

    public void a(Hla hla) {
        C7471uYa.b(hla, "playerStateChangedEvent");
        if (c(hla)) {
            this.l.b("StreamPlayer", "Fallback to fallback player triggered");
            b(hla);
            PlaybackItem a2 = this.j.a(hla.d(), this.d.d());
            this.h = new c(a2.d(), this.d.a(), hla.b());
            a(this.b);
            this.d.a(a2);
            return;
        }
        String d2 = hla.d().d();
        c cVar = this.h;
        if (!C7471uYa.a((Object) d2, cVar != null ? cVar.c() : null) || hla.e() != Kla.PLAYING) {
            String d3 = hla.d().d();
            c cVar2 = this.h;
            if (!C7471uYa.a((Object) d3, cVar2 != null ? cVar2.c() : null)) {
                this.h = null;
            }
        } else {
            c cVar3 = this.h;
            String str = "Required value was null.";
            if (cVar3 != null) {
                m b2 = cVar3.b();
                c cVar4 = this.h;
                if (cVar4 != null) {
                    a(hla, b2, cVar4.a());
                    this.h = null;
                } else {
                    throw new IllegalArgumentException(str);
                }
            } else {
                throw new IllegalArgumentException(str);
            }
        }
        this.i = new d(hla.e(), hla.c());
        com.soundcloud.android.playback.core.k.c cVar5 = this.e;
        if (cVar5 != null) {
            cVar5.a(hla);
        }
    }

    private void a(Hla hla, m mVar, String str) {
        com.soundcloud.android.playback.core.k.b bVar = this.f;
        if (bVar != null) {
            bVar.a(Fna.a.a(hla.d(), hla.h(), mVar.a(), str));
        }
    }

    public void a(Ila ila) {
        C7471uYa.b(ila, "progressChangeEvent");
        com.soundcloud.android.playback.core.k.c cVar = this.e;
        if (cVar != null) {
            cVar.a(ila);
        }
    }

    public void a(Ela ela) {
        C7471uYa.b(ela, "audioPerformanceEvent");
        com.soundcloud.android.playback.core.k.b bVar = this.f;
        if (bVar != null) {
            bVar.a(ela);
        }
    }

    public void a(Fla fla) {
        C7471uYa.b(fla, "error");
        com.soundcloud.android.playback.core.k.b bVar = this.f;
        if (bVar != null) {
            bVar.a(fla);
        }
    }

    private void a(k kVar) {
        com.soundcloud.android.playback.core.d dVar = this.l;
        StringBuilder sb = new StringBuilder();
        sb.append("Configuring next player to use: ");
        sb.append(kVar.a());
        dVar.b("StreamPlayer", sb.toString());
        k kVar2 = this.d;
        if (kVar2 != kVar) {
            kVar2.a((com.soundcloud.android.playback.core.k.c) null);
            this.d.stop();
        }
        this.d = kVar;
        this.d.a((com.soundcloud.android.playback.core.k.c) this);
        this.d.a((com.soundcloud.android.playback.core.k.b) this);
    }

    private k a(m mVar) {
        Object obj;
        Iterator it = this.c.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (C7471uYa.a((Object) mVar, (Object) ((k) obj).a())) {
                break;
            }
        }
        return (k) obj;
    }
}
