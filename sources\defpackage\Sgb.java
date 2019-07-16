package defpackage;

import java.util.List;

/* renamed from: Sgb reason: default package */
/* compiled from: JavaPropertyDescriptor */
public class Sgb extends C7065ofb implements Ngb {
    private final boolean A;
    private final HVa<a<?>, ?> B;

    private Sgb(C5272Rcb rcb, C6723jeb jeb, C6314ddb ddb, C5583aeb aeb, boolean z, C7694xnb xnb, C7822zdb zdb, C7408tdb tdb, a aVar, boolean z2, HVa<a<?>, ?> hVa) {
        if (rcb == null) {
            g(0);
            throw null;
        } else if (jeb == null) {
            g(1);
            throw null;
        } else if (ddb == null) {
            g(2);
            throw null;
        } else if (aeb == null) {
            g(3);
            throw null;
        } else if (xnb == null) {
            g(4);
            throw null;
        } else if (zdb == null) {
            g(5);
            throw null;
        } else if (aVar != null) {
            super(rcb, tdb, jeb, ddb, aeb, z, xnb, aVar, zdb, false, false, false, false, false, false);
            this.A = z2;
            this.B = hVa;
        } else {
            g(6);
            throw null;
        }
    }

    public static Sgb a(C5272Rcb rcb, C6723jeb jeb, C6314ddb ddb, C5583aeb aeb, boolean z, C7694xnb xnb, C7822zdb zdb, boolean z2) {
        if (rcb == null) {
            g(7);
            throw null;
        } else if (jeb == null) {
            g(8);
            throw null;
        } else if (ddb == null) {
            g(9);
            throw null;
        } else if (aeb == null) {
            g(10);
            throw null;
        } else if (xnb == null) {
            g(11);
            throw null;
        } else if (zdb != null) {
            Sgb sgb = new Sgb(rcb, jeb, ddb, aeb, z, xnb, zdb, null, a.DECLARATION, z2, null);
            return sgb;
        } else {
            g(12);
            throw null;
        }
    }

    private static /* synthetic */ void g(int i) {
        String str = (i == 13 || i == 19 || i == 22) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i == 13 || i == 19 || i == 22) ? 2 : 3)];
        String str2 = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaPropertyDescriptor";
        switch (i) {
            case 1:
            case 8:
                objArr[0] = "annotations";
                break;
            case 2:
            case 9:
                objArr[0] = "modality";
                break;
            case 3:
            case 10:
                objArr[0] = "visibility";
                break;
            case 4:
            case 11:
                objArr[0] = "name";
                break;
            case 5:
            case 12:
                objArr[0] = "source";
                break;
            case 6:
            case 17:
                objArr[0] = "kind";
                break;
            case 13:
            case 19:
            case 22:
                objArr[0] = str2;
                break;
            case 14:
                objArr[0] = "newOwner";
                break;
            case 15:
                objArr[0] = "newModality";
                break;
            case 16:
                objArr[0] = "newVisibility";
                break;
            case 18:
                objArr[0] = "newName";
                break;
            case 20:
                objArr[0] = "enhancedValueParametersData";
                break;
            case 21:
                objArr[0] = "enhancedReturnType";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        String str3 = "enhance";
        String str4 = "createSubstitutedCopy";
        String str5 = "create";
        if (i == 13) {
            objArr[1] = str5;
        } else if (i == 19) {
            objArr[1] = str4;
        } else if (i != 22) {
            objArr[1] = str2;
        } else {
            objArr[1] = str3;
        }
        switch (i) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                objArr[2] = str5;
                break;
            case 13:
            case 19:
            case 22:
                break;
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                objArr[2] = str4;
                break;
            case 20:
            case 21:
                objArr[2] = str3;
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        throw ((i == 13 || i == 19 || i == 22) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    public boolean X() {
        C7706xtb type = getType();
        return this.A && C5182Ocb.a(type) && (!C6593hkb.a(type) || C5301Sbb.v(type));
    }

    public boolean o() {
        return false;
    }

    /* access modifiers changed from: protected */
    public C7065ofb a(C5272Rcb rcb, C6314ddb ddb, C5583aeb aeb, C7408tdb tdb, a aVar, C7694xnb xnb) {
        if (rcb == null) {
            g(14);
            throw null;
        } else if (ddb == null) {
            g(15);
            throw null;
        } else if (aeb == null) {
            g(16);
            throw null;
        } else if (aVar == null) {
            g(17);
            throw null;
        } else if (xnb != null) {
            Sgb sgb = new Sgb(rcb, getAnnotations(), ddb, aeb, V(), xnb, C7822zdb.a, tdb, aVar, this.A, this.B);
            return sgb;
        } else {
            g(18);
            throw null;
        }
    }

    public Ngb a(C7706xtb xtb, List<Wgb> list, C7706xtb xtb2, HVa<a<?>, ?> hVa) {
        C7134pfb pfb;
        C7203qfb qfb;
        C7615wdb wdb;
        C7706xtb xtb3 = xtb;
        C7706xtb xtb4 = xtb2;
        if (list == null) {
            g(20);
            throw null;
        } else if (xtb4 != null) {
            Sgb sgb = r4;
            Sgb sgb2 = new Sgb(e(), getAnnotations(), h(), d(), V(), getName(), getSource(), getOriginal() == this ? null : getOriginal(), g(), this.A, hVa);
            C7134pfb b = b();
            if (b != null) {
                pfb = r4;
                C7134pfb pfb2 = new C7134pfb(sgb, b.getAnnotations(), b.h(), b.d(), b.G(), b.n(), b.isInline(), g(), b, b.getSource());
                pfb.a(b.u());
                pfb.a(xtb4);
            } else {
                pfb = null;
            }
            C7546vdb c = c();
            if (c != null) {
                C7203qfb qfb2 = r4;
                C7203qfb qfb3 = new C7203qfb(sgb, c.getAnnotations(), c.h(), c.d(), c.G(), c.n(), c.isInline(), g(), c, c.getSource());
                qfb = qfb2;
                qfb.a(qfb2.u());
                qfb.a((C5061Kdb) c.f().get(0));
            } else {
                qfb = null;
            }
            Sgb sgb3 = sgb;
            sgb3.a(pfb, (C7546vdb) qfb, U(), R());
            sgb3.a(ta());
            Qsb<Npb<?>> qsb = this.g;
            if (qsb != null) {
                sgb3.a(qsb);
            }
            sgb3.a(j());
            if (xtb3 == null) {
                wdb = null;
            } else {
                wdb = C6463fpb.a((C4904Fcb) this, xtb3, C6723jeb.c.a());
            }
            sgb3.a(xtb4, getTypeParameters(), k(), wdb);
            return sgb3;
        } else {
            g(21);
            throw null;
        }
    }
}
