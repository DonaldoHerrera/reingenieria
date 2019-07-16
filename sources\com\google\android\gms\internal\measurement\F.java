package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.Gb.c;

public final class F extends Gb<F, a> implements C1037sc {
    private static volatile C1073yc<F> zzuo;
    /* access modifiers changed from: private */
    public static final F zzuz = new F();
    private int zzue;
    private int zzuu;
    private boolean zzuv;
    private String zzuw;
    private String zzux;
    private String zzuy;

    public static final class a extends com.google.android.gms.internal.measurement.Gb.a<F, a> implements C1037sc {
        private a() {
            super(F.zzuz);
        }

        /* synthetic */ a(C c) {
            this();
        }
    }

    public enum b implements Lb {
        UNKNOWN_COMPARISON_TYPE(0),
        LESS_THAN(1),
        GREATER_THAN(2),
        EQUAL(3),
        BETWEEN(4);
        
        private static final Kb<b> f = null;
        private final int h;

        static {
            f = new I();
        }

        private b(int i) {
            this.h = i;
        }

        public static b a(int i) {
            if (i == 0) {
                return UNKNOWN_COMPARISON_TYPE;
            }
            if (i == 1) {
                return LESS_THAN;
            }
            if (i == 2) {
                return GREATER_THAN;
            }
            if (i == 3) {
                return EQUAL;
            }
            if (i != 4) {
                return null;
            }
            return BETWEEN;
        }

        public final int l() {
            return this.h;
        }

        public static Nb a() {
            return J.a;
        }
    }

    static {
        Gb.a(F.class, zzuz);
    }

    private F() {
        String str = "";
        this.zzuw = str;
        this.zzux = str;
        this.zzuy = str;
    }

    public static F B() {
        return zzuz;
    }

    public final String A() {
        return this.zzuy;
    }

    /* access modifiers changed from: protected */
    public final Object a(int i, Object obj, Object obj2) {
        switch (C.a[i - 1]) {
            case 1:
                return new F();
            case 2:
                return new a(null);
            case 3:
                return Gb.a((C1026qc) zzuz, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\f\u0000\u0002\u0007\u0001\u0003\b\u0002\u0004\b\u0003\u0005\b\u0004", new Object[]{"zzue", "zzuu", b.a(), "zzuv", "zzuw", "zzux", "zzuy"});
            case 4:
                return zzuz;
            case 5:
                C1073yc<F> ycVar = zzuo;
                if (ycVar == null) {
                    synchronized (F.class) {
                        ycVar = zzuo;
                        if (ycVar == null) {
                            ycVar = new c<>(zzuz);
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

    public final boolean p() {
        return (this.zzue & 1) != 0;
    }

    public final b q() {
        b a2 = b.a(this.zzuu);
        return a2 == null ? b.UNKNOWN_COMPARISON_TYPE : a2;
    }

    public final boolean r() {
        return (this.zzue & 2) != 0;
    }

    public final boolean s() {
        return this.zzuv;
    }

    public final boolean t() {
        return (this.zzue & 4) != 0;
    }

    public final String u() {
        return this.zzuw;
    }

    public final boolean x() {
        return (this.zzue & 8) != 0;
    }

    public final String y() {
        return this.zzux;
    }

    public final boolean z() {
        return (this.zzue & 16) != 0;
    }
}
