package defpackage;

/* renamed from: qgb reason: default package and case insensitive filesystem */
/* compiled from: utils.kt */
public final class C7204qgb {
    /* JADX WARNING: type inference failed for: r5v1, types: [java.lang.Object] */
    /* JADX WARNING: type inference failed for: r5v3, types: [java.lang.Double] */
    /* JADX WARNING: type inference failed for: r5v4, types: [java.lang.Float] */
    /* JADX WARNING: type inference failed for: r5v5, types: [java.lang.Long] */
    /* JADX WARNING: type inference failed for: r5v6, types: [java.lang.Integer] */
    /* JADX WARNING: type inference failed for: r5v7, types: [java.lang.Short] */
    /* JADX WARNING: type inference failed for: r5v8, types: [java.lang.Byte] */
    /* JADX WARNING: type inference failed for: r5v9, types: [java.lang.Character] */
    /* JADX WARNING: type inference failed for: r5v10, types: [java.lang.Boolean] */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00b8, code lost:
        if (defpackage.C5301Sbb.v(r4) != false) goto L_0x00bc;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00be  */
    /* JADX WARNING: Unknown variable types count: 8 */
    public static final C5653bgb a(C7706xtb xtb, String str) {
        C7471uYa.b(xtb, "$this$lexicalCastFrom");
        C7471uYa.b(str, "value");
        C5122Mcb c = xtb.za().c();
        C5653bgb bgb = null;
        if (c instanceof C5029Jcb) {
            C5029Jcb jcb = (C5029Jcb) c;
            if (jcb.g() == C5060Kcb.ENUM_CLASS) {
                Eqb H = jcb.H();
                C7694xnb b = C7694xnb.b(str);
                C7471uYa.a((Object) b, "Name.identifier(value)");
                C5122Mcb b2 = H.b(b, Ffb.FROM_BACKEND);
                if (b2 instanceof C5029Jcb) {
                    C5029Jcb jcb2 = (C5029Jcb) b2;
                    if (jcb2.g() == C5060Kcb.ENUM_ENTRY) {
                        bgb = new Ufb(jcb2);
                    }
                }
                return bgb;
            }
        }
        C7706xtb e = Fub.e(xtb);
        Bvb a = Cvb.a(str);
        String a2 = a.a();
        int b3 = a.b();
        try {
            if (C5301Sbb.e(e)) {
                str = Boolean.valueOf(Boolean.parseBoolean(str));
            } else if (C5301Sbb.g(e)) {
                str = Jxb.g(str);
            } else if (C5301Sbb.f(e)) {
                str = Bxb.a(a2, b3);
            } else if (C5301Sbb.u(e)) {
                str = Bxb.d(a2, b3);
            } else if (C5301Sbb.m(e)) {
                str = Bxb.b(a2, b3);
            } else if (C5301Sbb.n(e)) {
                str = Bxb.c(a2, b3);
            } else if (C5301Sbb.k(e)) {
                str = Axb.b(str);
            } else if (C5301Sbb.i(e)) {
                str = Axb.a(str);
            }
        } catch (IllegalArgumentException unused) {
        }
        if (str != 0) {
            bgb = new Sfb(str);
        }
        return bgb;
        str = 0;
        if (str != 0) {
        }
        return bgb;
    }
}
