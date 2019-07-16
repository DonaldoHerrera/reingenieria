package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

/* renamed from: aub reason: default package and case insensitive filesystem */
/* compiled from: TypeUtils */
public class C5605aub {
    public static final Etb a = C7154ptb.f("DONT_CARE");
    public static final Etb b = C7154ptb.c("Cannot be inferred");
    public static final Etb c = new a("NO_EXPECTED_TYPE");
    public static final Etb d = new a("UNIT_EXPECTED_TYPE");

    /* renamed from: aub$a */
    /* compiled from: TypeUtils */
    public static class a extends C6607htb {
        private final String a;

        public a(String str) {
            this.a = str;
        }

        private static /* synthetic */ void a(int i) {
            String str = i != 1 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[(i != 1 ? 3 : 2)];
            String str2 = "kotlin/reflect/jvm/internal/impl/types/TypeUtils$SpecialType";
            if (i != 1) {
                objArr[0] = "newAnnotations";
            } else {
                objArr[0] = str2;
            }
            if (i != 1) {
                objArr[1] = str2;
            } else {
                objArr[1] = "toString";
            }
            if (i != 1) {
                objArr[2] = "replaceAnnotations";
            }
            String format = String.format(str, objArr);
            throw (i != 1 ? new IllegalArgumentException(format) : new IllegalStateException(format));
        }

        /* access modifiers changed from: protected */
        public Etb Ca() {
            throw new IllegalStateException(this.a);
        }

        public String toString() {
            String str = this.a;
            if (str != null) {
                return str;
            }
            a(1);
            throw null;
        }

        public Etb a(C6723jeb jeb) {
            if (jeb == null) {
                a(0);
                throw null;
            }
            throw new IllegalStateException(this.a);
        }

        public Etb a(boolean z) {
            throw new IllegalStateException(this.a);
        }
    }

    public static C7706xtb a(C7706xtb xtb, boolean z) {
        if (xtb != null) {
            C6405eub a2 = xtb.Ba().a(z);
            if (a2 != null) {
                return a2;
            }
            a(6);
            throw null;
        }
        a(5);
        throw null;
    }

