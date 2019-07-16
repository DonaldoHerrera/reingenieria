package com.soundcloud.android.offline;

/* renamed from: com.soundcloud.android.offline.le reason: case insensitive filesystem */
/* compiled from: OfflineStatePublisher_Factory */
public final class C4124le implements C4961HMa<C4118ke> {
    private final C7054oVa<C5327TLa> a;
    private final C7054oVa<C4106ie> b;

    public C4124le(C7054oVa<C5327TLa> ova, C7054oVa<C4106ie> ova2) {
        this.a = ova;
        this.b = ova2;
    }

    public static C4124le a(C7054oVa<C5327TLa> ova, C7054oVa<C4106ie> ova2) {
        return new C4124le(ova, ova2);
    }

    public static C4118ke a(C5327TLa tLa, C4106ie ieVar) {
        return new C4118ke(tLa, ieVar);
    }

    public C4118ke get() {
        return new C4118ke((C5327TLa) this.a.get(), (C4106ie) this.b.get());
    }
}
