package defpackage;

/* renamed from: ZAb reason: default package */
/* compiled from: Util */
class ZAb {
    static String a(String str) {
        String str2 = "\"";
        if (str.startsWith(str2)) {
            str = str.substring(1, str.length());
        }
        return str.endsWith(str2) ? str.substring(0, str.length() - 1) : str;
    }

    static String b(String str) {
        if (str == null) {
            return null;
        }
        if (str.startsWith("--")) {
            return str.substring(2, str.length());
        }
        if (str.startsWith("-")) {
            str = str.substring(1, str.length());
        }
        return str;
    }
}
