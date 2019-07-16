package com.soundcloud.android.comments;

import java.util.Collection;
import java.util.Set;

/* compiled from: PlayerCommentOperations.kt */
final class Ta<T, R> implements C7118pQa<T, EPa<? extends R>> {
    final /* synthetic */ Ua a;

    Ta(Ua ua) {
        this.a = ua;
    }

    /* renamed from: a */
    public final APa<Set<C3799jda>> apply(Collection<C3791ida> collection) {
        C7471uYa.b(collection, "it");
        return this.a.c.a(new Ra(collection), new Sa(collection));
    }
}
