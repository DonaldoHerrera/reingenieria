package com.soundcloud.android.playback.ui;

import android.animation.ObjectAnimator;
import android.view.View;
import com.soundcloud.android.ia.i;

/* compiled from: TrackPagePresenter */
class jc implements d {
    final /* synthetic */ a a;
    final /* synthetic */ mc b;

    jc(mc mcVar, a aVar) {
        this.b = mcVar;
        this.a = aVar;
    }

    public void a(Mna mna) {
        this.a.da.accept(mna);
        for (View view : this.a.Q) {
            float[] fArr = new float[2];
            fArr[0] = view.getAlpha();
            fArr[1] = mna == Mna.SCRUBBING ? 0.0f : 1.0f;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", fArr);
            ofFloat.setDuration(100);
            ofFloat.start();
        }
    }

    public void a(float f, float f2) {
        this.a.ea.accept(Float.valueOf(f));
        Object tag = this.a.w.getTag(i.timestamp);
        if (tag != null) {
            this.b.y = Long.valueOf((long) (f2 * ((float) ((Long) tag).longValue())));
        }
    }
}
