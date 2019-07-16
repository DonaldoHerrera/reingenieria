package defpackage;

/* renamed from: cB reason: default package and case insensitive filesystem */
final class C0513cB extends ZA {
    private final C0482bB a = new C0482bB();

    C0513cB() {
    }

    public final void a(Throwable th, Throwable th2) {
        if (th2 == th) {
            throw new IllegalArgumentException("Self suppression is not allowed.", th2);
        } else if (th2 != null) {
            this.a.a(th, true).add(th2);
        } else {
            throw new NullPointerException("The suppressed exception cannot be null.");
        }
    }
}
