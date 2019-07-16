package defpackage;

import com.soundcloud.android.properties.a;

/* renamed from: GU reason: default package and case insensitive filesystem */
/* compiled from: Collection2Experiment_Factory */
public final class C2060GU implements C4961HMa<C2040FU> {
    private final C7054oVa<C2137KU> a;
    private final C7054oVa<a> b;

    public C2060GU(C7054oVa<C2137KU> ova, C7054oVa<a> ova2) {
        this.a = ova;
        this.b = ova2;
    }

    public static C2060GU a(C7054oVa<C2137KU> ova, C7054oVa<a> ova2) {
        return new C2060GU(ova, ova2);
    }

    public C2040FU get() {
        return new C2040FU((C2137KU) this.a.get(), (a) this.b.get());
    }
}
