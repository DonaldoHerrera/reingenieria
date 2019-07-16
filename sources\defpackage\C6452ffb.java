package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: ffb reason: default package and case insensitive filesystem */
/* compiled from: LazySubstitutingClassDescriptor */
public class C6452ffb implements C5029Jcb {
    private final C5029Jcb a;
    private final _tb b;
    private _tb c;
    private List<C4905Fdb> d;
    private List<C4905Fdb> e;
    private Ptb f;

    public C6452ffb(C5029Jcb jcb, _tb _tb) {
        this.a = jcb;
        this.b = _tb;
    }

    private static /* synthetic */ void a(int i) {
        String str = (i == 2 || i == 5 || i == 17) ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[((i == 2 || i == 5 || i == 17) ? 3 : 2)];
        String str2 = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazySubstitutingClassDescriptor";
        if (i == 2) {
            objArr[0] = "typeArguments";
        } else if (i == 5) {
            objArr[0] = "typeSubstitution";
        } else if (i != 17) {
            objArr[0] = str2;
        } else {
            objArr[0] = "substitutor";
        }
        String str3 = "substitute";
        String str4 = "getMemberScope";
        switch (i) {
            case 2:
            case 5:
            case 17:
                objArr[1] = str2;
                break;
            case 3:
            case 4:
            case 6:
            case 7:
                objArr[1] = str4;
                break;
            case 8:
            case 9:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 10:
                objArr[1] = "getStaticScope";
                break;
            case 11:
                objArr[1] = "getDefaultType";
                break;
            case 12:
                objArr[1] = "getConstructors";
                break;
            case 13:
                objArr[1] = "getAnnotations";
                break;
            case 14:
                objArr[1] = "getName";
                break;
            case 15:
                objArr[1] = "getOriginal";
                break;
            case 16:
                objArr[1] = "getContainingDeclaration";
                break;
            case 18:
            case 19:
                objArr[1] = str3;
                break;
            case 20:
                objArr[1] = "getKind";
                break;
            case 21:
                objArr[1] = "getModality";
                break;
            case 22:
                objArr[1] = "getVisibility";
                break;
            case 23:
                objArr[1] = "getUnsubstitutedInnerClassesScope";
                break;
            case 24:
                objArr[1] = "getSource";
                break;
            case 25:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 26:
                objArr[1] = "getSealedSubclasses";
                break;
            default:
                objArr[1] = "getTypeConstructor";
                break;
        }
        if (i == 2 || i == 5) {
            objArr[2] = str4;
        } else if (i == 17) {
            objArr[2] = str3;
        }
        String format = String.format(str, objArr);
        throw ((i == 2 || i == 5 || i == 17) ? new IllegalArgumentException(format) : new IllegalStateException(format));
    }

    public List<C4905Fdb> B() {
        a();
        List<C4905Fdb> list = this.e;
        if (list != null) {
            return list;
        }
        a(25);
        throw null;
    }

    public Collection<C5029Jcb> C() {
        Collection<C5029Jcb> C = this.a.C();
        if (C != null) {
            return C;
        }
        a(26);
        throw null;
    }

    public boolean D() {
        return this.a.D();
    }

    public C4997Icb F() {
        return this.a.F();
    }

    public Eqb H() {
        Eqb H = this.a.H();
        if (H != null) {
            return H;
        }
        a(23);
        throw null;
    }

    public Eqb J() {
        Eqb J = this.a.J();
        if (!this.b.b()) {
            return new Kqb(J, a());
        }
        if (J != null) {
            return J;
        }
        a(8);
        throw null;
    }

    public boolean K() {
        return this.a.K();
    }

    public Eqb L() {
        Eqb L = this.a.L();
        if (L != null) {
            return L;
        }
        a(10);
        throw null;
    }

    public C5029Jcb M() {
        return this.a.M();
    }

    public boolean N() {
        return this.a.N();
    }

    public C7615wdb O() {
        throw new UnsupportedOperationException();
    }

