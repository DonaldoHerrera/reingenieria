package com.soundcloud.android.offline;

import android.content.Context;
import android.content.res.Resources;
import androidx.core.app.n;

/* compiled from: DownloadNotificationController_Factory */
public final class Ub implements C4961HMa<Tb> {
    private final C7054oVa<Context> a;
    private final C7054oVa<n> b;
    private final C7054oVa<Resources> c;

    public static Tb a(Context context, n nVar, Resources resources) {
        return new Tb(context, nVar, resources);
    }

    public Tb get() {
        return new Tb((Context) this.a.get(), (n) this.b.get(), (Resources) this.c.get());
    }
}
