package defpackage;

import com.facebook.stetho.websocket.CloseCodes;
import com.soundcloud.android.foundation.events.J;

/* renamed from: Waa reason: default package */
/* compiled from: UpgradeFunnelEvent */
public abstract class Waa extends J {

    /* renamed from: Waa$a */
    /* compiled from: UpgradeFunnelEvent */
    public enum a {
        WHY_ADS("1jourb"),
        CONVERSION("b4r6to"),
        PROMO("355p3s"),
        HIGH_TIER_TRACK_PLAYED("lfydid"),
        STREAM_UPSELL("a7r5gy"),
        SETTINGS("396cnm"),
        PLAYLIST_TRACKS_UPSELL("8a8hir"),
        PLAN_DOWNGRADED("ik01gn"),
        DISCOVERY_UPSELL("3k9mgl");
        
        public final String k;

        private a(String str) {
            this.k = str;
        }
    }

    /* renamed from: Waa$b */
    /* compiled from: UpgradeFunnelEvent */
    static abstract class b {
        b() {
        }

        /* access modifiers changed from: 0000 */
        public abstract b a(long j);

        /* access modifiers changed from: 0000 */
        public abstract b a(C4928GKa<a> gKa);

        /* access modifiers changed from: 0000 */
        public abstract b a(e eVar);

        /* access modifiers changed from: 0000 */
        public abstract b a(g gVar);

        /* access modifiers changed from: 0000 */
        public abstract Waa a();

        /* access modifiers changed from: 0000 */
        public abstract b b(C4928GKa<c> gKa);

        /* access modifiers changed from: 0000 */
        public abstract b c(C4928GKa<d> gKa);

        /* access modifiers changed from: 0000 */
        public abstract b d(C4928GKa<String> gKa);

        /* access modifiers changed from: 0000 */
        public abstract b e(C4928GKa<String> gKa);

        /* access modifiers changed from: 0000 */
        public abstract b f(C4928GKa<f> gKa);

        /* access modifiers changed from: 0000 */
        public abstract b g(C4928GKa<String> gKa);

        /* access modifiers changed from: 0000 */
        public abstract b h(C4928GKa<String> gKa);

        /* access modifiers changed from: 0000 */
        public abstract b i(C4928GKa<String> gKa);
    }

    /* renamed from: Waa$c */
    /* compiled from: UpgradeFunnelEvent */
    public enum c {
        CONSUMER_SUBS("consumer_subs");
        
        private final String c;

        private c(String str) {
            this.c = str;
        }

        public String a() {
            return this.c;
        }
    }

    /* renamed from: Waa$d */
    /* compiled from: UpgradeFunnelEvent */
    public enum d {
        CONSUMER_SUB_AD("clickthrough::consumer_sub_ad"),
        CONSUMER_SUB_RESUBSCRIBE("clickthrough::consumer_sub_resubscribe");
        
        private final String d;

        private d(String str) {
            this.d = str;
        }

        public String a() {
            return this.d;
        }
    }

    /* renamed from: Waa$e */
    /* compiled from: UpgradeFunnelEvent */
    public enum e {
        IMPRESSION("impression"),
        CLICK("click");
        
        final String d;

        private e(String str) {
            this.d = str;
        }

        public String a() {
            return this.d;
        }
    }

    /* renamed from: Waa$f */
    /* compiled from: UpgradeFunnelEvent */
    public enum f {
        CONSUMER_SUB_AD("consumer_sub_ad"),
        CONSUMER_SUB_UPGRADE_SUCCESS("consumer_sub_upgrade_success"),
        CONSUMER_SUB_RESUBSCRIBE("consumer_sub_resubscribe");
        
        private final String e;

        private f(String str) {
            this.e = str;
        }

        public String a() {
            return this.e;
        }
    }

    /* renamed from: Waa$g */
    /* compiled from: UpgradeFunnelEvent */
    public enum g {
        UPSELL_IMPRESSION("upsell_impression"),
        RESUBSCRIBE_IMPRESSION("resub_impression"),
        UPGRADE_SUCCESS("upgrade_complete"),
        UPSELL_CLICK("upsell_click"),
        RESUBSCRIBE_CLICK("resub_click");
        
