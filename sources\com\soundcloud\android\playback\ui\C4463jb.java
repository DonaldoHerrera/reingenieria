package com.soundcloud.android.playback.ui;

import android.animation.ObjectAnimator;
import android.content.res.Resources;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import com.soundcloud.android.ia.j;

/* renamed from: com.soundcloud.android.playback.ui.jb reason: case insensitive filesystem */
/* compiled from: OverlayAnimator */
public class C4463jb {
    private final int a;
    private ObjectAnimator b;

    public C4463jb(Resources resources) {
        this.a = resources.getInteger(j.overlay_animate_duration);
    }

    public void a(View view, float f) {
        a();
        view.setAlpha(f);
    }

    public void b(View view) {
        a();
        this.b = ObjectAnimator.ofFloat(view, "alpha", new float[]{view.getAlpha(), 1.0f});
        this.b.setDuration((long) this.a);
        this.b.start();
    }

    public void a(View view) {
        a();
        this.b = ObjectAnimator.ofFloat(view, "alpha", new float[]{view.getAlpha(), 0.0f});
        this.b.setInterpolator(new DecelerateInterpolator());
        this.b.setDuration((long) this.a);
        this.b.start();
    }

    private void a() {
        ObjectAnimator objectAnimator = this.b;
        if (objectAnimator != null && objectAnimator.isRunning()) {
            this.b.cancel();
        }
    }
}
