package com.soundcloud.android.image;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;

@EVa(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\\\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\fH&JT\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\n0\u00152\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\fH'J1\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\n0\u00152\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0017\u001a\u00020\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001aH&¢\u0006\u0002\u0010\u001bJ\b\u0010\u001c\u001a\u00020\u0003H&J\b\u0010\u001d\u001a\u00020\u0003H&¨\u0006\u001e"}, d2 = {"Lcom/soundcloud/android/image/ImageLoader;", "", "displayImage", "", "imageUrl", "", "imageView", "Landroid/widget/ImageView;", "fallbackConsumer", "Lio/reactivex/functions/Consumer;", "Lcom/soundcloud/android/image/LoadingState;", "circular", "", "placeholderDrawable", "Landroid/graphics/drawable/Drawable;", "displayType", "Lcom/soundcloud/android/image/DisplayType;", "apiImageSize", "Lcom/soundcloud/android/image/ApiImageSize;", "isHighPriority", "legacyDisplayImage", "Lio/reactivex/Observable;", "loadImage", "loadType", "Lcom/soundcloud/android/image/LoadType;", "blurRadius", "", "(Ljava/lang/String;Lcom/soundcloud/android/image/LoadType;Ljava/lang/Integer;)Lio/reactivex/Observable;", "pause", "resume", "image_release"}, mv = {1, 1, 15})
/* compiled from: ImageLoader.kt */
public interface r {

    /* compiled from: ImageLoader.kt */
    public static final class a {
        public static /* synthetic */ void a(r rVar, String str, ImageView imageView, C6776kQa kqa, boolean z, Drawable drawable, C3726g gVar, C3721b bVar, boolean z2, int i, Object obj) {
            int i2 = i;
            if (obj == null) {
                rVar.a(str, imageView, kqa, (i2 & 8) != 0 ? false : z, (i2 & 16) != 0 ? null : drawable, (i2 & 32) != 0 ? C3726g.DEFAULT : gVar, (i2 & 64) != 0 ? C3721b.Unknown : bVar, (i2 & 128) != 0 ? false : z2);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: displayImage");
        }

        public static /* synthetic */ APa a(r rVar, String str, ImageView imageView, boolean z, Drawable drawable, C3726g gVar, C3721b bVar, boolean z2, int i, Object obj) {
            if (obj == null) {
                return rVar.a(str, imageView, (i & 4) != 0 ? false : z, (i & 8) != 0 ? null : drawable, (i & 16) != 0 ? C3726g.DEFAULT : gVar, (i & 32) != 0 ? C3721b.Unknown : bVar, (i & 64) != 0 ? false : z2);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: legacyDisplayImage");
        }

        public static /* synthetic */ APa a(r rVar, String str, ba baVar, Integer num, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    baVar = ba.NONE;
                }
                if ((i & 4) != 0) {
                    num = null;
                }
                return rVar.a(str, baVar, num);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: loadImage");
        }
    }

    APa<ca> a(String str, ImageView imageView, boolean z, Drawable drawable, C3726g gVar, C3721b bVar, boolean z2);

    APa<ca> a(String str, ba baVar, Integer num);

    void a(String str, ImageView imageView, C6776kQa<ca> kqa, boolean z, Drawable drawable, C3726g gVar, C3721b bVar, boolean z2);

    void b();

    void pause();
}
