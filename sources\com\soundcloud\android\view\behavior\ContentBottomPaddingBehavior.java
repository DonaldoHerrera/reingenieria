package com.soundcloud.android.view.behavior;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior;
import com.soundcloud.android.SoundCloudApplication;
import com.soundcloud.android.ia.i;

public class ContentBottomPaddingBehavior extends Behavior<View> {
    b a;

    public ContentBottomPaddingBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        SoundCloudApplication.f().a(this);
    }

    public boolean a(CoordinatorLayout coordinatorLayout, View view, View view2) {
        return this.a.a(view2);
    }

    public boolean b(CoordinatorLayout coordinatorLayout, View view, View view2) {
        this.a.a(coordinatorLayout.findViewById(i.bottom_navigation_view), view2, view);
        return false;
    }
}
