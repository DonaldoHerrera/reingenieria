package defpackage;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Api.AbstractClientBuilder;
import com.google.android.gms.common.api.Api.Client;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.signin.internal.a;

/* renamed from: My reason: default package */
final class My extends AbstractClientBuilder<a, Ky> {
    My() {
    }

    public final /* synthetic */ Client buildClient(Context context, Looper looper, ClientSettings clientSettings, Object obj, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
        Ky ky = (Ky) obj;
        if (ky == null) {
            ky = Ky.a;
        }
        a aVar = new a(context, looper, true, clientSettings, ky, connectionCallbacks, onConnectionFailedListener);
        return aVar;
    }
}
