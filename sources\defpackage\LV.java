package defpackage;

import com.soundcloud.android.properties.a;

/* renamed from: LV reason: default package */
/* compiled from: DataModule_ProvidesUserRepositoryFactory */
public final class LV implements C4961HMa<C3792iea> {
    private final C7054oVa<a> a;
    private final C7054oVa<WW> b;
    private final C7054oVa<C7728yFa> c;

    public LV(C7054oVa<a> ova, C7054oVa<WW> ova2, C7054oVa<C7728yFa> ova3) {
        this.a = ova;
        this.b = ova2;
        this.c = ova3;
    }

    public static LV a(C7054oVa<a> ova, C7054oVa<WW> ova2, C7054oVa<C7728yFa> ova3) {
        return new LV(ova, ova2, ova3);
    }

    public static C3792iea a(a aVar, C7054oVa<WW> ova, C7054oVa<C7728yFa> ova2) {
        C3792iea d = HV.d(aVar, ova, ova2);
        C5023JMa.a(d, "Cannot return null from a non-@Nullable @Provides method");
        return d;
    }

    public C3792iea get() {
        return a((a) this.a.get(), this.b, this.c);
    }
}
