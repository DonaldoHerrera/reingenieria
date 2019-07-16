package com.soundcloud.android.profile;

import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.TransitionDrawable;
import android.widget.ImageView;
import com.facebook.stetho.server.http.HttpStatus;
import com.soundcloud.android.image.C3721b;
import com.soundcloud.android.image.N;
import com.soundcloud.android.image.qa;

@EVa(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u0000 $2\u00020\u0001:\u0003#$%B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u001e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0012J \u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u0011H\u0016J\u001e\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00150\u000e2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0012J.\u0010\u001a\u001a \u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u001c\u0012\u0004\u0012\u00020\u00130\u001b2\u0006\u0010\u0012\u001a\u00020\u0013H\u0012J\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u000f2\u0006\u0010 \u001a\u00020!H\u0012J\b\u0010\"\u001a\u00020\u0015H\u0016R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u00020\f8\u0012X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lcom/soundcloud/android/profile/ProfileImageHelper;", "", "imageOperations", "Lcom/soundcloud/android/image/ImageOperations;", "placeholderGenerator", "Lcom/soundcloud/android/image/PlaceholderGenerator;", "resources", "Landroid/content/res/Resources;", "(Lcom/soundcloud/android/image/ImageOperations;Lcom/soundcloud/android/image/PlaceholderGenerator;Landroid/content/res/Resources;)V", "backgroundAnimator", "Lcom/soundcloud/android/profile/ProfileImageHelper$BackgroundAnimator;", "disposables", "Lio/reactivex/disposables/CompositeDisposable;", "bindAvatar", "Lio/reactivex/Single;", "Landroidx/palette/graphics/Palette;", "imageView", "Landroid/widget/ImageView;", "suggestedCreatorItem", "Lcom/soundcloud/android/profile/ProfileImageSource;", "bindImages", "", "userImageSource", "bannerView", "avatarView", "bindVisualBanner", "combineImageLoadingEvents", "Lio/reactivex/functions/BiFunction;", "Lio/reactivex/Notification;", "generateFallbackDrawable", "Landroid/graphics/drawable/Drawable;", "palette", "creatorUrn", "Lcom/soundcloud/android/foundation/domain/Urn;", "unsubscribe", "BackgroundAnimator", "Companion", "ImageLoadingSubscriber", "base_release"}, mv = {1, 1, 15})
/* compiled from: ProfileImageHelper.kt */
public class Aa {
    public static final b a = new b(null);
    private final a b = new a(this.e);
    @SuppressLint({"sc.MissingCompositeDisposableRecycle"})
    private final UPa c = new UPa();
    private final N d;
    private final qa e;
    private final Resources f;

    /* compiled from: ProfileImageHelper.kt */
    private static final class a {
        private final qa a;

        public a(qa qaVar) {
            C7471uYa.b(qaVar, "placeholderGenerator");
            this.a = qaVar;
        }

        public final void a(Fd fd, ImageView imageView, C3508cda cda) {
            C7471uYa.b(fd, "palette");
            C7471uYa.b(imageView, "bannerView");
            C7471uYa.b(cda, "urn");
            Drawable drawable = imageView.getDrawable();
            GradientDrawable a2 = this.a.a(cda.toString(), fd);
            if (drawable != null) {
                TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{drawable, a2});
                imageView.setImageDrawable(transitionDrawable);
                transitionDrawable.startTransition(HttpStatus.HTTP_INTERNAL_SERVER_ERROR);
                return;
            }
            imageView.setImageDrawable(a2);
        }
    }

    /* compiled from: ProfileImageHelper.kt */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(C7264rYa rya) {
            this();
        }

        /* access modifiers changed from: private */
        public final boolean a(Ja ja) {
            return (ja.e() != null || ja.d()) && ja.c() != null;
        }
    }

    /* compiled from: ProfileImageHelper.kt */
    private static final class c extends C5037Jua<Ja> {
        private final ImageView d;
        private final a e;

        public c(ImageView imageView, a aVar) {
            C7471uYa.b(imageView, "bannerView");
            C7471uYa.b(aVar, "backgroundAnimator");
            this.d = imageView;
            this.e = aVar;
        }

        public void a(Ja ja) {
            C7471uYa.b(ja, "item");
            if (Aa.a.a(ja)) {
                a aVar = this.e;
                Fd c = ja.c();
                if (c != null) {
                    aVar.a(c, this.d, ja.b());
                    return;
                }
                throw new IllegalArgumentException("Required value was null.");
            }
        }
    }

    public Aa(N n, qa qaVar, Resources resources) {
        C7471uYa.b(n, "imageOperations");
        C7471uYa.b(qaVar, "placeholderGenerator");
        C7471uYa.b(resources, "resources");
        this.d = n;
        this.e = qaVar;
        this.f = resources;
    }

    private IPa<RVa> b(ImageView imageView, Ja ja) {
        C3508cda b2 = ja.b();
        if (a.a(ja)) {
            IPa<RVa> a2 = IPa.a(RVa.a);
            C7471uYa.a((Object) a2, "Single.just(Unit)");
            return a2;
        }
        Fd c2 = ja.c();
        N n = this.d;
        String e2 = ja.e();
        C3721b a3 = C3721b.a(this.f);
        C7471uYa.a((Object) a3, "ApiImageSize.getFullBannerSize(resources)");
        IPa<RVa> e3 = n.a(b2, e2, a3, imageView, a(c2, b2), false).e(Ga.a);
        C7471uYa.a((Object) e3, "imageOperations.displayI…           ).map { Unit }");
        return e3;
    }

    public void a(Ja ja, ImageView imageView, ImageView imageView2) {
        C7471uYa.b(ja, "userImageSource");
        C7471uYa.b(imageView, "bannerView");
        C7471uYa.b(imageView2, "avatarView");
        imageView2.setImageResource(17170445);
        imageView.setImageResource(17170445);
        this.c.b((VPa) APa.b((EPa<? extends T1>) b(imageView, ja).j().k().a((C7256rQa<? super T>) Fa.a), (EPa<? extends T2>) a(imageView2, ja).j().k().a((C7256rQa<? super T>) Ea.a), a(ja)).c(new c(imageView, this.b)));
    }

    public void a() {
        this.c.b();
    }

    private C6504gQa<C7738yPa<RVa>, C7738yPa<Fd>, Ja> a(Ja ja) {
        return new Ha(ja);
    }

    private Drawable a(Fd fd, C3508cda cda) {
        if (fd != null) {
            return this.e.a(cda.toString(), fd);
        }
        return null;
    }

    private IPa<Fd> a(ImageView imageView, Ja ja) {
        N n = this.d;
        C3508cda b2 = ja.b();
        String a2 = ja.a();
        C3721b b3 = C3721b.b(this.f);
        C7471uYa.a((Object) b3, "ApiImageSize.getFullImageSize(resources)");
        IPa<Fd> a3 = n.a(b2, a2, b3, imageView, (Drawable) null, true).a((C7118pQa<? super T, ? extends MPa<? extends R>>) Da.a);
        C7471uYa.a((Object) a3, "imageOperations.displayI…          }\n            }");
        return a3;
    }
}
