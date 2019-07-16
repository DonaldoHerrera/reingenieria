package androidx.mediarouter.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.View;

/* compiled from: MediaRouterThemeHelper */
final class E {
    static Drawable a;
    static Drawable b;
    static Drawable c;
    static Drawable d;

    static Context a(Context context) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i(context));
        int b2 = b(contextThemeWrapper, C1659rd.mediaRouteTheme);
        return b2 != 0 ? new ContextThemeWrapper(contextThemeWrapper, b2) : contextThemeWrapper;
    }

    static int b(Context context) {
        int b2 = b(context, C1659rd.mediaRouteTheme);
        return b2 == 0 ? i(context) : b2;
    }

    private static Drawable c(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{C1659rd.mediaRouteDefaultIconDrawable, C1659rd.mediaRouteTvIconDrawable, C1659rd.mediaRouteSpeakerIconDrawable, C1659rd.mediaRouteSpeakerGroupIconDrawable});
        Drawable drawable = obtainStyledAttributes.getDrawable(i);
        obtainStyledAttributes.recycle();
        return drawable;
    }

    static Drawable d(Context context) {
        if (a == null) {
            a = c(context, 0);
        }
        return a;
    }

    static float e(Context context) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(16842803, typedValue, true)) {
            return typedValue.getFloat();
        }
        return 0.5f;
    }

    static Drawable f(Context context) {
        if (c == null) {
            c = c(context, 2);
        }
        return c;
    }

    static Drawable g(Context context) {
        if (d == null) {
            d = c(context, 3);
        }
        return d;
    }

    static Drawable h(Context context) {
        if (b == null) {
            b = c(context, 1);
        }
        return b;
    }

    private static int i(Context context) {
        if (j(context)) {
            if (a(context, 0) == -570425344) {
                return C1899zd.Theme_MediaRouter_Light;
            }
            return C1899zd.Theme_MediaRouter_Light_DarkControlPanel;
        } else if (a(context, 0) == -570425344) {
            return C1899zd.Theme_MediaRouter_LightControlPanel;
        } else {
            return C1899zd.Theme_MediaRouter;
        }
    }

    private static boolean j(Context context) {
        TypedValue typedValue = new TypedValue();
        return context.getTheme().resolveAttribute(C0294a.isLightTheme, typedValue, true) && typedValue.data != 0;
    }

    static int b(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i, typedValue, true)) {
            return typedValue.resourceId;
        }
        return 0;
    }

    static Context a(Context context, int i, boolean z) {
        if (i == 0) {
            i = b(context, !z ? C0294a.dialogTheme : C0294a.alertDialogTheme);
        }
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i);
        return b(contextThemeWrapper, C1659rd.mediaRouteTheme) != 0 ? new ContextThemeWrapper(contextThemeWrapper, i(contextThemeWrapper)) : contextThemeWrapper;
    }

    static int c(Context context) {
        int a2 = a(context, 0, C0294a.colorPrimary);
        return C0301ab.a(a2, a(context, 0, 16842801)) < 3.0d ? a(context, 0, C0294a.colorAccent) : a2;
    }

    static int a(Context context, int i) {
        if (C0301ab.a(-1, a(context, i, C0294a.colorPrimary)) >= 3.0d) {
            return -1;
        }
        return -570425344;
    }

    static void a(Context context, View view, View view2, boolean z) {
        int i;
        int a2 = a(context, 0, C0294a.colorPrimary);
        int a3 = a(context, 0, C0294a.colorPrimaryDark);
        if (!z || a(context, 0) != -570425344) {
            i = a2;
            a2 = a3;
        } else {
            i = -1;
        }
        view.setBackgroundColor(i);
        view2.setBackgroundColor(a2);
        view.setTag(Integer.valueOf(i));
        view2.setTag(Integer.valueOf(a2));
    }

    static void a(Context context, MediaRouteVolumeSlider mediaRouteVolumeSlider, View view) {
        int a2 = a(context, 0);
        if (Color.alpha(a2) != 255) {
            a2 = C0301ab.b(a2, ((Integer) view.getTag()).intValue());
        }
        mediaRouteVolumeSlider.a(a2);
    }

    private static int a(Context context, int i, int i2) {
        if (i != 0) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, new int[]{i2});
            int color = obtainStyledAttributes.getColor(0, 0);
            obtainStyledAttributes.recycle();
            if (color != 0) {
                return color;
            }
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i2, typedValue, true);
        if (typedValue.resourceId != 0) {
            return context.getResources().getColor(typedValue.resourceId);
        }
        return typedValue.data;
    }
}
