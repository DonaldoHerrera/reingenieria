package androidx.media;

import android.os.Parcel;
import android.support.v4.media.MediaBrowserCompat.MediaItem;
import androidx.media.MediaBrowserServiceCompat.i;
import java.util.ArrayList;
import java.util.List;

/* compiled from: MediaBrowserServiceCompat */
class k extends i<List<MediaItem>> {
    final /* synthetic */ b f;
    final /* synthetic */ f g;

    k(f fVar, Object obj, b bVar) {
        this.g = fVar;
        this.f = bVar;
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
        this.f.a(arrayList, b());
    }

    public void a() {
        this.f.a();
    }
}
