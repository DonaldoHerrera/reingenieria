package com.soundcloud.android;

/* compiled from: ApplicationModule_ProvidesRepostsStateProviderFactory */
public final class aa implements C4961HMa<C1937AR> {
    private final C7054oVa<C2210OR> a;

    public aa(C7054oVa<C2210OR> ova) {
        this.a = ova;
    }

    public static aa a(C7054oVa<C2210OR> ova) {
        return new aa(ova);
    }

    public static C1937AR a(C2210OR or) {
        C2933l.a(or);
        C5023JMa.a(or, "Cannot return null from a non-@Nullable @Provides method");
        return or;
    }

    public C1937AR get() {
        return a((C2210OR) this.a.get());
    }
}
