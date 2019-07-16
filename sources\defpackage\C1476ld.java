package defpackage;

import android.util.Log;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/* renamed from: ld reason: default package and case insensitive filesystem */
/* compiled from: ModernAsyncTask */
class C1476ld extends FutureTask<Result> {
    final /* synthetic */ C1538nd a;

    C1476ld(C1538nd ndVar, Callable callable) {
        this.a = ndVar;
        super(callable);
    }

    /* access modifiers changed from: protected */
    public void done() {
        String str = "An error occurred while executing doInBackground()";
        try {
            this.a.e(get());
        } catch (InterruptedException e) {
            Log.w("AsyncTask", e);
        } catch (ExecutionException e2) {
            throw new RuntimeException(str, e2.getCause());
        } catch (CancellationException unused) {
            this.a.e(null);
        } catch (Throwable th) {
            throw new RuntimeException(str, th);
        }
    }
}
