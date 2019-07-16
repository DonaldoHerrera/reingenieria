package defpackage;

/* renamed from: az reason: default package and case insensitive filesystem */
final class C0479az implements Runnable {
    private final /* synthetic */ Wy a;
    private final /* synthetic */ _y b;

    C0479az(_y _yVar, Wy wy) {
        this.b = _yVar;
        this.a = wy;
    }

    public final void run() {
        if (this.a.c()) {
            this.b.c.f();
            return;
        }
        try {
            this.b.c.a(this.b.b.then(this.a));
        } catch (Uy e) {
            if (e.getCause() instanceof Exception) {
                this.b.c.a((Exception) e.getCause());
            } else {
                this.b.c.a((Exception) e);
            }
        } catch (Exception e2) {
            this.b.c.a(e2);
        }
    }
}
