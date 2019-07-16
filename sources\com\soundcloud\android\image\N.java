package com.soundcloud.android.image;

import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
import com.soundcloud.android.image.ca.b;
import com.soundcloud.android.image.r.a;
import com.soundcloud.android.image.sa.f;
import com.squareup.picasso.E;
import java.util.HashSet;
import java.util.concurrent.Callable;

/* compiled from: ImageOperations.kt */
public class N {
    private final HashSet<String> a = new HashSet<>();
    private final C3729j b = new C3729j(this.a);
    private final int c = 7;
    private final r d;
    private final X e;
    private final qa f;
    /* access modifiers changed from: private */
    public final E g;

    public N(r rVar, X x, qa qaVar, E e2) {
        C7471uYa.b(rVar, "imageLoader");
        C7471uYa.b(x, "imageUrlBuilder");
        C7471uYa.b(qaVar, "placeholderGenerator");
        C7471uYa.b(e2, "picasso");
        this.d = rVar;
        this.e = x;
        this.f = qaVar;
        this.g = e2;
    }

    public void a(C3508cda cda, C4928GKa<String> gKa, C3721b bVar, ImageView imageView) {
        a(this, cda, gKa, bVar, imageView, null, 16, null);
    }

    public APa<ca> b(C3508cda cda, C4928GKa<String> gKa, C3721b bVar, ImageView imageView) {
        C7471uYa.b(cda, "urn");
        C7471uYa.b(gKa, "imageUrlTemplate");
        C7471uYa.b(bVar, "apiImageSize");
        C7471uYa.b(imageView, "imageView");
        return a.a(this.d, b(cda, (String) gKa.d(), bVar), imageView, false, null, C3726g.FULL_IMAGE_DIALOG, bVar, false, 76, null);
    }

    public void c(C3508cda cda, C4928GKa<String> gKa, C3721b bVar, ImageView imageView) {
        C7471uYa.b(cda, "urn");
        C7471uYa.b(gKa, "imageUrlTemplate");
        C7471uYa.b(bVar, "apiImageSize");
        C7471uYa.b(imageView, "imageView");
        a(imageView, b(cda, (String) gKa.d(), bVar), bVar);
    }

    private String b(C3508cda cda, String str, C3721b bVar) {
        String a2 = this.e.a(str, cda, bVar);
        if (C7676xWa.a((Iterable) this.a, (Object) a2)) {
            return null;
        }
        return a2;
    }

    public void a(C3508cda cda, C4928GKa<String> gKa, C3721b bVar, ImageView imageView, boolean z) {
        C3508cda cda2 = cda;
        C3721b bVar2 = bVar;
        C7471uYa.b(cda, "urn");
        C4928GKa<String> gKa2 = gKa;
        C7471uYa.b(gKa, "imageUrlTemplate");
        C7471uYa.b(bVar, "apiImageSize");
        C7471uYa.b(imageView, "imageView");
        a.a(this.d, b(cda, (String) gKa.d(), bVar), imageView, this.b, z, null, null, bVar2, false, 176, null);
    }

    public void b() {
        this.d.b();
    }

    public IPa<Bitmap> a(C3508cda cda, String str, C3721b bVar, ImageView imageView, Drawable drawable, boolean z) {
        C3508cda cda2 = cda;
        C3721b bVar2 = bVar;
        C7471uYa.b(cda, "urn");
        C7471uYa.b(bVar, "apiImageSize");
        ImageView imageView2 = imageView;
        C7471uYa.b(imageView, "imageView");
        r rVar = this.d;
        IPa<Bitmap> g2 = a.a(rVar, b(cda, (String) C4928GKa.b(str).d(), bVar), imageView2, z, (Drawable) C4928GKa.b(drawable).d(), null, bVar2, false, 80, null).a((FPa<? super T, ? extends R>) new K<Object,Object>(new E(this))).g();
        C7471uYa.a((Object) g2, "imageLoader.legacyDispla…          .firstOrError()");
        return g2;
    }

