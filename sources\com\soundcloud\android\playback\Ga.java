package com.soundcloud.android.playback;

import android.content.Context;
import android.os.RemoteException;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.MediaBrowserCompat.ConnectionCallback;
import android.support.v4.media.session.MediaControllerCompat;
import android.support.v4.media.session.MediaSessionCompat.Token;

/* compiled from: MediaController.kt */
public final class Ga extends ConnectionCallback {
    final /* synthetic */ Fa a;
    final /* synthetic */ Context b;

    Ga(Fa fa, Context context) {
        this.a = fa;
        this.b = context;
    }

    public void onConnected() {
        super.onConnected();
        String str = "MediaController";
        SDb.a(str).d("MediaBrowser connected", new Object[0]);
        MediaBrowserCompat a2 = this.a.c;
        if (a2 != null) {
            Token sessionToken = a2.getSessionToken();
            C7471uYa.a((Object) sessionToken, "requireNotNull(mediaBrowser).sessionToken");
            try {
                Fa fa = this.a;
                MediaControllerCompat mediaControllerCompat = new MediaControllerCompat(this.b, sessionToken);
                mediaControllerCompat.registerCallback(this.a.a());
                this.a.b.onSuccess(mediaControllerCompat.getTransportControls());
                fa.d = mediaControllerCompat;
            } catch (RemoteException e) {
                SDb.a(str).a((Throwable) e, "RemoteException when creating MediaController", new Object[0]);
                MediaBrowserCompat a3 = this.a.c;
                if (a3 != null) {
                    a3.disconnect();
                }
                this.a.b.a((Throwable) e);
            }
        } else {
            throw new IllegalArgumentException("Required value was null.");
        }
    }

    public void onConnectionFailed() {
        super.onConnectionFailed();
        SDb.a("MediaController").b("onConnectionFailed", new Object[0]);
    }

    public void onConnectionSuspended() {
        super.onConnectionSuspended();
        SDb.a("MediaController").d("onConnectionSuspended", new Object[0]);
    }
}
