package defpackage;

import android.os.Bundle;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.g;
import com.google.android.gms.auth.api.signin.internal.h;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.AbstractClientBuilder;
import com.google.android.gms.common.api.Api.ApiOptions.Optional;
import com.google.android.gms.common.api.Api.ClientKey;

/* renamed from: er reason: default package and case insensitive filesystem */
public final class C1274er {
    public static final ClientKey<Tr> a = new ClientKey<>();
    public static final ClientKey<h> b = new ClientKey<>();
    private static final AbstractClientBuilder<Tr, a> c = new C1459kr();
    private static final AbstractClientBuilder<h, GoogleSignInOptions> d = new C1490lr();
    @KeepForSdk
    @Deprecated
    public static final Api<C1336gr> e = C1305fr.c;
    public static final Api<a> f = new Api<>("Auth.CREDENTIALS_API", c, a);
    public static final Api<GoogleSignInOptions> g = new Api<>("Auth.GOOGLE_SIGN_IN_API", d, b);
    @KeepForSdk
    @Deprecated
    public static final C1397ir h = C1305fr.d;
    public static final C1367hr i = new Sr();
    public static final com.google.android.gms.auth.api.signin.a j = new g();

    @Deprecated
    /* renamed from: er$a */
    public static class a implements Optional {
        private static final a a = new C0047a().a();
        private final String b = null;
        private final boolean c;

        @Deprecated
        /* renamed from: er$a$a reason: collision with other inner class name */
        public static class C0047a {
            protected Boolean a = Boolean.valueOf(false);

            public a a() {
                return new a(this);
            }
        }

        public a(C0047a aVar) {
            this.c = aVar.a.booleanValue();
        }

        public final Bundle a() {
            Bundle bundle = new Bundle();
            bundle.putString("consumer_package", null);
            bundle.putBoolean("force_save_dialog", this.c);
            return bundle;
        }
    }
}
