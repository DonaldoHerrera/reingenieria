package defpackage;

import java.util.Collection;
import java.util.Iterator;

/* renamed from: Cxb reason: default package */
/* compiled from: StringsJVM.kt */
class Cxb extends Bxb {
    public static /* synthetic */ String a(String str, char c, char c2, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return a(str, c, c2, z);
    }

    public static /* synthetic */ boolean b(String str, String str2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return d(str, str2, z);
    }

    public static boolean c(String str, String str2, boolean z) {
        boolean z2;
        if (str == null) {
            return str2 == null;
        }
        if (!z) {
            z2 = str.equals(str2);
        } else {
            z2 = str.equalsIgnoreCase(str2);
        }
        return z2;
    }

    public static final boolean d(String str, String str2, boolean z) {
        C7471uYa.b(str, "$this$startsWith");
        C7471uYa.b(str2, "prefix");
        if (!z) {
            return str.startsWith(str2);
        }
        return a(str, 0, str2, 0, str2.length(), z);
    }

    public static String e(String str) {
        C7471uYa.b(str, "$this$decapitalize");
        if (!(str.length() > 0) || !Character.isUpperCase(str.charAt(0))) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        String substring = str.substring(0, 1);
        C7471uYa.a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        if (substring != null) {
            String lowerCase = substring.toLowerCase();
            C7471uYa.a((Object) lowerCase, "(this as java.lang.String).toLowerCase()");
            sb.append(lowerCase);
            String substring2 = str.substring(1);
            C7471uYa.a((Object) substring2, "(this as java.lang.String).substring(startIndex)");
            sb.append(substring2);
            return sb.toString();
        }
        throw new OVa("null cannot be cast to non-null type java.lang.String");
    }

    public static final String a(String str, char c, char c2, boolean z) {
        C7471uYa.b(str, "$this$replace");
        if (!z) {
            String replace = str.replace(c, c2);
            C7471uYa.a((Object) replace, "(this as java.lang.Strin…replace(oldChar, newChar)");
            return replace;
        }
        return Ywb.a(Hxb.a((CharSequence) str, new char[]{c}, z, 0, 4, (Object) null), String.valueOf(c2), null, null, 0, null, null, 62, null);
    }

    public static final boolean b(String str, String str2, boolean z) {
        C7471uYa.b(str, "$this$endsWith");
        C7471uYa.b(str2, "suffix");
        if (!z) {
            return str.endsWith(str2);
        }
        return a(str, str.length() - str2.length(), str2, 0, str2.length(), true);
    }

    public static String d(String str) {
        C7471uYa.b(str, "$this$capitalize");
        if (!(str.length() > 0) || !Character.isLowerCase(str.charAt(0))) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        String substring = str.substring(0, 1);
        C7471uYa.a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        if (substring != null) {
            String upperCase = substring.toUpperCase();
            C7471uYa.a((Object) upperCase, "(this as java.lang.String).toUpperCase()");
            sb.append(upperCase);
            String substring2 = str.substring(1);
            C7471uYa.a((Object) substring2, "(this as java.lang.String).substring(startIndex)");
            sb.append(substring2);
            return sb.toString();
        }
        throw new OVa("null cannot be cast to non-null type java.lang.String");
    }

    public static /* synthetic */ String a(String str, String str2, String str3, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return a(str, str2, str3, z);
    }

    public static final String a(String str, String str2, String str3, boolean z) {
        C7471uYa.b(str, "$this$replace");
        C7471uYa.b(str2, "oldValue");
        C7471uYa.b(str3, "newValue");
        return Ywb.a(Hxb.b((CharSequence) str, new String[]{str2}, z, 0, 4, (Object) null), str3, null, null, 0, null, null, 62, null);
    }

    public static /* synthetic */ boolean a(String str, String str2, int i, boolean z, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z = false;
        }
        return a(str, str2, i, z);
    }

    public static final boolean a(String str, String str2, int i, boolean z) {
        C7471uYa.b(str, "$this$startsWith");
        C7471uYa.b(str2, "prefix");
        if (!z) {
            return str.startsWith(str2, i);
        }
        return a(str, i, str2, 0, str2.length(), z);
    }

    public static /* synthetic */ boolean a(String str, String str2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return b(str, str2, z);
    }

    public static int a(String str, String str2, boolean z) {
        C7471uYa.b(str, "$this$compareTo");
        C7471uYa.b(str2, "other");
        if (z) {
            return str.compareToIgnoreCase(str2);
        }
        return str.compareTo(str2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    public static boolean a(CharSequence charSequence) {
        boolean z;
        C7471uYa.b(charSequence, "$this$isBlank");
        if (charSequence.length() != 0) {
            C6785kZa b = Hxb.b(charSequence);
            if (!(b instanceof Collection) || !((Collection) b).isEmpty()) {
                Iterator it = b.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (!C6275cxb.a(charSequence.charAt(((FWa) it).nextInt()))) {
                            z = false;
                            break;
                        }
                    } else {
                        break;
                    }
                }
                if (!z) {
                    return false;
                }
            }
            z = true;
            if (!z) {
            }
        }
        return true;
    }

    public static final boolean a(String str, int i, String str2, int i2, int i3, boolean z) {
        C7471uYa.b(str, "$this$regionMatches");
        C7471uYa.b(str2, "other");
        if (!z) {
            return str.regionMatches(i, str2, i2, i3);
        }
        return str.regionMatches(z, i, str2, i2, i3);
    }
}
