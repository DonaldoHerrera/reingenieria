package com.google.android.gms.phenotype;

import android.net.Uri;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.AbstractClientBuilder;
import com.google.android.gms.common.api.Api.ApiOptions.NoOptions;
import com.google.android.gms.common.api.Api.ClientKey;

@KeepForSdk
public final class a {
    private static final ClientKey<Iy> a = new ClientKey<>();
    private static final AbstractClientBuilder<Iy, NoOptions> b = new g();
    @Deprecated
    private static final Api<NoOptions> c = new Api<>("Phenotype.API", b, a);
    @Deprecated
    private static final h d = new Hy();

    @KeepForSdk
    public static Uri a(String str) {
        String valueOf = String.valueOf(Uri.encode(str));
        String str2 = "content://com.google.android.gms.phenotype/";
        return Uri.parse(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
    }
}
