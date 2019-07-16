package defpackage;

import com.google.android.gms.common.internal.ImagesContract;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.ServiceLoader;
import java.util.Set;

/* renamed from: _db reason: default package */
/* compiled from: Visibilities */
public class _db {
    public static final C5583aeb a = new C5273Rdb("private", false);
    public static final C5583aeb b = new C5303Sdb("private_to_this", false);
    public static final C5583aeb c = new Tdb("protected", true);
    public static final C5583aeb d = new Udb("internal", false);
    public static final C5583aeb e = new Vdb("public", true);
    public static final C5583aeb f = new Wdb(ImagesContract.LOCAL, false);
    public static final C5583aeb g = new Xdb("inherited", false);
    public static final C5583aeb h = new Ydb("invisible_fake", false);
    public static final C5583aeb i = new Zdb("unknown", false);
    public static final Set<C5583aeb> j = Collections.unmodifiableSet(SWa.c(a, b, d, f));
    private static final Map<C5583aeb, Integer> k;
    public static final C5583aeb l = e;
    /* access modifiers changed from: private */
    public static final Tqb m = new C5183Odb();
    public static final Tqb n = new C5213Pdb();
    @Deprecated
    public static final Tqb o = new C5243Qdb();
    /* access modifiers changed from: private */
    public static final Yub p;

    static {
        Integer valueOf = Integer.valueOf(0);
        Integer valueOf2 = Integer.valueOf(1);
        HashMap a2 = C7089ovb.a(4);
        a2.put(b, valueOf);
        a2.put(a, valueOf);
        a2.put(d, valueOf2);
        a2.put(c, valueOf2);
        a2.put(e, Integer.valueOf(2));
        k = Collections.unmodifiableMap(a2);
        Iterator it = ServiceLoader.load(Yub.class, Yub.class.getClassLoader()).iterator();
        p = it.hasNext() ? (Yub) it.next() : a.a;
    }

    private static /* synthetic */ void a(int i2) {
        Object[] objArr = new Object[3];
        if (!(i2 == 1 || i2 == 3 || i2 == 5 || i2 == 7)) {
            switch (i2) {
                case 9:
                    break;
                case 10:
                case 12:
                    objArr[0] = "first";
                    break;
                case 11:
                case 13:
                    objArr[0] = "second";
                    break;
                case 14:
                    objArr[0] = "visibility";
                    break;
                default:
                    objArr[0] = "what";
                    break;
            }
        }
        objArr[0] = "from";
        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/Visibilities";
        switch (i2) {
            case 2:
            case 3:
                objArr[2] = "isVisibleIgnoringReceiver";
                break;
            case 4:
            case 5:
                objArr[2] = "isVisibleWithAnyReceiver";
                break;
            case 6:
            case 7:
                objArr[2] = "inSameFile";
                break;
            case 8:
            case 9:
                objArr[2] = "findInvisibleMember";
                break;
            case 10:
            case 11:
                objArr[2] = "compareLocal";
                break;
            case 12:
            case 13:
                objArr[2] = "compare";
                break;
            case 14:
                objArr[2] = "isPrivate";
                break;
            default:
                objArr[2] = "isVisible";
                break;
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public static boolean a(C5390Vcb vcb, C5272Rcb rcb) {
        if (vcb == null) {
            a(2);
            throw null;
        } else if (rcb != null) {
            return a(n, vcb, rcb) == null;
        } else {
            a(3);
            throw null;
        }
    }

    static Integer b(C5583aeb aeb, C5583aeb aeb2) {
        if (aeb == null) {
            a(10);
            throw null;
        } else if (aeb2 == null) {
            a(11);
            throw null;
        } else if (aeb == aeb2) {
            return Integer.valueOf(0);
        } else {
            Integer num = (Integer) k.get(aeb);
            Integer num2 = (Integer) k.get(aeb2);
            if (num == null || num2 == null || num.equals(num2)) {
                return null;
            }
            return Integer.valueOf(num.intValue() - num2.intValue());
        }
    }

    public static boolean a(C5272Rcb rcb, C5272Rcb rcb2) {
        if (rcb == null) {
            a(6);
            throw null;
        } else if (rcb2 != null) {
            C4781Bdb c2 = C6531gpb.c(rcb2);
            if (c2 != C4781Bdb.a) {
                return c2.equals(C6531gpb.c(rcb));
            }
            return false;
        } else {
            a(7);
            throw null;
        }
    }

    public static C5390Vcb a(Tqb tqb, C5390Vcb vcb, C5272Rcb rcb) {
        if (vcb == null) {
            a(8);
            throw null;
        } else if (rcb != null) {
            C5390Vcb vcb2 = (C5390Vcb) vcb.getOriginal();
            while (vcb2 != null && vcb2.d() != f) {
                if (!vcb2.d().a(tqb, vcb2, rcb)) {
                    return vcb2;
                }
                vcb2 = (C5390Vcb) C6531gpb.a((C5272Rcb) vcb2, C5390Vcb.class);
            }
            if (vcb instanceof C7479ufb) {
                C5390Vcb a2 = a(tqb, ((C7479ufb) vcb).W(), rcb);
                if (a2 != null) {
                    return a2;
                }
            }
            return null;
        } else {
            a(9);
            throw null;
        }
    }

    public static Integer a(C5583aeb aeb, C5583aeb aeb2) {
        if (aeb == null) {
            a(12);
            throw null;
        } else if (aeb2 != null) {
            Integer a2 = aeb.a(aeb2);
            if (a2 != null) {
                return a2;
            }
            Integer a3 = aeb2.a(aeb);
            if (a3 != null) {
                return Integer.valueOf(-a3.intValue());
            }
            return null;
        } else {
            a(13);
            throw null;
        }
    }

    public static boolean a(C5583aeb aeb) {
        if (aeb != null) {
            return aeb == a || aeb == b;
        }
        a(14);
        throw null;
    }
}
