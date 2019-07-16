package com.soundcloud.android.discovery.systemplaylist;

import com.soundcloud.android.image.va;
import java.util.Date;
import java.util.List;

/* renamed from: com.soundcloud.android.discovery.systemplaylist.k reason: case insensitive filesystem */
/* compiled from: SystemPlaylist */
public abstract class C3520k {
    public static C3520k a(C3508cda cda, C4928GKa<C3508cda> gKa, C4928GKa<String> gKa2, C4928GKa<String> gKa3, List<C3509cea> list, C4928GKa<Date> gKa4, C4928GKa<String> gKa5, C4928GKa<String> gKa6) {
        C3517h hVar = new C3517h(cda, gKa, gKa2, gKa3, gKa5, list, gKa4, gKa6);
        return hVar;
    }

    public abstract C4928GKa<String> a();

    public abstract C4928GKa<String> b();

    public C4928GKa<Vca> c() {
        if (a().c()) {
            return C4928GKa.c(va.a(i(), a()));
        }
        if (h().isEmpty()) {
            return C4928GKa.a();
        }
        return C4928GKa.c(va.a((C3509cea) h().get(0)));
    }

    public abstract C4928GKa<Date> d();

    public abstract C4928GKa<C3508cda> e();

    public abstract C4928GKa<String> f();

    public abstract C4928GKa<String> g();

    public abstract List<C3509cea> h();

    public abstract C3508cda i();
}
