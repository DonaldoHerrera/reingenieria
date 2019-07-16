package com.soundcloud.android.creators.upload;

import android.content.Context;
import android.content.res.Resources;
import androidx.core.app.n;
import com.soundcloud.android.accounts.C2526g;

/* compiled from: UploadNotificationController_Factory */
public final class v implements C4961HMa<u> {
    private final C7054oVa<Context> a;
    private final C7054oVa<Resources> b;
    private final C7054oVa<n> c;
    private final C7054oVa<C2526g> d;

    public static u a(Context context, Resources resources, n nVar, C2526g gVar) {
        return new u(context, resources, nVar, gVar);
    }

    public u get() {
        return new u((Context) this.a.get(), (Resources) this.b.get(), (n) this.c.get(), (C2526g) this.d.get());
    }
}
