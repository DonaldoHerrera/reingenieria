package defpackage;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.AbstractClientBuilder;
import com.google.android.gms.common.api.Api.ClientKey;

@KeepForSdk
/* renamed from: fr reason: default package and case insensitive filesystem */
public final class C1305fr {
    private static final ClientKey<Xr> a = new ClientKey<>();
    private static final AbstractClientBuilder<Xr, C1336gr> b = new C1428jr();
    @KeepForSdk
    public static final Api<C1336gr> c = new Api<>("Auth.PROXY_API", b, a);
    @KeepForSdk
    public static final C1397ir d = new _r();
}
