package androidx.media;

import android.os.Parcel;
import android.support.v4.media.MediaBrowserCompat.MediaItem;
import androidx.media.MediaBrowserServiceCompat.i;

/* compiled from: MediaBrowserServiceCompat */
class j extends i<MediaItem> {
    final /* synthetic */ c f;
    final /* synthetic */ e g;

    j(e eVar, Object obj, c cVar) {
        this.g = eVar;
        this.f = cVar;
        super(obj);
    }

    /* access modifiers changed from: 0000 */
    public void a(MediaItem mediaItem) {
        if (mediaItem == null) {
            this.f.a(null);
            return;
        }
        Parcel obtain = Parcel.obtain();
        mediaItem.writeToParcel(obtain, 0);
        this.f.a(obtain);
    }

    public void a() {
        this.f.a();
    }
}
