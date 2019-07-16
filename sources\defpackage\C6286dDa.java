package defpackage;

import android.os.AsyncTask;

/* renamed from: dDa reason: default package and case insensitive filesystem */
/* compiled from: ParallelAsyncTask */
public abstract class C6286dDa<Params, Progress, Result> extends AsyncTask<Params, Progress, Result> {
    private static final boolean a = (!"Dalvik".equals(System.getProperty("java.vm.name")));

    public final AsyncTask<Params, Progress, Result> a(Params... paramsArr) {
        return a ? execute(paramsArr) : executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, paramsArr);
    }
}
