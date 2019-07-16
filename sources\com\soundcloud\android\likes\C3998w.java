package com.soundcloud.android.likes;

import com.soundcloud.android.collections.data.J;
import java.util.Map.Entry;

/* renamed from: com.soundcloud.android.likes.w reason: case insensitive filesystem */
/* compiled from: LikesStateProvider.kt */
final class C3998w extends C7540vYa implements _Xa<Entry<? extends C3508cda, ? extends J>, Boolean> {
    public static final C3998w a = new C3998w();

    C3998w() {
        super(1);
    }

    public final boolean a(Entry<C3508cda, J> entry) {
        C7471uYa.b(entry, "it");
        return ((C3508cda) entry.getKey()).x();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return Boolean.valueOf(a((Entry) obj));
    }
}
