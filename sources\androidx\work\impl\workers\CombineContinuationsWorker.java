package androidx.work.impl.workers;

import android.content.Context;
import androidx.work.ListenableWorker.a;
import androidx.work.Worker;
import androidx.work.WorkerParameters;

public class CombineContinuationsWorker extends Worker {
    public CombineContinuationsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    public a m() {
        return a.a(d());
    }
}
