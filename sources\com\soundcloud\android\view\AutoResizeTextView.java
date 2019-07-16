package com.soundcloud.android.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.Layout.Alignment;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.AttributeSet;
import com.soundcloud.android.ia.r;
import com.soundcloud.android.view.customfontviews.CustomFontTextView;

public class AutoResizeTextView extends CustomFontTextView {
    private boolean d;
    private float e;
    private float f;
    private float g;
    private float h;
    private float i;
    private boolean j;

    public AutoResizeTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void a(int i2, int i3) {
        CharSequence text = getText();
        if (text != null && text.length() != 0 && i3 > 0 && i2 > 0 && this.e != 0.0f) {
            if (getTransformationMethod() != null) {
                text = getTransformationMethod().getTransformation(text, this);
            }
            CharSequence charSequence = text;
            TextPaint paint = getPaint();
            int a = a(charSequence, paint, i2, this.e);
            while (a > i3) {
                float f2 = this.e;
                float f3 = this.f;
                if (f2 <= f3) {
                    break;
                }
                this.e = Math.max(f2 - this.g, f3);
                a = a(charSequence, paint, i2, this.e);
            }
            a(i2, i3, charSequence, paint, a);
            setTextSize(0, this.e);
            setLineSpacing(this.i, this.h);
            this.d = false;
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        if (z || this.d) {
            a(((i4 - i2) - getCompoundPaddingLeft()) - getCompoundPaddingRight(), ((i5 - i3) - getCompoundPaddingBottom()) - getCompoundPaddingTop());
        }
        super.onLayout(z, i2, i3, i4, i5);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        if (i2 != i4 || i3 != i5) {
            this.d = true;
        }
    }

    /* access modifiers changed from: protected */
    public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        this.d = true;
    }

    public void setLineSpacing(float f2, float f3) {
        super.setLineSpacing(f2, f3);
        this.h = f3;
        this.i = f2;
    }

    public void setTextSize(float f2) {
        super.setTextSize(f2);
        this.e = getTextSize();
    }

    public AutoResizeTextView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.d = false;
        this.h = 1.0f;
        this.i = 0.0f;
        this.j = true;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r.AutoResizeTextView);
        float f2 = context.getResources().getDisplayMetrics().density;
        this.j = obtainStyledAttributes.getBoolean(r.AutoResizeTextView_addEllipsis, true);
        this.f = (float) obtainStyledAttributes.getDimensionPixelSize(r.AutoResizeTextView_minTextSize, (int) (16.0f * f2));
        this.g = (float) obtainStyledAttributes.getDimensionPixelSize(r.AutoResizeTextView_resizeStep, (int) (f2 * 4.0f));
        obtainStyledAttributes.recycle();
        this.e = getTextSize();
    }

    public void setTextSize(int i2, float f2) {
        super.setTextSize(i2, f2);
        this.e = getTextSize();
    }

    private void a(int i2, int i3, CharSequence charSequence, TextPaint textPaint, int i4) {
        if (this.j && this.e == this.f && i4 > i3) {
            StaticLayout staticLayout = new StaticLayout(charSequence, new TextPaint(textPaint), i2, Alignment.ALIGN_NORMAL, this.h, this.i, false);
            if (staticLayout.getLineCount() > 0) {
                int lineForVertical = staticLayout.getLineForVertical(i3) - 1;
                if (lineForVertical < 0) {
                    setText("");
                    return;
                }
                int length = charSequence.length();
                float lineWidth = staticLayout.getLineWidth(lineForVertical);
                String str = "…";
                float measureText = textPaint.measureText(str);
                while (((float) i2) < lineWidth + measureText) {
                    length--;
                    lineWidth = textPaint.measureText(charSequence.subSequence(0, length + 1).toString());
                }
                StringBuilder sb = new StringBuilder();
                sb.append(charSequence.subSequence(0, length));
                sb.append(str);
                setText(sb.toString());
            }
        }
    }

    private int a(CharSequence charSequence, TextPaint textPaint, int i2, float f2) {
        TextPaint textPaint2 = new TextPaint(textPaint);
        textPaint2.setTextSize(f2);
        StaticLayout staticLayout = new StaticLayout(charSequence, textPaint2, i2, Alignment.ALIGN_NORMAL, this.h, this.i, true);
        return staticLayout.getHeight();
    }
}
