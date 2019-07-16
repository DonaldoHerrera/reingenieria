package defpackage;

/* renamed from: gz reason: default package and case insensitive filesystem */
final class C1344gz implements Runnable {
    private final /* synthetic */ Wy a;
    private final /* synthetic */ C1313fz b;

    C1344gz(C1313fz fzVar, Wy wy) {
        this.b = fzVar;
        this.a = wy;
    }

    public final void run() {
        synchronized (this.b.b) {
            if (this.b.c != null) {
                this.b.c.onComplete(this.a);
            }
        }
    }
}
