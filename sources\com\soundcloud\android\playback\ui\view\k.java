package com.soundcloud.android.playback.ui.view;

/* compiled from: TimestampView */
class k extends C1515ml {
    final /* synthetic */ TimestampView a;

    k(TimestampView timestampView) {
        this.a = timestampView;
    }

    public void a(C1577ol olVar) {
        float b = (float) olVar.b();
        this.a.a.setTranslationY(((float) this.a.getTimestampScrubY()) * b);
        float f = b * 2.2f;
        this.a.a.setScaleX(f);
        this.a.a.setScaleY(f);
        this.a.b(true);
    }
}
