package defpackage;

import com.soundcloud.android.properties.a;

/* renamed from: mya reason: default package and case insensitive filesystem */
/* compiled from: DatabaseCleanupJob_Factory */
public final class C6956mya implements C4961HMa<C6888lya> {
    private final C7054oVa<C5680bya> a;
    private final C7054oVa<a> b;

    public C6956mya(C7054oVa<C5680bya> ova, C7054oVa<a> ova2) {
        this.a = ova;
        this.b = ova2;
    }

    public static C6956mya a(C7054oVa<C5680bya> ova, C7054oVa<a> ova2) {
        return new C6956mya(ova, ova2);
    }

    public C6888lya get() {
        return new C6888lya((C5680bya) this.a.get(), (a) this.b.get());
    }
}
