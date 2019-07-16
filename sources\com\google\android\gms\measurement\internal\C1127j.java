package com.google.android.gms.measurement.internal;

import android.content.Context;
import com.adjust.sdk.Constants;
import com.facebook.stetho.server.http.HttpStatus;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.Ba;
import com.google.android.gms.internal.measurement.C0976ia;
import com.google.android.gms.internal.measurement.C1053va;
import com.google.android.gms.internal.measurement.Vd;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

@VisibleForTesting
/* renamed from: com.google.android.gms.measurement.internal.j reason: case insensitive filesystem */
public final class C1127j {
    public static Xa<Integer> A;
    public static Xa<Boolean> Aa;
    public static Xa<String> B;
    public static Xa<Boolean> Ba;
    public static Xa<Long> C;
    public static Xa<Boolean> Ca;
    public static Xa<Long> D;
    public static Xa<Boolean> Da;
    public static Xa<Long> E;
    public static Xa<Boolean> Ea;
    public static Xa<Long> F;
    public static Xa<Boolean> Fa;
    public static Xa<Long> G;
    public static Xa<Boolean> Ga;
    public static Xa<Long> H;
    public static Xa<Boolean> Ha;
    public static Xa<Long> I;
    public static Xa<Boolean> Ia;
    public static Xa<Long> J;
    public static Xa<Boolean> Ja;
    public static Xa<Long> K;
    public static Xa<Boolean> Ka;
    public static Xa<Long> L;
    private static Xa<Boolean> La;
    public static Xa<Long> M;
    public static Xa<Boolean> Ma;
    public static Xa<Integer> N;
    public static Xa<Boolean> Na;
    public static Xa<Long> O;
    public static Xa<Integer> P;
    public static Xa<Integer> Q;
    public static Xa<Long> R;
    public static Xa<Boolean> S;
    public static Xa<String> T;
    public static Xa<Long> U;
    public static Xa<Integer> V;
    public static Xa<Double> W;
    public static Xa<Integer> X;
    public static Xa<Boolean> Y;
    public static Xa<Boolean> Z;
    static be a;
    public static Xa<Boolean> aa;
    /* access modifiers changed from: private */
    public static List<Xa<?>> b = Collections.synchronizedList(new ArrayList());
    public static Xa<Boolean> ba;
    private static Set<Xa<?>> c = Collections.synchronizedSet(new HashSet());
    public static Xa<Boolean> ca;
    private static final Ba d = new Ba(C1053va.a("com.google.android.gms.measurement"));
    public static Xa<Boolean> da;
    private static volatile Mb e;
    public static Xa<Boolean> ea;
    @VisibleForTesting
    private static Boolean f;
    public static Xa<Boolean> fa;
    private static Xa<Boolean> g;
    public static Xa<Boolean> ga;
    private static Xa<Boolean> h;
    public static Xa<Boolean> ha;
    private static Xa<Boolean> i;
    public static Xa<Boolean> ia;
    public static Xa<Boolean> j;
    public static Xa<Boolean> ja;
    public static Xa<Boolean> k;
    public static Xa<Boolean> ka;
    public static Xa<String> l = a("measurement.log_tag", "FA", "FA-SVC", C1113ga.a);
    public static Xa<Boolean> la;
    public static Xa<Long> m;
    public static Xa<Boolean> ma;
    public static Xa<Long> n;
    public static Xa<Boolean> na;
    public static Xa<Long> o;
    public static Xa<Boolean> oa;
    public static Xa<String> p;
    public static Xa<Boolean> pa;
    public static Xa<String> q;
    public static Xa<Boolean> qa;
    public static Xa<Integer> r;
    public static Xa<Boolean> ra;
    public static Xa<Integer> s;
    public static Xa<Boolean> sa;
    public static Xa<Integer> t;
    public static Xa<Boolean> ta;
    public static Xa<Integer> u;
    public static Xa<Boolean> ua;
    public static Xa<Integer> v;
    public static Xa<Boolean> va;
    public static Xa<Integer> w;
    public static Xa<Boolean> wa;
    public static Xa<Integer> x;
    private static Xa<Boolean> xa;
    public static Xa<Integer> y;
    public static Xa<Boolean> ya;
    public static Xa<Integer> z;
    public static Xa<Boolean> za;

