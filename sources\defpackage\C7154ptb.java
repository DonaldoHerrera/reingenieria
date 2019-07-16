package defpackage;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* renamed from: ptb reason: default package and case insensitive filesystem */
/* compiled from: ErrorUtils */
public class C7154ptb {
    private static final C6450fdb a = new C7016ntb();
    private static final a b = new a(C7694xnb.d("<ERROR CLASS>"));
    public static final Etb c = c("<LOOP IN SUPERTYPES>");
    private static final C7706xtb d = c("<ERROR PROPERTY TYPE>");
    private static final C7408tdb e = c();
    /* access modifiers changed from: private */
    public static final Set<C7408tdb> f = Collections.singleton(e);

    /* renamed from: ptb$a */
    /* compiled from: ErrorUtils */
    private static class a extends Neb {
        public a(C7694xnb xnb) {
            if (xnb != null) {
                super(C7154ptb.b(), xnb, C6314ddb.OPEN, C5060Kcb.CLASS, Collections.emptyList(), C7822zdb.a, false, Jsb.b);
                Leb a = Leb.a(this, C6723jeb.c.a(), true, C7822zdb.a);
                a.a(Collections.emptyList(), _db.d);
                Eqb b = C7154ptb.b(getName().a());
                a.a((C7706xtb) new C6947mtb(C7154ptb.b("<ERROR>", this), b));
                a(b, Collections.singleton(a), a);
                return;
            }
            d(0);
            throw null;
        }

        private static /* synthetic */ void d(int i) {
            String str = (i == 2 || i == 4 || i == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[((i == 2 || i == 4 || i == 6) ? 2 : 3)];
            String str2 = "kotlin/reflect/jvm/internal/impl/types/ErrorUtils$ErrorClassDescriptor";
            switch (i) {
                case 1:
                    objArr[0] = "substitutor";
                    break;
                case 2:
                case 4:
                case 6:
                    objArr[0] = str2;
                    break;
                case 3:
                    objArr[0] = "typeArguments";
                    break;
                case 5:
                    objArr[0] = "typeSubstitution";
                    break;
                default:
                    objArr[0] = "name";
                    break;
            }
            String str3 = "getMemberScope";
            String str4 = "substitute";
            if (i == 2) {
                objArr[1] = str4;
            } else if (i == 4 || i == 6) {
                objArr[1] = str3;
            } else {
                objArr[1] = str2;
            }
            switch (i) {
                case 1:
                    objArr[2] = str4;
                    break;
                case 2:
                case 4:
                case 6:
                    break;
                case 3:
                case 5:
                    objArr[2] = str3;
                    break;
                default:
                    objArr[2] = "<init>";
                    break;
            }
            String format = String.format(str, objArr);
            throw ((i == 2 || i == 4 || i == 6) ? new IllegalStateException(format) : new IllegalArgumentException(format));
        }

        public C5029Jcb a(_tb _tb) {
            if (_tb != null) {
                return this;
            }
            d(1);
            throw null;
        }

        public String toString() {
            return getName().a();
        }

        public Eqb a(Wtb wtb) {
            if (wtb != null) {
                StringBuilder sb = new StringBuilder();
                sb.append("Error scope for class ");
                sb.append(getName());
                sb.append(" with arguments: ");
                sb.append(wtb);
                Eqb b = C7154ptb.b(sb.toString());
                if (b != null) {
                    return b;
                }
                d(6);
                throw null;
            }
            d(5);
            throw null;
        }
    }

    /* renamed from: ptb$b */
    /* compiled from: ErrorUtils */
    public static class b implements Eqb {
        private final String a;

        /* synthetic */ b(String str, C7016ntb ntb) {
            this(str);
        }

