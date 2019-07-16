package defpackage;

import java.util.List;

/* renamed from: Hkb reason: default package */
/* compiled from: methodSignatureMapping.kt */
public final class Hkb {
    public static final String a(C5582adb adb, boolean z, boolean z2) {
        String str;
        C7471uYa.b(adb, "$this$computeJvmDescriptor");
        StringBuilder sb = new StringBuilder();
        if (z2) {
            if (adb instanceof C5242Qcb) {
                str = "<init>";
            } else {
                str = adb.getName().a();
                C7471uYa.a((Object) str, "name.asString()");
            }
            sb.append(str);
        }
        sb.append("(");
        for (C5061Kdb kdb : adb.f()) {
            C7471uYa.a((Object) kdb, "parameter");
            C7706xtb type = kdb.getType();
            C7471uYa.a((Object) type, "parameter.type");
            a(sb, type);
        }
        sb.append(")");
        if (z) {
            if (Qkb.a((C4904Fcb) adb)) {
                sb.append("V");
            } else {
                C7706xtb a = adb.a();
                if (a != null) {
                    C7471uYa.a((Object) a, "returnType!!");
                    a(sb, a);
                } else {
                    C7471uYa.a();
                    throw null;
                }
            }
        }
        String sb2 = sb.toString();
        C7471uYa.a((Object) sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public static final boolean b(C4904Fcb fcb) {
        C7471uYa.b(fcb, "f");
        boolean z = false;
        if (!(fcb instanceof C5582adb)) {
            return false;
        }
        C5582adb adb = (C5582adb) fcb;
        if (adb.f().size() == 1 && !C7135pgb.f((C4935Gcb) fcb) && !(!C7471uYa.a((Object) adb.getName().a(), (Object) "remove"))) {
            C5582adb original = adb.getOriginal();
            C7471uYa.a((Object) original, "f.original");
            List f = original.f();
            C7471uYa.a((Object) f, "f.original.valueParameters");
            Object j = C7676xWa.j(f);
            C7471uYa.a(j, "f.original.valueParameters.single()");
            C7706xtb type = ((C5061Kdb) j).getType();
            C7471uYa.a((Object) type, "f.original.valueParameters.single().type");
            C7760ykb a = a(type);
            C7424tqb tqb = null;
            if (!(a instanceof c)) {
                a = null;
            }
            c cVar = (c) a;
            if (cVar != null) {
                tqb = cVar.a();
            }
            if (tqb != C7424tqb.INT) {
                return false;
            }
            C5582adb a2 = Nfb.a(adb);
            if (a2 != null) {
                C5582adb original2 = a2.getOriginal();
                C7471uYa.a((Object) original2, "overridden.original");
                List f2 = original2.f();
                C7471uYa.a((Object) f2, "overridden.original.valueParameters");
                Object j2 = C7676xWa.j(f2);
                C7471uYa.a(j2, "overridden.original.valueParameters.single()");
                C7706xtb type2 = ((C5061Kdb) j2).getType();
                C7471uYa.a((Object) type2, "overridden.original.valueParameters.single().type");
                C7760ykb a3 = a(type2);
                C5272Rcb e = a2.e();
                C7471uYa.a((Object) e, "overridden.containingDeclaration");
                if (C7471uYa.a((Object) C7148pqb.d(e), (Object) C5301Sbb.h.V.g()) && (a3 instanceof b) && C7471uYa.a((Object) ((b) a3).a(), (Object) "java/lang/Object")) {
                    z = true;
                }
            }
        }
        return z;
    }

    public static /* synthetic */ String a(C5582adb adb, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            z2 = true;
        }
        return a(adb, z, z2);
    }

    public static final String a(C5029Jcb jcb) {
        C7471uYa.b(jcb, "$this$internalName");
        C6721jcb jcb2 = C6721jcb.m;
        C7487unb g = C7148pqb.c(jcb).g();
        C7471uYa.a((Object) g, "fqNameSafe.toUnsafe()");
        C7280rnb a = jcb2.a(g);
        if (a == null) {
            return Qkb.a(jcb, null, false, 2, null);
        }
        C7355sqb a2 = C7355sqb.a(a);
        C7471uYa.a((Object) a2, "JvmClassName.byClassId(it)");
        String b = a2.b();
        C7471uYa.a((Object) b, "JvmClassName.byClassId(it).internalName");
        return b;
    }

    private static final void a(StringBuilder sb, C7706xtb xtb) {
        sb.append(a(xtb));
    }

    public static final C7760ykb a(C7706xtb xtb) {
        C7471uYa.b(xtb, "$this$mapToJvmType");
        return (C7760ykb) Qkb.a(xtb, Akb.a, Okb.c, Nkb.a, null, null, false, 32, null);
    }

    public static final String a(C4904Fcb fcb) {
        C7471uYa.b(fcb, "$this$computeJvmSignature");
        Lkb lkb = Lkb.a;
        if (C6531gpb.p(fcb)) {
            return null;
        }
        C5272Rcb e = fcb.e();
        if (!(e instanceof C5029Jcb)) {
            e = null;
        }
        C5029Jcb jcb = (C5029Jcb) e;
        if (jcb != null) {
            C7694xnb name = jcb.getName();
            C7471uYa.a((Object) name, "classDescriptor.name");
            if (name.c()) {
                return null;
            }
            C4904Fcb original = fcb.getOriginal();
            if (!(original instanceof C7684xdb)) {
                original = null;
            }
            C7684xdb xdb = (C7684xdb) original;
            if (xdb != null) {
                return lkb.a(jcb, a(xdb, false, false, 3, null));
            }
        }
        return null;
    }
}
