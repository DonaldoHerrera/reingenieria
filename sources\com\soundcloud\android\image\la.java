package com.soundcloud.android.image;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.soundcloud.android.image.ca.c;
import com.soundcloud.android.image.ca.d;
import com.squareup.picasso.C6247l;

/* compiled from: PicassoImageLoader.kt */
final class la<T> implements CPa<T> {
    final /* synthetic */ oa a;
    final /* synthetic */ String b;
    final /* synthetic */ ImageView c;
    final /* synthetic */ Drawable d;
    final /* synthetic */ boolean e;
    final /* synthetic */ C3721b f;
    final /* synthetic */ C3726g g;
    final /* synthetic */ boolean h;

    la(oa oaVar, String str, ImageView imageView, Drawable drawable, boolean z, C3721b bVar, C3726g gVar, boolean z2) {
        this.a = oaVar;
        this.b = str;
        this.c = imageView;
        this.d = drawable;
        this.e = z;
        this.f = bVar;
        this.g = gVar;
        this.h = z2;
    }

    public final void a(BPa<ca> bPa) {
        C7471uYa.b(bPa, "emitter");
        bPa.a(new d(this.b, this.c));
        bPa.a((C6708jQa) new ia(this, bPa));
        Drawable drawable = this.d;
        if (drawable == null) {
            drawable = this.a.a(this.b, this.c.getWidth(), this.c.getHeight(), this.e);
        }
        Drawable drawable2 = drawable;
        String str = this.b;
        if (str == null || str.length() == 0) {
            this.c.setImageDrawable(drawable2);
            bPa.a(new c(this.b, this.c, new da("Empty image URL requested")));
            bPa.onComplete();
            return;
        }
        this.a.a(this.f, this.g, this.h, this.b, this.e, drawable2).a(this.c, (C6247l) new ka(this, bPa));
    }
}
