package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.Gb.c;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;

/* renamed from: com.google.android.gms.internal.measurement.aa reason: case insensitive filesystem */
public final class C0920aa extends Gb<C0920aa, a> implements C1037sc {
    private static volatile C1073yc<C0920aa> zzuo;
    /* access modifiers changed from: private */
    public static final C0920aa zzzd = new C0920aa();
    private int zzue;
    private String zzwk;
    private long zzwp;
    private String zzwr;
    private float zzws;
    private double zzwt;
    private long zzzc;

    /* renamed from: com.google.android.gms.internal.measurement.aa$a */
    public static final class a extends com.google.android.gms.internal.measurement.Gb.a<C0920aa, a> implements C1037sc {
        private a() {
            super(C0920aa.zzzd);
        }

        public final a a(long j) {
            g();
            ((C0920aa) this.b).b(j);
            return this;
        }

        public final a b(String str) {
            g();
            ((C0920aa) this.b).b(str);
            return this;
        }

        public final a k() {
            g();
            ((C0920aa) this.b).C();
            return this;
        }

        public final a l() {
            g();
            ((C0920aa) this.b).D();
            return this;
        }

        public final a m() {
            g();
            ((C0920aa) this.b).E();
            return this;
        }

        /* synthetic */ a(O o) {
            this();
        }

        public final a a(String str) {
            g();
            ((C0920aa) this.b).a(str);
            return this;
        }

        public final a b(long j) {
            g();
            ((C0920aa) this.b).a(j);
            return this;
        }

        public final a a(double d) {
            g();
            ((C0920aa) this.b).a(d);
            return this;
        }
    }

    static {
        Gb.a(C0920aa.class, zzzd);
    }

    private C0920aa() {
        String str = "";
        this.zzwk = str;
        this.zzwr = str;
    }

    public static a A() {
        return (a) zzzd.k();
    }

    /* access modifiers changed from: private */
    public final void C() {
        this.zzue &= -5;
        this.zzwr = zzzd.zzwr;
    }

    /* access modifiers changed from: private */
    public final void D() {
        this.zzue &= -9;
        this.zzwp = 0;
    }

    /* access modifiers changed from: private */
    public final void E() {
        this.zzue &= -33;
        this.zzwt = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
    }

    /* access modifiers changed from: private */
    public final void a(String str) {
        if (str != null) {
            this.zzue |= 2;
            this.zzwk = str;
            return;
        }
        throw new NullPointerException();
    }

    /* access modifiers changed from: private */
    public final void b(long j) {
        this.zzue |= 1;
        this.zzzc = j;
    }

    public final String p() {
        return this.zzwk;
    }

    public final boolean q() {
        return (this.zzue & 4) != 0;
    }

    public final String r() {
        return this.zzwr;
    }

    public final boolean s() {
        return (this.zzue & 8) != 0;
    }

    public final long t() {
        return this.zzwp;
    }

    public final boolean u() {
        return (this.zzue & 32) != 0;
    }

    public final double x() {
        return this.zzwt;
    }

    public final boolean y() {
        return (this.zzue & 1) != 0;
    }

    public final long z() {
        return this.zzzc;
    }

    /* access modifiers changed from: private */
    public final void b(String str) {
        if (str != null) {
            this.zzue |= 4;
            this.zzwr = str;
            return;
        }
        throw new NullPointerException();
    }

    /* access modifiers changed from: private */
    public final void a(long j) {
        this.zzue |= 8;
        this.zzwp = j;
    }

    /* access modifiers changed from: private */
    public final void a(double d) {
        this.zzue |= 32;
        this.zzwt = d;
    }

    /* access modifiers changed from: protected */
    public final Object a(int i, Object obj, Object obj2) {
        switch (O.a[i - 1]) {
            case 1:
                return new C0920aa();
            case 2:
                return new a(null);
            case 3:
                return Gb.a((C1026qc) zzzd, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u0002\u0000\u0002\b\u0001\u0003\b\u0002\u0004\u0002\u0003\u0005\u0001\u0004\u0006\u0000\u0005", new Object[]{"zzue", "zzzc", "zzwk", "zzwr", "zzwp", "zzws", "zzwt"});
            case 4:
                return zzzd;
            case 5:
                C1073yc<C0920aa> ycVar = zzuo;
                if (ycVar == null) {
                    synchronized (C0920aa.class) {
                        ycVar = zzuo;
                        if (ycVar == null) {
                            ycVar = new c<>(zzzd);
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
