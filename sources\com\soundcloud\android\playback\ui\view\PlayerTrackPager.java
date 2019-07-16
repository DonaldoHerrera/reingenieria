package com.soundcloud.android.playback.ui.view;

import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.viewpager.widget.ViewPager;
import com.soundcloud.android.playback.ui.view.m.b;
import com.soundcloud.android.view.SafeViewPager;

public class PlayerTrackPager extends SafeViewPager {
    private final m ma = m.a((ViewPager) this);
    private boolean na = true;

    public PlayerTrackPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public boolean a() {
        this.na = false;
        return super.a();
    }

    public void c() {
        super.c();
        this.na = true;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.na) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return true;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.na) {
            return true;
        }
        this.ma.a(motionEvent);
        return super.onTouchEvent(motionEvent);
    }

    public void setPagingEnabled(boolean z) {
        this.na = z;
    }

    public void setSwipeListener(b bVar) {
        this.ma.a(bVar);
    }
}
