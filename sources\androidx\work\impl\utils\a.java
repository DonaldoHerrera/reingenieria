package androidx.work.impl.utils;

import androidx.work.impl.WorkDatabase;
import androidx.work.impl.m;

/* compiled from: CancelWorkRunnable */
class a extends c {
    final /* synthetic */ m b;
    final /* synthetic */ String c;

    a(m mVar, String str) {
        this.b = mVar;
        this.c = str;
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: 0000 */
    public void b() {
        WorkDatabase g = this.b.g();
        g.c();
        try {
            for (String a : g.t().d(this.c)) {
                a(this.b, a);
            }
            g.m();
            g.e();
            a(this.b);
        } catch (Throwable th) {
            g.e();
            throw th;
        }
    }
}
