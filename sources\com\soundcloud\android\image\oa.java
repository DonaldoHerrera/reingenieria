package com.soundcloud.android.image;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.widget.ImageView;
import com.soundcloud.android.image.ca.c;
import com.squareup.picasso.C6247l;
import com.squareup.picasso.E;
import com.squareup.picasso.E.e;
import com.squareup.picasso.L;
import com.squareup.picasso.U;
import com.squareup.picasso.z;

@SuppressLint({"sc.SilentExceptionUsage"})
/* compiled from: PicassoImageLoader.kt */
public final class oa implements r {
    private final Context a;
    private final boolean b;
    private final C3730k c;
    private final qa d;
    private final C3724e e;
    private final C3469VY f;
    /* access modifiers changed from: private */
    public final E g;

    public oa(Context context, boolean z, C3730k kVar, qa qaVar, C3724e eVar, C3469VY vy, E e2) {
        C7471uYa.b(context, "context");
        C7471uYa.b(kVar, "imageCache");
        C7471uYa.b(qaVar, "placeholderGenerator");
        C7471uYa.b(eVar, "circularPlaceholderGenerator");
        C7471uYa.b(vy, "errorReporter");
        C7471uYa.b(e2, "picasso");
        this.a = context;
        this.b = z;
        this.c = kVar;
        this.d = qaVar;
        this.e = eVar;
        this.f = vy;
        this.g = e2;
    }

    public void b() {
        this.g.c((Object) "SoundCloud-Android");
    }

    public void pause() {
        this.g.b((Object) "SoundCloud-Android");
    }

    public final Context a() {
        return this.a;
    }

    public void a(String str, ImageView imageView, C6776kQa<ca> kqa, boolean z, Drawable drawable, C3726g gVar, C3721b bVar, boolean z2) {
        C7471uYa.b(imageView, "imageView");
        C7471uYa.b(kqa, "callback");
        C7471uYa.b(gVar, "displayType");
        C7471uYa.b(bVar, "apiImageSize");
        if (drawable == null) {
            drawable = a(str, imageView.getWidth(), imageView.getHeight(), z);
        }
        Drawable drawable2 = drawable;
        if (str == null || str.length() == 0) {
            imageView.setImageDrawable(drawable2);
            kqa.accept(new c(str, imageView, new da("Empty image URL requested")));
            return;
        }
        a(bVar, gVar, z2, str, z, drawable2).a(imageView, (C6247l) new ha(this, imageView, kqa, str));
    }

    public APa<ca> a(String str, ImageView imageView, boolean z, Drawable drawable, C3726g gVar, C3721b bVar, boolean z2) {
        ImageView imageView2 = imageView;
        C7471uYa.b(imageView, "imageView");
        C3726g gVar2 = gVar;
        C7471uYa.b(gVar, "displayType");
        C3721b bVar2 = bVar;
        C7471uYa.b(bVar2, "apiImageSize");
        la laVar = new la(this, str, imageView2, drawable, z, bVar2, gVar2, z2);
        APa<ca> a2 = APa.a((CPa<T>) laVar);
        C7471uYa.a((Object) a2, "Observable.create { emit…             })\n        }");
        return a2;
    }

    /* access modifiers changed from: private */
    public final L a(C3721b bVar, C3726g gVar, boolean z, String str, boolean z2, Drawable drawable) {
        Config config;
        if (C3721b.i.contains(bVar) || this.b) {
            config = Config.RGB_565;
        } else {
            config = Config.ARGB_8888;
        }
        z a2 = a(gVar);
        e eVar = z ? e.HIGH : e.NORMAL;
        L a3 = this.g.a(str);
        a3.a((Object) "SoundCloud-Android");
        a3.a(config);
        a3.a(eVar);
        if (z2) {
            Resources resources = this.a.getResources();
            C7471uYa.a((Object) resources, "context.resources");
            a3.a((U) new C3723d(resources));
        }
        if (drawable != null) {
            a3.b(drawable);
            a3.a(drawable);
        }
        if (a2 != null) {
            a3.a(a2, new z[0]);
        }
        C7471uYa.a((Object) a3, "picasso.load(imageUrl)\n …          }\n            }");
        return a3;
    }

    public final void a(ImageView imageView, _Xa<? super Bitmap, RVa> _xa) {
        C7471uYa.b(imageView, "$this$invokeWithBitmapOrReport");
        C7471uYa.b(_xa, "consumer");
        Drawable drawable = imageView.getDrawable();
        Bitmap bitmap = null;
        if (drawable instanceof BitmapDrawable) {
            Drawable drawable2 = imageView.getDrawable();
            if (drawable2 != null) {
                bitmap = ((BitmapDrawable) drawable2).getBitmap();
            } else {
                throw new OVa("null cannot be cast to non-null type android.graphics.drawable.BitmapDrawable");
            }
        } else if (drawable instanceof androidx.core.graphics.drawable.c) {
            Drawable drawable3 = imageView.getDrawable();
            if (drawable3 != null) {
                bitmap = ((androidx.core.graphics.drawable.c) drawable3).a();
            } else {
                throw new OVa("null cannot be cast to non-null type androidx.core.graphics.drawable.RoundedBitmapDrawable");
            }
        } else {
            C3469VY vy = this.f;
            Drawable drawable4 = imageView.getDrawable();
            C7471uYa.a((Object) drawable4, "drawable");
            a.a(vy, new xa(drawable4), null, 2, null);
        }
        if (bitmap != null) {
            _xa.invoke(bitmap);
        }
    }

    private final z a(C3726g gVar) {
        switch (fa.a[gVar.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                return null;
            case 5:
            case 6:
                return z.NO_STORE;
            default:
                throw new FVa();
        }
    }

    private final z a(ba baVar) {
        int i = fa.b[baVar.ordinal()];
        if (i == 1 || i == 2) {
            return z.NO_STORE;
        }
        if (i == 3) {
            return null;
        }
        throw new FVa();
    }

    public APa<ca> a(String str, ba baVar, Integer num) {
        C7471uYa.b(str, "imageUrl");
        C7471uYa.b(baVar, "loadType");
        z a2 = a(baVar);
        if (str.length() == 0) {
            APa<ca> c2 = APa.c(new c(str, null, new da("Missing Image URL")));
            C7471uYa.a((Object) c2, "Observable.just(LoadingS…on(\"Missing Image URL\")))");
            return c2;
        }
        APa<ca> a3 = APa.a((CPa<T>) new na<T>(this, str, a2, num));
        C7471uYa.a((Object) a3, "Observable.create { emit…)\n            }\n        }");
        return a3;
    }

    /* access modifiers changed from: private */
    public final TransitionDrawable a(String str, int i, int i2, boolean z) {
        return this.c.a(str, i, i2, z ? this.e : this.d);
    }
}
