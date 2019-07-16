package defpackage;

import java.util.Collection;
import java.util.List;

/* renamed from: lAa reason: default package and case insensitive filesystem */
/* compiled from: FetchUsersCommand */
public class C6824lAa extends _S<C3776gea, C3776gea> {
    public C6824lAa(dfa dfa, HPa hPa) {
        super(dfa, hPa);
    }

    /* access modifiers changed from: protected */
    public hfa a(List<C3508cda> list) {
        T t = new T(1);
        t.put("urns", C5526_Ha.b(list));
        return hfa.c(C2226PO.USERS_FETCH.a()).c().a((Object) t).b();
    }

    /* access modifiers changed from: protected */
    public Collection<C3776gea> a(Collection<C3776gea> collection) {
        return collection;
    }

    /* access modifiers changed from: protected */
    public C4990IKa<? extends Iterable<C3776gea>> b() {
        return new C6756kAa(this);
    }
}
