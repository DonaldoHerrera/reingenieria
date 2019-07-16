package defpackage;

import java.util.List;

/* renamed from: Dpa reason: default package and case insensitive filesystem */
/* compiled from: DefaultPlaylistRepository.kt */
final class C4845Dpa<T, R> implements C7118pQa<T, EPa<? extends R>> {
    final /* synthetic */ C4938Gpa a;
    final /* synthetic */ List b;

    C4845Dpa(C4938Gpa gpa, List list) {
        this.a = gpa;
        this.b = list;
    }

    /* renamed from: a */
    public final APa<Ida<Eda>> apply(MV mv) {
        C7471uYa.b(mv, "it");
        return QV.a(this.a.b(this.b), mv);
    }
}
