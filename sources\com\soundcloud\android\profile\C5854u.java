package com.soundcloud.android.profile;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* renamed from: com.soundcloud.android.profile.u reason: case insensitive filesystem */
/* compiled from: PostsCleanupHelper.kt */
public final class C5854u extends Xda {
    private final String a = "Posts";
    private final C5500ZKa b;

    public C5854u(C5500ZKa zKa) {
        C7471uYa.b(zKa, "propeller");
        this.b = zKa;
    }

    private final List<C3508cda> d() {
        C3508cda cda;
        C5631bLa<C5326TKa> a2 = this.b.a(C6975nLa.a(d.c).a(d.f, d.e));
        C7471uYa.a((Object) a2, "propeller.query(Query.fr…ables.Posts.TARGET_TYPE))");
        ArrayList arrayList = new ArrayList(C6986nWa.a((Iterable<? extends T>) a2, 10));
        for (C5326TKa tKa : a2) {
            long c = tKa.c(d.f);
            if (tKa.b(d.e) == 0) {
                cda = C3508cda.d(c);
            } else {
                cda = C3508cda.c(c);
            }
            arrayList.add(cda);
        }
        return arrayList;
    }

    public Set<C3508cda> b() {
        List d = d();
        ArrayList arrayList = new ArrayList();
        for (Object next : d) {
            if (((C3508cda) next).u()) {
                arrayList.add(next);
            }
        }
        return C7676xWa.t(arrayList);
    }

    public Set<C3508cda> c() {
        List d = d();
        ArrayList arrayList = new ArrayList();
        for (Object next : d) {
            if (((C3508cda) next).x()) {
                arrayList.add(next);
            }
        }
        return C7676xWa.t(arrayList);
    }

    public String getKey() {
        return this.a;
    }
}
