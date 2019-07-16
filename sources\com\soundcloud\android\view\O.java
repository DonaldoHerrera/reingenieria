package com.soundcloud.android.view;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.M;

/* compiled from: SmoothLinearLayoutManager */
class O extends M {
    final /* synthetic */ SmoothLinearLayoutManager o;

    O(SmoothLinearLayoutManager smoothLinearLayoutManager, Context context) {
        this.o = smoothLinearLayoutManager;
        super(context);
    }

    public PointF a(int i) {
        return this.o.a(i);
    }

    /* access modifiers changed from: protected */
    public float a(DisplayMetrics displayMetrics) {
        return 50.0f / ((float) displayMetrics.densityDpi);
    }
}
