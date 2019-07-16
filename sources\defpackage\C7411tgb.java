package defpackage;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;

/* renamed from: tgb reason: default package and case insensitive filesystem */
/* compiled from: DescriptorResolverUtils */
public final class C7411tgb {
    public static <D extends C4935Gcb> Collection<D> a(C7694xnb xnb, Collection<D> collection, Collection<D> collection2, C5029Jcb jcb, C7357srb srb) {
        if (xnb == null) {
            a(0);
            throw null;
        } else if (collection == null) {
            a(1);
            throw null;
        } else if (collection2 == null) {
            a(2);
            throw null;
        } else if (jcb == null) {
            a(3);
            throw null;
        } else if (srb != null) {
            Collection<D> a = a(xnb, collection, collection2, jcb, srb, false);
            if (a != null) {
                return a;
            }
            a(5);
            throw null;
        } else {
            a(4);
            throw null;
        }
    }

    private static /* synthetic */ void a(int i) {
        String str = (i == 5 || i == 11 || i == 17) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i == 5 || i == 11 || i == 17) ? 2 : 3)];
        String str2 = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils";
        switch (i) {
            case 1:
            case 7:
            case 13:
                objArr[0] = "membersFromSupertypes";
                break;
            case 2:
            case 8:
            case 14:
                objArr[0] = "membersFromCurrent";
                break;
            case 3:
            case 9:
            case 15:
                objArr[0] = "classDescriptor";
                break;
            case 4:
            case 10:
            case 16:
                objArr[0] = "errorReporter";
                break;
            case 5:
            case 11:
            case 17:
                objArr[0] = str2;
                break;
            case 19:
                objArr[0] = "annotationClass";
                break;
            case 20:
                objArr[0] = "member";
                break;
            case 21:
            case 22:
                objArr[0] = "method";
                break;
            case 23:
                objArr[0] = "fqName";
                break;
            default:
                objArr[0] = "name";
                break;
        }
        String str3 = "resolveOverrides";
        String str4 = "resolveOverridesForStaticMembers";
        String str5 = "resolveOverridesForNonStaticMembers";
        if (i == 5) {
            objArr[1] = str5;
        } else if (i == 11) {
            objArr[1] = str4;
        } else if (i != 17) {
            objArr[1] = str2;
        } else {
            objArr[1] = str3;
        }
        switch (i) {
            case 5:
            case 11:
            case 17:
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                objArr[2] = str4;
                break;
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
                objArr[2] = str3;
                break;
            case 18:
            case 19:
                objArr[2] = "getAnnotationParameterByName";
                break;
            case 20:
                objArr[2] = "isObjectMethodInInterface";
                break;
            case 21:
                objArr[2] = "isObjectMethod";
                break;
            case 22:
            case 23:
                objArr[2] = "isMethodWithOneParameterWithFqName";
                break;
            default:
                objArr[2] = str5;
                break;
        }
        String format = String.format(str, objArr);
        throw ((i == 5 || i == 11 || i == 17) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    public static <D extends C4935Gcb> Collection<D> b(C7694xnb xnb, Collection<D> collection, Collection<D> collection2, C5029Jcb jcb, C7357srb srb) {
        if (xnb == null) {
            a(6);
            throw null;
        } else if (collection == null) {
            a(7);
            throw null;
        } else if (collection2 == null) {
            a(8);
            throw null;
        } else if (jcb == null) {
            a(9);
            throw null;
        } else if (srb != null) {
            Collection<D> a = a(xnb, collection, collection2, jcb, srb, true);
            if (a != null) {
                return a;
            }
            a(11);
            throw null;
        } else {
            a(10);
            throw null;
        }
    }

    private static <D extends C4935Gcb> Collection<D> a(C7694xnb xnb, Collection<D> collection, Collection<D> collection2, C5029Jcb jcb, C7357srb srb, boolean z) {
        if (xnb == null) {
            a(12);
            throw null;
        } else if (collection == null) {
            a(13);
            throw null;
        } else if (collection2 == null) {
            a(14);
            throw null;
        } else if (jcb == null) {
            a(15);
            throw null;
        } else if (srb != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            C7629wpb.a(xnb, collection, collection2, jcb, new C7342sgb(srb, linkedHashSet, z));
            return linkedHashSet;
        } else {
            a(16);
            throw null;
        }
    }

    public static C5061Kdb a(C7694xnb xnb, C5029Jcb jcb) {
        if (xnb == null) {
            a(18);
            throw null;
        } else if (jcb != null) {
            Collection i = jcb.i();
            if (i.size() != 1) {
                return null;
            }
            for (C5061Kdb kdb : ((C4997Icb) i.iterator().next()).f()) {
                if (kdb.getName().equals(xnb)) {
                    return kdb;
                }
            }
            return null;
        } else {
            a(19);
            throw null;
        }
    }

    public static boolean a(Tib tib) {
        if (tib != null) {
            return tib.j().t() && (tib instanceof Uib) && a((Uib) tib);
        }
        a(20);
        throw null;
    }

    public static boolean a(Uib uib) {
        if (uib != null) {
            String a = uib.getName().a();
            if (a.equals("toString") || a.equals("hashCode")) {
                return uib.f().isEmpty();
            }
            if (a.equals("equals")) {
                return a(uib, "java.lang.Object");
            }
            return false;
        }
        a(21);
        throw null;
    }

    private static boolean a(Uib uib, String str) {
        if (uib == null) {
            a(22);
            throw null;
        } else if (str != null) {
            List f = uib.f();
            boolean z = true;
            if (f.size() == 1) {
                Zib type = ((C5656bjb) f.get(0)).getType();
                if (type instanceof Nib) {
                    Mib e = ((Nib) type).e();
                    if (e instanceof Kib) {
                        C7349snb q = ((Kib) e).q();
                        if (q == null || !q.a().equals(str)) {
                            z = false;
                        }
                        return z;
                    }
                }
            }
            return false;
        } else {
            a(23);
            throw null;
        }
    }
}
