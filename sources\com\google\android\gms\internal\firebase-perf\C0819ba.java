package com.google.android.gms.internal.firebase-perf;

import com.google.android.gms.internal.firebase-perf.C0889sb.b;

/* renamed from: com.google.android.gms.internal.firebase-perf.ba reason: case insensitive filesystem */
public final class C0819ba extends C0889sb<C0819ba, a> implements C0843gc {
    private static volatile C0875oc<C0819ba> zzij;
    /* access modifiers changed from: private */
    public static final C0819ba zzjs;
    private int zzie;
    private String zzjm = "";
    private int zzjn;
    private int zzjo;
    private int zzjp;
    private int zzjq;
    private int zzjr;

    /* renamed from: com.google.android.gms.internal.firebase-perf.ba$a */
    public static final class a extends b<C0819ba, a> implements C0843gc {
        private a() {
            super(C0819ba.zzjs);
        }

        public final a a(String str) {
            h();
            ((C0819ba) this.b).a(str);
            return this;
        }

        public final a b(int i) {
            h();
            ((C0819ba) this.b).c(i);
            return this;
        }

        public final a c(int i) {
            h();
            ((C0819ba) this.b).d(i);
            return this;
        }

        /* synthetic */ a(C0829da daVar) {
            this();
        }

        public final a a(int i) {
            h();
            ((C0819ba) this.b).b(i);
            return this;
        }
    }

    static {
        C0819ba baVar = new C0819ba();
        zzjs = baVar;
        C0889sb.a(C0819ba.class, baVar);
    }

    private C0819ba() {
    }

    /* access modifiers changed from: private */
    public final void a(String str) {
        if (str != null) {
            this.zzie |= 1;
            this.zzjm = str;
            return;
        }
        throw new NullPointerException();
    }

    /* access modifiers changed from: private */
    public final void b(int i) {
        this.zzie |= 8;
        this.zzjp = i;
    }

    /* access modifiers changed from: private */
    public final void c(int i) {
        this.zzie |= 16;
        this.zzjq = i;
    }

    /* access modifiers changed from: private */
    public final void d(int i) {
        this.zzie |= 32;
        this.zzjr = i;
    }

    public static a p() {
        return (a) zzjs.k();
    }

    public static C0819ba q() {
        return zzjs;
    }

    public final boolean o() {
        return (this.zzie & 16) != 0;
    }

    /* access modifiers changed from: protected */
    public final Object a(int i, Object obj, Object obj2) {
        switch (C0829da.a[i - 1]) {
            case 1:
                return new C0819ba();
            case 2:
                return new a(null);
            case 3:
                return C0889sb.a((C0835ec) zzjs, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\b\u0000\u0002\u0004\u0001\u0003\u0004\u0003\u0004\u0004\u0004\u0005\u0004\u0005\u0006\u0004\u0002", new Object[]{"zzie", "zzjm", "zzjn", "zzjp", "zzjq", "zzjr", "zzjo"});
            case 4:
                return zzjs;
            case 5:
                C0875oc<C0819ba> ocVar = zzij;
                if (ocVar == null) {
                    synchronized (C0819ba.class) {
                        ocVar = zzij;
                        if (ocVar == null) {
                            ocVar = new com.google.android.gms.internal.firebase-perf.C0889sb.a<>(zzjs);
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
