package defpackage;

import java.util.Set;

/* renamed from: Jg reason: default package */
public class Jg {
    private static final String a = Hg.a(Jg.class);

    public static boolean a(String str, Set<String> set) {
        if (str == null) {
            Hg.e(a, "Custom attribute key cannot be null.");
            return false;
        } else if (!set.contains(str)) {
            return true;
        } else {
            String str2 = a;
            StringBuilder sb = new StringBuilder();
            sb.append("Custom attribute key cannot be blacklisted attribute: ");
            sb.append(str);
            sb.append(".");
            Hg.e(str2, sb.toString());
            return false;
        }
    }

    public static boolean a(String str) {
        if (str != null) {
            return true;
        }
        Hg.e(a, "Custom attribute value cannot be null.");
        return false;
    }

    public static String[] a(String[] strArr) {
        if (strArr != null && strArr.length > 0) {
            for (int i = 0; i < strArr.length; i++) {
                strArr[i] = Og.a(strArr[i]);
            }
        }
        return strArr;
    }
}
