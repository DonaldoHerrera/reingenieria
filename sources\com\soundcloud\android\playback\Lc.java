package com.soundcloud.android.playback;

/* compiled from: PlayerModule_ProvideExoPlayerConfigurationFactory */
public final class Lc implements C4961HMa<C3781hba> {
    private final C7054oVa<C7181qKa> a;
    private final C7054oVa<C6699jHa> b;

    public Lc(C7054oVa<C7181qKa> ova, C7054oVa<C6699jHa> ova2) {
        this.a = ova;
        this.b = ova2;
    }

    public static Lc a(C7054oVa<C7181qKa> ova, C7054oVa<C6699jHa> ova2) {
        return new Lc(ova, ova2);
    }

    public static C3781hba a(C7181qKa qka, C6699jHa jha) {
        C3781hba a2 = Kc.a(qka, jha);
        C5023JMa.a(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }

    public C3781hba get() {
        return a((C7181qKa) this.a.get(), (C6699jHa) this.b.get());
    }
}