        final String g;

        private g(String str) {
            this.g = str;
        }
    }

    /* renamed from: Waa$h */
    /* compiled from: UpgradeFunnelEvent */
    public enum h {
        WHY_ADS(CloseCodes.CLOSED_ABNORMALLY),
        PLAYER(1017),
        SETTINGS_UPGRADE(1008),
        LIKES(1009),
        SEARCH_RESULTS(1025),
        SEARCH_RESULTS_GO(1026),
        PLAYLIST_ITEM(CloseCodes.UNEXPECTED_CONDITION),
        PLAYLIST_PAGE(1012),
        PLAYLIST_OVERFLOW(1048),
        STREAM(1027),
        COLLECTION(1052),
        PLAYLIST_TRACKS(1042),
        CONVERSION_BUY(3002),
        CONVERSION_PROMO(4007),
        UPSELL_FROM_DISCOVERY_GO(1059),
        UPSELL_FROM_COLLECTION_GO(1062),
        UPSELL_FROM_STREAM_GO(1065),
        UPSELL_FROM_DOWNLOADS(2080),
        UPSELL_HEADER_FROM_DISCOVERY(1100),
        UPSELL_HEADER_FROM_COLLECTION(1101),
        UPSELL_HEADER_FROM_STREAM(1102),
        RESUBSCRIBE_BUTTON(4002),
        CHOOSER_BUY_MID_TIER(3009),
        CHOOSER_BUY_HIGH_TIER(3011),
        DISCOVERY(1056),
        HIGH_QUALITY_STREAMING(2005),
        AUTO_QUALITY_STREAMING(2008),
        OFFLINE_SYNC_SETTINGS(2011),
        OFFLINE_SYNC_HIGH_QUALITY(2013),
        SETTINGS_STUDENT_UPGRADE(2078),
        CHOOSER_BUY_STUDENT_TIER(2083);
        
        private final int G;

        private h(int i) {
            this.G = i;
        }

        public String a() {
            StringBuilder sb = new StringBuilder();
            sb.append("soundcloud:tcode:");
            sb.append(this.G);
            return sb.toString();
        }
    }

    public static Waa A() {
        return e(h.OFFLINE_SYNC_HIGH_QUALITY).h(C4928GKa.c(Yca.SETTINGS_OFFLINE.a())).a();
    }

    public static Waa B() {
        return f(h.OFFLINE_SYNC_HIGH_QUALITY).h(C4928GKa.c(Yca.SETTINGS_OFFLINE.a())).a();
    }

    public static Waa C() {
        return c(h.HIGH_QUALITY_STREAMING);
    }

    public static Waa D() {
        return d(h.HIGH_QUALITY_STREAMING);
    }

    public static Waa E() {
        return e(h.LIKES).h(C4928GKa.c(Yca.LIKES.a())).a();
    }

    public static Waa F() {
        return f(h.LIKES).h(C4928GKa.c(Yca.LIKES.a())).a();
    }

    public static Waa G() {
        return e(h.OFFLINE_SYNC_SETTINGS).h(C4928GKa.c(Yca.SETTINGS_MAIN.a())).a();
    }

    public static Waa H() {
        return f(h.OFFLINE_SYNC_SETTINGS).h(C4928GKa.c(Yca.SETTINGS_MAIN.a())).a();
    }

    public static Waa I() {
        return a(g.RESUBSCRIBE_CLICK).a(e.CLICK).b(C4928GKa.c(c.CONSUMER_SUBS)).c(C4928GKa.c(d.CONSUMER_SUB_RESUBSCRIBE)).d(C4928GKa.c(h.RESUBSCRIBE_BUTTON.a())).h(C4928GKa.c(Yca.OFFLINE_OFFBOARDING.a())).a();
    }

    public static Waa J() {
        return a(g.RESUBSCRIBE_IMPRESSION).a(e.IMPRESSION).f(C4928GKa.c(f.CONSUMER_SUB_RESUBSCRIBE)).g(C4928GKa.c(h.RESUBSCRIBE_BUTTON.a())).a(C4928GKa.c(a.PLAN_DOWNGRADED)).h(C4928GKa.c(Yca.OFFLINE_OFFBOARDING.a())).a();
    }

