package defpackage;

import com.soundcloud.android.foundation.events.C3700b;
import com.soundcloud.android.foundation.events.J;

/* renamed from: kra reason: default package and case insensitive filesystem */
/* compiled from: PlaylistDetailsPresenter.kt */
final class C6806kra<T> implements C6776kQa<C3508cda> {
    final /* synthetic */ C6804kqa a;

    C6806kra(C6804kqa kqa) {
        this.a = kqa;
    }

    /* renamed from: a */
    public final void accept(C3508cda cda) {
        if (this.a.C.b()) {
            C3700b a2 = this.a.y;
            Waa f = Waa.f(cda);
            C7471uYa.a((Object) f, "UpgradeFunnelEvent.forPlaylistPageImpression(urn)");
            a2.a((J) f);
        }
        C3700b a3 = this.a.y;
        Zca zca = new Zca(Yca.PLAYLIST_DETAILS, cda, null, null, null, 28, null);
        a3.a(zca);
    }
}
