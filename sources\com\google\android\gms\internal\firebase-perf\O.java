package com.google.android.gms.internal.firebase-perf;

import com.google.android.gms.internal.firebase-perf.C0889sb.b;

public final class O extends C0889sb<O, a> implements C0843gc {
    /* access modifiers changed from: private */
    public static final O zzii;
    private static volatile C0875oc<O> zzij;
    private int zzie;
    private String zzif;
    private String zzig;
    private String zzih;

    public static final class a extends b<O, a> implements C0843gc {
        private a() {
            super(O.zzii);
        }

        public final a a(String str) {
            h();
            ((O) this.b).a(str);
            return this;
        }

        public final a b(String str) {
            h();
            ((O) this.b).b(str);
            return this;
        }

        public final a c(String str) {
            h();
            ((O) this.b).c(str);
            return this;
        }

        /* synthetic */ a(N n) {
            this();
        }
    }

    static {
        O o = new O();
        zzii = o;
        C0889sb.a(O.class, o);
    }

    private O() {
        String str = "";
        this.zzif = str;
        this.zzig = str;
        this.zzih = str;
    }

    /* access modifiers changed from: private */
    public final void a(String str) {
        if (str != null) {
            this.zzie |= 1;
            this.zzif = str;
            return;
        }
        throw new NullPointerException();
    }

    /* access modifiers changed from: private */
    public final void b(String str) {
        if (str != null) {
            this.zzie |= 2;
            this.zzig = str;
            return;
        }
        throw new NullPointerException();
    }

    /* access modifiers changed from: private */
    public final void c(String str) {
        if (str != null) {
            this.zzie |= 4;
            this.zzih = str;
            return;
        }
        throw new NullPointerException();
    }

    public static a q() {
        return (a) zzii.k();
    }

    public static O r() {
        return zzii;
    }

    public final boolean o() {
        return (this.zzie & 1) != 0;
    }

    public final boolean p() {
        return (this.zzie & 2) != 0;
    }

    /* access modifiers changed from: protected */
    public final Object a(int i, Object obj, Object obj2) {
        switch (N.a[i - 1]) {
            case 1:
                return new O();
            case 2:
                return new a(null);
            case 3:
                return C0889sb.a((C0835ec) zzii, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\b\u0000\u0002\b\u0001\u0003\b\u0002", new Object[]{"zzie", "zzif", "zzig", "zzih"});
            case 4:
                return zzii;
            case 5:
                C0875oc<O> ocVar = zzij;
                if (ocVar == null) {
                    synchronized (O.class) {
                        ocVar = zzij;
                        if (ocVar == null) {
                            ocVar = new com.google.android.gms.internal.firebase-perf.C0889sb.a<>(zzii);
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
