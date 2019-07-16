package androidx.mediarouter.media;

import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.MediaSessionCompat.OnActiveChangeListener;

/* compiled from: MediaRouter */
class i implements OnActiveChangeListener {
    final /* synthetic */ d a;

    i(d dVar) {
        this.a = dVar;
    }

    public void onActiveChanged() {
        MediaSessionCompat mediaSessionCompat = this.a.u;
        if (mediaSessionCompat == null) {
            return;
        }
        if (mediaSessionCompat.isActive()) {
            d dVar = this.a;
            dVar.a(dVar.u.getRemoteControlClient());
            return;
        }
        d dVar2 = this.a;
        dVar2.b(dVar2.u.getRemoteControlClient());
    }
}
