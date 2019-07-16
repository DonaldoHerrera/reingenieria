package defpackage;

import java.util.concurrent.Executor;

/* renamed from: hz reason: default package and case insensitive filesystem */
final class C1375hz<TResult> implements C1560nz<TResult> {
    private final Executor a;
    /* access modifiers changed from: private */
    public final Object b = new Object();
    /* access modifiers changed from: private */
    public Sy c;

    public C1375hz(Executor executor, Sy sy) {
        this.a = executor;
        this.c = sy;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0016, code lost:
        r2.a.execute(new defpackage.C1405iz(r2, r3));
     */
    public final void onComplete(Wy<TResult> wy) {
        if (!wy.e() && !wy.c()) {
            synchronized (this.b) {
                if (this.c == null) {
                }
            }
        }
    }
}
