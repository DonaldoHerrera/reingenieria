package com.soundcloud.android.playback;

import com.soundcloud.android.foundation.events.A;
import com.soundcloud.android.foundation.events.C3699a;
import com.soundcloud.android.foundation.events.C3703e;
import com.soundcloud.android.foundation.events.C3709k;
import com.soundcloud.android.foundation.events.z;
import com.soundcloud.android.playback.core.PlaybackItem;
import com.soundcloud.android.playback.core.Stream;
import com.soundcloud.android.playback.players.k;
import com.soundcloud.android.properties.a;
import com.soundcloud.android.properties.m.s;
import java.util.Map;

/* renamed from: com.soundcloud.android.playback.sc reason: case insensitive filesystem */
/* compiled from: PlaybackPerformanceListener.kt */
public class C4422sc implements k {
    private C3703e a;
    private final C5327TLa b;
    private final C3469VY c;
    private final a d;

    public C4422sc(C5327TLa tLa, C3469VY vy, a aVar) {
        C7471uYa.b(tLa, "eventBus");
        C7471uYa.b(vy, "errorReporter");
        C7471uYa.b(aVar, "appFeatures");
        this.b = tLa;
        this.c = vy;
        this.d = aVar;
    }

    private z b(Gla gla) {
        String str = "offline_play_unavailable";
        String str2 = "";
        z zVar = new z(str, C4313gd.c(gla.b().c()), str2, gla.a(), null, null, this.a, C4313gd.b(gla.b().c()), C4313gd.d(gla.b().c()), Tma.c(gla.b()));
        return zVar;
    }

    public void a(C3699a aVar) {
        C7471uYa.b(aVar, "activityLifeCycleEvent");
        this.a = aVar.b() ? C3703e.FOREGROUND : C3703e.BACKGROUND;
    }

    public void a(Ela ela) {
        C7471uYa.b(ela, "audioPerformanceEvent");
        C5327TLa tLa = this.b;
        C5443XLa<A> xLa = C3876taa.x;
        C7471uYa.a((Object) xLa, "EventQueue.PLAYBACK_PERFORMANCE");
        long d2 = ela.d();
        Map a2 = ela.a();
        C3703e eVar = this.a;
        PlaybackItem b2 = ela.b();
        C3709k c2 = b2 != null ? Tma.c(b2) : null;
        Stream c3 = ela.c();
        String c4 = c3 != null ? C4313gd.c(c3) : null;
        Stream c5 = ela.c();
        String b3 = c5 != null ? C4313gd.b(c5) : null;
        Stream c6 = ela.c();
        A a3 = new A(d2, a2, eVar, c4, b3, c6 != null ? C4313gd.d(c6) : null, c2);
        tLa.c(xLa, a3);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x008d  */
    public void a(Fla fla) {
        String str;
        a a2;
        C3709k kVar;
        a a3;
        String str2;
        a a4;
        C7471uYa.b(fla, "error");
        String str3 = null;
        if (this.d.a((a) s.a)) {
            a.a(this.c, new Gc(fla.b(), fla.d(), fla.h()), null, 2, null);
        }
        C5327TLa tLa = this.b;
        C5443XLa<z> xLa = C3876taa.y;
        C7471uYa.a((Object) xLa, "EventQueue.PLAYBACK_ERROR");
        String b2 = fla.b();
        a a5 = fla.a();
        if (a5 != null) {
            Stream b3 = a5.b();
            if (b3 != null) {
                str = C4313gd.c(b3);
                String c2 = fla.c();
                String e = fla.e();
                String g = fla.g();
                String f = fla.f();
                C3703e eVar = this.a;
                a2 = fla.a();
                if (a2 != null) {
                    PlaybackItem a6 = a2.a();
                    if (a6 != null) {
                        kVar = Tma.c(a6);
                        a3 = fla.a();
                        if (a3 != null) {
                            Stream b4 = a3.b();
                            if (b4 != null) {
                                str2 = C4313gd.b(b4);
                                a4 = fla.a();
                                if (a4 != null) {
                                    Stream b5 = a4.b();
                                    if (b5 != null) {
                                        str3 = C4313gd.d(b5);
                                    }
                                }
                                z zVar = new z(b2, str, c2, e, g, f, eVar, str2, str3, kVar);
                                tLa.c(xLa, zVar);
                            }
                        }
                        str2 = null;
                        a4 = fla.a();
                        if (a4 != null) {
                        }
                        z zVar2 = new z(b2, str, c2, e, g, f, eVar, str2, str3, kVar);
                        tLa.c(xLa, zVar2);
                    }
                }
                kVar = null;
                a3 = fla.a();
                if (a3 != null) {
                }
                str2 = null;
                a4 = fla.a();
                if (a4 != null) {
                }
                z zVar22 = new z(b2, str, c2, e, g, f, eVar, str2, str3, kVar);
                tLa.c(xLa, zVar22);
            }
        }
        str = null;
        String c22 = fla.c();
        String e2 = fla.e();
        String g2 = fla.g();
        String f2 = fla.f();
        C3703e eVar2 = this.a;
        a2 = fla.a();
        if (a2 != null) {
        }
        kVar = null;
        a3 = fla.a();
        if (a3 != null) {
        }
        str2 = null;
        a4 = fla.a();
        if (a4 != null) {
        }
        z zVar222 = new z(b2, str, c22, e2, g2, f2, eVar2, str2, str3, kVar);
        tLa.c(xLa, zVar222);
    }

    public void a(Gla gla) {
        C7471uYa.b(gla, "playerNotFoundDiagnostics");
        if (gla.b() instanceof OfflinePlaybackItem) {
            a.a(this.c, new Na(), null, 2, null);
            C5327TLa tLa = this.b;
            C5443XLa<z> xLa = C3876taa.y;
            C7471uYa.a((Object) xLa, "EventQueue.PLAYBACK_ERROR");
            tLa.c(xLa, b(gla));
            return;
        }
        a.a(this.c, new Wc(gla), null, 2, null);
    }
}
