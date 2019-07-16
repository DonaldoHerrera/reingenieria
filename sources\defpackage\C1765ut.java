package defpackage;

/* renamed from: ut reason: default package and case insensitive filesystem */
public final class C1765ut {
    public static final Integer a = Integer.valueOf(1);
    public static final Integer b = Integer.valueOf(26);
    private static final Integer c = Integer.valueOf(0);
    public static final String d;

    static {
        String valueOf = String.valueOf(a);
        String valueOf2 = String.valueOf(b);
        String valueOf3 = String.valueOf(c);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 11 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append(valueOf);
        String str = ".";
        sb.append(str);
        sb.append(valueOf2);
        sb.append(str);
        sb.append(valueOf3);
        sb.append("-SNAPSHOT");
        d = sb.toString().toString();
    }
}
