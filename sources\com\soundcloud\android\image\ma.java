package com.soundcloud.android.image;

import com.soundcloud.android.image.ca.a;

/* compiled from: PicassoImageLoader.kt */
final class ma implements C6708jQa {
    final /* synthetic */ na a;
    final /* synthetic */ BPa b;

    ma(na naVar, BPa bPa) {
        this.a = naVar;
        this.b = bPa;
    }

    public final void cancel() {
        this.b.a(new a(this.a.b, null));
        this.b.onComplete();
    }
}
