package defpackage;

import java.util.List;

/* renamed from: Iv reason: default package and case insensitive filesystem */
public final class C0216Iv extends C0197Cw<C0216Iv, a> implements C1465kx {
    private static volatile C1650qx<C0216Iv> zzml;
    /* access modifiers changed from: private */
    public static final C0216Iv zzmv = new C0216Iv();
    private int zzmg;
    private String zzmt = "";
    private C0213Hw<Gv> zzmu = C0197Cw.f();

    /* renamed from: Iv$a */
    public static final class a extends b<C0216Iv, a> implements C1465kx {
        private a() {
            super(C0216Iv.zzmv);
        }

        /* synthetic */ a(Ev ev) {
            this();
        }
    }

    static {
        C0197Cw.a(C0216Iv.class, zzmv);
    }

    private C0216Iv() {
    }

    /* JADX WARNING: type inference failed for: r2v9, types: [qx<Iv>] */
    /* JADX WARNING: type inference failed for: r2v10, types: [java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v12, types: [qx<Iv>] */
    /* JADX WARNING: type inference failed for: r2v13 */
    /* JADX WARNING: type inference failed for: r2v14, types: [Cw$a, qx<Iv>] */
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
    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
    	at java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Unknown variable types count: 3 */
    public final Object a(int i, Object obj, Object obj2) {
        ? r2;
        switch (Ev.a[i - 1]) {
            case 1:
                return new C0216Iv();
            case 2:
                return new a(null);
            case 3:
                return C0197Cw.a((C1403ix) zzmv, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\b\u0000\u0002\u001b", new Object[]{"zzmg", "zzmt", "zzmu", Gv.class});
            case 4:
                return zzmv;
            case 5:
                ? r22 = zzml;
                if (r22 == 0) {
                    synchronized (C0216Iv.class) {
                        r2 = zzml;
                        if (r2 == 0) {
                            ? aVar = new defpackage.C0197Cw.a(zzmv);
                            zzml = aVar;
                            r2 = aVar;
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

    public final String g() {
        return this.zzmt;
    }

    public final List<Gv> j() {
        return this.zzmu;
    }
}
