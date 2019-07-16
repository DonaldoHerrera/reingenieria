package defpackage;

/* renamed from: Lea reason: default package */
/* compiled from: ApiMapperException.kt */
public final class Lea extends Exception {
    public Lea(Exception exc) {
        C7471uYa.b(exc, "cause");
        super("Failed mapping body of request/response", exc);
    }

    public Lea(String str) {
        C7471uYa.b(str, "message");
        super(str);
    }
}
