package com.google.android.gms.internal.firebase-perf;

import com.google.android.gms.internal.firebase-perf.C0889sb.b;

public final class Ia extends C0889sb<Ia, a> implements C0843gc {
    private static volatile C0875oc<Ia> zzij;
    /* access modifiers changed from: private */
    public static final Ia zzmn;
    private int zzie;
    private String zzig;
    private String zzmj;
    private int zzmk;
    private int zzml;
    private int zzmm;

    public static final class a extends b<Ia, a> implements C0843gc {
        private a() {
            super(Ia.zzmn);
        }

        /* synthetic */ a(Ha ha) {
            this();
        }
    }

    static {
        Ia ia = new Ia();
        zzmn = ia;
        C0889sb.a(Ia.class, ia);
    }

    private Ia() {
        String str = "";
        this.zzig = str;
        this.zzmj = str;
    }

    /* access modifiers changed from: protected */
    public final Object a(int i, Object obj, Object obj2) {
        switch (Ha.a[i - 1]) {
            case 1:
                return new Ia();
            case 2:
                return new a(null);
            case 3:
                return C0889sb.a((C0835ec) zzmn, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\b\u0000\u0002\b\u0001\u0003\f\u0002\u0004\f\u0003\u0005\f\u0004", new Object[]{"zzie", "zzig", "zzmj", "zzmk", C0904wa.a(), "zzml", Ea.a(), "zzmm", C0814aa.a()});
            case 4:
                return zzmn;
            case 5:
                C0875oc<Ia> ocVar = zzij;
                if (ocVar == null) {
                    synchronized (Ia.class) {
                        ocVar = zzij;
                        if (ocVar == null) {
                            ocVar = new com.google.android.gms.internal.firebase-perf.C0889sb.a<>(zzmn);
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
