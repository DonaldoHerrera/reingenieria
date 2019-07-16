package defpackage;

import com.soundcloud.android.playback.C4536zc;
import com.soundcloud.android.playback.Db;

/* renamed from: zqa reason: default package and case insensitive filesystem */
/* compiled from: PlaylistDetailsPresenter.kt */
final class C7837zqa<T, R> implements C7118pQa<T, MPa<? extends R>> {
    final /* synthetic */ C6804kqa a;

    C7837zqa(C6804kqa kqa) {
        this.a = kqa;
    }

    /* renamed from: a */
    public final IPa<C4536zc> apply(C6532gqa gqa) {
        C7471uYa.b(gqa, "metadata");
        Db i = this.a.t;
        IPa a2 = IPa.a(gqa.o().a());
        C7471uYa.a((Object) a2, "Single.just(metadata.shuffleParams.allTracks)");
        return i.a(a2, gqa.k()).c((C6776kQa<? super T>) new C7768yqa<Object>(this, gqa));
    }
}
