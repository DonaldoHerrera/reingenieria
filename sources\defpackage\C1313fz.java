package defpackage;

import java.util.concurrent.Executor;

/* renamed from: fz reason: default package and case insensitive filesystem */
final class C1313fz<TResult> implements C1560nz<TResult> {
    private final Executor a;
    /* access modifiers changed from: private */
    public final Object b = new Object();
    /* access modifiers changed from: private */
    public Ry<TResult> c;

    public C1313fz(Executor executor, Ry<TResult> ry) {
        this.a = executor;
        this.c = ry;
    }

    public final void onComplete(Wy<TResult> wy) {
        synchronized (this.b) {
            if (this.c != null) {
                this.a.execute(new C1344gz(this, wy));
            }
        }
    }
}
