package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: Obb reason: default package and case insensitive filesystem */
/* compiled from: functionTypes.kt */
public final class C5181Obb {
    public static final c a(C5272Rcb rcb) {
        C7471uYa.b(rcb, "$this$getFunctionalClassKind");
        if ((rcb instanceof C5029Jcb) && C5301Sbb.e(rcb)) {
            return a(C7148pqb.d(rcb));
        }
        return null;
    }

    public static final C7706xtb b(C7706xtb xtb) {
        C7471uYa.b(xtb, "$this$getReceiverTypeFromFunctionType");
        boolean f = f(xtb);
        if (TVa.a && !f) {
            StringBuilder sb = new StringBuilder();
            sb.append("Not a function type: ");
            sb.append(xtb);
            throw new AssertionError(sb.toString());
        } else if (i(xtb)) {
            return ((Stb) C7676xWa.f(xtb.ya())).getType();
        } else {
            return null;
        }
    }

    public static final C7706xtb c(C7706xtb xtb) {
        C7471uYa.b(xtb, "$this$getReturnTypeFromFunctionType");
        boolean f = f(xtb);
        if (!TVa.a || f) {
            C7706xtb type = ((Stb) C7676xWa.h(xtb.ya())).getType();
            C7471uYa.a((Object) type, "arguments.last().type");
            return type;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Not a function type: ");
        sb.append(xtb);
        throw new AssertionError(sb.toString());
    }

    public static final List<Stb> d(C7706xtb xtb) {
        C7471uYa.b(xtb, "$this$getValueParameterTypesFromFunctionType");
        boolean f = f(xtb);
        if (!TVa.a || f) {
            List ya = xtb.ya();
            int e = e(xtb);
            boolean z = true;
            int size = ya.size() - 1;
            if (e > size) {
                z = false;
            }
            if (!TVa.a || z) {
                return ya.subList(e, size);
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Not an exact function type: ");
            sb.append(xtb);
            throw new AssertionError(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Not a function type: ");
        sb2.append(xtb);
        throw new AssertionError(sb2.toString());
    }

    public static final boolean e(C7706xtb xtb) {
        C7471uYa.b(xtb, "$this$isBuiltinExtensionFunctionalType");
        return f(xtb) && i(xtb);
    }

    public static final boolean f(C7706xtb xtb) {
        C7471uYa.b(xtb, "$this$isBuiltinFunctionalType");
        C5122Mcb c = xtb.za().c();
        c a = c != null ? a((C5272Rcb) c) : null;
        return a == c.a || a == c.b;
    }

    public static final boolean g(C7706xtb xtb) {
        C7471uYa.b(xtb, "$this$isFunctionType");
        C5122Mcb c = xtb.za().c();
        return (c != null ? a((C5272Rcb) c) : null) == c.a;
    }

    public static final boolean h(C7706xtb xtb) {
        C7471uYa.b(xtb, "$this$isSuspendFunctionType");
        C5122Mcb c = xtb.za().c();
        return (c != null ? a((C5272Rcb) c) : null) == c.b;
    }

    private static final boolean i(C7706xtb xtb) {
        C6723jeb annotations = xtb.getAnnotations();
        C7349snb snb = C5301Sbb.h.A;
        C7471uYa.a((Object) snb, "KotlinBuiltIns.FQ_NAMES.extensionFunctionType");
        return annotations.a(snb) != null;
    }

    private static final c a(C7487unb unb) {
        if (!unb.c() || unb.b()) {
            return null;
        }
        a aVar = C5534_bb.a;
        String a = unb.f().a();
        C7471uYa.a((Object) a, "shortName().asString()");
        C7349snb c = unb.h().c();
        C7471uYa.a((Object) c, "toSafe().parent()");
        return aVar.a(a, c);
    }

    public static final C7694xnb a(C7706xtb xtb) {
        C7471uYa.b(xtb, "$this$extractParameterNameFromFunctionTypeArgument");
        C6723jeb annotations = xtb.getAnnotations();
        C7349snb snb = C5301Sbb.h.B;
        C7471uYa.a((Object) snb, "KotlinBuiltIns.FQ_NAMES.parameterName");
        C6315deb a = annotations.a(snb);
        if (a != null) {
            Object n = C7676xWa.n(a.a().values());
            if (!(n instanceof C5665bqb)) {
                n = null;
            }
            C5665bqb bqb = (C5665bqb) n;
            if (bqb != null) {
                String str = (String) bqb.a();
                if (str != null) {
                    if (!C7694xnb.c(str)) {
                        str = null;
                    }
                    if (str != null) {
                        return C7694xnb.b(str);
                    }
                }
            }
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004f, code lost:
        if (r2.c() == false) goto L_0x0053;
     */
    public static final List<Stb> a(C7706xtb xtb, List<? extends C7706xtb> list, List<C7694xnb> list2, C7706xtb xtb2, C5301Sbb sbb) {
        C7694xnb xnb;
        C7471uYa.b(list, "parameterTypes");
        C7471uYa.b(xtb2, "returnType");
        C7471uYa.b(sbb, "builtIns");
        int i = 0;
        ArrayList arrayList = new ArrayList(list.size() + (xtb != null ? 1 : 0) + 1);
        C7089ovb.a(arrayList, xtb != null ? Fub.a(xtb) : null);
        for (Object next : list) {
            int i2 = i + 1;
            if (i >= 0) {
                C7706xtb xtb3 = (C7706xtb) next;
                if (list2 != null) {
                    xnb = (C7694xnb) list2.get(i);
                    if (xnb != null) {
                    }
                }
                xnb = null;
                if (xnb != null) {
                    C7349snb snb = C5301Sbb.h.B;
                    C7471uYa.a((Object) snb, "KotlinBuiltIns.FQ_NAMES.parameterName");
                    C7694xnb b = C7694xnb.b("name");
                    String a = xnb.a();
                    C7471uYa.a((Object) a, "name.asString()");
                    xtb3 = Fub.a(xtb3, C6723jeb.c.a(C7676xWa.d((Iterable) xtb3.getAnnotations(), (Object) new C6995neb(sbb, snb, KWa.a(NVa.a(b, new C5665bqb(a)))))));
                }
                arrayList.add(Fub.a(xtb3));
                i = i2;
            } else {
                C6782kWa.c();
                throw null;
            }
        }
        arrayList.add(Fub.a(xtb2));
        return arrayList;
    }

    public static /* synthetic */ Etb a(C5301Sbb sbb, C6723jeb jeb, C7706xtb xtb, List list, List list2, C7706xtb xtb2, boolean z, int i, Object obj) {
        return a(sbb, jeb, xtb, list, list2, xtb2, (i & 64) != 0 ? false : z);
    }

    public static final Etb a(C5301Sbb sbb, C6723jeb jeb, C7706xtb xtb, List<? extends C7706xtb> list, List<C7694xnb> list2, C7706xtb xtb2, boolean z) {
        C7471uYa.b(sbb, "builtIns");
        C7471uYa.b(jeb, "annotations");
        C7471uYa.b(list, "parameterTypes");
        C7471uYa.b(xtb2, "returnType");
        List a = a(xtb, list, list2, xtb2, sbb);
        int size = list.size();
        if (xtb != null) {
            size++;
        }
        C5029Jcb d = z ? sbb.d(size) : sbb.a(size);
        C7471uYa.a((Object) d, "if (suspendFunction) bui…tFunction(parameterCount)");
        if (xtb != null) {
            C7349snb snb = C5301Sbb.h.A;
            String str = "KotlinBuiltIns.FQ_NAMES.extensionFunctionType";
            C7471uYa.a((Object) snb, str);
            if (jeb.a(snb) == null) {
                a aVar = C6723jeb.c;
                C7349snb snb2 = C5301Sbb.h.A;
                C7471uYa.a((Object) snb2, str);
                jeb = aVar.a(C7676xWa.d((Iterable) jeb, (Object) new C6995neb(sbb, snb2, LWa.a())));
            }
        }
        return C7775ytb.a(jeb, d, a);
    }
}
