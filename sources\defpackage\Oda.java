package defpackage;

/* renamed from: Oda reason: default package */
/* compiled from: Errors.kt */
public final class Oda extends Kda {
    private final Exception b;

    public Oda(Exception exc) {
        C7471uYa.b(exc, "cause");
        super(exc, null);
        this.b = exc;
    }

    public Exception getCause() {
        return this.b;
    }
}
