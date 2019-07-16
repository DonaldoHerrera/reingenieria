package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.TypedValue;

/* compiled from: ThemeUtils */
class ia {
    private static final ThreadLocal<TypedValue> a = new ThreadLocal<>();
    static final int[] b = {-16842910};
    static final int[] c = {16842908};
    static final int[] d = {16843518};
    static final int[] e = {16842919};
    static final int[] f = {16842912};
    static final int[] g = {16842913};
    static final int[] h = {-16842919, -16842908};
    static final int[] i = new int[0];
    private static final int[] j = new int[1];

    public static int a(Context context, int i2) {
        ColorStateList c2 = c(context, i2);
        if (c2 != null && c2.isStateful()) {
            return c2.getColorForState(b, c2.getDefaultColor());
        }
        TypedValue a2 = a();
        context.getTheme().resolveAttribute(16842803, a2, true);
        return a(context, i2, a2.getFloat());
    }

    public static int b(Context context, int i2) {
        int[] iArr = j;
        iArr[0] = i2;
        na a2 = na.a(context, (AttributeSet) null, iArr);
        try {
            return a2.a(0, 0);
        } finally {
            a2.a();
        }
    }

    public static ColorStateList c(Context context, int i2) {
        int[] iArr = j;
        iArr[0] = i2;
        na a2 = na.a(context, (AttributeSet) null, iArr);
        try {
            return a2.a(0);
        } finally {
            a2.a();
        }
    }

    private static TypedValue a() {
        TypedValue typedValue = (TypedValue) a.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        a.set(typedValue2);
        return typedValue2;
    }

    static int a(Context context, int i2, float f2) {
        int b2 = b(context, i2);
        return C0301ab.c(b2, Math.round(((float) Color.alpha(b2)) * f2));
    }
}
