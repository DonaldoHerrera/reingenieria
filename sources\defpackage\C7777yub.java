package defpackage;

import java.util.List;

/* renamed from: yub reason: default package and case insensitive filesystem */
/* compiled from: TypeCheckingProcedure */
public class C7777yub {
    private final C7846zub a;

    /* renamed from: yub$a */
    /* compiled from: TypeCheckingProcedure */
    public enum a {
        IN,
        OUT,
        INV,
        STAR;

        public static a a(C6473fub fub) {
            if (fub != null) {
                int i = C7708xub.a[fub.ordinal()];
                if (i == 1) {
                    a aVar = INV;
                    if (aVar != null) {
                        return aVar;
                    }
                    a(1);
                    throw null;
                } else if (i == 2) {
                    a aVar2 = IN;
                    if (aVar2 != null) {
                        return aVar2;
                    }
                    a(2);
                    throw null;
                } else if (i == 3) {
                    a aVar3 = OUT;
                    if (aVar3 != null) {
                        return aVar3;
                    }
                    a(3);
                    throw null;
                } else {
                    throw new IllegalStateException("Unknown variance");
                }
            } else {
                a(0);
                throw null;
            }
        }
    }

    public C7777yub(C7846zub zub) {
        this.a = zub;
    }

    public static C7706xtb a(C7706xtb xtb, C7706xtb xtb2, C7846zub zub) {
        if (xtb == null) {
            a(2);
            throw null;
        } else if (xtb2 == null) {
            a(3);
            throw null;
        } else if (zub != null) {
            return Cub.a(xtb, xtb2, zub);
        } else {
            a(4);
            throw null;
        }
    }

