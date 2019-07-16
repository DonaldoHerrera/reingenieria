package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;

/* renamed from: Uz reason: default package */
/* compiled from: MaterialResources */
public class Uz {
    public static ColorStateList a(Context context, TypedArray typedArray, int i) {
        if (typedArray.hasValue(i)) {
            int resourceId = typedArray.getResourceId(i, 0);
            if (resourceId != 0) {
                ColorStateList a = C1437k.a(context, resourceId);
                if (a != null) {
                    return a;
                }
            }
        }
        return typedArray.getColorStateList(i);
    }

    public static Drawable b(Context context, TypedArray typedArray, int i) {
        if (typedArray.hasValue(i)) {
            int resourceId = typedArray.getResourceId(i, 0);
            if (resourceId != 0) {
                Drawable b = C1437k.b(context, resourceId);
                if (b != null) {
                    return b;
                }
            }
        }
        return typedArray.getDrawable(i);
    }

    public static Wz c(Context context, TypedArray typedArray, int i) {
        if (typedArray.hasValue(i)) {
            int resourceId = typedArray.getResourceId(i, 0);
            if (resourceId != 0) {
                return new Wz(context, resourceId);
            }
        }
        return null;
    }

    static int a(TypedArray typedArray, int i, int i2) {
        return typedArray.hasValue(i) ? i : i2;
    }
}
