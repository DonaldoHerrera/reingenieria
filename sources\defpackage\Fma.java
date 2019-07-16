package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.MediaMetadataCompat.Builder;
import android.support.v4.media.RatingCompat;
import com.soundcloud.android.ia.g;
import com.soundcloud.android.ia.h;
import com.soundcloud.android.ia.p;
import com.soundcloud.android.image.C3721b;
import com.soundcloud.android.image.N;
import com.soundcloud.android.playback.C4420sa;
import com.soundcloud.android.tracks.C6185ma;
import com.soundcloud.android.tracks.Ca;
import java.util.concurrent.Callable;

@EVa(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u0000 <2\u00020\u0001:\u0001<B)\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u000e\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aH\u0012J \u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\f0\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u001bH\u0012J4\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\"0\u001a2\u0006\u0010\u001e\u001a\u00020\u001f2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020$0\"2\b\u0010%\u001a\u0004\u0018\u00010\u001bH\u0012J\u0017\u0010&\u001a\u0004\u0018\u00010\u001f2\u0006\u0010 \u001a\u00020\u001bH\u0010¢\u0006\u0002\b'J\u0019\u0010(\u001a\u0004\u0018\u00010)2\u0006\u0010 \u001a\u00020\u001bH\u0010¢\u0006\u0004\b*\u0010+J*\u0010,\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\"0-2\u0006\u0010.\u001a\u00020/2\f\u00100\u001a\b\u0012\u0004\u0012\u00020\f0\"H\u0012J'\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001b0-2\u0006\u0010\u001e\u001a\u00020\u001f2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u001bH\u0010¢\u0006\u0002\b1J\u0010\u00102\u001a\u00020/2\u0006\u00103\u001a\u000204H\u0012J\u0010\u00105\u001a\u0002062\u0006\u00107\u001a\u00020\u001fH\u0016J\u0010\u00108\u001a\u00020\u001b2\u0006\u00109\u001a\u00020:H\u0012J \u0010;\u001a\b\u0012\u0004\u0012\u00020:0-2\u0006\u0010.\u001a\u00020/2\b\u0010%\u001a\u0004\u0018\u00010\u001bH\u0012R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\f8RX\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u00020\u00108RX\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\u00020\u00148RX\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00148RX\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006="}, d2 = {"Lcom/soundcloud/android/playback/mediasession/MetadataOperations;", "", "resources", "Landroid/content/res/Resources;", "trackItemRepository", "Lcom/soundcloud/android/tracks/TrackItemRepository;", "imageOperations", "Lcom/soundcloud/android/image/ImageOperations;", "scheduler", "Lio/reactivex/Scheduler;", "(Landroid/content/res/Resources;Lcom/soundcloud/android/tracks/TrackItemRepository;Lcom/soundcloud/android/image/ImageOperations;Lio/reactivex/Scheduler;)V", "adArtwork", "Landroid/graphics/Bitmap;", "getAdArtwork", "()Landroid/graphics/Bitmap;", "imageSize", "Lcom/soundcloud/android/image/ApiImageSize;", "getImageSize", "()Lcom/soundcloud/android/image/ApiImageSize;", "targetImageHeight", "", "getTargetImageHeight", "()I", "targetImageWidth", "getTargetImageWidth", "adMediaMetadata", "Lio/reactivex/Single;", "Landroid/support/v4/media/MediaMetadataCompat;", "getBitmapFromExistingMetadata", "Lio/reactivex/Maybe;", "urn", "Lcom/soundcloud/android/foundation/domain/Urn;", "metadata", "getCachedBitmap", "Lcom/soundcloud/java/optional/Optional;", "imageUrlTemplate", "", "existingMetadata", "getUrnFromMetadata", "getUrnFromMetadata$base_release", "isLikedFromMetadata", "", "isLikedFromMetadata$base_release", "(Landroid/support/v4/media/MediaMetadataCompat;)Ljava/lang/Boolean;", "loadBitmapIfNeeded", "Lio/reactivex/Observable;", "trackItem", "Lcom/soundcloud/android/playback/mediasession/NotificationMetadata;", "optionalBitmap", "metadata$base_release", "notificationMetadata", "it", "Lcom/soundcloud/android/tracks/TrackItem;", "preload", "", "trackUrn", "toMediaMetadata", "trackAndBitmap", "Lcom/soundcloud/android/playback/mediasession/TrackAndBitmap;", "toTrackAndBitmap", "Companion", "base_release"}, mv = {1, 1, 15})
/* renamed from: Fma reason: default package */
/* compiled from: MetadataOperations.kt */
public class Fma {
    public static final a a = new a(null);
    private final Resources b;
    private final Ca c;
    /* access modifiers changed from: private */
    public final N d;
    private final HPa e;

