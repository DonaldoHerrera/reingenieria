package defpackage;

import android.content.Context;

/* renamed from: EM reason: default package and case insensitive filesystem */
/* compiled from: TrackingDbHelper_Factory */
public final class C2012EM implements C4961HMa<C1992DM> {
    private final C7054oVa<Context> a;

    public C2012EM(C7054oVa<Context> ova) {
        this.a = ova;
    }

    public static C2012EM a(C7054oVa<Context> ova) {
        return new C2012EM(ova);
    }

    public C1992DM get() {
        return new C1992DM((Context) this.a.get());
    }
}
