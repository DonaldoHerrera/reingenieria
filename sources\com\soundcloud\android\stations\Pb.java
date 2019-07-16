package com.soundcloud.android.stations;

import com.google.common.base.Function;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;

/* compiled from: StationWithTracks */
public class Pb {
    private static final Comparator<C6040qb> a = C6014i.a;
    private static final Function<C6040qb, String> b = C6011h.a;
    private C3508cda c;
    private String d;
    private String e;
    private final String f;
    private List<C6040qb> g;
    private C4928GKa<String> h;
    private final int i;
    private boolean j;

    Pb(C3508cda cda, String str, String str2, C4928GKa<String> gKa, String str3, List<C6040qb> list, int i2, boolean z) {
        this.c = cda;
        this.d = str2;
        this.e = str;
        this.f = str3;
        this.g = list;
        this.h = gKa;
        this.i = i2;
        this.j = z;
    }

    static /* synthetic */ int a(C6040qb qbVar, C6040qb qbVar2) {
        return qbVar2.c().S() - qbVar.c().S();
    }

    /* access modifiers changed from: 0000 */
    public List<String> b() {
        ArrayList arrayList = new ArrayList(d());
        Collections.sort(arrayList, a);
        LinkedHashSet linkedHashSet = new LinkedHashSet(C3063jD.a((Collection<F>) arrayList, b));
        return new ArrayList(linkedHashSet).subList(0, Math.min(3, linkedHashSet.size()));
    }

    public int c() {
        return this.i;
    }

    public List<C6040qb> d() {
        return this.g;
    }

    public String e() {
        return this.e;
    }

    public String f() {
        return this.d;
    }

    public C3508cda g() {
        return this.c;
    }

    public boolean h() {
        return this.j;
    }

    public static Pb a(Uda uda, List<C6040qb> list) {
        Pb pb = new Pb(uda.g(), uda.d(), uda.f(), C4928GKa.b(uda.a()), uda.c(), list, -1, uda.b());
        return pb;
    }

    public C4928GKa<String> a() {
        return this.h;
    }
}
