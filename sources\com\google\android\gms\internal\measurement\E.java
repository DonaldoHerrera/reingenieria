package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.Gb.c;

public final class E extends Gb<E, a> implements C1037sc {
    private static volatile C1073yc<E> zzuo;
    /* access modifiers changed from: private */
    public static final E zzut = new E();
    private int zzue;
    private H zzup;
    private F zzuq;
    private boolean zzur;
    private String zzus = "";

    public static final class a extends com.google.android.gms.internal.measurement.Gb.a<E, a> implements C1037sc {
        private a() {
            super(E.zzut);
        }

        public final a a(String str) {
            g();
            ((E) this.b).a(str);
            return this;
        }

        /* synthetic */ a(C c) {
            this();
        }
    }

    static {
        Gb.a(E.class, zzut);
    }

    private E() {
    }

    /* access modifiers changed from: private */
    public final void a(String str) {
        if (str != null) {
            this.zzue |= 8;
            this.zzus = str;
            return;
        }
        throw new NullPointerException();
    }

    public static E y() {
        return zzut;
    }

    public final boolean p() {
        return (this.zzue & 1) != 0;
    }

    public final H q() {
        H h = this.zzup;
        return h == null ? H.z() : h;
    }

    public final boolean r() {
        return (this.zzue & 2) != 0;
    }

    public final F s() {
        F f = this.zzuq;
        return f == null ? F.B() : f;
    }

    public final boolean t() {
        return (this.zzue & 4) != 0;
    }

    public final boolean u() {
        return this.zzur;
    }

    public final String x() {
        return this.zzus;
    }

    /* access modifiers changed from: protected */
    public final Object a(int i, Object obj, Object obj2) {
        switch (C.a[i - 1]) {
            case 1:
                return new E();
            case 2:
                return new a(null);
            case 3:
                return Gb.a((C1026qc) zzut, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0000\u0002\t\u0001\u0003\u0007\u0002\u0004\b\u0003", new Object[]{"zzue", "zzup", "zzuq", "zzur", "zzus"});
            case 4:
                return zzut;
            case 5:
                C1073yc<E> ycVar = zzuo;
                if (ycVar == null) {
                    synchronized (E.class) {
                        ycVar = zzuo;
                        if (ycVar == null) {
                            ycVar = new c<>(zzut);
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
