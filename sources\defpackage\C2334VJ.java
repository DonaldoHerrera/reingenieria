package defpackage;

import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs;
import com.soundcloud.android.ads.ld;
import com.soundcloud.android.foundation.ads.O;
import com.soundcloud.android.foundation.ads.ca;
import com.soundcloud.android.foundation.events.I;
import com.soundcloud.android.foundation.playqueue.q;
import com.soundcloud.android.image.N;
import java.util.Arrays;

@EVa(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001:\u0001/BU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011¢\u0006\u0002\u0010\u0012J\u0010\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'H\u0016J\b\u0010(\u001a\u00020%H\u0016J\b\u0010)\u001a\u00020%H\u0016J \u0010*\u001a\u00020%2\u0006\u0010+\u001a\u00020,2\u0006\u0010&\u001a\u00020'2\u0006\u0010-\u001a\u00020.H\u0016R\u0014\u0010\b\u001a\u00020\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u0016X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u000e\u0010\u0019\u001a\u00020\u001aX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\f\u001a\u00020\rX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001f\u001a\u00020 X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010!R\u000e\u0010\"\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000¨\u00060"}, d2 = {"Lcom/soundcloud/android/ads/overlays/AdOverlayPresenter;", "Lcom/soundcloud/android/ads/overlays/VisualAdPresenter;", "trackView", "Landroid/view/View;", "overlayId", "", "overlayStubId", "adImageId", "adClickId", "headerId", "listener", "Lcom/soundcloud/android/ads/VisualAdListener;", "imageOperations", "Lcom/soundcloud/android/image/ImageOperations;", "eventBus", "Lcom/soundcloud/rx/eventbus/EventBus;", "observerFactory", "Lcom/soundcloud/android/rx/observers/ObserverFactory;", "(Landroid/view/View;IIIIILcom/soundcloud/android/ads/VisualAdListener;Lcom/soundcloud/android/image/ImageOperations;Lcom/soundcloud/rx/eventbus/EventBus;Lcom/soundcloud/android/rx/observers/ObserverFactory;)V", "getAdClickId", "()I", "adImageView", "Landroid/widget/ImageView;", "getAdImageView", "()Landroid/widget/ImageView;", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "getEventBus", "()Lcom/soundcloud/rx/eventbus/EventBus;", "getImageOperations", "()Lcom/soundcloud/android/image/ImageOperations;", "isNotVisible", "", "()Z", "leaveBehindHeader", "overlay", "bind", "", "data", "Lcom/soundcloud/android/foundation/ads/VisualAdData;", "clear", "onAdNotVisible", "onAdVisible", "playQueueItem", "Lcom/soundcloud/android/foundation/playqueue/PlayQueueItem;", "trackSourceInfo", "Lcom/soundcloud/android/foundation/events/TrackSourceInfo;", "AdImageLoadingException", "base_release"}, mv = {1, 1, 15})
/* renamed from: VJ reason: default package and case insensitive filesystem */
/* compiled from: AdOverlayPresenter.kt */
public abstract class C2334VJ implements C3051iK {
    private final UPa a = new UPa();
    private View b;
    private final View c;
    private final ImageView d;
    private final boolean e;
    private final int f;
    /* access modifiers changed from: private */
    public final ld g;
    private final N h;
    private final C5327TLa i;
    private final C5606ava j;

    /* renamed from: VJ$a */
    /* compiled from: AdOverlayPresenter.kt */
    private static final class a extends Exception {
        public a(String str, Throwable th) {
            C7471uYa.b(str, "imageUrl");
            C7471uYa.b(th, "cause");
            KYa kYa = KYa.a;
            Object[] objArr = {str};
            String format = String.format("Failed to load the ad image %s", Arrays.copyOf(objArr, objArr.length));
            C7471uYa.a((Object) format, "java.lang.String.format(format, *args)");
            super(format, th);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0045, code lost:
        if (r3 != null) goto L_0x0047;
     */
    public C2334VJ(View view, int i2, int i3, int i4, int i5, int i6, ld ldVar, N n, C5327TLa tLa, C5606ava ava) {
        C7471uYa.b(view, "trackView");
        C7471uYa.b(ldVar, CastExtraArgs.LISTENER);
        C7471uYa.b(n, "imageOperations");
        C7471uYa.b(tLa, "eventBus");
        C7471uYa.b(ava, "observerFactory");
        this.f = i5;
        this.g = ldVar;
        this.h = n;
        this.i = tLa;
        this.j = ava;
        View findViewById = view.findViewById(i2);
        if (findViewById == null) {
            View findViewById2 = view.findViewById(i3);
            if (!(findViewById2 instanceof ViewStub)) {
                findViewById2 = null;
            }
            ViewStub viewStub = (ViewStub) findViewById2;
            if (viewStub != null) {
                findViewById = viewStub.inflate();
            }
            throw new C2297TJ("Cannot find view to create ad overlay for the image ad");
        }
        this.b = findViewById;
        View findViewById3 = this.b.findViewById(i6);
        C7471uYa.a((Object) findViewById3, "overlay.findViewById(headerId)");
        this.c = findViewById3;
        View findViewById4 = this.b.findViewById(i4);
        C7471uYa.a((Object) findViewById4, "overlay.findViewById(adImageId)");
        this.d = (ImageView) findViewById4;
        this.b.setOnClickListener(new C2316UJ(this));
        this.e = e().getVisibility() == 8;
    }

    public boolean b() {
        return this.e;
    }

    public void c() {
        this.b.setClickable(false);
        e().setVisibility(8);
        this.c.setVisibility(8);
        C5327TLa f2 = f();
        C5443XLa<C3422FZ> xLa = C3876taa.g;
        C7471uYa.a((Object) xLa, "EventQueue.AD_OVERLAY");
        f2.c(xLa, C3422FZ.e());
    }

    public void clear() {
        this.a.b();
        e().setImageDrawable(null);
        c();
    }

    public int d() {
        return this.f;
    }

    public ImageView e() {
        return this.d;
    }

    /* access modifiers changed from: protected */
    public C5327TLa f() {
        return this.i;
    }

    /* access modifiers changed from: protected */
    public N g() {
        return this.h;
    }

    public void a(q qVar, ca caVar, I i2) {
        C7471uYa.b(qVar, "playQueueItem");
        C7471uYa.b(caVar, "data");
        C7471uYa.b(i2, "trackSourceInfo");
        this.b.setClickable(true);
        e().setVisibility(0);
        this.c.setVisibility(0);
        C5327TLa f2 = f();
        C5443XLa<C3422FZ> xLa = C3876taa.g;
        C7471uYa.a((Object) xLa, "EventQueue.AD_OVERLAY");
        f2.c(xLa, C3422FZ.a(qVar.c(), caVar, i2));
    }

    public void a(ca caVar) {
        C7471uYa.b(caVar, "data");
        if (caVar instanceof O) {
            O o = (O) caVar;
            this.a.b((VPa) g().a(o.v(), e()).k(new C2352WJ(this, o)).a(RPa.a()).a((C6368eQa) new C2370XJ(this)).c(C5606ava.a(this.j, (_Xa) null, 1, (Object) null)));
            this.b.findViewById(d()).setOnClickListener(new C2388YJ(this, o));
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Input ");
        sb.append(caVar);
        sb.append(" not of type ");
        sb.append(O.class.getSimpleName());
        throw new IllegalArgumentException(sb.toString());
    }
}
