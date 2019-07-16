package defpackage;

import java.util.List;

/* renamed from: lgb reason: default package and case insensitive filesystem */
/* compiled from: propertiesConventionUtil.kt */
public final class C6861lgb {
    public static final C7694xnb a(C7694xnb xnb, boolean z) {
        C7471uYa.b(xnb, "methodName");
        return a(xnb, "set", false, z ? "is" : null, 4, null);
    }

    public static final C7694xnb b(C7694xnb xnb) {
        C7471uYa.b(xnb, "methodName");
        C7694xnb a = a(xnb, "get", false, null, 12, null);
        if (a != null) {
            return a;
        }
        return a(xnb, "is", false, null, 8, null);
    }

    public static final List<C7694xnb> c(C7694xnb xnb) {
        C7471uYa.b(xnb, "methodName");
        return C7676xWa.f((Iterable<? extends T>) C6918mWa.b((T[]) new C7694xnb[]{a(xnb, false), a(xnb, true)}));
    }

    static /* synthetic */ C7694xnb a(C7694xnb xnb, String str, boolean z, String str2, int i, Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        if ((i & 8) != 0) {
            str2 = null;
        }
        return a(xnb, str, z, str2);
    }

    private static final C7694xnb a(C7694xnb xnb, String str, boolean z, String str2) {
        if (xnb.c()) {
            return null;
        }
        String b = xnb.b();
        C7471uYa.a((Object) b, "methodName.identifier");
        if (!Cxb.b(b, str, false, 2, null) || b.length() == str.length()) {
            return null;
        }
        char charAt = b.charAt(str.length());
        if ('a' <= charAt && 'z' >= charAt) {
            return null;
        }
        if (str2 != null) {
            if (!TVa.a || z) {
                StringBuilder sb = new StringBuilder();
                sb.append(str2);
                sb.append(Hxb.a(b, (CharSequence) str));
                return C7694xnb.b(sb.toString());
            }
            throw new AssertionError("Assertion failed");
        } else if (!z) {
            return xnb;
        } else {
            String a = C6951mvb.a(Hxb.a(b, (CharSequence) str), true);
            if (!C7694xnb.c(a)) {
                return null;
            }
            return C7694xnb.b(a);
        }
    }

    public static final List<C7694xnb> a(C7694xnb xnb) {
        C7471uYa.b(xnb, "name");
        String a = xnb.a();
        C7471uYa.a((Object) a, "name.asString()");
        if (C6589hgb.b(a)) {
            return C6918mWa.b(b(xnb));
        }
        if (C6589hgb.c(a)) {
            return c(xnb);
        }
        return Rfb.e.a(xnb);
    }
}
