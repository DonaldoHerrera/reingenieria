package com.soundcloud.android.image;

import android.widget.ImageView;
import com.soundcloud.android.image.ca.c;
import com.squareup.picasso.C6247l;

/* compiled from: PicassoImageLoader.kt */
public final class ka implements C6247l {
    final /* synthetic */ la a;
    final /* synthetic */ BPa b;

    ka(la laVar, BPa bPa) {
        this.a = laVar;
        this.b = bPa;
    }

    public void a(Exception exc) {
        BPa bPa = this.b;
        la laVar = this.a;
        String str = laVar.b;
        ImageView imageView = laVar.c;
        if (exc == null) {
            exc = new IllegalStateException();
        }
        bPa.a(new c(str, imageView, exc));
        this.b.onComplete();
    }

    public void onSuccess() {
        la laVar = this.a;
        laVar.a.a(laVar.c, new ja(this));
        this.b.onComplete();
    }
}
