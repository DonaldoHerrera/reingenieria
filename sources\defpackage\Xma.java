package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.support.v4.media.session.MediaSessionCompat;
import androidx.media.session.MediaButtonReceiver;

/* renamed from: Xma reason: default package */
/* compiled from: MediaSessionWrapper.kt */
public class Xma {
    public MediaSessionCompat a(Context context, String str) {
        C7471uYa.b(context, "context");
        C7471uYa.b(str, "tag");
        return new MediaSessionCompat(context, str, new ComponentName(context, MediaButtonReceiver.class), null);
    }

    public void a(MediaSessionCompat mediaSessionCompat, Intent intent) {
        C7471uYa.b(mediaSessionCompat, "mediaSession");
        C7471uYa.b(intent, "intent");
        MediaButtonReceiver.a(mediaSessionCompat, intent);
    }
}
