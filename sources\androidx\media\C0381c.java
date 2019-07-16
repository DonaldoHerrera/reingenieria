package androidx.media;

import android.os.Bundle;
import android.os.RemoteException;
import android.support.v4.media.MediaBrowserCompat.MediaItem;
import android.util.Log;
import androidx.media.MediaBrowserServiceCompat.i;
import java.util.List;

/* renamed from: androidx.media.c reason: case insensitive filesystem */
/* compiled from: MediaBrowserServiceCompat */
class C0381c extends i<List<MediaItem>> {
    final /* synthetic */ b f;
    final /* synthetic */ String g;
    final /* synthetic */ Bundle h;
    final /* synthetic */ Bundle i;
    final /* synthetic */ MediaBrowserServiceCompat j;

    C0381c(MediaBrowserServiceCompat mediaBrowserServiceCompat, Object obj, b bVar, String str, Bundle bundle, Bundle bundle2) {
        this.j = mediaBrowserServiceCompat;
        this.f = bVar;
        this.g = str;
        this.h = bundle;
        this.i = bundle2;
        super(obj);
    }

    /* access modifiers changed from: 0000 */
    public void a(List<MediaItem> list) {
        String str = "MBServiceCompat";
        if (this.j.c.get(this.f.f.asBinder()) != this.f) {
            if (MediaBrowserServiceCompat.a) {
                StringBuilder sb = new StringBuilder();
                sb.append("Not sending onLoadChildren result for connection that has been disconnected. pkg=");
                sb.append(this.f.a);
                sb.append(" id=");
                sb.append(this.g);
                Log.d(str, sb.toString());
            }
            return;
        }
        if ((b() & 1) != 0) {
            list = this.j.a(list, this.h);
        }
        try {
            this.f.f.a(this.g, list, this.h, this.i);
        } catch (RemoteException unused) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Calling onLoadChildren() failed for id=");
            sb2.append(this.g);
            sb2.append(" package=");
            sb2.append(this.f.a);
            Log.w(str, sb2.toString());
        }
    }
}
