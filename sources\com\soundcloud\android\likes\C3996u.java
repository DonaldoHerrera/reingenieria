package com.soundcloud.android.likes;

import java.util.Set;

/* renamed from: com.soundcloud.android.likes.u reason: case insensitive filesystem */
/* compiled from: LikesStateProvider.kt */
final class C3996u<T> implements C7256rQa<Set<? extends C3508cda>> {
    public static final C3996u a = new C3996u();

    C3996u() {
    }

    /* renamed from: a */
    public final boolean test(Set<C3508cda> set) {
        C7471uYa.b(set, "it");
        return !set.isEmpty();
    }
}
