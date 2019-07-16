package com.soundcloud.android.fcm;

import android.app.IntentService;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import dagger.android.a;

public class FcmRegistrationService extends IntentService {
    r a;

    public FcmRegistrationService() {
        super("GcmRegistrationService");
    }

    public static void a(Context context) {
        context.startService(new Intent(context, FcmRegistrationService.class));
    }

    public void onCreate() {
        a.a((Service) this);
        super.onCreate();
    }

    /* access modifiers changed from: protected */
    public void onHandleIntent(Intent intent) {
        this.a.a();
    }
}
