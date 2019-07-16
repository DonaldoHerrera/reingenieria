package defpackage;

/* renamed from: Gv reason: default package */
public final class Gv extends C0197Cw<Gv, a> implements C1465kx {
    private static volatile C1650qx<Gv> zzml;
    /* access modifiers changed from: private */
    public static final Gv zzmo = new Gv();
    private int zzmg;
    private String zzmm = "";
    private C0289Zv zzmn = C0289Zv.a;

    /* renamed from: Gv$a */
    public static final class a extends b<Gv, a> implements C1465kx {
        private a() {
            super(Gv.zzmo);
        }

        /* synthetic */ a(Ev ev) {
            this();
        }
    }

    static {
        C0197Cw.a(Gv.class, zzmo);
    }

    private Gv() {
    }

    /* JADX WARNING: type inference failed for: r2v9, types: [qx<Gv>] */
    /* JADX WARNING: type inference failed for: r2v10, types: [java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v12, types: [qx<Gv>] */
    /* JADX WARNING: type inference failed for: r2v13 */
    /* JADX WARNING: type inference failed for: r2v14, types: [Cw$a, qx<Gv>] */
    /* JADX WARNING: type inference failed for: r2v17 */
    /* JADX WARNING: type inference failed for: r2v18 */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r2v13
  assigns: []
  uses: []
  mth insns count: 42
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
                return new Gv();
            case 2:
                return new a(null);
            case 3:
                return C0197Cw.a((C1403ix) zzmo, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\b\u0000\u0002\n\u0001", new Object[]{"zzmg", "zzmm", "zzmn"});
            case 4:
                return zzmo;
            case 5:
                ? r22 = zzml;
                if (r22 == 0) {
                    synchronized (Gv.class) {
                        r2 = zzml;
                        if (r2 == 0) {
                            ? aVar = new defpackage.C0197Cw.a(zzmo);
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
        return this.zzmm;
    }

    public final C0289Zv j() {
        return this.zzmn;
    }
}