    /* renamed from: Fma$a */
    /* compiled from: MetadataOperations.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }
    }

    public Fma(Resources resources, Ca ca, N n, HPa hPa) {
        C7471uYa.b(resources, "resources");
        C7471uYa.b(ca, "trackItemRepository");
        C7471uYa.b(n, "imageOperations");
        C7471uYa.b(hPa, "scheduler");
        this.b = resources;
        this.c = ca;
        this.d = n;
        this.e = hPa;
    }

    /* access modifiers changed from: private */
    public int e() {
        return this.b.getDimensionPixelSize(g.notification_image_width);
    }

    private Bitmap b() {
        return this.d.a(this.b, h.notification_loading);
    }

    /* access modifiers changed from: private */
    public C3721b c() {
        C3721b d2 = C3721b.d(this.b);
        C7471uYa.a((Object) d2, "ApiImageSize.getNotifica…eIconImageSize(resources)");
        return d2;
    }

    /* access modifiers changed from: private */
    public int d() {
        return this.b.getDimensionPixelSize(g.notification_image_height);
    }

    public Boolean b(MediaMetadataCompat mediaMetadataCompat) {
        C7471uYa.b(mediaMetadataCompat, "metadata");
        RatingCompat rating = mediaMetadataCompat.getRating(MediaMetadataCompat.METADATA_KEY_USER_RATING);
        if (rating != null) {
            return Boolean.valueOf(rating.hasHeart());
        }
        return null;
    }

    private C7531vPa<Bitmap> b(C3508cda cda, MediaMetadataCompat mediaMetadataCompat) {
        if (mediaMetadataCompat != null) {
            if (C7471uYa.a((Object) cda.b(), (Object) mediaMetadataCompat.getString(MediaMetadataCompat.METADATA_KEY_MEDIA_ID))) {
                Bitmap bitmap = mediaMetadataCompat.getBitmap(MediaMetadataCompat.METADATA_KEY_ALBUM_ART);
                if (bitmap != null && !bitmap.isRecycled()) {
                    C7531vPa<Bitmap> c2 = C7531vPa.c(bitmap);
                    C7471uYa.a((Object) c2, "Maybe.just(bitmap)");
                    return c2;
                }
            }
        }
        C7531vPa<Bitmap> c3 = C7531vPa.c();
        C7471uYa.a((Object) c3, "Maybe.empty()");
        return c3;
    }

