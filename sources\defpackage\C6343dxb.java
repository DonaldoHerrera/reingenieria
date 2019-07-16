package defpackage;

/* renamed from: dxb reason: default package and case insensitive filesystem */
/* compiled from: Char.kt */
class C6343dxb extends C6275cxb {
    public static final boolean a(char c, char c2, boolean z) {
        if (c == c2) {
            return true;
        }
        if (!z) {
            return false;
        }
        return Character.toUpperCase(c) == Character.toUpperCase(c2) || Character.toLowerCase(c) == Character.toLowerCase(c2);
    }
}
