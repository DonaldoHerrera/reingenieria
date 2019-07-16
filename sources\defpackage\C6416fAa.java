package defpackage;

import java.util.Collection;
import java.util.List;

/* renamed from: fAa reason: default package and case insensitive filesystem */
/* compiled from: FetchPlaylistsCommand */
public class C6416fAa extends _S<C3927zda, C3927zda> {
    public C6416fAa(dfa dfa, HPa hPa) {
        super(dfa, hPa);
    }

    /* access modifiers changed from: protected */
    public hfa a(List<C3508cda> list) {
        T t = new T(1);
        t.put("urns", C5526_Ha.b(list));
        return hfa.c(C2226PO.PLAYLISTS_FETCH.a()).c().a((Object) t).b();
    }

    /* access modifiers changed from: protected */
    public Collection<C3927zda> a(Collection<C3927zda> collection) {
        return collection;
    }

    /* access modifiers changed from: protected */
    public C4990IKa<Pca<C3927zda>> b() {
        return new C6348eAa(this);
    }
}
