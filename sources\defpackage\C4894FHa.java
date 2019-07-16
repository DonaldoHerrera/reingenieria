package defpackage;

import com.soundcloud.android.properties.j;

/* renamed from: FHa reason: default package and case insensitive filesystem */
/* compiled from: LeakCanaryWrapper_Factory */
public final class C4894FHa implements C4961HMa<C4863EHa> {
    private final C7054oVa<j> a;

    public C4894FHa(C7054oVa<j> ova) {
        this.a = ova;
    }

    public static C4894FHa a(C7054oVa<j> ova) {
        return new C4894FHa(ova);
    }

    public C4863EHa get() {
        return new C4863EHa((j) this.a.get());
    }
}
