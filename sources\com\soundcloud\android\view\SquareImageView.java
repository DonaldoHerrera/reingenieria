package com.soundcloud.android.view;

import android.content.Context;
import android.util.AttributeSet;

public class SquareImageView extends OptimisedImageView {
    public SquareImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i);
    }
}
