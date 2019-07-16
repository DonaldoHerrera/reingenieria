package androidx.mediarouter.media;

import android.media.MediaRouter;
import android.media.MediaRouter.Callback;
import android.media.MediaRouter.RouteInfo;
import android.media.MediaRouter.UserRouteInfo;

/* compiled from: MediaRouterJellybeanMr2 */
final class p {

    /* compiled from: MediaRouterJellybeanMr2 */
    public static final class a {
        public static CharSequence a(Object obj) {
            return ((RouteInfo) obj).getDescription();
        }

        public static boolean b(Object obj) {
            return ((RouteInfo) obj).isConnecting();
        }
    }

    /* compiled from: MediaRouterJellybeanMr2 */
    public static final class b {
        public static void a(Object obj, CharSequence charSequence) {
            ((UserRouteInfo) obj).setDescription(charSequence);
        }
    }

    public static Object a(Object obj) {
        return ((MediaRouter) obj).getDefaultRoute();
    }

    public static void a(Object obj, int i, Object obj2, int i2) {
        ((MediaRouter) obj).addCallback(i, (Callback) obj2, i2);
    }
}
