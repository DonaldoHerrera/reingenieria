package defpackage;

import java.util.Collection;

/* renamed from: NLa reason: default package and case insensitive filesystem */
/* compiled from: StringUtils */
public class C5147NLa {
    public static String a(Collection<String> collection, String str) {
        StringBuilder sb = new StringBuilder();
        String str2 = "";
        for (String str3 : collection) {
            sb.append(str2);
            sb.append(str3);
            str2 = str;
        }
        return sb.toString();
    }
}
