package defpackage;

import android.net.Uri;
import android.os.Bundle;
import com.soundcloud.android.C2929h;
import com.soundcloud.android.comments.Y;
import com.soundcloud.android.features.record.Recording;
import com.soundcloud.android.foundation.events.C3710l;
import com.soundcloud.android.foundation.events.K;
import com.soundcloud.android.foundation.events.PromotedSourceInfo;
import com.soundcloud.android.foundation.events.SearchQuerySourceInfo;
import com.soundcloud.android.foundation.playqueue.m;
import java.util.Date;

/* renamed from: nja reason: default package and case insensitive filesystem */
/* compiled from: NavigationTarget */
public abstract class C4621nja {

    /* renamed from: nja$a */
    /* compiled from: NavigationTarget */
    static abstract class a {
        a() {
        }

        /* access modifiers changed from: 0000 */
        public abstract a a(C4928GKa<b> gKa);

        /* access modifiers changed from: 0000 */
        public abstract a a(Yca yca);

        /* access modifiers changed from: 0000 */
        public a a(c cVar) {
            return g(C4928GKa.b(cVar));
        }

        /* access modifiers changed from: 0000 */
        public abstract C4621nja a();

        /* access modifiers changed from: 0000 */
        public abstract a b(C4928GKa<com.soundcloud.android.deeplinks.e> gKa);

        /* access modifiers changed from: 0000 */
        public abstract a c(C4928GKa<String> gKa);

        /* access modifiers changed from: 0000 */
        public abstract a d(C4928GKa<m> gKa);

        /* access modifiers changed from: 0000 */
        public abstract a e(C4928GKa<Boolean> gKa);

        /* access modifiers changed from: 0000 */
        public abstract a f(C4928GKa<Bundle> gKa);

        /* access modifiers changed from: 0000 */
        public abstract a g(C4928GKa<c> gKa);

        /* access modifiers changed from: 0000 */
        public abstract a h(C4928GKa<d> gKa);

        /* access modifiers changed from: 0000 */
        public abstract a i(C4928GKa<e> gKa);

        /* access modifiers changed from: 0000 */
        public abstract a j(C4928GKa<PromotedSourceInfo> gKa);

        /* access modifiers changed from: 0000 */
        public abstract a k(C4928GKa<C3508cda> gKa);

        /* access modifiers changed from: 0000 */
        public abstract a l(C4928GKa<Recording> gKa);

        /* access modifiers changed from: 0000 */
        public abstract a m(C4928GKa<String> gKa);

        /* access modifiers changed from: 0000 */
        public abstract a n(C4928GKa<SearchQuerySourceInfo> gKa);

        /* access modifiers changed from: 0000 */
        public abstract a o(C4928GKa<String> gKa);

        /* access modifiers changed from: 0000 */
        public abstract a p(C4928GKa<f> gKa);

        /* access modifiers changed from: 0000 */
        public abstract a q(C4928GKa<C3508cda> gKa);

        /* access modifiers changed from: 0000 */
        public abstract a r(C4928GKa<Long> gKa);

        /* access modifiers changed from: 0000 */
        public abstract a s(C4928GKa<K> gKa);

        /* access modifiers changed from: 0000 */
        public abstract a t(C4928GKa<C3920yea> gKa);
    }

    /* renamed from: nja$b */
    /* compiled from: NavigationTarget */
    public static abstract class b {
        /* access modifiers changed from: 0000 */
        public abstract C4928GKa<C2132KP> a();

        public abstract C4928GKa<com.soundcloud.android.deeplinks.b> b();
    }

    /* renamed from: nja$c */
    /* compiled from: NavigationTarget */
    public static abstract class c {
        static c a(String str) {
            return new Yia(str, C4928GKa.a());
        }

        public abstract C4928GKa<String> a();

        public abstract String b();

        public Uri c() {
            return Uri.parse(b());
        }

        static c a(String str, C4928GKa<String> gKa) {
            return new Yia(str, gKa);
        }

