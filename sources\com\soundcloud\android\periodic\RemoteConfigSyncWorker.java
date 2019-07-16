package com.soundcloud.android.periodic;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.RxWorker;
import androidx.work.WorkerParameters;
import com.soundcloud.android.foundation.events.C3700b;
import com.soundcloud.android.foundation.events.C3702d;
import com.soundcloud.android.foundation.events.C3702d.b.C0095d;
import com.soundcloud.android.properties.a;

@EVa(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0016J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/soundcloud/android/periodic/RemoteConfigSyncWorker;", "Landroidx/work/RxWorker;", "appContext", "Landroid/content/Context;", "workerParams", "Landroidx/work/WorkerParameters;", "analytics", "Lcom/soundcloud/android/foundation/events/Analytics;", "appFeatures", "Lcom/soundcloud/android/properties/AppFeatures;", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lcom/soundcloud/android/foundation/events/Analytics;Lcom/soundcloud/android/properties/AppFeatures;)V", "createWork", "Lio/reactivex/Single;", "Landroidx/work/ListenableWorker$Result;", "trackSyncAttempt", "", "success", "", "periodicjobs_release"}, mv = {1, 1, 15})
/* compiled from: RemoteConfigSyncWorker.kt */
public final class RemoteConfigSyncWorker extends RxWorker {
    private final C3700b g;
    private final a h;

    public RemoteConfigSyncWorker(Context context, WorkerParameters workerParameters, C3700b bVar, a aVar) {
        C7471uYa.b(context, "appContext");
        C7471uYa.b(workerParameters, "workerParams");
        C7471uYa.b(bVar, "analytics");
        C7471uYa.b(aVar, "appFeatures");
        super(context, workerParameters);
        this.g = bVar;
        this.h = aVar;
    }

    public IPa<ListenableWorker.a> m() {
        IPa<ListenableWorker.a> e = this.h.e().c((C6776kQa<? super T>) new h<Object>(this)).e(i.a);
        C7471uYa.a((Object) e, "appFeatures.updateRemote…) else Result.failure() }");
        return e;
    }

    /* access modifiers changed from: private */
    public final void a(boolean z) {
        this.g.a((C3702d) new C0095d(z));
    }
}
