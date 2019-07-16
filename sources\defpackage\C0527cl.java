package defpackage;

import android.os.Bundle;
import com.facebook.O;
import com.facebook.internal.W;
import java.util.Locale;

/* renamed from: cl reason: default package and case insensitive filesystem */
/* compiled from: SessionLogger */
class C0527cl {
    private static final String a = "cl";
    private static final long[] b = {300000, 900000, 1800000, 3600000, 21600000, 43200000, 86400000, 172800000, 259200000, 604800000, 1209600000, 1814400000, 2419200000L, 5184000000L, 7776000000L, 10368000000L, 12960000000L, 15552000000L, 31536000000L};

    public static void a(String str, C1238dl dlVar, String str2) {
        String dlVar2 = dlVar != null ? dlVar.toString() : "Unclassified";
        Bundle bundle = new Bundle();
        bundle.putString("fb_mobile_launch_source", dlVar2);
        C1452kk kkVar = new C1452kk(str, str2, null);
        kkVar.a("fb_mobile_activate_app", bundle);
        if (C1452kk.c() != a.EXPLICIT_ONLY) {
            kkVar.a();
        }
    }

    public static void a(String str, C0496bl blVar, String str2) {
        Long valueOf = Long.valueOf(blVar.b() - blVar.e().longValue());
        long longValue = valueOf.longValue();
        Long valueOf2 = Long.valueOf(0);
        if (longValue < 0) {
            a();
            valueOf = valueOf2;
        }
        Long valueOf3 = Long.valueOf(blVar.f());
        if (valueOf3.longValue() < 0) {
            a();
            valueOf3 = valueOf2;
        }
        Bundle bundle = new Bundle();
        bundle.putInt("fb_mobile_app_interruptions", blVar.c());
        bundle.putString("fb_mobile_time_between_sessions", String.format(Locale.ROOT, "session_quanta_%d", new Object[]{Integer.valueOf(a(valueOf.longValue()))}));
        C1238dl g = blVar.g();
        bundle.putString("fb_mobile_launch_source", g != null ? g.toString() : "Unclassified");
        bundle.putLong("_logTime", blVar.e().longValue() / 1000);
        new C1452kk(str, str2, null).a("fb_mobile_deactivate_app", ((double) valueOf3.longValue()) / 1000.0d, bundle);
    }

    private static void a() {
        W.a(O.APP_EVENTS, a, "Clock skew detected");
    }

    private static int a(long j) {
        int i = 0;
        while (true) {
            long[] jArr = b;
            if (i >= jArr.length || jArr[i] >= j) {
                return i;
            }
            i++;
        }
        return i;
    }
}
