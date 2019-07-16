package androidx.media;

import android.os.Parcel;
import android.support.v4.media.MediaBrowserCompat.MediaItem;
import androidx.media.MediaBrowserServiceCompat.i;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.media.i reason: case insensitive filesystem */
/* compiled from: MediaBrowserServiceCompat */
class C0387i extends i<List<MediaItem>> {
    final /* synthetic */ c f;
    final /* synthetic */ d g;

    C0387i(d dVar, Object obj, c cVar) {
        this.g = dVar;
        this.f = cVar;
        super(obj);
    }

    /* access modifiers changed from: 0000 */
    public void a(List<MediaItem> list) {
        ArrayList arrayList;
        if (list != null) {
            arrayList = new ArrayList();
            for (MediaItem mediaItem : list) {
                Parcel obtain = Parcel.obtain();
                mediaItem.writeToParcel(obtain, 0);
                arrayList.add(obtain);
            }
        } else {
            arrayList = null;
        }
        this.f.a(arrayList);
    }

    public void a() {
        this.f.a();
    }
}
