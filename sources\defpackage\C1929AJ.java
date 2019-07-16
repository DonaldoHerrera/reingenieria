package defpackage;

import com.soundcloud.android.foundation.ads.J;
import com.soundcloud.android.utilities.android.k;
import com.soundcloud.android.utilities.android.t;

/* renamed from: AJ reason: default package and case insensitive filesystem */
/* compiled from: VideoAdsFetcher_Factory */
public final class C1929AJ implements C4961HMa<C3352xJ> {
    private final C7054oVa<efa> a;
    private final C7054oVa<HPa> b;
    private final C7054oVa<t> c;
    private final C7054oVa<J> d;
    private final C7054oVa<k> e;

    public C1929AJ(C7054oVa<efa> ova, C7054oVa<HPa> ova2, C7054oVa<t> ova3, C7054oVa<J> ova4, C7054oVa<k> ova5) {
        this.a = ova;
        this.b = ova2;
        this.c = ova3;
        this.d = ova4;
        this.e = ova5;
    }

    public static C1929AJ a(C7054oVa<efa> ova, C7054oVa<HPa> ova2, C7054oVa<t> ova3, C7054oVa<J> ova4, C7054oVa<k> ova5) {
        C1929AJ aj = new C1929AJ(ova, ova2, ova3, ova4, ova5);
        return aj;
    }

    public C3352xJ get() {
        C3352xJ xJVar = new C3352xJ((efa) this.a.get(), (HPa) this.b.get(), (t) this.c.get(), (J) this.d.get(), (k) this.e.get());
        return xJVar;
    }
}
