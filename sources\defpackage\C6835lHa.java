package defpackage;

import android.content.Context;

/* renamed from: lHa reason: default package and case insensitive filesystem */
/* compiled from: DeviceHelper_Factory */
public final class C6835lHa implements C4961HMa<C6699jHa> {
    private final C7054oVa<Context> a;
    private final C7054oVa<C5467YGa> b;
    private final C7054oVa<C7181qKa> c;

    public C6835lHa(C7054oVa<Context> ova, C7054oVa<C5467YGa> ova2, C7054oVa<C7181qKa> ova3) {
        this.a = ova;
        this.b = ova2;
        this.c = ova3;
    }

    public static C6835lHa a(C7054oVa<Context> ova, C7054oVa<C5467YGa> ova2, C7054oVa<C7181qKa> ova3) {
        return new C6835lHa(ova, ova2, ova3);
    }

    public C6699jHa get() {
        return new C6699jHa((Context) this.a.get(), (C5467YGa) this.b.get(), (C7181qKa) this.c.get());
    }
}
