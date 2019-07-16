package com.google.android.gms.internal.cast;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IBinder.DeathRecipient;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.cast.C0629c.b;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.GmsClient;

@Deprecated
public final class va extends GmsClient<ya> implements DeathRecipient {
    private static final C0710ia a = new C0710ia("CastRemoteDisplayClientImpl");
    private b b;
    private CastDevice c;
    private Bundle d;

    public va(Context context, Looper looper, ClientSettings clientSettings, CastDevice castDevice, Bundle bundle, b bVar, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, 83, clientSettings, connectionCallbacks, onConnectionFailedListener);
        a.a("instance created", new Object[0]);
        this.b = bVar;
        this.c = castDevice;
        this.d = bundle;
    }

    public final void binderDied() {
    }

    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.remote_display.ICastRemoteDisplayService");
        if (queryLocalInterface instanceof ya) {
            return (ya) queryLocalInterface;
        }
        return new Ba(iBinder);
    }

    public final void disconnect() {
        a.a("disconnect", new Object[0]);
        this.b = null;
        this.c = null;
        try {
            ((ya) getService()).disconnect();
        } catch (RemoteException | IllegalStateException unused) {
        } finally {
            super.disconnect();
        }
    }

    public final int getMinApkVersion() {
        return GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;
    }

    /* access modifiers changed from: protected */
    public final String getServiceDescriptor() {
        return "com.google.android.gms.cast.remote_display.ICastRemoteDisplayService";
    }

    /* access modifiers changed from: protected */
    public final String getStartServiceAction() {
        return "com.google.android.gms.cast.remote_display.service.START";
    }
}
