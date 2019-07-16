package com.google.android.gms.internal.firebase-perf;

import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class Da extends C0889sb<Da, b> implements C0843gc {
    private static volatile C0875oc<Da> zzij;
    /* access modifiers changed from: private */
    public static final Da zzmc;
    private int zzie;
    private Yb<String, String> zzit = Yb.k();
    private long zzkn;
    private Ab<C0892ta> zzkr = C0889sb.n();
    private String zzlx = "";
    private boolean zzly;
    private long zzlz;
    private Yb<String, Long> zzma = Yb.k();
    private Ab<Da> zzmb = C0889sb.n();

    static final class a {
        static final Wb<String, Long> a = Wb.a(Yc.STRING, "", Yc.INT64, Long.valueOf(0));
    }

    public static final class b extends com.google.android.gms.internal.firebase-perf.C0889sb.b<Da, b> implements C0843gc {
        private b() {
            super(Da.zzmc);
        }

        public final b a(String str) {
            h();
            ((Da) this.b).a(str);
            return this;
        }

        public final b b(long j) {
            h();
            ((Da) this.b).a(j);
            return this;
        }

        public final b l() {
            h();
            ((Da) this.b).A();
            return this;
        }

        /* synthetic */ b(Ba ba) {
            this();
        }

        public final b a(long j) {
            h();
            ((Da) this.b).b(j);
            return this;
        }

        public final b b(Map<String, String> map) {
            h();
            ((Da) this.b).z().putAll(map);
            return this;
        }

        public final b a(String str, long j) {
            if (str != null) {
                h();
                ((Da) this.b).B().put(str, Long.valueOf(j));
                return this;
            }
            throw new NullPointerException();
        }

        public final b b(Iterable<? extends C0892ta> iterable) {
            h();
            ((Da) this.b).a(iterable);
            return this;
        }

        public final b a(Map<String, Long> map) {
            h();
            ((Da) this.b).B().putAll(map);
            return this;
        }

        public final b a(Da da) {
            h();
            ((Da) this.b).d(da);
            return this;
        }

        public final b a(Iterable<? extends Da> iterable) {
            h();
            ((Da) this.b).b(iterable);
            return this;
        }

        public final b a(C0892ta taVar) {
            h();
            ((Da) this.b).a(taVar);
            return this;
        }
    }

    static final class c {
        static final Wb<String, String> a;

        static {
            Yc yc = Yc.STRING;
            String str = "";
            a = Wb.a(yc, str, yc, str);
        }
    }

    static {
        Da da = new Da();
        zzmc = da;
        C0889sb.a(Da.class, da);
    }

    private Da() {
    }

    /* access modifiers changed from: private */
    public final void A() {
        this.zzkr = C0889sb.n();
    }

    /* access modifiers changed from: private */
    public final Map<String, Long> B() {
        if (!this.zzma.i()) {
            this.zzma = this.zzma.e();
        }
        return this.zzma;
    }

    private final void C() {
        if (!this.zzmb.L()) {
            this.zzmb = C0889sb.a(this.zzmb);
        }
    }

    private final void D() {
        if (!this.zzkr.L()) {
            this.zzkr = C0889sb.a(this.zzkr);
        }
    }

    /* access modifiers changed from: private */
    public final void a(String str) {
        if (str != null) {
            this.zzie |= 1;
            this.zzlx = str;
            return;
        }
        throw new NullPointerException();
    }

    /* access modifiers changed from: private */
    public final void b(long j) {
        this.zzie |= 4;
        this.zzkn = j;
    }

    /* access modifiers changed from: private */
    public final void d(Da da) {
        if (da != null) {
            C();
            this.zzmb.add(da);
            return;
        }
        throw new NullPointerException();
    }

    public static b w() {
        return (b) zzmc.k();
    }

    public static Da x() {
        return zzmc;
    }

    /* access modifiers changed from: private */
    public final Map<String, String> z() {
        if (!this.zzit.i()) {
            this.zzit = this.zzit.e();
        }
        return this.zzit;
    }

    public final long o() {
        return this.zzlz;
    }

    public final String p() {
        return this.zzlx;
    }

    public final boolean q() {
        return (this.zzie & 4) != 0;
    }

    public final List<C0892ta> r() {
        return this.zzkr;
    }

    public final int s() {
        return this.zzma.size();
    }

    public final Map<String, Long> t() {
        return Collections.unmodifiableMap(this.zzma);
    }

    public final List<Da> u() {
        return this.zzmb;
    }

    public final Map<String, String> v() {
        return Collections.unmodifiableMap(this.zzit);
    }

    /* access modifiers changed from: private */
    public final void b(Iterable<? extends Da> iterable) {
        C();
        Ja.a(iterable, this.zzmb);
    }

    /* access modifiers changed from: private */
    public final void a(long j) {
        this.zzie |= 8;
        this.zzlz = j;
    }

    /* access modifiers changed from: private */
    public final void a(C0892ta taVar) {
        if (taVar != null) {
            D();
            this.zzkr.add(taVar);
            return;
        }
        throw new NullPointerException();
    }

    /* access modifiers changed from: private */
    public final void a(Iterable<? extends C0892ta> iterable) {
        D();
        Ja.a(iterable, this.zzkr);
    }

    /* access modifiers changed from: protected */
    public final Object a(int i, Object obj, Object obj2) {
        switch (Ba.a[i - 1]) {
            case 1:
                return new Da();
            case 2:
                return new b(null);
            case 3:
                return C0889sb.a((C0835ec) zzmc, "\u0001\b\u0000\u0001\u0001\t\b\u0002\u0002\u0000\u0001\b\u0000\u0002\u0007\u0001\u0004\u0002\u0002\u0005\u0002\u0003\u00062\u0007\u001b\b2\t\u001b", new Object[]{"zzie", "zzlx", "zzly", "zzkn", "zzlz", "zzma", a.a, "zzmb", Da.class, "zzit", c.a, "zzkr", C0892ta.class});
            case 4:
                return zzmc;
            case 5:
                C0875oc<Da> ocVar = zzij;
                if (ocVar == null) {
                    synchronized (Da.class) {
                        ocVar = zzij;
                        if (ocVar == null) {
                            ocVar = new com.google.android.gms.internal.firebase-perf.C0889sb.a<>(zzmc);
                            zzij = ocVar;
                        }
                    }
                }
                return ocVar;
            case 6:
                return Byte.valueOf(1);
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
