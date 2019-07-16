package com.soundcloud.android.image;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView.ScaleType;
import androidx.appcompat.widget.AppCompatImageView;
import com.soundcloud.android.image.sa.d;

public class CenterCropImageView extends AppCompatImageView {
    public CenterCropImageView(Context context) {
        super(context);
        a();
    }

    private void a() {
        setScaleType(ScaleType.MATRIX);
    }

    private boolean d() {
        return getResources().getBoolean(d.is_landscape);
    }

    private void e() {
        float f;
        float f2;
        Drawable drawable = getDrawable();
        if (drawable != null) {
            Matrix imageMatrix = getImageMatrix();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            float f3 = 0.0f;
            if (intrinsicWidth * height > width * intrinsicHeight) {
                float f4 = ((float) height) / ((float) intrinsicHeight);
                f3 = (((float) width) - (((float) intrinsicWidth) * f4)) * 0.5f;
                f = f4;
            } else {
                f = ((float) width) / ((float) intrinsicWidth);
                if (d()) {
                    f2 = (((float) height) - (((float) intrinsicHeight) * f)) * 0.5f;
                    imageMatrix.setScale(f, f);
                    imageMatrix.postTranslate((float) Math.round(f3), (float) Math.round(f2));
                    setImageMatrix(imageMatrix);
                }
            }
            f2 = 0.0f;
            imageMatrix.setScale(f, f);
            imageMatrix.postTranslate((float) Math.round(f3), (float) Math.round(f2));
            setImageMatrix(imageMatrix);
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        e();
    }

    /* access modifiers changed from: protected */
    public boolean setFrame(int i, int i2, int i3, int i4) {
        e();
        return super.setFrame(i, i2, i3, i4);
    }

    public CenterCropImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }

    public CenterCropImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a();
    }
}
