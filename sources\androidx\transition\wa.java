package androidx.transition;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.util.Log;
import android.util.Property;
import android.view.View;
import java.lang.reflect.Field;

/* compiled from: ViewUtils */
class wa {
    private static final Aa a;
    private static Field b;
    private static boolean c;
    static final Property<View, Float> d = new ua(Float.class, "translationAlpha");
    static final Property<View, Rect> e = new va(Rect.class, "clipBounds");

    static {
        int i = VERSION.SDK_INT;
        if (i >= 22) {
            a = new za();
        } else if (i >= 21) {
            a = new ya();
        } else if (i >= 19) {
            a = new xa();
        } else {
            a = new Aa();
        }
    }

    static void a(View view, float f) {
        a.a(view, f);
    }

    static ta b(View view) {
        if (VERSION.SDK_INT >= 18) {
            return new sa(view);
        }
        return ra.c(view);
    }

    static float c(View view) {
        return a.b(view);
    }

    static Fa d(View view) {
        if (VERSION.SDK_INT >= 18) {
            return new Ea(view);
        }
        return new Da(view.getWindowToken());
    }

    static void e(View view) {
        a.c(view);
    }

    static void a(View view) {
        a.a(view);
    }

    static void c(View view, Matrix matrix) {
        a.c(view, matrix);
    }

    static void a(View view, int i) {
        a();
        Field field = b;
        if (field != null) {
            try {
                b.setInt(view, i | (field.getInt(view) & -13));
            } catch (IllegalAccessException unused) {
            }
        }
    }

    static void b(View view, Matrix matrix) {
        a.b(view, matrix);
    }

    static void a(View view, Matrix matrix) {
        a.a(view, matrix);
    }

    static void a(View view, int i, int i2, int i3, int i4) {
        a.a(view, i, i2, i3, i4);
    }

    private static void a() {
        if (!c) {
            try {
                b = View.class.getDeclaredField("mViewFlags");
                b.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i("ViewUtils", "fetchViewFlagsField: ");
            }
            c = true;
        }
    }
}
