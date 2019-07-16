package defpackage;

import java.util.List;

/* renamed from: vfb reason: default package and case insensitive filesystem */
/* compiled from: TypeAliasConstructorDescriptor.kt */
public final class C7548vfb extends _eb implements C7479ufb {
    static final /* synthetic */ DZa[] D = {HYa.a((DYa) new EYa(HYa.a(C7548vfb.class), "withDispatchReceiver", "getWithDispatchReceiver()Lorg/jetbrains/kotlin/descriptors/impl/TypeAliasConstructorDescriptor;"))};
    public static final a E = new a(null);
    private final Qsb F;
    private C4997Icb G;
    private final Ssb H;
    private final C4874Edb I;

    /* renamed from: vfb$a */
    /* compiled from: TypeAliasConstructorDescriptor.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }

        /* access modifiers changed from: private */
        public final _tb a(C4874Edb edb) {
            if (edb.A() == null) {
                return null;
            }
            return _tb.a((C7706xtb) edb.fa());
        }

        public final C7479ufb a(Ssb ssb, C4874Edb edb, C4997Icb icb) {
            C4874Edb edb2 = edb;
            C4997Icb icb2 = icb;
            C7471uYa.b(ssb, "storageManager");
            C7471uYa.b(edb2, "typeAliasDescriptor");
            C7471uYa.b(icb2, "constructor");
            _tb a = a(edb2);
            C7615wdb wdb = null;
            if (a != null) {
                C4997Icb a2 = icb2.a(a);
                if (a2 != null) {
                    C6723jeb annotations = icb.getAnnotations();
                    defpackage.C4935Gcb.a g = icb.g();
                    C7471uYa.a((Object) g, "constructor.kind");
                    C7822zdb source = edb.getSource();
                    C7471uYa.a((Object) source, "typeAliasDescriptor.source");
                    C7548vfb vfb = new C7548vfb(ssb, edb, a2, null, annotations, g, source, null);
                    List a3 = _eb.a(vfb, icb.f(), a);
                    if (a3 != null) {
                        C7471uYa.a((Object) a3, "FunctionDescriptorImpl.g…         ) ?: return null");
                        Etb c = C7430ttb.c(a2.a().Ba());
                        Etb z = edb.z();
                        C7471uYa.a((Object) z, "typeAliasDescriptor.defaultType");
                        Etb a4 = Htb.a(c, z);
                        C7615wdb k = icb.k();
                        if (k != null) {
                            C7471uYa.a((Object) k, "it");
                            wdb = C6463fpb.a((C4904Fcb) vfb, a.a(k.getType(), C6473fub.INVARIANT), C6723jeb.c.a());
                        }
                        vfb.a(wdb, null, edb.B(), a3, a4, C6314ddb.FINAL, edb.d());
                        return vfb;
                    }
                }
            }
            return null;
        }
    }

    public /* synthetic */ C7548vfb(Ssb ssb, C4874Edb edb, C4997Icb icb, C7479ufb ufb, C6723jeb jeb, defpackage.C4935Gcb.a aVar, C7822zdb zdb, C7264rYa rya) {
        this(ssb, edb, icb, ufb, jeb, aVar, zdb);
    }

    public boolean S() {
        return W().S();
    }

    public C5029Jcb T() {
        C5029Jcb T = W().T();
        C7471uYa.a((Object) T, "underlyingConstructorDescriptor.constructedClass");
        return T;
    }

    public C4997Icb W() {
        return this.G;
    }

    public final Ssb ta() {
        return this.H;
    }

    public C4874Edb ua() {
        return this.I;
    }

    private C7548vfb(Ssb ssb, C4874Edb edb, C4997Icb icb, C7479ufb ufb, C6723jeb jeb, defpackage.C4935Gcb.a aVar, C7822zdb zdb) {
        super(edb, ufb, jeb, C7694xnb.d("<init>"), aVar, zdb);
        this.H = ssb;
        this.I = edb;
        a(ua().m());
        this.F = this.H.b((PXa<? extends T>) new C7617wfb<Object>(this, icb));
        this.G = icb;
    }

    public C4874Edb e() {
        return ua();
    }

    public C7479ufb getOriginal() {
        C5582adb original = super.getOriginal();
        if (original != null) {
            return (C7479ufb) original;
        }
        throw new OVa("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptor");
    }

    public C7706xtb a() {
        C7706xtb a2 = super.a();
        if (a2 != null) {
            return a2;
        }
        C7471uYa.a();
        throw null;
    }

    public C7479ufb a(_tb _tb) {
        C7471uYa.b(_tb, "substitutor");
        C5582adb a2 = super.a(_tb);
        if (a2 != null) {
            C7548vfb vfb = (C7548vfb) a2;
            _tb a3 = _tb.a(vfb.a());
            C7471uYa.a((Object) a3, "TypeSubstitutor.create(s…asConstructor.returnType)");
            C4997Icb a4 = W().getOriginal().a(a3);
            if (a4 == null) {
                return null;
            }
            vfb.G = a4;
            return vfb;
        }
        throw new OVa("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptorImpl");
    }

    public C7479ufb a(C5272Rcb rcb, C6314ddb ddb, C5583aeb aeb, defpackage.C4935Gcb.a aVar, boolean z) {
        C7471uYa.b(rcb, "newOwner");
        C7471uYa.b(ddb, "modality");
        C7471uYa.b(aeb, "visibility");
        C7471uYa.b(aVar, "kind");
        C5582adb build = x().a(rcb).a(ddb).a(aeb).a(aVar).a(z).build();
        if (build != null) {
            return (C7479ufb) build;
        }
        throw new OVa("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptor");
    }

    /* access modifiers changed from: protected */
    public C7548vfb a(C5272Rcb rcb, C5582adb adb, defpackage.C4935Gcb.a aVar, C7694xnb xnb, C6723jeb jeb, C7822zdb zdb) {
        C7471uYa.b(rcb, "newOwner");
        C7471uYa.b(aVar, "kind");
        C7471uYa.b(jeb, "annotations");
        C7471uYa.b(zdb, "source");
        boolean z = false;
        boolean z2 = aVar == defpackage.C4935Gcb.a.DECLARATION || aVar == defpackage.C4935Gcb.a.SYNTHESIZED;
        if (!TVa.a || z2) {
            if (xnb == null) {
                z = true;
            }
            if (!TVa.a || z) {
                C7548vfb vfb = new C7548vfb(this.H, ua(), W(), this, jeb, defpackage.C4935Gcb.a.DECLARATION, zdb);
                return vfb;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Renaming type alias constructor: ");
            sb.append(this);
            throw new AssertionError(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Creating a type alias constructor that is not a declaration: \ncopy from: ");
        sb2.append(this);
        sb2.append("\nnewOwner: ");
        sb2.append(rcb);
        sb2.append("\nkind: ");
        sb2.append(aVar);
        throw new AssertionError(sb2.toString());
    }
}
