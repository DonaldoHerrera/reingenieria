package defpackage;

import com.soundcloud.android.collections.data.C2860p;

/* renamed from: xAa reason: default package and case insensitive filesystem */
/* compiled from: DeltaSyncProvider_Factory */
public final class C7650xAa implements C4961HMa<C7581wAa> {
    private final C7054oVa<C4825DAa> a;
    private final C7054oVa<C2860p> b;

    public C7650xAa(C7054oVa<C4825DAa> ova, C7054oVa<C2860p> ova2) {
        this.a = ova;
        this.b = ova2;
    }

    public static C7650xAa a(C7054oVa<C4825DAa> ova, C7054oVa<C2860p> ova2) {
        return new C7650xAa(ova, ova2);
    }

    public C7581wAa get() {
        return new C7581wAa(this.a, (C2860p) this.b.get());
    }
}
