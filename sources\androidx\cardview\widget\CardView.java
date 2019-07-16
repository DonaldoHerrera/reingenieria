package androidx.cardview.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.widget.FrameLayout;

public class CardView extends FrameLayout {
    private static final int[] a = {16842801};
    private static final h b;
    private boolean c;
    private boolean d;
    int e;
    int f;
    final Rect g;
    final Rect h;
    private final g i;

    static {
        int i2 = VERSION.SDK_INT;
        if (i2 >= 21) {
            b = new d();
        } else if (i2 >= 17) {
            b = new c();
        } else {
            b = new f();
        }
        b.a();
    }

    public CardView(Context context) {
        this(context, null);
    }

    public ColorStateList getCardBackgroundColor() {
        return b.c(this.i);
    }

    public float getCardElevation() {
        return b.f(this.i);
    }

    public int getContentPaddingBottom() {
        return this.g.bottom;
    }

    public int getContentPaddingLeft() {
        return this.g.left;
    }

    public int getContentPaddingRight() {
        return this.g.right;
    }

    public int getContentPaddingTop() {
        return this.g.top;
    }

    public float getMaxCardElevation() {
        return b.b(this.i);
    }

    public boolean getPreventCornerOverlap() {
        return this.d;
    }

    public float getRadius() {
        return b.a(this.i);
    }

    public boolean getUseCompatPadding() {
        return this.c;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        if (!(b instanceof d)) {
            int mode = MeasureSpec.getMode(i2);
            if (mode == Integer.MIN_VALUE || mode == 1073741824) {
                i2 = MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil((double) b.i(this.i)), MeasureSpec.getSize(i2)), mode);
            }
            int mode2 = MeasureSpec.getMode(i3);
            if (mode2 == Integer.MIN_VALUE || mode2 == 1073741824) {
                i3 = MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil((double) b.d(this.i)), MeasureSpec.getSize(i3)), mode2);
            }
            super.onMeasure(i2, i3);
            return;
        }
        super.onMeasure(i2, i3);
    }

    public void setCardBackgroundColor(int i2) {
        b.a(this.i, ColorStateList.valueOf(i2));
    }

    public void setCardElevation(float f2) {
        b.b(this.i, f2);
    }

    public void setMaxCardElevation(float f2) {
        b.c(this.i, f2);
    }

    public void setMinimumHeight(int i2) {
        this.f = i2;
        super.setMinimumHeight(i2);
    }

    public void setMinimumWidth(int i2) {
        this.e = i2;
        super.setMinimumWidth(i2);
    }

    public void setPadding(int i2, int i3, int i4, int i5) {
    }

    public void setPaddingRelative(int i2, int i3, int i4, int i5) {
    }

    public void setPreventCornerOverlap(boolean z) {
        if (z != this.d) {
            this.d = z;
            b.e(this.i);
        }
    }

    public void setRadius(float f2) {
        b.a(this.i, f2);
    }

    public void setUseCompatPadding(boolean z) {
        if (this.c != z) {
            this.c = z;
            b.g(this.i);
        }
    }

    public CardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, M.cardViewStyle);
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        b.a(this.i, colorStateList);
    }

    public CardView(Context context, AttributeSet attributeSet, int i2) {
        int i3;
        ColorStateList valueOf;
        super(context, attributeSet, i2);
        this.g = new Rect();
        this.h = new Rect();
        this.i = new a(this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, Q.CardView, i2, P.CardView);
        if (obtainStyledAttributes.hasValue(Q.CardView_cardBackgroundColor)) {
            valueOf = obtainStyledAttributes.getColorStateList(Q.CardView_cardBackgroundColor);
        } else {
            TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(a);
            int color = obtainStyledAttributes2.getColor(0, 0);
            obtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color, fArr);
            if (fArr[2] > 0.5f) {
                i3 = getResources().getColor(N.cardview_light_background);
            } else {
                i3 = getResources().getColor(N.cardview_dark_background);
            }
            valueOf = ColorStateList.valueOf(i3);
        }
        ColorStateList colorStateList = valueOf;
        float dimension = obtainStyledAttributes.getDimension(Q.CardView_cardCornerRadius, 0.0f);
        float dimension2 = obtainStyledAttributes.getDimension(Q.CardView_cardElevation, 0.0f);
        float dimension3 = obtainStyledAttributes.getDimension(Q.CardView_cardMaxElevation, 0.0f);
        this.c = obtainStyledAttributes.getBoolean(Q.CardView_cardUseCompatPadding, false);
        this.d = obtainStyledAttributes.getBoolean(Q.CardView_cardPreventCornerOverlap, true);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(Q.CardView_contentPadding, 0);
        this.g.left = obtainStyledAttributes.getDimensionPixelSize(Q.CardView_contentPaddingLeft, dimensionPixelSize);
        this.g.top = obtainStyledAttributes.getDimensionPixelSize(Q.CardView_contentPaddingTop, dimensionPixelSize);
        this.g.right = obtainStyledAttributes.getDimensionPixelSize(Q.CardView_contentPaddingRight, dimensionPixelSize);
        this.g.bottom = obtainStyledAttributes.getDimensionPixelSize(Q.CardView_contentPaddingBottom, dimensionPixelSize);
        float f2 = dimension2 > dimension3 ? dimension2 : dimension3;
        this.e = obtainStyledAttributes.getDimensionPixelSize(Q.CardView_android_minWidth, 0);
        this.f = obtainStyledAttributes.getDimensionPixelSize(Q.CardView_android_minHeight, 0);
        obtainStyledAttributes.recycle();
        b.a(this.i, context, colorStateList, dimension, dimension2, f2);
    }

    public void a(int i2, int i3, int i4, int i5) {
        this.g.set(i2, i3, i4, i5);
        b.h(this.i);
    }
}
