package com.soundcloud.android.view.behavior;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior;
import com.soundcloud.android.SoundCloudApplication;
import com.soundcloud.android.ia.i;

public class ScrollingViewContentBottomPaddingBehavior extends ScrollingViewBehavior {
    b h;

    public ScrollingViewContentBottomPaddingBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        SoundCloudApplication.f().a(this);
    }

    public boolean a(CoordinatorLayout coordinatorLayout, View view, View view2) {
        return super.a(coordinatorLayout, view, view2) || this.h.a(view2);
    }

    public boolean b(CoordinatorLayout coordinatorLayout, View view, View view2) {
        if (this.h.a(view2)) {
            this.h.a(coordinatorLayout.findViewById(i.bottom_navigation_view), view2, view);
        }
        return super.b(coordinatorLayout, view, view2);
    }
}
