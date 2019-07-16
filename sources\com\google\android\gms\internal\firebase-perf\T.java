package com.google.android.gms.internal.firebase-perf;

import java.util.Map;

public final class T extends C0889sb<T, b> implements C0843gc {
    private static volatile C0875oc<T> zzij;
    /* access modifiers changed from: private */
    public static final T zziu;
    private int zzie;
    private String zzin;
    private String zzio;
    private O zzip;
    private C0841ga zziq;
    private Ia zzir;
    private int zzis;
    private Yb<String, String> zzit = Yb.k();

    static final class a {
        static final Wb<String, String> a;

        static {
            Yc yc = Yc.STRING;
            String str = "";
            a = Wb.a(yc, str, yc, str);
        }
    }

    public static final class b extends com.google.android.gms.internal.firebase-perf.C0889sb.b<T, b> implements C0843gc {
        private b() {
            super(T.zziu);
        }

        public final b a(String str) {
            h();
            ((T) this.b).a(str);
            return this;
        }

        public final b b(String str) {
            h();
            ((T) this.b).b(str);
            return this;
        }

        public final boolean l() {
            return ((T) this.b).p();
        }

        /* synthetic */ b(S s) {
            this();
        }

        public final b a(com.google.android.gms.internal.firebase-perf.O.a aVar) {
            h();
            ((T) this.b).a(aVar);
            return this;
        }

        public final b a(V v) {
            h();
            ((T) this.b).a(v);
            return this;
        }

        public final b a(Map<String, String> map) {
            h();
            ((T) this.b).w().putAll(map);
            return this;
        }
    }

    static {
        T t = new T();
        zziu = t;
        C0889sb.a(T.class, t);
    }

    private T() {
        String str = "";
        this.zzin = str;
        this.zzio = str;
    }

    /* access modifiers changed from: private */
    public final void a(String str) {
        if (str != null) {
            this.zzie |= 1;
            this.zzin = str;
            return;
        }
        throw new NullPointerException();
    }

    /* access modifiers changed from: private */
    public final void b(String str) {
        if (str != null) {
            this.zzie |= 2;
            this.zzio = str;
            return;
        }
        throw new NullPointerException();
    }

    public static b t() {
        return (b) zziu.k();
    }

    public static T u() {
        return zziu;
    }

    /* access modifiers changed from: private */
    public final Map<String, String> w() {
        if (!this.zzit.i()) {
            this.zzit = this.zzit.e();
        }
        return this.zzit;
    }

    public final boolean o() {
        return (this.zzie & 1) != 0;
    }

    public final boolean p() {
        return (this.zzie & 2) != 0;
    }

    public final boolean q() {
        return (this.zzie & 4) != 0;
    }

    public final O r() {
        O o = this.zzip;
        return o == null ? O.r() : o;
    }

    public final boolean s() {
        return (this.zzie & 32) != 0;
    }

    /* access modifiers changed from: private */
    public final void a(com.google.android.gms.internal.firebase-perf.O.a aVar) {
        this.zzip = (O) aVar.b();
        this.zzie |= 4;
    }

    /* access modifiers changed from: private */
    public final void a(V v) {
        if (v != null) {
            this.zzie |= 32;
            this.zzis = v.k();
            return;
        }
        throw new NullPointerException();
    }

    /* access modifiers changed from: protected */
    public final Object a(int i, Object obj, Object obj2) {
        switch (S.a[i - 1]) {
            case 1:
                return new T();
            case 2:
                return new b(null);
            case 3:
                return C0889sb.a((C0835ec) zziu, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0001\u0000\u0000\u0001\b\u0000\u0002\b\u0001\u0003\t\u0002\u0004\t\u0003\u0005\f\u0005\u00062\u0007\t\u0004", new Object[]{"zzie", "zzin", "zzio", "zzip", "zziq", "zzis", V.a(), "zzit", a.a, "zzir"});
            case 4:
                return zziu;
            case 5:
                C0875oc<T> ocVar = zzij;
                if (ocVar == null) {
                    synchronized (T.class) {
                        ocVar = zzij;
                        if (ocVar == null) {
                            ocVar = new com.google.android.gms.internal.firebase-perf.C0889sb.a<>(zziu);
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
