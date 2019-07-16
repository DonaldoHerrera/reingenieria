package com.soundcloud.android.collection.playhistory;

import com.soundcloud.android.sync.ia;
import com.soundcloud.android.tracks.C6185ma;
import java.util.List;

/* renamed from: com.soundcloud.android.collection.playhistory.aa reason: case insensitive filesystem */
/* compiled from: PlayHistoryOperations.kt */
final class C2767aa<T, R> implements C7118pQa<T, EPa<? extends R>> {
    final /* synthetic */ Z a;
    final /* synthetic */ int b;

    C2767aa(Z z, int i) {
        this.a = z;
        this.b = i;
    }

    /* renamed from: a */
    public final APa<List<C6185ma>> apply(ia iaVar) {
        C7471uYa.b(iaVar, "<anonymous parameter 0>");
        return this.a.a(this.b, true);
    }
}
