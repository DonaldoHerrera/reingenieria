package com.soundcloud.android.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.core.content.a;
import com.soundcloud.android.ia.r;

public class ForegroundImageView extends OptimisedImageView {
    private boolean l = false;
    private Drawable m;

    public ForegroundImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r.ForegroundImageView);
        this.l = obtainStyledAttributes.getBoolean(r.ForegroundImageView_square, false);
        this.m = a.c(context, obtainStyledAttributes.getResourceId(r.ForegroundImageView_foregroundDrawable, -1));
        obtainStyledAttributes.recycle();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.m.draw(canvas);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            this.m.setBounds(0, 0, i3 - i, i4 - i2);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        if (this.l) {
            super.onMeasure(i, i);
        } else {
            super.onMeasure(i, i2);
        }
    }
}
