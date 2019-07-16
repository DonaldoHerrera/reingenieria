package defpackage;

import java.util.List;

/* renamed from: iwa reason: default package and case insensitive filesystem */
/* compiled from: LocalSearchSuggestionOperations.kt */
final class C6680iwa<T, R> implements C7118pQa<T, R> {
    final /* synthetic */ int a;

    C6680iwa(int i) {
        this.a = i;
    }

    /* renamed from: a */
    public final List<C7159pwa> apply(List<? extends C7159pwa> list) {
        C7471uYa.b(list, "it");
        return list.subList(0, Math.min(list.size(), this.a));
    }
}
