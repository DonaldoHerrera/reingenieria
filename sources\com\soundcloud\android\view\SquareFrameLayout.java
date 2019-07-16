package com.soundcloud.android.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;

public class SquareFrameLayout extends FrameLayout {
    public SquareFrameLayout(Context context) {
        this(context, null);
    }

    public void onMeasure(int i, int i2) {
        if (i > i2) {
            super.onMeasure(i, i);
        } else {
            super.onMeasure(i2, i2);
        }
    }

    public SquareFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
