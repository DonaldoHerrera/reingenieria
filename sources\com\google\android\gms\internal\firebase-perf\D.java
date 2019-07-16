package com.google.android.gms.internal.firebase-perf;

public final class D {
    private static final yd<String, String> a;
    private static final yd<String, String> b;

    static {
        Bd bd = new Bd();
        String str = "sampling";
        String str2 = "trace_sampling_rate";
        bd.a(str2, str);
        String str3 = "network_sampling_rate";
        bd.a(str3, str);
        a = bd.a();
        Bd bd2 = new Bd();
        bd2.a("sessions_sampling_percentage", "fpr_vc_session_sampling_rate");
        bd2.a(str2, "fpr_vc_trace_sampling_rate");
        bd2.a(str3, "fpr_vc_network_request_sampling_rate");
        b = bd2.a();
    }

    public static String a(String str) {
        return (String) a.getOrDefault(str, str);
    }

    public static String b(String str) {
        return (String) b.getOrDefault(str, str);
    }
}
