package defpackage;

import com.soundcloud.android.properties.a;

/* renamed from: YT reason: default package and case insensitive filesystem */
/* compiled from: ConfigurationSyncJob_Factory */
public final class C2397YT implements C4961HMa<C2379XT> {
    private final C7054oVa<C2288ST> a;
    private final C7054oVa<a> b;

    public C2397YT(C7054oVa<C2288ST> ova, C7054oVa<a> ova2) {
        this.a = ova;
        this.b = ova2;
    }

    public static C2397YT a(C7054oVa<C2288ST> ova, C7054oVa<a> ova2) {
        return new C2397YT(ova, ova2);
    }

    public C2379XT get() {
        return new C2379XT((C2288ST) this.a.get(), (a) this.b.get());
    }
}
