package defpackage;

/* renamed from: Kda reason: default package */
/* compiled from: Errors.kt */
public abstract class Kda extends Exception {
    private final Exception a;

    private Kda(Exception exc) {
        this.a = exc;
    }

    public Exception getCause() {
        return this.a;
    }

    public /* synthetic */ Kda(Exception exc, C7264rYa rya) {
        this(exc);
    }
}
