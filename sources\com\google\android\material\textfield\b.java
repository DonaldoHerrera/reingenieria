package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;

/* compiled from: IndicatorViewController */
class b extends AnimatorListenerAdapter {
    final /* synthetic */ int a;
    final /* synthetic */ TextView b;
    final /* synthetic */ int c;
    final /* synthetic */ TextView d;
    final /* synthetic */ c e;

    b(c cVar, int i, TextView textView, int i2, TextView textView2) {
        this.e = cVar;
        this.a = i;
        this.b = textView;
        this.c = i2;
        this.d = textView2;
    }

    public void onAnimationEnd(Animator animator) {
        this.e.i = this.a;
        this.e.g = null;
        TextView textView = this.b;
        if (textView != null) {
            textView.setVisibility(4);
            if (this.c == 1 && this.e.m != null) {
                this.e.m.setText(null);
            }
        }
    }

    public void onAnimationStart(Animator animator) {
        TextView textView = this.d;
        if (textView != null) {
            textView.setVisibility(0);
        }
    }
}