    static {
        Boolean valueOf = Boolean.valueOf(false);
        g = a("measurement.log_third_party_store_events_enabled", valueOf, valueOf, C1142m.a);
        h = a("measurement.log_installs_enabled", valueOf, valueOf, C1137l.a);
        i = a("measurement.log_upgrades_enabled", valueOf, valueOf, C1201y.a);
        j = a("measurement.log_androidId_enabled", valueOf, valueOf, I.a);
        k = a("measurement.upload_dsid_enabled", valueOf, valueOf, W.a);
        Long valueOf2 = Long.valueOf(10000);
        m = a("measurement.ad_id_cache_time", valueOf2, valueOf2, C1177ta.a);
        Long valueOf3 = Long.valueOf(86400000);
        n = a("measurement.monitoring.sample_period_millis", valueOf3, valueOf3, Da.a);
        Long valueOf4 = Long.valueOf(3600000);
        o = a("measurement.config.cache_time", valueOf3, valueOf4, Qa.a);
        Ya ya2 = Wa.a;
        String str = Constants.SCHEME;
        p = a("measurement.config.url_scheme", str, str, ya2);
        String str2 = "app-measurement.com";
        q = a("measurement.config.url_authority", str2, str2, C1152o.a);
        Integer valueOf5 = Integer.valueOf(100);
        r = a("measurement.upload.max_bundles", valueOf5, valueOf5, C1147n.a);
        Integer valueOf6 = Integer.valueOf(65536);
        s = a("measurement.upload.max_batch_size", valueOf6, valueOf6, C1162q.a);
        t = a("measurement.upload.max_bundle_size", valueOf6, valueOf6, C1157p.a);
        Integer valueOf7 = Integer.valueOf(1000);
        u = a("measurement.upload.max_events_per_bundle", valueOf7, valueOf7, C1171s.a);
        Integer valueOf8 = Integer.valueOf(100000);
        v = a("measurement.upload.max_events_per_day", valueOf8, valueOf8, r.a);
        w = a("measurement.upload.max_error_events_per_day", valueOf7, valueOf7, C1181u.a);
        Integer valueOf9 = Integer.valueOf(50000);
        x = a("measurement.upload.max_public_events_per_day", valueOf9, valueOf9, C1176t.a);
        Integer valueOf10 = Integer.valueOf(HttpStatus.HTTP_INTERNAL_SERVER_ERROR);
        y = a("measurement.upload.max_conversions_per_day", valueOf10, valueOf10, C1191w.a);
        Integer valueOf11 = Integer.valueOf(10);
        z = a("measurement.upload.max_realtime_events_per_day", valueOf11, valueOf11, C1186v.a);
        Integer valueOf12 = Integer.valueOf(100000);
        A = a("measurement.store.max_stored_events_per_app", valueOf12, valueOf12, C1196x.a);
        String str3 = "https://app-measurement.com/a";
        B = a("measurement.upload.url", str3, str3, B.a);
        Long valueOf13 = Long.valueOf(43200000);
        C = a("measurement.upload.backoff_period", valueOf13, valueOf13, A.a);
        D = a("measurement.upload.window_interval", valueOf4, valueOf4, D.a);
        E = a("measurement.upload.interval", valueOf4, valueOf4, C.a);
        F = a("measurement.upload.realtime_upload_interval", valueOf2, valueOf2, F.a);
        Long valueOf14 = Long.valueOf(1000);
        G = a("measurement.upload.debug_upload_interval", valueOf14, valueOf14, E.a);
        Long valueOf15 = Long.valueOf(500);
        H = a("measurement.upload.minimum_delay", valueOf15, valueOf15, H.a);
        Long valueOf16 = Long.valueOf(60000);
        I = a("measurement.alarm_manager.minimum_interval", valueOf16, valueOf16, G.a);
        J = a("measurement.upload.stale_data_deletion_interval", valueOf3, valueOf3, J.a);
        Long valueOf17 = Long.valueOf(604800000);
        K = a("measurement.upload.refresh_blacklisted_config_interval", valueOf17, valueOf17, L.a);
        Long valueOf18 = Long.valueOf(15000);
        L = a("measurement.upload.initial_upload_delay_time", valueOf18, valueOf18, K.a);
        Long valueOf19 = Long.valueOf(1800000);
        M = a("measurement.upload.retry_time", valueOf19, valueOf19, N.a);
        Integer valueOf20 = Integer.valueOf(6);
        N = a("measurement.upload.retry_count", valueOf20, valueOf20, M.a);
        Long valueOf21 = Long.valueOf(2419200000L);
        O = a("measurement.upload.max_queue_time", valueOf21, valueOf21, P.a);
        Integer valueOf22 = Integer.valueOf(4);
        P = a("measurement.lifetimevalue.max_currency_tracked", valueOf22, valueOf22, O.a);
        Integer valueOf23 = Integer.valueOf(200);
        Q = a("measurement.audience.filter_result_max_count", valueOf23, valueOf23, S.a);
        Long valueOf24 = Long.valueOf(5000);
        R = a("measurement.service_client.idle_disconnect_millis", valueOf24, valueOf24, Q.a);
        S = a("measurement.test.boolean_flag", valueOf, valueOf, U.a);
        String str4 = "---";
        T = a("measurement.test.string_flag", str4, str4, T.a);
        Long valueOf25 = Long.valueOf(-1);
        U = a("measurement.test.long_flag", valueOf25, valueOf25, V.a);
        Integer valueOf26 = Integer.valueOf(-2);
        V = a("measurement.test.int_flag", valueOf26, valueOf26, Y.a);
        Double valueOf27 = Double.valueOf(-3.0d);
        W = a("measurement.test.double_flag", valueOf27, valueOf27, X.a);
        Integer valueOf28 = Integer.valueOf(50);
        X = a("measurement.experiment.max_ids", valueOf28, valueOf28, C1083aa.a);
        Y = a("measurement.validation.internal_limits_internal_event_params", valueOf, valueOf, Z.a);
        Boolean valueOf29 = Boolean.valueOf(true);
        Z = a("measurement.audience.dynamic_filters", valueOf29, valueOf29, C1098da.a);
        aa = a("measurement.reset_analytics.persist_time", valueOf, valueOf, C1093ca.a);
        ba = a("measurement.validation.value_and_currency_params", valueOf29, valueOf29, C1108fa.a);
        ca = a("measurement.sampling.time_zone_offset_enabled", valueOf, valueOf, C1103ea.a);
        da = a("measurement.referrer.enable_logging_install_referrer_cmp_from_apk", valueOf, valueOf, C1118ha.a);
        ea = a("measurement.fetch_config_with_admob_app_id", valueOf29, valueOf29, C1128ja.a);
        fa = a("measurement.client.sessions.session_id_enabled", valueOf, valueOf, C1123ia.a);
        ga = a("measurement.service.sessions.session_number_enabled", valueOf, valueOf, C1138la.a);
        ha = a("measurement.client.sessions.immediate_start_enabled_foreground", valueOf, valueOf, C1133ka.a);
        ia = a("measurement.client.sessions.background_sessions_enabled", valueOf, valueOf, C1148na.a);
        ja = a("measurement.client.sessions.remove_expired_session_properties_enabled", valueOf, valueOf, C1143ma.a);
        ka = a("measurement.service.sessions.session_number_backfill_enabled", valueOf, valueOf, C1158pa.a);
        la = a("measurement.service.sessions.remove_disabled_session_number", valueOf, valueOf, C1153oa.a);
        ma = a("measurement.collection.firebase_global_collection_flag_enabled", valueOf29, valueOf29, C1167ra.a);
        na = a("measurement.collection.efficient_engagement_reporting_enabled", valueOf, valueOf, C1163qa.a);
        oa = a("measurement.collection.redundant_engagement_removal_enabled", valueOf, valueOf, C1172sa.a);
        pa = a("measurement.personalized_ads_signals_collection_enabled", valueOf29, valueOf29, C1187va.a);
        qa = a("measurement.personalized_ads_property_translation_enabled", valueOf29, valueOf29, C1182ua.a);
        ra = a("measurement.collection.init_params_control_enabled", valueOf29, valueOf29, C1197xa.a);
        sa = a("measurement.upload.disable_is_uploader", valueOf29, valueOf29, C1192wa.a);
        ta = a("measurement.experiment.enable_experiment_reporting", valueOf29, valueOf29, C1207za.a);
        ua = a("measurement.collection.log_event_and_bundle_v2", valueOf29, valueOf29, C1202ya.a);
        va = a("measurement.collection.null_empty_event_name_fix", valueOf29, valueOf29, Ba.a);
        wa = a("measurement.audience.sequence_filters", valueOf, valueOf, Aa.a);
        xa = a("measurement.audience.sequence_filters_bundle_timestamp", valueOf, valueOf, Ea.a);
        ya = a("measurement.quality.checksum", valueOf, valueOf, null);
        za = a("measurement.module.collection.conditionally_omit_admob_app_id", valueOf29, valueOf29, Ga.a);
        Aa = a("measurement.sdk.dynamite.use_dynamite2", valueOf, valueOf, Fa.a);
        Ba = a("measurement.sdk.dynamite.allow_remote_dynamite", valueOf, valueOf, Ia.a);
        Ca = a("measurement.sdk.collection.validate_param_names_alphabetical", valueOf, valueOf, Ha.a);
        Da = a("measurement.collection.event_safelist", valueOf, valueOf, Ka.a);
        Ea = a("measurement.service.audience.scoped_filters_v27", valueOf, valueOf, Ja.a);
        Fa = a("measurement.service.audience.session_scoped_event_aggregates", valueOf, valueOf, Ma.a);
        Ga = a("measurement.service.audience.session_scoped_user_engagement", valueOf, valueOf, La.a);
        Ha = a("measurement.service.audience.remove_disabled_session_scoped_user_engagement", valueOf, valueOf, Oa.a);
        Ia = a("measurement.sdk.collection.retrieve_deeplink_from_bow", valueOf, valueOf, Na.a);
        Ja = a("measurement.app_launch.event_ordering_fix", valueOf, valueOf, Pa.a);
        Ka = a("measurement.sdk.collection.last_deep_link_referrer", valueOf, valueOf, Sa.a);
        La = a("measurement.sdk.collection.last_deep_link_referrer_campaign", valueOf, valueOf, Ra.a);
        Ma = a("measurement.sdk.collection.last_gclid_from_referrer", valueOf, valueOf, Ua.a);
        Na = a("measurement.upload.file_lock_state_check", valueOf, valueOf, Ta.a);
    }

