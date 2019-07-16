package com.soundcloud.android;

import android.app.Application;
import android.media.AudioManager;

/* renamed from: com.soundcloud.android.q reason: case insensitive filesystem */
/* compiled from: ApplicationModule_ProvideAudioManagerFactory */
public final class C2938q implements C4961HMa<AudioManager> {
    private final C7054oVa<Application> a;

    public C2938q(C7054oVa<Application> ova) {
        this.a = ova;
    }

    public static C2938q a(C7054oVa<Application> ova) {
        return new C2938q(ova);
    }

    public static AudioManager a(Application application) {
        AudioManager c = C2933l.c(application);
        C5023JMa.a(c, "Cannot return null from a non-@Nullable @Provides method");
        return c;
    }

    public AudioManager get() {
        return a((Application) this.a.get());
    }
}
