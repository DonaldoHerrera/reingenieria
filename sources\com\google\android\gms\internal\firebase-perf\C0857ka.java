package com.google.android.gms.internal.firebase-perf;

import java.util.List;

/* renamed from: com.google.android.gms.internal.firebase-perf.ka reason: case insensitive filesystem */
public final class C0857ka extends C0889sb<C0857ka, a> implements C0843gc {
    private static volatile C0875oc<C0857ka> zzij;
    /* access modifiers changed from: private */
    public static final C0857ka zzks;
    private int zzie;
    private Yb<String, String> zzit = Yb.k();
    private String zzkg;
    private int zzkh;
    private long zzki;
    private long zzkj;
    private int zzkk;
    private int zzkl;
    private String zzkm;
    private long zzkn;
    private long zzko;
    private long zzkp;
    private long zzkq;
    private Ab<C0892ta> zzkr;

    /* renamed from: com.google.android.gms.internal.firebase-perf.ka$a */
    public static final class a extends com.google.android.gms.internal.firebase-perf.C0889sb.b<C0857ka, a> implements C0843gc {
        private a() {
            super(C0857ka.zzks);
        }

        public final a a(String str) {
            h();
            ((C0857ka) this.b).b(str);
            return this;
        }

        public final a b(long j) {
            h();
            ((C0857ka) this.b).e(j);
            return this;
        }

        public final a c(long j) {
            h();
            ((C0857ka) this.b).f(j);
            return this;
        }

        public final a d(long j) {
            h();
            ((C0857ka) this.b).a(j);
            return this;
        }

        public final a e(long j) {
            h();
            ((C0857ka) this.b).b(j);
            return this;
        }

        public final a f(long j) {
            h();
            ((C0857ka) this.b).c(j);
            return this;
        }

        public final boolean l() {
            return ((C0857ka) this.b).p();
        }

        public final boolean m() {
            return ((C0857ka) this.b).x();
        }

        public final long n() {
            return ((C0857ka) this.b).C();
        }

        public final boolean o() {
            return ((C0857ka) this.b).D();
        }

        public final a p() {
            h();
            ((C0857ka) this.b).J();
            return this;
        }

        public final a q() {
            h();
            ((C0857ka) this.b).K();
            return this;
        }

        /* synthetic */ a(C0861la laVar) {
            this();
        }

        public final a a(b bVar) {
            h();
            ((C0857ka) this.b).a(bVar);
            return this;
        }

        public final a b(String str) {
            h();
            ((C0857ka) this.b).a(str);
            return this;
        }

        public final a a(long j) {
            h();
            ((C0857ka) this.b).d(j);
            return this;
        }

        public final a a(d dVar) {
            h();
            ((C0857ka) this.b).a(dVar);
            return this;
        }

        public final a a(int i) {
            h();
            ((C0857ka) this.b).b(i);
            return this;
        }

        public final a a(Iterable<? extends C0892ta> iterable) {
            h();
            ((C0857ka) this.b).a(iterable);
            return this;
        }
    }

    /* renamed from: com.google.android.gms.internal.firebase-perf.ka$b */
    public enum b implements C0909xb {
        HTTP_METHOD_UNKNOWN(0),
        GET(1),
        PUT(2),
        POST(3),
        DELETE(4),
        HEAD(5),
        PATCH(6),
        OPTIONS(7),
        TRACE(8),
        CONNECT(9);
        
        private static final C0905wb<b> k = null;
        private final int m;

        static {
            k = new C0869na();
        }

        private b(int i) {
            this.m = i;
        }

        public static b a(int i) {
            switch (i) {
                case 0:
                    return HTTP_METHOD_UNKNOWN;
                case 1:
                    return GET;
                case 2:
                    return PUT;
                case 3:
                    return POST;
                case 4:
                    return DELETE;
                case 5:
                    return HEAD;
                case 6:
                    return PATCH;
                case 7:
                    return OPTIONS;
                case 8:
                    return TRACE;
                case 9:
                    return CONNECT;
                default:
                    return null;
            }
        }

        public final int k() {
            return this.m;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("<");
            sb.append(b.class.getName());
            sb.append('@');
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" number=");
            sb.append(this.m);
            sb.append(" name=");
            sb.append(name());
            sb.append('>');
            return sb.toString();
        }

