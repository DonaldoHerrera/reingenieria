package com.soundcloud.android.main;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior;
import com.soundcloud.android.ia.i;
import com.soundcloud.android.ia.r;

public class PlayerOverlayBackgroundBehavior extends Behavior<View> {
    private final int a;

    public PlayerOverlayBackgroundBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r.PlayerOverlayBackgroundBehavior);
        this.a = obtainStyledAttributes.getDimensionPixelSize(r.PlayerOverlayBackgroundBehavior_player_collapsed_height, 0);
        obtainStyledAttributes.recycle();
    }

    public boolean a(CoordinatorLayout coordinatorLayout, View view, View view2) {
        return view2.getId() == i.player_root;
    }

    public boolean b(CoordinatorLayout coordinatorLayout, View view, View view2) {
        view.setAlpha(1.0f - (view2.getY() / ((float) (coordinatorLayout.getMeasuredHeight() - this.a))));
        return false;
    }
}
