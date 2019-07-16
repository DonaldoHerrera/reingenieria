package defpackage;

import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: IS reason: default package and case insensitive filesystem */
/* compiled from: MyPlaylistOperations.kt */
final class C2097IS<T, R> implements C7118pQa<T, R> {
    final /* synthetic */ C2116JS a;
    final /* synthetic */ Set b;

    C2097IS(C2116JS js, Set set) {
        this.a = js;
        this.b = set;
    }

    /* renamed from: a */
    public final List<C3863rda> apply(Map<C3508cda, ? extends C3863rda> map) {
        C7471uYa.b(map, "it");
        return C7676xWa.e(this.a.a.a(map.values(), this.a.b, this.b));
    }
}
