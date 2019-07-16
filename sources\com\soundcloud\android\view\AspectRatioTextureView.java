package com.soundcloud.android.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.TextureView;
import com.soundcloud.android.ia.r;

public class AspectRatioTextureView extends TextureView {
    private float a;
    private boolean b;
    private int c;

    public AspectRatioTextureView(Context context) {
        this(context, null);
    }

    public float getAspectRatio() {
        return this.a;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        super.onMeasure(i, i2);
        if (this.b) {
            int i5 = this.c;
            if (i5 == 0) {
                i3 = getMeasuredWidth();
                i4 = (int) (((float) i3) * this.a);
            } else if (i5 == 1) {
                i4 = getMeasuredHeight();
                i3 = (int) (((float) i4) * this.a);
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Unknown measurement with ID ");
                sb.append(this.c);
                throw new IllegalStateException(sb.toString());
            }
            setMeasuredDimension(i3, i4);
        }
    }

    public void setAspectRatio(float f) {
        this.a = f;
        if (this.b) {
            requestLayout();
        }
    }

    public AspectRatioTextureView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r.AspectRatioView);
        this.a = obtainStyledAttributes.getFloat(r.AspectRatioView_ariv_aspectRatio, 1.0f);
        this.b = obtainStyledAttributes.getBoolean(r.AspectRatioView_ariv_aspectRatioEnabled, false);
        this.c = obtainStyledAttributes.getInt(r.AspectRatioView_ariv_dominantMeasurement, 0);
        obtainStyledAttributes.recycle();
    }
}
