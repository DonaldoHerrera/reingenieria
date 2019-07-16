package defpackage;

import java.util.List;

/* renamed from: Yra reason: default package and case insensitive filesystem */
/* compiled from: PlaylistOperations.kt */
final class C5481Yra<T, R> implements C7118pQa<T, MPa<? extends R>> {
    final /* synthetic */ C4909Fra a;
    final /* synthetic */ C3508cda b;

    C5481Yra(C4909Fra fra, C3508cda cda) {
        this.a = fra;
        this.b = cda;
    }

    /* renamed from: a */
    public final MPa<? extends List<C3508cda>> apply(List<C3508cda> list) {
        C7471uYa.b(list, "urns");
        return this.a.c(this.b, list);
    }
}
