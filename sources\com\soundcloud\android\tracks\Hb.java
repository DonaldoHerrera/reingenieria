package com.soundcloud.android.tracks;

import java.util.List;
import java.util.Set;

/* compiled from: TracksVault.kt */
public class Hb implements Zfa<C3508cda, List<? extends C3509cea>> {
    private final /* synthetic */ Zfa a;

    public Hb(Ib ib) {
        C7471uYa.b(ib, "factory");
        this.a = ib.a();
    }

    public APa<Wfa<C3508cda, List<C3509cea>>> a(Set<C3508cda> set) {
        C7471uYa.b(set, "keys");
        return this.a.a(set);
    }

    public APa<Wfa<C3508cda, List<C3509cea>>> b(Set<C3508cda> set) {
        C7471uYa.b(set, "keys");
        return this.a.b(set);
    }

    public APa<Wfa<C3508cda, List<C3509cea>>> c(Set<C3508cda> set) {
        C7471uYa.b(set, "keys");
        return this.a.c(set);
    }
}
