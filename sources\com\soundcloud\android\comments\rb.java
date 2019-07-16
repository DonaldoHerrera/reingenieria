package com.soundcloud.android.comments;

import java.util.List;
import java.util.Map;

/* compiled from: Observables.kt */
public final class rb<T1, T2, T3, R> implements C6844lQa<T1, T2, T3, R> {
    final /* synthetic */ mb a;

    public rb(mb mbVar) {
        this.a = mbVar;
    }

    public final R a(T1 t1, T2 t2, T3 t3) {
        List<C3508cda> list = (List) t3;
        Map map = (Map) t2;
        Db db = (Db) t1;
        List c = C7676xWa.c(db.a());
        for (C2919x xVar : map.values()) {
            if (xVar.a() != null) {
                this.a.b(c, xVar.a().a());
            }
            if (xVar.b() != null) {
                this.a.a(c, xVar.b().a());
            }
        }
        C7471uYa.a((Object) list, "reportedComments");
        for (C3508cda a2 : list) {
            this.a.a(c, a2);
        }
        return Db.a(db, null, c, null, 5, null);
    }
}
