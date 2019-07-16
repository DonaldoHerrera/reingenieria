package defpackage;

import java.util.List;

/* renamed from: Hva reason: default package and case insensitive filesystem */
/* compiled from: LocalSearchSuggestionOperations.kt */
final class C4975Hva<T, R> implements C7118pQa<T, R> {
    public static final C4975Hva a = new C4975Hva();

    C4975Hva() {
    }

    /* renamed from: a */
    public final List<Eda> apply(Ida<Eda> ida) {
        C7471uYa.b(ida, "it");
        if (ida instanceof c) {
            return ((c) ida).a();
        }
        if (ida instanceof b) {
            return ((b) ida).b();
        }
        if (ida instanceof a) {
            throw ((a) ida).a();
        }
        throw new FVa();
    }
}
