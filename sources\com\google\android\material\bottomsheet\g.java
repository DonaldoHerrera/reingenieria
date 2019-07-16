package com.google.android.material.bottomsheet;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior.a;

/* compiled from: BottomSheetDialog */
class g extends a {
    final /* synthetic */ h a;

    g(h hVar) {
        this.a = hVar;
    }

    public void a(View view, float f) {
    }

    public void a(View view, int i) {
        if (i == 5) {
            this.a.cancel();
        }
    }
}
