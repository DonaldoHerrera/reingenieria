package defpackage;

import android.content.Context;

/* renamed from: zla reason: default package and case insensitive filesystem */
/* compiled from: PeripheralsController_Factory */
public final class C4729zla implements C4961HMa<C4675tla> {
    private final C7054oVa<Context> a;
    private final C7054oVa<C3760eea> b;

    public C4729zla(C7054oVa<Context> ova, C7054oVa<C3760eea> ova2) {
        this.a = ova;
        this.b = ova2;
    }

    public static C4729zla a(C7054oVa<Context> ova, C7054oVa<C3760eea> ova2) {
        return new C4729zla(ova, ova2);
    }

    public C4675tla get() {
        return new C4675tla((Context) this.a.get(), (C3760eea) this.b.get());
    }
}
