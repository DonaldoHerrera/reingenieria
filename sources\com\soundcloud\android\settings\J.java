package com.soundcloud.android.settings;

import android.content.Context;
import android.content.SharedPreferences;

/* compiled from: SettingsModule_ProvidesStreamingSettingsPrefsFactory */
public final class J implements C4961HMa<SharedPreferences> {
    private final C7054oVa<Context> a;

    public J(C7054oVa<Context> ova) {
        this.a = ova;
    }

    public static J a(C7054oVa<Context> ova) {
        return new J(ova);
    }

    public static SharedPreferences a(Context context) {
        SharedPreferences b = H.b(context);
        C5023JMa.a(b, "Cannot return null from a non-@Nullable @Provides method");
        return b;
    }

    public SharedPreferences get() {
        return a((Context) this.a.get());
    }
}
