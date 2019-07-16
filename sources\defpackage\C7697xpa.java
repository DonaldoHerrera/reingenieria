package defpackage;

import java.util.List;

/* renamed from: xpa reason: default package and case insensitive filesystem */
/* compiled from: DefaultPlaylistRepository.kt */
final class C7697xpa<T, R> implements C7118pQa<T, R> {
    final /* synthetic */ C3508cda a;

    C7697xpa(C3508cda cda) {
        this.a = cda;
    }

    /* renamed from: a */
    public final Pda<Eda> apply(List<? extends Eda> list) {
        C7471uYa.b(list, "it");
        if (list.isEmpty()) {
            return c.a.a(this.a, null);
        }
        if (list.size() == 1) {
            return b.a.a(C7676xWa.f(list));
        }
        throw new IllegalStateException("Multiple playlists found with the same urm");
    }
}