        /* access modifiers changed from: 0000 */
        public c a(C4928GKa<String> gKa) {
            return new Yia(b(), gKa);
        }
    }

    /* renamed from: nja$d */
    /* compiled from: NavigationTarget */
    public static abstract class d {
        static d a(boolean z) {
            return new Zia(z);
        }

        public abstract boolean a();
    }

    /* renamed from: nja$e */
    /* compiled from: NavigationTarget */
    public static abstract class e {
        static e a(boolean z) {
            return new _ia(z);
        }

        public abstract boolean a();
    }

    /* renamed from: nja$f */
    /* compiled from: NavigationTarget */
    public static abstract class f {
        static f a(C4928GKa<C3508cda> gKa) {
            return new C3948aja(gKa);
        }

        public abstract C4928GKa<C3508cda> a();
    }

    public static C4621nja A() {
        return a(com.soundcloud.android.deeplinks.e.LIKES_COLLECTION, Yca.LIKES);
    }

    static a B() {
        return new a().a(new Date()).g(C4928GKa.a()).m(C4928GKa.a()).b(C4928GKa.a()).c(C4928GKa.a()).k(C4928GKa.a()).q(C4928GKa.a()).d(C4928GKa.a()).a(C4928GKa.a()).n(C4928GKa.a()).j(C4928GKa.a()).p(C4928GKa.a()).s(C4928GKa.a()).h(C4928GKa.a()).l(C4928GKa.a()).i(C4928GKa.a()).t(C4928GKa.a()).f(C4928GKa.a()).o(C4928GKa.a()).e(C4928GKa.a()).r(C4928GKa.a());
    }

    public static C4621nja a(C3508cda cda) {
        return a(com.soundcloud.android.deeplinks.e.ARTIST_COLLECTION, Yca.COLLECTION_FOLLOWING).O().q(C4928GKa.c(cda)).a();
    }

    public static C4621nja b(C3508cda cda, C4928GKa<SearchQuerySourceInfo> gKa) {
        return a(com.soundcloud.android.deeplinks.e.FOLLOWINGS, Yca.UNKNOWN).O().q(C4928GKa.c(cda)).n(gKa).a();
    }

    public static C4621nja c(Yca yca) {
        return B().b(C4928GKa.c(com.soundcloud.android.deeplinks.e.SEARCH_FROM_EMPTY_STATE)).a(yca).c(C4928GKa.c(C2929h.g)).a();
    }

    public static C4621nja d(C3508cda cda, C4928GKa<SearchQuerySourceInfo> gKa) {
        return a(cda, gKa, com.soundcloud.android.deeplinks.e.PROFILE_LIKES, Yca.USERS_LIKES);
    }

    public static C4621nja e(C3508cda cda, C4928GKa<SearchQuerySourceInfo> gKa) {
        return a(cda, gKa, com.soundcloud.android.deeplinks.e.PROFILE_PLAYLISTS, Yca.USERS_PLAYLISTS);
    }

    public static C4621nja f() {
        return a(com.soundcloud.android.deeplinks.e.DOWNLOADS_COLLECTION, Yca.DOWNLOADS);
    }

    public static C4621nja g() {
        return a(com.soundcloud.android.deeplinks.e.ACTIVITIES, Yca.UNKNOWN);
    }

    public static C4621nja h() {
        return a(com.soundcloud.android.deeplinks.e.ADVERTISING_SETTINGS, Yca.UNKNOWN);
    }

    public static C4621nja i() {
        return a(com.soundcloud.android.deeplinks.e.ANALYTICS_SETTINGS, Yca.UNKNOWN);
    }

    public static C4621nja j() {
        return a(com.soundcloud.android.deeplinks.e.BASIC_SETTINGS, Yca.UNKNOWN);
    }

    public static C4621nja k() {
        return a(com.soundcloud.android.deeplinks.e.COMMENTS_CLOSE, Yca.UNKNOWN).O().a();
    }

