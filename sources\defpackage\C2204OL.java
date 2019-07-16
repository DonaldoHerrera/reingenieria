package defpackage;

import com.soundcloud.android.properties.j;

/* renamed from: OL reason: default package and case insensitive filesystem */
/* compiled from: DefaultDevicePropertiesProvider_Factory */
public final class C2204OL implements C4961HMa<C2185NL> {
    private final C7054oVa<C6699jHa> a;
    private final C7054oVa<j> b;

    public C2204OL(C7054oVa<C6699jHa> ova, C7054oVa<j> ova2) {
        this.a = ova;
        this.b = ova2;
    }

    public static C2204OL a(C7054oVa<C6699jHa> ova, C7054oVa<j> ova2) {
        return new C2204OL(ova, ova2);
    }

    public C2185NL get() {
        return new C2185NL((C6699jHa) this.a.get(), (j) this.b.get());
    }
}
