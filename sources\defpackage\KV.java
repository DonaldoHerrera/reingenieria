package defpackage;

import com.soundcloud.android.properties.a;

/* renamed from: KV reason: default package */
/* compiled from: DataModule_ProvideUserWriterFactory */
public final class KV implements C4961HMa<C3800jea> {
    private final C7054oVa<a> a;
    private final C7054oVa<HW> b;
    private final C7054oVa<C7728yFa> c;

    public KV(C7054oVa<a> ova, C7054oVa<HW> ova2, C7054oVa<C7728yFa> ova3) {
        this.a = ova;
        this.b = ova2;
        this.c = ova3;
    }

    public static KV a(C7054oVa<a> ova, C7054oVa<HW> ova2, C7054oVa<C7728yFa> ova3) {
        return new KV(ova, ova2, ova3);
    }

    public static C3800jea a(a aVar, C7054oVa<HW> ova, C7054oVa<C7728yFa> ova2) {
        C3800jea c2 = HV.c(aVar, ova, ova2);
        C5023JMa.a(c2, "Cannot return null from a non-@Nullable @Provides method");
        return c2;
    }

    public C3800jea get() {
        return a((a) this.a.get(), this.b, this.c);
    }
}
