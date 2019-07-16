package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: Jv reason: default package and case insensitive filesystem */
public final class C0220Jv extends C0197Cw<C0220Jv, a> implements C1465kx {
    private static volatile C1650qx<C0220Jv> zzml;
    /* access modifiers changed from: private */
    public static final C0220Jv zznb = new C0220Jv();
    private int zzmg;
    private Fv zzmw;
    private Fv zzmx;
    private Fv zzmy;
    private C0212Hv zzmz;
    private C0213Hw<C0224Kv> zzna = C0197Cw.f();

    /* renamed from: Jv$a */
    public static final class a extends b<C0220Jv, a> implements C1465kx {
        private a() {
            super(C0220Jv.zznb);
        }

        /* synthetic */ a(Ev ev) {
            this();
        }
    }

    static {
        C0197Cw.a(C0220Jv.class, zznb);
    }

    private C0220Jv() {
    }

    public static C0220Jv a(InputStream inputStream) throws IOException {
        return (C0220Jv) C0197Cw.a(zznb, inputStream);
    }

    public final Fv g() {
        Fv fv = this.zzmw;
        return fv == null ? Fv.l() : fv;
    }

    public final Fv j() {
        Fv fv = this.zzmx;
        return fv == null ? Fv.l() : fv;
    }

    public final Fv k() {
        Fv fv = this.zzmy;
        return fv == null ? Fv.l() : fv;
    }

    /* JADX WARNING: type inference failed for: r2v9, types: [qx<Jv>] */
    /* JADX WARNING: type inference failed for: r2v10, types: [java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v12, types: [qx<Jv>] */
    /* JADX WARNING: type inference failed for: r2v13 */
    /* JADX WARNING: type inference failed for: r2v14, types: [Cw$a, qx<Jv>] */
    /* JADX WARNING: type inference failed for: r2v17 */
    /* JADX WARNING: type inference failed for: r2v18 */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r2v13
  assigns: []
  uses: []
  mth insns count: 50
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
                return new C0220Jv();
            case 2:
                return new a(null);
            case 3:
                return C0197Cw.a((C1403ix) zznb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\t\u0000\u0002\t\u0001\u0003\t\u0002\u0004\t\u0003\u0005\u001b", new Object[]{"zzmg", "zzmw", "zzmx", "zzmy", "zzmz", "zzna", C0224Kv.class});
            case 4:
                return zznb;
            case 5:
                ? r22 = zzml;
                if (r22 == 0) {
                    synchronized (C0220Jv.class) {
                        r2 = zzml;
                        if (r2 == 0) {
                            ? aVar = new defpackage.C0197Cw.a(zznb);
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
