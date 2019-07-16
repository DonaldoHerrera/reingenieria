package defpackage;

import com.soundcloud.android.foundation.events.J;
import com.soundcloud.android.foundation.events.PromotedSourceInfo;

/* renamed from: zaa reason: default package and case insensitive filesystem */
/* compiled from: OfflineInteractionEvent */
public abstract class C3924zaa extends J {

    /* renamed from: zaa$a */
    /* compiled from: OfflineInteractionEvent */
    public static abstract class a {
        public abstract a a(long j);

        public abstract a a(C4928GKa<String> gKa);

        public a a(PromotedSourceInfo promotedSourceInfo) {
            if (promotedSourceInfo != null) {
                a(C4928GKa.c(promotedSourceInfo.a()));
                h(C4928GKa.c(com.soundcloud.android.foundation.ads.C3676c.a.PROMOTED));
                k(C4928GKa.b(promotedSourceInfo.c()));
            }
            return this;
        }

        public abstract a a(b bVar);

        public abstract a a(boolean z);

        public abstract C3924zaa a();

        public abstract a b(C4928GKa<String> gKa);

        public abstract a c(C4928GKa<c> gKa);

        public abstract a d(C4928GKa<C3508cda> gKa);

        public abstract a e(C4928GKa<String> gKa);

        public abstract a f(C4928GKa<c> gKa);

        public abstract a g(C4928GKa<Boolean> gKa);

        public abstract a h(C4928GKa<com.soundcloud.android.foundation.ads.C3676c.a> gKa);

        public abstract a i(C4928GKa<d> gKa);

        public abstract a j(C4928GKa<String> gKa);

        public abstract a k(C4928GKa<C3508cda> gKa);
    }

    /* renamed from: zaa$b */
    /* compiled from: OfflineInteractionEvent */
    public enum b {
        IMPRESSION("impression"),
        CLICK("click");
        
        private final String d;

        private b(String str) {
            this.d = str;
        }

        public String a() {
            return this.d;
        }
    }

    /* renamed from: zaa$c */
    /* compiled from: OfflineInteractionEvent */
    public enum c {
        KIND_ONBOARDING_START("offline_sync_onboarding::start"),
        KIND_ONBOARDING_DISMISS("offline_sync_onboarding::dismiss"),
        KIND_ONBOARDING_AUTOMATIC_SYNC("offline_sync_onboarding::automatic_collection_sync"),
        KIND_ONBOARDING_MANUAL_SYNC("offline_sync_onboarding::manual_sync"),
        KIND_WIFI_SYNC_ENABLE("only_sync_over_wifi::enable"),
        KIND_WIFI_SYNC_DISABLE("only_sync_over_wifi::disable"),
        KIND_COLLECTION_SYNC_ENABLE("automatic_collection_sync::enable"),
        KIND_COLLECTION_SYNC_DISABLE("automatic_collection_sync::disable"),
        KIND_LIMIT_BELOW_USAGE("offline_storage::limit_below_usage"),
        KIND_OFFLINE_PLAYLIST_ADD("playlist_to_offline::add"),
        KIND_OFFLINE_PLAYLIST_REMOVE("playlist_to_offline::remove"),
        KIND_OFFLINE_LIKES_ADD("automatic_likes_sync::enable"),
        KIND_OFFLINE_LIKES_REMOVE("automatic_likes_sync::disable"),
        KIND_OFFLINE_HIGH_QUALITY_ADD("sync_high_quality_audio::enable"),
        KIND_OFFLINE_HIGH_QUALITY_REMOVE("sync_high_quality_audio::disable"),
        KIND_OFFLINE_STORAGE_LOCATION_CONFIRM_SD("offline_storage_location::confirm_sd"),
        KIND_OFFLINE_STORAGE_LOCATION_CONFIRM_DEVICE("offline_storage_location::confirm_device"),
        KIND_OFFLINE_CHANGE_QUALITY_REDOWNLOAD_EXISTING_CONTENT_YES("redownload_existing_content::yes"),
        KIND_OFFLINE_CHANGE_QUALITY_REDOWNLOAD_EXISTING_CONTENT_NO("redownload_existing_content::no");
        
        private final String u;

        private c(String str) {
            this.u = str;
        }

        public String a() {
            return this.u;
        }
    }

    /* renamed from: zaa$d */
    /* compiled from: OfflineInteractionEvent */
    public enum d {
        LIKES_CONTEXT("likes"),
        PLAYLIST_CONTEXT("playlist"),
        ALL_CONTEXT("all");
        
        private final String e;

        private d(String str) {
            this.e = str;
        }

        public String a() {
            return this.e;
        }
    }

    public static C3924zaa a(boolean z) {
        return a(z ? c.KIND_WIFI_SYNC_ENABLE : c.KIND_WIFI_SYNC_DISABLE).a();
    }

    public static C3924zaa b(String str) {
        return a(c.KIND_OFFLINE_HIGH_QUALITY_REMOVE).g(C4928GKa.c(Boolean.valueOf(false))).j(C4928GKa.c(str)).a();
    }

