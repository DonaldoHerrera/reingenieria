package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.Gb.c;

public final class X extends Gb<X, a> implements C1037sc {
    private static volatile C1073yc<X> zzuo;
    /* access modifiers changed from: private */
    public static final X zzyr = new X();
    private int zzue;
    private int zzyp = 1;
    private Ob<T> zzyq = Gb.o();

    public static final class a extends com.google.android.gms.internal.measurement.Gb.a<X, a> implements C1037sc {
        private a() {
            super(X.zzyr);
        }

        /* synthetic */ a(O o) {
            this();
        }
    }

    public enum b implements Lb {
        RADS(1),
        PROVISIONING(2);
        
        private static final Kb<b> c = null;
        private final int e;

        static {
            c = new C0927ba();
        }

        private b(int i) {
            this.e = i;
        }

        public static b a(int i) {
            if (i == 1) {
                return RADS;
            }
            if (i != 2) {
                return null;
            }
            return PROVISIONING;
        }

        public final int l() {
            return this.e;
        }

        public static Nb a() {
            return C0934ca.a;
        }
    }

    static {
        Gb.a(X.class, zzyr);
    }

    private X() {
    }

    /* access modifiers changed from: protected */
    public final Object a(int i, Object obj, Object obj2) {
        switch (O.a[i - 1]) {
            case 1:
                return new X();
            case 2:
                return new a(null);
            case 3:
                return Gb.a((C1026qc) zzyr, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\f\u0000\u0002\u001b", new Object[]{"zzue", "zzyp", b.a(), "zzyq", T.class});
            case 4:
                return zzyr;
            case 5:
                C1073yc<X> ycVar = zzuo;
                if (ycVar == null) {
                    synchronized (X.class) {
                        ycVar = zzuo;
                        if (ycVar == null) {
                            ycVar = new c<>(zzyr);
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
