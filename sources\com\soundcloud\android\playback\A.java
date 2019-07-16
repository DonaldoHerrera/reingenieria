package com.soundcloud.android.playback;

import com.soundcloud.android.foundation.ads.C3678e;
import com.soundcloud.android.foundation.ads.C3682i;
import com.soundcloud.android.foundation.ads.C3693u;
import com.soundcloud.android.foundation.ads.U;
import com.soundcloud.android.foundation.ads.aa;
import com.soundcloud.android.foundation.events.C3700b;
import com.soundcloud.android.foundation.events.C3702d;
import com.soundcloud.android.foundation.events.I;
import com.soundcloud.android.foundation.events.J;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: AdSessionAnalyticsDispatcher */
public class A implements C4535zb {
    public static final long a = TimeUnit.SECONDS.toMillis(3);
    private final C3700b b;
    private final C4298dd c;
    private final C3678e d;
    private final Yaa e;
    private C4928GKa<a> f = C4928GKa.a();
    private boolean g;
    private boolean h;
    private C4928GKa<List<C3682i>> i = C4928GKa.a();

    /* compiled from: AdSessionAnalyticsDispatcher */
    private static class a {
        final U a;
        final I b;

        a(U u, I i) {
            this.a = u;
            this.b = i;
        }
    }

    public A(C3700b bVar, Yaa yaa, C4298dd ddVar, C3678e eVar) {
        this.b = bVar;
        this.e = yaa;
        this.c = ddVar;
        this.d = eVar;
    }

    private boolean c(C4519wc wcVar) {
        return a(wcVar, 0.5f);
    }

    private boolean d(C4519wc wcVar) {
        return a(wcVar, 0.75f);
    }

    public void a(U u, I i2) {
        if (i2 != null) {
            this.f = C4928GKa.c(new a(u, i2));
            List s = u.s();
            if (s != null) {
                Collections.sort(s, C4289c.a);
            }
            this.i = C4928GKa.b(s);
        }
    }

    public void b(Ba ba, boolean z) {
        if (!this.g && this.f.c()) {
            a(((a) this.f.b()).a, ba.getPosition(), a(((a) this.f.b()).b, (C4431ub) ba));
        }
    }

    private static boolean c(U u) {
        return !u.a(com.soundcloud.android.foundation.ads.U.a.START);
    }

    private boolean b(C4519wc wcVar) {
        return a(wcVar, 0.25f);
    }

    public void a(Ba ba, boolean z) {
        if (this.g && this.f.c()) {
            U u = ((a) this.f.b()).a;
            I i2 = ((a) this.f.b()).b;
            a(u, ba.getPosition(), a(i2, (C4431ub) ba), this.c.a(ba));
        }
    }

    private void b() {
        if (this.i.c()) {
            ((List) this.i.b()).remove(0);
        }
    }

    private void b(U u, long j) {
        if (b(u)) {
            this.d.b(((aa) u).I(), j);
        }
    }

    private static boolean b(U u) {
        return u instanceof aa;
    }

    public void a(Ba ba) {
        if (this.g && this.f.c()) {
            a aVar = (a) this.f.b();
            a(aVar.a, ba.getPosition(), a(aVar.b, (C4431ub) ba), com.soundcloud.android.playback.C4298dd.a.STOP_REASON_SKIP);
        }
    }

    public void a(Ba ba, C4519wc wcVar) {
        if (this.g && this.f.c() && ba.s().equals(wcVar.e())) {
            a aVar = (a) this.f.b();
            U u = aVar.a;
            this.b.a((J) C3440LZ.a(u, a(aVar.b, (C4431ub) ba, wcVar)));
            if (b(u)) {
                this.b.a((C3702d) new com.soundcloud.android.foundation.events.C3702d.e.a("video"));
            } else if (a(u)) {
                this.b.a((C3702d) new com.soundcloud.android.foundation.events.C3702d.e.a("audio"));
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("PlayableAdData is neither video nor audio! ");
                sb.append(u);
                throw new IllegalArgumentException(sb.toString());
            }
        }
    }

    public void a(C4519wc wcVar) {
        if (this.f.c()) {
            U u = ((a) this.f.b()).a;
            I i2 = ((a) this.f.b()).b;
            if (a() && a(wcVar, Long.valueOf(((C3682i) ((List) this.i.b()).get(0)).a()))) {
                a(u, i2, this.e.a(((C3682i) ((List) this.i.b()).get(0)).b()));
                b();
            }
            if (a(com.soundcloud.android.foundation.ads.U.a.FIRST_QUARTILE, u, wcVar)) {
                a(com.soundcloud.android.foundation.ads.U.a.FIRST_QUARTILE, u, wcVar, i2);
            } else if (a(com.soundcloud.android.foundation.ads.U.a.SECOND_QUARTILE, u, wcVar)) {
                a(com.soundcloud.android.foundation.ads.U.a.SECOND_QUARTILE, u, wcVar, i2);
            } else if (a(com.soundcloud.android.foundation.ads.U.a.THIRD_QUARTILE, u, wcVar)) {
                a(com.soundcloud.android.foundation.ads.U.a.THIRD_QUARTILE, u, wcVar, i2);
            }
        }
    }

