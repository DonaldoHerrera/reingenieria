package defpackage;

import java.util.Comparator;
import java.util.Set;

/* renamed from: ES reason: default package and case insensitive filesystem */
/* compiled from: MyPlaylistOperations.kt */
final class C2018ES<T> implements Comparator<C3863rda> {
    final /* synthetic */ C1938AS a;
    final /* synthetic */ Set b;

    C2018ES(C1938AS as, Set set) {
        this.a = as;
        this.b = set;
    }

    /* renamed from: a */
    public final int compare(C3863rda rda, C3863rda rda2) {
        C7471uYa.b(rda, "lhs");
        C7471uYa.b(rda2, "rhs");
        return this.a.a(rda2, rda, this.b);
    }
}