    public static C4621nja l() {
        return a(com.soundcloud.android.deeplinks.e.COMMUNICATIONS_SETTINGS, Yca.UNKNOWN);
    }

    public static C4621nja m() {
        return a(com.soundcloud.android.deeplinks.e.DOWNLOADS_STORAGE_LOCATION_SETTINGS, Yca.UNKNOWN);
    }

    public static C4621nja n() {
        return a(com.soundcloud.android.deeplinks.e.HELP_CENTER, Yca.UNKNOWN);
    }

    public static C4621nja o() {
        return a(com.soundcloud.android.deeplinks.e.LEGAL, Yca.UNKNOWN);
    }

    public static C4621nja p() {
        return a(com.soundcloud.android.deeplinks.e.LICENSES, Yca.UNKNOWN);
    }

    public static C4621nja q() {
        return a(com.soundcloud.android.deeplinks.e.LIKED_STATIONS, Yca.UNKNOWN);
    }

    public static C4621nja r() {
        return a(com.soundcloud.android.deeplinks.e.LIKES_COLLECTION_SEARCH, Yca.LIKES_SEARCH);
    }

    public static C4621nja s() {
        return a(com.soundcloud.android.deeplinks.e.NOTIFICATION_PREFERENCES, Yca.UNKNOWN).O().h(C4928GKa.c(d.a(true))).a();
    }

    public static C4621nja t() {
        return a(com.soundcloud.android.deeplinks.e.PLAYLISTS_AND_ALBUMS_COLLECTION, Yca.PLAYLISTS);
    }

    public static C4621nja u() {
        return a(com.soundcloud.android.deeplinks.e.AD_PRESTITIAL, Yca.UNKNOWN);
    }

    public static C4621nja v() {
        return a(com.soundcloud.android.deeplinks.e.SETTINGS, Yca.UNKNOWN);
    }

    public static C4621nja w() {
        return a(com.soundcloud.android.deeplinks.e.STREAMING_QUALITY_SETTINGS, Yca.UNKNOWN);
    }

    public abstract C4928GKa<d> C();

    public abstract C4928GKa<e> D();

    public abstract C4928GKa<PromotedSourceInfo> E();

    public abstract C4928GKa<C3508cda> F();

    public abstract C4928GKa<Recording> G();

    public abstract C4928GKa<String> H();

    public abstract Yca I();

    public abstract C4928GKa<SearchQuerySourceInfo> J();

    public abstract C4928GKa<String> K();

    public abstract C4928GKa<f> L();

    public abstract C4928GKa<C3508cda> M();

    public abstract C4928GKa<Long> N();

    public abstract a O();

    public abstract C4928GKa<K> P();

    public abstract C4928GKa<C3920yea> Q();

    public abstract C4928GKa<b> a();

    @C3783hda
    public abstract Date b();

    public abstract C4928GKa<com.soundcloud.android.deeplinks.e> c();

    public abstract C4928GKa<String> d();

    public abstract C4928GKa<m> e();

    public abstract C4928GKa<Boolean> x();

    public abstract C4928GKa<Bundle> y();

    public abstract C4928GKa<c> z();

    public static C4621nja d(String str) {
        return a(com.soundcloud.android.deeplinks.e.WEB_VIEW, Yca.UNKNOWN).O().c(C4928GKa.c(String.format("https://checkout.soundcloud.com/auth_callback?state={\"redirectAfterLogin\":\"/student?ref=%s\"}#access_token=%s", new Object[]{h.SETTINGS_STUDENT_UPGRADE.a(), str}))).a();
    }

    public static C4621nja e(String str) {
        return a(com.soundcloud.android.deeplinks.e.WEB_VIEW, Yca.UNKNOWN).O().c(C4928GKa.c(str)).a();
    }

