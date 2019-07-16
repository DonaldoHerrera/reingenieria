package com.soundcloud.android;

import android.app.AlarmManager;
import android.app.Application;

/* renamed from: com.soundcloud.android.n reason: case insensitive filesystem */
/* compiled from: ApplicationModule_ProvideAlarmManagerFactory */
public final class C2935n implements C4961HMa<AlarmManager> {
    private final C7054oVa<Application> a;

    public static AlarmManager a(Application application) {
        AlarmManager b = C2933l.b(application);
        C5023JMa.a(b, "Cannot return null from a non-@Nullable @Provides method");
        return b;
    }

    public AlarmManager get() {
        return a((Application) this.a.get());
    }
}
