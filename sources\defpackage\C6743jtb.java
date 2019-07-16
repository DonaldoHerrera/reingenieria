package defpackage;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: jtb reason: default package and case insensitive filesystem */
/* compiled from: DescriptorSubstitutor */
public class C6743jtb {
    public static _tb a(List<C4905Fdb> list, Wtb wtb, C5272Rcb rcb, List<C4905Fdb> list2) {
        if (list == null) {
            a(0);
            throw null;
        } else if (wtb == null) {
            a(1);
            throw null;
        } else if (rcb == null) {
            a(2);
            throw null;
        } else if (list2 != null) {
            _tb a = a(list, wtb, rcb, list2, null);
            if (a == null) {
                throw new AssertionError("Substitution failed");
            } else if (a != null) {
                return a;
            } else {
                a(4);
                throw null;
            }
        } else {
            a(3);
            throw null;
        }
    }

    private static /* synthetic */ void a(int i) {
        String str = i != 4 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[(i != 4 ? 3 : 2)];
        String str2 = "kotlin/reflect/jvm/internal/impl/types/DescriptorSubstitutor";
        switch (i) {
            case 1:
            case 6:
                objArr[0] = "originalSubstitution";
                break;
            case 2:
            case 7:
                objArr[0] = "newContainingDeclaration";
                break;
            case 3:
            case 8:
                objArr[0] = "result";
                break;
            case 4:
                objArr[0] = str2;
                break;
            default:
                objArr[0] = "typeParameters";
                break;
        }
        String str3 = "substituteTypeParameters";
        if (i != 4) {
            objArr[1] = str2;
        } else {
            objArr[1] = str3;
        }
        if (i != 4) {
            objArr[2] = str3;
        }
        String format = String.format(str, objArr);
        throw (i != 4 ? new IllegalArgumentException(format) : new IllegalStateException(format));
    }

    public static _tb a(List<C4905Fdb> list, Wtb wtb, C5272Rcb rcb, List<C4905Fdb> list2, boolean[] zArr) {
        Wtb wtb2 = wtb;
        List<C4905Fdb> list3 = list2;
        if (list == null) {
            a(5);
            throw null;
        } else if (wtb2 == null) {
            a(6);
            throw null;
        } else if (rcb == null) {
            a(7);
            throw null;
        } else if (list3 != null) {
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            int i = 0;
            for (C4905Fdb fdb : list) {
                int i2 = i + 1;
                C7686xfb a = C7686xfb.a(rcb, fdb.getAnnotations(), fdb.oa(), fdb.pa(), fdb.getName(), i, C7822zdb.a);
                hashMap.put(fdb.Q(), new Utb(a.z()));
                hashMap2.put(fdb, a);
                list3.add(a);
                i = i2;
            }
            _tb a2 = _tb.a(wtb2, (Wtb) Rtb.a((Map<Ptb, ? extends Stb>) hashMap));
            for (C4905Fdb fdb2 : list) {
                C7686xfb xfb = (C7686xfb) hashMap2.get(fdb2);
                for (C7706xtb xtb : fdb2.getUpperBounds()) {
                    C7706xtb b = a2.b(xtb, C6473fub.IN_VARIANCE);
                    if (b == null) {
                        return null;
                    }
                    if (!(b == xtb || zArr == null)) {
                        zArr[0] = true;
                    }
                    xfb.b(b);
                }
                xfb.ua();
            }
            return a2;
        } else {
            a(8);
            throw null;
        }
    }
}
