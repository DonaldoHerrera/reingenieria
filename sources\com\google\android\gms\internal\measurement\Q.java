package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.Gb.c;

public final class Q extends Gb<Q, a> implements C1037sc {
    private static volatile C1073yc<Q> zzuo;
    /* access modifiers changed from: private */
    public static final Q zzwi = new Q();
    private int zzue;
    private int zzwg;
    private long zzwh;

    public static final class a extends com.google.android.gms.internal.measurement.Gb.a<Q, a> implements C1037sc {
        private a() {
            super(Q.zzwi);
        }

        public final a a(int i) {
            g();
            ((Q) this.b).b(i);
            return this;
        }

        /* synthetic */ a(O o) {
            this();
        }

        public final a a(long j) {
            g();
            ((Q) this.b).a(j);
            return this;
        }
    }

    static {
        Gb.a(Q.class, zzwi);
    }

    private Q() {
    }

    /* access modifiers changed from: private */
    public final void a(long j) {
        this.zzue |= 2;
        this.zzwh = j;
    }

    /* access modifiers changed from: private */
    public final void b(int i) {
        this.zzue |= 1;
        this.zzwg = i;
    }

    public static a t() {
        return (a) zzwi.k();
    }

    public final int p() {
        return this.zzwg;
    }

    public final boolean q() {
        return (this.zzue & 1) != 0;
    }

    public final boolean r() {
        return (this.zzue & 2) != 0;
    }

    public final long s() {
        return this.zzwh;
    }

    /* access modifiers changed from: protected */
    public final Object a(int i, Object obj, Object obj2) {
        switch (O.a[i - 1]) {
            case 1:
                return new Q();
            case 2:
                return new a(null);
            case 3:
                return Gb.a((C1026qc) zzwi, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0000\u0002\u0002\u0001", new Object[]{"zzue", "zzwg", "zzwh"});
            case 4:
                return zzwi;
            case 5:
                C1073yc<Q> ycVar = zzuo;
                if (ycVar == null) {
                    synchronized (Q.class) {
                        ycVar = zzuo;
                        if (ycVar == null) {
                            ycVar = new c<>(zzwi);
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
