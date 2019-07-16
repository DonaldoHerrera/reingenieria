package androidx.media;

import android.os.Bundle;
import android.support.v4.media.MediaBrowserCompat.MediaItem;
import android.support.v4.os.ResultReceiver;
import androidx.media.MediaBrowserServiceCompat.i;

/* renamed from: androidx.media.d reason: case insensitive filesystem */
/* compiled from: MediaBrowserServiceCompat */
class C0382d extends i<MediaItem> {
    final /* synthetic */ ResultReceiver f;
    final /* synthetic */ MediaBrowserServiceCompat g;

    C0382d(MediaBrowserServiceCompat mediaBrowserServiceCompat, Object obj, ResultReceiver resultReceiver) {
        this.g = mediaBrowserServiceCompat;
        this.f = resultReceiver;
        super(obj);
    }

    /* access modifiers changed from: 0000 */
    public void a(MediaItem mediaItem) {
        if ((b() & 2) != 0) {
            this.f.send(-1, null);
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putParcelable("media_item", mediaItem);
        this.f.send(0, bundle);
    }
}