    public static C3924zaa c(String str) {
        return a(c.KIND_COLLECTION_SYNC_ENABLE).i(C4928GKa.c(d.ALL_CONTEXT)).g(C4928GKa.c(Boolean.valueOf(true))).j(C4928GKa.c(str)).a();
    }

    public static C3924zaa d(String str) {
        return a(c.KIND_OFFLINE_HIGH_QUALITY_ADD).g(C4928GKa.c(Boolean.valueOf(true))).j(C4928GKa.c(str)).a();
    }

    public static C3924zaa e(String str) {
        return a(c.KIND_OFFLINE_LIKES_ADD).i(C4928GKa.c(d.LIKES_CONTEXT)).g(C4928GKa.c(Boolean.valueOf(true))).j(C4928GKa.c(str)).a();
    }

    public static C3924zaa f(String str) {
        return a(c.KIND_OFFLINE_CHANGE_QUALITY_REDOWNLOAD_EXISTING_CONTENT_NO).b(C4928GKa.c("consumer_subs")).j(C4928GKa.c(str)).a();
    }

    public static C3924zaa g(String str) {
        return a(c.KIND_OFFLINE_CHANGE_QUALITY_REDOWNLOAD_EXISTING_CONTENT_YES).b(C4928GKa.c("consumer_subs")).j(C4928GKa.c(str)).a();
    }

    public static C3924zaa h(String str) {
        return a(c.KIND_OFFLINE_LIKES_REMOVE).i(C4928GKa.c(d.LIKES_CONTEXT)).g(C4928GKa.c(Boolean.valueOf(false))).j(C4928GKa.c(str)).a();
    }

    public static C3924zaa m() {
        return a(c.KIND_OFFLINE_STORAGE_LOCATION_CONFIRM_DEVICE).j(C4928GKa.c(Yca.SETTINGS_OFFLINE_STORAGE_LOCATION_CONFIRM.a())).a();
    }

    public static C3924zaa n() {
        return a(c.KIND_OFFLINE_STORAGE_LOCATION_CONFIRM_SD).j(C4928GKa.c(Yca.SETTINGS_OFFLINE_STORAGE_LOCATION_CONFIRM.a())).a();
    }

    public static C3924zaa o() {
        return a(b.IMPRESSION).e(C4928GKa.c("consumer_subs")).f(C4928GKa.c(c.KIND_LIMIT_BELOW_USAGE)).j(C4928GKa.c(Yca.SETTINGS_OFFLINE.a())).a();
    }

    public static C3924zaa p() {
        return a(c.KIND_ONBOARDING_START).a();
    }

    public abstract C4928GKa<String> h();

    public abstract C4928GKa<String> i();

    public abstract C4928GKa<c> j();

    public abstract C4928GKa<C3508cda> k();

    public abstract b l();

    public abstract C4928GKa<String> q();

    public abstract C4928GKa<c> r();

    public abstract C4928GKa<Boolean> s();

    public abstract C4928GKa<com.soundcloud.android.foundation.ads.C3676c.a> t();

    public abstract C4928GKa<d> u();

    public abstract C4928GKa<String> v();

    public abstract C4928GKa<C3508cda> w();

    public abstract boolean x();

    public static C3924zaa a(String str) {
        return a(c.KIND_COLLECTION_SYNC_DISABLE).i(C4928GKa.c(d.ALL_CONTEXT)).g(C4928GKa.c(Boolean.valueOf(false))).j(C4928GKa.c(str)).a();
    }

    public static C3924zaa b(String str, C3508cda cda, PromotedSourceInfo promotedSourceInfo) {
        return a(c.KIND_OFFLINE_PLAYLIST_REMOVE).i(C4928GKa.c(d.PLAYLIST_CONTEXT)).g(C4928GKa.c(Boolean.valueOf(false))).j(C4928GKa.c(str)).d(C4928GKa.c(cda)).a(promotedSourceInfo).a();
    }

    public static C3924zaa a(String str, C4928GKa<C3508cda> gKa) {
        return a(c.KIND_COLLECTION_SYNC_DISABLE).i(C4928GKa.c(d.ALL_CONTEXT)).g(C4928GKa.c(Boolean.valueOf(false))).j(C4928GKa.c(str)).d(gKa).a();
    }

    public static C3924zaa a(String str, C3508cda cda, PromotedSourceInfo promotedSourceInfo) {
        return a(c.KIND_OFFLINE_PLAYLIST_ADD).i(C4928GKa.c(d.PLAYLIST_CONTEXT)).g(C4928GKa.c(Boolean.TRUE)).j(C4928GKa.c(str)).d(C4928GKa.c(cda)).a(promotedSourceInfo).a();
    }

    private static a a(c cVar) {
        return a(b.CLICK).b(C4928GKa.c("consumer_subs")).c(C4928GKa.c(cVar));
    }

    private static a a(b bVar) {
        return new a().a(J.b()).a(J.c()).a(bVar).e(C4928GKa.a()).b(C4928GKa.a()).f(C4928GKa.a()).c(C4928GKa.a()).j(C4928GKa.a()).d(C4928GKa.a()).a(C4928GKa.a()).h(C4928GKa.a()).k(C4928GKa.a()).i(C4928GKa.a()).g(C4928GKa.a()).a(true);
    }
}
