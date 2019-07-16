package com.soundcloud.android.stream;

/* renamed from: com.soundcloud.android.stream.x reason: case insensitive filesystem */
/* compiled from: SoundStreamSyncProvider_Factory */
public final class C6112x implements C4961HMa<C6110w> {
    private final C7054oVa<a> a;

    public C6112x(C7054oVa<a> ova) {
        this.a = ova;
    }

    public static C6112x a(C7054oVa<a> ova) {
        return new C6112x(ova);
    }

    public C6110w get() {
        return new C6110w((a) this.a.get());
    }
}
