package com.soundcloud.android.sync;

import android.accounts.Account;
import android.content.AbstractThreadedSyncAdapter;
import android.content.ContentProviderClient;
import android.content.Context;
import android.content.SyncResult;
import android.os.Bundle;
import android.os.Looper;

/* compiled from: SyncAdapter */
public class D extends AbstractThreadedSyncAdapter {
    private Looper a;
    private C6133p b;
    private C6130m c;

    /* compiled from: SyncAdapter */
    public static class a implements Runnable {
        private final Looper a;

        /* synthetic */ a(Looper looper, C c) {
            this(looper);
        }

        public void run() {
            SDb.a("SyncAdapter").a("sync finished", new Object[0]);
            this.a.quit();
        }

        private a(Looper looper) {
            this.a = looper;
        }
    }

    public D(Context context, C6133p pVar, C6130m mVar) {
        super(context, false);
        this.b = pVar;
        this.c = mVar;
    }

    public void onPerformSync(Account account, Bundle bundle, String str, ContentProviderClient contentProviderClient, SyncResult syncResult) {
        boolean z = bundle.getBoolean("force", false);
        Looper.prepare();
        this.a = Looper.myLooper();
        int i = C.a[this.b.a(this.c.a((Runnable) new a(this.a, null), syncResult)).b(z).ordinal()];
        if (i == 1) {
            Looper.loop();
        } else if (i == 2) {
            syncResult.stats.numAuthExceptions++;
        }
    }

    public void onSyncCanceled() {
        Looper looper = this.a;
        if (looper != null) {
            looper.quit();
        }
        super.onSyncCanceled();
    }
}
