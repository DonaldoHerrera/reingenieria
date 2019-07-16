package com.soundcloud.android;

import android.appwidget.AppWidgetManager;
import android.content.Context;

/* renamed from: com.soundcloud.android.p reason: case insensitive filesystem */
/* compiled from: ApplicationModule_ProvideAppWidgetManagerFactory */
public final class C2937p implements C4961HMa<AppWidgetManager> {
    private final C7054oVa<Context> a;

    public C2937p(C7054oVa<Context> ova) {
        this.a = ova;
    }

    public static C2937p a(C7054oVa<Context> ova) {
        return new C2937p(ova);
    }

    public static AppWidgetManager a(Context context) {
        AppWidgetManager a2 = C2933l.a(context);
        C5023JMa.a(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }

    public AppWidgetManager get() {
        return a((Context) this.a.get());
    }
}
