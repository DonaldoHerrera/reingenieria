package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.C0755ga.e;
import java.util.List;

public final class gc extends C0755ga<gc, a> implements Na {
    private static volatile Va<gc> zzbg;
    /* access modifiers changed from: private */
    public static final gc zzbir = new gc();
    private C0770la<b> zzbiq = C0755ga.h();

    public static final class a extends com.google.android.gms.internal.clearcut.C0755ga.a<gc, a> implements Na {
        private a() {
            super(gc.zzbir);
        }

        /* synthetic */ a(hc hcVar) {
            this();
        }
    }

    public static final class b extends C0755ga<b, a> implements Na {
        private static volatile Va<b> zzbg;
        /* access modifiers changed from: private */
        public static final b zzbiv = new b();
        private int zzbb;
        private String zzbis = "";
        private long zzbit;
        private long zzbiu;
        private int zzya;

        public static final class a extends com.google.android.gms.internal.clearcut.C0755ga.a<b, a> implements Na {
            private a() {
                super(b.zzbiv);
            }

            /* synthetic */ a(hc hcVar) {
                this();
            }

            public final a a(long j) {
                e();
                ((b) this.b).a(j);
                return this;
            }

            public final a a(String str) {
                e();
                ((b) this.b).a(str);
                return this;
            }

            public final a b(long j) {
                e();
                ((b) this.b).b(j);
                return this;
            }
        }

        static {
            C0755ga.a(b.class, zzbiv);
        }

        private b() {
        }

        /* access modifiers changed from: private */
        public final void a(long j) {
            this.zzbb |= 4;
            this.zzbit = j;
        }

        /* access modifiers changed from: private */
        public final void a(String str) {
            if (str != null) {
                this.zzbb |= 2;
                this.zzbis = str;
                return;
            }
            throw new NullPointerException();
        }

        /* access modifiers changed from: private */
        public final void b(long j) {
            this.zzbb |= 8;
            this.zzbiu = j;
        }

        public static a p() {
            return (a) zzbiv.a(e.e, null, null);
        }

        /* JADX WARNING: type inference failed for: r2v9, types: [com.google.android.gms.internal.clearcut.Va<com.google.android.gms.internal.clearcut.gc$b>] */
        /* JADX WARNING: type inference failed for: r2v10, types: [java.lang.Object] */
        /* JADX WARNING: type inference failed for: r2v12, types: [com.google.android.gms.internal.clearcut.Va<com.google.android.gms.internal.clearcut.gc$b>] */
        /* JADX WARNING: type inference failed for: r2v13 */
        /* JADX WARNING: type inference failed for: r2v14, types: [com.google.android.gms.internal.clearcut.Va<com.google.android.gms.internal.clearcut.gc$b>, com.google.android.gms.internal.clearcut.ga$b] */
        /* JADX WARNING: type inference failed for: r2v17 */
        /* JADX WARNING: type inference failed for: r2v18 */
        /* access modifiers changed from: protected */
        /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r2v13
  assigns: []
  uses: []
  mth insns count: 46
        	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
        	at java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
        	at java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
        	at jadx.core.ProcessClass.process(ProcessClass.java:30)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
         */
        /* JADX WARNING: Unknown variable types count: 3 */
        public final Object a(int i, Object obj, Object obj2) {
            ? r2;
            switch (hc.a[i - 1]) {
                case 1:
                    return new b();
                case 2:
                    return new a(null);
                case 3:
                    return C0755ga.a((La) zzbiv, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0005\u0000\u0000\u0000\u0001\u0004\u0000\u0002\b\u0001\u0003\u0002\u0002\u0004\u0002\u0003", new Object[]{"zzbb", "zzya", "zzbis", "zzbit", "zzbiu"});
                case 4:
                    return zzbiv;
                case 5:
                    ? r22 = zzbg;
                    if (r22 == 0) {
                        synchronized (b.class) {
                            r2 = zzbg;
                            if (r2 == 0) {
                                ? bVar = new com.google.android.gms.internal.clearcut.C0755ga.b(zzbiv);
                                zzbg = bVar;
                                r2 = bVar;
                            }
                        }
                        r22 = r2;
                    }
                    return r22;
                case 6:
                    return Byte.valueOf(1);
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public final int k() {
            return this.zzya;
        }

        public final boolean l() {
            return (this.zzbb & 1) == 1;
        }

        public final String m() {
            return this.zzbis;
        }

        public final long n() {
            return this.zzbit;
        }

        public final long o() {
            return this.zzbiu;
        }
    }

    static {
        C0755ga.a(gc.class, zzbir);
    }

    private gc() {
    }

    public static gc a(byte[] bArr) throws C0773ma {
        return (gc) C0755ga.a(zzbir, bArr);
    }

    public static gc l() {
        return zzbir;
    }

    /* JADX WARNING: type inference failed for: r2v9, types: [com.google.android.gms.internal.clearcut.Va<com.google.android.gms.internal.clearcut.gc>] */
    /* JADX WARNING: type inference failed for: r2v10, types: [java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v12, types: [com.google.android.gms.internal.clearcut.Va<com.google.android.gms.internal.clearcut.gc>] */
    /* JADX WARNING: type inference failed for: r2v13 */
    /* JADX WARNING: type inference failed for: r2v14, types: [com.google.android.gms.internal.clearcut.Va<com.google.android.gms.internal.clearcut.gc>, com.google.android.gms.internal.clearcut.ga$b] */
    /* JADX WARNING: type inference failed for: r2v17 */
    /* JADX WARNING: type inference failed for: r2v18 */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r2v13
  assigns: []
  uses: []
  mth insns count: 40
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Unknown variable types count: 3 */
    public final Object a(int i, Object obj, Object obj2) {
        ? r2;
        switch (hc.a[i - 1]) {
            case 1:
                return new gc();
            case 2:
                return new a(null);
            case 3:
                return C0755ga.a((La) zzbir, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0002\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzbiq", b.class});
            case 4:
                return zzbir;
            case 5:
                ? r22 = zzbg;
                if (r22 == 0) {
                    synchronized (gc.class) {
                        r2 = zzbg;
                        if (r2 == 0) {
                            ? bVar = new com.google.android.gms.internal.clearcut.C0755ga.b(zzbir);
                            zzbg = bVar;
                            r2 = bVar;
                        }
                    }
                    r22 = r2;
                }
                return r22;
            case 6:
                return Byte.valueOf(1);
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final List<b> k() {
        return this.zzbiq;
    }
}
