package com.soundcloud.android.player.ui.waveform;

/* compiled from: WaveformView.kt */
final class f implements Runnable {
    final /* synthetic */ WaveformView a;

    f(WaveformView waveformView) {
        this.a = waveformView;
    }

    public final void run() {
        this.a.getLeftWaveform().requestLayout();
        this.a.getRightWaveform().requestLayout();
        this.a.getLeftLine().requestLayout();
        this.a.getRightLine().requestLayout();
        this.a.t.requestLayout();
    }
}
