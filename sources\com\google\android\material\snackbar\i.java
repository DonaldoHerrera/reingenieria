package com.google.android.material.snackbar;

import android.view.View;

/* compiled from: BaseTransientBottomBar */
class i implements c {
    final /* synthetic */ BaseTransientBottomBar a;

    i(BaseTransientBottomBar baseTransientBottomBar) {
        this.a = baseTransientBottomBar;
    }

    public void onViewAttachedToWindow(View view) {
    }

    public void onViewDetachedFromWindow(View view) {
        if (this.a.k()) {
            BaseTransientBottomBar.a.post(new h(this));
        }
    }
}
