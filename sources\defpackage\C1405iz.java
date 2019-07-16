package defpackage;

/* renamed from: iz reason: default package and case insensitive filesystem */
final class C1405iz implements Runnable {
    private final /* synthetic */ Wy a;
    private final /* synthetic */ C1375hz b;

    C1405iz(C1375hz hzVar, Wy wy) {
        this.b = hzVar;
        this.a = wy;
    }

    public final void run() {
        synchronized (this.b.b) {
            if (this.b.c != null) {
                this.b.c.a(this.a.a());
            }
        }
    }
}
