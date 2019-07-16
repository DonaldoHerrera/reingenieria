package androidx.work.impl;

import android.annotation.SuppressLint;
import androidx.work.ListenableWorker.a;
import androidx.work.i;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* compiled from: WorkerWrapper */
class o implements Runnable {
    final /* synthetic */ C1781vf a;
    final /* synthetic */ String b;
    final /* synthetic */ p c;

    o(p pVar, C1781vf vfVar, String str) {
        this.c = pVar;
        this.a = vfVar;
        this.b = str;
    }

    @SuppressLint({"SyntheticAccessor"})
    public void run() {
        try {
            a aVar = (a) this.a.get();
            if (aVar == null) {
                i.a().b(p.a, String.format("%s returned a null result. Treating it as a failure.", new Object[]{this.c.f.e}), new Throwable[0]);
            } else {
                i.a().a(p.a, String.format("%s returned a %s result.", new Object[]{this.c.f.e, aVar}), new Throwable[0]);
                this.c.h = aVar;
            }
        } catch (CancellationException e) {
            i.a().c(p.a, String.format("%s was cancelled", new Object[]{this.b}), e);
        } catch (InterruptedException | ExecutionException e2) {
            i.a().b(p.a, String.format("%s failed because it threw an exception/error", new Object[]{this.b}), e2);
        } catch (Throwable th) {
            this.c.b();
            throw th;
        }
        this.c.b();
    }
}