    public Ptb Q() {
        Ptb Q = this.a.Q();
        if (!this.b.b()) {
            if (this.f == null) {
                _tb a2 = a();
                Collection<C7706xtb> b2 = Q.b();
                ArrayList arrayList = new ArrayList(b2.size());
                for (C7706xtb b3 : b2) {
                    arrayList.add(a2.b(b3, C6473fub.INVARIANT));
                }
                this.f = new C6335dtb(this, this.d, arrayList, Jsb.b);
            }
            Ptb ptb = this.f;
            if (ptb != null) {
                return ptb;
            }
            a(1);
            throw null;
        } else if (Q != null) {
            return Q;
        } else {
            a(0);
            throw null;
        }
    }

    public C5583aeb d() {
        C5583aeb d2 = this.a.d();
        if (d2 != null) {
            return d2;
        }
        a(22);
        throw null;
    }

    public C5272Rcb e() {
        C5272Rcb e2 = this.a.e();
        if (e2 != null) {
            return e2;
        }
        a(16);
        throw null;
    }

    public C5060Kcb g() {
        C5060Kcb g = this.a.g();
        if (g != null) {
            return g;
        }
        a(20);
        throw null;
    }

    public C6723jeb getAnnotations() {
        C6723jeb annotations = this.a.getAnnotations();
        if (annotations != null) {
            return annotations;
        }
        a(13);
        throw null;
    }

    public C7694xnb getName() {
        C7694xnb name = this.a.getName();
        if (name != null) {
            return name;
        }
        a(14);
        throw null;
    }

    public C7822zdb getSource() {
        C7822zdb zdb = C7822zdb.a;
        if (zdb != null) {
            return zdb;
        }
        a(24);
        throw null;
    }

    public C6314ddb h() {
        C6314ddb h = this.a.h();
        if (h != null) {
            return h;
        }
        a(21);
        throw null;
    }

    public Collection<C4997Icb> i() {
        Collection<C4997Icb> i = this.a.i();
        ArrayList arrayList = new ArrayList(i.size());
        for (C4997Icb icb : i) {
            arrayList.add(icb.a(this, icb.h(), icb.d(), icb.g(), false).a(a()));
        }
        return arrayList;
    }

    public boolean isInline() {
        return this.a.isInline();
    }

    public boolean m() {
        return this.a.m();
    }

    public boolean n() {
        return this.a.n();
    }

    public boolean p() {
        return this.a.p();
    }

    public Etb z() {
        Etb a2 = C7775ytb.a(getAnnotations(), this, C5605aub.a(Q().getParameters()));
        if (a2 != null) {
            return a2;
        }
        a(11);
        throw null;
    }

    private _tb a() {
        if (this.c == null) {
            if (this.b.b()) {
                this.c = this.b;
            } else {
                List parameters = this.a.Q().getParameters();
                this.d = new ArrayList(parameters.size());
                this.c = C6743jtb.a(parameters, this.b.a(), this, this.d);
                this.e = C7676xWa.c((Iterable) this.d, (_Xa) new C6384efb(this));
            }
        }
        return this.c;
    }

    public C5029Jcb getOriginal() {
        C5029Jcb original = this.a.getOriginal();
        if (original != null) {
            return original;
        }
        a(15);
        throw null;
    }

    public Eqb a(Wtb wtb) {
        if (wtb != null) {
            Eqb a2 = this.a.a(wtb);
            if (!this.b.b()) {
                return new Kqb(a2, a());
            }
            if (a2 != null) {
                return a2;
            }
            a(6);
            throw null;
        }
        a(5);
        throw null;
    }

    public C5029Jcb a(_tb _tb) {
        if (_tb == null) {
            a(17);
            throw null;
        } else if (_tb.b()) {
            return this;
        } else {
            return new C6452ffb(this, _tb.a(_tb.a(), a().a()));
        }
    }

    public <R, D> R a(C5332Tcb<R, D> tcb, D d2) {
        return tcb.a((C5029Jcb) this, d2);
    }
}
