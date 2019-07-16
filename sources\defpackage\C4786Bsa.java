package defpackage;

import java.util.Collection;
import java.util.List;
import java.util.Set;

/* renamed from: Bsa reason: default package and case insensitive filesystem */
/* compiled from: PlaylistStorage.kt */
final class C4786Bsa<T, R> implements C7118pQa<T, R> {
    final /* synthetic */ Collection a;

    C4786Bsa(Collection collection) {
        this.a = collection;
    }

    /* renamed from: a */
    public final Set<C3508cda> apply(List<C3508cda> list) {
        C7471uYa.b(list, "changedTracks");
        return C7676xWa.b((Iterable) list, (Iterable) this.a);
    }
}