        private static /* synthetic */ void a(int i) {
            String str;
            int i2;
            Throwable th;
            if (!(i == 7 || i == 18)) {
                switch (i) {
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                        break;
                    default:
                        str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                        break;
                }
            }
            str = "@NotNull method %s.%s must not return null";
            if (!(i == 7 || i == 18)) {
                switch (i) {
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                        break;
                    default:
                        i2 = 3;
                        break;
                }
            }
            i2 = 2;
            Object[] objArr = new Object[i2];
            String str2 = "kotlin/reflect/jvm/internal/impl/types/ErrorUtils$ErrorScope";
            switch (i) {
                case 1:
                case 3:
                case 5:
                case 8:
                case 14:
                case 19:
                    objArr[0] = "name";
                    break;
                case 2:
                case 4:
                case 6:
                case 9:
                case 15:
                    objArr[0] = "location";
                    break;
                case 7:
                case 10:
                case 11:
                case 12:
                case 13:
                case 18:
                    objArr[0] = str2;
                    break;
                case 16:
                    objArr[0] = "kindFilter";
                    break;
                case 17:
                    objArr[0] = "nameFilter";
                    break;
                case 20:
                    objArr[0] = "p";
                    break;
                default:
                    objArr[0] = "debugMessage";
                    break;
            }
            String str3 = "getContributedDescriptors";
            String str4 = "getContributedFunctions";
            String str5 = "getContributedVariables";
            if (i == 7) {
                objArr[1] = str5;
            } else if (i != 18) {
                switch (i) {
                    case 10:
                        objArr[1] = str4;
                        break;
                    case 11:
                        objArr[1] = "getFunctionNames";
                        break;
                    case 12:
                        objArr[1] = "getVariableNames";
                        break;
                    case 13:
                        objArr[1] = "getClassifierNames";
                        break;
                    default:
                        objArr[1] = str2;
                        break;
                }
            } else {
                objArr[1] = str3;
            }
            switch (i) {
                case 1:
                case 2:
                    objArr[2] = "getContributedClassifier";
                    break;
                case 3:
                case 4:
                    objArr[2] = "getContributedClassifierIncludeDeprecated";
                    break;
                case 5:
                case 6:
                    objArr[2] = str5;
                    break;
                case 7:
                case 10:
                case 11:
                case 12:
                case 13:
                case 18:
                    break;
                case 8:
                case 9:
                    objArr[2] = str4;
                    break;
                case 14:
                case 15:
                    objArr[2] = "recordLookup";
                    break;
                case 16:
                case 17:
                    objArr[2] = str3;
                    break;
                case 19:
                    objArr[2] = "definitelyDoesNotContainName";
                    break;
                case 20:
                    objArr[2] = "printScopeStructure";
                    break;
                default:
                    objArr[2] = "<init>";
                    break;
            }
            String format = String.format(str, objArr);
            if (!(i == 7 || i == 18)) {
                switch (i) {
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                        break;
                    default:
                        th = new IllegalArgumentException(format);
                        break;
                }
            }
            th = new IllegalStateException(format);
            throw th;
        }

        public C5122Mcb b(C7694xnb xnb, Dfb dfb) {
            if (xnb == null) {
                a(1);
                throw null;
            } else if (dfb != null) {
                return C7154ptb.a(xnb.a());
            } else {
                a(2);
                throw null;
            }
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("ErrorScope{");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }

        private b(String str) {
            if (str != null) {
                this.a = str;
            } else {
                a(0);
                throw null;
            }
        }

        public Set<? extends C7684xdb> a(C7694xnb xnb, Dfb dfb) {
            if (xnb == null) {
                a(8);
                throw null;
            } else if (dfb != null) {
                Set<? extends C7684xdb> singleton = Collections.singleton(C7154ptb.b(this));
                if (singleton != null) {
                    return singleton;
                }
                a(10);
                throw null;
            } else {
                a(9);
                throw null;
            }
        }

        public Set<? extends C7408tdb> c(C7694xnb xnb, Dfb dfb) {
            if (xnb == null) {
                a(5);
                throw null;
            } else if (dfb != null) {
                Set<? extends C7408tdb> a2 = C7154ptb.f;
                if (a2 != null) {
                    return a2;
                }
                a(7);
                throw null;
            } else {
                a(6);
                throw null;
            }
        }

        public Set<C7694xnb> b() {
            Set<C7694xnb> emptySet = Collections.emptySet();
            if (emptySet != null) {
                return emptySet;
            }
            a(12);
            throw null;
        }

        public Set<C7694xnb> a() {
            Set<C7694xnb> emptySet = Collections.emptySet();
            if (emptySet != null) {
                return emptySet;
            }
            a(11);
            throw null;
        }

        public Collection<C5272Rcb> a(C7700xqb xqb, _Xa<? super C7694xnb, Boolean> _xa) {
            if (xqb == null) {
                a(16);
                throw null;
            } else if (_xa != null) {
                List emptyList = Collections.emptyList();
                if (emptyList != null) {
                    return emptyList;
                }
                a(18);
                throw null;
            } else {
                a(17);
                throw null;
            }
        }
    }

    /* renamed from: ptb$c */
    /* compiled from: ErrorUtils */
    private static class c implements Eqb {
        private final String a;

        /* synthetic */ c(String str, C7016ntb ntb) {
            this(str);
        }

