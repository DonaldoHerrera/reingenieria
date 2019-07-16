package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Queue;
import java.util.ServiceLoader;
import java.util.Set;

/* renamed from: wpb reason: default package and case insensitive filesystem */
/* compiled from: OverridingUtil */
public class C7629wpb {
    private static final List<C6599hpb> a = C7676xWa.q(ServiceLoader.load(C6599hpb.class, C6599hpb.class.getClassLoader()));
    public static final C7629wpb b = new C7629wpb(new C7008npb());
    /* access modifiers changed from: private */
    public final defpackage.C6745jub.a c;

    /* renamed from: wpb$a */
    /* compiled from: OverridingUtil */
    public static class a {
        private static final a a = new a(C0186a.OVERRIDABLE, "SUCCESS");
        private final C0186a b;
        private final String c;

        /* renamed from: wpb$a$a reason: collision with other inner class name */
        /* compiled from: OverridingUtil */
        public enum C0186a {
            OVERRIDABLE,
            INCOMPATIBLE,
            CONFLICT
        }

        public a(C0186a aVar, String str) {
            if (aVar == null) {
                a(5);
                throw null;
            } else if (str != null) {
                this.b = aVar;
                this.c = str;
            } else {
                a(6);
                throw null;
            }
        }

        public static a a(String str) {
            if (str != null) {
                return new a(C0186a.CONFLICT, str);
            }
            a(3);
            throw null;
        }

        /* JADX WARNING: Removed duplicated region for block: B:24:0x003d  */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x0040  */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x0045  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x004a  */
        /* JADX WARNING: Removed duplicated region for block: B:28:0x004d  */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x0050  */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x0054  */
        /* JADX WARNING: Removed duplicated region for block: B:36:0x0063  */
        private static /* synthetic */ void a(int i) {
            String str = (i == 1 || i == 3 || i == 5 || i == 6) ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[((i == 1 || i == 3 || i == 5 || i == 6) ? 3 : 2)];
            String str2 = "success";
            String str3 = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil$OverrideCompatibilityInfo";
            if (!(i == 1 || i == 3)) {
                if (i == 5) {
                    objArr[0] = str2;
                } else if (i != 6) {
                    objArr[0] = str3;
                }
                String str4 = "conflict";
                String str5 = "incompatible";
                switch (i) {
                    case 1:
                    case 3:
                    case 5:
                    case 6:
                        objArr[1] = str3;
                        break;
                    case 2:
                        objArr[1] = str5;
                        break;
                    case 4:
                        objArr[1] = str4;
                        break;
                    case 7:
                        objArr[1] = "getResult";
                        break;
                    case 8:
                        objArr[1] = "getDebugMessage";
                        break;
                    default:
                        objArr[1] = str2;
                        break;
                }
                if (i != 1) {
                    objArr[2] = str5;
                } else if (i == 3) {
                    objArr[2] = str4;
                } else if (i == 5 || i == 6) {
                    objArr[2] = "<init>";
                }
                String format = String.format(str, objArr);
                throw ((i != 1 || i == 3 || i == 5 || i == 6) ? new IllegalArgumentException(format) : new IllegalStateException(format));
            }
            objArr[0] = "debugMessage";
            String str42 = "conflict";
            String str52 = "incompatible";
            switch (i) {
                case 1:
                case 3:
                case 5:
                case 6:
                    break;
                case 2:
                    break;
                case 4:
                    break;
                case 7:
                    break;
                case 8:
                    break;
            }
            if (i != 1) {
            }
            String format2 = String.format(str, objArr);
            throw ((i != 1 || i == 3 || i == 5 || i == 6) ? new IllegalArgumentException(format2) : new IllegalStateException(format2));
        }

        public static a b() {
            a aVar = a;
            if (aVar != null) {
                return aVar;
            }
            a(0);
            throw null;
        }

        public static a b(String str) {
            if (str != null) {
                return new a(C0186a.INCOMPATIBLE, str);
            }
            a(1);
            throw null;
        }

        public C0186a a() {
            C0186a aVar = this.b;
            if (aVar != null) {
                return aVar;
            }
            a(7);
            throw null;
        }
    }

    private C7629wpb(defpackage.C6745jub.a aVar) {
        this.c = aVar;
    }

