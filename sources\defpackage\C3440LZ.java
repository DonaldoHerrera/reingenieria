package defpackage;

import com.soundcloud.android.foundation.ads.U;
import com.soundcloud.android.foundation.events.B;
import com.soundcloud.android.foundation.events.I;
import com.soundcloud.android.foundation.events.J;
import com.soundcloud.android.foundation.events.SearchQuerySourceInfo;

/* renamed from: LZ reason: default package and case insensitive filesystem */
/* compiled from: AdRichMediaSessionEvent */
public abstract class C3440LZ extends J {

    /* renamed from: LZ$a */
    /* compiled from: AdRichMediaSessionEvent */
    public enum a {
        AUDIO_ACTION_PLAY("play"),
        AUDIO_ACTION_PAUSE("pause"),
        AUDIO_ACTION_CHECKPOINT("checkpoint");
        
        private final String e;

        private a(String str) {
            this.e = str;
        }

        public String a() {
            return this.e;
        }
    }

    /* renamed from: LZ$b */
    /* compiled from: AdRichMediaSessionEvent */
    static abstract class b {
        b() {
        }

        /* access modifiers changed from: 0000 */
        public abstract b a(long j);

        /* access modifiers changed from: 0000 */
        public abstract b a(C4928GKa<C3508cda> gKa);

        /* access modifiers changed from: 0000 */
        public abstract b a(a aVar);

        /* access modifiers changed from: 0000 */
        public abstract b a(c cVar);

        /* access modifiers changed from: 0000 */
        public abstract b a(C3508cda cda);

        /* access modifiers changed from: 0000 */
        public abstract b a(com.soundcloud.android.foundation.ads.C3676c.a aVar);

        /* access modifiers changed from: 0000 */
        public abstract b a(String str);

        /* access modifiers changed from: 0000 */
        public abstract C3440LZ a();

        /* access modifiers changed from: 0000 */
        public abstract b b(long j);

        /* access modifiers changed from: 0000 */
        public abstract b b(C4928GKa<C3508cda> gKa);

        /* access modifiers changed from: 0000 */
        public abstract b b(String str);

        /* access modifiers changed from: 0000 */
        public abstract b c(long j);

        /* access modifiers changed from: 0000 */
        public abstract b c(C4928GKa<Integer> gKa);

        /* access modifiers changed from: 0000 */
        public abstract b c(String str);

        /* access modifiers changed from: 0000 */
        public abstract b d(C4928GKa<String> gKa);

        /* access modifiers changed from: 0000 */
        public abstract b d(String str);

        /* access modifiers changed from: 0000 */
        public abstract b e(C4928GKa<Integer> gKa);

        /* access modifiers changed from: 0000 */
        public abstract b f(C4928GKa<C3508cda> gKa);

        /* access modifiers changed from: 0000 */
        public abstract b g(C4928GKa<C3508cda> gKa);

        /* access modifiers changed from: 0000 */
        public abstract b h(C4928GKa<String> gKa);

        /* access modifiers changed from: 0000 */
        public abstract b i(C4928GKa<C3508cda> gKa);

        /* access modifiers changed from: 0000 */
        public abstract b j(C4928GKa<String> gKa);

        /* access modifiers changed from: 0000 */
        public abstract b k(C4928GKa<com.soundcloud.android.playback.C4298dd.a> gKa);

        /* access modifiers changed from: private */
        public b a(C3443MZ mz) {
            a(mz.c());
            a(mz.f());
            d(C4928GKa.b(mz.d()));
            d(mz.b());
            c(mz.a());
            return this;
        }

        /* access modifiers changed from: private */
        public b a(I i) {
            if (i.o()) {
                h(C4928GKa.b(i.j()));
                j(C4928GKa.b(i.k()));
            }
            if (i.p()) {
                a(C4928GKa.c(i.a()));
                c(C4928GKa.c(Integer.valueOf(i.e())));
            }
            if (i.n()) {
                g(C4928GKa.c(i.h()));
            }
            if (i.r()) {
                SearchQuerySourceInfo i2 = i.i();
                f(C4928GKa.c(i2.e()));
                e(C4928GKa.c(Integer.valueOf(C7248rIa.a(i2, C3508cda.a))));
            }
            if (i.s()) {
                i(C4928GKa.c(i.a()));
                if (!i.l().a().equals(C3508cda.a)) {
                    f(C4928GKa.c(i.l().a()));
                }
            }
            if (i.m()) {
                B g = i.g();
                f(C4928GKa.c(g.b()));
                e(C4928GKa.c(Integer.valueOf(g.a())));
            }
            return this;
        }
    }

    /* renamed from: LZ$c */
    /* compiled from: AdRichMediaSessionEvent */
    public enum c {
        MANUAL("manual"),
        AUTO("auto");
        
        private final String d;

        private c(String str) {
            this.d = str;
        }

        public String a() {
            return this.d;
        }
    }

    public static C3440LZ a(U u, C3443MZ mz, com.soundcloud.android.playback.C4298dd.a aVar) {
        return a(a.AUDIO_ACTION_PAUSE, u, mz).k(C4928GKa.c(aVar)).a();
    }

    public static C3440LZ b(U u, C3443MZ mz) {
        return a(a.AUDIO_ACTION_PLAY, u, mz).a();
    }

    public abstract long A();

    public abstract c B();

    public abstract a h();

    public abstract C3508cda i();

    public abstract String j();

    public abstract String k();

    public abstract C4928GKa<C3508cda> l();

    public abstract C4928GKa<C3508cda> m();

    public abstract com.soundcloud.android.foundation.ads.C3676c.a n();

    public abstract String o();

    public abstract String p();

    public abstract long q();

    public abstract C4928GKa<Integer> r();

    public abstract C4928GKa<String> s();

    public abstract C4928GKa<Integer> t();

    public abstract C4928GKa<C3508cda> u();

    public abstract C4928GKa<C3508cda> v();

    public abstract C4928GKa<String> w();

    public abstract C4928GKa<C3508cda> x();

    public abstract C4928GKa<String> y();

    public abstract C4928GKa<com.soundcloud.android.playback.C4298dd.a> z();

    public static C3440LZ a(U u, C3443MZ mz) {
        return a(a.AUDIO_ACTION_CHECKPOINT, u, mz).a();
    }

    private static b a(a aVar, U u, C3443MZ mz) {
        I e = mz.e();
        b k = new a().e(J.b()).b(J.c()).b("rich_media_stream").a(aVar).a(u.f()).b(C4928GKa.b(u.i())).a(u.k()).c(e.b()).a(e.u() ? c.MANUAL : c.AUTO).h(C4928GKa.a()).j(C4928GKa.a()).a(C4928GKa.a()).c(C4928GKa.a()).g(C4928GKa.a()).f(C4928GKa.a()).e(C4928GKa.a()).i(C4928GKa.a()).k(C4928GKa.a());
        k.a(mz);
        k.a(e);
        return k;
    }
}
