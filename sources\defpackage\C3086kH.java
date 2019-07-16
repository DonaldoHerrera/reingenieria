package defpackage;

import android.os.Build.VERSION;
import android.view.View;
import android.view.ViewParent;

/* renamed from: kH reason: default package and case insensitive filesystem */
public final class C3086kH {
    public static float a(View view) {
        if (VERSION.SDK_INT >= 21) {
            return view.getZ();
        }
        return 0.0f;
    }

    public static View b(View view) {
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            return (View) parent;
        }
        return null;
    }

    public static boolean c(View view) {
        if ((VERSION.SDK_INT >= 19 && !view.isAttachedToWindow()) || !view.isShown()) {
            return false;
        }
        while (view != null) {
            if (view.getAlpha() == 0.0f) {
                return false;
            }
            view = b(view);
        }
        return true;
    }

    public static boolean d(View view) {
        return (VERSION.SDK_INT < 19 || view.isAttachedToWindow()) && view.getVisibility() == 0 && view.getAlpha() != 0.0f;
    }
}
