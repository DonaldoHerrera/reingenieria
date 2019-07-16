package com.google.android.material.textfield;

import android.view.View;
import android.view.View.OnClickListener;

/* compiled from: TextInputLayout */
class e implements OnClickListener {
    final /* synthetic */ TextInputLayout a;

    e(TextInputLayout textInputLayout) {
        this.a = textInputLayout;
    }

    public void onClick(View view) {
        this.a.a(false);
    }
}