    public static /* synthetic */ APa a(Fma fma, C3508cda cda, MediaMetadataCompat mediaMetadataCompat, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                mediaMetadataCompat = null;
            }
            return fma.a(cda, mediaMetadataCompat);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: metadata");
    }

    public APa<MediaMetadataCompat> a(C3508cda cda, MediaMetadataCompat mediaMetadataCompat) {
        C7471uYa.b(cda, "urn");
        if (cda.x()) {
            APa<MediaMetadataCompat> b2 = this.c.b(cda).h(new Lma(this)).d().k(new Mma(this, mediaMetadataCompat)).h(new Nma(this)).b(this.e);
            C7471uYa.a((Object) b2, "trackItemRepository.live…  .subscribeOn(scheduler)");
            return b2;
        } else if (cda.e()) {
            APa<MediaMetadataCompat> j = a().j();
            C7471uYa.a((Object) j, "adMediaMetadata().toObservable()");
            return j;
        } else {
            APa<MediaMetadataCompat> e2 = APa.e();
            C7471uYa.a((Object) e2, "Observable.empty()");
            return e2;
        }
    }

    /* access modifiers changed from: private */
    public Rma a(C6185ma maVar) {
        C3508cda a2 = maVar.a();
        C7471uYa.a((Object) a2, "it.urn");
        String B = maVar.B();
        C7471uYa.a((Object) B, "it.title()");
        String d2 = maVar.d();
        C7471uYa.a((Object) d2, "it.creatorName()");
        boolean o = maVar.o();
        long a3 = C4420sa.a(maVar);
        C3823mda r = maVar.r();
        C4928GKa b2 = maVar.b();
        C7471uYa.a((Object) b2, "it.imageUrlTemplate");
        Rma rma = new Rma(a2, B, d2, o, a3, r, b2);
        return rma;
    }

    /* access modifiers changed from: private */
    public MediaMetadataCompat a(Sma sma) {
        long j;
        Builder putLong = new Builder().putString(MediaMetadataCompat.METADATA_KEY_MEDIA_ID, sma.b().f().toString()).putString(MediaMetadataCompat.METADATA_KEY_TITLE, sma.b().e()).putString(MediaMetadataCompat.METADATA_KEY_ARTIST, sma.b().a()).putLong(MediaMetadataCompat.METADATA_KEY_DURATION, sma.b().b());
        Bitmap bitmap = (Bitmap) sma.a().d();
        if (bitmap != null && C0290_a.a(bitmap) < 786432) {
            putLong.putBitmap(MediaMetadataCompat.METADATA_KEY_ALBUM_ART, bitmap);
        }
        Builder putRating = putLong.putRating(MediaMetadataCompat.METADATA_KEY_USER_RATING, RatingCompat.newHeartRating(sma.b().g()));
        int i = Gma.a[sma.b().d().ordinal()];
        if (i == 1 || i == 2) {
            j = 0;
        } else if (i == 3 || i == 4) {
            j = 1;
        } else if (i == 5) {
            j = 2;
        } else {
            throw new FVa();
        }
        putRating.putLong(MediaDescriptionCompat.EXTRA_DOWNLOAD_STATUS, j);
        MediaMetadataCompat build = putRating.build();
        C7471uYa.a((Object) build, "MediaMetadataCompat.Buil…   }\n            .build()");
        return build;
    }

    /* access modifiers changed from: private */
    public APa<Sma> a(Rma rma, MediaMetadataCompat mediaMetadataCompat) {
        APa<Sma> h = a(rma.f(), rma.c(), mediaMetadataCompat).d((C7118pQa<? super T, ? extends EPa<? extends R>>) new Oma<Object,Object>(this, rma)).c((EPa<? extends T>) APa.c(C4928GKa.a())).h(new Pma(rma));
        C7471uYa.a((Object) h, "getCachedBitmap(trackIte…ckItem, optionalBitmap) }");
        return h;
    }

    public void a(C3508cda cda) {
        C7471uYa.b(cda, "trackUrn");
        a(this, cda, null, 2, null).c(new C5037Jua());
    }

    public C3508cda a(MediaMetadataCompat mediaMetadataCompat) {
        C7471uYa.b(mediaMetadataCompat, "metadata");
        String str = MediaMetadataCompat.METADATA_KEY_MEDIA_ID;
        if (mediaMetadataCompat.containsKey(str)) {
            return new C3508cda(mediaMetadataCompat.getString(str));
        }
        return null;
    }

    /* access modifiers changed from: private */
    public APa<C4928GKa<Bitmap>> a(Rma rma, C4928GKa<Bitmap> gKa) {
        if (gKa.c()) {
            APa<C4928GKa<Bitmap>> c2 = APa.c(gKa);
            C7471uYa.a((Object) c2, "Observable.just(optionalBitmap)");
            return c2;
        }
        APa<C4928GKa<Bitmap>> e2 = APa.a((Callable<? extends EPa<? extends T>>) new Kma<Object>(this, rma)).e(C4928GKa.a());
        C7471uYa.a((Object) e2, "Observable.defer {\n     …rtWith(Optional.absent())");
        return e2;
    }

    private IPa<MediaMetadataCompat> a() {
        IPa<MediaMetadataCompat> a2 = IPa.a(new Builder().putString(MediaMetadataCompat.METADATA_KEY_MEDIA_ID, this.b.getString(p.ads_advertisement)).putString(MediaMetadataCompat.METADATA_KEY_TITLE, this.b.getString(p.ads_advertisement)).putString(MediaMetadataCompat.METADATA_KEY_ARTIST, "").putBitmap(MediaMetadataCompat.METADATA_KEY_ALBUM_ART, b()).putLong(MediaMetadataCompat.METADATA_KEY_ADVERTISEMENT, 1).build());
        C7471uYa.a((Object) a2, "Single.just(\n           …       .build()\n        )");
        return a2;
    }

    private IPa<C4928GKa<Bitmap>> a(C3508cda cda, C4928GKa<String> gKa, MediaMetadataCompat mediaMetadataCompat) {
        IPa<C4928GKa<Bitmap>> a2 = this.d.a(cda, gKa, c(), this.e, e(), d()).a((C7118pQa<? super T, ? extends C7669xPa<? extends R>>) Hma.a).a((C7669xPa<? extends T>) b(cda, mediaMetadataCompat)).f(Ima.a).a((MPa<? extends T>) IPa.a(C4928GKa.a()));
        C7471uYa.a((Object) a2, "imageOperations.getCache…tional.absent<Bitmap>()))");
        return a2;
    }
}
