package com.soundcloud.android.upgrade;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.squareup.picasso.E.d;

/* compiled from: GoOnboardingView */
class j extends b {
    final /* synthetic */ k a;

    j(k kVar) {
        this.a = kVar;
    }

    public void a(Bitmap bitmap, d dVar) {
        c.a(this.a.a, bitmap);
        if (this.a.f == this) {
            this.a.f = null;
        }
    }

    public void a(Exception exc, Drawable drawable) {
        if (this.a.f == this) {
            this.a.f = null;
        }
    }
}
