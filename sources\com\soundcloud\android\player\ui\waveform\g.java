package com.soundcloud.android.player.ui.waveform;

/* compiled from: WaveformView.kt */
public final class g extends C1515ml {
    final /* synthetic */ C1577ol a;
    final /* synthetic */ WaveformView b;

    g(C1577ol olVar, WaveformView waveformView) {
        this.a = olVar;
        this.b = waveformView;
    }

    public void a(C1577ol olVar) {
        float b2 = (float) this.a.b();
        this.b.getRightWaveform().setScaleY(b2);
        this.b.getLeftWaveform().setScaleY(b2);
    }
}
