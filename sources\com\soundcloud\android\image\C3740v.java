package com.soundcloud.android.image;

import android.app.Application;
import android.content.SharedPreferences;

/* renamed from: com.soundcloud.android.image.v reason: case insensitive filesystem */
/* compiled from: ImageModule_ProvideImageConfigurationFactory */
public final class C3740v implements C4961HMa<SharedPreferences> {
    private final C7054oVa<Application> a;

    public C3740v(C7054oVa<Application> ova) {
        this.a = ova;
    }

    public static C3740v a(C7054oVa<Application> ova) {
        return new C3740v(ova);
    }

    public static SharedPreferences a(Application application) {
        SharedPreferences a2 = C3738t.a(application);
        C5023JMa.a(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }

    public SharedPreferences get() {
        return a((Application) this.a.get());
    }
}
