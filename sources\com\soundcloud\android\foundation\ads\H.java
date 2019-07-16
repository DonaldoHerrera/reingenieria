package com.soundcloud.android.foundation.ads;

import com.soundcloud.android.foundation.ads.G.a;
import com.soundcloud.android.foundation.ads.G.b;

/* compiled from: ErrorAd.kt */
public final class H {
    public static /* synthetic */ a a(C3691s.a aVar, C3508cda cda, int i, Object obj) {
        if ((i & 1) != 0) {
            cda = C3508cda.a;
            C7471uYa.a((Object) cda, "Urn.NOT_SET");
        }
        return a(aVar, cda);
    }

    public static final a a(C3691s.a aVar, C3508cda cda) {
        C7471uYa.b(aVar, "$this$toErrorAd");
        C7471uYa.b(cda, "monetizableTrackUrn");
        a aVar2 = new a(aVar.d(), aVar.a(), aVar.j(), aVar.c(), C3676c.a.ERROR_AUDIO_AD, cda, aVar.e(), aVar.b());
        return aVar2;
    }

    public static /* synthetic */ b a(C3691s.b bVar, C3508cda cda, int i, Object obj) {
        if ((i & 1) != 0) {
            cda = C3508cda.a;
            C7471uYa.a((Object) cda, "Urn.NOT_SET");
        }
        return a(bVar, cda);
    }

    public static final b a(C3691s.b bVar, C3508cda cda) {
        C7471uYa.b(bVar, "$this$toErrorAd");
        C7471uYa.b(cda, "monetizableTrackUrn");
        b bVar2 = new b(bVar.d(), bVar.a(), bVar.j(), bVar.c(), C3676c.a.ERROR_VIDEO_AD, cda, bVar.e(), bVar.b());
        return bVar2;
    }
}
