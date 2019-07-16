package com.soundcloud.android.stream;

import com.soundcloud.android.image.N;

/* renamed from: com.soundcloud.android.stream.o reason: case insensitive filesystem */
/* compiled from: ImagePauseOnScrollListener_Factory */
public final class C6095o implements C4961HMa<C6093n> {
    private final C7054oVa<N> a;

    public C6095o(C7054oVa<N> ova) {
        this.a = ova;
    }

    public static C6095o a(C7054oVa<N> ova) {
        return new C6095o(ova);
    }

    public C6093n get() {
        return new C6093n((N) this.a.get());
    }
}
