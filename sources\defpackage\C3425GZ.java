package defpackage;

import com.soundcloud.android.foundation.ads.M;
import com.soundcloud.android.foundation.ads.O;
import com.soundcloud.android.foundation.ads.P;
import com.soundcloud.android.foundation.ads.Q;
import com.soundcloud.android.foundation.ads.ca;
import com.soundcloud.android.foundation.events.I;
import com.soundcloud.android.foundation.events.J;
import java.util.List;

/* renamed from: GZ reason: default package and case insensitive filesystem */
/* compiled from: AdOverlayTrackingEvent */
public abstract class C3425GZ extends J {

    /* renamed from: GZ$a */
    /* compiled from: AdOverlayTrackingEvent */
    public static abstract class a {
        public abstract a a(long j);

        public abstract a a(C4928GKa<String> gKa);

        public abstract a a(b bVar);

        public abstract a a(C3508cda cda);

        public abstract a a(List<String> list);

        public abstract C3425GZ a();

        public abstract a b(C4928GKa<String> gKa);

        public abstract a b(C3508cda cda);

        public abstract a c(C4928GKa<C3508cda> gKa);

        public abstract a c(C3508cda cda);

        public abstract a d(C4928GKa<String> gKa);

        public abstract a e(C4928GKa<c> gKa);

        public abstract a f(C4928GKa<C3508cda> gKa);

        public abstract a g(C4928GKa<c> gKa);

        public abstract a h(C4928GKa<String> gKa);
    }

    /* renamed from: GZ$b */
    /* compiled from: AdOverlayTrackingEvent */
    public enum b {
        KIND_IMPRESSION("impression"),
        KIND_CLICK("click");
        
        private final String d;

        private b(String str) {
            this.d = str;
        }

        public String a() {
            return this.d;
        }
    }

    /* renamed from: GZ$c */
    /* compiled from: AdOverlayTrackingEvent */
    public enum c {
        TYPE_LEAVE_BEHIND("leave_behind"),
        TYPE_HTML_LEAVE_BEHIND("html_leave_behind"),
        TYPE_INTERSTITIAL("interstitial"),
        TYPE_AUDIO_AD("audio_ad");
        
        private final String f;

        private c(String str) {
            this.f = str;
        }

        public String a() {
            return this.f;
        }
    }

    private static a a(long j, b bVar, ca caVar, C3508cda cda, C3508cda cda2, List<String> list, I i) {
        C4928GKa a2 = a(i);
        C4928GKa a3 = C4928GKa.a();
        if (caVar instanceof Q) {
            a3 = C4928GKa.c(c.TYPE_AUDIO_AD);
        } else if (caVar instanceof P) {
            a3 = C4928GKa.c(c.TYPE_INTERSTITIAL);
        }
        C4928GKa a4 = C4928GKa.a();
        if (caVar instanceof O) {
            a4 = C4928GKa.c(((O) caVar).v());
        }
        return new a().a(J.b()).a(j).a(bVar).a(list).c(cda2).b(cda).a(a4).h(a2).a(caVar.f()).g(a3).b(C4928GKa.a()).d(C4928GKa.a()).c(C4928GKa.a()).f(C4928GKa.a()).e(C4928GKa.a());
    }

    private static C4928GKa<C3508cda> b(ca caVar) {
        if (caVar instanceof Q) {
            return C4928GKa.c(((Q) caVar).w());
        }
        if (caVar instanceof M) {
            return C4928GKa.c(((M) caVar).y());
        }
        return C4928GKa.a();
    }

    private static C4928GKa<c> c(ca caVar) {
        if (caVar instanceof Q) {
            return C4928GKa.c(c.TYPE_LEAVE_BEHIND);
        }
        if (caVar instanceof M) {
            return C4928GKa.c(c.TYPE_HTML_LEAVE_BEHIND);
        }
        if (caVar instanceof P) {
            return C4928GKa.c(c.TYPE_INTERSTITIAL);
        }
        return C4928GKa.a();
    }

    public abstract C4928GKa<String> h();

    public abstract C3508cda i();

    public abstract C4928GKa<String> j();

    public abstract C4928GKa<C3508cda> k();

    public abstract C4928GKa<String> l();

    public abstract b m();

    public abstract C4928GKa<c> n();

    public abstract C4928GKa<C3508cda> o();

    public abstract C3508cda p();

    public abstract C4928GKa<c> q();

    public abstract C4928GKa<String> r();

    public abstract List<String> s();

    public abstract C3508cda t();

    private static C4928GKa<String> a(I i) {
        if (i != null) {
            return C4928GKa.c(i.b());
        }
        return C4928GKa.a();
    }

    public static C3425GZ a(ca caVar, C3508cda cda, C3508cda cda2, I i, Yaa yaa, String str) {
        return a(J.c(), caVar, cda, cda2, i, yaa, str);
    }

    public static C3425GZ a(ca caVar, C3508cda cda, C3508cda cda2, I i, Yaa yaa) {
        return a(J.c(), caVar, cda, cda2, i, yaa);
    }

    public static C3425GZ a(long j, ca caVar, C3508cda cda, C3508cda cda2, I i, Yaa yaa) {
        return a(j, b.KIND_IMPRESSION, caVar, cda, cda2, yaa.a(caVar.n()), i).e(c(caVar)).f(a(caVar, cda)).a();
    }

    public static C3425GZ a(long j, ca caVar, C3508cda cda, C3508cda cda2, I i, Yaa yaa, String str) {
        return a(j, b.KIND_CLICK, caVar, cda, cda2, yaa.a(caVar.m()), i).b(a(caVar)).d(C4928GKa.c(str)).c(b(caVar)).a();
    }

    private static C4928GKa<String> a(ca caVar) {
        String str = "clickthrough::%s";
        if (caVar instanceof Q) {
            return C4928GKa.c(String.format(str, new Object[]{c.TYPE_LEAVE_BEHIND.a()}));
        } else if (caVar instanceof M) {
            return C4928GKa.c(String.format(str, new Object[]{c.TYPE_HTML_LEAVE_BEHIND.a()}));
        } else if (!(caVar instanceof P)) {
            return C4928GKa.a();
        } else {
            return C4928GKa.c(String.format(str, new Object[]{c.TYPE_INTERSTITIAL.a()}));
        }
    }

    private static C4928GKa<C3508cda> a(ca caVar, C3508cda cda) {
        if (caVar instanceof Q) {
            return C4928GKa.c(((Q) caVar).w());
        }
        if (caVar instanceof M) {
            return C4928GKa.c(((M) caVar).y());
        }
        if (caVar instanceof P) {
            return C4928GKa.c(cda);
        }
        return C4928GKa.a();
    }
}