        private static /* synthetic */ void a(int i) {
            Object[] objArr = new Object[3];
            switch (i) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 11:
                case 13:
                    objArr[0] = "name";
                    break;
                case 2:
                case 4:
                case 6:
                case 8:
                case 12:
                    objArr[0] = "location";
                    break;
                case 9:
                    objArr[0] = "kindFilter";
                    break;
                case 10:
                    objArr[0] = "nameFilter";
                    break;
                case 14:
                    objArr[0] = "p";
                    break;
                default:
                    objArr[0] = "message";
                    break;
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/ErrorUtils$ThrowingScope";
            switch (i) {
                case 1:
                case 2:
                    objArr[2] = "getContributedClassifier";
                    break;
                case 3:
                case 4:
                    objArr[2] = "getContributedClassifierIncludeDeprecated";
                    break;
                case 5:
                case 6:
                    objArr[2] = "getContributedVariables";
                    break;
                case 7:
                case 8:
                    objArr[2] = "getContributedFunctions";
                    break;
                case 9:
                case 10:
                    objArr[2] = "getContributedDescriptors";
                    break;
                case 11:
                case 12:
                    objArr[2] = "recordLookup";
                    break;
                case 13:
                    objArr[2] = "definitelyDoesNotContainName";
                    break;
                case 14:
                    objArr[2] = "printScopeStructure";
                    break;
                default:
                    objArr[2] = "<init>";
                    break;
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        public Collection<? extends C7684xdb> a(C7694xnb xnb, Dfb dfb) {
            if (xnb == null) {
                a(7);
                throw null;
            } else if (dfb == null) {
                a(8);
                throw null;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append(this.a);
                sb.append(", required name: ");
                sb.append(xnb);
                throw new IllegalStateException(sb.toString());
            }
        }

        public C5122Mcb b(C7694xnb xnb, Dfb dfb) {
            if (xnb == null) {
                a(1);
                throw null;
            } else if (dfb == null) {
                a(2);
                throw null;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append(this.a);
                sb.append(", required name: ");
                sb.append(xnb);
                throw new IllegalStateException(sb.toString());
            }
        }

        public Collection<? extends C7408tdb> c(C7694xnb xnb, Dfb dfb) {
            if (xnb == null) {
                a(5);
                throw null;
            } else if (dfb == null) {
                a(6);
                throw null;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append(this.a);
                sb.append(", required name: ");
                sb.append(xnb);
                throw new IllegalStateException(sb.toString());
            }
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("ThrowingScope{");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }

        private c(String str) {
            if (str != null) {
                this.a = str;
            } else {
                a(0);
                throw null;
            }
        }

        public Collection<C5272Rcb> a(C7700xqb xqb, _Xa<? super C7694xnb, Boolean> _xa) {
            if (xqb == null) {
                a(9);
                throw null;
            } else if (_xa == null) {
                a(10);
                throw null;
            } else {
                throw new IllegalStateException(this.a);
            }
        }

        public Set<C7694xnb> b() {
            throw new IllegalStateException();
        }

        public Set<C7694xnb> a() {
            throw new IllegalStateException();
        }
    }

    /* renamed from: ptb$d */
    /* compiled from: ErrorUtils */
    public static class d implements Ptb {
        private final C4905Fdb a;
        private final Ptb b;

        private static /* synthetic */ void a(int i) {
            String str = (i == 1 || i == 2 || i == 3 || i == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[((i == 1 || i == 2 || i == 3 || i == 4) ? 2 : 3)];
            String str2 = "kotlin/reflect/jvm/internal/impl/types/ErrorUtils$UninferredParameterTypeConstructor";
            if (i == 1 || i == 2 || i == 3 || i == 4) {
                objArr[0] = str2;
            } else {
                objArr[0] = "descriptor";
            }
            if (i == 1) {
                objArr[1] = "getTypeParameterDescriptor";
            } else if (i == 2) {
                objArr[1] = "getParameters";
            } else if (i == 3) {
                objArr[1] = "getSupertypes";
            } else if (i != 4) {
                objArr[1] = str2;
            } else {
                objArr[1] = "getBuiltIns";
            }
            if (!(i == 1 || i == 2 || i == 3 || i == 4)) {
                objArr[2] = "<init>";
            }
            String format = String.format(str, objArr);
            throw ((i == 1 || i == 2 || i == 3 || i == 4) ? new IllegalStateException(format) : new IllegalArgumentException(format));
        }

        public C5301Sbb E() {
            C5301Sbb b2 = C7148pqb.b((C5272Rcb) this.a);
            if (b2 != null) {
                return b2;
            }
            a(4);
            throw null;
        }

        public Collection<C7706xtb> b() {
            Collection<C7706xtb> b2 = this.b.b();
            if (b2 != null) {
                return b2;
            }
            a(3);
            throw null;
        }

        public C5122Mcb c() {
            return this.b.c();
        }

        public boolean d() {
            return this.b.d();
        }

        public C4905Fdb e() {
            C4905Fdb fdb = this.a;
            if (fdb != null) {
                return fdb;
            }
            a(1);
            throw null;
        }

        public List<C4905Fdb> getParameters() {
            List<C4905Fdb> parameters = this.b.getParameters();
            if (parameters != null) {
                return parameters;
            }
            a(2);
            throw null;
        }
    }

    private static /* synthetic */ void a(int i) {
        String str;
        int i2;
        Throwable th;
        switch (i) {
            case 2:
            case 4:
            case 6:
            case 7:
            case 8:
            case 10:
            case 12:
            case 14:
            case 17:
            case 20:
            case 23:
            case 25:
            case 27:
            case 30:
            case 31:
            case 33:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 2:
            case 4:
            case 6:
            case 7:
            case 8:
            case 10:
            case 12:
            case 14:
            case 17:
            case 20:
            case 23:
            case 25:
            case 27:
            case 30:
            case 31:
            case 33:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        String str2 = "kotlin/reflect/jvm/internal/impl/types/ErrorUtils";
        switch (i) {
            case 1:
            case 3:
            case 5:
            case 11:
            case 18:
            case 24:
                objArr[0] = "debugMessage";
                break;
            case 2:
            case 4:
            case 6:
            case 7:
            case 8:
            case 10:
            case 12:
            case 14:
            case 17:
            case 20:
            case 23:
            case 25:
            case 27:
            case 30:
            case 31:
            case 33:
                objArr[0] = str2;
                break;
            case 9:
                objArr[0] = "ownerScope";
                break;
            case 13:
            case 15:
            case 26:
            case 28:
                objArr[0] = "debugName";
                break;
            case 16:
                objArr[0] = "typeConstructor";
                break;
            case 19:
            case 22:
                objArr[0] = "arguments";
                break;
            case 21:
                objArr[0] = "presentableName";
                break;
            case 29:
                objArr[0] = "errorClass";
                break;
            case 32:
                objArr[0] = "typeParameterDescriptor";
                break;
            default:
                objArr[0] = "function";
                break;
        }
        String str3 = "createUninferredParameterType";
        String str4 = "createErrorTypeConstructorWithCustomDebugName";
        String str5 = "createErrorTypeConstructor";
        String str6 = "createUnresolvedType";
        String str7 = "createErrorTypeWithArguments";
        String str8 = "createErrorTypeWithCustomConstructor";
        String str9 = "createErrorTypeWithCustomDebugName";
        String str10 = "createErrorType";
        String str11 = "createErrorFunction";
        String str12 = "createErrorScope";
        String str13 = "createErrorClass";
        switch (i) {
            case 2:
                objArr[1] = str13;
                break;
            case 4:
            case 6:
            case 7:
                objArr[1] = str12;
                break;
            case 8:
                objArr[1] = "createErrorProperty";
                break;
            case 10:
                objArr[1] = str11;
                break;
            case 12:
                objArr[1] = str10;
                break;
            case 14:
                objArr[1] = str9;
                break;
            case 17:
                objArr[1] = str8;
                break;
            case 20:
                objArr[1] = str7;
                break;
            case 23:
                objArr[1] = str6;
                break;
            case 25:
                objArr[1] = str5;
                break;
            case 27:
            case 30:
                objArr[1] = str4;
                break;
            case 31:
                objArr[1] = "getErrorModule";
                break;
            case 33:
                objArr[1] = str3;
                break;
            default:
                objArr[1] = str2;
                break;
        }
        switch (i) {
            case 1:
                objArr[2] = str13;
                break;
            case 2:
            case 4:
            case 6:
            case 7:
            case 8:
            case 10:
            case 12:
            case 14:
            case 17:
            case 20:
            case 23:
            case 25:
            case 27:
            case 30:
            case 31:
            case 33:
                break;
            case 3:
            case 5:
                objArr[2] = str12;
                break;
            case 9:
                objArr[2] = str11;
                break;
            case 11:
                objArr[2] = str10;
                break;
            case 13:
                objArr[2] = str9;
                break;
            case 15:
            case 16:
                objArr[2] = str8;
                break;
            case 18:
            case 19:
                objArr[2] = str7;
                break;
            case 21:
            case 22:
                objArr[2] = str6;
                break;
            case 24:
                objArr[2] = str5;
                break;
            case 26:
            case 28:
            case 29:
                objArr[2] = str4;
                break;
            case 32:
                objArr[2] = str3;
                break;
            default:
                objArr[2] = "containsErrorTypeInParameters";
                break;
        }
        String format = String.format(str, objArr);
        switch (i) {
            case 2:
            case 4:
            case 6:
            case 7:
            case 8:
            case 10:
            case 12:
            case 14:
            case 17:
            case 20:
            case 23:
            case 25:
            case 27:
            case 30:
            case 31:
            case 33:
                th = new IllegalStateException(format);
                break;
            default:
                th = new IllegalArgumentException(format);
                break;
        }
        throw th;
    }

    public static Eqb b(String str) {
        if (str != null) {
            Eqb a2 = a(str, false);
            if (a2 != null) {
                return a2;
            }
            a(4);
            throw null;
        }
        a(3);
        throw null;
    }

    private static C7065ofb c() {
        C7065ofb a2 = C7065ofb.a(b, C6723jeb.c.a(), C6314ddb.OPEN, _db.e, true, C7694xnb.d("<ERROR PROPERTY>"), defpackage.C4935Gcb.a.DECLARATION, C7822zdb.a, false, false, false, false, false, false);
        a2.a(d, Collections.emptyList(), (C7615wdb) null, (C7615wdb) null);
        if (a2 != null) {
            return a2;
        }
        a(8);
        throw null;
    }

    public static Ptb d(String str) {
        if (str != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("[ERROR : ");
            sb.append(str);
            sb.append("]");
            Ptb b2 = b(sb.toString(), b);
            if (b2 != null) {
                return b2;
            }
            a(25);
            throw null;
        }
        a(24);
        throw null;
    }

    public static Ptb e(String str) {
        if (str != null) {
            Ptb b2 = b(str, b);
            if (b2 != null) {
                return b2;
            }
            a(27);
            throw null;
        }
        a(26);
        throw null;
    }

    public static Etb f(String str) {
        if (str != null) {
            Etb a2 = a(str, e(str));
            if (a2 != null) {
                return a2;
            }
            a(14);
            throw null;
        }
        a(13);
        throw null;
    }

    /* access modifiers changed from: private */
    public static C7684xdb b(b bVar) {
        if (bVar != null) {
            Eub eub = new Eub(b, bVar);
            eub.a((C7615wdb) null, (C7615wdb) null, Collections.emptyList(), Collections.emptyList(), (C7706xtb) c("<ERROR FUNCTION RETURN TYPE>"), C6314ddb.OPEN, _db.e);
            return eub;
        }
        a(9);
        throw null;
    }

    public static C5029Jcb a(String str) {
        if (str != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("<ERROR CLASS: ");
            sb.append(str);
            sb.append(">");
            return new a(C7694xnb.d(sb.toString()));
        }
        a(1);
        throw null;
    }

    public static Etb c(String str) {
        if (str != null) {
            Etb a2 = a(str, Collections.emptyList());
            if (a2 != null) {
                return a2;
            }
            a(12);
            throw null;
        }
        a(11);
        throw null;
    }

    public static Eqb a(String str, boolean z) {
        if (str == null) {
            a(5);
            throw null;
        } else if (z) {
            return new c(str, null);
        } else {
            return new b(str, null);
        }
    }

    /* access modifiers changed from: private */
    public static Ptb b(String str, a aVar) {
        if (str == null) {
            a(28);
            throw null;
        } else if (aVar != null) {
            return new C7085otb(aVar, str);
        } else {
            a(29);
            throw null;
        }
    }

    private static boolean b(C5272Rcb rcb) {
        return rcb instanceof a;
    }

    public static Etb a(String str, Ptb ptb) {
        if (str == null) {
            a(15);
            throw null;
        } else if (ptb != null) {
            return new C6947mtb(ptb, b(str));
        } else {
            a(16);
            throw null;
        }
    }

    public static C6450fdb b() {
        C6450fdb fdb = a;
        if (fdb != null) {
            return fdb;
        }
        a(31);
        throw null;
    }

    public static Etb a(String str, List<Stb> list) {
        if (str == null) {
            a(18);
            throw null;
        } else if (list != null) {
            return new C6947mtb(d(str), b(str), list, false);
        } else {
            a(19);
            throw null;
        }
    }

    public static boolean a(C5272Rcb rcb) {
        boolean z = false;
        if (rcb == null) {
            return false;
        }
        if (b(rcb) || b(rcb.e()) || rcb == a) {
            z = true;
        }
        return z;
    }

    public static boolean a(C7706xtb xtb) {
        return xtb != null && (xtb.za() instanceof d);
    }
}
