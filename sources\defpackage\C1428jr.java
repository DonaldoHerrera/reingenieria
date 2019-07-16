package defpackage;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Api.AbstractClientBuilder;
import com.google.android.gms.common.api.Api.Client;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.internal.ClientSettings;

/* renamed from: jr reason: default package and case insensitive filesystem */
final class C1428jr extends AbstractClientBuilder<Xr, C1336gr> {
    C1428jr() {
    }

    public final /* synthetic */ Client buildClient(Context context, Looper looper, ClientSettings clientSettings, Object obj, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
        Xr xr = new Xr(context, looper, clientSettings, (C1336gr) obj, connectionCallbacks, onConnectionFailedListener);
        return xr;
    }
}
