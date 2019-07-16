package defpackage;

import java.util.concurrent.Executor;

/* renamed from: TB reason: default package */
final class TB<TResult> implements XB<TResult> {
    private final Executor a;
    /* access modifiers changed from: private */
    public final Object b = new Object();
    /* access modifiers changed from: private */
    public OB c;

    public TB(Executor executor, OB ob) {
        this.a = executor;
        this.c = ob;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0010, code lost:
        r2.a.execute(new defpackage.UB(r2, r3));
     */
    public final void a(RB<TResult> rb) {
        if (!rb.c()) {
            synchronized (this.b) {
                if (this.c == null) {
                }
            }
        }
    }
}
