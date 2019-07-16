package androidx.transition;

import android.graphics.Matrix;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: GhostViewApi21 */
class C implements D {
    private static Class<?> a;
    private static boolean b;
    private static Method c;
    private static boolean d;
    private static Method e;
    private static boolean f;
    private final View g;

    private C(View view) {
        this.g = view;
    }

    static D a(View view, ViewGroup viewGroup, Matrix matrix) {
        a();
        Method method = c;
        if (method != null) {
            try {
                return new C((View) method.invoke(null, new Object[]{view, viewGroup, matrix}));
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e2) {
                throw new RuntimeException(e2.getCause());
            }
        }
        return null;
    }

    private static void b() {
        if (!b) {
            try {
                a = Class.forName("android.view.GhostView");
            } catch (ClassNotFoundException e2) {
                Log.i("GhostViewApi21", "Failed to retrieve GhostView class", e2);
            }
            b = true;
        }
    }

    private static void c() {
        if (!f) {
            try {
                b();
                e = a.getDeclaredMethod("removeGhost", new Class[]{View.class});
                e.setAccessible(true);
            } catch (NoSuchMethodException e2) {
                Log.i("GhostViewApi21", "Failed to retrieve removeGhost method", e2);
            }
            f = true;
        }
    }

    public void a(ViewGroup viewGroup, View view) {
    }

    public void setVisibility(int i) {
        this.g.setVisibility(i);
    }

    static void a(View view) {
        c();
        Method method = e;
        if (method != null) {
            try {
                method.invoke(null, new Object[]{view});
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e2) {
                throw new RuntimeException(e2.getCause());
            }
        }
    }

    private static void a() {
        if (!d) {
            try {
                b();
                c = a.getDeclaredMethod("addGhost", new Class[]{View.class, ViewGroup.class, Matrix.class});
                c.setAccessible(true);
            } catch (NoSuchMethodException e2) {
                Log.i("GhostViewApi21", "Failed to retrieve addGhost method", e2);
            }
            d = true;
        }
    }
}
