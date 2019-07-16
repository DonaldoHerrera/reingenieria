package com.soundcloud.android.activities;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* renamed from: com.soundcloud.android.activities.g reason: case insensitive filesystem */
/* compiled from: ActivitiesCleanupHelper.kt */
public final class C2542g extends Xda {
    private final String a = "Activities";
    private final C5500ZKa b;

    public C2542g(C5500ZKa zKa) {
        C7471uYa.b(zKa, "propeller");
        this.b = zKa;
    }

    private final List<C3508cda> d() {
        C3508cda cda;
        String str = "sound_id";
        String str2 = "sound_type";
        C5631bLa<C5326TKa> a2 = this.b.a(C6975nLa.a(_ea.ActivityView).a(str, str2));
        C7471uYa.a((Object) a2, "propeller.query(Query.fr…ActivityView.SOUND_TYPE))");
        ArrayList arrayList = new ArrayList(C6986nWa.a((Iterable) a2, 10));
        for (C5326TKa tKa : a2) {
            long d = tKa.d(str);
            if (tKa.c(str2) == 0) {
                cda = C3508cda.d(d);
            } else {
                cda = C3508cda.c(d);
            }
            arrayList.add(cda);
        }
        return arrayList;
    }

    public Set<C3508cda> a() {
        String str = "user_id";
        C5631bLa<C5326TKa> a2 = this.b.a(C6975nLa.a(_ea.ActivityView).a(str));
        C7471uYa.a((Object) a2, "propeller.query(Query.fr…ns.ActivityView.USER_ID))");
        ArrayList arrayList = new ArrayList(C6986nWa.a((Iterable) a2, 10));
        for (C5326TKa d : a2) {
            arrayList.add(C3508cda.f(d.d(str)));
        }
        return C7676xWa.t(arrayList);
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
