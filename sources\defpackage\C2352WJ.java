package defpackage;

import com.soundcloud.android.foundation.ads.O;
import com.soundcloud.android.image.ca;
import com.soundcloud.android.image.ca.c;

/* renamed from: WJ reason: default package and case insensitive filesystem */
/* compiled from: AdOverlayPresenter.kt */
final class C2352WJ<T, R> implements C7118pQa<T, EPa<? extends R>> {
    final /* synthetic */ C2334VJ a;
    final /* synthetic */ O b;

    C2352WJ(C2334VJ vj, O o) {
        this.a = vj;
        this.b = o;
    }

    /* renamed from: a */
    public final APa<ca> apply(ca caVar) {
        C7471uYa.b(caVar, "loadingState");
        if (caVar instanceof c) {
            this.a.g.a((com.soundcloud.android.foundation.ads.ca) this.b);
            c cVar = (c) caVar;
            String b2 = cVar.b();
            if (b2 != null) {
                APa.b((Throwable) new a(b2, cVar.a()));
            } else {
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        return APa.c(caVar);
    }
}
