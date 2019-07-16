package defpackage;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import androidx.work.v;

/* renamed from: rQ reason: default package and case insensitive filesystem */
/* compiled from: WorkManagerInitializer.kt */
public final class C3239rQ extends v {
    final /* synthetic */ C6376eYa b;

    C3239rQ(C6376eYa eya) {
        this.b = eya;
    }

    public ListenableWorker a(Context context, String str, WorkerParameters workerParameters) {
        C7471uYa.b(context, "appContext");
        C7471uYa.b(str, "workerClassName");
        C7471uYa.b(workerParameters, "workerParameters");
        return (ListenableWorker) this.b.a(context, str, workerParameters);
    }
}
