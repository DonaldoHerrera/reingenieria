package defpackage;

/* renamed from: nMa reason: default package and case insensitive filesystem */
/* compiled from: QuestionMarks */
public final class C6976nMa {
    public static String a(int i) {
        StringBuilder sb = new StringBuilder(i * 3);
        sb.append("(?");
        for (int i2 = 1; i2 < i; i2++) {
            sb.append(", ?");
        }
        sb.append(')');
        return sb.toString();
    }
}
