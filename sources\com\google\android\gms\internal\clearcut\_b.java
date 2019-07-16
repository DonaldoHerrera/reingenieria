package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.C0755ga.b;

public final class _b extends C0755ga<_b, a> implements Na {
    private static volatile Va<_b> zzbg;
    /* access modifiers changed from: private */
    public static final _b zztx = new _b();
    private int zzbb;
    private int zztu;
    private String zztv;
    private String zztw;

    public static final class a extends com.google.android.gms.internal.clearcut.C0755ga.a<_b, a> implements Na {
        private a() {
            super(_b.zztx);
        }

        /* synthetic */ a(cc ccVar) {
            this();
        }
    }

    static {
        C0755ga.a(_b.class, zztx);
    }

    private _b() {
        String str = "";
        this.zztv = str;
        this.zztw = str;
    }

    /* JADX WARNING: type inference failed for: r2v9, types: [com.google.android.gms.internal.clearcut.Va<com.google.android.gms.internal.clearcut._b>] */
    /* JADX WARNING: type inference failed for: r2v10, types: [java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v12, types: [com.google.android.gms.internal.clearcut.Va<com.google.android.gms.internal.clearcut._b>] */
    /* JADX WARNING: type inference failed for: r2v13 */
    /* JADX WARNING: type inference failed for: r2v14, types: [com.google.android.gms.internal.clearcut.Va<com.google.android.gms.internal.clearcut._b>, com.google.android.gms.internal.clearcut.ga$b] */
    /* JADX WARNING: type inference failed for: r2v17 */
    /* JADX WARNING: type inference failed for: r2v18 */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r2v13
  assigns: []
  uses: []
  mth insns count: 44
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
        switch (cc.a[i - 1]) {
            case 1:
                return new _b();
            case 2:
                return new a(null);
            case 3:
                return C0755ga.a((La) zztx, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0004\u0000\u0000\u0000\u0001\u0004\u0000\u0002\b\u0001\u0003\b\u0002", new Object[]{"zzbb", "zztu", "zztv", "zztw"});
            case 4:
                return zztx;
            case 5:
                ? r22 = zzbg;
                if (r22 == 0) {
                    synchronized (_b.class) {
                        r2 = zzbg;
                        if (r2 == 0) {
                            ? bVar = new b(zztx);
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
}
