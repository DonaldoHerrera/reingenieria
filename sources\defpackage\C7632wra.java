package defpackage;

import java.util.List;

/* renamed from: wra reason: default package and case insensitive filesystem */
/* compiled from: PlaylistItemRepository.kt */
final class C7632wra<T, R> implements C7118pQa<T, R> {
    final /* synthetic */ boolean a;

    C7632wra(boolean z) {
        this.a = z;
    }

    /* renamed from: a */
    public final List<Eda> apply(Ida<Eda> ida) {
        C7471uYa.b(ida, "it");
        if (ida instanceof c) {
            return ((c) ida).a();
        }
        if (ida instanceof b) {
            if (this.a) {
                return ((b) ida).b();
            }
            b bVar = (b) ida;
            if (bVar.a() == null) {
                return C6918mWa.a();
            }
            Kda a2 = bVar.a();
            if (a2 == null) {
                throw new OVa("null cannot be cast to non-null type kotlin.Exception /* = java.lang.Exception */");
            }
            throw a2;
        } else if (ida instanceof a) {
            throw ((a) ida).a();
        } else {
            throw new FVa();
        }
    }
}
