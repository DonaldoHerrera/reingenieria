package com.soundcloud.android.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;

@EVa(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0014¨\u0006\f"}, d2 = {"Lcom/soundcloud/android/view/BiggestChildHeightViewPager;", "Lcom/soundcloud/android/view/SafeViewPager;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "onMeasure", "", "widthMeasureSpec", "", "heightMeasureSpec", "base_release"}, mv = {1, 1, 15})
/* compiled from: BiggestChildHeightViewPager.kt */
public final class BiggestChildHeightViewPager extends SafeViewPager {
    public BiggestChildHeightViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3 = 0;
        for (View view : Ac.a(this)) {
            view.measure(i, MeasureSpec.makeMeasureSpec(0, 0));
            if (view.getMeasuredHeight() > i3) {
                i3 = view.getMeasuredHeight();
            }
        }
        if (i3 != 0) {
            super.onMeasure(i, MeasureSpec.makeMeasureSpec(i3, 1073741824));
        } else {
            super.onMeasure(i, i2);
        }
    }
}
