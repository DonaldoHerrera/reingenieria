package defpackage;

import java.util.List;

/* renamed from: zpa reason: default package and case insensitive filesystem */
/* compiled from: DefaultPlaylistRepository.kt */
final class C7835zpa<T, R> implements C7118pQa<T, MPa<? extends R>> {
    final /* synthetic */ C4938Gpa a;
    final /* synthetic */ List b;

    C7835zpa(C4938Gpa gpa, List list) {
        this.a = gpa;
        this.b = list;
    }

    /* renamed from: a */
    public final IPa<MV> apply(List<C3508cda> list) {
        C7471uYa.b(list, "it");
        return this.a.a(this.b, list);
    }
}
