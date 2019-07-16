package defpackage;

import android.content.Context;

/* renamed from: bP reason: default package and case insensitive filesystem */
/* compiled from: ApiModule_ProvideUnauthorizedRequestRegistryFactory */
public final class C2469bP implements C4961HMa<C3218qP> {
    private final C7054oVa<Context> a;

    public C2469bP(C7054oVa<Context> ova) {
        this.a = ova;
    }

    public static C2469bP a(C7054oVa<Context> ova) {
        return new C2469bP(ova);
    }

    public static C3218qP a(Context context) {
        C3218qP b = C2264RO.b(context);
        C5023JMa.a(b, "Cannot return null from a non-@Nullable @Provides method");
        return b;
    }

    public C3218qP get() {
        return a((Context) this.a.get());
    }
}
