package com.soundcloud.android.offline;

/* compiled from: OfflineModule_ProvideOfflinePropertiesProviderFactory */
public final class Sd implements C4961HMa<C3815lda> {
    private final C7054oVa<C4180vb> a;

    public Sd(C7054oVa<C4180vb> ova) {
        this.a = ova;
    }

    public static Sd a(C7054oVa<C4180vb> ova) {
        return new Sd(ova);
    }

    public static C3815lda a(C4180vb vbVar) {
        Rd.a(vbVar);
        C5023JMa.a(vbVar, "Cannot return null from a non-@Nullable @Provides method");
        return vbVar;
    }

    public C3815lda get() {
        return a((C4180vb) this.a.get());
    }
}
