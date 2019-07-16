package com.soundcloud.android.sync;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.ResultReceiver;
import java.util.concurrent.atomic.AtomicReference;

@SuppressLint({"ParcelCreator"})
public class ResultReceiverAdapter extends ResultReceiver {
    private final AtomicReference<JPa<? super SyncJobResult>> a;

    ResultReceiverAdapter(JPa<? super SyncJobResult> jPa, Looper looper) {
        super(new Handler(looper));
        this.a = new AtomicReference<>(jPa);
        jPa.a((C6708jQa) new C6118a(this));
    }

    public /* synthetic */ void a() throws Exception {
        SDb.a("RxResultReceiver").a("observer is unsubscribing, releasing ref...", new Object[0]);
        this.a.set(null);
    }

    /* access modifiers changed from: protected */
    public void onReceiveResult(int i, Bundle bundle) {
        SDb.a("RxResultReceiver").a("delivering result: %s", bundle);
        SyncJobResult syncJobResult = (SyncJobResult) bundle.getParcelable("syncResult");
        if (syncJobResult.f()) {
            a(syncJobResult);
        } else {
            a(syncJobResult.b());
        }
    }

    private void a(Exception exc) {
        JPa jPa = (JPa) this.a.get();
        if (jPa == null || jPa.a()) {
            C7316sHa.b((Throwable) exc, "ResultReceiverAdapter");
        } else {
            jPa.a((Throwable) exc);
        }
    }

    private void a(SyncJobResult syncJobResult) {
        JPa jPa = (JPa) this.a.get();
        if (jPa == null || jPa.a()) {
            SDb.a("RxResultReceiver").a("Emitter already disposed, dropping result: %s", syncJobResult);
            return;
        }
        jPa.onSuccess(syncJobResult);
    }
}
