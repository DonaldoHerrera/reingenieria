package com.soundcloud.android.likes;

import com.soundcloud.android.collections.data.K;
import com.soundcloud.android.collections.data.L;

/* renamed from: com.soundcloud.android.likes.y reason: case insensitive filesystem */
/* compiled from: LikesStateProvider_Factory */
public final class C4000y implements C4961HMa<C3989m> {
    private final C7054oVa<K> a;
    private final C7054oVa<L> b;
    private final C7054oVa<HPa> c;
    private final C7054oVa<HPa> d;

    public C4000y(C7054oVa<K> ova, C7054oVa<L> ova2, C7054oVa<HPa> ova3, C7054oVa<HPa> ova4) {
        this.a = ova;
        this.b = ova2;
        this.c = ova3;
        this.d = ova4;
    }

    public static C4000y a(C7054oVa<K> ova, C7054oVa<L> ova2, C7054oVa<HPa> ova3, C7054oVa<HPa> ova4) {
        return new C4000y(ova, ova2, ova3, ova4);
    }

    public C3989m get() {
        return new C3989m((K) this.a.get(), (L) this.b.get(), (HPa) this.c.get(), (HPa) this.d.get());
    }
}