    private static /* synthetic */ void a(int i) {
        String str;
        int i2;
        Throwable th;
        int i3 = i;
        if (!(i3 == 2 || i3 == 4 || i3 == 6 || i3 == 17 || i3 == 19 || i3 == 26 || i3 == 33 || i3 == 36 || i3 == 47 || i3 == 49 || i3 == 8 || i3 == 9 || i3 == 11 || i3 == 12 || i3 == 14 || i3 == 15)) {
            switch (i3) {
                case 54:
                case 55:
                case 56:
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
        }
        str = "@NotNull method %s.%s must not return null";
        if (!(i3 == 2 || i3 == 4 || i3 == 6 || i3 == 17 || i3 == 19 || i3 == 26 || i3 == 33 || i3 == 36 || i3 == 47 || i3 == 49 || i3 == 8 || i3 == 9 || i3 == 11 || i3 == 12 || i3 == 14 || i3 == 15)) {
            switch (i3) {
                case 54:
                case 55:
                case 56:
                    break;
                default:
                    i2 = 3;
                    break;
            }
        }
        i2 = 2;
        Object[] objArr = new Object[i2];
        switch (i3) {
            case 2:
            case 4:
            case 6:
            case 8:
            case 9:
            case 11:
            case 12:
            case 14:
            case 15:
            case 17:
            case 19:
            case 26:
            case 33:
            case 36:
            case 47:
            case 49:
            case 54:
            case 55:
            case 56:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeUtils";
                break;
            case 16:
                objArr[0] = "parameters";
                break;
            case 20:
                objArr[0] = "subType";
                break;
            case 21:
                objArr[0] = "superType";
                break;
            case 22:
                objArr[0] = "substitutor";
                break;
            case 24:
                objArr[0] = "result";
                break;
            case 31:
            case 34:
                objArr[0] = "clazz";
                break;
            case 32:
                objArr[0] = "typeArguments";
                break;
            case 35:
                objArr[0] = "projections";
                break;
            case 37:
                objArr[0] = "a";
                break;
            case 38:
                objArr[0] = "b";
                break;
            case 40:
                objArr[0] = "typeParameters";
                break;
            case 42:
                objArr[0] = "typeParameterConstructors";
                break;
            case 43:
                objArr[0] = "specialType";
                break;
            case 44:
            case 45:
                objArr[0] = "isSpecialType";
                break;
            case 46:
                objArr[0] = "parameterDescriptor";
                break;
            case 48:
            case 52:
                objArr[0] = "numberValueTypeConstructor";
                break;
            case 50:
            case 51:
                objArr[0] = "supertypes";
                break;
            case 53:
                objArr[0] = "expectedType";
                break;
            default:
                objArr[0] = C1325gg.TYPE;
                break;
        }
        if (i3 == 2) {
            objArr[1] = "makeNullable";
        } else if (i3 == 4) {
            objArr[1] = "makeNotNullable";
        } else if (i3 == 6) {
            objArr[1] = "makeNullableAsSpecified";
        } else if (i3 == 17) {
            objArr[1] = "getDefaultTypeProjections";
        } else if (i3 == 19) {
            objArr[1] = "getImmediateSupertypes";
        } else if (i3 == 26) {
            objArr[1] = "getAllSupertypes";
        } else if (i3 == 33) {
            objArr[1] = "substituteParameters";
        } else if (i3 == 36) {
            objArr[1] = "substituteProjectionsForParameters";
        } else if (i3 == 47) {
            objArr[1] = "makeStarProjection";
        } else if (i3 != 49) {
            if (i3 != 8 && i3 != 9 && i3 != 11 && i3 != 12) {
                if (i3 != 14 && i3 != 15) {
                    switch (i3) {
                        case 54:
                        case 55:
                        case 56:
                            objArr[1] = "getPrimitiveNumberType";
                            break;
                        default:
                            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/TypeUtils";
                            break;
                    }
                } else {
                    objArr[1] = "makeUnsubstitutedType";
                }
            } else {
                objArr[1] = "makeNullableIfNeeded";
            }
        } else {
            objArr[1] = "getDefaultPrimitiveNumberType";
        }
        switch (i3) {
            case 1:
                objArr[2] = "makeNullable";
                break;
            case 2:
            case 4:
            case 6:
            case 8:
            case 9:
            case 11:
            case 12:
            case 14:
            case 15:
            case 17:
            case 19:
            case 26:
            case 33:
            case 36:
            case 47:
            case 49:
            case 54:
            case 55:
            case 56:
                break;
            case 3:
                objArr[2] = "makeNotNullable";
                break;
            case 5:
                objArr[2] = "makeNullableAsSpecified";
                break;
            case 7:
            case 10:
                objArr[2] = "makeNullableIfNeeded";
                break;
            case 13:
                objArr[2] = "canHaveSubtypes";
                break;
            case 16:
                objArr[2] = "getDefaultTypeProjections";
                break;
            case 18:
                objArr[2] = "getImmediateSupertypes";
                break;
            case 20:
            case 21:
            case 22:
                objArr[2] = "createSubstitutedSupertype";
                break;
            case 23:
            case 24:
                objArr[2] = "collectAllSupertypes";
                break;
            case 25:
                objArr[2] = "getAllSupertypes";
                break;
            case 27:
                objArr[2] = "isNullableType";
                break;
            case 28:
                objArr[2] = "acceptsNullable";
                break;
            case 29:
                objArr[2] = "hasNullableSuperType";
                break;
            case 30:
                objArr[2] = "getClassDescriptor";
                break;
            case 31:
            case 32:
                objArr[2] = "substituteParameters";
                break;
            case 34:
            case 35:
                objArr[2] = "substituteProjectionsForParameters";
                break;
            case 37:
            case 38:
                objArr[2] = "equalTypes";
                break;
            case 39:
            case 40:
                objArr[2] = "dependsOnTypeParameters";
                break;
            case 41:
            case 42:
                objArr[2] = "dependsOnTypeConstructors";
                break;
            case 43:
            case 44:
            case 45:
                objArr[2] = "contains";
                break;
            case 46:
                objArr[2] = "makeStarProjection";
                break;
            case 48:
            case 50:
                objArr[2] = "getDefaultPrimitiveNumberType";
                break;
            case 51:
                objArr[2] = "findByFqName";
                break;
            case 52:
            case 53:
                objArr[2] = "getPrimitiveNumberType";
                break;
            case 57:
                objArr[2] = "isTypeParameter";
                break;
            case 58:
                objArr[2] = "isReifiedTypeParameter";
                break;
            case 59:
                objArr[2] = "isNonReifiedTypeParameter";
                break;
            case 60:
                objArr[2] = "getTypeParameterDescriptorOrNull";
                break;
            default:
                objArr[2] = "noExpectedType";
                break;
        }
        String format = String.format(str, objArr);
        if (!(i3 == 2 || i3 == 4 || i3 == 6 || i3 == 17 || i3 == 19 || i3 == 26 || i3 == 33 || i3 == 36 || i3 == 47 || i3 == 49 || i3 == 8 || i3 == 9 || i3 == 11 || i3 == 12 || i3 == 14 || i3 == 15)) {
            switch (i3) {
                case 54:
                case 55:
                case 56:
                    break;
                default:
                    th = new IllegalArgumentException(format);
                    break;
            }
        }
        th = new IllegalStateException(format);
        throw th;
    }

    public static C7706xtb b(C7706xtb xtb, boolean z) {
        if (xtb == null) {
            a(10);
            throw null;
        } else if (z) {
            C7706xtb j = j(xtb);
            if (j != null) {
                return j;
            }
            a(11);
            throw null;
        } else if (xtb != null) {
            return xtb;
        } else {
            a(12);
            throw null;
        }
    }

    public static List<C7706xtb> c(C7706xtb xtb) {
        if (xtb != null) {
            _tb a2 = _tb.a(xtb);
            Collection<C7706xtb> b2 = xtb.za().b();
            ArrayList arrayList = new ArrayList(b2.size());
            for (C7706xtb a3 : b2) {
                C7706xtb a4 = a(xtb, a3, a2);
                if (a4 != null) {
                    arrayList.add(a4);
                }
            }
            return arrayList;
        }
        a(18);
        throw null;
    }

    public static C4905Fdb d(C7706xtb xtb) {
        if (xtb == null) {
            a(60);
            throw null;
        } else if (xtb.za().c() instanceof C4905Fdb) {
            return (C4905Fdb) xtb.za().c();
        } else {
            return null;
        }
    }

    public static boolean e(C7706xtb xtb) {
        if (xtb == null) {
            a(29);
            throw null;
        } else if (xtb.za().c() instanceof C5029Jcb) {
            return false;
        } else {
            for (C7706xtb g : c(xtb)) {
                if (g(g)) {
                    return true;
                }
            }
            return false;
        }
    }

    public static boolean f(C7706xtb xtb) {
        return xtb != null && xtb.za() == a.za();
    }

    public static boolean g(C7706xtb xtb) {
        if (xtb == null) {
            a(27);
            throw null;
        } else if (xtb.Aa()) {
            return true;
        } else {
            if (C7430ttb.b(xtb) && g(C7430ttb.a(xtb).Ea())) {
                return true;
            }
            if (h(xtb)) {
                return e(xtb);
            }
            Ptb za = xtb.za();
            if (za instanceof C7637wtb) {
                for (C7706xtb g : za.b()) {
                    if (g(g)) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    public static boolean h(C7706xtb xtb) {
        if (xtb == null) {
            a(57);
            throw null;
        } else if (d(xtb) != null) {
            return true;
        } else {
            xtb.za();
            return false;
        }
    }

    public static C7706xtb i(C7706xtb xtb) {
        if (xtb != null) {
            C7706xtb a2 = a(xtb, false);
            if (a2 != null) {
                return a2;
            }
            a(4);
            throw null;
        }
        a(3);
        throw null;
    }

    public static C7706xtb j(C7706xtb xtb) {
        if (xtb != null) {
            C7706xtb a2 = a(xtb, true);
            if (a2 != null) {
                return a2;
            }
            a(2);
            throw null;
        }
        a(1);
        throw null;
    }

    public static boolean k(C7706xtb xtb) {
        if (xtb != null) {
            return xtb == c || xtb == d;
        }
        a(0);
        throw null;
    }

    public static Etb a(C5122Mcb mcb, Eqb eqb) {
        if (C7154ptb.a((C5272Rcb) mcb)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Unsubstituted type for ");
            sb.append(mcb);
            Etb c2 = C7154ptb.c(sb.toString());
            if (c2 != null) {
                return c2;
            }
            a(14);
            throw null;
        }
        Ptb Q = mcb.Q();
        Etb a2 = C7775ytb.a(C6723jeb.c.a(), Q, a(Q.getParameters()), false, eqb);
        if (a2 != null) {
            return a2;
        }
        a(15);
        throw null;
    }

    public static C5029Jcb b(C7706xtb xtb) {
        if (xtb != null) {
            C5122Mcb c2 = xtb.za().c();
            if (c2 instanceof C5029Jcb) {
                return (C5029Jcb) c2;
            }
            return null;
        }
        a(30);
        throw null;
    }

    public static List<Stb> a(List<C4905Fdb> list) {
        if (list != null) {
            ArrayList arrayList = new ArrayList(list.size());
            for (C4905Fdb z : list) {
                arrayList.add(new Utb(z.z()));
            }
            List<Stb> q = C7676xWa.q(arrayList);
            if (q != null) {
                return q;
            }
            a(17);
            throw null;
        }
        a(16);
        throw null;
    }

    public static C7706xtb a(C7706xtb xtb, C7706xtb xtb2, _tb _tb) {
        if (xtb == null) {
            a(20);
            throw null;
        } else if (xtb2 == null) {
            a(21);
            throw null;
        } else if (_tb != null) {
            C7706xtb b2 = _tb.b(xtb2, C6473fub.INVARIANT);
            if (b2 != null) {
                return b(b2, xtb.Aa());
            }
            return null;
        } else {
            a(22);
            throw null;
        }
    }

    public static boolean a(C7706xtb xtb) {
        if (xtb == null) {
            a(28);
            throw null;
        } else if (xtb.Aa()) {
            return true;
        } else {
            if (!C7430ttb.b(xtb) || !a((C7706xtb) C7430ttb.a(xtb).Ea())) {
                return false;
            }
            return true;
        }
    }

    public static boolean a(C7706xtb xtb, _Xa<C6405eub, Boolean> _xa) {
        if (_xa != null) {
            return a(xtb, _xa, new HashSet<>());
        }
        a(44);
        throw null;
    }

    private static boolean a(C7706xtb xtb, _Xa<C6405eub, Boolean> _xa, HashSet<C7706xtb> hashSet) {
        C7223qtb qtb = null;
        if (_xa == null) {
            a(45);
            throw null;
        } else if (xtb == null || hashSet.contains(xtb)) {
            return false;
        } else {
            hashSet.add(xtb);
            C6405eub Ba = xtb.Ba();
            if (((Boolean) _xa.invoke(Ba)).booleanValue()) {
                return true;
            }
            if (Ba instanceof C7223qtb) {
                qtb = (C7223qtb) Ba;
            }
            if (qtb != null && (a((C7706xtb) qtb.Da(), _xa, hashSet) || a((C7706xtb) qtb.Ea(), _xa, hashSet))) {
                return true;
            }
            if ((Ba instanceof C6471ftb) && a((C7706xtb) ((C6471ftb) Ba).getOriginal(), _xa, hashSet)) {
                return true;
            }
            Ptb za = xtb.za();
            if (za instanceof C7637wtb) {
                for (C7706xtb a2 : ((C7637wtb) za).b()) {
                    if (a(a2, _xa, hashSet)) {
                        return true;
                    }
                }
                return false;
            }
            for (Stb stb : xtb.ya()) {
                if (!stb.a()) {
                    if (a(stb.getType(), _xa, hashSet)) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    public static Stb a(C4905Fdb fdb) {
        if (fdb != null) {
            return new Jtb(fdb);
        }
        a(46);
        throw null;
    }
}
