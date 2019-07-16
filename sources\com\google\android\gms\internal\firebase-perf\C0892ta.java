package com.google.android.gms.internal.firebase-perf;

import com.google.android.gms.internal.firebase-perf.C0889sb.b;

/* renamed from: com.google.android.gms.internal.firebase-perf.ta reason: case insensitive filesystem */
public final class C0892ta extends C0889sb<C0892ta, a> implements C0843gc {
    private static volatile C0875oc<C0892ta> zzij;
    private static final Bb<Integer, C0908xa> zzln = new C0888sa();
    /* access modifiers changed from: private */
    public static final C0892ta zzlo;
    private int zzie;
    private String zzjt = "";
    private C0913yb zzlm = C0889sb.m();

    /* renamed from: com.google.android.gms.internal.firebase-perf.ta$a */
    public static final class a extends b<C0892ta, a> implements C0843gc {
        private a() {
            super(C0892ta.zzlo);
        }

        public final a a(String str) {
            h();
            ((C0892ta) this.b).a(str);
            return this;
        }

        /* synthetic */ a(C0888sa saVar) {
            this();
        }

        public final a a(C0908xa xaVar) {
            h();
            ((C0892ta) this.b).a(xaVar);
            return this;
        }
    }

    static {
        C0892ta taVar = new C0892ta();
        zzlo = taVar;
        C0889sb.a(C0892ta.class, taVar);
    }

    private C0892ta() {
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

    public static a p() {
        return (a) zzlo.k();
    }

    public final C0908xa b(int i) {
        return (C0908xa) zzln.convert(Integer.valueOf(this.zzlm.getInt(0)));
    }

    public final int o() {
        return this.zzlm.size();
    }

    /* access modifiers changed from: private */
    public final void a(C0908xa xaVar) {
        if (xaVar != null) {
            if (!this.zzlm.L()) {
                C0913yb ybVar = this.zzlm;
                int size = ybVar.size();
                this.zzlm = ybVar.g(size == 0 ? 10 : size << 1);
            }
            this.zzlm.f(xaVar.k());
            return;
        }
        throw new NullPointerException();
    }

    /* access modifiers changed from: protected */
    public final Object a(int i, Object obj, Object obj2) {
        switch (C0896ua.a[i - 1]) {
            case 1:
                return new C0892ta();
            case 2:
                return new a(null);
            case 3:
                return C0889sb.a((C0835ec) zzlo, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\b\u0000\u0002\u001e", new Object[]{"zzie", "zzjt", "zzlm", C0908xa.a()});
            case 4:
                return zzlo;
            case 5:
                C0875oc<C0892ta> ocVar = zzij;
                if (ocVar == null) {
                    synchronized (C0892ta.class) {
                        ocVar = zzij;
                        if (ocVar == null) {
                            ocVar = new com.google.android.gms.internal.firebase-perf.C0889sb.a<>(zzlo);
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
