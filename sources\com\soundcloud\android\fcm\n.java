package com.soundcloud.android.fcm;

/* compiled from: FcmDecryptor_Factory */
public final class n implements C4961HMa<m> {
    private final C7054oVa<C3244rV> a;

    public n(C7054oVa<C3244rV> ova) {
        this.a = ova;
    }

    public static n a(C7054oVa<C3244rV> ova) {
        return new n(ova);
    }

    public m get() {
        return new m((C3244rV) this.a.get());
    }
}
