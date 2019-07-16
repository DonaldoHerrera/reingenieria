package defpackage;

import com.google.android.exoplayer2.H;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/* renamed from: pn reason: default package and case insensitive filesystem */
/* compiled from: ScriptTagPayloadReader */
final class C1610pn extends C1640qn {
    private long b = -9223372036854775807L;

    public C1610pn() {
        super(null);
    }

    private static Date c(Pq pq) {
        Date date = new Date((long) d(pq).doubleValue());
        pq.f(2);
        return date;
    }

    private static Double d(Pq pq) {
        return Double.valueOf(Double.longBitsToDouble(pq.p()));
    }

    private static HashMap<String, Object> e(Pq pq) {
        int x = pq.x();
        HashMap<String, Object> hashMap = new HashMap<>(x);
        for (int i = 0; i < x; i++) {
            hashMap.put(h(pq), a(pq, i(pq)));
        }
        return hashMap;
    }

    private static HashMap<String, Object> f(Pq pq) {
        HashMap<String, Object> hashMap = new HashMap<>();
        while (true) {
            String h = h(pq);
            int i = i(pq);
            if (i == 9) {
                return hashMap;
            }
            hashMap.put(h, a(pq, i));
        }
    }

    private static ArrayList<Object> g(Pq pq) {
        int x = pq.x();
        ArrayList<Object> arrayList = new ArrayList<>(x);
        for (int i = 0; i < x; i++) {
            arrayList.add(a(pq, i(pq)));
        }
        return arrayList;
    }

    private static String h(Pq pq) {
        int z = pq.z();
        int c = pq.c();
        pq.f(z);
        return new String(pq.a, c, z);
    }

    private static int i(Pq pq) {
        return pq.t();
    }

    public long a() {
        return this.b;
    }

    /* access modifiers changed from: protected */
    public boolean a(Pq pq) {
        return true;
    }

    /* access modifiers changed from: protected */
    public void b(Pq pq, long j) throws H {
        if (i(pq) == 2) {
            if ("onMetaData".equals(h(pq)) && i(pq) == 8) {
                HashMap e = e(pq);
                String str = "duration";
                if (e.containsKey(str)) {
                    double doubleValue = ((Double) e.get(str)).doubleValue();
                    if (doubleValue > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                        this.b = (long) (doubleValue * 1000000.0d);
                    }
                }
                return;
            }
            return;
        }
        throw new H();
    }

    private static Object a(Pq pq, int i) {
        if (i == 0) {
            return d(pq);
        }
        if (i == 1) {
            return b(pq);
        }
        if (i == 2) {
            return h(pq);
        }
        if (i == 3) {
            return f(pq);
        }
        if (i == 8) {
            return e(pq);
        }
        if (i == 10) {
            return g(pq);
        }
        if (i != 11) {
            return null;
        }
        return c(pq);
    }

    private static Boolean b(Pq pq) {
        boolean z = true;
        if (pq.t() != 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
