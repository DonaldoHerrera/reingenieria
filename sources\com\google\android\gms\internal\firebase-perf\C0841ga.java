package com.google.android.gms.internal.firebase-perf;

import com.google.android.gms.internal.firebase-perf.C0889sb.b;

/* renamed from: com.google.android.gms.internal.firebase-perf.ga reason: case insensitive filesystem */
public final class C0841ga extends C0889sb<C0841ga, a> implements C0843gc {
    private static volatile C0875oc<C0841ga> zzij;
    /* access modifiers changed from: private */
    public static final C0841ga zzkc;
    private int zzie;
    private String zzig;
    private String zzjz;
    private String zzka;
    private hd zzkb;

    /* renamed from: com.google.android.gms.internal.firebase-perf.ga$a */
    public static final class a extends b<C0841ga, a> implements C0843gc {
        private a() {
            super(C0841ga.zzkc);
        }

        /* synthetic */ a(C0845ha haVar) {
            this();
        }
    }

    static {
        C0841ga gaVar = new C0841ga();
        zzkc = gaVar;
        C0889sb.a(C0841ga.class, gaVar);
    }

    private C0841ga() {
        String str = "";
        this.zzig = str;
        this.zzjz = str;
        this.zzka = str;
    }

    /* access modifiers changed from: protected */
    public final Object a(int i, Object obj, Object obj2) {
        switch (C0845ha.a[i - 1]) {
            case 1:
                return new C0841ga();
            case 2:
                return new a(null);
            case 3:
                return C0889sb.a((C0835ec) zzkc, "\u0001\u0004\u0000\u0001\u0002\u0005\u0004\u0000\u0000\u0000\u0002\b\u0000\u0003\b\u0001\u0004\b\u0002\u0005\t\u0003", new Object[]{"zzie", "zzig", "zzjz", "zzka", "zzkb"});
            case 4:
                return zzkc;
            case 5:
                C0875oc<C0841ga> ocVar = zzij;
                if (ocVar == null) {
                    synchronized (C0841ga.class) {
                        ocVar = zzij;
                        if (ocVar == null) {
                            ocVar = new com.google.android.gms.internal.firebase-perf.C0889sb.a<>(zzkc);
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
