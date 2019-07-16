package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/* renamed from: Eob reason: default package */
/* compiled from: DescriptorRendererImpl.kt */
public final class Eob extends Cob implements Pob {
    static final /* synthetic */ DZa[] k = {HYa.a((DYa) new EYa(HYa.a(Eob.class), "functionTypeAnnotationsRenderer", "getFunctionTypeAnnotationsRenderer()Lorg/jetbrains/kotlin/renderer/DescriptorRendererImpl;")), HYa.a((DYa) new EYa(HYa.a(Eob.class), "functionTypeParameterTypesRenderer", "getFunctionTypeParameterTypesRenderer()Lorg/jetbrains/kotlin/renderer/DescriptorRenderer;"))};
    private final C7744yVa l;
    private final C7744yVa m;
    private final Tob n;

    /* renamed from: Eob$a */
    /* compiled from: DescriptorRendererImpl.kt */
    private final class a implements C5332Tcb<RVa, StringBuilder> {
        public a() {
        }

        public /* bridge */ /* synthetic */ Object a(C5029Jcb jcb, Object obj) {
            a(jcb, (StringBuilder) obj);
            return RVa.a;
        }

        public /* bridge */ /* synthetic */ Object a(C5242Qcb qcb, Object obj) {
            a(qcb, (StringBuilder) obj);
            return RVa.a;
        }

        public /* bridge */ /* synthetic */ Object a(C5582adb adb, Object obj) {
            a(adb, (StringBuilder) obj);
            return RVa.a;
        }

        public /* bridge */ /* synthetic */ Object a(C6450fdb fdb, Object obj) {
            a(fdb, (StringBuilder) obj);
            return RVa.a;
        }

        public /* bridge */ /* synthetic */ Object a(C6790kdb kdb, Object obj) {
            a(kdb, (StringBuilder) obj);
            return RVa.a;
        }

        public /* bridge */ /* synthetic */ Object a(C7132pdb pdb, Object obj) {
            a(pdb, (StringBuilder) obj);
            return RVa.a;
        }

        public /* bridge */ /* synthetic */ Object a(C7408tdb tdb, Object obj) {
            a(tdb, (StringBuilder) obj);
            return RVa.a;
        }

        public /* bridge */ /* synthetic */ Object a(C7477udb udb, Object obj) {
            a(udb, (StringBuilder) obj);
            return RVa.a;
        }

        public /* bridge */ /* synthetic */ Object a(C7546vdb vdb, Object obj) {
            a(vdb, (StringBuilder) obj);
            return RVa.a;
        }

        public /* bridge */ /* synthetic */ Object a(C7615wdb wdb, Object obj) {
            a(wdb, (StringBuilder) obj);
            return RVa.a;
        }

        public /* bridge */ /* synthetic */ Object a(C4874Edb edb, Object obj) {
            a(edb, (StringBuilder) obj);
            return RVa.a;
        }

        public /* bridge */ /* synthetic */ Object a(C4905Fdb fdb, Object obj) {
            a(fdb, (StringBuilder) obj);
            return RVa.a;
        }

        public /* bridge */ /* synthetic */ Object a(C5061Kdb kdb, Object obj) {
            a(kdb, (StringBuilder) obj);
            return RVa.a;
        }

        public void a(C5061Kdb kdb, StringBuilder sb) {
            C7471uYa.b(kdb, "descriptor");
            C7471uYa.b(sb, "builder");
            Eob.this.a(kdb, true, sb, true);
        }

        public void a(C7408tdb tdb, StringBuilder sb) {
            C7471uYa.b(tdb, "descriptor");
            C7471uYa.b(sb, "builder");
            Eob.this.a(tdb, sb);
        }

        public void a(C7477udb udb, StringBuilder sb) {
            C7471uYa.b(udb, "descriptor");
            C7471uYa.b(sb, "builder");
            a(udb, sb, "getter");
        }

        public void a(C7546vdb vdb, StringBuilder sb) {
            C7471uYa.b(vdb, "descriptor");
            C7471uYa.b(sb, "builder");
            a(vdb, sb, "setter");
        }

        private final void a(C7339sdb sdb, StringBuilder sb, String str) {
            int i = Dob.a[Eob.this.y().ordinal()];
            if (i == 1) {
                Eob.this.a(sdb, sb);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" for ");
                sb.append(sb2.toString());
                Eob eob = Eob.this;
                C7408tdb I = sdb.I();
                C7471uYa.a((Object) I, "descriptor.correspondingProperty");
                eob.a(I, sb);
            } else if (i == 2) {
                a((C5582adb) sdb, sb);
            }
        }

        public void a(C5582adb adb, StringBuilder sb) {
            C7471uYa.b(adb, "descriptor");
            C7471uYa.b(sb, "builder");
            Eob.this.b(adb, sb);
        }

        public void a(C7615wdb wdb, StringBuilder sb) {
            C7471uYa.b(wdb, "descriptor");
            C7471uYa.b(sb, "builder");
            sb.append(wdb.getName());
        }

        public void a(C5242Qcb qcb, StringBuilder sb) {
            C7471uYa.b(qcb, "constructorDescriptor");
            C7471uYa.b(sb, "builder");
            Eob.this.a(qcb, sb);
        }

        public void a(C4905Fdb fdb, StringBuilder sb) {
            C7471uYa.b(fdb, "descriptor");
            C7471uYa.b(sb, "builder");
            Eob.this.a(fdb, sb, true);
        }

        public void a(C6790kdb kdb, StringBuilder sb) {
            C7471uYa.b(kdb, "descriptor");
            C7471uYa.b(sb, "builder");
            Eob.this.a(kdb, sb);
        }

        public void a(C7132pdb pdb, StringBuilder sb) {
            C7471uYa.b(pdb, "descriptor");
            C7471uYa.b(sb, "builder");
            Eob.this.a(pdb, sb);
        }

        public void a(C6450fdb fdb, StringBuilder sb) {
            C7471uYa.b(fdb, "descriptor");
            C7471uYa.b(sb, "builder");
            Eob.this.a((C5272Rcb) fdb, sb, true);
        }

        public void a(C5029Jcb jcb, StringBuilder sb) {
            C7471uYa.b(jcb, "descriptor");
            C7471uYa.b(sb, "builder");
            Eob.this.a(jcb, sb);
        }

