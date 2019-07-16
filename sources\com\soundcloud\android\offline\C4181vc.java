package com.soundcloud.android.offline;

/* renamed from: com.soundcloud.android.offline.vc reason: case insensitive filesystem */
/* compiled from: LoadOfflineContentUpdatesCommand_Factory */
public final class C4181vc implements C4961HMa<C4175uc> {
    private final C7054oVa<De> a;

    public C4181vc(C7054oVa<De> ova) {
        this.a = ova;
    }

    public static C4181vc a(C7054oVa<De> ova) {
        return new C4181vc(ova);
    }

    public static C4175uc a(De de) {
        return new C4175uc(de);
    }

    public C4175uc get() {
        return new C4175uc((De) this.a.get());
    }
}
