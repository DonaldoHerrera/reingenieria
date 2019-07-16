package com.soundcloud.android.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.graphics.drawable.c;
import androidx.core.graphics.drawable.d;
import com.soundcloud.android.ia.r;

public class CircularBorderImageView extends AppCompatImageView {
    private final RectF c;
    private final Paint d;
    private int e;
    private int f;
    private float g;
    private boolean h;
    private boolean i;

    public CircularBorderImageView(Context context) {
        super(context);
        this.c = new RectF();
        this.d = new Paint();
        this.e = -16777216;
        this.f = 0;
        a();
    }

    private void a() {
        this.h = true;
        if (this.i) {
            d();
            this.i = false;
        }
    }

    private void d() {
        if (!this.h) {
            this.i = true;
            return;
        }
        this.d.setStyle(Style.STROKE);
        this.d.setAntiAlias(true);
        this.d.setColor(this.e);
        this.d.setStrokeWidth((float) this.f);
        this.c.set(0.0f, 0.0f, (float) getWidth(), (float) getHeight());
        this.g = Math.min((this.c.height() - ((float) this.f)) / 2.0f, (this.c.width() - ((float) this.f)) / 2.0f);
        invalidate();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f != 0) {
            canvas.drawCircle((float) (getWidth() / 2), (float) (getHeight() / 2), this.g, this.d);
        }
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        d();
    }

    public void setImageDrawable(Drawable drawable) {
        if (drawable instanceof BitmapDrawable) {
            c a = d.a(getResources(), ((BitmapDrawable) drawable).getBitmap());
            a.a(true);
            super.setImageDrawable(a);
            return;
        }
        super.setImageDrawable(drawable);
    }

    public CircularBorderImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CircularBorderImageView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.c = new RectF();
        this.d = new Paint();
        this.e = -16777216;
        this.f = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r.CircularBorderImageView, i2, 0);
        this.f = obtainStyledAttributes.getDimensionPixelSize(r.CircularBorderImageView_cbiv_borderWidth, 0);
        this.e = obtainStyledAttributes.getColor(r.CircularBorderImageView_cbiv_borderColor, -16777216);
        obtainStyledAttributes.recycle();
        a();
    }
}
