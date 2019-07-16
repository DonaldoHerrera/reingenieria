package androidx.media;

import android.content.Context;
import android.media.browse.MediaBrowser.MediaItem;
import android.os.Parcel;
import android.service.media.MediaBrowserService.Result;
import androidx.media.v.d;

/* compiled from: MediaBrowserServiceCompatApi23 */
class w {

    /* compiled from: MediaBrowserServiceCompatApi23 */
    static class a extends b {
        a(Context context, b bVar) {
            super(context, bVar);
        }

        public void onLoadItem(String str, Result<MediaItem> result) {
            ((b) this.a).a(str, new c(result));
        }
    }

    /* compiled from: MediaBrowserServiceCompatApi23 */
    public interface b extends d {
        void a(String str, c<Parcel> cVar);
    }

    public static Object a(Context context, b bVar) {
        return new a(context, bVar);
    }
}
