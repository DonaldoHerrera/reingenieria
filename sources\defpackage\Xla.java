package defpackage;

/* renamed from: Xla reason: default package */
/* compiled from: FlipperWrapper.kt */
public final class Xla {
    private static final C7162pxb a = new C7162pxb("oauth_token=[^(\\&|,)]+");
    public static final Xla b = new Xla();

    private Xla() {
    }

    public final String a(String str) {
        C7471uYa.b(str, "message");
        return a.a((CharSequence) str, "oauth_token=<REDACTED>");
    }
}
