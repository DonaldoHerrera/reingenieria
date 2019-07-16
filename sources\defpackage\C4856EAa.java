package defpackage;

import com.soundcloud.android.collections.data.K;
import com.soundcloud.android.collections.data.L;

/* renamed from: EAa reason: default package and case insensitive filesystem */
/* compiled from: DeltaSyncer_Factory */
public final class C4856EAa implements C4961HMa<C4825DAa> {
    private final C7054oVa<dfa> a;
    private final C7054oVa<K> b;
    private final C7054oVa<L> c;

    public C4856EAa(C7054oVa<dfa> ova, C7054oVa<K> ova2, C7054oVa<L> ova3) {
        this.a = ova;
        this.b = ova2;
        this.c = ova3;
    }

    public static C4856EAa a(C7054oVa<dfa> ova, C7054oVa<K> ova2, C7054oVa<L> ova3) {
        return new C4856EAa(ova, ova2, ova3);
    }

    public C4825DAa get() {
        return new C4825DAa((dfa) this.a.get(), (K) this.b.get(), (L) this.c.get());
    }
}