    public static C4621nja f(C3508cda cda, C4928GKa<SearchQuerySourceInfo> gKa) {
        return a(cda, gKa, com.soundcloud.android.deeplinks.e.PROFILE_REPOSTS, Yca.USERS_REPOSTS);
    }

    public static C4621nja g(C3508cda cda, C4928GKa<SearchQuerySourceInfo> gKa) {
        return a(cda, gKa, com.soundcloud.android.deeplinks.e.PROFILE_TOP_TRACKS, Yca.USERS_TOP_TRACKS);
    }

    public static C4621nja h(C3508cda cda, C4928GKa<SearchQuerySourceInfo> gKa) {
        return a(cda, gKa, com.soundcloud.android.deeplinks.e.PROFILE_TRACKS, Yca.USERS_TRACKS);
    }

    public C4621nja f(String str) {
        return O().a(c.a(str)).a();
    }

    public static C4621nja a(String str, C4928GKa<String> gKa, Yca yca, C4928GKa<m> gKa2) {
        return B().a(c.a(str, gKa)).a(yca).d(gKa2).a();
    }

    public static C4621nja c(C3508cda cda) {
        return a(cda, C4928GKa.a(), C4928GKa.a(), C4928GKa.a());
    }

    public static C4621nja b(C3508cda cda) {
        return a(com.soundcloud.android.deeplinks.e.AD_FULLSCREEN_VIDEO, Yca.UNKNOWN).O().q(C4928GKa.c(cda)).a();
    }

    public static C4621nja c(C3508cda cda, C4928GKa<SearchQuerySourceInfo> gKa) {
        return a(cda, gKa, com.soundcloud.android.deeplinks.e.PROFILE_ALBUMS, Yca.USERS_ALBUMS);
    }

    public static C4621nja c(String str) {
        return a(com.soundcloud.android.deeplinks.e.WEB_VIEW, Yca.UNKNOWN).O().c(C4928GKa.c(String.format("https://checkout.soundcloud.com/auth_callback?state={\"redirectAfterLogin\":\"/student?ref=%s\"}#access_token=%s", new Object[]{h.CHOOSER_BUY_STUDENT_TIER.a(), str}))).a();
    }

    public C4621nja d(Yca yca) {
        return O().a(yca).a();
    }

    private static C4621nja a(com.soundcloud.android.deeplinks.e eVar, Yca yca) {
        return B().b(C4928GKa.c(eVar)).a(yca).a();
    }

    public static C4621nja b(Y y, C3710l lVar) {
        return a(com.soundcloud.android.deeplinks.e.STANDALONE_COMMENTS, Yca.UNKNOWN).O().q(C4928GKa.c(y.d())).r(C4928GKa.c(Long.valueOf(y.c()))).a();
    }

    public static C4621nja a(String str, String str2) {
        return B().a(c.a(str)).a(Yca.DEEPLINK).m(C4928GKa.c(str2)).a();
    }

    public static C4621nja b(Yca yca) {
        return a(com.soundcloud.android.deeplinks.e.SEARCH_AUTOCOMPLETE, yca);
    }

    public static C4621nja a(C3508cda cda, Yca yca) {
        return a(cda, yca, C4928GKa.a(), C4928GKa.a(), C4928GKa.a());
    }

    public static C4621nja b(C3508cda cda, C4928GKa<C3508cda> gKa, C4928GKa<m> gKa2, C4928GKa<K> gKa3) {
        return a(com.soundcloud.android.deeplinks.e.STATION, Yca.UNKNOWN).O().d(gKa2).s(gKa3).q(C4928GKa.c(cda)).p(C4928GKa.c(f.a(gKa))).a();
    }

    public static C4621nja a(C3508cda cda, Yca yca, C4928GKa<SearchQuerySourceInfo> gKa, C4928GKa<PromotedSourceInfo> gKa2) {
        return a(cda, yca, gKa, gKa2, C4928GKa.a());
    }

