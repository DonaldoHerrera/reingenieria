package com.soundcloud.android.likes;

import com.soundcloud.android.collections.data.K;

/* renamed from: com.soundcloud.android.likes.d reason: case insensitive filesystem */
/* compiled from: LikeCleanupHelper_Factory */
public final class C3975d implements C4961HMa<C3973c> {
    private final C7054oVa<K> a;

    public C3975d(C7054oVa<K> ova) {
        this.a = ova;
    }

    public static C3975d a(C7054oVa<K> ova) {
        return new C3975d(ova);
    }

    public C3973c get() {
        return new C3973c((K) this.a.get());
    }
}
