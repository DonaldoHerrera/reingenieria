package com.soundcloud.android;

import android.content.Context;

/* renamed from: com.soundcloud.android.j reason: case insensitive filesystem */
/* compiled from: AppConfigModule_ProvideAppBoyDefaultChannelNameFactory */
public final class C2931j implements C4961HMa<String> {
    private final C7054oVa<Context> a;

    public C2931j(C7054oVa<Context> ova) {
        this.a = ova;
    }

    public static C2931j a(C7054oVa<Context> ova) {
        return new C2931j(ova);
    }

    public static String a(Context context) {
        String a2 = C2930i.a(context);
        C5023JMa.a(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }

    public String get() {
        return a((Context) this.a.get());
    }
}
