package androidx.work.impl.utils;

import androidx.work.impl.WorkDatabase;
import androidx.work.impl.m;

/* compiled from: CancelWorkRunnable */
class b extends c {
    final /* synthetic */ m b;
    final /* synthetic */ String c;
    final /* synthetic */ boolean d;

    b(m mVar, String str, boolean z) {
        this.b = mVar;
        this.c = str;
        this.d = z;
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: 0000 */
    public void b() {
        WorkDatabase g = this.b.g();
        g.c();
        try {
            for (String a : g.t().a(this.c)) {
                a(this.b, a);
            }
            g.m();
            g.e();
            if (this.d) {
                a(this.b);
            }
        } catch (Throwable th) {
            g.e();
            throw th;
        }
    }
}
