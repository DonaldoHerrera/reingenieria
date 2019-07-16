package defpackage;

/* renamed from: oLa reason: default package and case insensitive filesystem */
/* compiled from: QueryHelper */
public final class C7044oLa {
    private C7044oLa() {
    }

    public static String[] a(Object[] objArr) {
        String[] strArr = new String[objArr.length];
        for (int i = 0; i < objArr.length; i++) {
            strArr[i] = objArr[i].toString();
        }
        return strArr;
    }

    public static String a(String str, String[] strArr) {
        if (strArr == null) {
            return str;
        }
        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i].contains(" ")) {
                StringBuilder sb = new StringBuilder();
                String str2 = "\"";
                sb.append(str2);
                sb.append(strArr[i]);
                sb.append(str2);
                strArr[i] = sb.toString();
            }
        }
        return String.format(str.replaceAll("%", "%%").replaceAll("\\?", "%s"), strArr);
    }
}
