package com.google.android.material.snackbar;

import android.view.View;
import android.view.View.OnClickListener;

/* compiled from: Snackbar */
class o implements OnClickListener {
    final /* synthetic */ OnClickListener a;
    final /* synthetic */ Snackbar b;

    o(Snackbar snackbar, OnClickListener onClickListener) {
        this.b = snackbar;
        this.a = onClickListener;
    }

    public void onClick(View view) {
        this.a.onClick(view);
        this.b.a(1);
    }
}
