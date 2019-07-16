package defpackage;

import java.util.Collection;
import java.util.List;

/* renamed from: iAa reason: default package and case insensitive filesystem */
/* compiled from: FetchTracksCommand */
public class C6620iAa extends _S<Yda, Yda> {
    public C6620iAa(dfa dfa, HPa hPa) {
        super(dfa, hPa);
    }

    /* access modifiers changed from: protected */
    public hfa a(List<C3508cda> list) {
        T t = new T(1);
        t.put("urns", C5526_Ha.b(list));
        return hfa.c(C2226PO.TRACKS_FETCH.a()).c().a((Object) t).b();
    }

    /* access modifiers changed from: protected */
    public Collection<Yda> a(Collection collection) {
        return collection;
    }

    /* access modifiers changed from: protected */
    public C4990IKa<Pca<Yda>> b() {
        return new C6552hAa(this);
    }
}
