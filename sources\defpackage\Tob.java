package defpackage;

import java.lang.reflect.Field;
import java.util.Set;

/* renamed from: Tob reason: default package */
/* compiled from: DescriptorRendererOptionsImpl.kt */
public final class Tob implements Pob {
    static final /* synthetic */ DZa[] a = {HYa.a((C7678xYa) new C7747yYa(HYa.a(Tob.class), "classifierNamePolicy", "getClassifierNamePolicy()Lorg/jetbrains/kotlin/renderer/ClassifierNamePolicy;")), HYa.a((C7678xYa) new C7747yYa(HYa.a(Tob.class), "withDefinedIn", "getWithDefinedIn()Z")), HYa.a((C7678xYa) new C7747yYa(HYa.a(Tob.class), "withSourceFileForTopLevel", "getWithSourceFileForTopLevel()Z")), HYa.a((C7678xYa) new C7747yYa(HYa.a(Tob.class), "modifiers", "getModifiers()Ljava/util/Set;")), HYa.a((C7678xYa) new C7747yYa(HYa.a(Tob.class), "startFromName", "getStartFromName()Z")), HYa.a((C7678xYa) new C7747yYa(HYa.a(Tob.class), "startFromDeclarationKeyword", "getStartFromDeclarationKeyword()Z")), HYa.a((C7678xYa) new C7747yYa(HYa.a(Tob.class), "debugMode", "getDebugMode()Z")), HYa.a((C7678xYa) new C7747yYa(HYa.a(Tob.class), "classWithPrimaryConstructor", "getClassWithPrimaryConstructor()Z")), HYa.a((C7678xYa) new C7747yYa(HYa.a(Tob.class), "verbose", "getVerbose()Z")), HYa.a((C7678xYa) new C7747yYa(HYa.a(Tob.class), "unitReturnType", "getUnitReturnType()Z")), HYa.a((C7678xYa) new C7747yYa(HYa.a(Tob.class), "withoutReturnType", "getWithoutReturnType()Z")), HYa.a((C7678xYa) new C7747yYa(HYa.a(Tob.class), "enhancedTypes", "getEnhancedTypes()Z")), HYa.a((C7678xYa) new C7747yYa(HYa.a(Tob.class), "normalizedVisibilities", "getNormalizedVisibilities()Z")), HYa.a((C7678xYa) new C7747yYa(HYa.a(Tob.class), "renderDefaultVisibility", "getRenderDefaultVisibility()Z")), HYa.a((C7678xYa) new C7747yYa(HYa.a(Tob.class), "renderDefaultModality", "getRenderDefaultModality()Z")), HYa.a((C7678xYa) new C7747yYa(HYa.a(Tob.class), "renderConstructorDelegation", "getRenderConstructorDelegation()Z")), HYa.a((C7678xYa) new C7747yYa(HYa.a(Tob.class), "renderPrimaryConstructorParametersAsProperties", "getRenderPrimaryConstructorParametersAsProperties()Z")), HYa.a((C7678xYa) new C7747yYa(HYa.a(Tob.class), "actualPropertiesInPrimaryConstructor", "getActualPropertiesInPrimaryConstructor()Z")), HYa.a((C7678xYa) new C7747yYa(HYa.a(Tob.class), "uninferredTypeParameterAsName", "getUninferredTypeParameterAsName()Z")), HYa.a((C7678xYa) new C7747yYa(HYa.a(Tob.class), "includePropertyConstant", "getIncludePropertyConstant()Z")), HYa.a((C7678xYa) new C7747yYa(HYa.a(Tob.class), "withoutTypeParameters", "getWithoutTypeParameters()Z")), HYa.a((C7678xYa) new C7747yYa(HYa.a(Tob.class), "withoutSuperTypes", "getWithoutSuperTypes()Z")), HYa.a((C7678xYa) new C7747yYa(HYa.a(Tob.class), "typeNormalizer", "getTypeNormalizer()Lkotlin/jvm/functions/Function1;")), HYa.a((C7678xYa) new C7747yYa(HYa.a(Tob.class), "defaultParameterValueRenderer", "getDefaultParameterValueRenderer()Lkotlin/jvm/functions/Function1;")), HYa.a((C7678xYa) new C7747yYa(HYa.a(Tob.class), "secondaryConstructorsAsPrimary", "getSecondaryConstructorsAsPrimary()Z")), HYa.a((C7678xYa) new C7747yYa(HYa.a(Tob.class), "overrideRenderingPolicy", "getOverrideRenderingPolicy()Lorg/jetbrains/kotlin/renderer/OverrideRenderingPolicy;")), HYa.a((C7678xYa) new C7747yYa(HYa.a(Tob.class), "valueParametersHandler", "getValueParametersHandler()Lorg/jetbrains/kotlin/renderer/DescriptorRenderer$ValueParametersHandler;")), HYa.a((C7678xYa) new C7747yYa(HYa.a(Tob.class), "textFormat", "getTextFormat()Lorg/jetbrains/kotlin/renderer/RenderingFormat;")), HYa.a((C7678xYa) new C7747yYa(HYa.a(Tob.class), "parameterNameRenderingPolicy", "getParameterNameRenderingPolicy()Lorg/jetbrains/kotlin/renderer/ParameterNameRenderingPolicy;")), HYa.a((C7678xYa) new C7747yYa(HYa.a(Tob.class), "receiverAfterName", "getReceiverAfterName()Z")), HYa.a((C7678xYa) new C7747yYa(HYa.a(Tob.class), "renderCompanionObjectName", "getRenderCompanionObjectName()Z")), HYa.a((C7678xYa) new C7747yYa(HYa.a(Tob.class), "propertyAccessorRenderingPolicy", "getPropertyAccessorRenderingPolicy()Lorg/jetbrains/kotlin/renderer/PropertyAccessorRenderingPolicy;")), HYa.a((C7678xYa) new C7747yYa(HYa.a(Tob.class), "renderDefaultAnnotationArguments", "getRenderDefaultAnnotationArguments()Z")), HYa.a((C7678xYa) new C7747yYa(HYa.a(Tob.class), "eachAnnotationOnNewLine", "getEachAnnotationOnNewLine()Z")), HYa.a((C7678xYa) new C7747yYa(HYa.a(Tob.class), "excludedAnnotationClasses", "getExcludedAnnotationClasses()Ljava/util/Set;")), HYa.a((C7678xYa) new C7747yYa(HYa.a(Tob.class), "excludedTypeAnnotationClasses", "getExcludedTypeAnnotationClasses()Ljava/util/Set;")), HYa.a((C7678xYa) new C7747yYa(HYa.a(Tob.class), "annotationFilter", "getAnnotationFilter()Lkotlin/jvm/functions/Function1;")), HYa.a((C7678xYa) new C7747yYa(HYa.a(Tob.class), "annotationArgumentsRenderingPolicy", "getAnnotationArgumentsRenderingPolicy()Lorg/jetbrains/kotlin/renderer/AnnotationArgumentsRenderingPolicy;")), HYa.a((C7678xYa) new C7747yYa(HYa.a(Tob.class), "alwaysRenderModifiers", "getAlwaysRenderModifiers()Z")), HYa.a((C7678xYa) new C7747yYa(HYa.a(Tob.class), "renderConstructorKeyword", "getRenderConstructorKeyword()Z")), HYa.a((C7678xYa) new C7747yYa(HYa.a(Tob.class), "renderUnabbreviatedType", "getRenderUnabbreviatedType()Z")), HYa.a((C7678xYa) new C7747yYa(HYa.a(Tob.class), "renderTypeExpansions", "getRenderTypeExpansions()Z")), HYa.a((C7678xYa) new C7747yYa(HYa.a(Tob.class), "includeAdditionalModifiers", "getIncludeAdditionalModifiers()Z")), HYa.a((C7678xYa) new C7747yYa(HYa.a(Tob.class), "parameterNamesInFunctionalTypes", "getParameterNamesInFunctionalTypes()Z")), HYa.a((C7678xYa) new C7747yYa(HYa.a(Tob.class), "renderFunctionContracts", "getRenderFunctionContracts()Z")), HYa.a((C7678xYa) new C7747yYa(HYa.a(Tob.class), "presentableUnresolvedTypes", "getPresentableUnresolvedTypes()Z")), HYa.a((C7678xYa) new C7747yYa(HYa.a(Tob.class), "boldOnlyForNamesInHtml", "getBoldOnlyForNamesInHtml()Z"))};
    private final WYa A;
    private final WYa B;
    private final WYa C;
    private final WYa D;
    private final WYa E;
    private final WYa F;
    private final WYa G;
    private final WYa H;
    private final WYa I;
    private final WYa J;
    private final WYa K;
    private final WYa L;
    private final WYa M;
    private final WYa N;
    private final WYa O;
    private final WYa P;
    private final WYa Q;
    private final WYa R;
    private final WYa S;
    private final WYa T;
    private final WYa U;
    private final WYa V;
    private final WYa W;
    private boolean b;
    private final WYa c = a((T) c.a);
    private final WYa d;
    private final WYa e;
    private final WYa f;
    private final WYa g;
    private final WYa h;
    private final WYa i;
    private final WYa j;
    private final WYa k;
    private final WYa l;
    private final WYa m;
    private final WYa n;
    private final WYa o;
    private final WYa p;
    private final WYa q;
    private final WYa r;
    private final WYa s;
    private final WYa t;
    private final WYa u;
    private final WYa v;
    private final WYa w;
    private final WYa x;
    private final WYa y;
    private final WYa z;

