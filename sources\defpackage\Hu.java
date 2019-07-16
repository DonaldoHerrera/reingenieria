package defpackage;

/* renamed from: Hu reason: default package */
final class Hu extends Iu {
    private final char a;

    Hu(char c) {
        this.a = c;
    }

    public final boolean b(char c) {
        return c == this.a;
    }

    public final String toString() {
        String c = Fu.d(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(c).length() + 18);
        sb.append("CharMatcher.is('");
        sb.append(c);
        sb.append("')");
        return sb.toString();
    }
}
