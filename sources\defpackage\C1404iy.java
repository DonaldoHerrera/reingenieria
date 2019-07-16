package defpackage;

/* renamed from: iy reason: default package and case insensitive filesystem */
public final class C1404iy extends C0197Cw<C1404iy, a> implements C1465kx {
    private static volatile C1650qx<C1404iy> zzml;
    /* access modifiers changed from: private */
    public static final C1404iy zzzp = new C1404iy();
    private String zzzo = "";

    /* renamed from: iy$a */
    public static final class a extends b<C1404iy, a> implements C1465kx {
        private a() {
            super(C1404iy.zzzp);
        }

        /* synthetic */ a(C1466ky kyVar) {
            this();
        }
    }

    static {
        C0197Cw.a(C1404iy.class, zzzp);
    }

    private C1404iy() {
    }

    /* JADX WARNING: type inference failed for: r1v8, types: [qx<iy>] */
    /* JADX WARNING: type inference failed for: r1v9, types: [java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v11, types: [qx<iy>] */
    /* JADX WARNING: type inference failed for: r1v12 */
    /* JADX WARNING: type inference failed for: r1v13, types: [Cw$a, qx<iy>] */
    /* JADX WARNING: type inference failed for: r1v16 */
    /* JADX WARNING: type inference failed for: r1v17 */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r1v12
  assigns: []
  uses: []
  mth insns count: 38
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
        ? r1;
        switch (C1466ky.a[i - 1]) {
            case 1:
                return new C1404iy();
            case 2:
                return new a(null);
            case 3:
                return C0197Cw.a((C1403ix) zzzp, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"zzzo"});
            case 4:
                return zzzp;
            case 5:
                ? r12 = zzml;
                if (r12 == 0) {
                    synchronized (C1404iy.class) {
                        r1 = zzml;
                        if (r1 == 0) {
                            ? aVar = new defpackage.C0197Cw.a(zzzp);
                            zzml = aVar;
                            r1 = aVar;
                        }
                    }
                    r12 = r1;
                }
                return r12;
            case 6:
                return Byte.valueOf(1);
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
