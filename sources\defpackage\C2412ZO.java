package defpackage;

import android.content.Context;

/* renamed from: ZO reason: default package and case insensitive filesystem */
/* compiled from: ApiModule_ProvideOkHttpCacheFactory */
public final class C2412ZO implements C4961HMa<Vxb> {
    private final C7054oVa<Context> a;

    public C2412ZO(C7054oVa<Context> ova) {
        this.a = ova;
    }

    public static C2412ZO a(C7054oVa<Context> ova) {
        return new C2412ZO(ova);
    }

    public static Vxb a(Context context) {
        return C2264RO.a(context);
    }

    public Vxb get() {
        return a((Context) this.a.get());
    }
}
