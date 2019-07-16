package com.google.android.material.chip;

import android.annotation.TargetApi;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* compiled from: Chip */
class b extends ViewOutlineProvider {
    final /* synthetic */ Chip a;

    b(Chip chip) {
        this.a = chip;
    }

    @TargetApi(21)
    public void getOutline(View view, Outline outline) {
        if (this.a.e != null) {
            this.a.e.getOutline(outline);
        } else {
            outline.setAlpha(0.0f);
        }
    }
}
