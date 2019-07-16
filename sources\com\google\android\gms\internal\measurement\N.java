package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.Gb.c;
import com.google.android.gms.internal.measurement.Gb.d;

public final class N extends Gb<N, a> implements C1037sc {
    private static volatile C1073yc<N> zzuo;
    /* access modifiers changed from: private */
    public static final N zzwa = new N();
    private int zzue;
    private String zzvy;
    private String zzvz;

    public static final class a extends com.google.android.gms.internal.measurement.Gb.a<N, a> implements C1037sc {
        private a() {
            super(N.zzwa);
        }

        /* synthetic */ a(M m) {
            this();
        }
    }

    static {
        Gb.a(N.class, zzwa);
    }

    private N() {
        String str = "";
        this.zzvy = str;
        this.zzvz = str;
    }

    public static C1073yc<N> r() {
        return (C1073yc) zzwa.a(d.g, null, null);
    }

    /* access modifiers changed from: protected */
    public final Object a(int i, Object obj, Object obj2) {
        switch (M.a[i - 1]) {
            case 1:
                return new N();
            case 2:
                return new a(null);
            case 3:
                return Gb.a((C1026qc) zzwa, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\b\u0000\u0002\b\u0001", new Object[]{"zzue", "zzvy", "zzvz"});
            case 4:
                return zzwa;
            case 5:
                C1073yc<N> ycVar = zzuo;
                if (ycVar == null) {
                    synchronized (N.class) {
                        ycVar = zzuo;
                        if (ycVar == null) {
                            ycVar = new c<>(zzwa);
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

    public final String p() {
        return this.zzvy;
    }

    public final String q() {
        return this.zzvz;
    }
}
