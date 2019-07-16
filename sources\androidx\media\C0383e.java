package androidx.media;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.media.MediaBrowserCompat.MediaItem;
import android.support.v4.os.ResultReceiver;
import androidx.media.MediaBrowserServiceCompat.i;
import java.util.List;

/* renamed from: androidx.media.e reason: case insensitive filesystem */
/* compiled from: MediaBrowserServiceCompat */
class C0383e extends i<List<MediaItem>> {
    final /* synthetic */ ResultReceiver f;
    final /* synthetic */ MediaBrowserServiceCompat g;

    C0383e(MediaBrowserServiceCompat mediaBrowserServiceCompat, Object obj, ResultReceiver resultReceiver) {
        this.g = mediaBrowserServiceCompat;
        this.f = resultReceiver;
        super(obj);
    }

    /* access modifiers changed from: 0000 */
    public void a(List<MediaItem> list) {
        if ((b() & 4) != 0 || list == null) {
            this.f.send(-1, null);
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putParcelableArray("search_results", (Parcelable[]) list.toArray(new MediaItem[0]));
        this.f.send(0, bundle);
    }
}
