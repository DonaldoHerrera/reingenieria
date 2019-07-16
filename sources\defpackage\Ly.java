package defpackage;

import com.google.android.gms.common.Scopes;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.AbstractClientBuilder;
import com.google.android.gms.common.api.Api.ClientKey;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.signin.internal.a;

/* renamed from: Ly reason: default package */
public final class Ly {
    private static final ClientKey<a> a = new ClientKey<>();
    @ShowFirstParty
    private static final ClientKey<a> b = new ClientKey<>();
    public static final AbstractClientBuilder<a, Ky> c = new My();
    private static final AbstractClientBuilder<a, Object> d = new Ny();
    private static final Scope e = new Scope(Scopes.PROFILE);
    private static final Scope f = new Scope(Scopes.EMAIL);
    public static final Api<Ky> g = new Api<>("SignIn.API", c, a);
    private static final Api<Object> h = new Api<>("SignIn.INTERNAL_API", d, b);
}
