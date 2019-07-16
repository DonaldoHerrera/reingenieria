package defpackage;

import com.soundcloud.android.properties.a;

/* renamed from: RU reason: default package and case insensitive filesystem */
/* compiled from: PlayQueueVideoAdsExperiment_Factory */
public final class C2270RU implements C4961HMa<C2251QU> {
    private final C7054oVa<C2137KU> a;
    private final C7054oVa<a> b;

    public C2270RU(C7054oVa<C2137KU> ova, C7054oVa<a> ova2) {
        this.a = ova;
        this.b = ova2;
    }

    public static C2270RU a(C7054oVa<C2137KU> ova, C7054oVa<a> ova2) {
        return new C2270RU(ova, ova2);
    }

    public C2251QU get() {
        return new C2251QU((C2137KU) this.a.get(), (a) this.b.get());
    }
}
