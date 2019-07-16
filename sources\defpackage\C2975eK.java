package defpackage;

import android.view.View;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs;
import com.soundcloud.android.ads.ld;
import com.soundcloud.android.foundation.ads.ca;
import com.soundcloud.android.ia.i;
import com.soundcloud.android.image.N;

@EVa(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0017B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ0\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u000eH\u0016R\u0014\u0010\r\u001a\u00020\u000eXD¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000f¨\u0006\u0018"}, d2 = {"Lcom/soundcloud/android/ads/overlays/LeaveBehindPresenter;", "Lcom/soundcloud/android/ads/overlays/AdOverlayPresenter;", "trackView", "Landroid/view/View;", "listener", "Lcom/soundcloud/android/ads/VisualAdListener;", "eventBus", "Lcom/soundcloud/rx/eventbus/EventBus;", "imageOperations", "Lcom/soundcloud/android/image/ImageOperations;", "observerFactory", "Lcom/soundcloud/android/rx/observers/ObserverFactory;", "(Landroid/view/View;Lcom/soundcloud/android/ads/VisualAdListener;Lcom/soundcloud/rx/eventbus/EventBus;Lcom/soundcloud/android/image/ImageOperations;Lcom/soundcloud/android/rx/observers/ObserverFactory;)V", "isFullScreen", "", "()Z", "shouldDisplayOverlay", "data", "Lcom/soundcloud/android/foundation/ads/VisualAdData;", "isExpanded", "isPortrait", "isForeground", "isCommentsOpen", "Factory", "base_release"}, mv = {1, 1, 15})
/* renamed from: eK reason: default package and case insensitive filesystem */
/* compiled from: LeaveBehindPresenter.kt */
public class C2975eK extends C2334VJ {
    private final boolean k;

    /* renamed from: eK$a */
    /* compiled from: LeaveBehindPresenter.kt */
    public static class a {
        private final C5327TLa a;
        private final N b;
        private final C5606ava c;

        public a(C5327TLa tLa, N n, C5606ava ava) {
            C7471uYa.b(tLa, "eventBus");
            C7471uYa.b(n, "imageOperations");
            C7471uYa.b(ava, "observerFactory");
            this.a = tLa;
            this.b = n;
            this.c = ava;
        }

        public C3051iK a(View view, ld ldVar) {
            C7471uYa.b(view, "trackView");
            C7471uYa.b(ldVar, CastExtraArgs.LISTENER);
            C2975eK eKVar = new C2975eK(view, ldVar, this.a, this.b, this.c);
            return eKVar;
        }
    }

    public C2975eK(View view, ld ldVar, C5327TLa tLa, N n, C5606ava ava) {
        View view2 = view;
        C7471uYa.b(view, "trackView");
        ld ldVar2 = ldVar;
        C7471uYa.b(ldVar, CastExtraArgs.LISTENER);
        C5327TLa tLa2 = tLa;
        C7471uYa.b(tLa, "eventBus");
        N n2 = n;
        C7471uYa.b(n2, "imageOperations");
        C5606ava ava2 = ava;
        C7471uYa.b(ava2, "observerFactory");
        super(view2, i.leave_behind, i.leave_behind_stub, i.leave_behind_image, i.leave_behind_image_holder, i.leave_behind_header, ldVar2, n2, tLa2, ava2);
    }

    public boolean a(ca caVar, boolean z, boolean z2, boolean z3, boolean z4) {
        C7471uYa.b(caVar, "data");
        return !z4 && z2 && (caVar.p() && !caVar.o());
    }

    public boolean a() {
        return this.k;
    }
}
