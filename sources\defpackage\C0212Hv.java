package defpackage;

/* renamed from: Hv reason: default package and case insensitive filesystem */
public final class C0212Hv extends C0197Cw<C0212Hv, a> implements C1465kx {
    private static volatile C1650qx<C0212Hv> zzml;
    /* access modifiers changed from: private */
    public static final C0212Hv zzms = new C0212Hv();
    private int zzmg;
    private int zzmp;
    private boolean zzmq;
    private long zzmr;

    /* renamed from: Hv$a */
    public static final class a extends b<C0212Hv, a> implements C1465kx {
        private a() {
            super(C0212Hv.zzms);
        }

        /* synthetic */ a(Ev ev) {
            this();
        }
    }

    static {
        C0197Cw.a(C0212Hv.class, zzms);
    }

    private C0212Hv() {
    }

    /* JADX WARNING: type inference failed for: r2v9, types: [qx<Hv>] */
    /* JADX WARNING: type inference failed for: r2v10, types: [java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v12, types: [qx<Hv>] */
    /* JADX WARNING: type inference failed for: r2v13 */
    /* JADX WARNING: type inference failed for: r2v14, types: [Cw$a, qx<Hv>] */
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
        switch (Ev.a[i - 1]) {
            case 1:
                return new C0212Hv();
            case 2:
                return new a(null);
            case 3:
                return C0197Cw.a((C1403ix) zzms, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0000\u0002\u0007\u0001\u0003\u0005\u0002", new Object[]{"zzmg", "zzmp", "zzmq", "zzmr"});
            case 4:
                return zzms;
            case 5:
                ? r22 = zzml;
                if (r22 == 0) {
                    synchronized (C0212Hv.class) {
                        r2 = zzml;
                        if (r2 == 0) {
                            ? aVar = new defpackage.C0197Cw.a(zzms);
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
}
