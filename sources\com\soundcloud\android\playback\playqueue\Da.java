package com.soundcloud.android.playback.playqueue;

import java.util.List;

/* compiled from: PlayQueueOperations.kt */
final class Da<T, R> implements C7118pQa<T, R> {
    public static final Da a = new Da();

    Da() {
    }

    /* renamed from: a */
    public final List<Eda> apply(Ida<Eda> ida) {
        C7471uYa.b(ida, "it");
        if (ida instanceof c) {
            return ((c) ida).a();
        }
        if (ida instanceof b) {
            return ((b) ida).b();
        }
        if (ida instanceof a) {
            throw ((a) ida).a();
        }
        throw new FVa();
    }
}
