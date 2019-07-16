package defpackage;

import android.util.Log;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/* renamed from: QNa reason: default package and case insensitive filesystem */
/* compiled from: AsyncTask */
class C5239QNa extends FutureTask<Result> {
    final /* synthetic */ C5299SNa a;

    C5239QNa(C5299SNa sNa, Callable callable) {
        this.a = sNa;
        super(callable);
    }

    /* access modifiers changed from: protected */
    public void done() {
        try {
            this.a.f(get());
        } catch (InterruptedException e) {
            Log.w("AsyncTask", e);
        } catch (ExecutionException e2) {
            throw new RuntimeException("An error occured while executing doInBackground()", e2.getCause());
        } catch (CancellationException unused) {
            this.a.f(null);
        }
    }
}
