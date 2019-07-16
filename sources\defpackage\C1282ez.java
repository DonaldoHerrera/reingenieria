package defpackage;

/* renamed from: ez reason: default package and case insensitive filesystem */
final class C1282ez implements Runnable {
    private final /* synthetic */ C1251dz a;

    C1282ez(C1251dz dzVar) {
        this.a = dzVar;
    }

    public final void run() {
        synchronized (this.a.b) {
            if (this.a.c != null) {
                this.a.c.a();
            }
        }
    }
}
