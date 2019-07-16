package com.soundcloud.android.image;

import android.widget.ImageView;
import com.soundcloud.android.image.ca.c;
import com.squareup.picasso.C6247l;

/* compiled from: PicassoImageLoader.kt */
public final class ha implements C6247l {
    final /* synthetic */ oa a;
    final /* synthetic */ ImageView b;
    final /* synthetic */ C6776kQa c;
    final /* synthetic */ String d;

    ha(oa oaVar, ImageView imageView, C6776kQa kqa, String str) {
        this.a = oaVar;
        this.b = imageView;
        this.c = kqa;
        this.d = str;
    }

    public void a(Exception exc) {
        C6776kQa kqa = this.c;
        String str = this.d;
        ImageView imageView = this.b;
        if (exc == null) {
            exc = new IllegalStateException("Image Loading failed with no exception");
        }
        kqa.accept(new c(str, imageView, exc));
    }

    public void onSuccess() {
        this.a.a(this.b, new ga(this));
    }
}
