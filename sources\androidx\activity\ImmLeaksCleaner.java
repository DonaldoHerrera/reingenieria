package androidx.activity;

import android.app.Activity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.e;
import androidx.lifecycle.f.a;
import androidx.lifecycle.h;
import java.lang.reflect.Field;

final class ImmLeaksCleaner implements e {
    private static int a;
    private static Field b;
    private static Field c;
    private static Field d;
    private Activity e;

    ImmLeaksCleaner(Activity activity) {
        this.e = activity;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:29|30|31) */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0040, code lost:
        r3.isActive();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0045, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0044 */
    public void a(h hVar, a aVar) {
        if (aVar == a.ON_DESTROY) {
            if (a == 0) {
                a();
            }
            if (a == 1) {
                InputMethodManager inputMethodManager = (InputMethodManager) this.e.getSystemService("input_method");
                try {
                    Object obj = b.get(inputMethodManager);
                    if (obj != null) {
                        synchronized (obj) {
                            try {
                                View view = (View) c.get(inputMethodManager);
                                if (view != null) {
                                    if (!view.isAttachedToWindow()) {
                                        d.set(inputMethodManager, null);
                                    }
                                }
                            } catch (IllegalAccessException unused) {
                            } catch (ClassCastException unused2) {
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                } catch (IllegalAccessException unused3) {
                }
            }
        }
    }

    private static void a() {
        try {
            a = 2;
            c = InputMethodManager.class.getDeclaredField("mServedView");
            c.setAccessible(true);
            d = InputMethodManager.class.getDeclaredField("mNextServedView");
            d.setAccessible(true);
            b = InputMethodManager.class.getDeclaredField("mH");
            b.setAccessible(true);
            a = 1;
        } catch (NoSuchFieldException unused) {
        }
    }
}
