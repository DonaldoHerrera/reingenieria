package defpackage;

import android.content.Context;

/* renamed from: xI reason: default package and case insensitive filesystem */
/* compiled from: MoatViewabilityController_Factory */
public final class C3351xI implements C4961HMa<C3331wI> {
    private final C7054oVa<Context> a;
    private final C7054oVa<C6699jHa> b;

    public C3351xI(C7054oVa<Context> ova, C7054oVa<C6699jHa> ova2) {
        this.a = ova;
        this.b = ova2;
    }

    public static C3351xI a(C7054oVa<Context> ova, C7054oVa<C6699jHa> ova2) {
        return new C3351xI(ova, ova2);
    }

    public C3331wI get() {
        return new C3331wI((Context) this.a.get(), (C6699jHa) this.b.get());
    }
}
