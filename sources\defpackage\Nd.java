package defpackage;

/* renamed from: Nd reason: default package */
/* compiled from: StringUtil */
public class Nd {
    public static final String[] a = new String[0];

    public static StringBuilder a() {
        return new StringBuilder();
    }

    public static void a(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("?");
            if (i2 < i - 1) {
                sb.append(",");
            }
        }
    }
}
