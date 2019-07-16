package com.soundcloud.android.collection.playhistory;

/* renamed from: com.soundcloud.android.collection.playhistory.x reason: case insensitive filesystem */
/* compiled from: PlayHistoryCleanupHelper_Factory */
public final class C2795x implements C4961HMa<C2794w> {
    private final C7054oVa<va> a;

    public C2795x(C7054oVa<va> ova) {
        this.a = ova;
    }

    public static C2795x a(C7054oVa<va> ova) {
        return new C2795x(ova);
    }

    public C2794w get() {
        return new C2794w((va) this.a.get());
    }
}
