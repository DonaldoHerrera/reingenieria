package defpackage;

import android.os.Binder;
import android.os.Process;

/* renamed from: kd reason: default package and case insensitive filesystem */
/* compiled from: ModernAsyncTask */
class C1445kd extends d<Params, Result> {
    final /* synthetic */ C1538nd b;

    C1445kd(C1538nd ndVar) {
        this.b = ndVar;
    }

    public Result call() throws Exception {
        this.b.j.set(true);
        Result result = null;
        try {
            Process.setThreadPriority(10);
            result = this.b.a(this.a);
            Binder.flushPendingCommands();
            this.b.d(result);
            return result;
        } catch (Throwable th) {
            this.b.d(result);
            throw th;
        }
    }
}
