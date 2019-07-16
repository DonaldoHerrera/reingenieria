package com.google.android.material.transformation;

import android.view.View;
import android.view.ViewTreeObserver.OnPreDrawListener;

/* compiled from: ExpandableBehavior */
class a implements OnPreDrawListener {
    final /* synthetic */ View a;
    final /* synthetic */ int b;
    final /* synthetic */ Rz c;
    final /* synthetic */ ExpandableBehavior d;

    a(ExpandableBehavior expandableBehavior, View view, int i, Rz rz) {
        this.d = expandableBehavior;
        this.a = view;
        this.b = i;
        this.c = rz;
    }

    public boolean onPreDraw() {
        this.a.getViewTreeObserver().removeOnPreDrawListener(this);
        if (this.d.a == this.b) {
            ExpandableBehavior expandableBehavior = this.d;
            Rz rz = this.c;
            expandableBehavior.a((View) rz, this.a, rz.a(), false);
        }
        return false;
    }
}
