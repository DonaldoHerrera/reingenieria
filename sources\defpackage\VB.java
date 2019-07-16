package defpackage;

/* renamed from: VB reason: default package */
final class VB implements Runnable {
    private final /* synthetic */ RB a;
    private final /* synthetic */ WB b;

    VB(WB wb, RB rb) {
        this.b = wb;
        this.a = rb;
    }

    public final void run() {
        synchronized (this.b.b) {
            if (this.b.c != null) {
                this.b.c.onSuccess(this.a.b());
            }
        }
    }
}
