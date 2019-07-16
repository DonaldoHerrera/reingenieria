package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;

/* compiled from: TintTypedArray */
public class na {
    private final Context a;
    private final TypedArray b;
    private TypedValue c;

    private na(Context context, TypedArray typedArray) {
        this.a = context;
        this.b = typedArray;
    }

    public static na a(Context context, AttributeSet attributeSet, int[] iArr) {
        return new na(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    public Drawable b(int i) {
        if (this.b.hasValue(i)) {
            int resourceId = this.b.getResourceId(i, 0);
            if (resourceId != 0) {
                return C1437k.b(this.a, resourceId);
            }
        }
        return this.b.getDrawable(i);
    }

    public Drawable c(int i) {
        if (this.b.hasValue(i)) {
            int resourceId = this.b.getResourceId(i, 0);
            if (resourceId != 0) {
                return C0350q.a().a(this.a, resourceId, true);
            }
        }
        return null;
    }

    public String d(int i) {
        return this.b.getString(i);
    }

    public CharSequence e(int i) {
        return this.b.getText(i);
    }

    public int f(int i, int i2) {
        return this.b.getLayoutDimension(i, i2);
    }

    public int g(int i, int i2) {
        return this.b.getResourceId(i, i2);
    }

    public static na a(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2) {
        return new na(context, context.obtainStyledAttributes(attributeSet, iArr, i, i2));
    }

    public int d(int i, int i2) {
        return this.b.getInt(i, i2);
    }

    public int e(int i, int i2) {
        return this.b.getInteger(i, i2);
    }

    public CharSequence[] f(int i) {
        return this.b.getTextArray(i);
    }

    public boolean g(int i) {
        return this.b.hasValue(i);
    }

    public static na a(Context context, int i, int[] iArr) {
        return new na(context, context.obtainStyledAttributes(i, iArr));
    }

    public int c(int i, int i2) {
        return this.b.getDimensionPixelSize(i, i2);
    }

    public Typeface a(int i, int i2, a aVar) {
        int resourceId = this.b.getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.c == null) {
            this.c = new TypedValue();
        }
        return C0277Xa.a(this.a, resourceId, this.c, i2, aVar);
    }

    public float b(int i, float f) {
        return this.b.getFloat(i, f);
    }

    public int b(int i, int i2) {
        return this.b.getDimensionPixelOffset(i, i2);
    }

    public boolean a(int i, boolean z) {
        return this.b.getBoolean(i, z);
    }

    public int a(int i, int i2) {
        return this.b.getColor(i, i2);
    }

    public ColorStateList a(int i) {
        if (this.b.hasValue(i)) {
            int resourceId = this.b.getResourceId(i, 0);
            if (resourceId != 0) {
                ColorStateList a2 = C1437k.a(this.a, resourceId);
                if (a2 != null) {
                    return a2;
                }
            }
        }
        return this.b.getColorStateList(i);
    }

    public float a(int i, float f) {
        return this.b.getDimension(i, f);
    }

    public void a() {
        this.b.recycle();
    }
}
