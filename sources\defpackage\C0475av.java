package defpackage;

import java.util.List;

/* renamed from: av reason: default package and case insensitive filesystem */
final class C0475av extends _u {
    private final Zu b = new Zu();

    C0475av() {
    }

    public final void a(Throwable th, Throwable th2) {
        if (th2 == th) {
            throw new IllegalArgumentException("Self suppression is not allowed.", th2);
        } else if (th2 != null) {
            this.b.a(th, true).add(th2);
        } else {
            throw new NullPointerException("The suppressed exception cannot be null.");
        }
    }

    public final void a(Throwable th) {
        th.printStackTrace();
        List<Throwable> a = this.b.a(th, false);
        if (a != null) {
            synchronized (a) {
                for (Throwable th2 : a) {
                    System.err.print("Suppressed: ");
                    th2.printStackTrace();
                }
            }
        }
    }
}
