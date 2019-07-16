package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: _tb reason: default package */
/* compiled from: TypeSubstitutor */
public class _tb {
    public static final _tb a = a(Wtb.a);
    private final Wtb b;

    /* renamed from: _tb$a */
    /* compiled from: TypeSubstitutor */
    private static final class a extends Exception {
        public a(String str) {
            super(str);
        }
    }

    /* renamed from: _tb$b */
    /* compiled from: TypeSubstitutor */
    private enum b {
        NO_CONFLICT,
        IN_IN_OUT_POSITION,
        OUT_IN_IN_POSITION
    }

    protected _tb(Wtb wtb) {
        if (wtb != null) {
            this.b = wtb;
        } else {
            a(9);
            throw null;
        }
    }

    public static _tb a(Wtb wtb) {
        if (wtb != null) {
            return new _tb(wtb);
        }
        a(0);
        throw null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:67:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0118  */
    private static /* synthetic */ void a(int i) {
        String str;
        int i2;
        Throwable th;
        int i3 = i;
        if (!(i3 == 1 || i3 == 4 || i3 == 6 || i3 == 8 || i3 == 10 || i3 == 32 || i3 == 33 || i3 == 36 || i3 == 37)) {
            switch (i3) {
                case 13:
                case 14:
                case 15:
                    break;
                default:
                    switch (i3) {
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                            break;
                        default:
                            switch (i3) {
                                case 40:
                                case 41:
                                case 42:
                                    break;
                                default:
                                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                                    break;
                            }
                    }
            }
        }
        str = "@NotNull method %s.%s must not return null";
        if (!(i3 == 1 || i3 == 4 || i3 == 6 || i3 == 8 || i3 == 10 || i3 == 32 || i3 == 33 || i3 == 36 || i3 == 37)) {
            switch (i3) {
                case 13:
                case 14:
                case 15:
                    break;
                default:
                    switch (i3) {
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                            break;
                        default:
                            switch (i3) {
                                case 40:
                                case 41:
                                case 42:
                                    break;
                                default:
                                    i2 = 3;
                                    break;
                            }
                    }
            }
        }
        i2 = 2;
        Object[] objArr = new Object[i2];
        String str2 = "kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor";
        switch (i3) {
            case 1:
            case 4:
            case 6:
            case 8:
            case 10:
            case 13:
            case 14:
            case 15:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 32:
            case 33:
            case 36:
            case 37:
            case 40:
            case 41:
            case 42:
                objArr[0] = str2;
                break;
            case 2:
                objArr[0] = "first";
                break;
            case 3:
                objArr[0] = "second";
                break;
            case 5:
                objArr[0] = "substitutionContext";
                break;
            case 7:
                objArr[0] = "context";
                break;
            case 11:
            case 16:
                objArr[0] = C1325gg.TYPE;
                break;
            case 12:
            case 17:
                objArr[0] = "howThisTypeIsUsed";
                break;
            case 18:
            case 19:
            case 35:
                objArr[0] = "typeProjection";
                break;
            case 20:
                objArr[0] = "originalProjection";
                break;
            case 31:
                objArr[0] = "annotations";
                break;
            case 34:
            case 38:
                objArr[0] = "typeParameterVariance";
                break;
            case 39:
                objArr[0] = "projectionKind";
                break;
            default:
                objArr[0] = "substitution";
                break;
        }
        String str3 = "safeSubstitute";
        String str4 = "createChainedSubstitutor";
        String str5 = "create";
        if (i3 != 1) {
            if (i3 == 4) {
                objArr[1] = str4;
            } else if (!(i3 == 6 || i3 == 8)) {
                if (i3 == 10) {
                    objArr[1] = "getSubstitution";
                } else if (i3 == 32 || i3 == 33) {
                    objArr[1] = "filterOutUnsafeVariance";
                } else {
                    if (!(i3 == 36 || i3 == 37)) {
                        switch (i3) {
                            case 13:
                            case 14:
                            case 15:
                                objArr[1] = str3;
                                break;
                            default:
                                switch (i3) {
                                    case 21:
                                    case 22:
                                    case 23:
                                    case 24:
                                    case 25:
                                    case 26:
                                    case 27:
                                    case 28:
                                    case 29:
                                    case 30:
                                        objArr[1] = "unsafeSubstitute";
                                        break;
                                    default:
                                        switch (i3) {
                                            case 40:
                                            case 41:
                                            case 42:
                                                break;
                                            default:
                                                objArr[1] = str2;
                                                break;
                                        }
                                }
                        }
                    }
                    objArr[1] = "combine";
                }
            }
            switch (i3) {
                case 1:
                case 4:
                case 6:
                case 8:
                case 10:
                case 13:
                case 14:
                case 15:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 32:
                case 33:
                case 36:
                case 37:
                case 40:
                case 41:
                case 42:
                    break;
                case 2:
                case 3:
                    objArr[2] = str4;
                    break;
                case 9:
                    objArr[2] = "<init>";
                    break;
                case 11:
                case 12:
                    objArr[2] = str3;
                    break;
                case 16:
                case 17:
                case 18:
                    objArr[2] = "substitute";
                    break;
                case 19:
                    objArr[2] = "substituteWithoutApproximation";
                    break;
                case 20:
                    objArr[2] = "unsafeSubstitute";
                    break;
                case 31:
                    objArr[2] = "filterOutUnsafeVariance";
                    break;
                case 34:
                case 35:
                case 38:
                case 39:
                    objArr[2] = "combine";
                    break;
                default:
                    objArr[2] = str5;
                    break;
            }
            String format = String.format(str, objArr);
            if (!(i3 == 1 || i3 == 4 || i3 == 6 || i3 == 8 || i3 == 10 || i3 == 32 || i3 == 33 || i3 == 36 || i3 == 37)) {
                switch (i3) {
                    case 13:
                    case 14:
                    case 15:
                        break;
                    default:
                        switch (i3) {
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                            case 26:
                            case 27:
                            case 28:
                            case 29:
                            case 30:
                                break;
                            default:
                                switch (i3) {
                                    case 40:
                                    case 41:
                                    case 42:
                                        break;
                                    default:
                                        th = new IllegalArgumentException(format);
                                        break;
                                }
                        }
                }
            }
            th = new IllegalStateException(format);
            throw th;
        }
        objArr[1] = str5;
        switch (i3) {
            case 1:
            case 4:
            case 6:
            case 8:
            case 10:
            case 13:
            case 14:
            case 15:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 32:
            case 33:
            case 36:
            case 37:
            case 40:
            case 41:
            case 42:
                break;
            case 2:
            case 3:
                break;
            case 9:
                break;
            case 11:
            case 12:
                break;
            case 16:
            case 17:
            case 18:
                break;
            case 19:
                break;
            case 20:
                break;
            case 31:
                break;
            case 34:
            case 35:
            case 38:
            case 39:
                break;
        }
        String format2 = String.format(str, objArr);
        switch (i3) {
            case 13:
            case 14:
            case 15:
                break;
        }
        th = new IllegalStateException(format2);
        throw th;
    }

    public boolean b() {
        return this.b.d();
    }

    public C7706xtb b(C7706xtb xtb, C6473fub fub) {
        if (xtb == null) {
            a(16);
            throw null;
        } else if (fub != null) {
            Stb a2 = a((Stb) new Utb(fub, a().a(xtb, fub)));
            if (a2 == null) {
                return null;
            }
            return a2.getType();
        } else {
            a(17);
            throw null;
        }
    }

    public static _tb a(Wtb wtb, Wtb wtb2) {
        if (wtb == null) {
            a(2);
            throw null;
        } else if (wtb2 != null) {
            _tb a2 = a(C6811ktb.a(wtb, wtb2));
            if (a2 != null) {
                return a2;
            }
            a(4);
            throw null;
        } else {
            a(3);
            throw null;
        }
    }

    public static _tb a(C7706xtb xtb) {
        if (xtb != null) {
            _tb a2 = a(Rtb.a(xtb.za(), xtb.ya()));
            if (a2 != null) {
                return a2;
            }
            a(8);
            throw null;
        }
        a(7);
        throw null;
    }

    public Stb b(Stb stb) {
        if (stb == null) {
            a(19);
            throw null;
        } else if (b()) {
            return stb;
        } else {
            try {
                return b(stb, 0);
            } catch (a unused) {
                return null;
            }
        }
    }

    public Wtb a() {
        Wtb wtb = this.b;
        if (wtb != null) {
            return wtb;
        }
        a(10);
        throw null;
    }

    private Stb b(Stb stb, int i) throws a {
        C7706xtb xtb;
        if (stb != null) {
            a(i, stb, this.b);
            if (!stb.a()) {
                C7706xtb type = stb.getType();
                if (type instanceof C5673bub) {
                    C5673bub bub = (C5673bub) type;
                    C6405eub wa = bub.wa();
                    C7706xtb ua = bub.ua();
                    Stb b2 = b((Stb) new Utb(stb.b(), wa), i + 1);
                    return new Utb(b2.b(), C6269cub.b(b2.getType().Ba(), b(ua, stb.b())));
                } else if (!C6879ltb.a(type) && !(type.Ba() instanceof Dtb)) {
                    Stb a2 = this.b.a(type);
                    C6473fub b3 = stb.b();
                    if (a2 == null && C7430ttb.b(type) && !Otb.d(type)) {
                        C7223qtb a3 = C7430ttb.a(type);
                        int i2 = i + 1;
                        Stb b4 = b((Stb) new Utb(b3, a3.Da()), i2);
                        Stb b5 = b((Stb) new Utb(b3, a3.Ea()), i2);
                        C6473fub b6 = b4.b();
                        if (b4.getType() != a3.Da() || b5.getType() != a3.Ea()) {
                            return new Utb(b6, C7775ytb.a(Xtb.a(b4.getType()), Xtb.a(b5.getType())));
                        }
                        if (stb != null) {
                            return stb;
                        }
                        a(24);
                        throw null;
                    } else if (C5301Sbb.o(type) || C7844ztb.a(type)) {
                        if (stb != null) {
                            return stb;
                        }
                        a(26);
                        throw null;
                    } else if (a2 != null) {
                        b b7 = b(b3, a2.b());
                        if (!Gpb.a(type)) {
                            int i3 = Ztb.a[b7.ordinal()];
                            if (i3 == 1) {
                                throw new a("Out-projection in in-position");
                            } else if (i3 == 2) {
                                return new Utb(C6473fub.OUT_VARIANCE, type.za().E().v());
                            }
                        }
                        C6403etb a4 = Otb.a(type);
                        if (!a2.a()) {
                            if (a4 != null) {
                                xtb = a4.a(a2.getType());
                            } else {
                                xtb = C5605aub.b(a2.getType(), type.Aa());
                            }
                            if (!type.getAnnotations().isEmpty()) {
                                xtb = Fub.a(xtb, (C6723jeb) new C7202qeb(xtb.getAnnotations(), a(this.b.a(type.getAnnotations()))));
                            }
                            if (b7 == b.NO_CONFLICT) {
                                b3 = a(b3, a2.b());
                            }
                            return new Utb(b3, xtb);
                        } else if (a2 != null) {
                            return a2;
                        } else {
                            a(28);
                            throw null;
                        }
                    } else {
                        Stb a5 = a(stb, i);
                        if (a5 != null) {
                            return a5;
                        }
                        a(30);
                        throw null;
                    }
                } else if (stb != null) {
                    return stb;
                } else {
                    a(23);
                    throw null;
                }
            } else if (stb != null) {
                return stb;
            } else {
                a(21);
                throw null;
            }
        } else {
            a(20);
            throw null;
        }
    }

    public C7706xtb a(C7706xtb xtb, C6473fub fub) {
        if (xtb == null) {
            a(11);
            throw null;
        } else if (fub == null) {
            a(12);
            throw null;
        } else if (!b()) {
            try {
                C7706xtb type = b((Stb) new Utb(fub, xtb), 0).getType();
                if (type != null) {
                    return type;
                }
                a(14);
                throw null;
            } catch (a e) {
                Etb c = C7154ptb.c(e.getMessage());
                if (c != null) {
                    return c;
                }
                a(15);
                throw null;
            }
        } else if (xtb != null) {
            return xtb;
        } else {
            a(13);
            throw null;
        }
    }

    public Stb a(Stb stb) {
        if (stb != null) {
            Stb b2 = b(stb);
            if (this.b.a() || this.b.b()) {
                return Nub.a(b2, this.b.b());
            }
            return b2;
        }
        a(18);
        throw null;
    }

    private static C6723jeb a(C6723jeb jeb) {
        if (jeb == null) {
            a(31);
            throw null;
        } else if (jeb.b(C5301Sbb.h.J)) {
            return new C7271reb(jeb, new Ytb());
        } else {
            if (jeb != null) {
                return jeb;
            }
            a(32);
            throw null;
        }
    }

    private Stb a(Stb stb, int i) throws a {
        C7706xtb type = stb.getType();
        C6473fub b2 = stb.b();
        if (type.za().c() instanceof C4905Fdb) {
            return stb;
        }
        C7706xtb xtb = null;
        Etb b3 = Htb.b(type);
        if (b3 != null) {
            xtb = b((C7706xtb) b3, C6473fub.INVARIANT);
        }
        C7706xtb a2 = Xtb.a(type, a(type.za().getParameters(), type.ya(), i), this.b.a(type.getAnnotations()));
        if ((a2 instanceof Etb) && (xtb instanceof Etb)) {
            a2 = Htb.a((Etb) a2, (Etb) xtb);
        }
        return new Utb(b2, a2);
    }

    private List<Stb> a(List<C4905Fdb> list, List<Stb> list2, int i) throws a {
        ArrayList arrayList = new ArrayList(list.size());
        boolean z = false;
        for (int i2 = 0; i2 < list.size(); i2++) {
            C4905Fdb fdb = (C4905Fdb) list.get(i2);
            Stb stb = (Stb) list2.get(i2);
            Stb b2 = b(stb, i + 1);
            int i3 = Ztb.a[b(fdb.pa(), b2.b()).ordinal()];
            if (i3 == 1 || i3 == 2) {
                b2 = C5605aub.a(fdb);
            } else if (i3 == 3 && fdb.pa() != C6473fub.INVARIANT && !b2.a()) {
                b2 = new Utb(C6473fub.INVARIANT, b2.getType());
            }
            if (b2 != stb) {
                z = true;
            }
            arrayList.add(b2);
        }
        return !z ? list2 : arrayList;
    }

    public static C6473fub a(C6473fub fub, Stb stb) {
        if (fub == null) {
            a(34);
            throw null;
        } else if (stb == null) {
            a(35);
            throw null;
        } else if (stb.a()) {
            C6473fub fub2 = C6473fub.OUT_VARIANCE;
            if (fub2 != null) {
                return fub2;
            }
            a(36);
            throw null;
        } else {
            C6473fub a2 = a(fub, stb.b());
            if (a2 != null) {
                return a2;
            }
            a(37);
            throw null;
        }
    }

    public static C6473fub a(C6473fub fub, C6473fub fub2) {
        if (fub == null) {
            a(38);
            throw null;
        } else if (fub2 != null) {
            C6473fub fub3 = C6473fub.INVARIANT;
            if (fub == fub3) {
                if (fub2 != null) {
                    return fub2;
                }
                a(40);
                throw null;
            } else if (fub2 == fub3) {
                if (fub != null) {
                    return fub;
                }
                a(41);
                throw null;
            } else if (fub != fub2) {
                StringBuilder sb = new StringBuilder();
                sb.append("Variance conflict: type parameter variance '");
                sb.append(fub);
                sb.append("' and ");
                sb.append("projection kind '");
                sb.append(fub2);
                sb.append("' cannot be combined");
                throw new AssertionError(sb.toString());
            } else if (fub2 != null) {
                return fub2;
            } else {
                a(42);
                throw null;
            }
        } else {
            a(39);
            throw null;
        }
    }

    private static void a(int i, Stb stb, Wtb wtb) {
        if (i > 100) {
            StringBuilder sb = new StringBuilder();
            sb.append("Recursion too deep. Most likely infinite loop while substituting ");
            sb.append(a((Object) stb));
            sb.append("; substitution: ");
            sb.append(a((Object) wtb));
            throw new IllegalStateException(sb.toString());
        }
    }

    private static String a(Object obj) {
        try {
            return obj.toString();
        } catch (Throwable th) {
            if (!C7296rvb.a(th)) {
                StringBuilder sb = new StringBuilder();
                sb.append("[Exception while computing toString(): ");
                sb.append(th);
                sb.append("]");
                return sb.toString();
            }
            throw ((RuntimeException) th);
        }
    }

    private static b b(C6473fub fub, C6473fub fub2) {
        if (fub == C6473fub.IN_VARIANCE && fub2 == C6473fub.OUT_VARIANCE) {
            return b.OUT_IN_IN_POSITION;
        }
        if (fub == C6473fub.OUT_VARIANCE && fub2 == C6473fub.IN_VARIANCE) {
            return b.IN_IN_OUT_POSITION;
        }
        return b.NO_CONFLICT;
    }
}
