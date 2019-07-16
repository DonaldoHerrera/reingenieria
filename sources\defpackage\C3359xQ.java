package defpackage;

import android.content.Context;

/* renamed from: xQ reason: default package and case insensitive filesystem */
/* compiled from: AppBoyModule_ProvideAppBoyFactory */
public final class C3359xQ implements C4961HMa<C1956BQ> {
    private final C3339wQ a;
    private final C7054oVa<Context> b;
    private final C7054oVa<String> c;

    public C3359xQ(C3339wQ wQVar, C7054oVa<Context> ova, C7054oVa<String> ova2) {
        this.a = wQVar;
        this.b = ova;
        this.c = ova2;
    }

    public static C3359xQ a(C3339wQ wQVar, C7054oVa<Context> ova, C7054oVa<String> ova2) {
        return new C3359xQ(wQVar, ova, ova2);
    }

    public static C1956BQ a(C3339wQ wQVar, Context context, String str) {
        C1956BQ a2 = wQVar.a(context, str);
        C5023JMa.a(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }

    public C1956BQ get() {
        return a(this.a, (Context) this.b.get(), (String) this.c.get());
    }
}
