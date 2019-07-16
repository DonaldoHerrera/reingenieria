package defpackage;

import android.content.Context;

/* renamed from: yia reason: default package and case insensitive filesystem */
/* compiled from: InAppUpdatesModule_ProvideAppUpdateManagerFactory */
public final class C4717yia implements C4961HMa<C1315gA> {
    private final C7054oVa<Context> a;

    public static C1315gA a(Context context) {
        C1315gA a2 = C4708xia.a(context);
        C5023JMa.a(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }

    public C1315gA get() {
        return a((Context) this.a.get());
    }
}
