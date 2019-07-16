package defpackage;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import androidx.work.b.a;
import androidx.work.r;

/* renamed from: sQ reason: default package and case insensitive filesystem */
/* compiled from: WorkManagerInitializer.kt */
public final class C3259sQ {
    public static final void a(Context context, C6376eYa<? super Context, ? super String, ? super WorkerParameters, ? extends ListenableWorker> eya) {
        C7471uYa.b(context, "appContext");
        C7471uYa.b(eya, "delegate");
        a aVar = new a();
        aVar.a(new C3239rQ(eya));
        r.a(context, aVar.a());
    }
}
