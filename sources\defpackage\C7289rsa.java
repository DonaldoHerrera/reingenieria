package defpackage;

import com.facebook.stetho.server.http.HttpStatus;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;

/* renamed from: rsa reason: default package and case insensitive filesystem */
/* compiled from: PlaylistStorage.kt */
final class C7289rsa<T, R> implements C7118pQa<T, MPa<? extends R>> {
    final /* synthetic */ C6332dsa a;
    final /* synthetic */ Collection b;

    C7289rsa(C6332dsa dsa, Collection collection) {
        this.a = dsa;
        this.b = collection;
    }

    /* renamed from: a */
    public final IPa<List<Eda>> apply(Set<C3508cda> set) {
        C7471uYa.b(set, "it");
        return APa.a((Iterable<? extends T>) C7676xWa.b((Iterable<? extends T>) this.b, (int) HttpStatus.HTTP_INTERNAL_SERVER_ERROR)).g(new C7013nsa(this)).a((Callable<? extends U>) C7082osa.a, (C6436fQa<? super U, ? super T>) C7151psa.a).e(C7220qsa.a);
    }
}
