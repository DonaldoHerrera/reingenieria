package androidx.media;

import android.os.Bundle;
import android.support.v4.media.MediaBrowserCompat;

/* renamed from: androidx.media.b reason: case insensitive filesystem */
/* compiled from: MediaBrowserCompatUtils */
public class C0380b {
    public static boolean a(Bundle bundle, Bundle bundle2) {
        boolean z = true;
        if (bundle == bundle2) {
            return true;
        }
        String str = MediaBrowserCompat.EXTRA_PAGE_SIZE;
        String str2 = MediaBrowserCompat.EXTRA_PAGE;
        if (bundle == null) {
            if (!(bundle2.getInt(str2, -1) == -1 && bundle2.getInt(str, -1) == -1)) {
                z = false;
            }
            return z;
        } else if (bundle2 == null) {
            if (!(bundle.getInt(str2, -1) == -1 && bundle.getInt(str, -1) == -1)) {
                z = false;
            }
            return z;
        } else {
            if (!(bundle.getInt(str2, -1) == bundle2.getInt(str2, -1) && bundle.getInt(str, -1) == bundle2.getInt(str, -1))) {
                z = false;
            }
            return z;
        }
    }
}
