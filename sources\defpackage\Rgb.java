package defpackage;

import java.util.List;
import java.util.Map;

/* renamed from: Rgb reason: default package */
/* compiled from: JavaMethodDescriptor */
public class Rgb extends C7341sfb implements Ngb {
    public static final defpackage.C4904Fcb.a<C5061Kdb> D = new Qgb();
    private a E;

    /* renamed from: Rgb$a */
    /* compiled from: JavaMethodDescriptor */
    private enum a {
        NON_STABLE_DECLARED(false, false),
        STABLE_DECLARED(true, false),
        NON_STABLE_SYNTHESIZED(false, true),
        STABLE_SYNTHESIZED(true, true);
        
        public final boolean f;
        public final boolean g;

        private a(boolean z, boolean z2) {
            this.f = z;
            this.g = z2;
        }

        public static a a(boolean z, boolean z2) {
            a aVar = z ? z2 ? STABLE_SYNTHESIZED : STABLE_DECLARED : z2 ? NON_STABLE_SYNTHESIZED : NON_STABLE_DECLARED;
            if (aVar != null) {
                return aVar;
            }
            a(0);
            throw null;
        }
    }

    protected Rgb(C5272Rcb rcb, C7684xdb xdb, C6723jeb jeb, C7694xnb xnb, defpackage.C4935Gcb.a aVar, C7822zdb zdb) {
        if (rcb == null) {
            f(0);
            throw null;
        } else if (jeb == null) {
            f(1);
            throw null;
        } else if (xnb == null) {
            f(2);
            throw null;
        } else if (aVar == null) {
            f(3);
            throw null;
        } else if (zdb != null) {
            super(rcb, xdb, jeb, xnb, aVar, zdb);
            this.E = null;
        } else {
            f(4);
            throw null;
        }
    }

    private static /* synthetic */ void f(int i) {
        String str = (i == 9 || i == 13 || i == 18 || i == 21) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i == 9 || i == 13 || i == 18 || i == 21) ? 2 : 3)];
        String str2 = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaMethodDescriptor";
        switch (i) {
            case 1:
            case 6:
            case 16:
                objArr[0] = "annotations";
                break;
            case 2:
            case 7:
                objArr[0] = "name";
                break;
            case 3:
            case 15:
                objArr[0] = "kind";
                break;
            case 4:
            case 8:
            case 17:
                objArr[0] = "source";
                break;
            case 9:
            case 13:
            case 18:
            case 21:
                objArr[0] = str2;
                break;
            case 10:
                objArr[0] = "typeParameters";
                break;
            case 11:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 12:
                objArr[0] = "visibility";
                break;
            case 14:
                objArr[0] = "newOwner";
                break;
            case 19:
                objArr[0] = "enhancedValueParametersData";
                break;
            case 20:
                objArr[0] = "enhancedReturnType";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        String str3 = "enhance";
        String str4 = "createSubstitutedCopy";
        String str5 = "initialize";
        String str6 = "createJavaMethod";
        if (i == 9) {
            objArr[1] = str6;
        } else if (i == 13) {
            objArr[1] = str5;
        } else if (i == 18) {
            objArr[1] = str4;
        } else if (i != 21) {
            objArr[1] = str2;
        } else {
            objArr[1] = str3;
        }
        switch (i) {
            case 5:
            case 6:
            case 7:
            case 8:
                objArr[2] = str6;
                break;
            case 9:
            case 13:
            case 18:
            case 21:
                break;
            case 10:
            case 11:
            case 12:
                objArr[2] = str5;
                break;
            case 14:
            case 15:
            case 16:
            case 17:
                objArr[2] = str4;
                break;
            case 19:
            case 20:
                objArr[2] = str3;
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        throw ((i == 9 || i == 13 || i == 18 || i == 21) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    public boolean o() {
        return this.E.g;
    }

    public boolean ta() {
        return this.E.f;
    }

    public static Rgb a(C5272Rcb rcb, C6723jeb jeb, C7694xnb xnb, C7822zdb zdb) {
        if (rcb == null) {
            f(5);
            throw null;
        } else if (jeb == null) {
            f(6);
            throw null;
        } else if (xnb == null) {
            f(7);
            throw null;
        } else if (zdb != null) {
            Rgb rgb = new Rgb(rcb, null, jeb, xnb, defpackage.C4935Gcb.a.DECLARATION, zdb);
            return rgb;
        } else {
            f(8);
            throw null;
        }
    }

    public C7341sfb a(C7615wdb wdb, C7615wdb wdb2, List<? extends C4905Fdb> list, List<C5061Kdb> list2, C7706xtb xtb, C6314ddb ddb, C5583aeb aeb, Map<? extends defpackage.C4904Fcb.a<?>, ?> map) {
        if (list == null) {
            f(10);
            throw null;
        } else if (list2 == null) {
            f(11);
            throw null;
        } else if (aeb != null) {
            super.a(wdb, wdb2, list, list2, xtb, ddb, aeb, map);
            h(C6339dvb.b.a(this).a());
            return this;
        } else {
            f(12);
            throw null;
        }
    }

    public void a(boolean z, boolean z2) {
        this.E = a.a(z, z2);
    }

    /* access modifiers changed from: protected */
    public Rgb a(C5272Rcb rcb, C5582adb adb, defpackage.C4935Gcb.a aVar, C7694xnb xnb, C6723jeb jeb, C7822zdb zdb) {
        if (rcb == null) {
            f(14);
            throw null;
        } else if (aVar == null) {
            f(15);
            throw null;
        } else if (jeb == null) {
            f(16);
            throw null;
        } else if (zdb != null) {
            C7684xdb xdb = (C7684xdb) adb;
            if (xnb == null) {
                xnb = getName();
            }
            Rgb rgb = new Rgb(rcb, xdb, jeb, xnb, aVar, zdb);
            rgb.a(ta(), o());
            return rgb;
        } else {
            f(17);
            throw null;
        }
    }

    public Rgb a(C7706xtb xtb, List<Wgb> list, C7706xtb xtb2, HVa<defpackage.C4904Fcb.a<?>, ?> hVa) {
        C7615wdb wdb;
        if (list == null) {
            f(19);
            throw null;
        } else if (xtb2 != null) {
            List a2 = Vgb.a(list, f(), this);
            if (xtb == null) {
                wdb = null;
            } else {
                wdb = C6463fpb.a((C4904Fcb) this, xtb, C6723jeb.c.a());
            }
            Rgb rgb = (Rgb) x().a(a2).a(xtb2).b(wdb).a().d().build();
            if (hVa != null) {
                rgb.a((defpackage.C4904Fcb.a) hVa.c(), hVa.d());
            }
            if (rgb != null) {
                return rgb;
            }
            f(21);
            throw null;
        } else {
            f(20);
            throw null;
        }
    }
}
