package defpackage;

import java.util.concurrent.Executor;

/* renamed from: jz reason: default package and case insensitive filesystem */
final class C1436jz<TResult> implements C1560nz<TResult> {
    private final Executor a;
    /* access modifiers changed from: private */
    public final Object b = new Object();
    /* access modifiers changed from: private */
    public Ty<? super TResult> c;

    public C1436jz(Executor executor, Ty<? super TResult> ty) {
        this.a = executor;
        this.c = ty;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0010, code lost:
        r2.a.execute(new defpackage.C1467kz(r2, r3));
     */
    public final void onComplete(Wy<TResult> wy) {
        if (wy.e()) {
            synchronized (this.b) {
                if (this.c == null) {
                }
            }
        }
    }
}