    static final /* synthetic */ String Ba() {
        return Ia() ? Vd.r() : Vd.c();
    }

    private static boolean Ia() {
        if (a != null) {
        }
        return false;
    }

    public static Map<String, String> a(Context context) {
        C0976ia a2 = C0976ia.a(context.getContentResolver(), C1053va.a("com.google.android.gms.measurement"));
        return a2 == null ? Collections.emptyMap() : a2.a();
    }

    static final /* synthetic */ Long ya() {
        long j2;
        if (Ia()) {
            j2 = Vd.p();
        } else {
            j2 = Vd.b();
        }
        return Long.valueOf(j2);
    }

    static void a(Mb mb) {
        e = mb;
    }

    @VisibleForTesting
    static void a(Exception exc) {
        if (e != null) {
            Context context = e.getContext();
            if (f == null) {
                f = Boolean.valueOf(GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(context, GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE) == 0);
            }
            if (f.booleanValue()) {
                e.e().s().a("Got Exception on PhenotypeFlag.get on Play device", exc);
            }
        }
    }

    @VisibleForTesting
    private static <V> Xa<V> a(String str, V v2, V v3, Ya<V> ya2) {
        Xa xa2 = new Xa(str, v2, v3, ya2);
        b.add(xa2);
        return xa2;
    }

    static void a(be beVar) {
        a = beVar;
    }
}
