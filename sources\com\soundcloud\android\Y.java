package com.soundcloud.android;

/* compiled from: ApplicationModule_ProvidesPackageManagerFactory */
public final class Y implements C4961HMa<C5222Pwa> {
    private final C2933l a;

    public Y(C2933l lVar) {
        this.a = lVar;
    }

    public static Y a(C2933l lVar) {
        return new Y(lVar);
    }

    public static C5222Pwa b(C2933l lVar) {
        C5222Pwa j = lVar.j();
        C5023JMa.a(j, "Cannot return null from a non-@Nullable @Provides method");
        return j;
    }

    public C5222Pwa get() {
        return b(this.a);
    }
}
