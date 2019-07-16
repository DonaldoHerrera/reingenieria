package defpackage;

/* renamed from: Qyb reason: default package */
/* compiled from: DiskLruCache */
class Qyb implements Runnable {
    final /* synthetic */ Tyb a;

    Qyb(Tyb tyb) {
        this.a = tyb;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r5.a.r = true;
        r5.a.k = defpackage.C7720yAb.a(defpackage.C7720yAb.a());
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x001d */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0033 */
    public void run() {
        synchronized (this.a) {
            if (!(!this.a.o) && !this.a.p) {
                this.a.e();
                this.a.q = true;
                if (this.a.c()) {
                    this.a.d();
                    this.a.m = 0;
                }
            } else {
                return;
            }
        }
        return;
    }
}
