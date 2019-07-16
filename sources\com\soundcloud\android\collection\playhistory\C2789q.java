package com.soundcloud.android.collection.playhistory;

/* renamed from: com.soundcloud.android.collection.playhistory.q reason: case insensitive filesystem */
/* compiled from: FetchPlayHistoryCommand_Factory */
public final class C2789q implements C4961HMa<C2788p> {
    private final C7054oVa<dfa> a;

    public C2789q(C7054oVa<dfa> ova) {
        this.a = ova;
    }

    public static C2789q a(C7054oVa<dfa> ova) {
        return new C2789q(ova);
    }

    public C2788p get() {
        return new C2788p((dfa) this.a.get());
    }
}
