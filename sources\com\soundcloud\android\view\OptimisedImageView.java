package com.soundcloud.android.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader.TileMode;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import com.soundcloud.android.ia.r;

public class OptimisedImageView extends AppCompatImageView {
    private static final float[] c = {0.0f, 0.6f, 1.0f};
    private boolean d;
    private float e;
    private int f;
    private int g;
    private Paint h;
    private Rect i;
    private int[] j;
    private boolean k;

    public OptimisedImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context, attributeSet);
        if (this.d) {
            a();
        }
    }

    private void a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r.OptimisedImageView);
        this.d = obtainStyledAttributes.getBoolean(r.OptimisedImageView_showGradient, false);
        this.e = obtainStyledAttributes.getFloat(r.OptimisedImageView_gradientStart, 0.7f);
        this.f = obtainStyledAttributes.getColor(r.OptimisedImageView_gradientStartColor, 1593835520);
        this.g = obtainStyledAttributes.getColor(r.OptimisedImageView_gradientEndColor, -1442840576);
        obtainStyledAttributes.recycle();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.d && getDrawable() != null) {
            a(canvas);
        }
    }

    /* access modifiers changed from: protected */
    @SuppressLint({"DrawAllocation"})
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
        if (this.d && z) {
            a(i3, i5);
        }
    }

    public void requestLayout() {
        if (!this.k) {
            super.requestLayout();
        }
        this.k = false;
    }

    private void a() {
        this.h = new Paint();
        this.i = new Rect();
        this.j = new int[]{0, this.f, this.g};
    }

    private void a(int i2, int i3) {
        LinearGradient linearGradient = new LinearGradient(0.0f, (float) (i2 + ((int) (((float) (i3 - i2)) * this.e))), 0.0f, (float) i3, this.j, c, TileMode.CLAMP);
        this.h.setShader(linearGradient);
    }

    private void a(Canvas canvas) {
        canvas.getClipBounds(this.i);
        Rect rect = this.i;
        int i2 = rect.top;
        rect.top = (int) ((((float) (rect.bottom - i2)) * this.e) + ((float) i2));
        canvas.drawRect(rect, this.h);
    }
}
