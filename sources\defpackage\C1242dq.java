package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.SparseArray;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: dq reason: default package and case insensitive filesystem */
/* compiled from: DefaultBandwidthMeter */
public final class C1242dq implements Up, C1702sq {
    public static final Map<String, int[]> a = b();
    public static final long[] b = {5400000, 3400000, 1900000, 1100000, 400000};
    public static final long[] c = {170000, 139000, 122000, 107000, 90000};
    public static final long[] d = {2100000, 1300000, 960000, 770000, 450000};
    public static final long[] e = {6000000, 3400000, 2100000, 1400000, 570000};
    private final Context f;
    private final SparseArray<Long> g;
    private final Eq<defpackage.Up.a> h;
    private final Uq i;
    private final C1882yq j;
    private int k;
    private long l;
    private long m;
    private int n;
    private long o;
    private long p;
    private long q;
    private long r;
    private boolean s;
    private int t;

    /* renamed from: dq$a */
    /* compiled from: DefaultBandwidthMeter */
    public static final class a {
        private final Context a;
        private SparseArray<Long> b;
        private int c;
        private C1882yq d;
        private boolean e;

        public a(Context context) {
            Context context2;
            if (context == null) {
                context2 = null;
            } else {
                context2 = context.getApplicationContext();
            }
            this.a = context2;
            this.b = b(C0471ar.a(context));
            this.c = 2000;
            this.d = C1882yq.a;
        }

        private static SparseArray<Long> b(String str) {
            int[] a2 = a(str);
            SparseArray<Long> sparseArray = new SparseArray<>(6);
            sparseArray.append(0, Long.valueOf(1000000));
            sparseArray.append(2, Long.valueOf(C1242dq.b[a2[0]]));
            sparseArray.append(3, Long.valueOf(C1242dq.c[a2[1]]));
            sparseArray.append(4, Long.valueOf(C1242dq.d[a2[2]]));
            sparseArray.append(5, Long.valueOf(C1242dq.e[a2[3]]));
            sparseArray.append(7, Long.valueOf(C1242dq.b[a2[0]]));
            return sparseArray;
        }

        public C1242dq a() {
            C1242dq dqVar = new C1242dq(this.a, this.b, this.c, this.d, this.e);
            return dqVar;
        }

        private static int[] a(String str) {
            int[] iArr = (int[]) C1242dq.a.get(str);
            return iArr == null ? new int[]{2, 2, 2, 2} : iArr;
        }
    }

    /* renamed from: dq$b */
    /* compiled from: DefaultBandwidthMeter */
    private static class b extends BroadcastReceiver {
        private static b a;
        private final Handler b = new Handler(Looper.getMainLooper());
        private final ArrayList<WeakReference<C1242dq>> c = new ArrayList<>();

        private b() {
        }

