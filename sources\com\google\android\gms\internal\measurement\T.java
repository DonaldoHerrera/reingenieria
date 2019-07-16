package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.Gb.c;

public final class T extends Gb<T, a> implements C1037sc {
    private static volatile C1073yc<T> zzuo;
    /* access modifiers changed from: private */
    public static final T zzwq = new T();
    private int zzue;
    private String zzwk = "";
    private long zzwp;

    public static final class a extends com.google.android.gms.internal.measurement.Gb.a<T, a> implements C1037sc {
        private a() {
            super(T.zzwq);
        }

        /* synthetic */ a(O o) {
            this();
        }
    }

    static {
        Gb.a(T.class, zzwq);
    }

    private T() {
    }

    /* access modifiers changed from: protected */
    public final Object a(int i, Object obj, Object obj2) {
        switch (O.a[i - 1]) {
            case 1:
                return new T();
            case 2:
                return new a(null);
            case 3:
                return Gb.a((C1026qc) zzwq, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\b\u0000\u0002\u0002\u0001", new Object[]{"zzue", "zzwk", "zzwp"});
            case 4:
                return zzwq;
            case 5:
                C1073yc<T> ycVar = zzuo;
                if (ycVar == null) {
                    synchronized (T.class) {
                        ycVar = zzuo;
                        if (ycVar == null) {
                            ycVar = new c<>(zzwq);
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
