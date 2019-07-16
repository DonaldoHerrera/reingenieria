package defpackage;

import java.util.concurrent.Executor;

/* renamed from: WB reason: default package */
final class WB<TResult> implements XB<TResult> {
    private final Executor a;
    /* access modifiers changed from: private */
    public final Object b = new Object();
    /* access modifiers changed from: private */
    public PB<? super TResult> c;

    public WB(Executor executor, PB<? super TResult> pb) {
        this.a = executor;
        this.c = pb;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0010, code lost:
        r2.a.execute(new defpackage.VB(r2, r3));
     */
    public final void a(RB<TResult> rb) {
        if (rb.c()) {
            synchronized (this.b) {
                if (this.c == null) {
                }
            }
        }
    }
}
