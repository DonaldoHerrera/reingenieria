package defpackage;

import android.content.Context;
import android.content.res.Resources.Theme;
import android.util.TypedValue;

/* renamed from: Ol reason: default package */
/* compiled from: UiUtil */
class Ol {
    static int a(int i, float f) {
        if (f > 1.0f) {
            f = 1.0f;
        } else if (f <= 0.0f) {
            f = 0.0f;
        }
        return (i & 16777215) | (((int) (((float) (i >>> 24)) * f)) << 24);
    }

    static int a(Context context, int i) {
        return (int) TypedValue.applyDimension(1, (float) i, context.getResources().getDisplayMetrics());
    }

    static int b(Context context, int i) {
        return (int) TypedValue.applyDimension(2, (float) i, context.getResources().getDisplayMetrics());
    }

    static int a(Context context, String str) {
        Theme theme = context.getTheme();
        if (theme == null) {
            return -1;
        }
        TypedValue typedValue = new TypedValue();
        int identifier = context.getResources().getIdentifier(str, "attr", context.getPackageName());
        if (identifier == 0) {
            return -1;
        }
        theme.resolveAttribute(identifier, typedValue, true);
        return typedValue.data;
    }
}
