package defpackage;

import com.soundcloud.android.foundation.events.F;
import com.soundcloud.android.foundation.events.J;

/* renamed from: RL reason: default package and case insensitive filesystem */
/* compiled from: DefaultPlaySessionOriginScreenProvider_Factory */
public final class C2261RL implements C4961HMa<C2242QL> {
    private final C7054oVa<C2350WH<J>> a;
    private final C7054oVa<F> b;

    public C2261RL(C7054oVa<C2350WH<J>> ova, C7054oVa<F> ova2) {
        this.a = ova;
        this.b = ova2;
    }

    public static C2261RL a(C7054oVa<C2350WH<J>> ova, C7054oVa<F> ova2) {
        return new C2261RL(ova, ova2);
    }

    public C2242QL get() {
        return new C2242QL((C2350WH) this.a.get(), (F) this.b.get());
    }
}
