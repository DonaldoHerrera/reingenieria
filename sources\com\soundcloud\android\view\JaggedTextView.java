package com.soundcloud.android.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.soundcloud.android.ia.r;
import com.soundcloud.android.view.customfontviews.CustomFontTextView;

public class JaggedTextView extends CustomFontTextView {
    private Paint d;
    private ColorStateList e;
    private boolean f = true;

    public JaggedTextView(Context context) {
        super(context);
    }

    private void a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r.JaggedTextView);
        this.e = obtainStyledAttributes.getColorStateList(r.JaggedTextView_jagged_background);
        obtainStyledAttributes.recycle();
        this.d = new Paint();
        setIncludeFontPadding(false);
    }

    private int getDrawablePaddingLeft() {
        return getCompoundPaddingLeft() - getPaddingLeft();
    }

    private int getDrawablePaddingRight() {
        return getCompoundPaddingRight() - getPaddingRight();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        if (getLayout() == null) {
            forceLayout();
        }
        Layout layout = getLayout();
        if (layout != null) {
            canvas.save();
            canvas.translate((float) getPaddingLeft(), (float) getPaddingTop());
            if (this.f && !TextUtils.isEmpty(getText())) {
                a(canvas, layout);
            }
            canvas.restore();
            super.onDraw(canvas);
        }
    }

    public void setBackground(Drawable drawable) {
    }

    public void setBackgroundDrawable(Drawable drawable) {
    }

    public JaggedTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context, attributeSet);
    }

    public JaggedTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(context, attributeSet);
    }

    public void a(boolean z) {
        this.f = z;
        invalidate();
    }

    private void a(Canvas canvas, Layout layout) {
        for (int i = 0; i < layout.getLineCount(); i++) {
            int compoundPaddingTop = getCompoundPaddingTop();
            int compoundPaddingBottom = getCompoundPaddingBottom();
            float lineLeft = layout.getLineLeft(i);
            float lineTop = (float) layout.getLineTop(i);
            float lineRight = layout.getLineRight(i) + ((float) getDrawablePaddingLeft()) + ((float) getDrawablePaddingRight());
            float lineBottom = (float) layout.getLineBottom(i);
            if (i == 0) {
                lineTop -= (float) compoundPaddingTop;
            }
            float f2 = lineTop;
            if (a(layout, i)) {
                lineBottom += (float) compoundPaddingBottom;
            }
            float f3 = lineBottom;
            float paddingLeft = lineLeft - ((float) getPaddingLeft());
            float paddingRight = lineRight + ((float) getPaddingRight());
            this.d.setColor(this.e.getColorForState(getDrawableState(), this.e.getDefaultColor()));
            canvas.drawRect(paddingLeft, f2, paddingRight, f3, this.d);
        }
    }

    private boolean a(Layout layout, int i) {
        return i == layout.getLineCount() - 1;
    }
}
