package com.soundcloud.android.fcm;

import com.soundcloud.android.playback.K;

/* renamed from: com.soundcloud.android.fcm.d reason: case insensitive filesystem */
/* compiled from: ConcurrentStreamMessageListener_Factory */
public final class C3538d implements C4961HMa<C3537c> {
    private final C7054oVa<K> a;
    private final C7054oVa<C3856qea> b;
    private final C7054oVa<Ica> c;

    public C3538d(C7054oVa<K> ova, C7054oVa<C3856qea> ova2, C7054oVa<Ica> ova3) {
        this.a = ova;
        this.b = ova2;
        this.c = ova3;
    }

    public static C3538d a(C7054oVa<K> ova, C7054oVa<C3856qea> ova2, C7054oVa<Ica> ova3) {
        return new C3538d(ova, ova2, ova3);
    }

    public C3537c get() {
        return new C3537c((K) this.a.get(), (C3856qea) this.b.get(), (Ica) this.c.get());
    }
}