    private static /* synthetic */ void a(int i) {
        String str;
        int i2;
        Throwable th;
        int i3 = i;
        if (!(i3 == 1 || i3 == 3 || i3 == 11 || i3 == 16 || i3 == 90 || i3 == 93 || i3 == 98 || i3 == 102 || i3 == 6 || i3 == 7 || i3 == 39 || i3 == 40)) {
            switch (i3) {
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                    break;
                default:
                    switch (i3) {
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                            break;
                        default:
                            switch (i3) {
                                case 74:
                                case 75:
                                case 76:
                                case 77:
                                case 78:
                                    break;
                                default:
                                    switch (i3) {
                                        case 84:
                                        case 85:
                                        case 86:
                                        case 87:
                                            break;
                                        default:
                                            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                                            break;
                                    }
                            }
                    }
            }
        }
        str = "@NotNull method %s.%s must not return null";
        if (!(i3 == 1 || i3 == 3 || i3 == 11 || i3 == 16 || i3 == 90 || i3 == 93 || i3 == 98 || i3 == 102 || i3 == 6 || i3 == 7 || i3 == 39 || i3 == 40)) {
            switch (i3) {
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                    break;
                default:
                    switch (i3) {
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                            break;
                        default:
                            switch (i3) {
                                case 74:
                                case 75:
                                case 76:
                                case 77:
                                case 78:
                                    break;
                                default:
                                    switch (i3) {
                                        case 84:
                                        case 85:
                                        case 86:
                                        case 87:
                                            break;
                                        default:
                                            i2 = 3;
                                            break;
                                    }
                            }
                    }
            }
        }
        i2 = 2;
        Object[] objArr = new Object[i2];
        String str2 = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil";
        switch (i3) {
            case 1:
            case 3:
            case 6:
            case 7:
            case 11:
            case 16:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 39:
            case 40:
            case 74:
            case 75:
            case 76:
            case 77:
            case 78:
            case 84:
            case 85:
            case 86:
            case 87:
            case 90:
            case 93:
            case 98:
            case 102:
                objArr[0] = str2;
                break;
            case 2:
            case 4:
                objArr[0] = "candidateSet";
                break;
            case 5:
                objArr[0] = "transformFirst";
                break;
            case 8:
                objArr[0] = "f";
                break;
            case 9:
                objArr[0] = "g";
                break;
            case 10:
            case 12:
                objArr[0] = "descriptor";
                break;
            case 13:
                objArr[0] = "result";
                break;
            case 14:
            case 17:
            case 25:
            case 35:
                objArr[0] = "superDescriptor";
                break;
            case 15:
            case 18:
            case 26:
            case 36:
                objArr[0] = "subDescriptor";
                break;
            case 37:
                objArr[0] = "firstParameters";
                break;
            case 38:
                objArr[0] = "secondParameters";
                break;
            case 41:
                objArr[0] = "typeInSuper";
                break;
            case 42:
                objArr[0] = "typeInSub";
                break;
            case 43:
            case 46:
                objArr[0] = "typeChecker";
                break;
            case 44:
                objArr[0] = "superTypeParameter";
                break;
            case 45:
                objArr[0] = "subTypeParameter";
                break;
            case 47:
                objArr[0] = "name";
                break;
            case 48:
                objArr[0] = "membersFromSupertypes";
                break;
            case 49:
                objArr[0] = "membersFromCurrent";
                break;
            case 50:
            case 56:
            case 59:
            case 80:
            case 83:
            case 91:
                objArr[0] = "current";
                break;
            case 51:
            case 57:
            case 61:
            case 81:
            case 101:
                objArr[0] = "strategy";
                break;
            case 52:
                objArr[0] = "overriding";
                break;
            case 53:
                objArr[0] = "fromSuper";
                break;
            case 54:
                objArr[0] = "fromCurrent";
                break;
            case 55:
                objArr[0] = "descriptorsFromSuper";
                break;
            case 58:
            case 60:
                objArr[0] = "notOverridden";
                break;
            case 62:
            case 64:
            case 68:
                objArr[0] = "a";
                break;
            case 63:
            case 65:
            case 70:
                objArr[0] = "b";
                break;
            case 66:
                objArr[0] = "candidate";
                break;
            case 67:
            case 82:
            case 88:
            case 105:
                objArr[0] = "descriptors";
                break;
            case 69:
                objArr[0] = "aReturnType";
                break;
            case 71:
                objArr[0] = "bReturnType";
                break;
            case 72:
            case 79:
                objArr[0] = "overridables";
                break;
            case 73:
            case 96:
                objArr[0] = "descriptorByHandle";
                break;
            case 89:
                objArr[0] = "classModality";
                break;
            case 92:
                objArr[0] = "toFilter";
                break;
            case 94:
            case 99:
                objArr[0] = "overrider";
                break;
            case 95:
            case 100:
                objArr[0] = "extractFrom";
                break;
            case 97:
                objArr[0] = "onConflict";
                break;
            case 103:
            case 104:
                objArr[0] = "memberDescriptor";
                break;
            default:
                objArr[0] = "equalityAxioms";
                break;
        }
        if (i3 == 1) {
            objArr[1] = "createWithEqualityAxioms";
        } else if (i3 == 3) {
            objArr[1] = "filterOutOverridden";
        } else if (i3 != 11) {
            if (i3 != 16) {
                if (i3 == 90) {
                    objArr[1] = "getMinimalModality";
                } else if (i3 != 93) {
                    if (i3 != 98 && i3 != 102) {
                        if (i3 != 6 && i3 != 7) {
                            if (i3 != 39 && i3 != 40) {
                                switch (i3) {
                                    case 19:
                                    case 20:
                                    case 21:
                                    case 22:
                                    case 23:
                                    case 24:
                                        break;
                                    default:
                                        switch (i3) {
                                            case 27:
                                            case 28:
                                            case 29:
                                            case 30:
                                            case 31:
                                            case 32:
                                            case 33:
                                            case 34:
                                                objArr[1] = "isOverridableByWithoutExternalConditions";
                                                break;
                                            default:
                                                switch (i3) {
                                                    case 74:
                                                    case 75:
                                                    case 76:
                                                    case 77:
                                                    case 78:
                                                        objArr[1] = "selectMostSpecificMember";
                                                        break;
                                                    default:
                                                        switch (i3) {
                                                            case 84:
                                                            case 85:
                                                            case 86:
                                                            case 87:
                                                                objArr[1] = "determineModalityForFakeOverride";
                                                                break;
                                                            default:
                                                                objArr[1] = str2;
                                                                break;
                                                        }
                                                }
                                        }
                                }
                            } else {
                                objArr[1] = "createTypeChecker";
                            }
                        } else {
                            objArr[1] = "filterOverrides";
                        }
                    } else {
                        objArr[1] = "extractMembersOverridableInBothWays";
                    }
                } else {
                    objArr[1] = "filterVisibleFakeOverrides";
                }
            }
            objArr[1] = "isOverridableBy";
        } else {
            objArr[1] = "getOverriddenDeclarations";
        }
        switch (i3) {
            case 1:
            case 3:
            case 6:
            case 7:
            case 11:
            case 16:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 39:
            case 40:
            case 74:
            case 75:
            case 76:
            case 77:
            case 78:
            case 84:
            case 85:
            case 86:
            case 87:
            case 90:
            case 93:
            case 98:
            case 102:
                break;
            case 2:
                objArr[2] = "filterOutOverridden";
                break;
            case 4:
            case 5:
                objArr[2] = "filterOverrides";
                break;
            case 8:
            case 9:
                objArr[2] = "overrides";
                break;
            case 10:
                objArr[2] = "getOverriddenDeclarations";
                break;
            case 12:
            case 13:
                objArr[2] = "collectOverriddenDeclarations";
                break;
            case 14:
            case 15:
            case 17:
            case 18:
                objArr[2] = "isOverridableBy";
                break;
            case 25:
            case 26:
                objArr[2] = "isOverridableByWithoutExternalConditions";
                break;
            case 35:
            case 36:
                objArr[2] = "getBasicOverridabilityProblem";
                break;
            case 37:
            case 38:
                objArr[2] = "createTypeChecker";
                break;
            case 41:
            case 42:
            case 43:
                objArr[2] = "areTypesEquivalent";
                break;
            case 44:
            case 45:
            case 46:
                objArr[2] = "areTypeParametersEquivalent";
                break;
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
                objArr[2] = "generateOverridesInFunctionGroup";
                break;
            case 52:
            case 53:
                objArr[2] = "isVisibleForOverride";
                break;
            case 54:
            case 55:
            case 56:
            case 57:
                objArr[2] = "extractAndBindOverridesForMember";
                break;
            case 58:
                objArr[2] = "allHasSameContainingDeclaration";
                break;
            case 59:
            case 60:
            case 61:
                objArr[2] = "createAndBindFakeOverrides";
                break;
            case 62:
            case 63:
                objArr[2] = "isMoreSpecific";
                break;
            case 64:
            case 65:
                objArr[2] = "isVisibilityMoreSpecific";
                break;
            case 66:
            case 67:
                objArr[2] = "isMoreSpecificThenAllOf";
                break;
            case 68:
            case 69:
            case 70:
            case 71:
                objArr[2] = "isReturnTypeMoreSpecific";
                break;
            case 72:
            case 73:
                objArr[2] = "selectMostSpecificMember";
                break;
            case 79:
            case 80:
            case 81:
                objArr[2] = "createAndBindFakeOverride";
                break;
            case 82:
            case 83:
                objArr[2] = "determineModalityForFakeOverride";
                break;
            case 88:
            case 89:
                objArr[2] = "getMinimalModality";
                break;
            case 91:
            case 92:
                objArr[2] = "filterVisibleFakeOverrides";
                break;
            case 94:
            case 95:
            case 96:
            case 97:
            case 99:
            case 100:
            case 101:
                objArr[2] = "extractMembersOverridableInBothWays";
                break;
            case 103:
                objArr[2] = "resolveUnknownVisibilityForMember";
                break;
            case 104:
                objArr[2] = "computeVisibilityToInherit";
                break;
            case 105:
                objArr[2] = "findMaxVisibility";
                break;
            default:
                objArr[2] = "createWithEqualityAxioms";
                break;
        }
        String format = String.format(str, objArr);
        if (!(i3 == 1 || i3 == 3 || i3 == 11 || i3 == 16 || i3 == 90 || i3 == 93 || i3 == 98 || i3 == 102 || i3 == 6 || i3 == 7 || i3 == 39 || i3 == 40)) {
            switch (i3) {
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                    break;
                default:
                    switch (i3) {
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                            break;
                        default:
                            switch (i3) {
                                case 74:
                                case 75:
                                case 76:
                                case 77:
                                case 78:
                                    break;
                                default:
                                    switch (i3) {
                                        case 84:
                                        case 85:
                                        case 86:
                                        case 87:
                                            break;
                                        default:
                                            th = new IllegalArgumentException(format);
                                            break;
                                    }
                            }
                    }
            }
        }
        th = new IllegalStateException(format);
        throw th;
    }