        public void a(C4874Edb edb, StringBuilder sb) {
            C7471uYa.b(edb, "descriptor");
            C7471uYa.b(sb, "builder");
            Eob.this.a(edb, sb);
        }
    }

    public Eob(Tob tob) {
        C7471uYa.b(tob, "options");
        this.n = tob;
        boolean X = this.n.X();
        if (!TVa.a || X) {
            this.l = BVa.a(new Iob(this));
            this.m = BVa.a(new Kob(this));
            return;
        }
        throw new AssertionError("Assertion failed");
    }

    private final String X() {
        int i = Fob.c[M().ordinal()];
        if (i == 1) {
            return b("->");
        }
        if (i == 2) {
            return "&rarr;";
        }
        throw new FVa();
    }

    private final Eob Y() {
        C7744yVa yva = this.l;
        DZa dZa = k[0];
        return (Eob) yva.getValue();
    }

    private final Cob Z() {
        C7744yVa yva = this.m;
        DZa dZa = k[1];
        return (Cob) yva.getValue();
    }

    private final String aa() {
        return b(">");
    }

    private final String b(String str) {
        return M().a(str);
    }

    private final String ba() {
        return b("<");
    }

    private final String c(String str) {
        int i = Fob.b[M().ordinal()];
        if (i == 1) {
            return str;
        }
        if (i == 2) {
            StringBuilder sb = new StringBuilder();
            sb.append("<font color=red><b>");
            sb.append(str);
            sb.append("</b></font>");
            return sb.toString();
        }
        throw new FVa();
    }

    private final String d(String str) {
        int i = Fob.a[M().ordinal()];
        if (i == 1) {
            return str;
        }
        if (i == 2) {
            if (!h()) {
                StringBuilder sb = new StringBuilder();
                sb.append("<b>");
                sb.append(str);
                sb.append("</b>");
                str = sb.toString();
            }
            return str;
        }
        throw new FVa();
    }

    private final boolean h(boolean z) {
        int i = Fob.e[v().ordinal()];
        if (i == 1) {
            return true;
        }
        if (i == 2) {
            return !z;
        }
        if (i == 3) {
            return false;
        }
        throw new FVa();
    }

    public boolean A() {
        return this.n.A();
    }

    public boolean B() {
        return this.n.B();
    }

    public boolean C() {
        return this.n.C();
    }

    public boolean D() {
        return this.n.D();
    }

    public boolean E() {
        return this.n.E();
    }

    public boolean F() {
        return this.n.F();
    }

    public boolean G() {
        return this.n.G();
    }

    public boolean H() {
        return this.n.H();
    }

    public boolean I() {
        return this.n.I();
    }

    public boolean J() {
        return this.n.J();
    }

    public boolean K() {
        return this.n.K();
    }

    public boolean L() {
        return this.n.L();
    }

    public Zob M() {
        return this.n.M();
    }

    public _Xa<C7706xtb, C7706xtb> N() {
        return this.n.N();
    }

    public boolean O() {
        return this.n.O();
    }

    public boolean P() {
        return this.n.P();
    }

    public b Q() {
        return this.n.Q();
    }

    public boolean R() {
        return this.n.R();
    }

    public boolean S() {
        return this.n.S();
    }

    public boolean T() {
        return this.n.T();
    }

    public boolean U() {
        return this.n.U();
    }

    public boolean V() {
        return this.n.V();
    }

    public boolean W() {
        return this.n.W();
    }

    public void a(Xob xob) {
        C7471uYa.b(xob, "<set-?>");
        this.n.a(xob);
    }

    public void a(Zob zob) {
        C7471uYa.b(zob, "<set-?>");
        this.n.a(zob);
    }

    public void a(Set<C7349snb> set) {
        C7471uYa.b(set, "<set-?>");
        this.n.a(set);
    }

    public void a(C7213qob qob) {
        C7471uYa.b(qob, "<set-?>");
        this.n.a(qob);
    }

    public void a(C7282rob rob) {
        C7471uYa.b(rob, "<set-?>");
        this.n.a(rob);
    }

    public void a(boolean z) {
        this.n.a(z);
    }

    public boolean a() {
        return this.n.a();
    }

    public Set<C7349snb> b() {
        return this.n.b();
    }

    public void b(Set<? extends Oob> set) {
        C7471uYa.b(set, "<set-?>");
        this.n.b(set);
    }

    public void b(boolean z) {
        this.n.b(z);
    }

    public void c(boolean z) {
        this.n.c(z);
    }

    public boolean c() {
        return this.n.c();
    }

    public C7213qob d() {
        return this.n.d();
    }

    public void d(boolean z) {
        this.n.d(z);
    }

    public void e(boolean z) {
        this.n.e(z);
    }

    public boolean e() {
        return this.n.f();
    }

    public void f(boolean z) {
        this.n.f(z);
    }

    public boolean f() {
        return this.n.g();
    }

    public _Xa<C6315deb, Boolean> g() {
        return this.n.h();
    }

    public void g(boolean z) {
        this.n.g(z);
    }

    public boolean h() {
        return this.n.i();
    }

    public boolean i() {
        return this.n.j();
    }

    public C7282rob j() {
        return this.n.k();
    }

    public _Xa<C5061Kdb, String> k() {
        return this.n.l();
    }

    public boolean l() {
        return this.n.m();
    }

    public Set<C7349snb> m() {
        return this.n.n();
    }

    public boolean n() {
        return this.n.o();
    }

    public boolean o() {
        return this.n.p();
    }

    public boolean p() {
        return this.n.q();
    }

    public boolean q() {
        return this.n.r();
    }

    public Set<Oob> r() {
        return this.n.s();
    }

    public boolean s() {
        return this.n.t();
    }

    public final Tob t() {
        return this.n;
    }

    public Wob u() {
        return this.n.u();
    }

    public Xob v() {
        return this.n.v();
    }

    public boolean w() {
        return this.n.w();
    }

    public boolean x() {
        return this.n.x();
    }

    public Yob y() {
        return this.n.y();
    }

    public boolean z() {
        return this.n.z();
    }

    private final String b(List<C7694xnb> list) {
        return b(_ob.a(list));
    }

    private final void b(StringBuilder sb, C7706xtb xtb) {
        C7694xnb xnb;
        int length = sb.length();
        a(Y(), sb, (C5651beb) xtb, (C6451feb) null, 2, (Object) null);
        boolean z = true;
        boolean z2 = sb.length() != length;
        boolean h = C5181Obb.h(xtb);
        boolean Aa = xtb.Aa();
        C7706xtb b = C5181Obb.b(xtb);
        boolean z3 = Aa || (z2 && b != null);
        String str = "(";
        if (z3) {
            if (h) {
                sb.insert(length, '(');
            } else {
                if (z2) {
                    boolean z4 = Jxb.f(sb) == ' ';
                    if (TVa.a && !z4) {
                        throw new AssertionError("Assertion failed");
                    } else if (sb.charAt(Hxb.c(sb) - 1) != ')') {
                        sb.insert(Hxb.c(sb), "()");
                    }
                }
                sb.append(str);
            }
        }
        a(sb, h, "suspend");
        String str2 = ")";
        if (b != null) {
            if ((!c(b) || b.Aa()) && !b(b)) {
                z = false;
            }
            if (z) {
                sb.append(str);
            }
            c(sb, b);
            if (z) {
                sb.append(str2);
            }
            sb.append(".");
        }
        sb.append(str);
        int i = 0;
        for (Stb stb : C5181Obb.d(xtb)) {
            if (i > 0) {
                sb.append(", ");
            }
            if (w()) {
                C7706xtb type = stb.getType();
                C7471uYa.a((Object) type, "typeProjection.type");
                xnb = C5181Obb.a(type);
            } else {
                xnb = null;
            }
            if (xnb != null) {
                sb.append(a(xnb, false));
                sb.append(": ");
            }
            sb.append(Z().a(stb));
            i++;
        }
        sb.append(") ");
        sb.append(X());
        sb.append(" ");
        c(sb, C5181Obb.c(xtb));
        if (z3) {
            sb.append(str2);
        }
        if (Aa) {
            sb.append("?");
        }
    }

    private final void c(StringBuilder sb, C7706xtb xtb) {
        C6405eub Ba = xtb.Ba();
        if (!(Ba instanceof Tsb)) {
            Ba = null;
        }
        Tsb tsb = (Tsb) Ba;
        if (tsb != null) {
            if (H()) {
                d(sb, tsb.fa());
            } else {
                d(sb, tsb.Da());
                if (I()) {
                    a(sb, tsb);
                }
            }
            return;
        }
        d(sb, xtb);
    }

    private final void d(StringBuilder sb, C7706xtb xtb) {
        if (!(xtb instanceof C6541gub) || !c() || ((C6541gub) xtb).Da()) {
            C6405eub Ba = xtb.Ba();
            if (Ba instanceof C7223qtb) {
                sb.append(((C7223qtb) Ba).a(this, this));
            } else if (Ba instanceof Etb) {
                a(sb, (Etb) Ba);
            }
            return;
        }
        sb.append("<Not computed yet>");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    private final boolean c(C7706xtb xtb) {
        boolean z;
        if (!C5181Obb.f(xtb)) {
            return false;
        }
        List ya = xtb.ya();
        if (!(ya instanceof Collection) || !ya.isEmpty()) {
            Iterator it = ya.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((Stb) it.next()).a()) {
                        z = false;
                        break;
                    }
                } else {
                    break;
                }
            }
            if (!z) {
                return true;
            }
            return false;
        }
        z = true;
        if (!z) {
        }
    }

    public String a(String str) {
        C7471uYa.b(str, "message");
        int i = Fob.d[M().ordinal()];
        if (i == 1) {
            return str;
        }
        if (i == 2) {
            StringBuilder sb = new StringBuilder();
            sb.append("<i>");
            sb.append(str);
            sb.append("</i>");
            return sb.toString();
        }
        throw new FVa();
    }

    private final void c(C4935Gcb gcb, StringBuilder sb) {
        if (r().contains(Oob.OVERRIDE) && a(gcb) && u() != Wob.RENDER_OPEN) {
            a(sb, true, "override");
            if (R()) {
                sb.append("/*");
                sb.append(gcb.j().size());
                sb.append("*/ ");
            }
        }
    }

    public String a(C7694xnb xnb, boolean z) {
        C7471uYa.b(xnb, "name");
        String b = b(_ob.a(xnb));
        if (!h() || M() != Zob.b || !z) {
            return b;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("<b>");
        sb.append(b);
        sb.append("</b>");
        return sb.toString();
    }

    /* access modifiers changed from: private */
    public final void a(C5272Rcb rcb, StringBuilder sb, boolean z) {
        C7694xnb name = rcb.getName();
        C7471uYa.a((Object) name, "descriptor.name");
        sb.append(a(name, z));
    }

    private final void a(C5272Rcb rcb, StringBuilder sb) {
        if (A()) {
            if (L()) {
                sb.append("companion object");
            }
            a(sb);
            C5272Rcb e = rcb.e();
            if (e != null) {
                sb.append("of ");
                C7694xnb name = e.getName();
                C7471uYa.a((Object) name, "containingDeclaration.name");
                sb.append(a(name, false));
            }
        }
        if (R() || (!C7471uYa.a((Object) rcb.getName(), (Object) C7832znb.c))) {
            if (!L()) {
                a(sb);
            }
            C7694xnb name2 = rcb.getName();
            C7471uYa.a((Object) name2, "descriptor.name");
            sb.append(a(name2, true));
        }
    }

    private final void c(C5582adb adb, StringBuilder sb) {
        a(sb, adb.s(), "suspend");
    }

    private final void c(C5029Jcb jcb, StringBuilder sb) {
        if (!V() && !C5301Sbb.o(jcb.z())) {
            Ptb Q = jcb.Q();
            C7471uYa.a((Object) Q, "klass.typeConstructor");
            Collection b = Q.b();
            C7471uYa.a((Object) b, "klass.typeConstructor.supertypes");
            if (!b.isEmpty() && (b.size() != 1 || !C5301Sbb.c((C7706xtb) b.iterator().next()))) {
                a(sb);
                sb.append(": ");
                StringBuilder sb2 = sb;
                C7676xWa.a(b, sb2, ", ", null, null, 0, null, new Nob(this), 60, null);
            }
        }
    }

    public String a(C7487unb unb) {
        C7471uYa.b(unb, "fqName");
        List e = unb.e();
        C7471uYa.a((Object) e, "fqName.pathSegments()");
        return b(e);
    }

    public String a(C5122Mcb mcb) {
        C7471uYa.b(mcb, "klass");
        if (C7154ptb.a((C5272Rcb) mcb)) {
            return mcb.Q().toString();
        }
        return j().a(mcb, this);
    }

    public String a(C7706xtb xtb) {
        C7471uYa.b(xtb, C1325gg.TYPE);
        StringBuilder sb = new StringBuilder();
        c(sb, (C7706xtb) N().invoke(xtb));
        String sb2 = sb.toString();
        C7471uYa.a((Object) sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    private final boolean b(C7706xtb xtb) {
        return C5181Obb.h(xtb) || !xtb.getAnnotations().isEmpty();
    }

    private final void b(C4935Gcb gcb, StringBuilder sb) {
        if ((!C6531gpb.r(gcb) || gcb.h() != C6314ddb.FINAL) && !(u() == Wob.RENDER_OVERRIDE && gcb.h() == C6314ddb.OPEN && a(gcb))) {
            C6314ddb h = gcb.h();
            C7471uYa.a((Object) h, "callable.modality");
            a(h, sb, a((C5718cdb) gcb));
        }
    }

    private final void a(StringBuilder sb, Tsb tsb) {
        if (M() == Zob.b) {
            sb.append("<font color=\"808080\"><i>");
        }
        sb.append(" /* = ");
        d(sb, tsb.fa());
        sb.append(" */");
        if (M() == Zob.b) {
            sb.append("</i></font>");
        }
    }

    private final void b(StringBuilder sb, List<? extends C4905Fdb> list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            a((C4905Fdb) it.next(), sb, false);
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
    }

    private final void a(StringBuilder sb, Etb etb) {
        String str = "???";
        if (C7471uYa.a((Object) etb, (Object) C5605aub.b) || C5605aub.f(etb)) {
            sb.append(str);
        } else if (C7154ptb.a((C7706xtb) etb)) {
            if (O()) {
                Ptb za = etb.za();
                if (za != null) {
                    C4905Fdb e = ((d) za).e();
                    C7471uYa.a((Object) e, "(type.constructor as Uni…).typeParameterDescriptor");
                    String xnb = e.getName().toString();
                    C7471uYa.a((Object) xnb, "(type.constructor as Uni…escriptor.name.toString()");
                    sb.append(c(xnb));
                } else {
                    throw new OVa("null cannot be cast to non-null type org.jetbrains.kotlin.types.ErrorUtils.UninferredParameterTypeConstructor");
                }
            } else {
                sb.append(str);
            }
        } else if (C7844ztb.a(etb)) {
            a(sb, (C7706xtb) etb);
        } else {
            if (c((C7706xtb) etb)) {
                b(sb, (C7706xtb) etb);
            } else {
                a(sb, (C7706xtb) etb);
            }
        }
    }

    /* access modifiers changed from: private */
    public final void b(C5582adb adb, StringBuilder sb) {
        String str = "function.typeParameters";
        if (!L()) {
            if (!K()) {
                a(this, sb, (C5651beb) adb, (C6451feb) null, 2, (Object) null);
                C5583aeb d = adb.d();
                C7471uYa.a((Object) d, "function.visibility");
                a(d, sb);
                b((C4935Gcb) adb, sb);
                if (n()) {
                    a((C5718cdb) adb, sb);
                }
                c((C4935Gcb) adb, sb);
                if (n()) {
                    a(adb, sb);
                } else {
                    c(adb, sb);
                }
                a((C4935Gcb) adb, sb);
                if (R()) {
                    if (adb.v()) {
                        sb.append("/*isHiddenToOvercomeSignatureClash*/ ");
                    }
                    if (adb.w()) {
                        sb.append("/*isHiddenForResolutionEverywhereBesideSupercalls*/ ");
                    }
                }
            }
            sb.append(d("fun"));
            sb.append(" ");
            List typeParameters = adb.getTypeParameters();
            C7471uYa.a((Object) typeParameters, str);
            a(typeParameters, sb, true);
            a((C4904Fcb) adb, sb);
        }
        a((C5272Rcb) adb, sb, true);
        List f = adb.f();
        C7471uYa.a((Object) f, "function.valueParameters");
        a((Collection<? extends C5061Kdb>) f, adb.o(), sb);
        b((C4904Fcb) adb, sb);
        C7706xtb a2 = adb.a();
        if (!U() && (P() || a2 == null || !C5301Sbb.w(a2))) {
            sb.append(": ");
            sb.append(a2 == null ? "[NULL]" : a(a2));
        }
        List typeParameters2 = adb.getTypeParameters();
        C7471uYa.a((Object) typeParameters2, str);
        a(typeParameters2, sb);
    }

    public String a(String str, String str2, C5301Sbb sbb) {
        String str3 = str;
        String str4 = str2;
        C7471uYa.b(str3, "lowerRendered");
        C7471uYa.b(str4, "upperRendered");
        C7471uYa.b(sbb, "builtIns");
        if (!a(str, str2)) {
            C7282rob j = j();
            C5029Jcb m2 = sbb.m();
            C7471uYa.a((Object) m2, "builtIns.collection");
            String b = Hxb.b(j.a(m2, this), "Collection", (String) null, 2, (Object) null);
            String str5 = "Mutable";
            StringBuilder sb = new StringBuilder();
            sb.append(b);
            sb.append(str5);
            String sb2 = sb.toString();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(b);
            sb3.append('(');
            sb3.append(str5);
            sb3.append(')');
            String a2 = a(str, sb2, str2, b, sb3.toString());
            if (a2 != null) {
                return a2;
            }
            StringBuilder sb4 = new StringBuilder();
            sb4.append(b);
            sb4.append("MutableMap.MutableEntry");
            String sb5 = sb4.toString();
            StringBuilder sb6 = new StringBuilder();
            sb6.append(b);
            sb6.append("Map.Entry");
            String sb7 = sb6.toString();
            StringBuilder sb8 = new StringBuilder();
            sb8.append(b);
            sb8.append("(Mutable)Map.(Mutable)Entry");
            String a3 = a(str, sb5, str2, sb7, sb8.toString());
            if (a3 != null) {
                return a3;
            }
            C7282rob j2 = j();
            C5029Jcb f = sbb.f();
            C7471uYa.a((Object) f, "builtIns.array");
            String b2 = Hxb.b(j2.a(f, this), "Array", (String) null, 2, (Object) null);
            StringBuilder sb9 = new StringBuilder();
            sb9.append(b2);
            sb9.append(b("Array<"));
            String sb10 = sb9.toString();
            StringBuilder sb11 = new StringBuilder();
            sb11.append(b2);
            sb11.append(b("Array<out "));
            String sb12 = sb11.toString();
            StringBuilder sb13 = new StringBuilder();
            sb13.append(b2);
            sb13.append(b("Array<(out) "));
            String a4 = a(str, sb10, str2, sb12, sb13.toString());
            if (a4 != null) {
                return a4;
            }
            StringBuilder sb14 = new StringBuilder();
            sb14.append('(');
            sb14.append(str3);
            sb14.append("..");
            sb14.append(str4);
            sb14.append(')');
            return sb14.toString();
        } else if (Cxb.b(str4, "(", false, 2, null)) {
            StringBuilder sb15 = new StringBuilder();
            sb15.append('(');
            sb15.append(str3);
            sb15.append(")!");
            return sb15.toString();
        } else {
            StringBuilder sb16 = new StringBuilder();
            sb16.append(str3);
            sb16.append("!");
            return sb16.toString();
        }
    }

    public String a(List<? extends Stb> list) {
        C7471uYa.b(list, "typeArguments");
        if (list.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(ba());
        a(sb, list);
        sb.append(aa());
        String sb2 = sb.toString();
        C7471uYa.a((Object) sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    private final void a(StringBuilder sb, C7706xtb xtb) {
        a(this, sb, (C5651beb) xtb, (C6451feb) null, 2, (Object) null);
        if (C7844ztb.a(xtb)) {
            if (!(xtb instanceof C6337dub) || !x()) {
                sb.append(xtb.za().toString());
            } else {
                sb.append(((C6337dub) xtb).Ca());
            }
            sb.append(a(xtb.ya()));
        } else {
            a(this, sb, xtb, (Ptb) null, 2, (Object) null);
        }
        if (xtb.Aa()) {
            sb.append("?");
        }
        if (Htb.c(xtb)) {
            sb.append("!!");
        }
    }

    private final void b(C4904Fcb fcb, StringBuilder sb) {
        if (z()) {
            C7615wdb l2 = fcb.l();
            if (l2 != null) {
                sb.append(" on ");
                C7706xtb type = l2.getType();
                C7471uYa.a((Object) type, "receiver.type");
                sb.append(a(type));
            }
        }
    }

    private final void b(C5123Mdb mdb, StringBuilder sb) {
        if (!(mdb instanceof C5061Kdb)) {
            sb.append(d(mdb.V() ? "var" : "val"));
            sb.append(" ");
        }
    }

    private final void b(C7408tdb tdb, StringBuilder sb) {
        if (r().contains(Oob.ANNOTATIONS)) {
            a(this, sb, (C5651beb) tdb, (C6451feb) null, 2, (Object) null);
            C5448Xcb U = tdb.U();
            String str = "it";
            if (U != null) {
                C7471uYa.a((Object) U, str);
                a(sb, (C5651beb) U, C6451feb.FIELD);
            }
            C5448Xcb R = tdb.R();
            if (R != null) {
                C7471uYa.a((Object) R, str);
                a(sb, (C5651beb) R, C6451feb.PROPERTY_DELEGATE_FIELD);
            }
            if (y() == Yob.NONE) {
                C7477udb b = tdb.b();
                if (b != null) {
                    C7471uYa.a((Object) b, str);
                    a(sb, (C5651beb) b, C6451feb.PROPERTY_GETTER);
                }
                C7546vdb c = tdb.c();
                if (c != null) {
                    C7471uYa.a((Object) c, str);
                    a(sb, (C5651beb) c, C6451feb.PROPERTY_SETTER);
                    C7471uYa.a((Object) c, "setter");
                    List f = c.f();
                    C7471uYa.a((Object) f, "setter.valueParameters");
                    C5061Kdb kdb = (C5061Kdb) C7676xWa.j(f);
                    C7471uYa.a((Object) kdb, str);
                    a(sb, (C5651beb) kdb, C6451feb.SETTER_PARAMETER);
                }
            }
        }
    }

    static /* synthetic */ void a(Eob eob, StringBuilder sb, C7706xtb xtb, Ptb ptb, int i, Object obj) {
        if ((i & 2) != 0) {
            ptb = xtb.za();
        }
        eob.a(sb, xtb, ptb);
    }

    private final void a(StringBuilder sb, C7706xtb xtb, Ptb ptb) {
        C7270rdb a2 = C4998Idb.a(xtb);
        if (a2 == null) {
            sb.append(a(ptb));
            sb.append(a(xtb.ya()));
            return;
        }
        a(sb, a2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0023, code lost:
        if (r3 != null) goto L_0x003a;
     */
    private final void a(StringBuilder sb, C7270rdb rdb) {
        C7270rdb c = rdb.c();
        if (c != null) {
            a(sb, c);
            sb.append('.');
            C7694xnb name = rdb.b().getName();
            C7471uYa.a((Object) name, "possiblyInnerType.classifierDescriptor.name");
            sb.append(a(name, false));
        }
        Ptb Q = rdb.b().Q();
        C7471uYa.a((Object) Q, "possiblyInnerType.classi…escriptor.typeConstructor");
        sb.append(a(Q));
        sb.append(a(rdb.a()));
    }

    private final void b(C5029Jcb jcb, StringBuilder sb) {
        sb.append(d(Cob.j.a((C5152Ncb) jcb)));
    }

    public String a(Ptb ptb) {
        C7471uYa.b(ptb, "typeConstructor");
        C5122Mcb c = ptb.c();
        if ((c instanceof C4905Fdb) || (c instanceof C5029Jcb) || (c instanceof C4874Edb)) {
            return a(c);
        }
        if (c == null) {
            return ptb.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unexpected classifier: ");
        sb.append(c.getClass());
        throw new IllegalStateException(sb.toString().toString());
    }

    public String a(Stb stb) {
        C7471uYa.b(stb, "typeProjection");
        StringBuilder sb = new StringBuilder();
        a(sb, C6850lWa.a(stb));
        String sb2 = sb.toString();
        C7471uYa.a((Object) sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    private final void a(StringBuilder sb, List<? extends Stb> list) {
        List<? extends Stb> list2 = list;
        StringBuilder sb2 = sb;
        C7676xWa.a(list2, sb2, ", ", null, null, 0, null, new Gob(this), 60, null);
    }

    private final void a(StringBuilder sb, C5272Rcb rcb) {
        if (!(rcb instanceof C6790kdb) && !(rcb instanceof C7132pdb)) {
            if (rcb instanceof C6450fdb) {
                sb.append(" is a module");
                return;
            }
            C5272Rcb e = rcb.e();
            if (e != null && !(e instanceof C6450fdb)) {
                String str = " ";
                sb.append(str);
                sb.append(a("defined in"));
                sb.append(str);
                C7487unb e2 = C6531gpb.e(e);
                C7471uYa.a((Object) e2, "DescriptorUtils.getFqName(containingDeclaration)");
                sb.append(e2.b() ? "root package" : a(e2));
                if (T() && (e instanceof C6790kdb) && (rcb instanceof C5361Ucb)) {
                    C7822zdb source = ((C5361Ucb) rcb).getSource();
                    C7471uYa.a((Object) source, "descriptor.source");
                    C4781Bdb a2 = source.a();
                    C7471uYa.a((Object) a2, "descriptor.source.containingFile");
                    String name = a2.getName();
                    if (name != null) {
                        sb.append(str);
                        sb.append(a("in file"));
                        sb.append(str);
                        sb.append(name);
                    }
                }
            }
        }
    }

    static /* synthetic */ void a(Eob eob, StringBuilder sb, C5651beb beb, C6451feb feb, int i, Object obj) {
        if ((i & 2) != 0) {
            feb = null;
        }
        eob.a(sb, beb, feb);
    }

    private final void a(StringBuilder sb, C5651beb beb, C6451feb feb) {
        if (r().contains(Oob.ANNOTATIONS)) {
            Set b = beb instanceof C7706xtb ? b() : m();
            _Xa g = g();
            for (C6315deb deb : beb.getAnnotations()) {
                if (!C7676xWa.a((Iterable) b, (Object) deb.q()) && (g == null || ((Boolean) g.invoke(deb)).booleanValue())) {
                    sb.append(a(deb, feb));
                    if (l()) {
                        C7783yxb.a(sb);
                    } else {
                        sb.append(" ");
                    }
                }
            }
        }
    }

    public String a(C6315deb deb, C6451feb feb) {
        C7471uYa.b(deb, "annotation");
        StringBuilder sb = new StringBuilder();
        sb.append('@');
        if (feb != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(feb.a());
            sb2.append(":");
            sb.append(sb2.toString());
        }
        C7706xtb type = deb.getType();
        sb.append(a(type));
        if (o()) {
            List a2 = a(deb);
            if (p() || (!a2.isEmpty())) {
                C7676xWa.a(a2, sb, ", ", "(", ")", 0, null, null, 112, null);
            }
        }
        if (R() && (C7844ztb.a(type) || (type.za().c() instanceof b))) {
            sb.append(" /* annotation class not found */");
        }
        String sb3 = sb.toString();
        C7471uYa.a((Object) sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00a4 A[LOOP:3: B:30:0x009e->B:32:0x00a4, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00da  */
    private final List<String> a(C6315deb deb) {
        List list;
        Map a2 = deb.a();
        C5029Jcb b = D() ? C7148pqb.b(deb) : null;
        if (b != null) {
            C4997Icb F = b.F();
            if (F != null) {
                List f = F.f();
                if (f != null) {
                    ArrayList<C5061Kdb> arrayList = new ArrayList<>();
                    for (Object next : f) {
                        if (((C5061Kdb) next).ea()) {
                            arrayList.add(next);
                        }
                    }
                    list = new ArrayList(C6986nWa.a((Iterable) arrayList, 10));
                    for (C5061Kdb kdb : arrayList) {
                        C7471uYa.a((Object) kdb, "it");
                        list.add(kdb.getName());
                    }
                    if (list == null) {
                        list = C6918mWa.a();
                    }
                    ArrayList<C7694xnb> arrayList2 = new ArrayList<>();
                    for (Object next2 : list) {
                        if (!a2.containsKey((C7694xnb) next2)) {
                            arrayList2.add(next2);
                        }
                    }
                    ArrayList arrayList3 = new ArrayList(C6986nWa.a((Iterable) arrayList2, 10));
                    for (C7694xnb xnb : arrayList2) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(xnb.a());
                        sb.append(" = ...");
                        arrayList3.add(sb.toString());
                    }
                    Set<Entry> entrySet = a2.entrySet();
                    ArrayList arrayList4 = new ArrayList(C6986nWa.a((Iterable) entrySet, 10));
                    for (Entry entry : entrySet) {
                        C7694xnb xnb2 = (C7694xnb) entry.getKey();
                        Npb npb = (Npb) entry.getValue();
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(xnb2.a());
                        sb2.append(" = ");
                        sb2.append(!list.contains(xnb2) ? a(npb) : "...");
                        arrayList4.add(sb2.toString());
                    }
                    return C7676xWa.o(C7676xWa.c((Collection) arrayList3, (Iterable) arrayList4));
                }
            }
        }
        list = null;
        if (list == null) {
        }
        ArrayList<C7694xnb> arrayList22 = new ArrayList<>();
        for (Object next22 : list) {
        }
        ArrayList arrayList32 = new ArrayList(C6986nWa.a((Iterable) arrayList22, 10));
        for (C7694xnb xnb3 : arrayList22) {
        }
        Set<Entry> entrySet2 = a2.entrySet();
        ArrayList arrayList42 = new ArrayList(C6986nWa.a((Iterable) entrySet2, 10));
        for (Entry entry2 : entrySet2) {
        }
        return C7676xWa.o(C7676xWa.c((Collection) arrayList32, (Iterable) arrayList42));
    }

    /* access modifiers changed from: private */
    public final String a(Npb<?> npb) {
        if (npb instanceof Ipb) {
            return C7676xWa.a((Iterable) ((Ipb) npb).a(), ", ", "{", "}", 0, null, new Lob(this), 24, null);
        } else if (npb instanceof Hpb) {
            return Hxb.a(Cob.a(this, (C6315deb) ((Hpb) npb).a(), null, 2, null), (CharSequence) "@");
        } else {
            if (!(npb instanceof Ypb)) {
                return npb.toString();
            }
            b bVar = (b) ((Ypb) npb).a();
            String str = "::class";
            if (bVar instanceof defpackage.Ypb.b.a) {
                StringBuilder sb = new StringBuilder();
                sb.append(((defpackage.Ypb.b.a) bVar).a());
                sb.append(str);
                return sb.toString();
            } else if (bVar instanceof C0159b) {
                C0159b bVar2 = (C0159b) bVar;
                String a2 = bVar2.b().a().a();
                C7471uYa.a((Object) a2, "classValue.classId.asSingleFqName().asString()");
                int a3 = bVar2.a();
                for (int i = 0; i < a3; i++) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("kotlin.Array<");
                    sb2.append(a2);
                    sb2.append('>');
                    a2 = sb2.toString();
                }
                StringBuilder sb3 = new StringBuilder();
                sb3.append(a2);
                sb3.append(str);
                return sb3.toString();
            } else {
                throw new FVa();
            }
        }
    }

    private final boolean a(C5583aeb aeb, StringBuilder sb) {
        if (!r().contains(Oob.VISIBILITY)) {
            return false;
        }
        if (s()) {
            aeb = aeb.c();
        }
        if (!F() && C7471uYa.a((Object) aeb, (Object) _db.l)) {
            return false;
        }
        sb.append(d(aeb.a()));
        sb.append(" ");
        return true;
    }

    private final void a(C6314ddb ddb, StringBuilder sb, C6314ddb ddb2) {
        if (E() || ddb != ddb2) {
            boolean contains = r().contains(Oob.MODALITY);
            String name = ddb.name();
            if (name != null) {
                String lowerCase = name.toLowerCase();
                C7471uYa.a((Object) lowerCase, "(this as java.lang.String).toLowerCase()");
                a(sb, contains, lowerCase);
                return;
            }
            throw new OVa("null cannot be cast to non-null type java.lang.String");
        }
    }

    private final C6314ddb a(C5718cdb cdb) {
        if (cdb instanceof C5029Jcb) {
            return ((C5029Jcb) cdb).g() == C5060Kcb.INTERFACE ? C6314ddb.ABSTRACT : C6314ddb.FINAL;
        }
        C5272Rcb e = cdb.e();
        if (!(e instanceof C5029Jcb)) {
            e = null;
        }
        C5029Jcb jcb = (C5029Jcb) e;
        if (jcb == null) {
            return C6314ddb.FINAL;
        }
        if (!(cdb instanceof C4935Gcb)) {
            return C6314ddb.FINAL;
        }
        C4935Gcb gcb = (C4935Gcb) cdb;
        Collection j = gcb.j();
        C7471uYa.a((Object) j, "this.overriddenDescriptors");
        if ((!j.isEmpty()) && jcb.h() != C6314ddb.FINAL) {
            return C6314ddb.OPEN;
        }
        if (jcb.g() != C5060Kcb.INTERFACE || !(!C7471uYa.a((Object) gcb.d(), (Object) _db.a))) {
            return C6314ddb.FINAL;
        }
        C6314ddb h = gcb.h();
        C6314ddb ddb = C6314ddb.ABSTRACT;
        if (h != ddb) {
            ddb = C6314ddb.OPEN;
        }
        return ddb;
    }

    private final void a(C4935Gcb gcb, StringBuilder sb) {
        if (r().contains(Oob.MEMBER_KIND) && R() && gcb.g() != defpackage.C4935Gcb.a.DECLARATION) {
            sb.append("/*");
            String name = gcb.g().name();
            if (name != null) {
                String lowerCase = name.toLowerCase();
                C7471uYa.a((Object) lowerCase, "(this as java.lang.String).toLowerCase()");
                sb.append(lowerCase);
                sb.append("*/ ");
            } else {
                throw new OVa("null cannot be cast to non-null type java.lang.String");
            }
        }
    }

    private final void a(StringBuilder sb, boolean z, String str) {
        if (z) {
            sb.append(d(str));
            sb.append(" ");
        }
    }

    private final void a(C5718cdb cdb, StringBuilder sb) {
        a(sb, cdb.n(), "external");
        boolean z = true;
        a(sb, r().contains(Oob.EXPECT) && cdb.p(), "expect");
        if (!r().contains(Oob.ACTUAL) || !cdb.m()) {
            z = false;
        }
        a(sb, z, "actual");
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x004a  */
    private final void a(C5582adb adb, StringBuilder sb) {
        boolean z;
        boolean z2;
        boolean z3;
        String str = "it";
        String str2 = "functionDescriptor.overriddenDescriptors";
        boolean z4 = false;
        if (adb.t()) {
            Collection j = adb.j();
            C7471uYa.a((Object) j, str2);
            if (!(j instanceof Collection) || !j.isEmpty()) {
                Iterator it = j.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C5582adb adb2 = (C5582adb) it.next();
                    C7471uYa.a((Object) adb2, str);
                    if (adb2.t()) {
                        z3 = false;
                        break;
                    }
                }
            }
            z3 = true;
            if (z3 || f()) {
                z = true;
                if (adb.y()) {
                    Collection j2 = adb.j();
                    C7471uYa.a((Object) j2, str2);
                    if (!(j2 instanceof Collection) || !j2.isEmpty()) {
                        Iterator it2 = j2.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            C5582adb adb3 = (C5582adb) it2.next();
                            C7471uYa.a((Object) adb3, str);
                            if (adb3.y()) {
                                z2 = false;
                                break;
                            }
                        }
                    }
                    z2 = true;
                    if (z2 || f()) {
                        z4 = true;
                    }
                }
                a(sb, adb.r(), "tailrec");
                c(adb, sb);
                a(sb, adb.isInline(), "inline");
                a(sb, z4, "infix");
                a(sb, z, "operator");
            }
        }
        z = false;
        if (adb.y()) {
        }
        a(sb, adb.r(), "tailrec");
        c(adb, sb);
        a(sb, adb.isInline(), "inline");
        a(sb, z4, "infix");
        a(sb, z, "operator");
    }

    public String a(C5272Rcb rcb) {
        C7471uYa.b(rcb, "declarationDescriptor");
        StringBuilder sb = new StringBuilder();
        rcb.a(new a(), sb);
        if (S()) {
            a(sb, rcb);
        }
        String sb2 = sb.toString();
        C7471uYa.a((Object) sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    /* access modifiers changed from: private */
    public final void a(C4905Fdb fdb, StringBuilder sb, boolean z) {
        if (z) {
            sb.append(ba());
        }
        if (R()) {
            sb.append("/*");
            sb.append(fdb.getIndex());
            sb.append("*/ ");
        }
        a(sb, fdb.oa(), "reified");
        String b = fdb.pa().b();
        boolean z2 = true;
        a(sb, b.length() > 0, b);
        a(this, sb, (C5651beb) fdb, (C6451feb) null, 2, (Object) null);
        a((C5272Rcb) fdb, sb, z);
        int size = fdb.getUpperBounds().size();
        String str = "upperBound";
        String str2 = " : ";
        if ((size > 1 && !z) || size == 1) {
            C7706xtb xtb = (C7706xtb) fdb.getUpperBounds().iterator().next();
            if (!C5301Sbb.h(xtb)) {
                sb.append(str2);
                C7471uYa.a((Object) xtb, str);
                sb.append(a(xtb));
            }
        } else if (z) {
            for (C7706xtb xtb2 : fdb.getUpperBounds()) {
                if (!C5301Sbb.h(xtb2)) {
                    if (z2) {
                        sb.append(str2);
                    } else {
                        sb.append(" & ");
                    }
                    C7471uYa.a((Object) xtb2, str);
                    sb.append(a(xtb2));
                    z2 = false;
                }
            }
        }
        if (z) {
            sb.append(aa());
        }
    }

    private final void a(List<? extends C4905Fdb> list, StringBuilder sb, boolean z) {
        if (!W() && !list.isEmpty()) {
            sb.append(ba());
            b(sb, list);
            sb.append(aa());
            if (z) {
                sb.append(" ");
            }
        }
    }

    private final void a(C4904Fcb fcb, StringBuilder sb) {
        C7615wdb l2 = fcb.l();
        if (l2 != null) {
            a(sb, (C5651beb) l2, C6451feb.RECEIVER);
            C7706xtb type = l2.getType();
            C7471uYa.a((Object) type, "receiver.type");
            String a2 = a(type);
            if (c(type) && !C5605aub.g(type)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append('(');
                sb2.append(a2);
                sb2.append(')');
                a2 = sb2.toString();
            }
            sb.append(a2);
            sb.append(".");
        }
    }

    /* access modifiers changed from: private */
    public final void a(C5242Qcb qcb, StringBuilder sb) {
        StringBuilder sb2 = sb;
        a(this, sb, (C5651beb) qcb, (C6451feb) null, 2, (Object) null);
        C5583aeb d = qcb.d();
        C7471uYa.a((Object) d, "constructor.visibility");
        boolean a2 = a(d, sb2);
        a((C4935Gcb) qcb, sb);
        boolean z = C() || !qcb.S() || a2;
        if (z) {
            sb2.append(d("constructor"));
        }
        C5152Ncb e = qcb.e();
        C7471uYa.a((Object) e, "constructor.containingDeclaration");
        String str = "constructor.typeParameters";
        if (J()) {
            if (z) {
                sb2.append(" ");
            }
            a((C5272Rcb) e, sb2, true);
            List typeParameters = qcb.getTypeParameters();
            C7471uYa.a((Object) typeParameters, str);
            a(typeParameters, sb2, false);
        }
        List f = qcb.f();
        C7471uYa.a((Object) f, "constructor.valueParameters");
        a((Collection<? extends C5061Kdb>) f, qcb.o(), sb2);
        if (B() && !qcb.S() && (e instanceof C5029Jcb)) {
            C4997Icb F = ((C5029Jcb) e).F();
            if (F != null) {
                List f2 = F.f();
                C7471uYa.a((Object) f2, "primaryConstructor.valueParameters");
                ArrayList arrayList = new ArrayList();
                for (Object next : f2) {
                    C5061Kdb kdb = (C5061Kdb) next;
                    if (!kdb.ea() && kdb.da() == null) {
                        arrayList.add(next);
                    }
                }
                if (!arrayList.isEmpty()) {
                    sb2.append(" : ");
                    sb2.append(d("this"));
                    sb2.append(C7676xWa.a(arrayList, ", ", "(", ")", 0, null, Mob.a, 24, null));
                }
            }
        }
        if (J()) {
            List typeParameters2 = qcb.getTypeParameters();
            C7471uYa.a((Object) typeParameters2, str);
            a(typeParameters2, sb2);
        }
    }

    private final void a(List<? extends C4905Fdb> list, StringBuilder sb) {
        if (!W()) {
            ArrayList arrayList = new ArrayList(0);
            for (C4905Fdb fdb : list) {
                List upperBounds = fdb.getUpperBounds();
                C7471uYa.a((Object) upperBounds, "typeParameter.upperBounds");
                for (C7706xtb xtb : C7676xWa.c((Iterable) upperBounds, 1)) {
                    StringBuilder sb2 = new StringBuilder();
                    C7694xnb name = fdb.getName();
                    C7471uYa.a((Object) name, "typeParameter.name");
                    sb2.append(a(name, false));
                    sb2.append(" : ");
                    C7471uYa.a((Object) xtb, "it");
                    sb2.append(a(xtb));
                    arrayList.add(sb2.toString());
                }
            }
            if (!arrayList.isEmpty()) {
                String str = " ";
                sb.append(str);
                sb.append(d("where"));
                sb.append(str);
                C7676xWa.a(arrayList, sb, ", ", null, null, 0, null, null, 124, null);
            }
        }
    }

    private final void a(Collection<? extends C5061Kdb> collection, boolean z, StringBuilder sb) {
        boolean h = h(z);
        int size = collection.size();
        Q().a(size, sb);
        int i = 0;
        for (C5061Kdb kdb : collection) {
            Q().a(kdb, i, size, sb);
            a(kdb, h, sb, false);
            Q().b(kdb, i, size, sb);
            i++;
        }
        Q().b(size, sb);
    }

    /* JADX INFO: used method not loaded: pqb.a(Kdb):null, types can be incorrect */
    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0083, code lost:
        if ((c() ? r8.ea() : defpackage.C7148pqb.a(r8)) != false) goto L_0x0087;
     */
    public final void a(C5061Kdb kdb, boolean z, StringBuilder sb, boolean z2) {
        if (z2) {
            sb.append(d("value-parameter"));
            sb.append(" ");
        }
        if (R()) {
            sb.append("/*");
            sb.append(kdb.getIndex());
            sb.append("*/ ");
        }
        a(this, sb, (C5651beb) kdb, (C6451feb) null, 2, (Object) null);
        a(sb, kdb.ca(), "crossinline");
        a(sb, kdb.ba(), "noinline");
        boolean z3 = true;
        if (G()) {
            C4904Fcb e = kdb.e();
            if (!(e instanceof C4997Icb)) {
                e = null;
            }
            C4997Icb icb = (C4997Icb) e;
            if (icb != null && icb.S()) {
                a(sb, e(), "actual");
                a(sb, true, "val");
            }
        }
        a((C5123Mdb) kdb, z, sb, z2);
        if (k() != null) {
        }
        z3 = false;
        if (z3) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(" = ");
            _Xa k2 = k();
            if (k2 != null) {
                sb2.append((String) k2.invoke(kdb));
                sb.append(sb2.toString());
                return;
            }
            C7471uYa.a();
            throw null;
        }
    }

    private final void a(C5123Mdb mdb, boolean z, StringBuilder sb, boolean z2) {
        C7706xtb type = mdb.getType();
        C7471uYa.a((Object) type, "variable.type");
        C5061Kdb kdb = (C5061Kdb) (!(mdb instanceof C5061Kdb) ? null : mdb);
        C7706xtb da = kdb != null ? kdb.da() : null;
        C7706xtb xtb = da != null ? da : type;
        a(sb, da != null, "vararg");
        if (z2 && !L()) {
            b(mdb, sb);
        }
        if (z) {
            a((C5272Rcb) mdb, sb, z2);
            sb.append(": ");
        }
        sb.append(a(xtb));
        a(mdb, sb);
        if (R() && da != null) {
            sb.append(" /*");
            sb.append(a(type));
            sb.append("*/");
        }
    }

    /* access modifiers changed from: private */
    public final void a(C7408tdb tdb, StringBuilder sb) {
        String str = "property.typeParameters";
        if (!L()) {
            if (!K()) {
                b(tdb, sb);
                C5583aeb d = tdb.d();
                C7471uYa.a((Object) d, "property.visibility");
                a(d, sb);
                boolean z = false;
                a(sb, r().contains(Oob.CONST) && tdb.X(), "const");
                a((C5718cdb) tdb, sb);
                b((C4935Gcb) tdb, sb);
                c((C4935Gcb) tdb, sb);
                if (r().contains(Oob.LATEINIT) && tdb.Z()) {
                    z = true;
                }
                a(sb, z, "lateinit");
                a((C4935Gcb) tdb, sb);
            }
            b((C5123Mdb) tdb, sb);
            List typeParameters = tdb.getTypeParameters();
            C7471uYa.a((Object) typeParameters, str);
            a(typeParameters, sb, true);
            a((C4904Fcb) tdb, sb);
        }
        a((C5272Rcb) tdb, sb, true);
        sb.append(": ");
        C7706xtb type = tdb.getType();
        C7471uYa.a((Object) type, "property.type");
        sb.append(a(type));
        b((C4904Fcb) tdb, sb);
        a((C5123Mdb) tdb, sb);
        List typeParameters2 = tdb.getTypeParameters();
        C7471uYa.a((Object) typeParameters2, str);
        a(typeParameters2, sb);
    }

    private final void a(C5123Mdb mdb, StringBuilder sb) {
        if (q()) {
            Npb Y = mdb.Y();
            if (Y != null) {
                sb.append(" = ");
                C7471uYa.a((Object) Y, "constant");
                sb.append(b(a(Y)));
            }
        }
    }

    /* access modifiers changed from: private */
    public final void a(C4874Edb edb, StringBuilder sb) {
        a(this, sb, (C5651beb) edb, (C6451feb) null, 2, (Object) null);
        C5583aeb d = edb.d();
        C7471uYa.a((Object) d, "typeAlias.visibility");
        a(d, sb);
        a((C5718cdb) edb, sb);
        sb.append(d("typealias"));
        sb.append(" ");
        a((C5272Rcb) edb, sb, true);
        List B = edb.B();
        C7471uYa.a((Object) B, "typeAlias.declaredTypeParameters");
        a(B, sb, false);
        a((C5152Ncb) edb, sb);
        sb.append(" = ");
        sb.append(a((C7706xtb) edb.ga()));
    }

    private final void a(C5152Ncb ncb, StringBuilder sb) {
        List B = ncb.B();
        C7471uYa.a((Object) B, "classifier.declaredTypeParameters");
        Ptb Q = ncb.Q();
        C7471uYa.a((Object) Q, "classifier.typeConstructor");
        List parameters = Q.getParameters();
        C7471uYa.a((Object) parameters, "classifier.typeConstructor.parameters");
        if (R() && ncb.D() && parameters.size() > B.size()) {
            sb.append(" /*captured type parameters: ");
            b(sb, parameters.subList(B.size(), parameters.size()));
            sb.append("*/");
        }
    }

    /* access modifiers changed from: private */
    public final void a(C5029Jcb jcb, StringBuilder sb) {
        boolean z = jcb.g() == C5060Kcb.ENUM_ENTRY;
        String str = "klass.kind";
        if (!L()) {
            a(this, sb, (C5651beb) jcb, (C6451feb) null, 2, (Object) null);
            if (!z) {
                C5583aeb d = jcb.d();
                C7471uYa.a((Object) d, "klass.visibility");
                a(d, sb);
            }
            if (!(jcb.g() == C5060Kcb.INTERFACE && jcb.h() == C6314ddb.ABSTRACT)) {
                C5060Kcb g = jcb.g();
                C7471uYa.a((Object) g, str);
                if (!g.a() || jcb.h() != C6314ddb.FINAL) {
                    C6314ddb h = jcb.h();
                    C7471uYa.a((Object) h, "klass.modality");
                    a(h, sb, a((C5718cdb) jcb));
                }
            }
            a((C5718cdb) jcb, sb);
            a(sb, r().contains(Oob.INNER) && jcb.D(), "inner");
            a(sb, r().contains(Oob.DATA) && jcb.N(), "data");
            a(sb, r().contains(Oob.INLINE) && jcb.isInline(), "inline");
            b(jcb, sb);
        }
        if (!C6531gpb.k(jcb)) {
            if (!L()) {
                a(sb);
            }
            a((C5272Rcb) jcb, sb, true);
        } else {
            a((C5272Rcb) jcb, sb);
        }
        if (!z) {
            List B = jcb.B();
            C7471uYa.a((Object) B, "klass.declaredTypeParameters");
            a(B, sb, false);
            a((C5152Ncb) jcb, sb);
            C5060Kcb g2 = jcb.g();
            C7471uYa.a((Object) g2, str);
            if (!g2.a() && i()) {
                C4997Icb F = jcb.F();
                if (F != null) {
                    sb.append(" ");
                    a(this, sb, (C5651beb) F, (C6451feb) null, 2, (Object) null);
                    C5583aeb d2 = F.d();
                    C7471uYa.a((Object) d2, "primaryConstructor.visibility");
                    a(d2, sb);
                    sb.append(d("constructor"));
                    List f = F.f();
                    C7471uYa.a((Object) f, "primaryConstructor.valueParameters");
                    a((Collection<? extends C5061Kdb>) f, F.o(), sb);
                }
            }
            c(jcb, sb);
            a(B, sb);
        }
    }

    /* access modifiers changed from: private */
    public final void a(C7132pdb pdb, StringBuilder sb) {
        a(pdb.q(), "package", sb);
        if (c()) {
            sb.append(" in context of ");
            a((C5272Rcb) pdb.sa(), sb, false);
        }
    }

    /* access modifiers changed from: private */
    public final void a(C6790kdb kdb, StringBuilder sb) {
        a(kdb.q(), "package-fragment", sb);
        if (c()) {
            sb.append(" in ");
            a((C5272Rcb) kdb.e(), sb, false);
        }
    }

    private final void a(C7349snb snb, String str, StringBuilder sb) {
        sb.append(d(str));
        C7487unb g = snb.g();
        C7471uYa.a((Object) g, "fqName.toUnsafe()");
        String a2 = a(g);
        if (a2.length() > 0) {
            sb.append(" ");
            sb.append(a2);
        }
    }

    /* access modifiers changed from: private */
    public final void a(C7339sdb sdb, StringBuilder sb) {
        a((C5718cdb) sdb, sb);
    }

    private final void a(StringBuilder sb) {
        int length = sb.length();
        if (length == 0 || sb.charAt(length - 1) != ' ') {
            sb.append(' ');
        }
    }

    private final String a(String str, String str2, String str3, String str4, String str5) {
        if (Cxb.b(str, str2, false, 2, null) && Cxb.b(str3, str4, false, 2, null)) {
            int length = str2.length();
            String str6 = "null cannot be cast to non-null type java.lang.String";
            if (str != null) {
                String substring = str.substring(length);
                String str7 = "(this as java.lang.String).substring(startIndex)";
                C7471uYa.a((Object) substring, str7);
                int length2 = str4.length();
                if (str3 != null) {
                    String substring2 = str3.substring(length2);
                    C7471uYa.a((Object) substring2, str7);
                    StringBuilder sb = new StringBuilder();
                    sb.append(str5);
                    sb.append(substring);
                    String sb2 = sb.toString();
                    if (C7471uYa.a((Object) substring, (Object) substring2)) {
                        return sb2;
                    }
                    if (a(substring, substring2)) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(sb2);
                        sb3.append("!");
                        return sb3.toString();
                    }
                } else {
                    throw new OVa(str6);
                }
            } else {
                throw new OVa(str6);
            }
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0032, code lost:
        if (defpackage.C7471uYa.a((java.lang.Object) r0.toString(), (java.lang.Object) r8) == false) goto L_0x0034;
     */
    private final boolean a(String str, String str2) {
        if (!C7471uYa.a((Object) str, (Object) Cxb.a(str2, "?", "", false, 4, (Object) null))) {
            if (Cxb.a(str2, "?", false, 2, null)) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append('?');
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append('(');
            sb2.append(str);
            sb2.append(")?");
            if (!C7471uYa.a((Object) sb2.toString(), (Object) str2)) {
                return false;
            }
        }
        return true;
    }

    private final boolean a(C4935Gcb gcb) {
        return !gcb.j().isEmpty();
    }
}
