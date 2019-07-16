package com.google.android.material.textfield;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable.Callback;
import android.graphics.drawable.GradientDrawable;
import android.os.Build.VERSION;
import android.view.View;

/* compiled from: CutoutDrawable */
class a extends GradientDrawable {
    private final Paint a = new Paint(1);
    private final RectF b;
    private int c;

    a() {
        c();
        this.b = new RectF();
    }

    private void c() {
        this.a.setStyle(Style.FILL_AND_STROKE);
        this.a.setColor(-1);
        this.a.setXfermode(new PorterDuffXfermode(Mode.DST_OUT));
    }

    /* access modifiers changed from: 0000 */
    public boolean a() {
        return !this.b.isEmpty();
    }

    /* access modifiers changed from: 0000 */
    public void b() {
        a(0.0f, 0.0f, 0.0f, 0.0f);
    }

    public void draw(Canvas canvas) {
        b(canvas);
        super.draw(canvas);
        canvas.drawRect(this.b, this.a);
        a(canvas);
    }

    private void b(Canvas canvas) {
        Callback callback = getCallback();
        if (a(callback)) {
            ((View) callback).setLayerType(2, null);
        } else {
            c(canvas);
        }
    }

    /* access modifiers changed from: 0000 */
    public void a(float f, float f2, float f3, float f4) {
        RectF rectF = this.b;
        if (f != rectF.left || f2 != rectF.top || f3 != rectF.right || f4 != rectF.bottom) {
            this.b.set(f, f2, f3, f4);
            invalidateSelf();
        }
    }

    private void c(Canvas canvas) {
        if (VERSION.SDK_INT >= 21) {
            this.c = canvas.saveLayer(0.0f, 0.0f, (float) canvas.getWidth(), (float) canvas.getHeight(), null);
            return;
        }
        this.c = canvas.saveLayer(0.0f, 0.0f, (float) canvas.getWidth(), (float) canvas.getHeight(), null, 31);
    }

    /* access modifiers changed from: 0000 */
    public void a(RectF rectF) {
        a(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    private void a(Canvas canvas) {
        if (!a(getCallback())) {
            canvas.restoreToCount(this.c);
        }
    }

    private boolean a(Callback callback) {
        return callback instanceof View;
    }
}
