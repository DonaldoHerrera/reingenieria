package defpackage;

import com.soundcloud.android.ads.data.C2557a;
import com.soundcloud.android.foundation.ads.C3686m;

/* renamed from: GJ reason: default package and case insensitive filesystem */
/* compiled from: VideoAdsRepository.kt */
final class C2049GJ<T, R> implements C7118pQa<T, R> {
    public static final C2049GJ a = new C2049GJ();

    C2049GJ() {
    }

    /* renamed from: a */
    public final C3686m apply(C3686m mVar) {
        C7471uYa.b(mVar, "ad");
        if (mVar.q() == null || mVar.m() == null) {
            return mVar;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("AdEntity ");
        sb.append(mVar);
        sb.append(" is invalid! Ad has both error and video data!");
        throw new C2557a(sb.toString());
    }
}
