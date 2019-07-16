package defpackage;

import java.util.List;

/* renamed from: Fv reason: default package */
public final class Fv extends C0197Cw<Fv, a> implements C1465kx {
    /* access modifiers changed from: private */
    public static final Fv zzmk = new Fv();
    private static volatile C1650qx<Fv> zzml;
    private int zzmg;
    private C0213Hw<C0216Iv> zzmh = C0197Cw.f();
    private long zzmi;
    private C0213Hw<C0289Zv> zzmj = C0197Cw.f();

    /* renamed from: Fv$a */
    public static final class a extends b<Fv, a> implements C1465kx {
        private a() {
            super(Fv.zzmk);
        }

        /* synthetic */ a(Ev ev) {
            this();
        }
    }

    static {
        C0197Cw.a(Fv.class, zzmk);
    }

    private Fv() {
    }

    public static Fv l() {
        return zzmk;
    }

    /* JADX WARNING: type inference failed for: r2v9, types: [qx<Fv>] */
    /* JADX WARNING: type inference failed for: r2v10, types: [java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v12, types: [qx<Fv>] */
    /* JADX WARNING: type inference failed for: r2v13 */
    /* JADX WARNING: type inference failed for: r2v14, types: [Cw$a, qx<Fv>] */
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
                return new Fv();
            case 2:
                return new a(null);
            case 3:
                return C0197Cw.a((C1403ix) zzmk, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001\u001b\u0002\u0005\u0000\u0003\u001c", new Object[]{"zzmg", "zzmh", C0216Iv.class, "zzmi", "zzmj"});
            case 4:
                return zzmk;
            case 5:
                ? r22 = zzml;
                if (r22 == 0) {
                    synchronized (Fv.class) {
                        r2 = zzml;
                        if (r2 == 0) {
                            ? aVar = new defpackage.C0197Cw.a(zzmk);
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

    public final long g() {
        return this.zzmi;
    }

    public final List<C0216Iv> j() {
        return this.zzmh;
    }

    public final List<C0289Zv> k() {
        return this.zzmj;
    }
}