    public Tob() {
        Boolean valueOf = Boolean.valueOf(true);
        this.d = a((T) valueOf);
        this.e = a((T) valueOf);
        this.f = a((T) Oob.n);
        Boolean valueOf2 = Boolean.valueOf(false);
        this.g = a((T) valueOf2);
        this.h = a((T) valueOf2);
        this.i = a((T) valueOf2);
        this.j = a((T) valueOf2);
        this.k = a((T) valueOf2);
        this.l = a((T) valueOf);
        this.m = a((T) valueOf2);
        this.n = a((T) valueOf2);
        this.o = a((T) valueOf2);
        this.p = a((T) valueOf);
        this.q = a((T) valueOf);
        this.r = a((T) valueOf2);
        this.s = a((T) valueOf2);
        this.t = a((T) valueOf2);
        this.u = a((T) valueOf2);
        this.v = a((T) valueOf2);
        this.w = a((T) valueOf2);
        this.x = a((T) valueOf2);
        this.y = a((T) Sob.a);
        this.z = a((T) Qob.a);
        this.A = a((T) valueOf);
        this.B = a((T) Wob.RENDER_OPEN);
        this.C = a((T) a.a);
        this.D = a((T) Zob.a);
        this.E = a((T) Xob.ALL);
        this.F = a((T) valueOf2);
        this.G = a((T) valueOf2);
        this.H = a((T) Yob.DEBUG);
        this.I = a((T) valueOf2);
        this.J = a((T) valueOf2);
        this.K = a((T) SWa.a());
        this.L = a((T) Uob.b.a());
        this.M = a((T) null);
        this.N = a((T) C7213qob.NO_ARGUMENTS);
        this.O = a((T) valueOf2);
        this.P = a((T) valueOf);
        this.Q = a((T) valueOf);
        this.R = a((T) valueOf2);
        this.S = a((T) valueOf);
        this.T = a((T) valueOf);
        this.U = a((T) valueOf2);
        this.V = a((T) valueOf2);
        this.W = a((T) valueOf2);
    }

