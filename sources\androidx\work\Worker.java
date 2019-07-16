package androidx.work;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import androidx.work.ListenableWorker.a;

public abstract class Worker extends ListenableWorker {
    C1781vf<a> e;

    @SuppressLint({"BanKeepAnnotation"})
    @Keep
    public Worker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    public final C3347xE<a> k() {
        this.e = C1781vf.d();
        b().execute(new t(this));
        return this.e;
    }

    public abstract a m();
}
