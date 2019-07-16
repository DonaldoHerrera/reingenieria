package defpackage;

/* renamed from: UB reason: default package */
final class UB implements Runnable {
    private final /* synthetic */ RB a;
    private final /* synthetic */ TB b;

    UB(TB tb, RB rb) {
        this.b = tb;
        this.a = rb;
    }

    public final void run() {
        synchronized (this.b.b) {
            if (this.b.c != null) {
                this.b.c.a(this.a.a());
            }
        }
    }
}
