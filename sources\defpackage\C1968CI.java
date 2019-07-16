package defpackage;

/* renamed from: CI reason: default package and case insensitive filesystem */
/* compiled from: OMAdSessionException.kt */
public final class C1968CI extends Exception {
    private final String a;
    private final Exception b;

    public C1968CI(String str, Exception exc) {
        super(str, exc);
        this.a = str;
        this.b = exc;
    }

    public Exception getCause() {
        return this.b;
    }

    public String getMessage() {
        return this.a;
    }
}
