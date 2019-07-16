package com.soundcloud.android.properties;

import android.annotation.SuppressLint;
import java.util.ArrayList;
import java.util.List;

@EVa(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b \bÆ\u0002\u0018\u00002\u00020\u0001:\u001e\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'(B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t0\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0007¨\u0006)"}, d2 = {"Lcom/soundcloud/android/properties/Features;", "", "()V", "allFlagFeatures", "", "Lcom/soundcloud/android/features/Feature$FlagFeature;", "getAllFlagFeatures", "()Ljava/util/List;", "allVariantFeatures", "Lcom/soundcloud/android/features/Feature$VariantFeature;", "getAllVariantFeatures", "AdErrorTrackingToasts", "Collection2", "DownloadInLibrary", "ExoPreloading", "FlipperCrashOnHang", "FlipperOboe", "ForceEncryptedHls", "InAppUpdates", "MediaBrowserDataSource", "MobilePlaysPipeline", "NewAuthFlow", "NewTrackInfoDialog", "NewVisualPlayer", "NoFlipper", "PeriodicWorkers", "PlayQueueVideoAds", "PlaylistPushUpdates", "ProfileTopTracks", "ReportPlayerErrors", "RepositoryPerformanceMetrics", "SampleFlag", "SampleVariantFeature", "SendPerformanceMetrics", "StudentUpsellInMoreTab", "SubsRelaunch", "UploadAvatarViaApiMobile", "UploadReplacesRecord", "UpsellHeader", "VaultTracksRepository", "VaultUserRepository", "features-base_release"}, mv = {1, 1, 15})
/* compiled from: Features.kt */
public final class m {
    private static final List<c<?>> a = C6918mWa.a();
    private static final List<a> b = C6918mWa.b((Object[]) new a[]{y.a, j.a, B.a, g.a, s.a, x.a, e.a, i.a, n.a, f.a, o.a, t.a, k.a, C5887d.a, q.a, D.a, C.a, C5885b.a, p.a, C0168m.a, h.a, A.a, r.a, C5884a.a, C5886c.a, z.a, l.a});
    public static final m c = new m();

    /* compiled from: Features.kt */
    public static final class A extends a {
        public static final A a = new A();

        private A() {
        }

        public String b() {
            return "Instead of the record link, we allow people to direct upload from More menu";
        }

        public String c() {
            return "upload_replaces_record";
        }

        public boolean d() {
            return true;
        }

        public Boolean a() {
            return Boolean.valueOf(false);
        }
    }

    /* compiled from: Features.kt */
    public static final class B extends a {
        public static final B a = new B();

        private B() {
        }

        public String b() {
            return "Upsell header item in Discovery, Stream and Library screens";
        }

        public String c() {
            return "upsell_header";
        }

        public boolean d() {
            return true;
        }

        public Boolean a() {
            return Boolean.valueOf(false);
        }
    }

    /* compiled from: Features.kt */
    public static final class C extends a {
        public static final C a = new C();

        private C() {
        }

        public String b() {
            return "Uses Vault library to back the repository that serves Track entities";
        }

        public String c() {
            return "vault_tracks_repository";
        }

        public boolean d() {
            return false;
        }

        public Boolean a() {
            return Boolean.valueOf(false);
        }
    }

    /* compiled from: Features.kt */
    public static final class D extends a {
        public static final D a = new D();

        private D() {
        }

        public String b() {
            return "Uses Vault library to back the repository that serves User entities";
        }

        public String c() {
            return "vault_user_repository";
        }

        public boolean d() {
            return true;
        }

        public Boolean a() {
            return Boolean.valueOf(false);
        }
    }

    /* renamed from: com.soundcloud.android.properties.m$a reason: case insensitive filesystem */
    /* compiled from: Features.kt */
    public static final class C5884a extends a {
        public static final C5884a a = new C5884a();

        private C5884a() {
        }

        public String b() {
            return "Shows debug snackbar when error ad trackers fire";
        }

        public String c() {
            return "ad_error_tracking_toasts";
        }

        public boolean d() {
            return false;
        }

        public Boolean a() {
            return Boolean.valueOf(false);
        }
    }

    /* renamed from: com.soundcloud.android.properties.m$b reason: case insensitive filesystem */
    /* compiled from: Features.kt */
    public static final class C5885b extends a {
        public static final C5885b a = new C5885b();

        private C5885b() {
        }

        public String b() {
            return "";
        }

        public String c() {
            return "collection_2";
        }

        public boolean d() {
            return true;
        }

        public Boolean a() {
            return Boolean.valueOf(true);
        }
    }

    /* renamed from: com.soundcloud.android.properties.m$c reason: case insensitive filesystem */
    /* compiled from: Features.kt */
    public static final class C5886c extends a {
        public static final C5886c a = new C5886c();

        private C5886c() {
        }

        public String b() {
            return "Show Downloads in Library";
        }

        public String c() {
            return "download_in_library";
        }

        public boolean d() {
            return true;
        }

        public Boolean a() {
            return Boolean.valueOf(false);
        }
    }

    /* renamed from: com.soundcloud.android.properties.m$d reason: case insensitive filesystem */
    /* compiled from: Features.kt */
    public static final class C5887d extends a {
        public static final C5887d a = new C5887d();

        private C5887d() {
        }

        public String b() {
            return "Enables preloading of media content via ExoPlayer. This can impact positively time to play for ads and tracks using ExoPlayer.";
        }

        public String c() {
            return "exoplayer_preloading";
        }

        public boolean d() {
            return false;
        }

        public Boolean a() {
            return Boolean.valueOf(false);
        }
    }

    /* compiled from: Features.kt */
    public static final class e extends a {
        public static final e a = new e();

        private e() {
        }

        public String b() {
            return "Forces app crashes when Flipper detects non-responding internal threads (possibly too-long computations or deadlocks).";
        }

        public String c() {
            return "flipper_crash_on_hang";
        }

        public boolean d() {
            return true;
        }

        public Boolean a() {
            return Boolean.valueOf(false);
        }
    }

    /* compiled from: Features.kt */
    public static final class f extends a {
        public static final f a = new f();

        private f() {
        }

        public String b() {
            return "Enables experimental Oboe audio backend in Flipper. Toggles automatically between AAudio and OpenSLES backends.";
        }

        public String c() {
            return "flipper_oboe";
        }

        public boolean d() {
            return true;
        }

        public Boolean a() {
            return Boolean.valueOf(false);
        }
    }

    /* compiled from: Features.kt */
    public static final class g extends b {
        public static final g a = new g();

        private g() {
        }

        public String b() {
            return "Forces Flipper to request encrypted HLS streams from the backend. Enabling it will incur in an addition to playback latency.";
        }

        public String c() {
            return "force_encrypted_hls";
        }

        public boolean d() {
            return true;
        }

        public Boolean a() {
            return Boolean.valueOf(false);
        }
    }

    /* compiled from: Features.kt */
    public static final class h extends a {
        public static final h a = new h();

        private h() {
        }

        public String b() {
            return "";
        }

        public String c() {
            return "in_app_updates";
        }

        public boolean d() {
            return true;
        }

        public Boolean a() {
            return Boolean.valueOf(false);
        }
    }

    /* compiled from: Features.kt */
    public static final class i extends a {
        public static final i a = new i();

        private i() {
        }

        public String b() {
            return "Expose our content from MediaBrowser. It allows integrations such as Android Auto.";
        }

        public String c() {
            return "media_browser_service_datasource";
        }

        public boolean d() {
            return false;
        }

        public Boolean a() {
            return Boolean.valueOf(false);
        }
    }

    /* compiled from: Features.kt */
    public static final class j extends a {
        public static final j a = new j();

        private j() {
        }

        public String b() {
            return "";
        }

        public String c() {
            return "mobile_plays_pipeline";
        }

        public boolean d() {
            return true;
        }

        public Boolean a() {
            return Boolean.valueOf(false);
        }
    }

    /* compiled from: Features.kt */
    public static final class k extends a {
        public static final k a = new k();

        private k() {
        }

        public String b() {
            return "";
        }

        public String c() {
            return "auth_flow_update_rollout";
        }

        public boolean d() {
            return true;
        }

        public Boolean a() {
            return Boolean.valueOf(false);
        }
    }

    /* compiled from: Features.kt */
    public static final class l extends a {
        public static final l a = new l();

        private l() {
        }

        public String b() {
            return "when enabled, will use new uniflow info dialog";
        }

        public String c() {
            return "new_track_info_dialog";
        }

        public boolean d() {
            return false;
        }

        public Boolean a() {
            return Boolean.valueOf(false);
        }
    }

    /* renamed from: com.soundcloud.android.properties.m$m reason: collision with other inner class name */
    /* compiled from: Features.kt */
    public static final class C0168m extends a {
        public static final C0168m a = new C0168m();

        private C0168m() {
        }

        public String b() {
            return "";
        }

        public String c() {
            return "new_visual_player";
        }

        public boolean d() {
            return false;
        }

        public Boolean a() {
            return Boolean.valueOf(false);
        }
    }

    /* compiled from: Features.kt */
    public static final class n extends b {
        public static final n a = new n();

        private n() {
        }

        public String b() {
            return "Disables Flipper (except for offline-synced content).";
        }

        public String c() {
            return "no_flipper";
        }

        public boolean d() {
            return true;
        }

        public Boolean a() {
            return Boolean.valueOf(false);
        }
    }

    /* compiled from: Features.kt */
    public static final class o extends a {
        public static final o a = new o();

        private o() {
        }

        public String b() {
            return "Use work manager for periodic work jobs";
        }

        public String c() {
            return "periodic_workers";
        }

        public boolean d() {
            return true;
        }

        public Boolean a() {
            return Boolean.valueOf(false);
        }
    }

    /* compiled from: Features.kt */
    public static final class p extends a {
        public static final p a = new p();

        private p() {
        }

        public String b() {
            return "";
        }

        public String c() {
            return "play_queue_video_ads";
        }

        public boolean d() {
            return true;
        }

        public Boolean a() {
            return Boolean.valueOf(false);
        }
    }

    /* compiled from: Features.kt */
    public static final class q extends a {
        public static final q a = new q();

        private q() {
        }

        public String b() {
            return "";
        }

        public String c() {
            return "playlist_push_updates";
        }

        public boolean d() {
            return true;
        }

        public Boolean a() {
            return Boolean.valueOf(false);
        }
    }

    /* compiled from: Features.kt */
    public static final class r extends a {
        public static final r a = new r();

        private r() {
        }

        public String b() {
            return "";
        }

        public String c() {
            return "profile_top_tracks";
        }

        public boolean d() {
            return true;
        }

        public Boolean a() {
            return Boolean.valueOf(false);
        }
    }

    /* compiled from: Features.kt */
    public static final class s extends b {
        public static final s a = new s();

        private s() {
        }

        public String b() {
            return "Forces errors reported by the players to be reported as silent exceptions.";
        }

        public String c() {
            return "report_player_errors";
        }

        public boolean d() {
            return true;
        }

        public Boolean a() {
            return Boolean.valueOf(false);
        }
    }

    /* compiled from: Features.kt */
    public static final class t extends a {
        public static final t a = new t();

        private t() {
        }

        public String b() {
            return "";
        }

        public String c() {
            return "repository_performance_metrics";
        }

        public boolean d() {
            return true;
        }

        public Boolean a() {
            return Boolean.valueOf(false);
        }
    }

    @SuppressLint({"sc.RemoveFeatureUsage"})
    /* compiled from: Features.kt */
    public static final class u extends a {
        public static final u a = new u();

        private u() {
        }

        public String b() {
            return "Sample implementation for a toggle feature flag (boolean values for on/off)";
        }

        public String c() {
            return "sample_flag";
        }

        public boolean d() {
            return false;
        }

        public Boolean a() {
            return Boolean.valueOf(false);
        }
    }

    @EVa(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000eB\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016J\b\u0010\u0007\u001a\u00020\u0002H\u0016J\b\u0010\b\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\u0006H\u0016J\b\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0006H\u0016¨\u0006\u000f"}, d2 = {"Lcom/soundcloud/android/properties/Features$SampleVariantFeature;", "Lcom/soundcloud/android/features/Feature$VariantFeature;", "Lcom/soundcloud/android/properties/Features$SampleVariantFeature$Variants;", "()V", "allStrings", "", "", "default", "description", "key", "remoteConfigurable", "", "stringToVariant", "value", "Variants", "features-base_release"}, mv = {1, 1, 15})
    @SuppressLint({"sc.RemoveFeatureUsage"})
    /* compiled from: Features.kt */
    public static final class v extends c<a> {
        public static final v a = new v();

        /* compiled from: Features.kt */
        public enum a {
            VARIANT1,
            VARIANT2
        }

        private v() {
        }

        public String c() {
            return "sample_variant_feature";
        }

        public boolean d() {
            return true;
        }

        public List<String> f() {
            a[] values = a.values();
            ArrayList arrayList = new ArrayList(values.length);
            for (a name : values) {
                arrayList.add(name.name());
            }
            return arrayList;
        }

        public a a() {
            return a.VARIANT1;
        }

        public a a(String str) {
            C7471uYa.b(str, "value");
            return a.valueOf(str);
        }
    }

    /* compiled from: Features.kt */
    public static final class w extends b {
        public static final w a = new w();

        private w() {
        }

        public String b() {
            return "Send performance metrics to firebase";
        }

        public String c() {
            return "send_performance_metrics";
        }

        public boolean d() {
            return true;
        }

        public Boolean a() {
            return Boolean.valueOf(false);
        }
    }

    /* compiled from: Features.kt */
    public static final class x extends a {
        public static final x a = new x();

        private x() {
        }

        public String b() {
            return "Student upsell button in more tab";
        }

        public String c() {
            return "student_upsell_in_more";
        }

        public boolean d() {
            return true;
        }

        public Boolean a() {
            return Boolean.valueOf(false);
        }
    }

    /* compiled from: Features.kt */
    public static final class y extends a {
        public static final y a = new y();

        private y() {
        }

        public String b() {
            return "New designs for upsell pages. App restart not required.";
        }

        public String c() {
            return "subs_relaunch";
        }

        public boolean d() {
            return true;
        }

        public Boolean a() {
            return Boolean.valueOf(false);
        }
    }

    /* compiled from: Features.kt */
    public static final class z extends a {
        public static final z a = new z();

        private z() {
        }

        public String b() {
            return "Use api-mobile for uploading user avatar after signup";
        }

        public String c() {
            return "upload_avatar_via_apimobile";
        }

        public boolean d() {
            return true;
        }

        public Boolean a() {
            return Boolean.valueOf(true);
        }
    }

    private m() {
    }

    public final List<a> a() {
        return b;
    }

    public final List<c<?>> b() {
        return a;
    }
}
