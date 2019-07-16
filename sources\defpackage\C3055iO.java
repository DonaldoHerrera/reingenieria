package defpackage;

import com.soundcloud.android.properties.a;

/* renamed from: iO reason: default package and case insensitive filesystem */
/* compiled from: MobilePlaySessionAnalyticsProvider_Factory */
public final class C3055iO implements C4961HMa<C3017gO> {
    private final C7054oVa<C3074jO> a;
    private final C7054oVa<efa> b;
    private final C7054oVa<HPa> c;
    private final C7054oVa<a> d;

    public C3055iO(C7054oVa<C3074jO> ova, C7054oVa<efa> ova2, C7054oVa<HPa> ova3, C7054oVa<a> ova4) {
        this.a = ova;
        this.b = ova2;
        this.c = ova3;
        this.d = ova4;
    }

    public static C3055iO a(C7054oVa<C3074jO> ova, C7054oVa<efa> ova2, C7054oVa<HPa> ova3, C7054oVa<a> ova4) {
        return new C3055iO(ova, ova2, ova3, ova4);
    }

    public C3017gO get() {
        C3017gO gOVar = new C3017gO((C3074jO) this.a.get(), (efa) this.b.get(), (HPa) this.c.get(), (HPa) this.c.get(), (a) this.d.get());
        return gOVar;
    }
}
