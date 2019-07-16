package com.google.android.gms.internal.firebase-perf;

import com.google.android.gms.internal.firebase-perf.C0889sb.b;

public final class P extends C0889sb<P, a> implements C0843gc {
    private static volatile C0875oc<P> zzij;
    /* access modifiers changed from: private */
    public static final P zzim;
    private int zzie;
    private long zzik;
    private int zzil;

    public static final class a extends b<P, a> implements C0843gc {
        private a() {
            super(P.zzim);
        }

        public final a a(long j) {
            h();
            ((P) this.b).a(j);
            return this;
        }

        /* synthetic */ a(Q q) {
            this();
        }

        public final a a(int i) {
            h();
            ((P) this.b).b(i);
            return this;
        }
    }

    static {
        P p = new P();
        zzim = p;
        C0889sb.a(P.class, p);
    }

    private P() {
    }

    /* access modifiers changed from: private */
    public final void a(long j) {
        this.zzie |= 1;
        this.zzik = j;
    }

    /* access modifiers changed from: private */
    public final void b(int i) {
        this.zzie |= 2;
        this.zzil = i;
    }

    public static a o() {
        return (a) zzim.k();
    }

    /* access modifiers changed from: protected */
    public final Object a(int i, Object obj, Object obj2) {
        switch (Q.a[i - 1]) {
            case 1:
                return new P();
            case 2:
                return new a(null);
            case 3:
                return C0889sb.a((C0835ec) zzim, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0000\u0002\u0004\u0001", new Object[]{"zzie", "zzik", "zzil"});
            case 4:
                return zzim;
            case 5:
                C0875oc<P> ocVar = zzij;
                if (ocVar == null) {
                    synchronized (P.class) {
                        ocVar = zzij;
                        if (ocVar == null) {
                            ocVar = new com.google.android.gms.internal.firebase-perf.C0889sb.a<>(zzim);
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
