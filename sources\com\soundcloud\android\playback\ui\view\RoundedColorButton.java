package com.soundcloud.android.playback.ui.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import com.soundcloud.android.ia.r;
import com.soundcloud.android.view.customfontviews.a;

public class RoundedColorButton extends AppCompatButton {
    private RectF c;
    private Paint d;
    private ColorStateList e;
    private float f;

    public RoundedColorButton(Context context) {
        super(context);
    }

    private void a(Context context, AttributeSet attributeSet) {
        this.d = new Paint();
        this.d.setAntiAlias(true);
        this.f = (float) C6768kIa.a(getContext(), 4);
        this.c = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
        b(context, attributeSet);
        a.a((TextView) this, "fonts/InterstateSound_Pnum-Regular_fbFICLP0jJ.ttf");
    }

    private void b(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, r.RoundedColorButton, 0, 0);
        try {
            this.e = obtainStyledAttributes.getColorStateList(r.RoundedColorButton_backgroundColorStateList);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        if (this.e != null) {
            a(canvas);
        }
        super.onDraw(canvas);
    }

    public void setBackground(ColorStateList colorStateList) {
        this.e = colorStateList;
        invalidate();
    }

    public RoundedColorButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context, attributeSet);
    }

    public RoundedColorButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(context, attributeSet);
    }

    private void a(Canvas canvas) {
        this.d.setColor(this.e.getColorForState(getDrawableState(), this.e.getDefaultColor()));
        this.c.right = (float) getWidth();
        this.c.bottom = (float) getHeight();
        RectF rectF = this.c;
        float f2 = this.f;
        canvas.drawRoundRect(rectF, f2, f2, this.d);
    }
}
