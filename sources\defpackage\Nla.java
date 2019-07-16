package defpackage;

import android.view.Surface;
import com.soundcloud.android.playback.core.EncryptedPlaybackItem;
import com.soundcloud.android.playback.core.PlaybackItem;
import com.soundcloud.android.playback.core.PreloadItem;
import com.soundcloud.android.playback.core.Stream;
import com.soundcloud.android.playback.core.d;
import com.soundcloud.android.playback.core.k;
import com.soundcloud.android.playback.core.k.b;
import com.soundcloud.android.playback.core.k.c;
import com.soundcloud.flippernative.api.ErrorReason;
import com.soundcloud.flippernative.api.PlayerState;

@EVa(d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\b\u0016\u0018\u0000 N2\u00020\u00012\u00020\u0002:\u0001NB'\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0003\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\b\u0010\u001e\u001a\u00020\u001fH\u0016J\n\u0010 \u001a\u0004\u0018\u00010\rH\u0016J\b\u0010!\u001a\u00020\"H\u0016J\b\u0010#\u001a\u00020$H\u0012J\b\u0010%\u001a\u00020\u001dH\u0016J\b\u0010&\u001a\u00020'H\u0016J\u0010\u0010(\u001a\u00020\u00152\u0006\u0010)\u001a\u00020$H\u0012J\u0018\u0010*\u001a\u00020\u001f2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020$H\u0016J\u0010\u0010.\u001a\u00020\u001f2\u0006\u0010/\u001a\u000200H\u0016J\u0016\u00101\u001a\u00020\u001f2\f\u00102\u001a\b\u0012\u0004\u0012\u00020\u001f03H\u0012J\u0010\u00104\u001a\u00020\u001f2\u0006\u00105\u001a\u000206H\u0016J\u0010\u00107\u001a\u00020\u001f2\u0006\u00105\u001a\u000208H\u0016J\u0010\u00109\u001a\u00020\u001f2\u0006\u0010:\u001a\u00020;H\u0016J\u0010\u0010<\u001a\u00020\u001f2\u0006\u00105\u001a\u00020\u0017H\u0016J\b\u0010=\u001a\u00020\u001fH\u0016J\u0010\u0010>\u001a\u00020\u001f2\u0006\u0010?\u001a\u00020\rH\u0016J\u0010\u0010@\u001a\u00020\u001f2\u0006\u0010A\u001a\u00020BH\u0016J \u0010C\u001a\u00020\u001f2\u0006\u0010D\u001a\u00020\u00172\u0006\u0010?\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u001dH\u0013J\b\u0010E\u001a\u00020\u001fH\u0016J\u0010\u0010F\u001a\u00020\u001f2\u0006\u0010G\u001a\u00020\u001dH\u0016J\u0012\u0010H\u001a\u00020\u001f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\u0012\u0010I\u001a\u00020\u001f2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\u0010\u0010J\u001a\u00020\u001f2\u0006\u0010K\u001a\u00020'H\u0016J\b\u0010L\u001a\u00020\u001fH\u0016J\f\u0010M\u001a\u00020\u001f*\u00020\rH\u0012R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u000e\u001a\u00020\u000f8RX\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0014\u001a\u00020\u0015X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006O"}, d2 = {"Lcom/soundcloud/android/playback/flipper/FlipperAdapter;", "Lcom/soundcloud/android/playback/core/Player;", "Lcom/soundcloud/android/playback/flipper/FlipperCallbacks;", "flipperWrapperFactory", "Lcom/soundcloud/android/playback/flipper/FlipperWrapperFactory;", "wakelockUtil", "Lcom/soundcloud/android/playback/flipper/wakelock/LockUtil;", "callbackThread", "Lcom/soundcloud/android/playback/flipper/threading/CallbackThread;", "logger", "Lcom/soundcloud/android/playback/core/Logger;", "(Lcom/soundcloud/android/playback/flipper/FlipperWrapperFactory;Lcom/soundcloud/android/playback/flipper/wakelock/LockUtil;Lcom/soundcloud/android/playback/flipper/threading/CallbackThread;Lcom/soundcloud/android/playback/core/Logger;)V", "currentPlaybackItem", "Lcom/soundcloud/android/playback/core/PlaybackItem;", "flipperWrapper", "Lcom/soundcloud/android/playback/flipper/FlipperWrapper;", "getFlipperWrapper", "()Lcom/soundcloud/android/playback/flipper/FlipperWrapper;", "flipperWrapper$delegate", "Lkotlin/Lazy;", "isSeekPending", "", "lastReportedState", "Lcom/soundcloud/android/playback/flipper/StateChange;", "playerPerformanceListener", "Lcom/soundcloud/android/playback/core/Player$PlayerPerformanceListener;", "playerStateListener", "Lcom/soundcloud/android/playback/core/Player$PlayerStateListener;", "progress", "", "destroy", "", "getCurrentPlaybackItem", "getPlayerType", "Lcom/soundcloud/android/playback/flipper/Flipper;", "getPlayerVersion", "", "getProgress", "getVolume", "", "isCurrentStreamUrl", "uri", "log", "logLevel", "Lcom/soundcloud/android/playback/flipper/LogLevel;", "message", "onError", "error", "Lcom/soundcloud/android/playback/flipper/FlipperError;", "onMainThread", "function", "Lkotlin/Function0;", "onPerformanceEvent", "event", "Lcom/soundcloud/android/playback/flipper/PerformanceEvent;", "onProgressChanged", "Lcom/soundcloud/android/playback/flipper/ProgressChange;", "onSeekingStatusChanged", "seekingStatusChange", "Lcom/soundcloud/android/playback/flipper/SeekingStatusChange;", "onStateChanged", "pause", "play", "playbackItem", "preload", "preloadItem", "Lcom/soundcloud/android/playback/core/PreloadItem;", "reportStateTransition", "stateChange", "resume", "seek", "ms", "setPerformanceListener", "setStateListener", "setVolume", "volume", "stop", "openStream", "Companion", "flipper_release"}, mv = {1, 1, 15})
/* renamed from: Nla reason: default package */
/* compiled from: FlipperAdapter.kt */
public class Nla implements k, Tla {
    static final /* synthetic */ DZa[] a = {HYa.a((DYa) new EYa(HYa.a(Nla.class), "flipperWrapper", "getFlipperWrapper()Lcom/soundcloud/android/playback/flipper/FlipperWrapper;"))};
    public static final a b = new a(null);
    private final C7744yVa c;
    /* access modifiers changed from: private */
    public PlaybackItem d;
    /* access modifiers changed from: private */
    public c e;
    private b f;
    /* access modifiers changed from: private */
    public boolean g;
    private C4600kma h;
    /* access modifiers changed from: private */
    public long i;
    private final C4632oma j;
    private final C4608lma k;
    /* access modifiers changed from: private */
    public final d l;

    /* renamed from: Nla$a */
    /* compiled from: FlipperAdapter.kt */
    public static final class a {
        private a() {
        }

        public final Kla a(PlayerState playerState, boolean z) {
            C7471uYa.b(playerState, "state");
            if (C7471uYa.a((Object) playerState, (Object) PlayerState.Preparing) || C7471uYa.a((Object) playerState, (Object) PlayerState.Prepared)) {
                return Kla.BUFFERING;
            }
            if (C7471uYa.a((Object) playerState, (Object) PlayerState.Playing)) {
                return z ? Kla.BUFFERING : Kla.PLAYING;
            }
            return Kla.IDLE;
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }

        public final Jla a(PlayerState playerState, ErrorReason errorReason) {
            C7471uYa.b(playerState, "state");
            C7471uYa.b(errorReason, "reason");
            if (C7471uYa.a((Object) playerState, (Object) PlayerState.Error)) {
                if (C7471uYa.a((Object) errorReason, (Object) ErrorReason.NotFound) || C7471uYa.a((Object) errorReason, (Object) ErrorReason.Forbidden) || C7471uYa.a((Object) errorReason, (Object) ErrorReason.ServiceUnavailable)) {
                    return Jla.ERROR_FATAL;
                }
                if (C7471uYa.a((Object) errorReason, (Object) ErrorReason.Nothing) || C7471uYa.a((Object) errorReason, (Object) ErrorReason.Failed) || C7471uYa.a((Object) errorReason, (Object) ErrorReason.Timeout)) {
                    return Jla.ERROR_RECOVERABLE;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("Unexpected error reason ");
                sb.append(errorReason);
                throw new IllegalStateException(sb.toString());
            } else if (C7471uYa.a((Object) playerState, (Object) PlayerState.Paused)) {
                return Jla.PAUSED;
            } else {
                if (C7471uYa.a((Object) playerState, (Object) PlayerState.Completed)) {
                    return Jla.PLAYBACK_COMPLETE;
                }
                return Jla.NONE;
            }
        }
    }

    public Nla(C4552ema ema, C4632oma oma, C4608lma lma, d dVar) {
        C7471uYa.b(ema, "flipperWrapperFactory");
        C7471uYa.b(oma, "wakelockUtil");
        C7471uYa.b(lma, "callbackThread");
        C7471uYa.b(dVar, "logger");
        this.j = oma;
        this.k = lma;
        this.l = dVar;
        this.c = BVa.a(new Pla(this, ema));
    }

    private C3959bma e() {
        C7744yVa yva = this.c;
        DZa dZa = a[0];
        return (C3959bma) yva.getValue();
    }

    private String f() {
        return e().d();
    }

    public void destroy() {
        e().c();
    }

    public void pause() {
        e().f();
    }

    public void stop() {
        e().h();
    }

    private void b(PlaybackItem playbackItem) {
        if (playbackItem instanceof EncryptedPlaybackItem) {
            EncryptedPlaybackItem encryptedPlaybackItem = (EncryptedPlaybackItem) playbackItem;
            e().a(playbackItem.c().b(), encryptedPlaybackItem.i().b(), encryptedPlaybackItem.i().a(), playbackItem.g());
            return;
        }
        e().a(playbackItem.c().b(), playbackItem.g());
    }

    public float c() {
        return (float) e().e();
    }

    public long d() {
        return this.i;
    }

    public /* synthetic */ Nla(C4552ema ema, C4632oma oma, C4608lma lma, d dVar, int i2, C7264rYa rya) {
        if ((i2 & 4) != 0) {
            lma = new C4624nma();
        }
        this(ema, oma, lma, dVar);
    }

    public void a(String str, Surface surface) {
        C7471uYa.b(str, "playbackItemId");
        C7471uYa.b(surface, "surface");
        com.soundcloud.android.playback.core.k.a.a(this, str, surface);
    }

    public void a(PreloadItem preloadItem) {
        C7471uYa.b(preloadItem, "preloadItem");
        d dVar = this.l;
        StringBuilder sb = new StringBuilder();
        sb.append("preload(): ");
        sb.append(preloadItem);
        dVar.b("FlipperAdapter", sb.toString());
        e().a(preloadItem.a().b());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0055, code lost:
        if (defpackage.C7471uYa.a((java.lang.Object) r1, (java.lang.Object) com.soundcloud.flippernative.api.PlayerState.Stopped) != false) goto L_0x0057;
     */
    public void a(PlaybackItem playbackItem) {
        C7471uYa.b(playbackItem, "playbackItem");
        d dVar = this.l;
        StringBuilder sb = new StringBuilder();
        sb.append("play(): ");
        sb.append(playbackItem);
        dVar.b("FlipperAdapter", sb.toString());
        this.g = false;
        this.i = 0;
        boolean a2 = a(playbackItem.c().b());
        this.d = playbackItem;
        if (a2) {
            C4600kma kma = this.h;
            PlayerState playerState = null;
            if (!C7471uYa.a(kma != null ? kma.e() : null, (Object) PlayerState.Error)) {
                C4600kma kma2 = this.h;
                if (kma2 != null) {
                    playerState = kma2.e();
                }
            }
        }
        b(playbackItem);
        e().g();
    }

    public void b() {
        this.l.b("FlipperAdapter", "resume() called");
        e().g();
    }

    public void a(long j2) {
        d dVar = this.l;
        StringBuilder sb = new StringBuilder();
        sb.append("seek() called with: position = [");
        sb.append(j2);
        sb.append(']');
        dVar.a("FlipperAdapter", sb.toString());
        this.g = true;
        this.i = j2;
        e().a(j2);
    }

    public void a(float f2) {
        e().a((double) f2);
    }

    public void a(c cVar) {
        this.e = cVar;
    }

    public void a(b bVar) {
        this.f = bVar;
    }

    public Mla a() {
        return Mla.b;
    }

    public void a(C4576hma hma) {
        C7471uYa.b(hma, "event");
        a((PXa<RVa>) new Qla<RVa>(this, hma));
    }

    public void a(C4568gma gma) {
        C7471uYa.b(gma, "event");
        b bVar = this.f;
        if (bVar != null) {
            long b2 = gma.b();
            PlaybackItem playbackItem = this.d;
            Ela ela = new Ela(b2, playbackItem, playbackItem != null ? playbackItem.c() : null, gma.a());
            bVar.a(ela);
        }
    }

    /* access modifiers changed from: private */
    public boolean a(String str) {
        String str2;
        PlaybackItem playbackItem = this.d;
        if (playbackItem != null) {
            Stream c2 = playbackItem.c();
            if (c2 != null) {
                str2 = c2.b();
                return C7471uYa.a((Object) str, (Object) str2);
            }
        }
        str2 = null;
        return C7471uYa.a((Object) str, (Object) str2);
    }

    public void a(C4600kma kma) {
        C7471uYa.b(kma, "event");
        a((PXa<RVa>) new Sla<RVa>(this, kma));
    }

    public void a(C4592jma jma) {
        C7471uYa.b(jma, "seekingStatusChange");
        a((PXa<RVa>) new Rla<RVa>(this, jma));
    }

    /* JADX WARNING: type inference failed for: r12v2, types: [Fla] */
    /* JADX WARNING: type inference failed for: r1v0, types: [Fla$b] */
    /* JADX WARNING: type inference failed for: r1v1, types: [Fla$c] */
    /* JADX WARNING: type inference failed for: r1v3, types: [Fla$b] */
    /* JADX WARNING: type inference failed for: r1v4, types: [Fla$c] */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r1v3, types: [Fla$b]
  assigns: [Fla$b, Fla$c]
  uses: [Fla$b, Fla, Fla$c]
  mth insns count: 28
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Unknown variable types count: 3 */
    public void a(Vla vla) {
        ? r12;
        C7471uYa.b(vla, "error");
        String a2 = a().a();
        String e2 = vla.e();
        String f2 = f();
        String a3 = vla.a();
        String f3 = vla.f();
        int c2 = vla.c();
        String d2 = vla.d();
        String b2 = vla.b();
        PlaybackItem playbackItem = this.d;
        defpackage.Fla.a aVar = playbackItem != null ? new defpackage.Fla.a(playbackItem, playbackItem.c()) : null;
        if (vla.g()) {
            ? cVar = new c(aVar, a2, f2, e2, a3, f3, c2, d2, b2);
            r12 = cVar;
        } else {
            ? bVar = new b(aVar, a2, f2, e2, a3, f3, c2, d2, b2);
            r12 = bVar;
        }
        b bVar2 = this.f;
        if (bVar2 != null) {
            bVar2.a((Fla) r12);
        }
    }

    /* access modifiers changed from: private */
    public void a(C4600kma kma, PlaybackItem playbackItem, long j2) {
        d dVar = this.l;
        StringBuilder sb = new StringBuilder();
        sb.append("reportStateTransition() called for ");
        sb.append(kma.e());
        sb.append(", ");
        sb.append(kma.f());
        dVar.b("FlipperAdapter", sb.toString());
        this.h = kma;
        Kla a2 = b.a(kma.e(), kma.a());
        Hla hla = new Hla(a().a(), playbackItem, a2, b.a(kma.e(), kma.f()), playbackItem.c(), j2, kma.b(), kma.c());
        c cVar = this.e;
        if (cVar != null) {
            cVar.a(hla);
        }
        if (a2.b()) {
            this.j.a();
        } else {
            this.j.b();
        }
    }

    public void a(C4560fma fma, String str) {
        C7471uYa.b(fma, "logLevel");
        C7471uYa.b(str, "message");
        int i2 = Ola.a[fma.ordinal()];
        String str2 = "FlipperNative";
        if (i2 == 1) {
            this.l.a(str2, str);
        } else if (i2 == 2) {
            this.l.b(str2, str);
        } else if (i2 == 3) {
            this.l.b(str2, str);
        } else if (i2 == 4) {
            this.l.c(str2, str);
        } else {
            throw new FVa();
        }
    }

    private void a(PXa<RVa> pXa) {
        this.k.a(pXa);
    }
}
