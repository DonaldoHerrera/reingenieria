package com.soundcloud.android.playback.ui;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior.a;

/* compiled from: SlidingPlayerController */
class Zb extends a {
    final /* synthetic */ ac a;

    Zb(ac acVar) {
        this.a = acVar;
    }

    public void a(View view, int i) {
        if (i == 1) {
            this.a.o = true;
        } else if (i == 3) {
            this.a.B();
        } else if (i == 4) {
            this.a.A();
        }
    }

    public void a(View view, float f) {
        this.a.a(Math.max(Math.min(f, 1.0f), 0.0f));
    }
}
