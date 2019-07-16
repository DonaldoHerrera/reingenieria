package com.google.android.gms.cast.framework.media.widget;

final /* synthetic */ class b implements Runnable {
    private final CastSeekBar a;

    b(CastSeekBar castSeekBar) {
        this.a = castSeekBar;
    }

    public final void run() {
        this.a.sendAccessibilityEvent(4);
    }
}
