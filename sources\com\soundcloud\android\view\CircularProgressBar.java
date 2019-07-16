package com.soundcloud.android.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import com.soundcloud.android.ia.f;
import com.soundcloud.android.ia.g;
import com.soundcloud.android.ia.r;

public class CircularProgressBar extends View {
    private C6227p a;

    public CircularProgressBar(Context context) {
        this(context, null);
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        this.a.draw(canvas);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.a.setBounds(0, 0, i, i2);
    }

    /* access modifiers changed from: protected */
    public void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        C6227p pVar = this.a;
        if (pVar == null) {
            return;
        }
        if (i == 0) {
            pVar.start();
        } else {
            pVar.stop();
        }
    }

    public void setIndeterminate(boolean z) {
        if (z) {
            this.a.start();
        } else {
            this.a.stop();
        }
    }

    public void setProgress(int i) {
        this.a.a(i);
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        return drawable == this.a || super.verifyDrawable(drawable);
    }

    public CircularProgressBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CircularProgressBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r.CircularProgressBar);
        int color = obtainStyledAttributes.getColor(r.CircularProgressBar_progressBarColor, getResources().getColor(f.white));
        float dimension = obtainStyledAttributes.getDimension(r.CircularProgressBar_progressBarStrokeWidth, getResources().getDimension(g.default_indeterminite_spinner_stroke_width));
        obtainStyledAttributes.recycle();
        this.a = new C6227p(dimension, color);
        this.a.setCallback(this);
        if (getVisibility() == 0) {
            this.a.start();
        }
    }
}