    private static boolean b(Collection<C4935Gcb> collection) {
        if (collection == null) {
            a(58);
            throw null;
        } else if (collection.size() < 2) {
            return true;
        } else {
            return C7676xWa.b((Iterable<? extends T>) collection, (_Xa<? super T, Boolean>) new C7215qpb<Object,Boolean>(((C4935Gcb) collection.iterator().next()).e()));
        }
    }

    public static boolean c(C4904Fcb fcb, C4904Fcb fcb2) {
        if (fcb == null) {
            a(62);
            throw null;
        } else if (fcb2 != null) {
            C7706xtb a2 = fcb.a();
            C7706xtb a3 = fcb2.a();
            boolean z = false;
            if (!a((C5390Vcb) fcb, (C5390Vcb) fcb2)) {
                return false;
            }
            if (fcb instanceof C5582adb) {
                return a(fcb, a2, fcb2, a3);
            }
            if (fcb instanceof C7408tdb) {
                C7408tdb tdb = (C7408tdb) fcb;
                C7408tdb tdb2 = (C7408tdb) fcb2;
                if (!a((C7339sdb) tdb.c(), (C7339sdb) tdb2.c())) {
                    return false;
                }
                if (tdb.V() && tdb2.V()) {
                    return b.a(fcb.getTypeParameters(), fcb2.getTypeParameters()).a(a2, a3);
                }
                if ((tdb.V() || !tdb2.V()) && a(fcb, a2, fcb2, a3)) {
                    z = true;
                }
                return z;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Unexpected callable: ");
            sb.append(fcb.getClass());
            throw new IllegalArgumentException(sb.toString());
        } else {
            a(63);
            throw null;
        }
    }

    public static <D extends C4904Fcb> boolean d(D d, D d2) {
        if (d == null) {
            a(8);
            throw null;
        } else if (d2 == null) {
            a(9);
            throw null;
        } else if (!d.equals(d2) && C6395epb.a.a((C5272Rcb) d.getOriginal(), (C5272Rcb) d2.getOriginal())) {
            return true;
        } else {
            C4904Fcb original = d2.getOriginal();
            for (C4904Fcb a2 : C6531gpb.a(d)) {
                if (C6395epb.a.a((C5272Rcb) original, (C5272Rcb) a2)) {
                    return true;
                }
            }
            return false;
        }
    }

    private static a e(C4904Fcb fcb, C4904Fcb fcb2) {
        boolean z = true;
        boolean z2 = fcb.l() == null;
        if (fcb2.l() != null) {
            z = false;
        }
        if (z2 != z) {
            return a.b("Receiver presence mismatch");
        }
        if (fcb.f().size() != fcb2.f().size()) {
            return a.b("Value parameter number mismatch");
        }
        return null;
    }

    public static C7629wpb a(defpackage.C6745jub.a aVar) {
        if (aVar != null) {
            return new C7629wpb(aVar);
        }
        a(0);
        throw null;
    }

    public static <D extends C4904Fcb> Set<D> a(Set<D> set) {
        if (set != null) {
            Set<D> a2 = a(set, (C6308dYa<? super D, ? super D, HVa<C4904Fcb, C4904Fcb>>) new C7077opb<Object,Object,HVa<C4904Fcb, C4904Fcb>>());
            if (a2 != null) {
                return a2;
            }
            a(3);
            throw null;
        }
        a(2);
        throw null;
    }

    public static C0186a b(C4904Fcb fcb, C4904Fcb fcb2) {
        C0186a a2 = b.a(fcb2, fcb, (C5029Jcb) null).a();
        C0186a a3 = b.a(fcb, fcb2, (C5029Jcb) null).a();
        C0186a aVar = C0186a.OVERRIDABLE;
        if (a2 == aVar && a3 == aVar) {
            return aVar;
        }
        C0186a aVar2 = C0186a.CONFLICT;
        return (a2 == aVar2 || a3 == aVar2) ? C0186a.CONFLICT : C0186a.INCOMPATIBLE;
    }

    public static <D> Set<D> a(Set<D> set, C6308dYa<? super D, ? super D, HVa<C4904Fcb, C4904Fcb>> dya) {
        if (set == null) {
            a(4);
            throw null;
        } else if (dya == null) {
            a(5);
            throw null;
        } else if (set.size() > 1) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (Object next : set) {
                Iterator it = linkedHashSet.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        linkedHashSet.add(next);
                        break;
                    }
                    HVa hVa = (HVa) dya.invoke(next, it.next());
                    C4904Fcb fcb = (C4904Fcb) hVa.a();
                    C4904Fcb fcb2 = (C4904Fcb) hVa.b();
                    if (d(fcb, fcb2)) {
                        it.remove();
                    } else if (d(fcb2, fcb)) {
                        break;
                    }
                }
            }
            return linkedHashSet;
        } else if (set != null) {
            return set;
        } else {
            a(6);
            throw null;
        }
    }

    private static C5583aeb b(C4935Gcb gcb) {
        if (gcb != null) {
            Collection<C4935Gcb> j = gcb.j();
            C5583aeb a2 = a(j);
            if (a2 == null) {
                return null;
            }
            if (gcb.g() != defpackage.C4935Gcb.a.FAKE_OVERRIDE) {
                return a2.c();
            }
            for (C4935Gcb gcb2 : j) {
                if (gcb2.h() != C6314ddb.ABSTRACT && !gcb2.d().equals(a2)) {
                    return null;
                }
            }
            return a2;
        }
        a(104);
        throw null;
    }

    public static Set<C4935Gcb> a(C4935Gcb gcb) {
        if (gcb != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            a(gcb, (Set<C4935Gcb>) linkedHashSet);
            return linkedHashSet;
        }
        a(10);
        throw null;
    }

    private static void a(C4935Gcb gcb, Set<C4935Gcb> set) {
        if (gcb == null) {
            a(12);
            throw null;
        } else if (set == null) {
            a(13);
            throw null;
        } else if (gcb.g().a()) {
            set.add(gcb);
        } else if (!gcb.j().isEmpty()) {
            for (C4935Gcb a2 : gcb.j()) {
                a(a2, set);
            }
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("No overridden descriptors found for (fake override) ");
            sb.append(gcb);
            throw new IllegalStateException(sb.toString());
        }
    }

    public a a(C4904Fcb fcb, C4904Fcb fcb2, C5029Jcb jcb) {
        if (fcb == null) {
            a(14);
            throw null;
        } else if (fcb2 != null) {
            a a2 = a(fcb, fcb2, jcb, false);
            if (a2 != null) {
                return a2;
            }
            a(16);
            throw null;
        } else {
            a(15);
            throw null;
        }
    }

    public a a(C4904Fcb fcb, C4904Fcb fcb2, C5029Jcb jcb, boolean z) {
        if (fcb == null) {
            a(17);
            throw null;
        } else if (fcb2 != null) {
            a a2 = a(fcb, fcb2, z);
            boolean z2 = a2.a() == C0186a.OVERRIDABLE;
            Iterator it = a.iterator();
            while (true) {
                String str = "External condition";
                String str2 = "External condition failed";
                if (it.hasNext()) {
                    C6599hpb hpb = (C6599hpb) it.next();
                    if (hpb.a() != defpackage.C6599hpb.a.CONFLICTS_ONLY && (!z2 || hpb.a() != defpackage.C6599hpb.a.SUCCESS_ONLY)) {
                        int i = C7560vpb.a[hpb.a(fcb, fcb2, jcb).ordinal()];
                        if (i == 1) {
                            z2 = true;
                        } else if (i == 2) {
                            a a3 = a.a(str2);
                            if (a3 != null) {
                                return a3;
                            }
                            a(19);
                            throw null;
                        } else if (i == 3) {
                            a b2 = a.b(str);
                            if (b2 != null) {
                                return b2;
                            }
                            a(20);
                            throw null;
                        }
                    }
                } else if (z2) {
                    for (C6599hpb hpb2 : a) {
                        if (hpb2.a() == defpackage.C6599hpb.a.CONFLICTS_ONLY) {
                            int i2 = C7560vpb.a[hpb2.a(fcb, fcb2, jcb).ordinal()];
                            if (i2 == 1) {
                                StringBuilder sb = new StringBuilder();
                                sb.append("Contract violation in ");
                                sb.append(hpb2.getClass().getName());
                                sb.append(" condition. It's not supposed to end with success");
                                throw new IllegalStateException(sb.toString());
                            } else if (i2 == 2) {
                                a a4 = a.a(str2);
                                if (a4 != null) {
                                    return a4;
                                }
                                a(22);
                                throw null;
                            } else if (i2 == 3) {
                                a b3 = a.b(str);
                                if (b3 != null) {
                                    return b3;
                                }
                                a(23);
                                throw null;
                            }
                        }
                    }
                    a b4 = a.b();
                    if (b4 != null) {
                        return b4;
                    }
                    a(24);
                    throw null;
                } else if (a2 != null) {
                    return a2;
                } else {
                    a(21);
                    throw null;
                }
            }
        } else {
            a(18);
            throw null;
        }
    }

    public a a(C4904Fcb fcb, C4904Fcb fcb2, boolean z) {
        if (fcb == null) {
            a(25);
            throw null;
        } else if (fcb2 != null) {
            a a2 = a(fcb, fcb2);
            if (a2 == null) {
                List a3 = a(fcb);
                List a4 = a(fcb2);
                List typeParameters = fcb.getTypeParameters();
                List typeParameters2 = fcb2.getTypeParameters();
                int i = 0;
                if (typeParameters.size() != typeParameters2.size()) {
                    while (true) {
                        String str = "Type parameter number mismatch";
                        if (i >= a3.size()) {
                            a a5 = a.a(str);
                            if (a5 != null) {
                                return a5;
                            }
                            a(29);
                            throw null;
                        } else if (!C6745jub.a.a((C7706xtb) a3.get(i), (C7706xtb) a4.get(i))) {
                            a b2 = a.b(str);
                            if (b2 != null) {
                                return b2;
                            }
                            a(28);
                            throw null;
                        } else {
                            i++;
                        }
                    }
                } else {
                    C6745jub a6 = a(typeParameters, typeParameters2);
                    for (int i2 = 0; i2 < typeParameters.size(); i2++) {
                        if (!a((C4905Fdb) typeParameters.get(i2), (C4905Fdb) typeParameters2.get(i2), a6)) {
                            a b3 = a.b("Type parameter bounds mismatch");
                            if (b3 != null) {
                                return b3;
                            }
                            a(30);
                            throw null;
                        }
                    }
                    for (int i3 = 0; i3 < a3.size(); i3++) {
                        if (!a((C7706xtb) a3.get(i3), (C7706xtb) a4.get(i3), a6)) {
                            a b4 = a.b("Value parameter type mismatch");
                            if (b4 != null) {
                                return b4;
                            }
                            a(31);
                            throw null;
                        }
                    }
                    if (!(fcb instanceof C5582adb) || !(fcb2 instanceof C5582adb) || ((C5582adb) fcb).s() == ((C5582adb) fcb2).s()) {
                        if (z) {
                            C7706xtb a7 = fcb.a();
                            C7706xtb a8 = fcb2.a();
                            if (!(a7 == null || a8 == null)) {
                                if (C7844ztb.a(a8) && C7844ztb.a(a7)) {
                                    i = 1;
                                }
                                if (i == 0 && !a6.b(a8, a7)) {
                                    a a9 = a.a("Return type mismatch");
                                    if (a9 != null) {
                                        return a9;
                                    }
                                    a(33);
                                    throw null;
                                }
                            }
                        }
                        a b5 = a.b();
                        if (b5 != null) {
                            return b5;
                        }
                        a(34);
                        throw null;
                    }
                    a a10 = a.a("Incompatible suspendability");
                    if (a10 != null) {
                        return a10;
                    }
                    a(32);
                    throw null;
                }
            } else if (a2 != null) {
                return a2;
            } else {
                a(27);
                throw null;
            }
        } else {
            a(26);
            throw null;
        }
    }

    public static a a(C4904Fcb fcb, C4904Fcb fcb2) {
        if (fcb == null) {
            a(35);
            throw null;
        } else if (fcb2 != null) {
            boolean z = fcb instanceof C5582adb;
            if (!z || (fcb2 instanceof C5582adb)) {
                boolean z2 = fcb instanceof C7408tdb;
                if (!z2 || (fcb2 instanceof C7408tdb)) {
                    if (!z && !z2) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("This type of CallableDescriptor cannot be checked for overridability: ");
                        sb.append(fcb);
                        throw new IllegalArgumentException(sb.toString());
                    } else if (!fcb.getName().equals(fcb2.getName())) {
                        return a.b("Name mismatch");
                    } else {
                        a e = e(fcb, fcb2);
                        if (e != null) {
                            return e;
                        }
                        return null;
                    }
                }
            }
            return a.b("Member kind mismatch");
        } else {
            a(36);
            throw null;
        }
    }

    private C6745jub a(List<C4905Fdb> list, List<C4905Fdb> list2) {
        if (list == null) {
            a(37);
            throw null;
        } else if (list2 == null) {
            a(38);
            throw null;
        } else if (list.isEmpty()) {
            C6745jub a2 = C6881lub.a(this.c);
            if (a2 != null) {
                return a2;
            }
            a(39);
            throw null;
        } else {
            HashMap hashMap = new HashMap();
            for (int i = 0; i < list.size(); i++) {
                hashMap.put(((C4905Fdb) list.get(i)).Q(), ((C4905Fdb) list2.get(i)).Q());
            }
            C6745jub a3 = C6881lub.a((defpackage.C6745jub.a) new C7146ppb(this, hashMap));
            if (a3 != null) {
                return a3;
            }
            a(40);
            throw null;
        }
    }

    private static boolean a(C7706xtb xtb, C7706xtb xtb2, C6745jub jub) {
        if (xtb == null) {
            a(41);
            throw null;
        } else if (xtb2 == null) {
            a(42);
            throw null;
        } else if (jub != null) {
            if ((C7844ztb.a(xtb) && C7844ztb.a(xtb2)) || jub.a(xtb, xtb2)) {
                return true;
            }
            return false;
        } else {
            a(43);
            throw null;
        }
    }

    private static boolean a(C4905Fdb fdb, C4905Fdb fdb2, C6745jub jub) {
        if (fdb == null) {
            a(44);
            throw null;
        } else if (fdb2 == null) {
            a(45);
            throw null;
        } else if (jub != null) {
            List<C7706xtb> upperBounds = fdb.getUpperBounds();
            ArrayList arrayList = new ArrayList(fdb2.getUpperBounds());
            if (upperBounds.size() != arrayList.size()) {
                return false;
            }
            for (C7706xtb xtb : upperBounds) {
                ListIterator listIterator = arrayList.listIterator();
                while (listIterator.hasNext()) {
                    if (a(xtb, (C7706xtb) listIterator.next(), jub)) {
                        listIterator.remove();
                    }
                }
                return false;
            }
            return true;
        } else {
            a(46);
            throw null;
        }
    }

    private static List<C7706xtb> a(C4904Fcb fcb) {
        C7615wdb l = fcb.l();
        ArrayList arrayList = new ArrayList();
        if (l != null) {
            arrayList.add(l.getType());
        }
        for (C5061Kdb type : fcb.f()) {
            arrayList.add(type.getType());
        }
        return arrayList;
    }

    public static void a(C7694xnb xnb, Collection<? extends C4935Gcb> collection, Collection<? extends C4935Gcb> collection2, C5029Jcb jcb, C6939mpb mpb) {
        if (xnb == null) {
            a(47);
            throw null;
        } else if (collection == null) {
            a(48);
            throw null;
        } else if (collection2 == null) {
            a(49);
            throw null;
        } else if (jcb == null) {
            a(50);
            throw null;
        } else if (mpb != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(collection);
            for (C4935Gcb a2 : collection2) {
                linkedHashSet.removeAll(a(a2, collection, jcb, mpb));
            }
            a(jcb, (Collection<C4935Gcb>) linkedHashSet, mpb);
        } else {
            a(51);
            throw null;
        }
    }

    public static boolean a(C5718cdb cdb, C5718cdb cdb2) {
        if (cdb == null) {
            a(52);
            throw null;
        } else if (cdb2 != null) {
            return !_db.a(cdb2.d()) && _db.a((C5390Vcb) cdb2, (C5272Rcb) cdb);
        } else {
            a(53);
            throw null;
        }
    }

    private static Collection<C4935Gcb> a(C4935Gcb gcb, Collection<? extends C4935Gcb> collection, C5029Jcb jcb, C6939mpb mpb) {
        if (gcb == null) {
            a(54);
            throw null;
        } else if (collection == null) {
            a(55);
            throw null;
        } else if (jcb == null) {
            a(56);
            throw null;
        } else if (mpb != null) {
            ArrayList arrayList = new ArrayList(collection.size());
            Gvb c2 = Gvb.c();
            for (C4935Gcb gcb2 : collection) {
                C0186a a2 = b.a((C4904Fcb) gcb2, (C4904Fcb) gcb, jcb).a();
                boolean a3 = a((C5718cdb) gcb, (C5718cdb) gcb2);
                int i = C7560vpb.b[a2.ordinal()];
                if (i == 1) {
                    if (a3) {
                        c2.add(gcb2);
                    }
                    arrayList.add(gcb2);
                } else if (i == 2) {
                    if (a3) {
                        mpb.b(gcb2, gcb);
                    }
                    arrayList.add(gcb2);
                }
            }
            mpb.a(gcb, (Collection<? extends C4935Gcb>) c2);
            return arrayList;
        } else {
            a(57);
            throw null;
        }
    }

    private static void a(C5029Jcb jcb, Collection<C4935Gcb> collection, C6939mpb mpb) {
        if (jcb == null) {
            a(59);
            throw null;
        } else if (collection == null) {
            a(60);
            throw null;
        } else if (mpb == null) {
            a(61);
            throw null;
        } else if (b(collection)) {
            for (C4935Gcb singleton : collection) {
                a((Collection<C4935Gcb>) Collections.singleton(singleton), jcb, mpb);
            }
        } else {
            LinkedList linkedList = new LinkedList(collection);
            while (!linkedList.isEmpty()) {
                a(a(Apb.a(linkedList), (Queue<C4935Gcb>) linkedList, mpb), jcb, mpb);
            }
        }
    }

    private static boolean a(C5390Vcb vcb, C5390Vcb vcb2) {
        if (vcb == null) {
            a(64);
            throw null;
        } else if (vcb2 != null) {
            Integer a2 = _db.a(vcb.d(), vcb2.d());
            return a2 == null || a2.intValue() >= 0;
        } else {
            a(65);
            throw null;
        }
    }

    private static boolean a(C7339sdb sdb, C7339sdb sdb2) {
        if (sdb == null || sdb2 == null) {
            return true;
        }
        return a((C5390Vcb) sdb, (C5390Vcb) sdb2);
    }

    private static boolean a(C4904Fcb fcb, Collection<C4904Fcb> collection) {
        if (fcb == null) {
            a(66);
            throw null;
        } else if (collection != null) {
            for (C4904Fcb c2 : collection) {
                if (!c(fcb, c2)) {
                    return false;
                }
            }
            return true;
        } else {
            a(67);
            throw null;
        }
    }

    private static boolean a(C4904Fcb fcb, C7706xtb xtb, C4904Fcb fcb2, C7706xtb xtb2) {
        if (fcb == null) {
            a(68);
            throw null;
        } else if (xtb == null) {
            a(69);
            throw null;
        } else if (fcb2 == null) {
            a(70);
            throw null;
        } else if (xtb2 != null) {
            return b.a(fcb.getTypeParameters(), fcb2.getTypeParameters()).b(xtb, xtb2);
        } else {
            a(71);
            throw null;
        }
    }

    public static <H> H a(Collection<H> collection, _Xa<H, C4904Fcb> _xa) {
        H h;
        if (collection == null) {
            a(72);
            throw null;
        } else if (_xa == null) {
            a(73);
            throw null;
        } else if (collection.size() == 1) {
            H g = C7676xWa.g((Iterable<? extends T>) collection);
            if (g != null) {
                return g;
            }
            a(74);
            throw null;
        } else {
            ArrayList arrayList = new ArrayList(2);
            List d = C7676xWa.d((Iterable<? extends T>) collection, _xa);
            H g2 = C7676xWa.g((Iterable<? extends T>) collection);
            C4904Fcb fcb = (C4904Fcb) _xa.invoke(g2);
            for (H next : collection) {
                C4904Fcb fcb2 = (C4904Fcb) _xa.invoke(next);
                if (a(fcb2, (Collection<C4904Fcb>) d)) {
                    arrayList.add(next);
                }
                if (c(fcb2, fcb) && !c(fcb, fcb2)) {
                    g2 = next;
                }
            }
            if (arrayList.isEmpty()) {
                if (g2 != null) {
                    return g2;
                }
                a(75);
                throw null;
            } else if (arrayList.size() == 1) {
                H g3 = C7676xWa.g((Iterable<? extends T>) arrayList);
                if (g3 != null) {
                    return g3;
                }
                a(76);
                throw null;
            } else {
                Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        h = null;
                        break;
                    }
                    h = it.next();
                    if (!C7430ttb.b(((C4904Fcb) _xa.invoke(h)).a())) {
                        break;
                    }
                }
                if (h == null) {
                    H g4 = C7676xWa.g((Iterable<? extends T>) arrayList);
                    if (g4 != null) {
                        return g4;
                    }
                    a(78);
                    throw null;
                } else if (h != null) {
                    return h;
                } else {
                    a(77);
                    throw null;
                }
            }
        }
    }

    private static void a(Collection<C4935Gcb> collection, C5029Jcb jcb, C6939mpb mpb) {
        if (collection == null) {
            a(79);
            throw null;
        } else if (jcb == null) {
            a(80);
            throw null;
        } else if (mpb != null) {
            Collection<C4935Gcb> a2 = a(jcb, collection);
            boolean isEmpty = a2.isEmpty();
            if (!isEmpty) {
                collection = a2;
            }
            C4935Gcb a3 = ((C4935Gcb) a(collection, (_Xa<H, C4904Fcb>) new C7284rpb<H,C4904Fcb>())).a(jcb, a(collection, jcb), isEmpty ? _db.h : _db.g, defpackage.C4935Gcb.a.FAKE_OVERRIDE, false);
            mpb.a(a3, collection);
            mpb.a(a3);
        } else {
            a(81);
            throw null;
        }
    }

    private static C6314ddb a(Collection<C4935Gcb> collection, C5029Jcb jcb) {
        if (collection == null) {
            a(82);
            throw null;
        } else if (jcb != null) {
            boolean z = false;
            boolean z2 = false;
            boolean z3 = false;
            for (C4935Gcb gcb : collection) {
                int i = C7560vpb.c[gcb.h().ordinal()];
                if (i == 1) {
                    C6314ddb ddb = C6314ddb.FINAL;
                    if (ddb != null) {
                        return ddb;
                    }
                    a(84);
                    throw null;
                } else if (i == 2) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Member cannot have SEALED modality: ");
                    sb.append(gcb);
                    throw new IllegalStateException(sb.toString());
                } else if (i == 3) {
                    z2 = true;
                } else if (i == 4) {
                    z3 = true;
                }
            }
            if (!(!jcb.p() || jcb.h() == C6314ddb.ABSTRACT || jcb.h() == C6314ddb.SEALED)) {
                z = true;
            }
            if (z2 && !z3) {
                C6314ddb ddb2 = C6314ddb.OPEN;
                if (ddb2 != null) {
                    return ddb2;
                }
                a(85);
                throw null;
            } else if (z2 || !z3) {
                HashSet hashSet = new HashSet();
                for (C4935Gcb a2 : collection) {
                    hashSet.addAll(a(a2));
                }
                C6314ddb a3 = a((Collection<C4935Gcb>) a((Set<D>) hashSet), z, jcb.h());
                if (a3 != null) {
                    return a3;
                }
                a(87);
                throw null;
            } else {
                C6314ddb h = z ? jcb.h() : C6314ddb.ABSTRACT;
                if (h != null) {
                    return h;
                }
                a(86);
                throw null;
            }
        } else {
            a(83);
            throw null;
        }
    }

    private static C6314ddb a(Collection<C4935Gcb> collection, boolean z, C6314ddb ddb) {
        if (collection == null) {
            a(88);
            throw null;
        } else if (ddb != null) {
            C6314ddb ddb2 = C6314ddb.ABSTRACT;
            for (C4935Gcb gcb : collection) {
                C6314ddb h = (!z || gcb.h() != C6314ddb.ABSTRACT) ? gcb.h() : ddb;
                if (h.compareTo(ddb2) < 0) {
                    ddb2 = h;
                }
            }
            if (ddb2 != null) {
                return ddb2;
            }
            a(90);
            throw null;
        } else {
            a(89);
            throw null;
        }
    }

    private static Collection<C4935Gcb> a(C5029Jcb jcb, Collection<C4935Gcb> collection) {
        if (jcb == null) {
            a(91);
            throw null;
        } else if (collection != null) {
            List c2 = C7676xWa.c((Iterable<? extends T>) collection, (_Xa<? super T, Boolean>) new C7353spb<Object,Boolean>(jcb));
            if (c2 != null) {
                return c2;
            }
            a(93);
            throw null;
        } else {
            a(92);
            throw null;
        }
    }

    public static <H> Collection<H> a(H h, Collection<H> collection, _Xa<H, C4904Fcb> _xa, _Xa<H, RVa> _xa2) {
        if (h == null) {
            a(94);
            throw null;
        } else if (collection == null) {
            a(95);
            throw null;
        } else if (_xa == null) {
            a(96);
            throw null;
        } else if (_xa2 != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(h);
            C4904Fcb fcb = (C4904Fcb) _xa.invoke(h);
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                H next = it.next();
                C4904Fcb fcb2 = (C4904Fcb) _xa.invoke(next);
                if (h == next) {
                    it.remove();
                } else {
                    C0186a b2 = b(fcb, fcb2);
                    if (b2 == C0186a.OVERRIDABLE) {
                        arrayList.add(next);
                        it.remove();
                    } else if (b2 == C0186a.CONFLICT) {
                        _xa2.invoke(next);
                        it.remove();
                    }
                }
            }
            return arrayList;
        } else {
            a(97);
            throw null;
        }
    }

    private static Collection<C4935Gcb> a(C4935Gcb gcb, Queue<C4935Gcb> queue, C6939mpb mpb) {
        if (gcb == null) {
            a(99);
            throw null;
        } else if (queue == null) {
            a(100);
            throw null;
        } else if (mpb != null) {
            Collection<C4935Gcb> a2 = a((H) gcb, (Collection<H>) queue, (_Xa<H, C4904Fcb>) new C7422tpb<H,C4904Fcb>(), (_Xa<H, RVa>) new C7491upb<H,RVa>(mpb, gcb));
            if (a2 != null) {
                return a2;
            }
            a(102);
            throw null;
        } else {
            a(101);
            throw null;
        }
    }

    public static void a(C4935Gcb gcb, _Xa<C4935Gcb, RVa> _xa) {
        C5583aeb aeb;
        if (gcb != null) {
            for (C4935Gcb gcb2 : gcb.j()) {
                if (gcb2.d() == _db.g) {
                    a(gcb2, _xa);
                }
            }
            if (gcb.d() == _db.g) {
                C5583aeb b2 = b(gcb);
                if (b2 == null) {
                    if (_xa != null) {
                        _xa.invoke(gcb);
                    }
                    aeb = _db.e;
                } else {
                    aeb = b2;
                }
                if (gcb instanceof C7065ofb) {
                    ((C7065ofb) gcb).a(aeb);
                    for (C7339sdb a2 : ((C7408tdb) gcb).P()) {
                        a((C4935Gcb) a2, b2 == null ? null : _xa);
                    }
                } else if (gcb instanceof _eb) {
                    ((_eb) gcb).a(aeb);
                } else {
                    C6996nfb nfb = (C6996nfb) gcb;
                    nfb.a(aeb);
                    if (aeb != nfb.I().d()) {
                        nfb.b(false);
                    }
                }
                return;
            }
            return;
        }
        a(103);
        throw null;
    }

    public static C5583aeb a(Collection<? extends C4935Gcb> collection) {
        C5583aeb aeb;
        if (collection == null) {
            a(105);
            throw null;
        } else if (collection.isEmpty()) {
            return _db.l;
        } else {
            Iterator it = collection.iterator();
            loop0:
            while (true) {
                aeb = null;
                while (true) {
                    if (!it.hasNext()) {
                        break loop0;
                    }
                    C5583aeb d = ((C4935Gcb) it.next()).d();
                    if (aeb != null) {
                        Integer a2 = _db.a(d, aeb);
                        if (a2 != null) {
                            if (a2.intValue() <= 0) {
                            }
                        }
                    }
                    aeb = d;
                }
            }
            if (aeb == null) {
                return null;
            }
            for (C4935Gcb d2 : collection) {
                Integer a3 = _db.a(aeb, d2.d());
                if (a3 != null) {
                    if (a3.intValue() < 0) {
                    }
                }
                return null;
            }
            return aeb;
        }
    }
}
