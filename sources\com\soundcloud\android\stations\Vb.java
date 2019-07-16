package com.soundcloud.android.stations;

import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* compiled from: StationsApi */
public class Vb {
    private final efa a;
    private final dfa b;

    public Vb(efa efa, dfa dfa) {
        this.a = efa;
        this.b = dfa;
    }

    /* access modifiers changed from: 0000 */
    public Pca<C3508cda> a(C6036pa paVar) throws ifa, IOException, Lea {
        b d = hfa.d(C2226PO.STATIONS_LIKED.a());
        HashMap hashMap = new HashMap(2);
        hashMap.put("liked", C5526_Ha.b(paVar.a()));
        hashMap.put("unliked", C5526_Ha.b(paVar.b()));
        return (Pca) this.b.a(d.c().a((Object) hashMap).b(), (C4990IKa<ResourceType>) new Tb<ResourceType>(this));
    }

    /* access modifiers changed from: 0000 */
    public IPa<r> a(C3508cda cda) {
        return this.a.a(hfa.b(C2226PO.STATION.a(cda.toString())).c().b(), r.class);
    }

    public List<C6043s> a(List<C3508cda> list) throws ifa, IOException, Lea {
        return ((Pca) this.b.a(hfa.c(C2226PO.STATIONS_FETCH.a()).c().a((Object) Collections.singletonMap("urns", C5526_Ha.b(list))).b(), (C4990IKa<ResourceType>) new Ub<ResourceType>(this))).f();
    }
}
