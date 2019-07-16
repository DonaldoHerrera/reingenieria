package com.soundcloud.android.player.ui.waveform;

import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;

/* compiled from: WaveformScrollView.kt */
public final class e implements OnGlobalLayoutListener {
    final /* synthetic */ WaveformScrollView a;
    final /* synthetic */ View b;
    final /* synthetic */ int c;

    e(WaveformScrollView waveformScrollView, View view, int i) {
        this.a = waveformScrollView;
        this.b = view;
        this.c = i;
    }

    public void onGlobalLayout() {
        View view = this.b;
        String str = "child";
        C7471uYa.a((Object) view, str);
        if (view.getWidth() > 0) {
            View view2 = this.b;
            C7471uYa.a((Object) view2, str);
            view2.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            this.a.scrollTo(this.c, 0);
        }
    }
}
