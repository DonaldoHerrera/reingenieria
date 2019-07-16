package com.soundcloud.android.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

public class FixedWidthView extends View {
    private int a;

    public FixedWidthView(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(this.a, View.getDefaultSize(getSuggestedMinimumHeight(), i2));
    }

    public void setWidth(int i) {
        this.a = i;
    }

    public FixedWidthView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FixedWidthView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
