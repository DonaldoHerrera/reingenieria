package defpackage;

import com.facebook.stetho.server.http.HttpStatus;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

/* renamed from: hsa reason: default package and case insensitive filesystem */
/* compiled from: PlaylistStorage.kt */
final class C6604hsa<T, R> implements C7118pQa<T, MPa<? extends R>> {
    final /* synthetic */ C6332dsa a;
    final /* synthetic */ Collection b;

    C6604hsa(C6332dsa dsa, Collection collection) {
        this.a = dsa;
        this.b = collection;
    }

    /* renamed from: a */
    public final IPa<List<C3508cda>> apply(Set<C3508cda> set) {
        C7471uYa.b(set, "it");
        return APa.a((Iterable<? extends T>) C7676xWa.b((Iterable) this.b, (int) HttpStatus.HTTP_INTERNAL_SERVER_ERROR)).g(new C6468fsa(this)).a(new ArrayList(), (C6504gQa<R, ? super T, R>) C6536gsa.a);
    }
}