        public static synchronized b a(Context context) {
            b bVar;
            synchronized (b.class) {
                if (a == null) {
                    a = new b();
                    IntentFilter intentFilter = new IntentFilter();
                    intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                    context.registerReceiver(a, intentFilter);
                }
                bVar = a;
            }
            return bVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public void a(C1242dq dqVar) {
            dqVar.c();
        }

        public synchronized void b(C1242dq dqVar) {
            a();
            this.c.add(new WeakReference(dqVar));
            this.b.post(new Pp(this, dqVar));
        }

        public synchronized void onReceive(Context context, Intent intent) {
            if (!isInitialStickyBroadcast()) {
                a();
                for (int i = 0; i < this.c.size(); i++) {
                    C1242dq dqVar = (C1242dq) ((WeakReference) this.c.get(i)).get();
                    if (dqVar != null) {
                        a(dqVar);
                    }
                }
            }
        }

        private void a() {
            for (int size = this.c.size() - 1; size >= 0; size--) {
                if (((C1242dq) ((WeakReference) this.c.get(size)).get()) == null) {
                    this.c.remove(size);
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0059, code lost:
        return;
     */
    public synchronized void c() {
        int i2 = this.s ? this.t : this.f == null ? 0 : C0471ar.b(this.f);
        if (this.n != i2) {
            this.n = i2;
            if (!(i2 == 1 || i2 == 0)) {
                if (i2 != 8) {
                    this.q = a(i2);
                    long elapsedRealtime = this.j.elapsedRealtime();
                    a(this.k > 0 ? (int) (elapsedRealtime - this.l) : 0, this.m, this.q);
                    this.l = elapsedRealtime;
                    this.m = 0;
                    this.p = 0;
                    this.o = 0;
                    this.i.a();
                }
            }
        }
    }

    public C1702sq a() {
        return this;
    }

    public synchronized void b(Zp zp, C0470aq aqVar, boolean z) {
        if (z) {
            if (this.k == 0) {
                this.l = this.j.elapsedRealtime();
            }
            this.k++;
        }
    }

    public void c(Zp zp, C0470aq aqVar, boolean z) {
    }

    @Deprecated
    public C1242dq() {
        this(null, new SparseArray(), 2000, C1882yq.a, false);
    }

    public void a(Handler handler, defpackage.Up.a aVar) {
        this.h.a(handler, aVar);
    }

    private C1242dq(Context context, SparseArray<Long> sparseArray, int i2, C1882yq yqVar, boolean z) {
        Context context2;
        int i3;
        if (context == null) {
            context2 = null;
        } else {
            context2 = context.getApplicationContext();
        }
        this.f = context2;
        this.g = sparseArray;
        this.h = new Eq<>();
        this.i = new Uq(i2);
        this.j = yqVar;
        if (context == null) {
            i3 = 0;
        } else {
            i3 = C0471ar.b(context);
        }
        this.n = i3;
        this.q = a(this.n);
        if (context != null && z) {
            b.a(context).b(this);
        }
    }

    public void a(defpackage.Up.a aVar) {
        this.h.a(aVar);
    }

    public synchronized void a(Zp zp, C0470aq aqVar, boolean z, int i2) {
        if (z) {
            this.m += (long) i2;
        }
    }

    private static Map<String, int[]> b() {
        HashMap hashMap = new HashMap();
        hashMap.put("AD", new int[]{1, 0, 0, 1});
        hashMap.put("AE", new int[]{1, 4, 4, 4});
        hashMap.put("AF", new int[]{4, 4, 3, 3});
        hashMap.put("AG", new int[]{3, 2, 1, 1});
        hashMap.put("AI", new int[]{1, 0, 1, 3});
        hashMap.put("AL", new int[]{1, 2, 1, 1});
        hashMap.put("AM", new int[]{2, 2, 3, 2});
        hashMap.put("AO", new int[]{3, 4, 2, 0});
        hashMap.put("AQ", new int[]{4, 2, 2, 2});
        hashMap.put("AR", new int[]{2, 3, 2, 2});
        hashMap.put("AS", new int[]{3, 3, 4, 1});
        hashMap.put("AT", new int[]{0, 2, 0, 0});
        hashMap.put("AU", new int[]{0, 1, 1, 1});
        hashMap.put("AW", new int[]{1, 1, 0, 2});
        hashMap.put("AX", new int[]{0, 2, 1, 0});
        hashMap.put("AZ", new int[]{3, 3, 2, 2});
        hashMap.put("BA", new int[]{1, 1, 1, 2});
        hashMap.put("BB", new int[]{0, 1, 0, 0});
        hashMap.put("BD", new int[]{2, 2, 3, 2});
        hashMap.put("BE", new int[]{0, 0, 0, 1});
        hashMap.put("BF", new int[]{4, 4, 3, 1});
        hashMap.put("BG", new int[]{0, 1, 0, 0});
        hashMap.put("BH", new int[]{2, 1, 3, 4});
        hashMap.put("BI", new int[]{4, 3, 4, 4});
        hashMap.put("BJ", new int[]{4, 3, 4, 4});
        hashMap.put("BL", new int[]{1, 0, 2, 3});
        hashMap.put("BM", new int[]{1, 0, 0, 0});
        hashMap.put("BN", new int[]{4, 2, 3, 3});
        hashMap.put("BO", new int[]{2, 2, 3, 2});
        hashMap.put("BQ", new int[]{1, 0, 3, 4});
        hashMap.put("BR", new int[]{2, 3, 3, 2});
        hashMap.put("BS", new int[]{2, 0, 1, 4});
        hashMap.put("BT", new int[]{3, 0, 2, 1});
        hashMap.put("BW", new int[]{4, 4, 1, 2});
        hashMap.put("BY", new int[]{0, 1, 1, 2});
        hashMap.put("BZ", new int[]{2, 2, 3, 1});
        hashMap.put("CA", new int[]{0, 3, 3, 3});
        hashMap.put("CD", new int[]{4, 4, 3, 2});
        hashMap.put("CF", new int[]{4, 3, 3, 4});
        hashMap.put("CG", new int[]{4, 4, 4, 4});
        hashMap.put("CH", new int[]{0, 0, 1, 1});
        hashMap.put("CI", new int[]{3, 4, 3, 3});
        hashMap.put("CK", new int[]{2, 4, 1, 0});
        hashMap.put("CL", new int[]{2, 2, 2, 3});
        hashMap.put("CM", new int[]{3, 4, 2, 1});
        hashMap.put("CN", new int[]{2, 2, 2, 3});
        hashMap.put("CO", new int[]{2, 3, 2, 2});
        hashMap.put("CR", new int[]{2, 2, 4, 4});
        hashMap.put("CU", new int[]{4, 4, 3, 1});
        hashMap.put("CV", new int[]{2, 3, 2, 4});
        hashMap.put("CW", new int[]{1, 0, 0, 0});
        hashMap.put("CX", new int[]{2, 2, 2, 2});
        hashMap.put("CY", new int[]{1, 1, 1, 1});
        hashMap.put("CZ", new int[]{0, 1, 0, 0});
        hashMap.put("DE", new int[]{0, 2, 2, 2});
        hashMap.put("DJ", new int[]{3, 3, 4, 0});
        hashMap.put("DK", new int[]{0, 0, 0, 0});
        hashMap.put("DM", new int[]{1, 0, 0, 3});
        hashMap.put("DO", new int[]{3, 3, 4, 4});
        hashMap.put("DZ", new int[]{3, 3, 4, 4});
        hashMap.put("EC", new int[]{2, 4, 4, 2});
        hashMap.put("EE", new int[]{0, 0, 0, 0});
        hashMap.put("EG", new int[]{3, 4, 2, 2});
        hashMap.put("EH", new int[]{2, 0, 3, 3});
        hashMap.put("ER", new int[]{4, 2, 2, 2});
        hashMap.put("ES", new int[]{0, 1, 1, 1});
        hashMap.put("ET", new int[]{4, 4, 4, 0});
        hashMap.put("FI", new int[]{0, 0, 1, 0});
        hashMap.put("FJ", new int[]{3, 1, 3, 3});
        hashMap.put("FK", new int[]{4, 2, 2, 3});
        hashMap.put("FM", new int[]{4, 2, 4, 0});
        hashMap.put("FO", new int[]{0, 0, 0, 0});
        hashMap.put("FR", new int[]{1, 0, 3, 1});
        hashMap.put("GA", new int[]{3, 3, 2, 1});
        hashMap.put("GB", new int[]{0, 1, 3, 3});
        hashMap.put("GD", new int[]{2, 0, 4, 4});
        hashMap.put("GE", new int[]{1, 1, 0, 3});
        hashMap.put("GF", new int[]{1, 2, 4, 4});
        hashMap.put("GG", new int[]{0, 0, 0, 0});
        hashMap.put("GH", new int[]{3, 3, 3, 2});
        hashMap.put("GI", new int[]{0, 0, 0, 1});
        hashMap.put("GL", new int[]{2, 2, 3, 4});
        hashMap.put("GM", new int[]{4, 3, 3, 2});
        hashMap.put("GN", new int[]{4, 4, 4, 0});
        hashMap.put("GP", new int[]{2, 2, 1, 3});
        hashMap.put("GQ", new int[]{4, 3, 3, 0});
        hashMap.put("GR", new int[]{1, 1, 0, 1});
        hashMap.put("GT", new int[]{3, 3, 3, 4});
        hashMap.put("GU", new int[]{1, 2, 4, 4});
        hashMap.put("GW", new int[]{4, 4, 4, 0});
        hashMap.put("GY", new int[]{3, 4, 1, 0});
        hashMap.put("HK", new int[]{0, 1, 4, 4});
        hashMap.put("HN", new int[]{3, 3, 2, 2});
        hashMap.put("HR", new int[]{1, 0, 0, 2});
        hashMap.put("HT", new int[]{3, 4, 4, 3});
        hashMap.put("HU", new int[]{0, 0, 1, 0});
        hashMap.put("ID", new int[]{3, 2, 3, 4});
        hashMap.put("IE", new int[]{0, 0, 3, 2});
        hashMap.put("IL", new int[]{0, 1, 2, 3});
        hashMap.put("IM", new int[]{0, 0, 0, 1});
        hashMap.put("IN", new int[]{2, 2, 4, 4});
        hashMap.put("IO", new int[]{4, 4, 2, 2});
        hashMap.put("IQ", new int[]{3, 3, 4, 4});
        hashMap.put("IR", new int[]{1, 0, 1, 0});
        hashMap.put("IS", new int[]{0, 0, 0, 0});
        hashMap.put("IT", new int[]{1, 0, 1, 1});
        hashMap.put("JE", new int[]{1, 0, 0, 1});
        hashMap.put("JM", new int[]{3, 2, 2, 1});
        hashMap.put("JO", new int[]{1, 1, 1, 2});
        hashMap.put("JP", new int[]{0, 2, 2, 2});
        hashMap.put("KE", new int[]{3, 3, 3, 3});
        hashMap.put("KG", new int[]{1, 1, 2, 3});
        hashMap.put("KH", new int[]{2, 0, 4, 4});
        hashMap.put("KI", new int[]{4, 4, 4, 4});
        hashMap.put("KM", new int[]{4, 4, 3, 3});
        hashMap.put("KN", new int[]{1, 0, 1, 4});
        hashMap.put("KP", new int[]{1, 2, 0, 2});
        hashMap.put("KR", new int[]{0, 3, 0, 2});
        hashMap.put("KW", new int[]{2, 2, 1, 2});
        hashMap.put("KY", new int[]{1, 1, 0, 2});
        hashMap.put("KZ", new int[]{1, 2, 2, 2});
        hashMap.put("LA", new int[]{2, 1, 1, 0});
        hashMap.put("LB", new int[]{3, 2, 0, 0});
        hashMap.put("LC", new int[]{2, 1, 0, 0});
        hashMap.put("LI", new int[]{0, 0, 2, 2});
        hashMap.put("LK", new int[]{1, 1, 2, 2});
        hashMap.put("LR", new int[]{3, 4, 4, 1});
        hashMap.put("LS", new int[]{3, 3, 2, 0});
        hashMap.put("LT", new int[]{0, 0, 0, 0});
        hashMap.put("LU", new int[]{0, 1, 0, 0});
        hashMap.put("LV", new int[]{0, 0, 0, 0});
        hashMap.put("LY", new int[]{4, 3, 4, 4});
        hashMap.put("MA", new int[]{2, 1, 2, 2});
        hashMap.put("MC", new int[]{1, 0, 1, 0});
        hashMap.put("MD", new int[]{1, 1, 0, 0});
        hashMap.put("ME", new int[]{1, 2, 2, 3});
        hashMap.put("MF", new int[]{1, 4, 2, 1});
        hashMap.put("MG", new int[]{3, 4, 1, 3});
        hashMap.put("MH", new int[]{4, 0, 2, 3});
        hashMap.put("MK", new int[]{1, 0, 0, 0});
        hashMap.put("ML", new int[]{4, 4, 4, 3});
        hashMap.put("MM", new int[]{2, 3, 1, 2});
        hashMap.put("MN", new int[]{2, 3, 2, 4});
        hashMap.put("MO", new int[]{0, 0, 4, 4});
        hashMap.put("MP", new int[]{0, 2, 4, 4});
        hashMap.put("MQ", new int[]{1, 1, 1, 3});
        hashMap.put("MR", new int[]{4, 4, 4, 4});
        hashMap.put("MS", new int[]{1, 4, 0, 3});
        hashMap.put("MT", new int[]{0, 1, 0, 0});
        hashMap.put("MU", new int[]{2, 2, 3, 4});
        hashMap.put("MV", new int[]{3, 2, 1, 1});
        hashMap.put("MW", new int[]{4, 2, 1, 1});
        hashMap.put("MX", new int[]{2, 4, 3, 2});
        hashMap.put("MY", new int[]{2, 2, 2, 3});
        hashMap.put("MZ", new int[]{3, 4, 2, 2});
        hashMap.put("NA", new int[]{3, 2, 2, 1});
        hashMap.put("NC", new int[]{2, 1, 3, 2});
        hashMap.put("NE", new int[]{4, 4, 4, 3});
        hashMap.put("NF", new int[]{1, 2, 2, 2});
        hashMap.put("NG", new int[]{3, 4, 3, 2});
        hashMap.put("NI", new int[]{3, 3, 3, 4});
        hashMap.put("NL", new int[]{0, 2, 4, 3});
        hashMap.put("NO", new int[]{0, 1, 0, 0});
        hashMap.put("NP", new int[]{3, 3, 2, 2});
        hashMap.put("NR", new int[]{4, 0, 4, 0});
        hashMap.put("NU", new int[]{2, 2, 2, 1});
        hashMap.put("NZ", new int[]{0, 0, 0, 1});
        hashMap.put("OM", new int[]{2, 2, 1, 3});
        hashMap.put("PA", new int[]{1, 3, 3, 4});
        hashMap.put("PE", new int[]{2, 3, 4, 4});
        hashMap.put("PF", new int[]{3, 1, 0, 1});
        hashMap.put("PG", new int[]{4, 3, 1, 1});
        hashMap.put("PH", new int[]{3, 0, 4, 4});
        hashMap.put("PK", new int[]{3, 3, 3, 3});
        hashMap.put("PL", new int[]{1, 1, 1, 3});
        hashMap.put("PM", new int[]{0, 2, 0, 0});
        hashMap.put("PR", new int[]{2, 1, 3, 3});
        hashMap.put("PS", new int[]{3, 3, 1, 4});
        hashMap.put("PT", new int[]{1, 1, 0, 1});
        hashMap.put("PW", new int[]{2, 2, 1, 1});
        hashMap.put("PY", new int[]{3, 1, 3, 3});
        hashMap.put("QA", new int[]{2, 3, 0, 1});
        hashMap.put("RE", new int[]{1, 0, 2, 2});
        hashMap.put("RO", new int[]{0, 1, 1, 2});
        hashMap.put("RS", new int[]{1, 2, 0, 0});
        hashMap.put("RU", new int[]{0, 1, 1, 1});
        hashMap.put("RW", new int[]{3, 4, 2, 4});
        hashMap.put("SA", new int[]{2, 2, 1, 2});
        hashMap.put("SB", new int[]{4, 4, 3, 0});
        hashMap.put("SC", new int[]{4, 2, 0, 1});
        hashMap.put("SD", new int[]{4, 4, 4, 2});
        hashMap.put("SE", new int[]{0, 1, 0, 0});
        hashMap.put("SG", new int[]{1, 2, 3, 3});
        hashMap.put("SH", new int[]{4, 4, 2, 3});
        hashMap.put("SI", new int[]{0, 1, 0, 1});
        hashMap.put("SJ", new int[]{0, 0, 2, 0});
        hashMap.put("SK", new int[]{0, 1, 0, 1});
        hashMap.put("SL", new int[]{4, 3, 2, 4});
        hashMap.put("SM", new int[]{0, 0, 1, 3});
        hashMap.put("SN", new int[]{4, 4, 4, 3});
        hashMap.put("SO", new int[]{4, 4, 4, 4});
        hashMap.put("SR", new int[]{3, 2, 2, 4});
        hashMap.put("SS", new int[]{4, 2, 4, 2});
        hashMap.put("ST", new int[]{3, 4, 2, 2});
        hashMap.put("SV", new int[]{2, 3, 3, 4});
        hashMap.put("SX", new int[]{2, 4, 1, 0});
        hashMap.put("SY", new int[]{4, 4, 1, 0});
        hashMap.put("SZ", new int[]{3, 4, 2, 3});
        hashMap.put("TC", new int[]{1, 1, 3, 1});
        hashMap.put("TD", new int[]{4, 4, 4, 3});
        hashMap.put("TG", new int[]{3, 3, 1, 0});
        hashMap.put("TH", new int[]{1, 3, 4, 4});
        hashMap.put("TJ", new int[]{4, 4, 4, 4});
        hashMap.put("TL", new int[]{4, 2, 4, 4});
        hashMap.put("TM", new int[]{4, 1, 2, 3});
        hashMap.put("TN", new int[]{2, 1, 1, 1});
        hashMap.put("TO", new int[]{3, 3, 3, 1});
        hashMap.put("TR", new int[]{1, 2, 0, 1});
        hashMap.put("TT", new int[]{2, 3, 1, 2});
        hashMap.put("TV", new int[]{4, 2, 2, 4});
        hashMap.put("TW", new int[]{0, 0, 0, 1});
        hashMap.put("TZ", new int[]{3, 3, 4, 3});
        hashMap.put("UA", new int[]{0, 2, 1, 2});
        hashMap.put("UG", new int[]{4, 3, 2, 3});
        hashMap.put("US", new int[]{0, 1, 3, 3});
        hashMap.put("UY", new int[]{2, 2, 2, 2});
        hashMap.put("UZ", new int[]{3, 2, 2, 2});
        hashMap.put("VA", new int[]{1, 2, 2, 2});
        hashMap.put("VC", new int[]{2, 1, 0, 0});
        hashMap.put("VE", new int[]{4, 4, 4, 3});
        hashMap.put("VG", new int[]{2, 1, 1, 2});
        hashMap.put("VI", new int[]{1, 0, 2, 4});
        hashMap.put("VN", new int[]{0, 2, 4, 4});
        hashMap.put("VU", new int[]{4, 1, 3, 1});
        hashMap.put("WS", new int[]{3, 2, 3, 1});
        hashMap.put("XK", new int[]{1, 2, 1, 0});
        hashMap.put("YE", new int[]{4, 4, 4, 2});
        hashMap.put("YT", new int[]{2, 0, 2, 3});
        hashMap.put("ZA", new int[]{2, 3, 2, 2});
        hashMap.put("ZM", new int[]{3, 3, 2, 1});
        hashMap.put("ZW", new int[]{3, 3, 3, 1});
        return Collections.unmodifiableMap(hashMap);
    }

    public synchronized void a(Zp zp, C0470aq aqVar, boolean z) {
        if (z) {
            C1852xq.b(this.k > 0);
            long elapsedRealtime = this.j.elapsedRealtime();
            int i2 = (int) (elapsedRealtime - this.l);
            long j2 = (long) i2;
            this.o += j2;
            this.p += this.m;
            if (i2 > 0) {
                this.i.a((int) Math.sqrt((double) this.m), (float) ((this.m * 8000) / j2));
                if (this.o >= 2000 || this.p >= PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED) {
                    this.q = (long) this.i.a(0.5f);
                }
                a(i2, this.m, this.q);
                this.l = elapsedRealtime;
                this.m = 0;
            }
            this.k--;
        }
    }

    private void a(int i2, long j2, long j3) {
        if (i2 != 0 || j2 != 0 || j3 != this.r) {
            this.r = j3;
            Eq<defpackage.Up.a> eq = this.h;
            Op op = new Op(i2, j2, j3);
            eq.a((defpackage.Eq.a<T>) op);
        }
    }

    private long a(int i2) {
        Long l2 = (Long) this.g.get(i2);
        if (l2 == null) {
            l2 = (Long) this.g.get(0);
        }
        if (l2 == null) {
            l2 = Long.valueOf(1000000);
        }
        return l2.longValue();
    }
}
