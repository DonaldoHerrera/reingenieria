package defpackage;

/* renamed from: cxb reason: default package and case insensitive filesystem */
/* compiled from: CharJVM.kt */
class C6275cxb {
    public static final boolean a(char c) {
        return Character.isWhitespace(c) || Character.isSpaceChar(c);
    }

    public static final int a(char c, int i) {
        return Character.digit(c, i);
    }

    public static final int a(int i) {
        if (2 <= i && 36 >= i) {
            return i;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("radix ");
        sb.append(i);
        sb.append(" was not in valid range ");
        sb.append(new C6785kZa(2, 36));
        throw new IllegalArgumentException(sb.toString());
    }
}
