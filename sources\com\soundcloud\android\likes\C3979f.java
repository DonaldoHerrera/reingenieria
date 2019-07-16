package com.soundcloud.android.likes;

import com.soundcloud.android.collections.data.ga;

/* renamed from: com.soundcloud.android.likes.f reason: case insensitive filesystem */
/* compiled from: LikeOperations.kt */
final class C3979f<T, R> implements C7118pQa<T, MPa<? extends R>> {
    final /* synthetic */ C3983h a;
    final /* synthetic */ ga b;

    C3979f(C3983h hVar, ga gaVar) {
        this.a = hVar;
        this.b = gaVar;
    }

    /* renamed from: a */
    public final IPa<Integer> apply(Integer num) {
        C7471uYa.b(num, "it");
        return this.a.c.a(this.b).a(num);
    }
}
