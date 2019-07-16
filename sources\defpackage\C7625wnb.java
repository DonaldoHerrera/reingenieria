package defpackage;

/* renamed from: wnb reason: default package and case insensitive filesystem */
/* compiled from: FqNamesUtil.kt */
public final class C7625wnb {
    public static final boolean a(C7349snb snb, C7349snb snb2) {
        C7471uYa.b(snb, "$this$isSubpackageOf");
        C7471uYa.b(snb2, "packageName");
        if (C7471uYa.a((Object) snb, (Object) snb2) || snb2.b()) {
            return true;
        }
        String a = snb.a();
        C7471uYa.a((Object) a, "this.asString()");
        String a2 = snb2.a();
        C7471uYa.a((Object) a2, "packageName.asString()");
        return a(a, a2);
    }

    public static final C7349snb b(C7349snb snb, C7349snb snb2) {
        C7471uYa.b(snb, "$this$tail");
        C7471uYa.b(snb2, "prefix");
        if (!a(snb, snb2) || snb2.b()) {
            return snb;
        }
        if (C7471uYa.a((Object) snb, (Object) snb2)) {
            C7349snb snb3 = C7349snb.a;
            C7471uYa.a((Object) snb3, "FqName.ROOT");
            return snb3;
        }
        String a = snb.a();
        C7471uYa.a((Object) a, "asString()");
        int length = snb2.a().length() + 1;
        if (a != null) {
            String substring = a.substring(length);
            C7471uYa.a((Object) substring, "(this as java.lang.String).substring(startIndex)");
            return new C7349snb(substring);
        }
        throw new OVa("null cannot be cast to non-null type java.lang.String");
    }

    private static final boolean a(String str, String str2) {
        return Cxb.b(str, str2, false, 2, null) && str.charAt(str2.length()) == '.';
    }

    public static final boolean a(String str) {
        boolean z = false;
        if (str == null) {
            return false;
        }
        Anb anb = Anb.BEGINNING;
        int length = str.length();
        Anb anb2 = anb;
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            int i2 = C7556vnb.a[anb2.ordinal()];
            if (i2 == 1 || i2 == 2) {
                if (!Character.isJavaIdentifierPart(charAt)) {
                    return false;
                }
                anb2 = Anb.MIDDLE;
            } else if (i2 != 3) {
                continue;
            } else if (charAt == '.') {
                anb2 = Anb.AFTER_DOT;
            } else if (!Character.isJavaIdentifierPart(charAt)) {
                return false;
            }
        }
        if (anb2 != Anb.AFTER_DOT) {
            z = true;
        }
        return z;
    }
}
