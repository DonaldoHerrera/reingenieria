package bo.app;

import java.util.Comparator;

public final class hs {
    public static String a(String str, gt gtVar) {
        StringBuilder sb = new StringBuilder(str);
        sb.append("_");
        sb.append(gtVar.a());
        sb.append("x");
        sb.append(gtVar.b());
        return sb.toString();
    }

    public static Comparator<String> a() {
        return new Comparator<String>() {
            /* renamed from: a */
            public int compare(String str, String str2) {
                String str3 = "_";
                return str.substring(0, str.lastIndexOf(str3)).compareTo(str2.substring(0, str2.lastIndexOf(str3)));
            }
        };
    }
}
