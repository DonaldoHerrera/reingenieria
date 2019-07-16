package defpackage;

import java.util.concurrent.CancellationException;

/* renamed from: mz reason: default package and case insensitive filesystem */
final class C1529mz implements Runnable {
    private final /* synthetic */ Wy a;
    private final /* synthetic */ C1498lz b;

    C1529mz(C1498lz lzVar, Wy wy) {
        this.b = lzVar;
        this.a = wy;
    }

    public final void run() {
        try {
            Wy then = this.b.b.then(this.a.b());
            if (then == null) {
                this.b.a((Exception) new NullPointerException("Continuation returned null"));
                return;
            }
            then.a(Yy.b, (Ty<? super TResult>) this.b);
            then.a(Yy.b, (Sy) this.b);
            then.a(Yy.b, (Qy) this.b);
        } catch (Uy e) {
            if (e.getCause() instanceof Exception) {
                this.b.a((Exception) e.getCause());
            } else {
                this.b.a((Exception) e);
            }
        } catch (CancellationException unused) {
            this.b.a();
        } catch (Exception e2) {
            this.b.a(e2);
        }
    }
}
