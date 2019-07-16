package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.os.Binder;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.GoogleApiClient.Builder;

public final class t extends o {
    private final Context a;

    public t(Context context) {
        this.a = context;
    }

    private final void C() {
        if (!GooglePlayServicesUtilLight.isGooglePlayServicesUid(this.a, Binder.getCallingUid())) {
            int callingUid = Binder.getCallingUid();
            StringBuilder sb = new StringBuilder(52);
            sb.append("Calling UID ");
            sb.append(callingUid);
            sb.append(" is not Google Play services.");
            throw new SecurityException(sb.toString());
        }
    }

    public final void j() {
        C();
        m.a(this.a).a();
    }

    public final void s() {
        C();
        b a2 = b.a(this.a);
        GoogleSignInAccount b = a2.b();
        GoogleSignInOptions googleSignInOptions = GoogleSignInOptions.f;
        if (b != null) {
            googleSignInOptions = a2.c();
        }
        GoogleApiClient build = new Builder(this.a).addApi(C1274er.g, googleSignInOptions).build();
        try {
            if (build.blockingConnect().isSuccess()) {
                if (b != null) {
                    C1274er.j.a(build);
                } else {
                    build.clearDefaultAccountAndReconnect();
                }
            }
        } finally {
            build.disconnect();
        }
    }
}
