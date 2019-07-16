package com.soundcloud.android.collection.playhistory;

import com.google.common.base.Function;
import com.soundcloud.android.tracks.C6185ma;

/* renamed from: com.soundcloud.android.collection.playhistory.da reason: case insensitive filesystem */
/* compiled from: PlayHistoryOperations.kt */
final class C2773da<F, T> implements Function<T, V> {
    final /* synthetic */ C6185ma a;

    C2773da(C6185ma maVar) {
        this.a = maVar;
    }

    public final boolean a(C3508cda cda) {
        return C7471uYa.a((Object) this.a.e(), (Object) cda);
    }

    public /* bridge */ /* synthetic */ Object apply(Object obj) {
        return Boolean.valueOf(a((C3508cda) obj));
    }
}