    private final <T> WYa<Tob, T> a(T t2) {
        UYa uYa = UYa.a;
        return new Rob(t2, t2, this);
    }

    public boolean A() {
        return ((Boolean) this.G.a(this, a[30])).booleanValue();
    }

    public boolean B() {
        return ((Boolean) this.r.a(this, a[15])).booleanValue();
    }

    public boolean C() {
        return ((Boolean) this.P.a(this, a[39])).booleanValue();
    }

    public boolean D() {
        return ((Boolean) this.I.a(this, a[32])).booleanValue();
    }

    public boolean E() {
        return ((Boolean) this.q.a(this, a[14])).booleanValue();
    }

    public boolean F() {
        return ((Boolean) this.p.a(this, a[13])).booleanValue();
    }

    public boolean G() {
        return ((Boolean) this.s.a(this, a[16])).booleanValue();
    }

    public boolean H() {
        return ((Boolean) this.R.a(this, a[41])).booleanValue();
    }

    public boolean I() {
        return ((Boolean) this.Q.a(this, a[40])).booleanValue();
    }

    public boolean J() {
        return ((Boolean) this.A.a(this, a[24])).booleanValue();
    }

    public boolean K() {
        return ((Boolean) this.h.a(this, a[5])).booleanValue();
    }

    public boolean L() {
        return ((Boolean) this.g.a(this, a[4])).booleanValue();
    }

