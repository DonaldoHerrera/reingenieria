package com.soundcloud.android.view;

import android.view.View;
import android.view.View.OnClickListener;

/* compiled from: EmptyView */
class z implements OnClickListener {
    final /* synthetic */ EmptyView a;

    z(EmptyView emptyView) {
        this.a = emptyView;
    }

    public void onClick(View view) {
        if (this.a.m != null) {
            this.a.m.a();
        }
    }
}
