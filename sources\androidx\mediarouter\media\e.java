package androidx.mediarouter.media;

import android.os.Messenger;

/* compiled from: MediaRouteProviderProtocol */
abstract class e {
    public static boolean a(Messenger messenger) {
        if (messenger == null) {
            return false;
        }
        try {
            return messenger.getBinder() != null;
        } catch (NullPointerException unused) {
            return false;
        }
    }
}
