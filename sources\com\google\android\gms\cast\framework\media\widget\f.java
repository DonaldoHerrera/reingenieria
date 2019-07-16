package com.google.android.gms.cast.framework.media.widget;

import android.view.View;
import android.view.View.OnClickListener;

final class f implements OnClickListener {
    private final /* synthetic */ ExpandedControllerActivity a;

    f(ExpandedControllerActivity expandedControllerActivity) {
        this.a = expandedControllerActivity;
    }

    public final void onClick(View view) {
        if (this.a.G.isClickable()) {
            this.a.w().w();
        }
    }
}
