package defpackage;

import java.util.concurrent.Callable;

/* renamed from: EH reason: default package and case insensitive filesystem */
/* compiled from: DiskLruCache */
class C2007EH implements Callable<Void> {
    final /* synthetic */ C2047GH a;

    C2007EH(C2047GH gh) {
        this.a = gh;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0027, code lost:
        return null;
     */
    public Void call() throws Exception {
        synchronized (this.a) {
            if (this.a.k == null) {
                return null;
            }
            this.a.h();
            if (this.a.d()) {
                this.a.g();
                this.a.m = 0;
            }
        }
    }
}
