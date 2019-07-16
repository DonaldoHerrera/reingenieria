package defpackage;

/* renamed from: jy reason: default package and case insensitive filesystem */
public final class C1435jy extends C0197Cw<C1435jy, a> implements C1465kx {
    /* access modifiers changed from: private */
    public static final C1435jy zzaac = new C1435jy();
    private static volatile C1650qx<C1435jy> zzml;
    private int zzaaa;
    private C0213Hw<C1404iy> zzaab = C0197Cw.f();
    private String zzzo;
    private String zzzq;
    private long zzzr;
    private String zzzs;
    private long zzzt;
    private long zzzu;
    private String zzzv;
    private String zzzw;
    private String zzzx;
    private String zzzy;
    private String zzzz;

    /* renamed from: jy$a */
    public static final class a extends b<C1435jy, a> implements C1465kx {
        private a() {
            super(C1435jy.zzaac);
        }

        /* synthetic */ a(C1466ky kyVar) {
            this();
        }
    }

    static {
        C0197Cw.a(C1435jy.class, zzaac);
    }

    private C1435jy() {
        String str = "";
        this.zzzo = str;
        this.zzzq = str;
        this.zzzs = str;
        this.zzzv = str;
        this.zzzw = str;
        this.zzzx = str;
        this.zzzy = str;
        this.zzzz = str;
    }

    public static C1435jy a(byte[] bArr) throws C0225Kw {
        return (C1435jy) C0197Cw.a(zzaac, bArr);
    }

    public final String g() {
        return this.zzzo;
    }

    public final String j() {
        return this.zzzq;
    }

    public final long k() {
        return this.zzzr;
    }

    public final String l() {
        return this.zzzs;
    }

    public final long m() {
        return this.zzzt;
    }

    public final long n() {
        return this.zzzu;
    }

    /* JADX WARNING: type inference failed for: r2v9, types: [qx<jy>] */
    /* JADX WARNING: type inference failed for: r2v10, types: [java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v12, types: [qx<jy>] */
    /* JADX WARNING: type inference failed for: r2v13 */
    /* JADX WARNING: type inference failed for: r2v14, types: [Cw$a, qx<jy>] */
    /* JADX WARNING: type inference failed for: r2v17 */
    /* JADX WARNING: type inference failed for: r2v18 */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r2v13
  assigns: []
  uses: []
  mth insns count: 64
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
        switch (C1466ky.a[i - 1]) {
            case 1:
                return new C1435jy();
            case 2:
                return new a(null);
            case 3:
                return C0197Cw.a((C1403ix) zzaac, "\u0000\r\u0000\u0000\u0001\r\r\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003\u0002\u0004Ȉ\u0005\u0002\u0006\u0002\u0007Ȉ\bȈ\tȈ\nȈ\u000bȈ\f\f\r\u001b", new Object[]{"zzzo", "zzzq", "zzzr", "zzzs", "zzzt", "zzzu", "zzzv", "zzzw", "zzzx", "zzzy", "zzzz", "zzaaa", "zzaab", C1404iy.class});
            case 4:
                return zzaac;
            case 5:
                ? r22 = zzml;
                if (r22 == 0) {
                    synchronized (C1435jy.class) {
                        r2 = zzml;
                        if (r2 == 0) {
                            ? aVar = new defpackage.C0197Cw.a(zzaac);
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
