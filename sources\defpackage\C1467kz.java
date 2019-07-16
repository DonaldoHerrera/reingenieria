package defpackage;

/* renamed from: kz reason: default package and case insensitive filesystem */
final class C1467kz implements Runnable {
    private final /* synthetic */ Wy a;
    private final /* synthetic */ C1436jz b;

    C1467kz(C1436jz jzVar, Wy wy) {
        this.b = jzVar;
        this.a = wy;
    }

    public final void run() {
        synchronized (this.b.b) {
            if (this.b.c != null) {
                this.b.c.onSuccess(this.a.b());
            }
        }
    }
}
