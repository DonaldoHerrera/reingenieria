package com.google.android.gms.internal.firebase-perf;

import com.google.android.gms.internal.firebase-perf.C0889sb.b;

public final class W extends C0889sb<W, a> implements C0843gc {
    private static volatile C0875oc<W> zzij;
    /* access modifiers changed from: private */
    public static final W zzje;
    private int zzie;
    private long zzik;
    private long zzjc;
    private long zzjd;

    public static final class a extends b<W, a> implements C0843gc {
        private a() {
            super(W.zzje);
        }

        public final a a(long j) {
            h();
            ((W) this.b).a(j);
            return this;
        }

        public final a b(long j) {
            h();
            ((W) this.b).b(j);
            return this;
        }

        public final a c(long j) {
            h();
            ((W) this.b).c(j);
            return this;
        }

        /* synthetic */ a(Y y) {
            this();
        }
    }

    static {
        W w = new W();
        zzje = w;
        C0889sb.a(W.class, w);
    }

    private W() {
    }

    /* access modifiers changed from: private */
    public final void a(long j) {
        this.zzie |= 1;
        this.zzik = j;
    }

    /* access modifiers changed from: private */
    public final void b(long j) {
        this.zzie |= 2;
        this.zzjc = j;
    }

    /* access modifiers changed from: private */
    public final void c(long j) {
        this.zzie |= 4;
        this.zzjd = j;
    }

    public static a o() {
        return (a) zzje.k();
    }

    /* access modifiers changed from: protected */
    public final Object a(int i, Object obj, Object obj2) {
        switch (Y.a[i - 1]) {
            case 1:
                return new W();
            case 2:
                return new a(null);
            case 3:
                return C0889sb.a((C0835ec) zzje, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0002\u0000\u0002\u0002\u0001\u0003\u0002\u0002", new Object[]{"zzie", "zzik", "zzjc", "zzjd"});
            case 4:
                return zzje;
            case 5:
                C0875oc<W> ocVar = zzij;
                if (ocVar == null) {
                    synchronized (W.class) {
                        ocVar = zzij;
                        if (ocVar == null) {
                            ocVar = new com.google.android.gms.internal.firebase-perf.C0889sb.a<>(zzje);
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
