package com.soundcloud.android.ads;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.ads.identifier.AdvertisingIdClient.Info;

/* renamed from: com.soundcloud.android.ads.lb reason: case insensitive filesystem */
/* compiled from: AdvertisingIdClientWrapper.kt */
public class C2595lb {
    private final Context a;

    public C2595lb(Context context) {
        C7471uYa.b(context, "context");
        this.a = context;
    }

    public Info a() throws C2603nb {
        try {
            return AdvertisingIdClient.getAdvertisingIdInfo(this.a);
        } catch (Exception e) {
            throw new C2603nb(e);
        }
    }
}