        public static C0917zb a() {
            return C0865ma.a;
        }
    }

    /* renamed from: com.google.android.gms.internal.firebase-perf.ka$c */
    static final class c {
        static final Wb<String, String> a;

        static {
            Yc yc = Yc.STRING;
            String str = "";
            a = Wb.a(yc, str, yc, str);
        }
    }

    /* renamed from: com.google.android.gms.internal.firebase-perf.ka$d */
    public enum d implements C0909xb {
        NETWORK_CLIENT_ERROR_REASON_UNKNOWN(0),
        GENERIC_CLIENT_ERROR(1);
        
        private static final C0905wb<d> c = null;
        private final int e;

        static {
            c = new C0873oa();
        }

        private d(int i) {
            this.e = i;
        }

        public static C0917zb a() {
            return C0881qa.a;
        }

        public final int k() {
            return this.e;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("<");
            sb.append(d.class.getName());
            sb.append('@');
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" number=");
            sb.append(this.e);
            sb.append(" name=");
            sb.append(name());
            sb.append('>');
            return sb.toString();
        }
    }

    static {
        C0857ka kaVar = new C0857ka();
        zzks = kaVar;
        C0889sb.a(C0857ka.class, kaVar);
    }

    private C0857ka() {
        String str = "";
        this.zzkg = str;
        this.zzkm = str;
        this.zzkr = C0889sb.n();
    }

    public static a G() {
        return (a) zzks.k();
    }

    public static C0857ka H() {
        return zzks;
    }

    /* access modifiers changed from: private */
    public final void J() {
        this.zzie &= -65;
        this.zzkm = zzks.zzkm;
    }

    /* access modifiers changed from: private */
    public final void K() {
        this.zzkr = C0889sb.n();
    }

    /* access modifiers changed from: private */
    public final void a(b bVar) {
        if (bVar != null) {
            this.zzie |= 2;
            this.zzkh = bVar.k();
            return;
        }
        throw new NullPointerException();
    }

    /* access modifiers changed from: private */
    public final void b(String str) {
        if (str != null) {
            this.zzie |= 1;
            this.zzkg = str;
            return;
        }
        throw new NullPointerException();
    }

    /* access modifiers changed from: private */
    public final void c(long j) {
        this.zzie |= 1024;
        this.zzkq = j;
    }

    /* access modifiers changed from: private */
    public final void d(long j) {
        this.zzie |= 4;
        this.zzki = j;
    }

    /* access modifiers changed from: private */
    public final void e(long j) {
        this.zzie |= 8;
        this.zzkj = j;
    }

    /* access modifiers changed from: private */
    public final void f(long j) {
        this.zzie |= 128;
        this.zzkn = j;
    }

    public final long A() {
        return this.zzko;
    }

    public final boolean B() {
        return (this.zzie & 512) != 0;
    }

    public final long C() {
        return this.zzkp;
    }

    public final boolean D() {
        return (this.zzie & 1024) != 0;
    }

    public final long E() {
        return this.zzkq;
    }

    public final List<C0892ta> F() {
        return this.zzkr;
    }

    public final String o() {
        return this.zzkg;
    }

    public final boolean p() {
        return (this.zzie & 32) != 0;
    }

    public final boolean q() {
        return (this.zzie & 2) != 0;
    }

    public final b r() {
        b a2 = b.a(this.zzkh);
        return a2 == null ? b.HTTP_METHOD_UNKNOWN : a2;
    }

    public final boolean s() {
        return (this.zzie & 4) != 0;
    }

    public final long t() {
        return this.zzki;
    }

    public final boolean u() {
        return (this.zzie & 8) != 0;
    }

    public final long v() {
        return this.zzkj;
    }

    public final int w() {
        return this.zzkl;
    }

    public final boolean x() {
        return (this.zzie & 128) != 0;
    }

    public final long y() {
        return this.zzkn;
    }

    public final boolean z() {
        return (this.zzie & 256) != 0;
    }

    /* access modifiers changed from: private */
    public final void a(d dVar) {
        if (dVar != null) {
            this.zzie |= 16;
            this.zzkk = dVar.k();
            return;
        }
        throw new NullPointerException();
    }

    /* access modifiers changed from: private */
    public final void b(int i) {
        this.zzie |= 32;
        this.zzkl = i;
    }

    /* access modifiers changed from: private */
    public final void b(long j) {
        this.zzie |= 512;
        this.zzkp = j;
    }

    /* access modifiers changed from: private */
    public final void a(String str) {
        if (str != null) {
            this.zzie |= 64;
            this.zzkm = str;
            return;
        }
        throw new NullPointerException();
    }

    /* access modifiers changed from: private */
    public final void a(long j) {
        this.zzie |= 256;
        this.zzko = j;
    }

    /* access modifiers changed from: private */
    public final void a(Iterable<? extends C0892ta> iterable) {
        if (!this.zzkr.L()) {
            this.zzkr = C0889sb.a(this.zzkr);
        }
        Ja.a(iterable, this.zzkr);
    }

    /* access modifiers changed from: protected */
    public final Object a(int i, Object obj, Object obj2) {
        switch (C0861la.a[i - 1]) {
            case 1:
                return new C0857ka();
            case 2:
                return new a(null);
            case 3:
                return C0889sb.a((C0835ec) zzks, "\u0001\r\u0000\u0001\u0001\r\r\u0001\u0001\u0000\u0001\b\u0000\u0002\f\u0001\u0003\u0002\u0002\u0004\u0002\u0003\u0005\u0004\u0005\u0006\b\u0006\u0007\u0002\u0007\b\u0002\b\t\u0002\t\n\u0002\n\u000b\f\u0004\f2\r\u001b", new Object[]{"zzie", "zzkg", "zzkh", b.a(), "zzki", "zzkj", "zzkl", "zzkm", "zzkn", "zzko", "zzkp", "zzkq", "zzkk", d.a(), "zzit", c.a, "zzkr", C0892ta.class});
            case 4:
                return zzks;
            case 5:
                C0875oc<C0857ka> ocVar = zzij;
                if (ocVar == null) {
                    synchronized (C0857ka.class) {
                        ocVar = zzij;
                        if (ocVar == null) {
                            ocVar = new com.google.android.gms.internal.firebase-perf.C0889sb.a<>(zzks);
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
