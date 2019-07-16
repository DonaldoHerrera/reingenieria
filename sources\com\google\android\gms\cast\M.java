package com.google.android.gms.cast;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.cast.C0627a.c;
import com.google.android.gms.common.api.Api.AbstractClientBuilder;
import com.google.android.gms.common.api.Api.Client;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.cast.N;

final class M extends AbstractClientBuilder<N, c> {
    M() {
    }

    public final /* synthetic */ Client buildClient(Context context, Looper looper, ClientSettings clientSettings, Object obj, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
        c cVar = (c) obj;
        Preconditions.checkNotNull(cVar, "Setting the API options is required.");
        N n = new N(context, looper, clientSettings, cVar.a, (long) cVar.d, cVar.b, cVar.c, connectionCallbacks, onConnectionFailedListener);
        return n;
    }
}