    public Zob M() {
        return (Zob) this.D.a(this, a[27]);
    }

    public _Xa<C7706xtb, C7706xtb> N() {
        return (_Xa) this.y.a(this, a[22]);
    }

    public boolean O() {
        return ((Boolean) this.u.a(this, a[18])).booleanValue();
    }

    public boolean P() {
        return ((Boolean) this.l.a(this, a[9])).booleanValue();
    }

    public b Q() {
        return (b) this.C.a(this, a[26]);
    }

    public boolean R() {
        return ((Boolean) this.k.a(this, a[8])).booleanValue();
    }

    public boolean S() {
        return ((Boolean) this.d.a(this, a[1])).booleanValue();
    }

    public boolean T() {
        return ((Boolean) this.e.a(this, a[2])).booleanValue();
    }

    public boolean U() {
        return ((Boolean) this.m.a(this, a[10])).booleanValue();
    }

    public boolean V() {
        return ((Boolean) this.x.a(this, a[21])).booleanValue();
    }

    public boolean W() {
        return ((Boolean) this.w.a(this, a[20])).booleanValue();
    }

    public final boolean X() {
        return this.b;
    }

    public final void Y() {
        boolean z2 = !this.b;
        if (!TVa.a || z2) {
            this.b = true;
            return;
        }
        throw new AssertionError("Assertion failed");
    }

    public void a(Xob xob) {
        C7471uYa.b(xob, "<set-?>");
        this.E.a(this, a[28], xob);
    }

    public void a(Zob zob) {
        C7471uYa.b(zob, "<set-?>");
        this.D.a(this, a[27], zob);
    }

    public void a(Set<C7349snb> set) {
        C7471uYa.b(set, "<set-?>");
        this.L.a(this, a[35], set);
    }

    public void a(C7213qob qob) {
        C7471uYa.b(qob, "<set-?>");
        this.N.a(this, a[37], qob);
    }

    public void a(C7282rob rob) {
        C7471uYa.b(rob, "<set-?>");
        this.c.a(this, a[0], rob);
    }

    public void a(boolean z2) {
        this.g.a(this, a[4], Boolean.valueOf(z2));
    }

    public boolean a() {
        return ((Boolean) this.n.a(this, a[11])).booleanValue();
    }

    public Set<C7349snb> b() {
        return (Set) this.L.a(this, a[35]);
    }

    public void b(Set<? extends Oob> set) {
        C7471uYa.b(set, "<set-?>");
        this.f.a(this, a[3], set);
    }

    public void b(boolean z2) {
        this.d.a(this, a[1], Boolean.valueOf(z2));
    }

    public void c(boolean z2) {
        this.x.a(this, a[21], Boolean.valueOf(z2));
    }