    private void a(U u, I i2, List<String> list) {
        this.b.a((J) new defpackage.C3434JZ.a(u, i2, list));
    }

    private boolean a(com.soundcloud.android.foundation.ads.U.a aVar, U u, C4519wc wcVar) {
        boolean a2 = u.a(aVar);
        int i2 = C4533z.a[aVar.ordinal()];
        boolean z = false;
        if (i2 == 1) {
            if (!a2 && b(wcVar)) {
                z = true;
            }
            return z;
        } else if (i2 == 2) {
            if (!a2 && c(wcVar)) {
                z = true;
            }
            return z;
        } else if (i2 != 3) {
            return false;
        } else {
            if (!a2 && d(wcVar)) {
                z = true;
            }
            return z;
        }
    }

    private boolean a(C4519wc wcVar, Long l) {
        return wcVar.d() >= l.longValue();
    }

    private boolean a(C4519wc wcVar, float f2) {
        return ((float) wcVar.d()) / ((float) wcVar.c()) >= f2;
    }

    private void a(com.soundcloud.android.foundation.ads.U.a aVar, U u, C4519wc wcVar, I i2) {
        u.b(aVar);
        a(u, aVar, wcVar.d());
        int i3 = C4533z.a[aVar.ordinal()];
        if (i3 == 1) {
            this.b.a((J) new defpackage.C3434JZ.e.a(u, i2, this.e.a(u.p())));
        } else if (i3 == 2) {
            this.b.a((J) new b(u, i2, this.e.a(u.u())));
        } else if (i3 == 3) {
            this.b.a((J) new c(u, i2, this.e.a(u.y())));
        }
    }

    private boolean a() {
        return this.i.c() && ((List) this.i.b()).size() != 0;
    }

    private void a(U u, long j, C3443MZ mz) {
        this.g = true;
        if (c(u)) {
            u.b(com.soundcloud.android.foundation.ads.U.a.START);
            a(u, com.soundcloud.android.foundation.ads.U.a.START, j);
            this.b.a((J) new C0073d(u, mz, C3434JZ.a(u, this.e)));
        } else if (this.h) {
            b(u, j);
            this.b.a((J) new c(u, mz, this.e.a(u.t())));
        }
        this.b.a((J) C3440LZ.b(u, mz));
        this.h = false;
    }

    private void a(U u, long j, C3443MZ mz, com.soundcloud.android.playback.C4298dd.a aVar) {
        this.g = false;
        if (a(aVar, u)) {
            this.h = false;
            u.b(com.soundcloud.android.foundation.ads.U.a.FINISH);
            a(u, com.soundcloud.android.foundation.ads.U.a.FINISH, j);
            this.b.a((J) new defpackage.C3434JZ.d.a(u, mz, this.e.a(u.o())));
        } else if (a(aVar)) {
            this.h = true;
            a(u, j);
            this.b.a((J) new b(u, mz, this.e.a(u.r())));
        }
        this.b.a((J) C3440LZ.a(u, mz, aVar));
    }

    private void a(U u, long j) {
        if (b(u)) {
            this.d.h(((aa) u).I(), j);
        }
    }

    private void a(U u, com.soundcloud.android.foundation.ads.U.a aVar, long j) {
        if (b(u)) {
            aa aaVar = (aa) u;
            String I = aaVar.I();
            int i2 = C4533z.a[aVar.ordinal()];
            if (i2 == 1) {
                this.d.c(I, j);
            } else if (i2 == 2) {
                this.d.f(I, j);
            } else if (i2 == 3) {
                this.d.g(I, j);
            } else if (i2 == 4) {
                this.d.a(I, j, (float) aaVar.B());
            } else if (i2 == 5) {
                this.d.a(I, j);
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Unexpected reporting event: ");
                sb.append(aVar);
                throw new IllegalStateException(sb.toString());
            }
        }
    }

    private static boolean a(com.soundcloud.android.playback.C4298dd.a aVar, U u) {
        if (!(aVar == com.soundcloud.android.playback.C4298dd.a.STOP_REASON_TRACK_FINISHED || aVar == com.soundcloud.android.playback.C4298dd.a.STOP_REASON_END_OF_QUEUE) || u.a(com.soundcloud.android.foundation.ads.U.a.FINISH)) {
            return false;
        }
        return true;
    }

    private static boolean a(com.soundcloud.android.playback.C4298dd.a aVar) {
        return aVar == com.soundcloud.android.playback.C4298dd.a.STOP_REASON_PAUSE;
    }

    private static boolean a(U u) {
        return u instanceof C3693u;
    }

    private C3443MZ a(I i2, C4431ub ubVar) {
        return C3443MZ.a(i2, Long.valueOf(ubVar.getPosition()), Long.valueOf(ubVar.getDuration()), ubVar.n(), ubVar.a());
    }

    private C3443MZ a(I i2, C4431ub ubVar, C4519wc wcVar) {
        return C3443MZ.a(i2, Long.valueOf(wcVar.d()), Long.valueOf(wcVar.c()), ubVar.n(), ubVar.a());
    }
}
