package com.soundcloud.android.image;

import android.graphics.Bitmap;
import android.graphics.drawable.TransitionDrawable;

@EVa(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B3\b\u0007\u0012\u0014\b\u0001\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0014\b\u0001\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0003¢\u0006\u0002\u0010\tJ\u001e\u0010\n\u001a\u0010\u0012\f\u0012\n \f*\u0004\u0018\u00010\b0\b0\u000b2\u0006\u0010\r\u001a\u00020\u0007H\u0016J\u0012\u0010\u000e\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004H\u0012J\u0012\u0010\u0010\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0011\u001a\u00020\u0007H\u0016J,\u0010\u0012\u001a\u0004\u0018\u00010\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0017H\u0016R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0003X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/soundcloud/android/image/ImageCache;", "", "placeholderCache", "Lcom/soundcloud/android/cache/Cache;", "", "Landroid/graphics/drawable/TransitionDrawable;", "blurredImageCache", "Lcom/soundcloud/android/foundation/domain/Urn;", "Landroid/graphics/Bitmap;", "(Lcom/soundcloud/android/cache/Cache;Lcom/soundcloud/android/cache/Cache;)V", "cacheBlurredBitmap", "Lio/reactivex/functions/Consumer;", "kotlin.jvm.PlatformType", "resourceUrn", "cacheKeyForImageUrl", "imageUrl", "getBlurredImage", "urn", "getPlaceholderDrawable", "width", "", "height", "placeholderGenerator", "Lcom/soundcloud/android/image/PlaceholderGenerator;", "Companion", "image_release"}, mv = {1, 1, 15})
/* renamed from: com.soundcloud.android.image.k reason: case insensitive filesystem */
/* compiled from: ImageCache.kt */
public class C3730k {
    public static final a a = new a(null);
    private final C2964dS<String, TransitionDrawable> b;
    /* access modifiers changed from: private */
    public final C2964dS<C3508cda, Bitmap> c;

    /* renamed from: com.soundcloud.android.image.k$a */
    /* compiled from: ImageCache.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }
    }

    public C3730k(C2964dS<String, TransitionDrawable> dSVar, C2964dS<C3508cda, Bitmap> dSVar2) {
        C7471uYa.b(dSVar, "placeholderCache");
        C7471uYa.b(dSVar2, "blurredImageCache");
        this.b = dSVar;
        this.c = dSVar2;
    }

    private String a(String str) {
        Object d = C4928GKa.b(str).d("default_cache_key");
        C7471uYa.a(d, "Optional.fromNullable(im…rl).or(DEFAULT_CACHE_KEY)");
        return (String) d;
    }

    public TransitionDrawable a(String str, int i, int i2, qa qaVar) {
        C7471uYa.b(qaVar, "placeholderGenerator");
        StringBuilder sb = new StringBuilder();
        sb.append(a(str));
        sb.append('_');
        sb.append(i);
        sb.append('_');
        sb.append(i2);
        return (TransitionDrawable) this.b.a(sb.toString(), (defpackage.C2964dS.a<K, V>) new C3732m<K,V>(qaVar));
    }
}
