package com.soundcloud.android.offline;

/* compiled from: DownloadConnectionHelper_Factory */
public final class Mb implements C4961HMa<Lb> {
    private final C7054oVa<C6834lGa> a;
    private final C7054oVa<C4088fe> b;

    public Mb(C7054oVa<C6834lGa> ova, C7054oVa<C4088fe> ova2) {
        this.a = ova;
        this.b = ova2;
    }

    public static Mb a(C7054oVa<C6834lGa> ova, C7054oVa<C4088fe> ova2) {
        return new Mb(ova, ova2);
    }

    public Lb get() {
        return new Lb((C6834lGa) this.a.get(), (C4088fe) this.b.get());
    }
}
