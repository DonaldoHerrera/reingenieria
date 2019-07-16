package com.soundcloud.android.settings;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatRadioButton;
import com.soundcloud.android.ia.g;
import com.soundcloud.android.ia.r;

public class SummaryRadioButton extends AppCompatRadioButton {
    private Paint c;
    private String d;

    public SummaryRadioButton(Context context) {
        this(context, null);
    }

    private void a(AttributeSet attributeSet) {
        int dimensionPixelSize = getResources().getDimensionPixelSize(g.summary_radio_button_summary_size);
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(attributeSet, r.SummaryRadioButton, 0, 0);
        this.c.setColor(obtainStyledAttributes.getColor(r.SummaryRadioButton_summaryColor, -16777216));
        this.c.setTextSize((float) obtainStyledAttributes.getDimensionPixelSize(r.SummaryRadioButton_summarySize, dimensionPixelSize));
        this.d = C5206PKa.d(obtainStyledAttributes.getString(r.SummaryRadioButton_android_summary));
        obtainStyledAttributes.recycle();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawText(this.d, (float) (getCompoundPaddingLeft() + getCompoundDrawablePadding()), (float) (getMeasuredHeight() - ((int) this.c.descent())), this.c);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int descent = (int) this.c.descent();
        setMeasuredDimension(getMeasuredWidth(), getBaseline() + getLineHeight() + ((int) (-this.c.ascent())) + descent);
    }

    public void setSummary(String str) {
        this.d = C5206PKa.d(str);
        invalidate();
    }

    public SummaryRadioButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = new Paint(1);
        this.d = "";
        a(attributeSet);
    }
}
