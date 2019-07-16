package defpackage;

import android.content.Context;

/* renamed from: oza reason: default package and case insensitive filesystem */
/* compiled from: StorageModule_ProvideWaveformCacheFactory */
public final class C7096oza implements C4961HMa<C7321sMa<C5325TJa>> {
    private final C7054oVa<Context> a;
    private final C7054oVa<C5354UJa> b;

    public C7096oza(C7054oVa<Context> ova, C7054oVa<C5354UJa> ova2) {
        this.a = ova;
        this.b = ova2;
    }

    public static C7096oza a(C7054oVa<Context> ova, C7054oVa<C5354UJa> ova2) {
        return new C7096oza(ova, ova2);
    }

    public static C7321sMa<C5325TJa> a(Context context, C5354UJa uJa) {
        C7321sMa<C5325TJa> a2 = C7853zya.a(context, uJa);
        C5023JMa.a(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }

    public C7321sMa<C5325TJa> get() {
        return a((Context) this.a.get(), (C5354UJa) this.b.get());
    }
}
