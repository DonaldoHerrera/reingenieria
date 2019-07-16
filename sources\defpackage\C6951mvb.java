package defpackage;

import java.util.Iterator;

/* renamed from: mvb reason: default package and case insensitive filesystem */
/* compiled from: capitalizeDecapitalize.kt */
public final class C6951mvb {
    public static final String a(String str, boolean z) {
        Object obj;
        C7471uYa.b(str, "$this$decapitalizeSmart");
        C6815kvb kvb = new C6815kvb(str, z);
        if (!(str.length() == 0) && kvb.a(0)) {
            if (str.length() == 1 || !kvb.a(1)) {
                str = z ? b(str) : Cxb.e(str);
            } else {
                C6883lvb lvb = new C6883lvb(z);
                Iterator it = Hxb.b(str).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (!kvb.a(((Number) obj).intValue())) {
                        break;
                    }
                }
                Integer num = (Integer) obj;
                if (num == null) {
                    return lvb.invoke(str);
                }
                int intValue = num.intValue() - 1;
                StringBuilder sb = new StringBuilder();
                String substring = str.substring(0, intValue);
                C7471uYa.a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                sb.append(lvb.invoke(substring));
                String substring2 = str.substring(intValue);
                C7471uYa.a((Object) substring2, "(this as java.lang.String).substring(startIndex)");
                sb.append(substring2);
                return sb.toString();
            }
        }
        return str;
    }

    public static final String b(String str) {
        C7471uYa.b(str, "$this$decapitalizeAsciiOnly");
        if (str.length() == 0) {
            return str;
        }
        char charAt = str.charAt(0);
        if ('A' <= charAt && 'Z' >= charAt) {
            char lowerCase = Character.toLowerCase(charAt);
            String substring = str.substring(1);
            C7471uYa.a((Object) substring, "(this as java.lang.String).substring(startIndex)");
            StringBuilder sb = new StringBuilder();
            sb.append(String.valueOf(lowerCase));
            sb.append(substring);
            str = sb.toString();
        }
        return str;
    }

    public static final String c(String str) {
        C7471uYa.b(str, "$this$toLowerCaseAsciiOnly");
        StringBuilder sb = new StringBuilder(str.length());
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if ('A' <= charAt && 'Z' >= charAt) {
                charAt = Character.toLowerCase(charAt);
            }
            sb.append(charAt);
        }
        String sb2 = sb.toString();
        C7471uYa.a((Object) sb2, "builder.toString()");
        return sb2;
    }

    public static final String a(String str) {
        C7471uYa.b(str, "$this$capitalizeAsciiOnly");
        if (str.length() == 0) {
            return str;
        }
        char charAt = str.charAt(0);
        if ('a' <= charAt && 'z' >= charAt) {
            char upperCase = Character.toUpperCase(charAt);
            String substring = str.substring(1);
            C7471uYa.a((Object) substring, "(this as java.lang.String).substring(startIndex)");
            StringBuilder sb = new StringBuilder();
            sb.append(String.valueOf(upperCase));
            sb.append(substring);
            str = sb.toString();
        }
        return str;
    }
}
