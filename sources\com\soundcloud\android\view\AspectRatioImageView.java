package com.soundcloud.android.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.core.content.a;
import com.soundcloud.android.ia.r;

public class AspectRatioImageView extends OptimisedImageView {
    private float l;
    private boolean m;
    private int n;
    private Drawable o;

    public AspectRatioImageView(Context context) {
        this(context, null);
    }

    public float getAspectRatio() {
        return this.l;
    }

    public boolean getAspectRatioEnabled() {
        return this.m;
    }

    public int getDominantMeasurement() {
        return this.n;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Drawable drawable = this.o;
        if (drawable != null) {
            drawable.draw(canvas);
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        Drawable drawable = this.o;
        if (drawable != null) {
            drawable.setBounds(0, 0, i3 - i, i4 - i2);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        super.onMeasure(i, i2);
        if (this.m) {
            int i5 = this.n;
            if (i5 == 0) {
                i3 = getMeasuredWidth();
                i4 = (int) (((float) i3) * this.l);
            } else if (i5 == 1) {
                i4 = getMeasuredHeight();
                i3 = (int) (((float) i4) * this.l);
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Unknown measurement with ID ");
                sb.append(this.n);
                throw new IllegalStateException(sb.toString());
            }
            setMeasuredDimension(i3, i4);
        }
    }

    public void setAspectRatio(float f) {
        this.l = f;
        if (this.m) {
            requestLayout();
        }
    }

    public void setAspectRatioEnabled(boolean z) {
        this.m = z;
        requestLayout();
    }

    public void setDominantMeasurement(int i) {
        if (i == 1 || i == 0) {
            this.n = i;
            requestLayout();
            return;
        }
        throw new IllegalArgumentException("Invalid measurement type.");
    }

    public AspectRatioImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r.AspectRatioView);
        this.l = obtainStyledAttributes.getFloat(r.AspectRatioView_ariv_aspectRatio, 1.0f);
        this.m = obtainStyledAttributes.getBoolean(r.AspectRatioView_ariv_aspectRatioEnabled, false);
        this.n = obtainStyledAttributes.getInt(r.AspectRatioView_ariv_dominantMeasurement, 0);
        if (obtainStyledAttributes.hasValue(r.AspectRatioView_foreground)) {
            this.o = a.c(context, obtainStyledAttributes.getResourceId(r.AspectRatioView_foreground, -1));
        }
        obtainStyledAttributes.recycle();
    }
}
