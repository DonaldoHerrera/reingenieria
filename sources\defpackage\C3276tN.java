package defpackage;

import com.soundcloud.android.properties.j;

/* renamed from: tN reason: default package and case insensitive filesystem */
/* compiled from: FabricAnalyticsProvider_Factory */
public final class C3276tN implements C4961HMa<C3256sN> {
    private final C7054oVa<j> a;
    private final C7054oVa<C3296uN> b;
    private final C7054oVa<C3824mea> c;

    public C3276tN(C7054oVa<j> ova, C7054oVa<C3296uN> ova2, C7054oVa<C3824mea> ova3) {
        this.a = ova;
        this.b = ova2;
        this.c = ova3;
    }

    public static C3276tN a(C7054oVa<j> ova, C7054oVa<C3296uN> ova2, C7054oVa<C3824mea> ova3) {
        return new C3276tN(ova, ova2, ova3);
    }

    public C3256sN get() {
        return new C3256sN((j) this.a.get(), (C3296uN) this.b.get(), (C3824mea) this.c.get());
    }
}
