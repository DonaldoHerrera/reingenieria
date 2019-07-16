package defpackage;

import java.util.concurrent.Executor;

/* renamed from: dz reason: default package and case insensitive filesystem */
final class C1251dz<TResult> implements C1560nz<TResult> {
    private final Executor a;
    /* access modifiers changed from: private */
    public final Object b = new Object();
    /* access modifiers changed from: private */
    public Qy c;

    public C1251dz(Executor executor, Qy qy) {
        this.a = executor;
        this.c = qy;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0010, code lost:
        r1.a.execute(new defpackage.C1282ez(r1));
     */
    public final void onComplete(Wy wy) {
        if (wy.c()) {
            synchronized (this.b) {
                if (this.c == null) {
                }
            }
        }
    }
}
