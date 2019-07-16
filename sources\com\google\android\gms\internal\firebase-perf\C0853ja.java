package com.google.android.gms.internal.firebase-perf;

import com.google.android.gms.internal.firebase-perf.C0889sb.b;

/* renamed from: com.google.android.gms.internal.firebase-perf.ja reason: case insensitive filesystem */
public final class C0853ja extends C0889sb<C0853ja, a> implements C0843gc {
    private static volatile C0875oc<C0853ja> zzij;
    /* access modifiers changed from: private */
    public static final C0853ja zzkf;
    private int zzie;
    private long zzik;
    private int zzkd;
    private int zzke;

    /* renamed from: com.google.android.gms.internal.firebase-perf.ja$a */
    public static final class a extends b<C0853ja, a> implements C0843gc {
        private a() {
            super(C0853ja.zzkf);
        }

        /* synthetic */ a(C0849ia iaVar) {
            this();
        }
    }

    static {
        C0853ja jaVar = new C0853ja();
        zzkf = jaVar;
        C0889sb.a(C0853ja.class, jaVar);
    }

    private C0853ja() {
    }

    /* access modifiers changed from: protected */
    public final Object a(int i, Object obj, Object obj2) {
        switch (C0849ia.a[i - 1]) {
            case 1:
                return new C0853ja();
            case 2:
                return new a(null);
            case 3:
                return C0889sb.a((C0835ec) zzkf, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0002\u0000\u0002\u0004\u0001\u0003\u0004\u0002", new Object[]{"zzie", "zzik", "zzkd", "zzke"});
            case 4:
                return zzkf;
            case 5:
                C0875oc<C0853ja> ocVar = zzij;
                if (ocVar == null) {
                    synchronized (C0853ja.class) {
                        ocVar = zzij;
                        if (ocVar == null) {
                            ocVar = new com.google.android.gms.internal.firebase-perf.C0889sb.a<>(zzkf);
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
