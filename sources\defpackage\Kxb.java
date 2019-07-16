package defpackage;

/* renamed from: Kxb reason: default package */
/* compiled from: StringBuilderJVM.kt */
final class Kxb {
    public static final String a;
    public static final Kxb b = new Kxb();

    static {
        String property = System.getProperty("line.separator");
        if (property != null) {
            a = property;
        } else {
            C7471uYa.a();
            throw null;
        }
    }

    private Kxb() {
    }
}
