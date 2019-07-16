package com.google.android.gms.cast;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.cast.C0629c.a;
import com.google.android.gms.common.api.Api.AbstractClientBuilder;
import com.google.android.gms.common.api.Api.Client;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.internal.cast.va;

final class U extends AbstractClientBuilder<va, a> {
    U() {
    }

    public final /* synthetic */ Client buildClient(Context context, Looper looper, ClientSettings clientSettings, Object obj, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
        a aVar = (a) obj;
        Bundle bundle = new Bundle();
        bundle.putInt("configuration", aVar.c);
        va vaVar = new va(context, looper, clientSettings, aVar.a, bundle, aVar.b, connectionCallbacks, onConnectionFailedListener);
        return vaVar;
    }
}
