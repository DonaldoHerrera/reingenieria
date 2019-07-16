package androidx.media;

import android.content.Context;
import android.media.browse.MediaBrowser.MediaItem;
import android.os.Bundle;
import android.os.Parcel;
import android.service.media.MediaBrowserService.Result;
import android.support.v4.media.session.MediaSessionCompat;
import android.util.Log;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/* compiled from: MediaBrowserServiceCompatApi26 */
class x {
    static Field a;

    /* compiled from: MediaBrowserServiceCompatApi26 */
    static class a extends a {
        a(Context context, c cVar) {
            super(context, cVar);
        }

        public void onLoadChildren(String str, Result<List<MediaItem>> result, Bundle bundle) {
            MediaSessionCompat.ensureClassLoader(bundle);
            ((c) this.a).a(str, new b(result), bundle);
        }
    }

    /* compiled from: MediaBrowserServiceCompatApi26 */
    static class b {
        Result a;

        b(Result result) {
            this.a = result;
        }

        public void a(List<Parcel> list, int i) {
            try {
                x.a.setInt(this.a, i);
            } catch (IllegalAccessException e) {
                Log.w("MBSCompatApi26", e);
            }
            this.a.sendResult(a(list));
        }

        public void a() {
            this.a.detach();
        }

        /* access modifiers changed from: 0000 */
        public List<MediaItem> a(List<Parcel> list) {
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (Parcel parcel : list) {
                parcel.setDataPosition(0);
                arrayList.add(MediaItem.CREATOR.createFromParcel(parcel));
                parcel.recycle();
            }
            return arrayList;
        }
    }

    /* compiled from: MediaBrowserServiceCompatApi26 */
    public interface c extends androidx.media.w.b {
        void a(String str, b bVar, Bundle bundle);
    }

    static {
        try {
            a = Result.class.getDeclaredField("mFlags");
            a.setAccessible(true);
        } catch (NoSuchFieldException e) {
            Log.w("MBSCompatApi26", e);
        }
    }

    public static Object a(Context context, c cVar) {
        return new a(context, cVar);
    }
}
