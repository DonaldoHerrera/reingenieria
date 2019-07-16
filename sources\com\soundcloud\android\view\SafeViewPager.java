package com.soundcloud.android.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.HorizontalScrollView;
import androidx.viewpager.widget.ViewPager;

public class SafeViewPager extends ViewPager {
    public SafeViewPager(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    public boolean a(View view, boolean z, int i, int i2, int i3) {
        return super.a(view, z, i, i2, i3) || (z && c(view));
    }

    /* access modifiers changed from: protected */
    public boolean c(View view) {
        return view instanceof HorizontalScrollView;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        try {
            return super.onInterceptTouchEvent(motionEvent);
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        try {
            return super.onTouchEvent(motionEvent);
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    public SafeViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
