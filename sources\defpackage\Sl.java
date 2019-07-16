package defpackage;

import android.os.Build.VERSION;
import android.view.View;
import android.view.ViewManager;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;

/* renamed from: Sl reason: default package */
/* compiled from: ViewUtil */
class Sl {
    private static boolean a(View view) {
        return C1778vc.B(view) && view.getWidth() > 0 && view.getHeight() > 0;
    }

    static void a(View view, Runnable runnable) {
        if (a(view)) {
            runnable.run();
            return;
        }
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        viewTreeObserver.addOnGlobalLayoutListener(new Rl(viewTreeObserver, view, runnable));
    }

    static void a(ViewTreeObserver viewTreeObserver, OnGlobalLayoutListener onGlobalLayoutListener) {
        if (VERSION.SDK_INT >= 16) {
            viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
        } else {
            viewTreeObserver.removeGlobalOnLayoutListener(onGlobalLayoutListener);
        }
    }

    static void a(ViewManager viewManager, View view) {
        if (viewManager != null && view != null) {
            try {
                viewManager.removeView(view);
            } catch (Exception unused) {
            }
        }
    }
}
