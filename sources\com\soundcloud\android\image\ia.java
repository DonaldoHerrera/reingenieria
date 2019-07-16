package com.soundcloud.android.image;

import com.soundcloud.android.image.ca.a;

/* compiled from: PicassoImageLoader.kt */
final class ia implements C6708jQa {
    final /* synthetic */ la a;
    final /* synthetic */ BPa b;

    ia(la laVar, BPa bPa) {
        this.a = laVar;
        this.b = bPa;
    }

    public final void cancel() {
        BPa bPa = this.b;
        la laVar = this.a;
        bPa.a(new a(laVar.b, laVar.c));
        this.b.onComplete();
    }
}
