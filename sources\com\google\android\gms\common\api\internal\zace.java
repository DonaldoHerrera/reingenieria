package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api.AbstractClientBuilder;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ResolveAccountResponse;
import com.google.android.gms.signin.internal.c;
import com.google.android.gms.signin.internal.zaj;
import java.util.Set;

public final class zace extends c implements ConnectionCallbacks, OnConnectionFailedListener {
    private static AbstractClientBuilder<? extends Oy, Ky> zaki = Ly.c;
    private final Context mContext;
    private final Handler mHandler;
    private Set<Scope> mScopes;
    private final AbstractClientBuilder<? extends Oy, Ky> zaau;
    private ClientSettings zaet;
    private Oy zagb;
    /* access modifiers changed from: private */
    public zach zakj;

    public zace(Context context, Handler handler, ClientSettings clientSettings) {
        this(context, handler, clientSettings, zaki);
    }

    /* access modifiers changed from: private */
    public final void zac(zaj zaj) {
        ConnectionResult connectionResult = zaj.getConnectionResult();
        if (connectionResult.isSuccess()) {
            ResolveAccountResponse i = zaj.i();
            ConnectionResult connectionResult2 = i.getConnectionResult();
            if (!connectionResult2.isSuccess()) {
                String valueOf = String.valueOf(connectionResult2);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 48);
                sb.append("Sign-in succeeded with resolve account failure: ");
                sb.append(valueOf);
                Log.wtf("SignInCoordinator", sb.toString(), new Exception());
                this.zakj.zag(connectionResult2);
                this.zagb.disconnect();
                return;
            }
            this.zakj.zaa(i.getAccountAccessor(), this.mScopes);
        } else {
            this.zakj.zag(connectionResult);
        }
        this.zagb.disconnect();
    }

    public final void onConnected(Bundle bundle) {
        this.zagb.a(this);
    }

    public final void onConnectionFailed(ConnectionResult connectionResult) {
        this.zakj.zag(connectionResult);
    }

    public final void onConnectionSuspended(int i) {
        this.zagb.disconnect();
    }

    public final void zaa(zach zach) {
        Oy oy = this.zagb;
        if (oy != null) {
            oy.disconnect();
        }
        this.zaet.setClientSessionId(Integer.valueOf(System.identityHashCode(this)));
        AbstractClientBuilder<? extends Oy, Ky> abstractClientBuilder = this.zaau;
        Context context = this.mContext;
        Looper looper = this.mHandler.getLooper();
        ClientSettings clientSettings = this.zaet;
        this.zagb = (Oy) abstractClientBuilder.buildClient(context, looper, clientSettings, clientSettings.getSignInOptions(), this, this);
        this.zakj = zach;
        Set<Scope> set = this.mScopes;
        if (set == null || set.isEmpty()) {
            this.mHandler.post(new zacf(this));
        } else {
            this.zagb.connect();
        }
    }

    public final void zab(zaj zaj) {
        this.mHandler.post(new zacg(this, zaj));
    }

    public final Oy zabq() {
        return this.zagb;
    }

    public final void zabs() {
        Oy oy = this.zagb;
        if (oy != null) {
            oy.disconnect();
        }
    }

    public zace(Context context, Handler handler, ClientSettings clientSettings, AbstractClientBuilder<? extends Oy, Ky> abstractClientBuilder) {
        this.mContext = context;
        this.mHandler = handler;
        Preconditions.checkNotNull(clientSettings, "ClientSettings must not be null");
        this.zaet = clientSettings;
        this.mScopes = clientSettings.getRequiredScopes();
        this.zaau = abstractClientBuilder;
    }
}
