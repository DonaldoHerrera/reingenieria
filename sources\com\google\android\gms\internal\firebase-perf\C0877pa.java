package com.google.android.gms.internal.firebase-perf;

import com.google.android.gms.internal.firebase-perf.C0889sb.b;

/* renamed from: com.google.android.gms.internal.firebase-perf.pa reason: case insensitive filesystem */
public final class C0877pa extends C0889sb<C0877pa, a> implements C0843gc {
    private static volatile C0875oc<C0877pa> zzij;
    /* access modifiers changed from: private */
    public static final C0877pa zzll;
    private int zzie;
    private T zzlh;
    private Da zzli;
    private C0857ka zzlj;
    private C0837fa zzlk;

    /* renamed from: com.google.android.gms.internal.firebase-perf.pa$a */
    public static final class a extends b<C0877pa, a> implements C0843gc {
        private a() {
            super(C0877pa.zzll);
        }

        public final a a(T.b bVar) {
            h();
            ((C0877pa) this.b).a(bVar);
            return this;
        }

        /* synthetic */ a(C0884ra raVar) {
            this();
        }

        public final a a(Da da) {
            h();
            ((C0877pa) this.b).a(da);
            return this;
        }

        public final a a(C0857ka kaVar) {
            h();
            ((C0877pa) this.b).a(kaVar);
            return this;
        }

        public final a a(C0837fa faVar) {
            h();
            ((C0877pa) this.b).a(faVar);
            return this;
        }
    }

    static {
        C0877pa paVar = new C0877pa();
        zzll = paVar;
        C0889sb.a(C0877pa.class, paVar);
    }

    private C0877pa() {
    }

    /* access modifiers changed from: private */
    public final void a(T.b bVar) {
        this.zzlh = (T) bVar.b();
        this.zzie |= 1;
    }

    public static a w() {
        return (a) zzll.k();
    }

    public final boolean o() {
        return (this.zzie & 1) != 0;
    }

    public final T p() {
        T t = this.zzlh;
        return t == null ? T.u() : t;
    }

    public final boolean q() {
        return (this.zzie & 2) != 0;
    }

    public final Da r() {
        Da da = this.zzli;
        return da == null ? Da.x() : da;
    }

    public final boolean s() {
        return (this.zzie & 4) != 0;
    }

    public final C0857ka t() {
        C0857ka kaVar = this.zzlj;
        return kaVar == null ? C0857ka.H() : kaVar;
    }

    public final boolean u() {
        return (this.zzie & 8) != 0;
    }

    public final C0837fa v() {
        C0837fa faVar = this.zzlk;
        return faVar == null ? C0837fa.v() : faVar;
    }

    /* access modifiers changed from: private */
    public final void a(Da da) {
        if (da != null) {
            this.zzli = da;
            this.zzie |= 2;
            return;
        }
        throw new NullPointerException();
    }

    /* access modifiers changed from: private */
    public final void a(C0857ka kaVar) {
        if (kaVar != null) {
            this.zzlj = kaVar;
            this.zzie |= 4;
            return;
        }
        throw new NullPointerException();
    }

    /* access modifiers changed from: private */
    public final void a(C0837fa faVar) {
        if (faVar != null) {
            this.zzlk = faVar;
            this.zzie |= 8;
            return;
        }
        throw new NullPointerException();
    }

    /* access modifiers changed from: protected */
    public final Object a(int i, Object obj, Object obj2) {
        switch (C0884ra.a[i - 1]) {
            case 1:
                return new C0877pa();
            case 2:
                return new a(null);
            case 3:
                return C0889sb.a((C0835ec) zzll, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0000\u0002\t\u0001\u0003\t\u0002\u0004\t\u0003", new Object[]{"zzie", "zzlh", "zzli", "zzlj", "zzlk"});
            case 4:
                return zzll;
            case 5:
                C0875oc<C0877pa> ocVar = zzij;
                if (ocVar == null) {
                    synchronized (C0877pa.class) {
                        ocVar = zzij;
                        if (ocVar == null) {
                            ocVar = new com.google.android.gms.internal.firebase-perf.C0889sb.a<>(zzll);
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
