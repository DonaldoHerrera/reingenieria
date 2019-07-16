package com.soundcloud.android.collection;

import android.content.SharedPreferences;

@EVa(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0017\u0018\u0000 &2\u00020\u0001:\u0001&B!\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0015H\u0016J\b\u0010\u0017\u001a\u00020\u0015H\u0016J\b\u0010\u0018\u001a\u00020\u000eH\u0016J\b\u0010\u0019\u001a\u00020\nH\u0012J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u001bH\u0016J\u000e\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001eH\u0016J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u001eH\u0016J\b\u0010\u001f\u001a\u00020\u0015H\u0016J\u000e\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001b0\u001eH\u0016J\u0010\u0010!\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020\u000eH\u0016J\u000e\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001eH\u0016J\u000e\u0010$\u001a\u0004\u0018\u00010\n*\u00020\u0003H\u0016J\u000e\u0010%\u001a\u0004\u0018\u00010\n*\u00020\u0003H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R)\u0010\f\u001a\u0010\u0012\f\u0012\n \u000f*\u0004\u0018\u00010\u000e0\u000e0\r8RX\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lcom/soundcloud/android/collection/CollectionOptionsStorage;", "", "preferences", "Landroid/content/SharedPreferences;", "collection2Experiment", "Lcom/soundcloud/android/configuration/experiments/Collection2Experiment;", "upsellHeaderFeature", "Lcom/soundcloud/android/features/upsell/UpsellHeaderFeature;", "(Landroid/content/SharedPreferences;Lcom/soundcloud/android/configuration/experiments/Collection2Experiment;Lcom/soundcloud/android/features/upsell/UpsellHeaderFeature;)V", "defaultSortBy", "Lcom/soundcloud/android/foundation/domain/playable/SortBy;", "legacyDefaultSortBy", "playlistsOptions", "Lio/reactivex/subjects/BehaviorSubject;", "Lcom/soundcloud/android/foundation/domain/playable/PlaylistsOptions;", "kotlin.jvm.PlatformType", "getPlaylistsOptions", "()Lio/reactivex/subjects/BehaviorSubject;", "playlistsOptions$delegate", "Lkotlin/Lazy;", "clear", "", "disableOnboarding", "disableUpsell", "getLastOrDefault", "getSortBy", "isOnboardingEnabled", "", "isUpsellEnabled", "onboardingEnabled", "Lio/reactivex/Observable;", "resetToDefaults", "shouldShowUpsellHeader", "store", "options", "upsellEnabled", "legacySortBy", "sortBy", "Companion", "base_release"}, mv = {1, 1, 15})
/* renamed from: com.soundcloud.android.collection.fa reason: case insensitive filesystem */
/* compiled from: CollectionOptionsStorage.kt */
public class C2746fa {
    static final /* synthetic */ DZa[] a = {HYa.a((DYa) new EYa(HYa.a(C2746fa.class), "playlistsOptions", "getPlaylistsOptions()Lio/reactivex/subjects/BehaviorSubject;"))};
    private static final C6713jVa<Boolean> b;
    private static final C6713jVa<Boolean> c;
    public static final a d = new a(null);
    private final C7744yVa e = BVa.a(new C2748ga(this));
    private final C3911xda f = C3911xda.UPDATED_AT;
    private final C3911xda g = C3911xda.ADDED_AT;
    /* access modifiers changed from: private */
    public final SharedPreferences h;
    private final C2040FU i;
    private final Aca j;

