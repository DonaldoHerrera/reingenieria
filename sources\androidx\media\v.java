package androidx.media;

import android.content.Context;
import android.content.Intent;
import android.media.browse.MediaBrowser.MediaItem;
import android.media.session.MediaSession.Token;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.service.media.MediaBrowserService;
import android.service.media.MediaBrowserService.BrowserRoot;
import android.service.media.MediaBrowserService.Result;
import android.support.v4.media.session.MediaSessionCompat;
import java.util.ArrayList;
import java.util.List;

/* compiled from: MediaBrowserServiceCompatApi21 */
class v {

    /* compiled from: MediaBrowserServiceCompatApi21 */
    static class a {
        final String a;
        final Bundle b;

        a(String str, Bundle bundle) {
            this.a = str;
            this.b = bundle;
        }
    }

    /* compiled from: MediaBrowserServiceCompatApi21 */
    static class b extends MediaBrowserService {
        final d a;

        b(Context context, d dVar) {
            attachBaseContext(context);
            this.a = dVar;
        }

        public BrowserRoot onGetRoot(String str, int i, Bundle bundle) {
            MediaSessionCompat.ensureClassLoader(bundle);
            a a2 = this.a.a(str, i, bundle == null ? null : new Bundle(bundle));
            if (a2 == null) {
                return null;
            }
            return new BrowserRoot(a2.a, a2.b);
        }

        public void onLoadChildren(String str, Result<List<MediaItem>> result) {
            this.a.b(str, new c(result));
        }
    }

    /* compiled from: MediaBrowserServiceCompatApi21 */
    static class c<T> {
        Result a;

        c(Result result) {
            this.a = result;
        }

        public void a(T t) {
            if (t instanceof List) {
                this.a.sendResult(a((List) t));
            } else if (t instanceof Parcel) {
                Parcel parcel = (Parcel) t;
                parcel.setDataPosition(0);
                this.a.sendResult(MediaItem.CREATOR.createFromParcel(parcel));
                parcel.recycle();
            } else {
                this.a.sendResult(null);
            }
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

    /* compiled from: MediaBrowserServiceCompatApi21 */
    public interface d {
        a a(String str, int i, Bundle bundle);

        void b(String str, c<List<Parcel>> cVar);
    }

    public static Object a(Context context, d dVar) {
        return new b(context, dVar);
    }

    public static void a(Object obj) {
        ((MediaBrowserService) obj).onCreate();
    }

    public static IBinder a(Object obj, Intent intent) {
        return ((MediaBrowserService) obj).onBind(intent);
    }

    public static void a(Object obj, Object obj2) {
        ((MediaBrowserService) obj).setSessionToken((Token) obj2);
    }
}