    public static C4621nja a(C3508cda cda, Yca yca, C4928GKa<SearchQuerySourceInfo> gKa, C4928GKa<PromotedSourceInfo> gKa2, C4928GKa<K> gKa3) {
        return a(com.soundcloud.android.deeplinks.e.PLAYLISTS, yca).O().s(gKa3).q(C4928GKa.c(cda)).n(gKa).j(gKa2).a();
    }

    public static C4621nja b(String str) {
        return a(com.soundcloud.android.deeplinks.e.EXTERNAL_APP, Yca.UNKNOWN).O().c(C4928GKa.c(str)).a();
    }

    public static C4621nja a(boolean z) {
        return a(com.soundcloud.android.deeplinks.e.OFFLINE_SETTINGS, Yca.UNKNOWN).O().i(C4928GKa.c(e.a(z))).a();
    }

    public static C4621nja b(Bundle bundle) {
        return a(com.soundcloud.android.deeplinks.e.WEB_CHECKOUT_FOR_PRODUCT, Yca.UNKNOWN).O().f(C4928GKa.c(bundle)).a();
    }

    public static C4621nja a(C4928GKa<Recording> gKa, C4928GKa<Yca> gKa2) {
        return a(com.soundcloud.android.deeplinks.e.RECORD, (Yca) gKa2.d(Yca.UNKNOWN)).O().l(gKa).a();
    }

    public static C4621nja a(C3508cda cda, C4928GKa<SearchQuerySourceInfo> gKa) {
        return a(com.soundcloud.android.deeplinks.e.FOLLOWERS, Yca.UNKNOWN).O().q(C4928GKa.c(cda)).n(gKa).a();
    }

    public static C4621nja a(String str) {
        return a(com.soundcloud.android.deeplinks.e.AD_CLICKTHROUGH, Yca.UNKNOWN).O().c(C4928GKa.c(str)).a();
    }

    public static C4621nja a(Y y, C3710l lVar) {
        return a(com.soundcloud.android.deeplinks.e.COMMENTS_OPEN, Yca.UNKNOWN).O().q(C4928GKa.c(y.d())).s(C4928GKa.c(K.a(y.d(), lVar))).o(C4928GKa.b(y.b())).e(C4928GKa.c(Boolean.valueOf(y.a()))).r(C4928GKa.c(Long.valueOf(y.c()))).a();
    }

    public static C4621nja a(Yca yca) {
        return B().b(C4928GKa.c(com.soundcloud.android.deeplinks.e.LIBRARY_FROM_EMPTY_STATE)).a(yca).c(C4928GKa.c(C2929h.l)).a();
    }

    public static C4621nja a(C3508cda cda, K k) {
        return a(cda, C4928GKa.c(k), C4928GKa.a(), C4928GKa.a());
    }

    public static C4621nja a(C3508cda cda, C4928GKa<K> gKa, C4928GKa<Yca> gKa2, C4928GKa<SearchQuerySourceInfo> gKa3) {
        return a(com.soundcloud.android.deeplinks.e.PROFILE, (Yca) gKa2.d(Yca.UNKNOWN)).O().q(C4928GKa.c(cda)).s(gKa).n(gKa3).a();
    }

    private static C4621nja a(C3508cda cda, C4928GKa<SearchQuerySourceInfo> gKa, com.soundcloud.android.deeplinks.e eVar, Yca yca) {
        return a(eVar, yca).O().q(C4928GKa.c(cda)).n(gKa).a();
    }

    public static C4621nja a(C3920yea yea) {
        return a(com.soundcloud.android.deeplinks.e.UPGRADE, Yca.UNKNOWN).O().t(C4928GKa.c(yea)).a();
    }

    public static C4621nja a(Bundle bundle) {
        return a(com.soundcloud.android.deeplinks.e.PRODUCT_CHOICE, Yca.UNKNOWN).O().f(C4928GKa.c(bundle)).a();
    }

    public C4621nja a(C4928GKa<String> gKa) {
        return O().a(((c) z().b()).a(gKa)).a();
    }
}
