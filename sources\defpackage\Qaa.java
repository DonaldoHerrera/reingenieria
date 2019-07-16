package defpackage;

import com.soundcloud.android.foundation.events.J;
import java.util.List;

/* renamed from: Qaa reason: default package */
/* compiled from: PromotedTrackingEvent */
public abstract class Qaa extends J {

    /* renamed from: Qaa$a */
    /* compiled from: PromotedTrackingEvent */
    public static abstract class a {
        /* access modifiers changed from: 0000 */
        public abstract a a(long j);

        /* access modifiers changed from: 0000 */
        public abstract a a(C4928GKa<String> gKa);

        /* access modifiers changed from: 0000 */
        public abstract a a(c cVar);

        /* access modifiers changed from: 0000 */
        public abstract a a(String str);

        /* access modifiers changed from: 0000 */
        public abstract a a(List<String> list);

        public abstract Qaa a();

        /* access modifiers changed from: 0000 */
        public abstract a b(C4928GKa<C3508cda> gKa);

        /* access modifiers changed from: 0000 */
        public abstract a b(String str);

        /* access modifiers changed from: 0000 */
        public abstract a c(C4928GKa<C3508cda> gKa);

        /* access modifiers changed from: 0000 */
        public abstract a c(String str);

        /* access modifiers changed from: 0000 */
        public abstract a d(C4928GKa<b> gKa);

        /* access modifiers changed from: 0000 */
        public abstract a e(C4928GKa<C3508cda> gKa);

        /* access modifiers changed from: 0000 */
        public abstract a f(C4928GKa<C3508cda> gKa);

        /* access modifiers changed from: 0000 */
        public abstract a g(C4928GKa<Integer> gKa);
    }

    /* renamed from: Qaa$b */
    /* compiled from: PromotedTrackingEvent */
    public enum b {
        PROMOTED_PLAYLIST("promoted_playlist"),
        PROMOTED_TRACK("promoted_track");
        
        private final String d;

        private b(String str) {
            this.d = str;
        }

        public String a() {
            return this.d;
        }
    }

    /* renamed from: Qaa$c */
    /* compiled from: PromotedTrackingEvent */
    public enum c {
        KIND_IMPRESSION("impression"),
        KIND_CLICK("click");
        
        private final String d;

        private c(String str) {
            this.d = str;
        }

        public String a() {
            return this.d;
        }
    }

    private static a a(c cVar, String str, C4928GKa<C3508cda> gKa, List<String> list, String str2) {
        return new a().d(J.b()).a(J.c()).a(cVar).a(list).b("promoted").a(str).c(str2).g(C4928GKa.a()).e(C4928GKa.a()).d(C4928GKa.a()).f(gKa).b(C4928GKa.a()).c(C4928GKa.a()).a(C4928GKa.a());
    }

    public static Qaa b(C3508cda cda, C3879tda tda, String str, C4928GKa<Integer> gKa) {
        return a(c.KIND_CLICK, tda, tda.c().b(), str).b(C4928GKa.c(cda)).c(C4928GKa.c(tda.b().c())).a(C4928GKa.c("item_navigation")).g(gKa).a();
    }

    public static Qaa c(C3508cda cda, C3879tda tda, String str) {
        return b(cda, tda, str, C4928GKa.a());
    }

    public static Qaa d(C3508cda cda, C3879tda tda, String str) {
        return a(b.PROMOTED_TRACK, cda, tda, str);
    }

    public abstract String h();

    public abstract C4928GKa<String> i();

    public abstract C4928GKa<C3508cda> j();

    public abstract C4928GKa<C3508cda> k();

    public abstract C4928GKa<b> l();

    public abstract C4928GKa<C3508cda> m();

    public abstract c n();

    public abstract String o();

    public abstract String p();

    public abstract C4928GKa<C3508cda> q();

    public abstract C4928GKa<Integer> r();

    public abstract List<String> s();

    public static Qaa b(C3508cda cda, C3879tda tda, String str) {
        return a(b.PROMOTED_PLAYLIST, cda, tda, str);
    }

    public static Qaa a(C3508cda cda, C3879tda tda, String str, C4928GKa<Integer> gKa) {
        return a(c.KIND_CLICK, tda, tda.c().c(), str).b(C4928GKa.c(cda)).c(C4928GKa.c(cda)).a(C4928GKa.c("item_navigation")).g(gKa).a();
    }

    public static Qaa a(C3508cda cda, C3879tda tda, String str) {
        return a(cda, tda, str, C4928GKa.a());
    }

    public static Qaa a(C3508cda cda, C3508cda cda2, C3879tda tda, String str, C4928GKa<Integer> gKa) {
        return a(c.KIND_CLICK, tda, tda.c().a(), str).b(C4928GKa.c(cda)).c(C4928GKa.c(cda2)).a(C4928GKa.c("item_navigation")).g(gKa).a();
    }

    private static Qaa a(b bVar, C3508cda cda, C3879tda tda, String str) {
        return a(c.KIND_IMPRESSION, tda, tda.c().d(), str).e(C4928GKa.c(cda)).d(C4928GKa.c(bVar)).a();
    }

    private static a a(c cVar, C3879tda tda, List<String> list, String str) {
        C4928GKa gKa;
        if (tda.b() != null) {
            gKa = C4928GKa.c(tda.b().c());
        } else {
            gKa = C4928GKa.a();
        }
        return a(cVar, tda.a().b(), gKa, list, str);
    }
}
