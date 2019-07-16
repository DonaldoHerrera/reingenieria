package com.soundcloud.android.app;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import com.google.firebase.d;
import com.soundcloud.android.C2932k;
import com.soundcloud.android.SoundCloudApplication;
import com.soundcloud.android.ja;

public class RealSoundCloudApplication extends SoundCloudApplication {
    C3152nQ Z;
    C3200pQ aa;

    public /* synthetic */ ListenableWorker a(Context context, String str, WorkerParameters workerParameters) {
        return this.Z.a(context, str, workerParameters);
    }

    /* access modifiers changed from: protected */
    public C2932k b() {
        return da.a().a(this);
    }

    /* access modifiers changed from: protected */
    public void c() {
        SDb.a(C2470bQ.a("release"));
    }

    /* access modifiers changed from: protected */
    public C7181qKa d() {
        return new ja(getResources());
    }

    /* access modifiers changed from: protected */
    public d e() {
        return d.a(this);
    }

    /* access modifiers changed from: protected */
    public void g() {
        super.g();
        C3259sQ.a(this, new C2652a(this));
    }

    /* access modifiers changed from: protected */
    public void h() {
        ((ja) this.Y).a(this);
    }

    public void onCreate() {
        super.onCreate();
        if (!C5501ZLa.a((Context) this)) {
            this.aa.a();
        }
    }
}
