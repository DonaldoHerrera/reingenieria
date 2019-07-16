package defpackage;

/* renamed from: cz reason: default package and case insensitive filesystem */
final class C1221cz implements Runnable {
    private final /* synthetic */ Wy a;
    private final /* synthetic */ C0510bz b;

    C1221cz(C0510bz bzVar, Wy wy) {
        this.b = bzVar;
        this.a = wy;
    }

    public final void run() {
        try {
            Wy wy = (Wy) this.b.b.then(this.a);
            if (wy == null) {
                this.b.a((Exception) new NullPointerException("Continuation returned null"));
                return;
            }
            wy.a(Yy.b, (Ty<? super TResult>) this.b);
            wy.a(Yy.b, (Sy) this.b);
            wy.a(Yy.b, (Qy) this.b);
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
