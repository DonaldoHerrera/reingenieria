package com.soundcloud.android.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView.ScaleType;
import com.soundcloud.android.ia.r;

public class ParallaxImageView extends AspectRatioImageView {
    private final float p;
    private final int q;
    private int r;

    public ParallaxImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r.ParallaxImageView);
        this.p = obtainStyledAttributes.getFloat(r.ParallaxImageView_focalPoint, 0.5f);
        this.q = (int) obtainStyledAttributes.getDimension(r.ParallaxImageView_movement, (float) (-((int) (context.getResources().getDisplayMetrics().density * 30.0f))));
        obtainStyledAttributes.recycle();
        setScaleType(ScaleType.MATRIX);
    }

    /* access modifiers changed from: protected */
    public boolean setFrame(int i, int i2, int i3, int i4) {
        Drawable drawable = getDrawable();
        if (drawable != null) {
            Matrix imageMatrix = getImageMatrix();
            float intrinsicWidth = ((float) (i3 - i)) / ((float) drawable.getIntrinsicWidth());
            int i5 = (int) (((float) (-drawable.getIntrinsicHeight())) * this.p);
            imageMatrix.setTranslate(0.0f, (float) i5);
            imageMatrix.postScale(intrinsicWidth, intrinsicWidth, 0.0f, 0.0f);
            imageMatrix.postTranslate(0.0f, Math.min((float) (((i4 - i2) / 2) + this.r), ((float) (-i5)) * intrinsicWidth));
            setImageMatrix(imageMatrix);
        }
        return super.setFrame(i, i2, i3, i4);
    }

    public void setParallaxOffset(double d) {
        this.r = (int) (d * ((double) this.q));
        setFrame(getLeft(), getTop(), getRight(), getBottom());
        invalidate();
    }
}
