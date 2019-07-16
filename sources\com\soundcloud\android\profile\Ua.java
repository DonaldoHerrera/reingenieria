package com.soundcloud.android.profile;

import java.util.HashMap;

/* compiled from: UpdateAgeCommand */
class Ua extends C1255eT<C5815m, Boolean> {
    private final dfa a;
    private final HPa b;

    public Ua(dfa dfa, HPa hPa) {
        this.a = dfa;
        this.b = hPa;
    }

    public Boolean a(C5815m mVar) {
        HashMap hashMap = new HashMap(2);
        hashMap.put("month", Integer.valueOf(mVar.a()));
        hashMap.put("year", Integer.valueOf(mVar.b()));
        return Boolean.valueOf(this.a.a(hfa.d(C2226PO.MY_DOB.a()).c().a((Object) hashMap).b()).g());
    }

    public void a(C5815m mVar, KPa<Boolean> kPa) {
        c(mVar).b(this.b).a(RPa.a()).a(kPa);
    }
}
