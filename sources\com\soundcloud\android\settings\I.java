package com.soundcloud.android.settings;

import android.content.Context;
import android.content.SharedPreferences;

/* compiled from: SettingsModule_ProvidesPlayerSettingsPrefsFactory */
public final class I implements C4961HMa<SharedPreferences> {
    private final C7054oVa<Context> a;

    public static SharedPreferences a(Context context) {
        SharedPreferences a2 = H.a(context);
        C5023JMa.a(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }

    public SharedPreferences get() {
        return a((Context) this.a.get());
    }
}
