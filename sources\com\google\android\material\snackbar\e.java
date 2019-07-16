package com.google.android.material.snackbar;

import android.os.Bundle;
import android.view.View;

/* compiled from: BaseTransientBottomBar */
class e extends C0273Wb {
    final /* synthetic */ BaseTransientBottomBar d;

    e(BaseTransientBottomBar baseTransientBottomBar) {
        this.d = baseTransientBottomBar;
    }

    public void a(View view, Mc mc) {
        super.a(view, mc);
        mc.a(1048576);
        mc.g(true);
    }

    public boolean a(View view, int i, Bundle bundle) {
        if (i != 1048576) {
            return super.a(view, i, bundle);
        }
        this.d.c();
        return true;
    }
}
