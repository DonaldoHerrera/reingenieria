package com.google.android.gms.internal.firebase-perf;

import com.google.android.gms.internal.firebase-perf.C0889sb.b;

/* renamed from: com.google.android.gms.internal.firebase-perf.fa reason: case insensitive filesystem */
public final class C0837fa extends C0889sb<C0837fa, a> implements C0843gc {
    private static volatile C0875oc<C0837fa> zzij;
    /* access modifiers changed from: private */
    public static final C0837fa zzjy;
    private int zzie;
    private String zzjt = "";
    private C0819ba zzju;
    private Ab<W> zzjv = C0889sb.n();
    private Ab<P> zzjw = C0889sb.n();
    private Ab<C0853ja> zzjx = C0889sb.n();

    /* renamed from: com.google.android.gms.internal.firebase-perf.fa$a */
    public static final class a extends b<C0837fa, a> implements C0843gc {
        private a() {
            super(C0837fa.zzjy);
        }

        public final a a(String str) {
            h();
            ((C0837fa) this.b).a(str);
            return this;
        }

        /* synthetic */ a(C0833ea eaVar) {
            this();
        }

        public final a a(C0819ba baVar) {
            h();
            ((C0837fa) this.b).a(baVar);
            return this;
        }

        public final a a(W w) {
            h();
            ((C0837fa) this.b).a(w);
            return this;
        }

        public final a a(P p) {
            h();
            ((C0837fa) this.b).a(p);
            return this;
        }
    }

    static {
        C0837fa faVar = new C0837fa();
        zzjy = faVar;
        C0889sb.a(C0837fa.class, faVar);
    }

    private C0837fa() {
    }

    /* access modifiers changed from: private */
    public final void a(String str) {
        if (str != null) {
            this.zzie |= 1;
            this.zzjt = str;
            return;
        }
        throw new NullPointerException();
    }

    public static a u() {
        return (a) zzjy.k();
    }

    public static C0837fa v() {
        return zzjy;
    }

    public final boolean o() {
        return (this.zzie & 1) != 0;
    }

    public final String p() {
        return this.zzjt;
    }

    public final boolean q() {
        return (this.zzie & 2) != 0;
    }

    public final C0819ba r() {
        C0819ba baVar = this.zzju;
        return baVar == null ? C0819ba.q() : baVar;
    }

    public final int s() {
        return this.zzjv.size();
    }

    public final int t() {
        return this.zzjw.size();
    }

    /* access modifiers changed from: private */
    public final void a(C0819ba baVar) {
        if (baVar != null) {
            this.zzju = baVar;
            this.zzie |= 2;
            return;
        }
        throw new NullPointerException();
    }

    /* access modifiers changed from: private */
    public final void a(W w) {
        if (w != null) {
            if (!this.zzjv.L()) {
                this.zzjv = C0889sb.a(this.zzjv);
            }
            this.zzjv.add(w);
            return;
        }
        throw new NullPointerException();
    }

    /* access modifiers changed from: private */
    public final void a(P p) {
        if (p != null) {
            if (!this.zzjw.L()) {
                this.zzjw = C0889sb.a(this.zzjw);
            }
            this.zzjw.add(p);
            return;
        }
        throw new NullPointerException();
    }

    /* access modifiers changed from: protected */
    public final Object a(int i, Object obj, Object obj2) {
        switch (C0833ea.a[i - 1]) {
            case 1:
                return new C0837fa();
            case 2:
                return new a(null);
            case 3:
                return C0889sb.a((C0835ec) zzjy, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0003\u0000\u0001\b\u0000\u0002\u001b\u0003\t\u0001\u0004\u001b\u0005\u001b", new Object[]{"zzie", "zzjt", "zzjv", W.class, "zzju", "zzjw", P.class, "zzjx", C0853ja.class});
            case 4:
                return zzjy;
            case 5:
                C0875oc<C0837fa> ocVar = zzij;
                if (ocVar == null) {
                    synchronized (C0837fa.class) {
                        ocVar = zzij;
                        if (ocVar == null) {
                            ocVar = new com.google.android.gms.internal.firebase-perf.C0889sb.a<>(zzjy);
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
