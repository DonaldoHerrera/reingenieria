package com.google.android.gms.internal.measurement;

import android.support.v4.media.session.PlaybackStateCompat;
import com.adjust.sdk.Constants;
import com.soundcloud.flippernative.AndroidPlatformDecoder;

public final class Xd implements Yd {
    private static final C1047ua<Long> A;
    private static final C1047ua<Long> B;
    private static final C1047ua<Long> C;
    private static final C1047ua<Long> D;
    private static final C1047ua<Long> E;
    private static final C1047ua<Long> F;
    private static final C1047ua<Long> G;
    private static final C1047ua<Long> H;
    private static final C1047ua<String> I;
    private static final C1047ua<Long> J;
    private static final C1047ua<Long> a;
    private static final C1047ua<Long> b;
    private static final C1047ua<String> c;
    private static final C1047ua<String> d;
    private static final C1047ua<String> e;
    private static final C1047ua<Long> f;
    private static final C1047ua<Long> g;
    private static final C1047ua<Long> h;
    private static final C1047ua<Long> i;
    private static final C1047ua<Long> j;
    private static final C1047ua<Long> k;
    private static final C1047ua<Long> l;
    private static final C1047ua<Long> m;
    private static final C1047ua<Long> n;
    private static final C1047ua<Long> o;
    private static final C1047ua<Long> p;
    private static final C1047ua<Long> q;
    private static final C1047ua<String> r;
    private static final C1047ua<Long> s;
    private static final C1047ua<Long> t;
    private static final C1047ua<Long> u;
    private static final C1047ua<Long> v;
    private static final C1047ua<Long> w;
    private static final C1047ua<Long> x;
    private static final C1047ua<Long> y;
    private static final C1047ua<Long> z;

    static {
        Ba ba = new Ba(C1053va.a("com.google.android.gms.measurement"));
        a = ba.a("measurement.ad_id_cache_time", 10000);
        b = ba.a("measurement.config.cache_time", 3600000);
        c = ba.a("measurement.log_tag", "FA");
        d = ba.a("measurement.config.url_authority", "app-measurement.com");
        e = ba.a("measurement.config.url_scheme", Constants.SCHEME);
        f = ba.a("measurement.upload.debug_upload_interval", 1000);
        g = ba.a("measurement.lifetimevalue.max_currency_tracked", 4);
        h = ba.a("measurement.store.max_stored_events_per_app", 100000);
        i = ba.a("measurement.experiment.max_ids", 50);
        j = ba.a("measurement.audience.filter_result_max_count", 200);
        k = ba.a("measurement.alarm_manager.minimum_interval", 60000);
        l = ba.a("measurement.upload.minimum_delay", 500);
        m = ba.a("measurement.monitoring.sample_period_millis", 86400000);
        n = ba.a("measurement.upload.realtime_upload_interval", 10000);
        o = ba.a("measurement.upload.refresh_blacklisted_config_interval", 604800000);
        p = ba.a("measurement.config.cache_time.service", 86400000);
        q = ba.a("measurement.service_client.idle_disconnect_millis", 5000);
        r = ba.a("measurement.log_tag.service", "FA-SVC");
        s = ba.a("measurement.upload.stale_data_deletion_interval", 86400000);
        t = ba.a("measurement.upload.backoff_period", 43200000);
        u = ba.a("measurement.upload.initial_upload_delay_time", 15000);
        v = ba.a("measurement.upload.interval", 3600000);
        w = ba.a("measurement.upload.max_bundle_size", (long) PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH);
        x = ba.a("measurement.upload.max_bundles", 100);
        y = ba.a("measurement.upload.max_conversions_per_day", 500);
        z = ba.a("measurement.upload.max_error_events_per_day", 1000);
        A = ba.a("measurement.upload.max_events_per_bundle", 1000);
        B = ba.a("measurement.upload.max_events_per_day", 100000);
        C = ba.a("measurement.upload.max_public_events_per_day", (long) AndroidPlatformDecoder.DECODER_TIMEOUT_US);
        D = ba.a("measurement.upload.max_queue_time", 2419200000L);
        E = ba.a("measurement.upload.max_realtime_events_per_day", 10);
        F = ba.a("measurement.upload.max_batch_size", (long) PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH);
        G = ba.a("measurement.upload.retry_count", 6);
        H = ba.a("measurement.upload.retry_time", 1800000);
        I = ba.a("measurement.upload.url", "https://app-measurement.com/a");
        J = ba.a("measurement.upload.window_interval", 3600000);
    }

    public final long A() {
        return ((Long) p.a()).longValue();
    }

    public final String B() {
        return (String) d.a();
    }

    public final long C() {
        return ((Long) w.a()).longValue();
    }

    public final long D() {
        return ((Long) k.a()).longValue();
    }

    public final long E() {
        return ((Long) v.a()).longValue();
    }

    public final long F() {
        return ((Long) j.a()).longValue();
    }

    public final long G() {
        return ((Long) u.a()).longValue();
    }

    public final long H() {
        return ((Long) i.a()).longValue();
    }

    public final long I() {
        return ((Long) t.a()).longValue();
    }

    public final long J() {
        return ((Long) h.a()).longValue();
    }

    public final long a() {
        return ((Long) B.a()).longValue();
    }

    public final long b() {
        return ((Long) A.a()).longValue();
    }

    public final long c() {
        return ((Long) y.a()).longValue();
    }

    public final long d() {
        return ((Long) m.a()).longValue();
    }

    public final long e() {
        return ((Long) z.a()).longValue();
    }

    public final long f() {
        return ((Long) x.a()).longValue();
    }

    public final long g() {
        return ((Long) l.a()).longValue();
    }

    public final long h() {
        return ((Long) F.a()).longValue();
    }

    public final long i() {
        return ((Long) o.a()).longValue();
    }

    public final String j() {
        return (String) c.a();
    }

    public final long k() {
        return ((Long) E.a()).longValue();
    }

    public final long l() {
        return ((Long) n.a()).longValue();
    }

    public final long m() {
        return ((Long) b.a()).longValue();
    }

    public final long n() {
        return ((Long) D.a()).longValue();
    }

    public final long o() {
        return ((Long) a.a()).longValue();
    }

    public final long p() {
        return ((Long) C.a()).longValue();
    }

    public final long q() {
        return ((Long) J.a()).longValue();
    }

    public final long r() {
        return ((Long) s.a()).longValue();
    }

    public final long s() {
        return ((Long) g.a()).longValue();
    }

    public final String t() {
        return (String) I.a();
    }

    public final String u() {
        return (String) r.a();
    }

    public final long v() {
        return ((Long) f.a()).longValue();
    }

    public final long w() {
        return ((Long) H.a()).longValue();
    }

    public final long x() {
        return ((Long) q.a()).longValue();
    }

    public final String y() {
        return (String) e.a();
    }

    public final long z() {
        return ((Long) G.a()).longValue();
    }
}
