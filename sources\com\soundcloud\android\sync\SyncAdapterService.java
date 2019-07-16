package com.soundcloud.android.sync;

import android.app.Service;
import android.content.AbstractThreadedSyncAdapter;
import android.content.Intent;
import android.os.IBinder;
import com.soundcloud.android.SoundCloudApplication;

public class SyncAdapterService extends Service {
    private AbstractThreadedSyncAdapter a;
    C7054oVa<D> b;

    public SyncAdapterService() {
        SoundCloudApplication.f().a(this);
    }

    public IBinder onBind(Intent intent) {
        return this.a.getSyncAdapterBinder();
    }

    public void onCreate() {
        super.onCreate();
        this.a = (AbstractThreadedSyncAdapter) this.b.get();
    }
}
