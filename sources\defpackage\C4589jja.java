package defpackage;

import com.soundcloud.android.properties.a;

/* renamed from: jja reason: default package and case insensitive filesystem */
/* compiled from: NavigationExecutor_Factory */
public final class C4589jja implements C4961HMa<C4581ija> {
    private final C7054oVa<a> a;

    public C4589jja(C7054oVa<a> ova) {
        this.a = ova;
    }

    public static C4589jja a(C7054oVa<a> ova) {
        return new C4589jja(ova);
    }

    public C4581ija get() {
        return new C4581ija((a) this.a.get());
    }
}