    public static Waa K() {
        return e(h.STREAM).h(C4928GKa.c(Yca.STREAM.a())).a();
    }

    public static Waa L() {
        return f(h.STREAM).a(C4928GKa.c(a.STREAM_UPSELL)).h(C4928GKa.c(Yca.STREAM.a())).a();
    }

    public static Waa M() {
        return e(h.SETTINGS_UPGRADE).h(C4928GKa.c(Yca.SETTINGS_MAIN.a())).a();
    }

    public static Waa N() {
        return f(h.SETTINGS_UPGRADE).a(C4928GKa.c(a.SETTINGS)).h(C4928GKa.c(Yca.SETTINGS_MAIN.a())).a();
    }

    public static Waa O() {
        return e(h.SETTINGS_STUDENT_UPGRADE).h(C4928GKa.c(Yca.SETTINGS_MAIN.a())).a();
    }

    public static Waa P() {
        return a(g.UPGRADE_SUCCESS).a(e.IMPRESSION).f(C4928GKa.c(f.CONSUMER_SUB_UPGRADE_SUCCESS)).a();
    }

    public static Waa Q() {
        return e(h.WHY_ADS).a();
    }

    public static Waa R() {
        return f(h.WHY_ADS).a(C4928GKa.c(a.WHY_ADS)).a();
    }

    public static Waa S() {
        return e(h.UPSELL_FROM_DOWNLOADS).h(C4928GKa.c(Yca.DOWNLOADS.a())).a();
    }

    private static b a(g gVar) {
        return new a().a(J.b()).a(J.c()).a(gVar).h(C4928GKa.a()).i(C4928GKa.a()).c(C4928GKa.a()).b(C4928GKa.a()).d(C4928GKa.a()).f(C4928GKa.a()).e(C4928GKa.a()).g(C4928GKa.a()).a(C4928GKa.a());
    }

    public static Waa b(C3508cda cda) {
        return f(h.PLAYER).a(C4928GKa.c(a.HIGH_TIER_TRACK_PLAYED)).h(C4928GKa.c(Yca.PLAYER_MAIN.a())).i(C4928GKa.c(cda.toString())).a();
    }

    public static Waa c(C3508cda cda) {
        return e(h.PLAYLIST_OVERFLOW).h(C4928GKa.c(Yca.PLAYLIST_DETAILS.a())).i(C4928GKa.c(cda.toString())).a();
    }

    public static Waa d(C3508cda cda) {
        return f(h.PLAYLIST_OVERFLOW).h(C4928GKa.c(Yca.PLAYLIST_DETAILS.a())).i(C4928GKa.c(cda.toString())).a();
    }

    private static b e(h hVar) {
        return a(g.UPSELL_CLICK).a(e.CLICK).c(C4928GKa.c(d.CONSUMER_SUB_AD)).b(C4928GKa.c(c.CONSUMER_SUBS)).d(C4928GKa.c(hVar.a()));
    }

    private static b f(h hVar) {
        return a(g.UPSELL_IMPRESSION).a(e.IMPRESSION).f(C4928GKa.c(f.CONSUMER_SUB_AD)).g(C4928GKa.c(hVar.a()));
    }

    public static Waa g(C3508cda cda) {
        return e(h.PLAYLIST_TRACKS).h(C4928GKa.c(Yca.PLAYLIST_DETAILS.a())).i(C4928GKa.c(cda.toString())).a();
    }

    public static Waa h(C3508cda cda) {
        return f(h.PLAYLIST_TRACKS).a(C4928GKa.c(a.PLAYLIST_TRACKS_UPSELL)).h(C4928GKa.c(Yca.PLAYLIST_DETAILS.a())).i(C4928GKa.c(cda.toString())).a();
    }

    public static Waa m() {
        return c(h.AUTO_QUALITY_STREAMING);
    }

