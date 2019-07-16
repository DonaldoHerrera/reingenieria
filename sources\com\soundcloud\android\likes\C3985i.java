package com.soundcloud.android.likes;

import com.soundcloud.android.collections.data.L;
import com.soundcloud.android.sync.T;

/* renamed from: com.soundcloud.android.likes.i reason: case insensitive filesystem */
/* compiled from: LikeOperations_Factory */
public final class C3985i implements C4961HMa<C3983h> {
    private final C7054oVa<T> a;
    private final C7054oVa<HPa> b;
    private final C7054oVa<L> c;
    private final C7054oVa<C7441tza> d;

    public C3985i(C7054oVa<T> ova, C7054oVa<HPa> ova2, C7054oVa<L> ova3, C7054oVa<C7441tza> ova4) {
        this.a = ova;
        this.b = ova2;
        this.c = ova3;
        this.d = ova4;
    }

    public static C3985i a(C7054oVa<T> ova, C7054oVa<HPa> ova2, C7054oVa<L> ova3, C7054oVa<C7441tza> ova4) {
        return new C3985i(ova, ova2, ova3, ova4);
    }

    public C3983h get() {
        return new C3983h((T) this.a.get(), (HPa) this.b.get(), (L) this.c.get(), (C7441tza) this.d.get());
    }
}
