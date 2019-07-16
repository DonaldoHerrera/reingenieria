package androidx.transition;

import android.animation.LayoutTransition;
import android.util.Log;
import android.view.ViewGroup;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: ViewGroupUtilsApi14 */
class pa {
    private static LayoutTransition a;
    private static Field b;
    private static boolean c;
    private static Method d;
    private static boolean e;

    /* JADX WARNING: Removed duplicated region for block: B:34:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    static void a(ViewGroup viewGroup, boolean z) {
        LayoutTransition layoutTransition;
        boolean z2 = false;
        if (a == null) {
            a = new oa();
            a.setAnimator(2, null);
            a.setAnimator(0, null);
            a.setAnimator(1, null);
            a.setAnimator(3, null);
            a.setAnimator(4, null);
        }
        if (z) {
            LayoutTransition layoutTransition2 = viewGroup.getLayoutTransition();
            if (layoutTransition2 != null) {
                if (layoutTransition2.isRunning()) {
                    a(layoutTransition2);
                }
                if (layoutTransition2 != a) {
                    viewGroup.setTag(M.transition_layout_save, layoutTransition2);
                }
            }
            viewGroup.setLayoutTransition(a);
            return;
        }
        viewGroup.setLayoutTransition(null);
        String str = "ViewGroupUtilsApi14";
        if (!c) {
            try {
                b = ViewGroup.class.getDeclaredField("mLayoutSuppressed");
                b.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i(str, "Failed to access mLayoutSuppressed field by reflection");
            }
            c = true;
        }
        Field field = b;
        if (field != null) {
            try {
                boolean z3 = field.getBoolean(viewGroup);
                if (z3) {
                    try {
                        b.setBoolean(viewGroup, false);
                    } catch (IllegalAccessException unused2) {
                        z2 = z3;
                    }
                }
                z2 = z3;
            } catch (IllegalAccessException unused3) {
                Log.i(str, "Failed to get mLayoutSuppressed field by reflection");
                if (z2) {
                }
                layoutTransition = (LayoutTransition) viewGroup.getTag(M.transition_layout_save);
                if (layoutTransition == null) {
                }
            }
        }
        if (z2) {
            viewGroup.requestLayout();
        }
        layoutTransition = (LayoutTransition) viewGroup.getTag(M.transition_layout_save);
        if (layoutTransition == null) {
            viewGroup.setTag(M.transition_layout_save, null);
            viewGroup.setLayoutTransition(layoutTransition);
        }
    }

    private static void a(LayoutTransition layoutTransition) {
        String str = "Failed to access cancel method by reflection";
        String str2 = "ViewGroupUtilsApi14";
        if (!e) {
            try {
                d = LayoutTransition.class.getDeclaredMethod("cancel", new Class[0]);
                d.setAccessible(true);
            } catch (NoSuchMethodException unused) {
                Log.i(str2, str);
            }
            e = true;
        }
        Method method = d;
        if (method != null) {
            try {
                method.invoke(layoutTransition, new Object[0]);
            } catch (IllegalAccessException unused2) {
                Log.i(str2, str);
            } catch (InvocationTargetException unused3) {
                Log.i(str2, "Failed to invoke cancel method by reflection");
            }
        }
    }
}
