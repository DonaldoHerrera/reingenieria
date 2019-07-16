package androidx.mediarouter.media;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.media.MediaRouter;
import android.media.MediaRouter.RouteInfo;
import android.os.Build.VERSION;
import android.os.Handler;
import android.util.Log;
import android.view.Display;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: MediaRouterJellybeanMr1 */
final class o {

    /* compiled from: MediaRouterJellybeanMr1 */
    public static final class a implements Runnable {
        private final DisplayManager a;
        private final Handler b;
        private Method c;
        private boolean d;

        public a(Context context, Handler handler) {
            if (VERSION.SDK_INT == 17) {
                this.a = (DisplayManager) context.getSystemService("display");
                this.b = handler;
                try {
                    this.c = DisplayManager.class.getMethod("scanWifiDisplays", new Class[0]);
                } catch (NoSuchMethodException unused) {
                }
            } else {
                throw new UnsupportedOperationException();
            }
        }

        public void a(int i) {
            if ((i & 2) != 0) {
                if (this.d) {
                    return;
                }
                if (this.c != null) {
                    this.d = true;
                    this.b.post(this);
                    return;
                }
                Log.w("MediaRouterJellybeanMr1", "Cannot scan for wifi displays because the DisplayManager.scanWifiDisplays() method is not available on this device.");
            } else if (this.d) {
                this.d = false;
                this.b.removeCallbacks(this);
            }
        }

        public void run() {
            String str = "Cannot scan for wifi displays.";
            String str2 = "MediaRouterJellybeanMr1";
            if (this.d) {
                try {
                    this.c.invoke(this.a, new Object[0]);
                } catch (IllegalAccessException e) {
                    Log.w(str2, str, e);
                } catch (InvocationTargetException e2) {
                    Log.w(str2, str, e2);
                }
                this.b.postDelayed(this, 15000);
            }
        }
    }

    /* compiled from: MediaRouterJellybeanMr1 */
    public interface b extends androidx.mediarouter.media.n.a {
        void c(Object obj);
    }

    /* compiled from: MediaRouterJellybeanMr1 */
    static class c<T extends b> extends b<T> {
        public c(T t) {
            super(t);
        }

        public void onRoutePresentationDisplayChanged(MediaRouter mediaRouter, RouteInfo routeInfo) {
            ((b) this.a).c(routeInfo);
        }
    }

    /* compiled from: MediaRouterJellybeanMr1 */
    public static final class d {
        private Method a;
        private int b;

        public d() {
            if (VERSION.SDK_INT == 17) {
                try {
                    this.b = RouteInfo.class.getField("STATUS_CONNECTING").getInt(null);
                    this.a = RouteInfo.class.getMethod("getStatusCode", new Class[0]);
                } catch (IllegalAccessException | NoSuchFieldException | NoSuchMethodException unused) {
                }
            } else {
                throw new UnsupportedOperationException();
            }
        }

        public boolean a(Object obj) {
            RouteInfo routeInfo = (RouteInfo) obj;
            Method method = this.a;
            if (method == null) {
                return false;
            }
            try {
                if (((Integer) method.invoke(routeInfo, new Object[0])).intValue() == this.b) {
                    return true;
                }
                return false;
            } catch (IllegalAccessException | InvocationTargetException unused) {
                return false;
            }
        }
    }

    /* compiled from: MediaRouterJellybeanMr1 */
    public static final class e {
        public static Display a(Object obj) {
            try {
                return ((RouteInfo) obj).getPresentationDisplay();
            } catch (NoSuchMethodError e) {
                Log.w("MediaRouterJellybeanMr1", "Cannot get presentation display for the route.", e);
                return null;
            }
        }

        public static boolean b(Object obj) {
            return ((RouteInfo) obj).isEnabled();
        }
    }

    public static Object a(b bVar) {
        return new c(bVar);
    }
}
