package defpackage;

/* renamed from: Jda reason: default package */
/* compiled from: Errors.kt */
public final class Jda extends Kda {
    private final Exception b;

    public Jda(Exception exc) {
        C7471uYa.b(exc, "cause");
        super(exc, null);
        this.b = exc;
    }

    public Exception getCause() {
        return this.b;
    }
}