    public void a(ImageView imageView) {
        C7471uYa.b(imageView, "imageView");
        a(this, imageView, (String) null, (C3721b) null, 6, (Object) null);
    }

    static /* synthetic */ void a(N n, ImageView imageView, String str, C3721b bVar, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                str = null;
            }
            if ((i & 4) != 0) {
                bVar = C3721b.Unknown;
            }
            n.a(imageView, str, bVar);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: displayWithPlaceholder");
    }

    private void a(ImageView imageView, String str, C3721b bVar) {
        a.a(this.d, str, imageView, this.b, false, null, C3726g.PLACEHOLDER, bVar, false, 152, null);
    }

    /* access modifiers changed from: private */
    public APa<Bitmap> a(APa<ca> aPa) {
        APa<Bitmap> h = aPa.b(b.class).h(L.a);
        C7471uYa.a((Object) h, "input.ofType(LoadingStat…a).map { it.loadedImage }");
        return h;
    }

    public static /* synthetic */ void a(N n, C3508cda cda, C4928GKa gKa, C3721b bVar, ImageView imageView, Drawable drawable, int i, Object obj) {
        if (obj == null) {
            if ((i & 16) != 0) {
                drawable = null;
            }
            n.a(cda, gKa, bVar, imageView, drawable);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: displayCircularWithPlaceholder");
    }

    public void a(C3508cda cda, C4928GKa<String> gKa, C3721b bVar, ImageView imageView, Drawable drawable) {
        C3508cda cda2 = cda;
        C3721b bVar2 = bVar;
        C7471uYa.b(cda, "urn");
        C4928GKa<String> gKa2 = gKa;
        C7471uYa.b(gKa, "imageUrlTemplate");
        C7471uYa.b(bVar2, "apiImageSize");
        C7471uYa.b(imageView, "imageView");
        a.a(this.d, b(cda, (String) gKa.d(), bVar2), imageView, this.b, true, null, null, bVar2, false, 176, null);
    }

    public IPa<C4928GKa<Fd>> a(C3508cda cda, C4928GKa<String> gKa, C3721b bVar, ImageView imageView, Bitmap bitmap, boolean z) {
        C3508cda cda2 = cda;
        C3721b bVar2 = bVar;
        Bitmap bitmap2 = bitmap;
        C7471uYa.b(cda, "urn");
        C4928GKa<String> gKa2 = gKa;
        C7471uYa.b(gKa, "imageUrlTemplate");
        C7471uYa.b(bVar, "apiImageSize");
        C7471uYa.b(imageView, "imageView");
        IPa<C4928GKa<Fd>> b2 = a.a(this.d, b(cda, (String) gKa.d(), bVar), imageView, false, bitmap2 != null ? new BitmapDrawable(imageView.getResources(), bitmap2) : null, C3726g.PLAYER, bVar, z, 4, null).d((C6776kQa<? super T>) this.b).a((FPa<? super T, ? extends R>) new F<Object,Object>(this)).h(G.a).b(C4928GKa.a());
        C7471uYa.a((Object) b2, "imageLoader.legacyDispla….first(Optional.absent())");
        return b2;
    }

    public APa<ca> a(String str, ImageView imageView) {
        C7471uYa.b(str, "uri");
        C7471uYa.b(imageView, "imageView");
        return a.a(this.d, str, imageView, false, null, C3726g.AD, null, false, 108, null);
    }

    public APa<ca> a(Uri uri, ba baVar) {
        C7471uYa.b(uri, "uri");
        C7471uYa.b(baVar, "loadType");
        r rVar = this.d;
        String uri2 = uri.toString();
        C7471uYa.a((Object) uri2, "uri.toString()");
        return a.a(rVar, uri2, baVar, null, 4, null);
    }

    public C7531vPa<Bitmap> a(C3508cda cda, C3721b bVar, ba baVar) {
        C3508cda cda2 = cda;
        C7471uYa.b(cda, "urn");
        C3721b bVar2 = bVar;
        C7471uYa.b(bVar, "apiImageSize");
        C7471uYa.b(baVar, "loadType");
        String a2 = a(this, cda2, (String) null, bVar2, 2, (Object) null);
        if (a2 != null) {
            C7531vPa<Bitmap> i = a.a(this.d, a2, baVar, null, 4, null).a((FPa<? super T, ? extends R>) new J<Object,Object>(new C(this))).g().i();
            C7471uYa.a((Object) i, "imageLoader.loadImage(it….firstOrError().toMaybe()");
            return i;
        }
        C7531vPa<Bitmap> c2 = C7531vPa.c();
        C7471uYa.a((Object) c2, "Maybe.empty()");
        return c2;
    }

    /* access modifiers changed from: private */
    public APa<Bitmap> a(APa<ca> aPa, PXa<Bitmap> pXa) {
        APa<Bitmap> f2 = aPa.f((C7118pQa<? super T, ? extends C7669xPa<? extends R>>) new M<Object,Object>(pXa));
        C7471uYa.a((Object) f2, "input.flatMapMaybe {\n   …)\n            }\n        }");
        return f2;
    }

    public IPa<Bitmap> a(C3508cda cda, C4928GKa<String> gKa, C3721b bVar, int i, int i2) {
        C7471uYa.b(cda, "urn");
        C7471uYa.b(gKa, "imageUrlTemplate");
        C7471uYa.b(bVar, "apiImageSize");
        IPa<Bitmap> g2 = a(cda, (String) gKa.d(), bVar).a((FPa<? super T, ? extends R>) new B<Object,Object>(this, cda, i, i2)).g();
        C7471uYa.a((Object) g2, "load(urn, imageUrlTempla…eight) } }.firstOrError()");
        return g2;
    }

    @SuppressLint({"CheckResult"})
    public void a(C3508cda cda, C4928GKa<String> gKa, C3721b bVar) {
        C7471uYa.b(cda, "urn");
        C7471uYa.b(gKa, "imageUrlTemplate");
        C7471uYa.b(bVar, "apiImageSize");
        String b2 = b(cda, (String) gKa.d(), bVar);
        if (b2 != null) {
            APa a2 = a.a(this.d, b2, ba.PREFETCH, null, 4, null);
            if (a2 != null) {
                a2.f((C6776kQa<? super T>) this.b);
            }
        }
    }

    public C7531vPa<Bitmap> a(Resources resources, C3508cda cda, C4928GKa<String> gKa, HPa hPa) {
        C7471uYa.b(resources, "resources");
        C7471uYa.b(cda, "urn");
        C7471uYa.b(gKa, "imageUrlTemplate");
        C7471uYa.b(hPa, "scheduler");
        C3721b c2 = C3721b.c(resources);
        C7471uYa.a((Object) c2, "ApiImageSize.getListItemImageSize(resources)");
        return a(cda, gKa, c2, hPa, resources.getDimensionPixelSize(f.list_item_image_dimension), resources.getDimensionPixelSize(f.list_item_image_dimension));
    }

    public C7531vPa<Bitmap> a(C3508cda cda, C4928GKa<String> gKa, C3721b bVar, HPa hPa, int i, int i2) {
        C7471uYa.b(cda, "urn");
        C7471uYa.b(gKa, "imageUrlTemplate");
        C7471uYa.b(bVar, "apiImageSize");
        C7471uYa.b(hPa, "scheduler");
        String a2 = this.e.a((String) gKa.d(), cda, bVar);
        if (a2 == null) {
            C7531vPa<Bitmap> c2 = C7531vPa.c();
            C7471uYa.a((Object) c2, "Maybe.empty()");
            return c2;
        }
        C7531vPa<Bitmap> b2 = C7531vPa.b((Callable<? extends T>) new H<Object>(this, a2, i, i2)).b(hPa);
        C7471uYa.a((Object) b2, "Maybe.fromCallable<Bitma… }.subscribeOn(scheduler)");
        return b2;
    }

    public Bitmap a(Resources resources, int i) {
        C7471uYa.b(resources, "resources");
        return BitmapFactory.decodeResource(resources, i);
    }

    public APa<ca> a(C3508cda cda, String str, ImageView imageView) {
        C7471uYa.b(cda, "urn");
        C7471uYa.b(str, "imageUri");
        C7471uYa.b(imageView, "imageView");
        return a.a(this.d, str, imageView, false, null, C3726g.STREAM_AD_IMAGE, null, false, 108, null);
    }

    public IPa<Bitmap> a(String str) {
        C7471uYa.b(str, "imageUri");
        IPa<Bitmap> g2 = a.a(this.d, str, null, null, 6, null).f((C7118pQa<? super T, ? extends C7669xPa<? extends R>>) I.a).g();
        C7471uYa.a((Object) g2, "imageLoader.loadImage(im…         }.firstOrError()");
        return g2;
    }

    private APa<ca> a(C3508cda cda, String str, C3721b bVar) {
        String b2 = b(cda, str, bVar);
        APa<ca> a2 = b2 != null ? a.a(this.d, b2, null, null, 6, null) : null;
        if (a2 != null) {
            return a2;
        }
        APa<ca> e2 = APa.e();
        C7471uYa.a((Object) e2, "Observable.empty<LoadingState>()");
        return e2;
    }

    static /* synthetic */ String a(N n, C3508cda cda, String str, C3721b bVar, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                str = null;
            }
            return n.b(cda, str, bVar);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toImageUrl");
    }

    public static /* synthetic */ C7531vPa a(N n, Resources resources, C3508cda cda, C4928GKa gKa, ba baVar, HPa hPa, HPa hPa2, Integer num, int i, Object obj) {
        Integer num2;
        if (obj == null) {
            if ((i & 64) != 0) {
                num2 = Integer.valueOf(n.c);
            } else {
                N n2 = n;
                num2 = num;
            }
            return n.a(resources, cda, gKa, baVar, hPa, hPa2, num2);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: blurredBitmap");
    }

    public C7531vPa<Bitmap> a(Resources resources, C3508cda cda, C4928GKa<String> gKa, ba baVar, HPa hPa, HPa hPa2, Integer num) {
        C7471uYa.b(resources, "resources");
        C7471uYa.b(cda, "urn");
        C7471uYa.b(gKa, "imageUrlTemplate");
        C7471uYa.b(baVar, "loadType");
        C7471uYa.b(hPa, "scheduleOn");
        C7471uYa.b(hPa2, "observeOn");
        String str = (String) gKa.d();
        C3721b c2 = C3721b.c(resources);
        C7471uYa.a((Object) c2, "ApiImageSize.getListItemImageSize(resources)");
        String b2 = b(cda, str, c2);
        if (b2 != null) {
            C7531vPa<Bitmap> a2 = this.d.a(b2, baVar, num).a((FPa<? super T, ? extends R>) new J<Object,Object>(new D(this))).f().b(hPa).a(hPa2);
            C7471uYa.a((Object) a2, "imageLoader.loadImage(it…    .observeOn(observeOn)");
            return a2;
        }
        C7531vPa<Bitmap> c3 = C7531vPa.c();
        C7471uYa.a((Object) c3, "Maybe.empty()");
        return c3;
    }

    /* access modifiers changed from: private */
    public Bitmap a(C3508cda cda, int i, int i2) {
        Bitmap a2 = Z.a(this.f.a(cda.toString()), i, i2);
        C7471uYa.a((Object) a2, "ImageUtils.toBitmap(fall…kDrawable, width, height)");
        return a2;
    }

    public void a() {
        this.d.pause();
    }
}
