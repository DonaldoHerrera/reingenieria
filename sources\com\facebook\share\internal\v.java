package com.facebook.share.internal;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.RectF;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.TextView;
import com.facebook.common.b;

@Deprecated
/* compiled from: LikeBoxCountView */
public class v extends FrameLayout {
    private TextView a;
    private a b = a.LEFT;
    private float c;
    private float d;
    private float e;
    private Paint f;
    private int g;
    private int h;

    /* compiled from: LikeBoxCountView */
    public enum a {
        LEFT,
        TOP,
        RIGHT,
        BOTTOM
    }

    @Deprecated
    public v(Context context) {
        super(context);
        a(context);
    }

    private void a(Context context) {
        setWillNotDraw(false);
        this.c = getResources().getDimension(b.com_facebook_likeboxcountview_caret_height);
        this.d = getResources().getDimension(b.com_facebook_likeboxcountview_caret_width);
        this.e = getResources().getDimension(b.com_facebook_likeboxcountview_border_radius);
        this.f = new Paint();
        this.f.setColor(getResources().getColor(com.facebook.common.a.com_facebook_likeboxcountview_border_color));
        this.f.setStrokeWidth(getResources().getDimension(b.com_facebook_likeboxcountview_border_width));
        this.f.setStyle(Style.STROKE);
        b(context);
        addView(this.a);
        setCaretPosition(this.b);
    }

    private void b(Context context) {
        this.a = new TextView(context);
        this.a.setLayoutParams(new LayoutParams(-1, -1));
        this.a.setGravity(17);
        this.a.setTextSize(0, getResources().getDimension(b.com_facebook_likeboxcountview_text_size));
        this.a.setTextColor(getResources().getColor(com.facebook.common.a.com_facebook_likeboxcountview_text_color));
        this.g = getResources().getDimensionPixelSize(b.com_facebook_likeboxcountview_text_padding);
        this.h = getResources().getDimensionPixelSize(b.com_facebook_likeboxcountview_caret_height);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int paddingTop = getPaddingTop();
        int paddingLeft = getPaddingLeft();
        int width = getWidth() - getPaddingRight();
        int height = getHeight() - getPaddingBottom();
        int i = u.a[this.b.ordinal()];
        if (i == 1) {
            paddingLeft = (int) (((float) paddingLeft) + this.c);
        } else if (i == 2) {
            paddingTop = (int) (((float) paddingTop) + this.c);
        } else if (i == 3) {
            width = (int) (((float) width) - this.c);
        } else if (i == 4) {
            height = (int) (((float) height) - this.c);
        }
        a(canvas, (float) paddingLeft, (float) paddingTop, (float) width, (float) height);
    }

    @Deprecated
    public void setCaretPosition(a aVar) {
        this.b = aVar;
        int i = u.a[aVar.ordinal()];
        if (i == 1) {
            a(this.h, 0, 0, 0);
        } else if (i == 2) {
            a(0, this.h, 0, 0);
        } else if (i == 3) {
            a(0, 0, this.h, 0);
        } else if (i == 4) {
            a(0, 0, 0, this.h);
        }
    }

    @Deprecated
    public void setText(String str) {
        this.a.setText(str);
    }

    private void a(int i, int i2, int i3, int i4) {
        TextView textView = this.a;
        int i5 = this.g;
        textView.setPadding(i + i5, i2 + i5, i3 + i5, i5 + i4);
    }

    private void a(Canvas canvas, float f2, float f3, float f4, float f5) {
        Path path = new Path();
        float f6 = this.e * 2.0f;
        float f7 = f2 + f6;
        float f8 = f3 + f6;
        path.addArc(new RectF(f2, f3, f7, f8), -180.0f, 90.0f);
        if (this.b == a.TOP) {
            float f9 = f4 - f2;
            path.lineTo(((f9 - this.d) / 2.0f) + f2, f3);
            path.lineTo((f9 / 2.0f) + f2, f3 - this.c);
            path.lineTo(((f9 + this.d) / 2.0f) + f2, f3);
        }
        path.lineTo(f4 - this.e, f3);
        float f10 = f4 - f6;
        path.addArc(new RectF(f10, f3, f4, f8), -90.0f, 90.0f);
        if (this.b == a.RIGHT) {
            float f11 = f5 - f3;
            path.lineTo(f4, ((f11 - this.d) / 2.0f) + f3);
            path.lineTo(this.c + f4, (f11 / 2.0f) + f3);
            path.lineTo(f4, ((f11 + this.d) / 2.0f) + f3);
        }
        path.lineTo(f4, f5 - this.e);
        float f12 = f5 - f6;
        path.addArc(new RectF(f10, f12, f4, f5), 0.0f, 90.0f);
        if (this.b == a.BOTTOM) {
            float f13 = f4 - f2;
            path.lineTo(((this.d + f13) / 2.0f) + f2, f5);
            path.lineTo((f13 / 2.0f) + f2, this.c + f5);
            path.lineTo(((f13 - this.d) / 2.0f) + f2, f5);
        }
        path.lineTo(this.e + f2, f5);
        path.addArc(new RectF(f2, f12, f7, f5), 90.0f, 90.0f);
        if (this.b == a.LEFT) {
            float f14 = f5 - f3;
            path.lineTo(f2, ((this.d + f14) / 2.0f) + f3);
            path.lineTo(f2 - this.c, (f14 / 2.0f) + f3);
            path.lineTo(f2, ((f14 - this.d) / 2.0f) + f3);
        }
        path.lineTo(f2, f3 + this.e);
        canvas.drawPath(path, this.f);
    }
}
