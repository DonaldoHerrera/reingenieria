package com.soundcloud.android.comments;

import java.util.Collection;
import java.util.HashMap;

/* compiled from: PlayerCommentOperations.kt */
final class Qa<T, R> implements C7118pQa<T, R> {
    public static final Qa a = new Qa();

    Qa() {
    }

    /* renamed from: a */
    public final Collection<C3791ida> apply(Db db) {
        C7471uYa.b(db, "it");
        HashMap hashMap = new HashMap();
        for (C3791ida ida : db.a()) {
            if (!ida.f()) {
                hashMap.put(Long.valueOf(ida.d()), ida);
            }
        }
        return hashMap.values();
    }
}
