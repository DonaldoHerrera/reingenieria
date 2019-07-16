package com.soundcloud.android.comments;

import com.soundcloud.android.comments.C2921y.a;
import java.util.List;
import java.util.Map;

/* compiled from: CommentsPresenter.kt */
final class U<T1, T2, R> implements C6504gQa<Map<C3508cda, ? extends C4954HFa>, C4928GKa<a>, T> {
    final /* synthetic */ V a;
    final /* synthetic */ C3508cda b;

    U(V v, C3508cda cda) {
        this.a = v;
        this.b = cda;
    }

    /* renamed from: a */
    public final T apply(Map<C3508cda, C4954HFa> map, C4928GKa<a> gKa) {
        Map<C3508cda, C4954HFa> map2 = map;
        C4928GKa<a> gKa2 = gKa;
        C7471uYa.b(map2, "users");
        C7471uYa.b(gKa2, "commentSelected");
        V v = this.a;
        W w = v.a;
        C c = v.b;
        C3508cda cda = this.b;
        C7471uYa.a((Object) cda, "loggedInUser");
        List a2 = w.a(c, map2, gKa2, cda);
        Object obj = map2.get(this.b);
        if (obj != null) {
            C4954HFa hFa = (C4954HFa) obj;
            V v2 = this.a;
            T t = new T(a2, hFa, v2.a.a(v2.b, gKa2), gKa.c(), this.a.b.b(), this.a.b.g(), this.a.b.e(), this.a.b.c());
            return t;
        }
        throw new IllegalArgumentException("Required value was null.");
    }
}
