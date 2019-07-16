package com.google.android.material.snackbar;

import android.view.View;

/* compiled from: BaseTransientBottomBar */
class j implements d {
    final /* synthetic */ BaseTransientBottomBar a;

    j(BaseTransientBottomBar baseTransientBottomBar) {
        this.a = baseTransientBottomBar;
    }

    public void a(View view, int i, int i2, int i3, int i4) {
        this.a.f.setOnLayoutChangeListener(null);
        if (this.a.m()) {
            this.a.b();
        } else {
            this.a.l();
        }
    }
}
