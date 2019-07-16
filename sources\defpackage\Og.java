package defpackage;

import java.util.Locale;

/* renamed from: Og reason: default package */
public final class Og {
    private static final String a = Hg.a(Og.class);

    public static String a(String str) {
        String trim = str.trim();
        if (trim.length() <= 255) {
            return trim;
        }
        String str2 = a;
        StringBuilder sb = new StringBuilder();
        sb.append("Provided string field is too long [");
        sb.append(trim.length());
        sb.append("]. The max length is ");
        sb.append(255);
        sb.append(", truncating provided field.");
        Hg.e(str2, sb.toString());
        return trim.substring(0, 255);
    }

    public static boolean b(String str) {
        return str != null && str.toLowerCase(Locale.US).matches("(?:[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*|\"(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\")@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\\[(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?|[a-z0-9-]*[a-z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)\\])");
    }

    public static boolean c(String str) {
        return str != null && str.matches("^[0-9 .\\(\\)\\+\\-]+$");
    }
}
