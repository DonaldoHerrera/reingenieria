package defpackage;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Api.AbstractClientBuilder;
import com.google.android.gms.common.api.Api.Client;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.internal.ClientSettings;

/* renamed from: kr reason: default package and case insensitive filesystem */
final class C1459kr extends AbstractClientBuilder<Tr, a> {
    C1459kr() {
    }

    public final /* synthetic */ Client buildClient(Context context, Looper looper, ClientSettings clientSettings, Object obj, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
        Tr tr = new Tr(context, looper, clientSettings, (a) obj, connectionCallbacks, onConnectionFailedListener);
        return tr;
    }
}
