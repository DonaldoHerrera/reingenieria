package defpackage;

/* renamed from: pgb reason: default package and case insensitive filesystem */
/* compiled from: specialBuiltinMembers.kt */
public final class C7135pgb {
    /* access modifiers changed from: private */
    public static final C7349snb b(C7349snb snb, String str) {
        C7349snb a = snb.a(C7694xnb.b(str));
        C7471uYa.a((Object) a, "child(Name.identifier(name))");
        return a;
    }

    public static final <T extends C4935Gcb> T c(T t) {
        C7471uYa.b(t, "$this$getOverriddenBuiltinWithDifferentJvmName");
        T t2 = null;
        if (!Mfb.f.a().contains(t.getName()) && !Rfb.e.a().contains(C7148pqb.a((C4935Gcb) t).getName())) {
            return null;
        }
        if ((t instanceof C7408tdb) || (t instanceof C7339sdb)) {
            t2 = C7148pqb.a(t, false, C6929mgb.a, 1, null);
        } else if (t instanceof C7684xdb) {
            t2 = C7148pqb.a(t, false, C6997ngb.a, 1, null);
        }
        return t2;
    }

    public static final <T extends C4935Gcb> T d(T t) {
        C7471uYa.b(t, "$this$getOverriddenSpecialBuiltin");
        T c = c(t);
        if (c != null) {
            return c;
        }
        Nfb nfb = Nfb.h;
        C7694xnb name = t.getName();
        C7471uYa.a((Object) name, "name");
        if (!nfb.a(name)) {
            return null;
        }
        return C7148pqb.a(t, false, C7066ogb.a, 1, null);
    }

    public static final boolean e(C4935Gcb gcb) {
        C7471uYa.b(gcb, "$this$isFromJava");
        return C7148pqb.a(gcb).e() instanceof Pgb;
    }

    public static final boolean f(C4935Gcb gcb) {
        C7471uYa.b(gcb, "$this$isFromJavaOrBuiltins");
        return e(gcb) || C5301Sbb.c((C5272Rcb) gcb);
    }

    private static final C4935Gcb g(C4935Gcb gcb) {
        if (C5301Sbb.c((C5272Rcb) gcb)) {
            return c(gcb);
        }
        return null;
    }

    /* access modifiers changed from: private */
    public static final C7349snb b(C7487unb unb, String str) {
        C7349snb h = unb.a(C7694xnb.b(str)).h();
        C7471uYa.a((Object) h, "child(Name.identifier(name)).toSafe()");
        return h;
    }

    /* access modifiers changed from: private */
    public static final C6793kgb b(String str, String str2, String str3, String str4) {
        C7694xnb b = C7694xnb.b(str2);
        C7471uYa.a((Object) b, "Name.identifier(name)");
        Lkb lkb = Lkb.a;
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append('(');
        sb.append(str3);
        sb.append(')');
        sb.append(str4);
        return new C6793kgb(b, lkb.a(str, sb.toString()));
    }

    public static final boolean a(C4935Gcb gcb) {
        C7471uYa.b(gcb, "$this$doesOverrideBuiltinWithDifferentJvmName");
        return c(gcb) != null;
    }

    public static final boolean a(C5029Jcb jcb, C4904Fcb fcb) {
        C7471uYa.b(jcb, "$this$hasRealKotlinSuperClassWithOverrideOf");
        C7471uYa.b(fcb, "specialCallableDescriptor");
        C5272Rcb e = fcb.e();
        if (e != null) {
            Etb z = ((C5029Jcb) e).z();
            C7471uYa.a((Object) z, "(specialCallableDescript…ssDescriptor).defaultType");
            C5029Jcb b = C6531gpb.b(jcb);
            while (true) {
                boolean z2 = false;
                if (b == null) {
                    return false;
                }
                if (!(b instanceof Pgb)) {
                    if (C7777yub.b((C7706xtb) b.z(), (C7706xtb) z) != null) {
                        z2 = true;
                    }
                    if (z2) {
                        return !C5301Sbb.c((C5272Rcb) b);
                    }
                }
                b = C6531gpb.b(b);
            }
        } else {
            throw new OVa("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        }
    }

    public static final String b(C4935Gcb gcb) {
        C7471uYa.b(gcb, "callableMemberDescriptor");
        C4935Gcb g = g(gcb);
        if (g == null) {
            return null;
        }
        C4935Gcb a = C7148pqb.a(g);
        if (a == null) {
            return null;
        }
        if (a instanceof C7408tdb) {
            return Rfb.e.a(a);
        }
        if (!(a instanceof C7684xdb)) {
            return null;
        }
        C7694xnb a2 = Mfb.f.a((C7684xdb) a);
        if (a2 != null) {
            return a2.a();
        }
        return null;
    }
}
