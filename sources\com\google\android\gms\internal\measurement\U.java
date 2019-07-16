package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.Gb.c;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;

public final class U extends Gb<U, a> implements C1037sc {
    private static volatile C1073yc<U> zzuo;
    /* access modifiers changed from: private */
    public static final U zzwu = new U();
    private int zzue;
    private String zzwk;
    private long zzwp;
    private String zzwr;
    private float zzws;
    private double zzwt;

    public static final class a extends com.google.android.gms.internal.measurement.Gb.a<U, a> implements C1037sc {
        private a() {
            super(U.zzwu);
        }

        public final a a(String str) {
            g();
            ((U) this.b).a(str);
            return this;
        }

        public final a b(String str) {
            g();
            ((U) this.b).b(str);
            return this;
        }

        public final a k() {
            g();
            ((U) this.b).A();
            return this;
        }

        public final a l() {
            g();
            ((U) this.b).B();
            return this;
        }

        public final a m() {
            g();
            ((U) this.b).C();
            return this;
        }

        /* synthetic */ a(O o) {
            this();
        }

        public final a a(long j) {
            g();
            ((U) this.b).a(j);
            return this;
        }

        public final a a(double d) {
            g();
            ((U) this.b).a(d);
            return this;
        }
    }

    static {
        Gb.a(U.class, zzwu);
    }

    private U() {
        String str = "";
        this.zzwk = str;
        this.zzwr = str;
    }

    /* access modifiers changed from: private */
    public final void A() {
        this.zzue &= -3;
        this.zzwr = zzwu.zzwr;
    }

    /* access modifiers changed from: private */
    public final void B() {
        this.zzue &= -5;
        this.zzwp = 0;
    }

    /* access modifiers changed from: private */
    public final void C() {
        this.zzue &= -17;
        this.zzwt = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
    }

    /* access modifiers changed from: private */
    public final void a(String str) {
        if (str != null) {
            this.zzue |= 1;
            this.zzwk = str;
            return;
        }
        throw new NullPointerException();
    }

    /* access modifiers changed from: private */
    public final void b(String str) {
        if (str != null) {
            this.zzue |= 2;
            this.zzwr = str;
            return;
        }
        throw new NullPointerException();
    }

    public static a y() {
        return (a) zzwu.k();
    }

    public final String p() {
        return this.zzwk;
    }

    public final boolean q() {
        return (this.zzue & 2) != 0;
    }

    public final String r() {
        return this.zzwr;
    }

    public final boolean s() {
        return (this.zzue & 4) != 0;
    }

    public final long t() {
        return this.zzwp;
    }

    public final boolean u() {
        return (this.zzue & 16) != 0;
    }

    public final double x() {
        return this.zzwt;
    }

    /* access modifiers changed from: private */
    public final void a(long j) {
        this.zzue |= 4;
        this.zzwp = j;
    }

    /* access modifiers changed from: private */
    public final void a(double d) {
        this.zzue |= 16;
        this.zzwt = d;
    }

    /* access modifiers changed from: protected */
    public final Object a(int i, Object obj, Object obj2) {
        switch (O.a[i - 1]) {
            case 1:
                return new U();
            case 2:
                return new a(null);
            case 3:
                return Gb.a((C1026qc) zzwu, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\b\u0000\u0002\b\u0001\u0003\u0002\u0002\u0004\u0001\u0003\u0005\u0000\u0004", new Object[]{"zzue", "zzwk", "zzwr", "zzwp", "zzws", "zzwt"});
            case 4:
                return zzwu;
            case 5:
                C1073yc<U> ycVar = zzuo;
                if (ycVar == null) {
                    synchronized (U.class) {
                        ycVar = zzuo;
                        if (ycVar == null) {
                            ycVar = new c<>(zzwu);
                            zzuo = ycVar;
                        }
                    }
                }
                return ycVar;
            case 6:
                return Byte.valueOf(1);
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
