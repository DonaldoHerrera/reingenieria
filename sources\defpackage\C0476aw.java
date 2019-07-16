package defpackage;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: aw reason: default package and case insensitive filesystem */
final class C0476aw {
    private static final C0476aw a = new C0476aw();
    private final String b;

    C0476aw() {
        String str;
        String property = System.getProperty("java.version");
        if (property.startsWith("9")) {
            str = "9.0.0";
        } else {
            str = c(property);
        }
        this(str, Vu.OS_NAME.a(), Vu.OS_VERSION.a(), C1765ut.d);
    }

    /* access modifiers changed from: private */
    public static C0476aw b() {
        return a;
    }

    private static String c(String str) {
        if (str == null) {
            return null;
        }
        Matcher matcher = Pattern.compile("(\\d+\\.\\d+\\.\\d+).*").matcher(str);
        if (matcher.find()) {
            str = matcher.group(1);
        }
        return str;
    }

    /* access modifiers changed from: 0000 */
    public final String a(String str) {
        return String.format(this.b, new Object[]{b(str)});
    }

    private static String b(String str) {
        return str.toLowerCase().replaceAll("[^\\w\\d\\-]", "-");
    }

    private C0476aw(String str, String str2, String str3, String str4) {
        StringBuilder sb = new StringBuilder("java/");
        sb.append(c(str));
        sb.append(" http-google-%s/");
        sb.append(c(str4));
        if (!(str2 == null || str3 == null)) {
            sb.append(" ");
            sb.append(b(str2));
            sb.append("/");
            sb.append(c(str3));
        }
        this.b = sb.toString();
    }
}
