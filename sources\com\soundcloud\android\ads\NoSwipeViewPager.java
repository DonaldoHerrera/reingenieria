package com.soundcloud.android.ads;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.soundcloud.android.view.SafeViewPager;

public class NoSwipeViewPager extends SafeViewPager {
    public NoSwipeViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }
}