    public boolean c() {
        return ((Boolean) this.i.a(this, a[6])).booleanValue();
    }

    public C7213qob d() {
        return (C7213qob) this.N.a(this, a[37]);
    }

    public void d(boolean z2) {
        this.F.a(this, a[29], Boolean.valueOf(z2));
    }

    public final Tob e() {
        Field[] declaredFields;
        Tob tob = new Tob();
        for (Field field : Tob.class.getDeclaredFields()) {
            C7471uYa.a((Object) field, "field");
            if ((field.getModifiers() & 8) == 0) {
                field.setAccessible(true);
                Object obj = field.get(this);
                if (!(obj instanceof VYa)) {
                    obj = null;
                }
                VYa vYa = (VYa) obj;
                if (vYa != null) {
                    String name = field.getName();
                    String str = "field.name";
                    C7471uYa.a((Object) name, str);
                    boolean b2 = true ^ Cxb.b(name, "is", false, 2, null);
                    if (!TVa.a || b2) {
                        C7472uZa a2 = HYa.a(Tob.class);
                        String name2 = field.getName();
                        StringBuilder sb = new StringBuilder();
                        sb.append("get");
                        String name3 = field.getName();
                        C7471uYa.a((Object) name3, str);
                        sb.append(Cxb.d(name3));
                        field.set(tob, tob.a((T) vYa.a(this, new EYa(a2, name2, sb.toString()))));
                    } else {
                        throw new AssertionError("Fields named is* are not supported here yet");
                    }
                } else {
                    continue;
                }
            }
        }
        return tob;
    }

    public void e(boolean z2) {
        this.i.a(this, a[6], Boolean.valueOf(z2));
    }

    public void f(boolean z2) {
        this.G.a(this, a[30], Boolean.valueOf(z2));
    }

    public boolean f() {
        return ((Boolean) this.t.a(this, a[17])).booleanValue();
    }

    public void g(boolean z2) {
        this.w.a(this, a[20], Boolean.valueOf(z2));
    }

    public boolean g() {
        return ((Boolean) this.O.a(this, a[38])).booleanValue();
    }

    public _Xa<C6315deb, Boolean> h() {
        return (_Xa) this.M.a(this, a[36]);
    }

    public boolean i() {
        return ((Boolean) this.W.a(this, a[46])).booleanValue();
    }

    public boolean j() {
        return ((Boolean) this.j.a(this, a[7])).booleanValue();
    }

    public C7282rob k() {
        return (C7282rob) this.c.a(this, a[0]);
    }

    public _Xa<C5061Kdb, String> l() {
        return (_Xa) this.z.a(this, a[23]);
    }

    public boolean m() {
        return ((Boolean) this.J.a(this, a[33])).booleanValue();
    }

    public Set<C7349snb> n() {
        return (Set) this.K.a(this, a[34]);
    }

    public boolean o() {
        return ((Boolean) this.S.a(this, a[42])).booleanValue();
    }

    public boolean p() {
        return a.a(this);
    }

    public boolean q() {
        return a.b(this);
    }

    public boolean r() {
        return ((Boolean) this.v.a(this, a[19])).booleanValue();
    }

    public Set<Oob> s() {
        return (Set) this.f.a(this, a[3]);
    }

    public boolean t() {
        return ((Boolean) this.o.a(this, a[12])).booleanValue();
    }

    public Wob u() {
        return (Wob) this.B.a(this, a[25]);
    }

    public Xob v() {
        return (Xob) this.E.a(this, a[28]);
    }

    public boolean w() {
        return ((Boolean) this.T.a(this, a[43])).booleanValue();
    }

    public boolean x() {
        return ((Boolean) this.V.a(this, a[45])).booleanValue();
    }

    public Yob y() {
        return (Yob) this.H.a(this, a[31]);
    }

    public boolean z() {
        return ((Boolean) this.F.a(this, a[29])).booleanValue();
    }
}
