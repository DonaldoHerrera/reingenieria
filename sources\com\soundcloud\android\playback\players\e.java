package com.soundcloud.android.playback.players;

import android.os.RemoteException;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaControllerCompat;
import android.support.v4.media.session.MediaControllerCompat.Callback;
import android.support.v4.media.session.PlaybackStateCompat;
import com.soundcloud.android.playback.core.d;

/* compiled from: MediaNotificationManager.kt */
public final class e extends Callback {
    final /* synthetic */ d a;

    e(d dVar) {
        this.a = dVar;
    }

    public void onMetadataChanged(MediaMetadataCompat mediaMetadataCompat) {
        super.onMetadataChanged(mediaMetadataCompat);
        d a2 = this.a.j;
        StringBuilder sb = new StringBuilder();
        sb.append("onMetadataChanged(): ");
        sb.append(mediaMetadataCompat);
        String sb2 = sb.toString();
        String str = "MediaNotificationManager";
        a2.b(str, sb2);
        MediaControllerCompat b = this.a.e;
        PlaybackStateCompat playbackState = b != null ? b.getPlaybackState() : null;
        if (playbackState == null) {
            this.a.j.b(str, "Ignored the metadata update since playbackState is null");
        } else if (playbackState.getState() != 0) {
            this.a.f();
        } else {
            this.a.j.b(str, "Ignored the metadata update since playbackState.state is none");
        }
    }

    public void onPlaybackStateChanged(PlaybackStateCompat playbackStateCompat) {
        super.onPlaybackStateChanged(playbackStateCompat);
        d a2 = this.a.j;
        StringBuilder sb = new StringBuilder();
        sb.append("onPlaybackStateChanged(): ");
        sb.append(playbackStateCompat);
        String str = "MediaNotificationManager";
        a2.b(str, sb.toString());
        if (playbackStateCompat != null) {
            int state = playbackStateCompat.getState();
            if (state == 0 || state == 1) {
                this.a.e();
                return;
            }
            if (state != 2) {
                if (state == 3 || state == 6) {
                    if (this.a.g.h()) {
                        this.a.f();
                        return;
                    } else {
                        this.a.d();
                        return;
                    }
                } else if (state != 7) {
                    this.a.f();
                    return;
                }
            }
            this.a.f();
            this.a.g.a(false);
            return;
        }
        this.a.j.b(str, "Ignored the playback state update since it is null");
    }

    public void onSessionDestroyed() {
        super.onSessionDestroyed();
        String str = "MediaNotificationManager";
        this.a.j.b(str, "Session was destroyed, resetting to the new session token");
        try {
            this.a.g();
        } catch (RemoteException e) {
            d a2 = this.a.j;
            StringBuilder sb = new StringBuilder();
            sb.append("Could not connect media controller: ");
            sb.append(e.getMessage());
            a2.c(str, sb.toString());
        }
    }
}