    private static /* synthetic */ void a(int i) {
        String str = (i == 7 || i == 10) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i == 7 || i == 10) ? 2 : 3)];
        String str2 = "kotlin/reflect/jvm/internal/impl/types/checker/TypeCheckingProcedure";
        switch (i) {
            case 1:
            case 3:
            case 16:
            case 18:
                objArr[0] = "supertype";
                break;
            case 4:
                objArr[0] = "typeCheckingProcedureCallbacks";
                break;
            case 5:
            case 8:
            case 21:
                objArr[0] = "parameter";
                break;
            case 6:
            case 9:
                objArr[0] = "argument";
                break;
            case 7:
            case 10:
                objArr[0] = str2;
                break;
            case 11:
                objArr[0] = "type1";
                break;
            case 12:
                objArr[0] = "type2";
                break;
            case 13:
                objArr[0] = "typeParameter";
                break;
            case 14:
                objArr[0] = "typeArgument";
                break;
            case 19:
                objArr[0] = "subtypeArgumentProjection";
                break;
            case 20:
                objArr[0] = "supertypeArgumentProjection";
                break;
            default:
                objArr[0] = "subtype";
                break;
        }
        String str3 = "getInType";
        String str4 = "getOutType";
        if (i == 7) {
            objArr[1] = str4;
        } else if (i != 10) {
            objArr[1] = str2;
        } else {
            objArr[1] = str3;
        }
        switch (i) {
            case 5:
            case 6:
                objArr[2] = str4;
                break;
            case 7:
            case 10:
                break;
            case 8:
            case 9:
                objArr[2] = str3;
                break;
            case 11:
            case 12:
                objArr[2] = "equalTypes";
                break;
            case 13:
            case 14:
                objArr[2] = "getEffectiveProjectionKind";
                break;
            case 15:
            case 16:
                objArr[2] = "isSubtypeOf";
                break;
            case 17:
            case 18:
                objArr[2] = "checkSubtypeForTheSameConstructor";
                break;
            case 19:
            case 20:
            case 21:
                objArr[2] = "capture";
                break;
            default:
                objArr[2] = "findCorrespondingSupertype";
                break;
        }
        String format = String.format(str, objArr);
        throw ((i == 7 || i == 10) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    public static C7706xtb b(C7706xtb xtb, C7706xtb xtb2) {
        if (xtb == null) {
            a(0);
            throw null;
        } else if (xtb2 != null) {
            return a(xtb, xtb2, (C7846zub) new C7639wub());
        } else {
            a(1);
            throw null;
        }
    }

    private static C7706xtb c(C4905Fdb fdb, Stb stb) {
        if (fdb == null) {
            a(5);
            throw null;
        } else if (stb != null) {
            C7706xtb v = stb.b() == C6473fub.IN_VARIANCE || fdb.pa() == C6473fub.IN_VARIANCE ? C7148pqb.b((C5272Rcb) fdb).v() : stb.getType();
            if (v != null) {
                return v;
            }
            a(7);
            throw null;
        } else {
            a(6);
            throw null;
        }
    }

    private boolean e(C7706xtb xtb, C7706xtb xtb2) {
        if (xtb == null) {
            a(17);
            throw null;
        } else if (xtb2 != null) {
            Ptb za = xtb.za();
            List ya = xtb.ya();
            List ya2 = xtb2.ya();
            if (ya.size() != ya2.size()) {
                return false;
            }
            List parameters = za.getParameters();
            int i = 0;
            while (true) {
                boolean z = true;
                if (i >= parameters.size()) {
                    return true;
                }
                C4905Fdb fdb = (C4905Fdb) parameters.get(i);
                Stb stb = (Stb) ya2.get(i);
                Stb stb2 = (Stb) ya.get(i);
                if (!stb.a() && !a(stb2, stb, fdb)) {
                    if (!C7844ztb.a(stb2.getType()) && !C7844ztb.a(stb.getType())) {
                        z = false;
                    }
                    if (z || fdb.pa() != C6473fub.INVARIANT || stb2.b() != C6473fub.INVARIANT || stb.b() != C6473fub.INVARIANT) {
                        C7706xtb c = c(fdb, stb);
                        if (!this.a.a(c(fdb, stb2), c, this)) {
                            return false;
                        }
                        C7706xtb b = b(fdb, stb);
                        C7706xtb b2 = b(fdb, stb2);
                        if (stb.b() != C6473fub.OUT_VARIANCE && !this.a.a(b, b2, this)) {
                            return false;
                        }
                    } else if (!this.a.b(stb2.getType(), stb.getType(), this)) {
                        return false;
                    }
                }
                i++;
            }
        } else {
            a(18);
            throw null;
        }
    }

    private boolean f(C7706xtb xtb, C7706xtb xtb2) {
        if (C7844ztb.a(xtb) || C7844ztb.a(xtb2)) {
            return true;
        }
        if (!xtb2.Aa() && xtb.Aa()) {
            return false;
        }
        if (C5301Sbb.p(xtb)) {
            return true;
        }
        C7706xtb a2 = a(xtb, xtb2, this.a);
        if (a2 == null) {
            return this.a.a(xtb, xtb2);
        }
        if (xtb2.Aa() || !a2.Aa()) {
            return e(a2, xtb2);
        }
        return false;
    }

    public boolean d(C7706xtb xtb, C7706xtb xtb2) {
        if (xtb == null) {
            a(15);
            throw null;
        } else if (xtb2 == null) {
            a(16);
            throw null;
        } else if (Otb.a(xtb, xtb2)) {
            return !xtb.Aa() || xtb2.Aa();
        } else {
            C7706xtb b = Otb.b(xtb);
            C7706xtb c = Otb.c(xtb2);
            if (b == xtb && c == xtb2) {
                return f(xtb, xtb2);
            }
            return d(b, c);
        }
    }

    private static C7706xtb b(C4905Fdb fdb, Stb stb) {
        if (fdb == null) {
            a(8);
            throw null;
        } else if (stb != null) {
            C7706xtb u = stb.b() == C6473fub.OUT_VARIANCE || fdb.pa() == C6473fub.OUT_VARIANCE ? C7148pqb.b((C5272Rcb) fdb).u() : stb.getType();
            if (u != null) {
                return u;
            }
            a(10);
            throw null;
        } else {
            a(9);
            throw null;
        }
    }

    public boolean a(C7706xtb xtb, C7706xtb xtb2) {
        if (xtb == null) {
            a(11);
            throw null;
        } else if (xtb2 != null) {
            boolean z = true;
            if (xtb == xtb2) {
                return true;
            }
            if (C7430ttb.b(xtb)) {
                if (!C7430ttb.b(xtb2)) {
                    return c(xtb2, xtb);
                }
                if (C7844ztb.a(xtb) || C7844ztb.a(xtb2) || !d(xtb, xtb2) || !d(xtb2, xtb)) {
                    z = false;
                }
                return z;
            } else if (C7430ttb.b(xtb2)) {
                return c(xtb, xtb2);
            } else {
                if (xtb.Aa() != xtb2.Aa()) {
                    return false;
                }
                if (xtb.Aa()) {
                    return this.a.b(C5605aub.i(xtb), C5605aub.i(xtb2), this);
                }
                Ptb za = xtb.za();
                Ptb za2 = xtb2.za();
                if (!this.a.a(za, za2)) {
                    return false;
                }
                List ya = xtb.ya();
                List ya2 = xtb2.ya();
                if (ya.size() != ya2.size()) {
                    return false;
                }
                for (int i = 0; i < ya.size(); i++) {
                    Stb stb = (Stb) ya.get(i);
                    Stb stb2 = (Stb) ya2.get(i);
                    if (!stb.a() || !stb2.a()) {
                        C4905Fdb fdb = (C4905Fdb) za.getParameters().get(i);
                        C4905Fdb fdb2 = (C4905Fdb) za2.getParameters().get(i);
                        if (!a(stb, stb2, fdb) && (a(fdb, stb) != a(fdb2, stb2) || !this.a.b(stb.getType(), stb2.getType(), this))) {
                            return false;
                        }
                    }
                }
                return true;
            }
        } else {
            a(12);
            throw null;
        }
    }

    /* access modifiers changed from: protected */
    public boolean c(C7706xtb xtb, C7706xtb xtb2) {
        return d(C7430ttb.a(xtb2).Da(), xtb) && d(xtb, C7430ttb.a(xtb2).Ea());
    }

    public static a a(C4905Fdb fdb, Stb stb) {
        if (fdb == null) {
            a(13);
            throw null;
        } else if (stb != null) {
            C6473fub pa = fdb.pa();
            C6473fub b = stb.b();
            if (b == C6473fub.INVARIANT) {
                C6473fub fub = b;
                b = pa;
                pa = fub;
            }
            if (pa == C6473fub.IN_VARIANCE && b == C6473fub.OUT_VARIANCE) {
                return a.STAR;
            }
            if (pa == C6473fub.OUT_VARIANCE && b == C6473fub.IN_VARIANCE) {
                return a.STAR;
            }
            return a.a(b);
        } else {
            a(14);
            throw null;
        }
    }

    private boolean a(Stb stb, Stb stb2, C4905Fdb fdb) {
        if (stb == null) {
            a(19);
            throw null;
        } else if (stb2 == null) {
            a(20);
            throw null;
        } else if (fdb == null) {
            a(21);
            throw null;
        } else if (fdb.pa() == C6473fub.INVARIANT && stb.b() != C6473fub.INVARIANT && stb2.b() == C6473fub.INVARIANT) {
            return this.a.a(stb2.getType(), stb);
        } else {
            return false;
        }
    }
}