    public static Waa n() {
        return d(h.AUTO_QUALITY_STREAMING);
    }

    public static Waa o() {
        return e(h.CHOOSER_BUY_HIGH_TIER).h(C4928GKa.c(Yca.PLAN_CHOICE.a())).a();
    }

    public static Waa p() {
        return f(h.CHOOSER_BUY_HIGH_TIER).h(C4928GKa.c(Yca.PLAN_CHOICE.a())).a();
    }

    public static Waa q() {
        return e(h.CHOOSER_BUY_MID_TIER).h(C4928GKa.c(Yca.PLAN_CHOICE.a())).a();
    }

    public static Waa r() {
        return f(h.CHOOSER_BUY_MID_TIER).h(C4928GKa.c(Yca.PLAN_CHOICE.a())).a();
    }

    public static Waa s() {
        return e(h.CHOOSER_BUY_STUDENT_TIER).h(C4928GKa.c(Yca.PLAN_CHOICE.a())).a();
    }

    public static Waa t() {
        return f(h.CHOOSER_BUY_STUDENT_TIER).h(C4928GKa.c(Yca.PLAN_CHOICE.a())).a();
    }

    public static Waa u() {
        return e(h.COLLECTION).h(C4928GKa.c(Yca.COLLECTIONS.a())).a();
    }

    public static Waa v() {
        return f(h.COLLECTION).h(C4928GKa.c(Yca.COLLECTIONS.a())).a();
    }

    public static Waa w() {
        return e(h.CONVERSION_BUY).h(C4928GKa.c(Yca.CONVERSION.a())).a();
    }

    public static Waa x() {
        return f(h.CONVERSION_BUY).a(C4928GKa.c(a.CONVERSION)).h(C4928GKa.c(Yca.CONVERSION.a())).a();
    }

    public static Waa y() {
        return e(h.CONVERSION_PROMO).h(C4928GKa.c(Yca.CONVERSION.a())).a();
    }

    public static Waa z() {
        return f(h.CONVERSION_PROMO).a(C4928GKa.c(a.PROMO)).h(C4928GKa.c(Yca.CONVERSION.a())).a();
    }

    public abstract C4928GKa<String> T();

    public abstract C4928GKa<f> U();

    public abstract C4928GKa<String> V();

    public abstract g W();

    public abstract C4928GKa<String> X();

    public abstract C4928GKa<String> Y();

    public abstract C4928GKa<a> h();

    public abstract C4928GKa<c> i();

    public abstract C4928GKa<d> j();

    public abstract C4928GKa<String> k();

    public abstract e l();

    private static Waa c(h hVar) {
        return e(hVar).h(C4928GKa.c(Yca.SETTINGS_STREAMING_QUALITY.a())).a();
    }

    private static Waa d(h hVar) {
        return f(hVar).h(C4928GKa.c(Yca.SETTINGS_STREAMING_QUALITY.a())).a();
    }

    public static Waa f(C3508cda cda) {
        return f(h.PLAYLIST_PAGE).h(C4928GKa.c(Yca.PLAYLIST_DETAILS.a())).i(C4928GKa.c(cda.toString())).a();
    }

    public static Waa b(h hVar) {
        return e(hVar).a();
    }

    public static Waa e(C3508cda cda) {
        return e(h.PLAYLIST_PAGE).h(C4928GKa.c(Yca.PLAYLIST_DETAILS.a())).i(C4928GKa.c(cda.toString())).a();
    }

    public static Waa b(String str, C3508cda cda) {
        return f(h.PLAYLIST_ITEM).h(C4928GKa.c(str)).i(C4928GKa.c(cda.toString())).a();
    }

    public static Waa a(C3508cda cda) {
        return e(h.PLAYER).h(C4928GKa.c(Yca.PLAYER_MAIN.a())).i(C4928GKa.c(cda.toString())).a();
    }

    public static Waa a(h hVar) {
        return e(hVar).a();
    }

    public static Waa a(String str, C3508cda cda) {
        return e(h.PLAYLIST_ITEM).h(C4928GKa.c(str)).i(C4928GKa.c(cda.toString())).a();
    }
}
