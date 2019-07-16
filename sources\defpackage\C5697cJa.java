package defpackage;

import android.content.res.Resources;
import com.soundcloud.android.foundation.events.F;
import com.soundcloud.android.image.N;
import com.soundcloud.android.tracks.C6188na;
import com.soundcloud.android.tracks.Va;

/* renamed from: cJa reason: default package and case insensitive filesystem */
/* compiled from: TrackCardRenderer_Factory */
public final class C5697cJa implements C4961HMa<C5629bJa> {
    private final C7054oVa<C5408WFa> a;
    private final C7054oVa<C6188na> b;
    private final C7054oVa<C5204PIa> c;
    private final C7054oVa<N> d;
    private final C7054oVa<C4655rja> e;
    private final C7054oVa<Resources> f;
    private final C7054oVa<F> g;
    private final C7054oVa<Va> h;

    public static C5629bJa a(C5408WFa wFa, C6188na naVar, C5204PIa pIa, N n, C4655rja rja, Resources resources, F f2, Va va) {
        C5629bJa bja = new C5629bJa(wFa, naVar, pIa, n, rja, resources, f2, va);
        return bja;
    }

    public C5629bJa get() {
        C5629bJa bja = new C5629bJa((C5408WFa) this.a.get(), (C6188na) this.b.get(), (C5204PIa) this.c.get(), (N) this.d.get(), (C4655rja) this.e.get(), (Resources) this.f.get(), (F) this.g.get(), (Va) this.h.get());
        return bja;
    }
}
