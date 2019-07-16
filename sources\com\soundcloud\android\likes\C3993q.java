package com.soundcloud.android.likes;

import com.soundcloud.android.collections.data.J;
import java.util.Map;

/* renamed from: com.soundcloud.android.likes.q reason: case insensitive filesystem */
/* compiled from: LikesStateProvider.kt */
final class C3993q<T> implements C7256rQa<Map<C3508cda, ? extends J>> {
    public static final C3993q a = new C3993q();

    C3993q() {
    }

    /* renamed from: a */
    public final boolean test(Map<C3508cda, J> map) {
        C7471uYa.b(map, "it");
        return !map.isEmpty();
    }
}
