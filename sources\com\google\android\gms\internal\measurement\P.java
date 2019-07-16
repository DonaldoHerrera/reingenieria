package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.Gb.c;

public final class P extends Gb<P, a> implements C1037sc {
    private static volatile C1073yc<P> zzuo;
    /* access modifiers changed from: private */
    public static final P zzwf = new P();
    private int zzue;
    private int zzwb;
    private Y zzwc;
    private Y zzwd;
    private boolean zzwe;

    public static final class a extends com.google.android.gms.internal.measurement.Gb.a<P, a> implements C1037sc {
        private a() {
            super(P.zzwf);
        }

        public final a a(int i) {
            g();
            ((P) this.b).b(i);
            return this;
        }

        public final Y k() {
            return ((P) this.b).p();
        }

        public final boolean l() {
            return ((P) this.b).q();
        }

        public final Y m() {
            return ((P) this.b).r();
        }

        /* synthetic */ a(O o) {
            this();
        }

        public final a a(com.google.android.gms.internal.measurement.Y.a aVar) {
            g();
            ((P) this.b).a(aVar);
            return this;
        }

        public final a a(Y y) {
            g();
            ((P) this.b).a(y);
            return this;
        }

        public final a a(boolean z) {
            g();
            ((P) this.b).a(z);
            return this;
        }
    }

    static {
        Gb.a(P.class, zzwf);
    }

    private P() {
    }

    /* access modifiers changed from: private */
    public final void a(com.google.android.gms.internal.measurement.Y.a aVar) {
        this.zzwc = (Y) aVar.w();
        this.zzue |= 2;
    }

    /* access modifiers changed from: private */
    public final void b(int i) {
        this.zzue |= 1;
        this.zzwb = i;
    }

    public static a y() {
        return (a) zzwf.k();
    }

    public final Y p() {
        Y y = this.zzwc;
        return y == null ? Y.A() : y;
    }

    public final boolean q() {
        return (this.zzue & 4) != 0;
    }

    public final Y r() {
        Y y = this.zzwd;
        return y == null ? Y.A() : y;
    }

    public final boolean s() {
        return (this.zzue & 1) != 0;
    }

    public final int t() {
        return this.zzwb;
    }

    public final boolean u() {
        return (this.zzue & 8) != 0;
    }

    public final boolean x() {
        return this.zzwe;
    }

    /* access modifiers changed from: private */
    public final void a(Y y) {
        if (y != null) {
            this.zzwd = y;
            this.zzue |= 4;
            return;
        }
        throw new NullPointerException();
    }

    /* access modifiers changed from: private */
    public final void a(boolean z) {
        this.zzue |= 8;
        this.zzwe = z;
    }

    /* access modifiers changed from: protected */
    public final Object a(int i, Object obj, Object obj2) {
        switch (O.a[i - 1]) {
            case 1:
                return new P();
            case 2:
                return new a(null);
            case 3:
                return Gb.a((C1026qc) zzwf, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0004\u0000\u0002\t\u0001\u0003\t\u0002\u0004\u0007\u0003", new Object[]{"zzue", "zzwb", "zzwc", "zzwd", "zzwe"});
            case 4:
                return zzwf;
            case 5:
                C1073yc<P> ycVar = zzuo;
                if (ycVar == null) {
                    synchronized (P.class) {
                        ycVar = zzuo;
                        if (ycVar == null) {
                            ycVar = new c<>(zzwf);
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
