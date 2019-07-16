package com.soundcloud.android.playback.ui;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.widget.ImageView;
import com.soundcloud.android.image.N;
import com.soundcloud.android.image.ba;

@EVa(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB)\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0002\u0010\tJ\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\u000eH\u0016J6\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u00102\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u001a\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/soundcloud/android/playback/ui/BlurringPlayerArtworkLoader;", "Lcom/soundcloud/android/playback/ui/PlayerArtworkLoader;", "imageOperations", "Lcom/soundcloud/android/image/ImageOperations;", "resources", "Landroid/content/res/Resources;", "graphicsScheduler", "Lio/reactivex/Scheduler;", "observeOnScheduler", "(Lcom/soundcloud/android/image/ImageOperations;Landroid/content/res/Resources;Lio/reactivex/Scheduler;Lio/reactivex/Scheduler;)V", "loadAdBackgroundImage", "Lio/reactivex/Maybe;", "Landroid/graphics/Bitmap;", "trackUrn", "Lcom/soundcloud/android/foundation/domain/Urn;", "loadArtwork", "Lio/reactivex/Single;", "Lcom/soundcloud/java/optional/Optional;", "Landroidx/palette/graphics/Palette;", "imageResource", "Lcom/soundcloud/android/foundation/domain/ImageResource;", "wrappedImageView", "Landroid/widget/ImageView;", "imageOverlay", "isHighPriority", "", "loadBlurredArtwork", "Lio/reactivex/Completable;", "Companion", "base_release"}, mv = {1, 1, 15})
/* compiled from: BlurringPlayerArtworkLoader.kt */
public class Ra extends C4504xb {
    public static final a d = new a(null);
    private final HPa e;
    private final HPa f;

    /* compiled from: BlurringPlayerArtworkLoader.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }
    }

    public Ra(N n, Resources resources, HPa hPa) {
        this(n, resources, hPa, null, 8, null);
    }

    public /* synthetic */ Ra(N n, Resources resources, HPa hPa, HPa hPa2, int i, C7264rYa rya) {
        if ((i & 8) != 0) {
            hPa2 = RPa.a();
            C7471uYa.a((Object) hPa2, "AndroidSchedulers.mainThread()");
        }
        this(n, resources, hPa, hPa2);
    }

    public Ra(N n, Resources resources, HPa hPa, HPa hPa2) {
        C7471uYa.b(n, "imageOperations");
        C7471uYa.b(resources, "resources");
        C7471uYa.b(hPa, "graphicsScheduler");
        C7471uYa.b(hPa2, "observeOnScheduler");
        super(n, resources, hPa);
        this.e = hPa;
        this.f = hPa2;
    }

    public C7531vPa<Bitmap> a(C3508cda cda) {
        C7471uYa.b(cda, "trackUrn");
        N a2 = a();
        Resources b = b();
        C4928GKa a3 = C4928GKa.a();
        C7471uYa.a((Object) a3, "Optional.absent()");
        return N.a(a2, b, cda, a3, ba.AD, this.e, this.f, null, 64, null);
    }

    public IPa<C4928GKa<Fd>> a(Vca vca, ImageView imageView, ImageView imageView2, boolean z) {
        C7471uYa.b(vca, "imageResource");
        C7471uYa.b(imageView, "wrappedImageView");
        IPa<C4928GKa<Fd>> a2 = super.a(vca, imageView, imageView2, z).a(this.e).a((C7118pQa<? super T, ? extends MPa<? extends R>>) new Sa<Object,Object>(this, vca, imageView2));
        C7471uYa.a((Object) a2, "super.loadArtwork(imageR…ndThen(Single.just(it)) }");
        return a2;
    }

    /* access modifiers changed from: private */
    public final C6979nPa a(Vca vca, ImageView imageView) {
        if (imageView == null) {
            C6979nPa e2 = C6979nPa.e();
            C7471uYa.a((Object) e2, "Completable.complete()");
            return e2;
        }
        C6979nPa d2 = a().a(b(), vca.a(), vca.b(), ba.NONE, this.e, this.f, Integer.valueOf(25)).a(this.f).b((C6776kQa<? super T>) new Ta<Object>(imageView)).d();
        C7471uYa.a((Object) d2, "imageOperations.blurredB…         .ignoreElement()");
        return d2;
    }
}
