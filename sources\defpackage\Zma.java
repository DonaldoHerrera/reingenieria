package defpackage;

import android.app.Notification;
import android.support.v4.media.session.MediaControllerCompat;

/* renamed from: Zma reason: default package */
/* compiled from: MediaNotificationProvider.kt */
public final class Zma implements Wma {
    public static final Zma a = new Zma();

    private Zma() {
    }

    public void a() {
        a.a(this);
    }

    public void b(MediaControllerCompat mediaControllerCompat) {
        C7471uYa.b(mediaControllerCompat, "mediaController");
        a.a(this, mediaControllerCompat);
    }

    public Notification a(MediaControllerCompat mediaControllerCompat) {
        C7471uYa.b(mediaControllerCompat, "mediaController");
        return new Notification();
    }

    public b b() {
        return new b(0, null, 2, null);
    }
}
