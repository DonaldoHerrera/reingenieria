package defpackage;

import java.util.Comparator;

/* renamed from: DS reason: default package and case insensitive filesystem */
/* compiled from: MyPlaylistOperations.kt */
final class C1998DS<T> implements Comparator<C3863rda> {
    final /* synthetic */ C1938AS a;

    C1998DS(C1938AS as) {
        this.a = as;
    }

    /* renamed from: a */
    public final int compare(C3863rda rda, C3863rda rda2) {
        C7471uYa.b(rda, "lhs");
        C7471uYa.b(rda2, "rhs");
        return this.a.a(rda2, rda);
    }
}
