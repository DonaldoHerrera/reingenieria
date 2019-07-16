package defpackage;

import com.soundcloud.android.foundation.ads.VideoAdTracking;

/* renamed from: eJ reason: default package and case insensitive filesystem */
/* compiled from: OMAdViewabilityController.kt */
final class C2974eJ extends C7540vYa implements _Xa<C1948BI, RVa> {
    final /* synthetic */ C3050iJ a;
    final /* synthetic */ VideoAdTracking b;

    C2974eJ(C3050iJ iJVar, VideoAdTracking videoAdTracking) {
        this.a = iJVar;
        this.b = videoAdTracking;
        super(1);
    }

    public final void a(C1948BI bi) {
        C7471uYa.b(bi, "sessionData");
        this.a.a("Track video ad impression", bi);
        this.a.a(bi, this.b);
        this.a.b.a(bi.a());
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((C1948BI) obj);
        return RVa.a;
    }
}
