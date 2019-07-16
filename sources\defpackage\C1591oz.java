package defpackage;

import java.util.ArrayDeque;
import java.util.Queue;

/* renamed from: oz reason: default package and case insensitive filesystem */
final class C1591oz<TResult> {
    private final Object a = new Object();
    private Queue<C1560nz<TResult>> b;
    private boolean c;

    C1591oz() {
    }

    public final void a(C1560nz<TResult> nzVar) {
        synchronized (this.a) {
            if (this.b == null) {
                this.b = new ArrayDeque();
            }
            this.b.add(nzVar);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0010, code lost:
        r1 = r2.a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0012, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        r0 = (defpackage.C1560nz) r2.b.poll();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001b, code lost:
        if (r0 != null) goto L_0x0022;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x001d, code lost:
        r2.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0020, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0021, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0022, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0023, code lost:
        r0.onComplete(r3);
     */
    public final void a(Wy<TResult> wy) {
        synchronized (this.a) {
            if (this.b != null) {
                if (!this.c) {
                    this.c = true;
                }
            }
        }
    }
}
