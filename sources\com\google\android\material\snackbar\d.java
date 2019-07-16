package com.google.android.material.snackbar;

import android.view.View;

/* compiled from: BaseTransientBottomBar */
class d implements C1506mc {
    final /* synthetic */ BaseTransientBottomBar a;

    d(BaseTransientBottomBar baseTransientBottomBar) {
        this.a = baseTransientBottomBar;
    }

    public Ic a(View view, Ic ic) {
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), ic.b());
        return ic;
    }
}
