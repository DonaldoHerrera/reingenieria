package com.google.android.material.bottomsheet;

import android.view.View;

/* compiled from: BottomSheetBehavior */
class a implements Runnable {
    final /* synthetic */ View a;
    final /* synthetic */ int b;
    final /* synthetic */ BottomSheetBehavior c;

    a(BottomSheetBehavior bottomSheetBehavior, View view, int i) {
        this.c = bottomSheetBehavior;
        this.a = view;
        this.b = i;
    }

    public void run() {
        this.c.a(this.a, this.b);
    }
}
