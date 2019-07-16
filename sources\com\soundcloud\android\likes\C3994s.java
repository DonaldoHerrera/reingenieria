package com.soundcloud.android.likes;

import com.soundcloud.android.collections.data.J;
import java.util.Map.Entry;

/* renamed from: com.soundcloud.android.likes.s reason: case insensitive filesystem */
/* compiled from: LikesStateProvider.kt */
final class C3994s extends C7540vYa implements _Xa<Entry<? extends C3508cda, ? extends J>, Boolean> {
    public static final C3994s a = new C3994s();

    C3994s() {
        super(1);
    }

    public final boolean a(Entry<C3508cda, J> entry) {
        C7471uYa.b(entry, "it");
        return ((C3508cda) entry.getKey()).u();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return Boolean.valueOf(a((Entry) obj));
    }
}