    /* renamed from: com.soundcloud.android.collection.fa$a */
    /* compiled from: CollectionOptionsStorage.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }
    }

    static {
        C6713jVa<Boolean> s = C6713jVa.s();
        String str = "BehaviorSubject.create<Boolean>()";
        C7471uYa.a((Object) s, str);
        b = s;
        C6713jVa<Boolean> s2 = C6713jVa.s();
        C7471uYa.a((Object) s2, str);
        c = s2;
    }

    public C2746fa(SharedPreferences sharedPreferences, C2040FU fu, Aca aca) {
        C7471uYa.b(sharedPreferences, "preferences");
        C7471uYa.b(fu, "collection2Experiment");
        C7471uYa.b(aca, "upsellHeaderFeature");
        this.h = sharedPreferences;
        this.i = fu;
        this.j = aca;
    }

    private C6713jVa<C3871sda> l() {
        C7744yVa yva = this.e;
        DZa dZa = a[0];
        return (C6713jVa) yva.getValue();
    }

    /* access modifiers changed from: private */
    public C3911xda m() {
        if (this.i.b()) {
            C3911xda b2 = b(this.h);
            if (b2 != null) {
                return b2;
            }
            return this.f;
        }
        C3911xda a2 = a(this.h);
        return a2 != null ? a2 : this.g;
    }

    public void c() {
        this.h.edit().putBoolean("UPSELL_DISABLED", true).apply();
        c.a(Boolean.valueOf(false));
    }

    public C3871sda d() {
        C6713jVa l = l();
        C7471uYa.a((Object) l, "playlistsOptions");
        Object t = l.t();
        if (t != null) {
            C7471uYa.a(t, "playlistsOptions.value!!");
            return (C3871sda) t;
        }
        C7471uYa.a();
        throw null;
    }

    public boolean e() {
        return !this.h.getBoolean("ONBOARDING_DISABLED", false);
    }

    public boolean f() {
        return !this.h.getBoolean("UPSELL_DISABLED", false);
    }

    public APa<Boolean> g() {
        if (!b.u()) {
            b.a(Boolean.valueOf(e()));
        }
        return b;
    }

    public APa<C3871sda> h() {
        C6713jVa l = l();
        C7471uYa.a((Object) l, "playlistsOptions");
        return l;
    }

    public void i() {
        C3871sda sda = new C3871sda(this.i.b() ? this.f : this.g, false, false, false, 14, null);
        a(sda);
    }

    public APa<Boolean> j() {
        APa<Boolean> c2 = APa.c(Boolean.valueOf(this.j.a()));
        C7471uYa.a((Object) c2, "Observable.just(upsellHeaderFeature.shouldShow())");
        return c2;
    }

    public APa<Boolean> k() {
        if (!c.u()) {
            c.a(Boolean.valueOf(f()));
        }
        return c;
    }

    public void a() {
        this.h.edit().clear().apply();
    }

    public void b() {
        this.h.edit().putBoolean("ONBOARDING_DISABLED", true).apply();
        b.a(Boolean.valueOf(false));
    }

    public void a(C3871sda sda) {
        C7471uYa.b(sda, "options");
        String str = "showOfflineOnly";
        this.h.edit().putBoolean("showLikes", sda.a()).putBoolean("showPosts", sda.c()).putBoolean(str, sda.b()).putBoolean("sortByTitle", sda.d() == C3911xda.TITLE).putString("sortBy", sda.d().a()).apply();
        l().a(sda);
    }

    public C3911xda b(SharedPreferences sharedPreferences) {
        C3911xda[] values;
        C7471uYa.b(sharedPreferences, "$this$sortBy");
        String str = "sortBy";
        if (!sharedPreferences.contains(str)) {
            return null;
        }
        for (C3911xda xda : C3911xda.values()) {
            if (C7471uYa.a((Object) this.h.getString(str, ""), (Object) xda.a())) {
                return xda;
            }
        }
        return null;
    }

    public C3911xda a(SharedPreferences sharedPreferences) {
        C7471uYa.b(sharedPreferences, "$this$legacySortBy");
        String str = "sortByTitle";
        if (!sharedPreferences.contains(str)) {
            return null;
        }
        if (sharedPreferences.getBoolean(str, false)) {
            return C3911xda.TITLE;
        }
        return C3911xda.ADDED_AT;
    }
}
