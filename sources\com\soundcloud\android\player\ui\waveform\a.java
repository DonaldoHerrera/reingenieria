package com.soundcloud.android.player.ui.waveform;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.drawable.Drawable;

/* compiled from: ProgressLineDrawable */
public class a extends Drawable {
    private final Paint a = new Paint();
    private final Paint b;
    private final int c;
    private final int d;
    private final float e;

    a(int i, Paint paint, int i2, int i3, float f) {
        this.c = i2;
        this.d = i3;
        this.e = f;
        this.a.setColor(i);
        this.a.setStyle(Style.FILL);
        this.b = paint;
    }

    public void draw(Canvas canvas) {
        canvas.drawRect((float) getBounds().left, (float) this.c, ((float) getBounds().right) * this.e, (float) (this.c + this.d), this.a);
        if (this.e < 1.0f) {
            canvas.drawRect(((float) getBounds().right) * this.e, (float) this.c, (float) getBounds().right, (float) (this.c + this.d), this.b);
        }
    }

    public int getOpacity() {
        return -3;
    }

    public void setAlpha(int i) {
        this.a.setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.a.setColorFilter(colorFilter);
    }
}
