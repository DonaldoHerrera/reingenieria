package defpackage;

import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: rbb reason: default package and case insensitive filesystem */
/* compiled from: InlineClassAwareCaller.kt */
public final class C7268rbb {
    public static /* synthetic */ C6992nbb a(C6992nbb nbb, C4935Gcb gcb, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return a(nbb, gcb, z);
    }

    private static final boolean b(C4935Gcb gcb) {
        C7706xtb a = a(gcb);
        return a != null && C6667ipb.a(a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0058, code lost:
        if (defpackage.C6667ipb.a(r0) == true) goto L_0x0064;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0062, code lost:
        if (b(r6) != false) goto L_0x0064;
     */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    public static final <M extends Member> C6992nbb<M> a(C6992nbb<? extends M> nbb, C4935Gcb gcb, boolean z) {
        boolean z2;
        C7471uYa.b(nbb, "$this$createInlineClassAwareCallerIfNeeded");
        C7471uYa.b(gcb, "descriptor");
        boolean z3 = false;
        if (!C6667ipb.a((C4904Fcb) gcb)) {
            List f = gcb.f();
            C7471uYa.a((Object) f, "descriptor.valueParameters");
            if (!(f instanceof Collection) || !f.isEmpty()) {
                Iterator it = f.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C5061Kdb kdb = (C5061Kdb) it.next();
                    C7471uYa.a((Object) kdb, "it");
                    C7706xtb type = kdb.getType();
                    C7471uYa.a((Object) type, "it.type");
                    if (C6667ipb.a(type)) {
                        z2 = true;
                        break;
                    }
                }
            }
            z2 = false;
            if (!z2) {
                C7706xtb a = gcb.a();
                if (a != null) {
                }
                if (!(nbb instanceof C6924mbb)) {
                }
                return !z3 ? new C7199qbb(gcb, nbb, z) : nbb;
            }
        }
        z3 = true;
        if (!z3) {
        }
    }

    public static final Method b(Class<?> cls, C4935Gcb gcb) {
        C7471uYa.b(cls, "$this$getUnboxMethod");
        C7471uYa.b(gcb, "descriptor");
        try {
            Method declaredMethod = cls.getDeclaredMethod("unbox-impl", new Class[0]);
            C7471uYa.a((Object) declaredMethod, "getDeclaredMethod(\"unbox…FOR_INLINE_CLASS_MEMBERS)");
            return declaredMethod;
        } catch (NoSuchMethodException unused) {
            StringBuilder sb = new StringBuilder();
            sb.append("No unbox method found in inline class: ");
            sb.append(cls);
            sb.append(" (calling ");
            sb.append(gcb);
            sb.append(')');
            throw new C5240Qab(sb.toString());
        }
    }

    public static final Method a(Class<?> cls, C4935Gcb gcb) {
        C7471uYa.b(cls, "$this$getBoxMethod");
        C7471uYa.b(gcb, "descriptor");
        try {
            Method declaredMethod = cls.getDeclaredMethod("box-impl", new Class[]{b(cls, gcb).getReturnType()});
            C7471uYa.a((Object) declaredMethod, "getDeclaredMethod(\"box\" …d(descriptor).returnType)");
            return declaredMethod;
        } catch (NoSuchMethodException unused) {
            StringBuilder sb = new StringBuilder();
            sb.append("No box method found in inline class: ");
            sb.append(cls);
            sb.append(" (calling ");
            sb.append(gcb);
            sb.append(')');
            throw new C5240Qab(sb.toString());
        }
    }

    public static final Class<?> a(C7706xtb xtb) {
        C7471uYa.b(xtb, "$this$toInlineClass");
        return a((C5272Rcb) xtb.za().c());
    }

    public static final Class<?> a(C5272Rcb rcb) {
        if (rcb instanceof C5029Jcb) {
            C5029Jcb jcb = (C5029Jcb) rcb;
            if (jcb.isInline()) {
                Class<?> a = C6312dbb.a(jcb);
                if (a != null) {
                    return a;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("Class object for the class ");
                sb.append(jcb.getName());
                sb.append(" cannot be found (classId=");
                sb.append(C7148pqb.a((C5122Mcb) rcb));
                sb.append(')');
                throw new C5240Qab(sb.toString());
            }
        }
        return null;
    }

    private static final C7706xtb a(C4935Gcb gcb) {
        C7615wdb l = gcb.l();
        C7615wdb k = gcb.k();
        if (l != null) {
            return l.getType();
        }
        if (k == null) {
            return null;
        }
        if (gcb instanceof C5242Qcb) {
            return k.getType();
        }
        C5272Rcb e = gcb.e();
        if (!(e instanceof C5029Jcb)) {
            e = null;
        }
        C5029Jcb jcb = (C5029Jcb) e;
        if (jcb != null) {
            return jcb.z();
        }
        return null;
    }

    public static final Object a(Object obj, C4935Gcb gcb) {
        C7471uYa.b(gcb, "descriptor");
        if ((gcb instanceof C7408tdb) && C6667ipb.a((C5123Mdb) gcb)) {
            return obj;
        }
        C7706xtb a = a(gcb);
        if (a != null) {
            Class a2 = a(a);
            if (a2 != null) {
                Method b = b(a2, gcb);
                if (b != null) {
                    obj = b.invoke(obj, new Object[0]);
                }
            }
        }
        return obj;
    }
}
