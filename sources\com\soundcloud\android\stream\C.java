package com.soundcloud.android.stream;

import java.util.ArrayList;
import java.util.Set;

/* compiled from: StreamCleanupHelper.kt */
public final class C extends Xda {
    private final String a = "Stream";
    private final C5500ZKa b;

    public C(C5500ZKa zKa) {
        C7471uYa.b(zKa, "propeller");
        this.b = zKa;
    }

    public Set<C3508cda> a() {
        String str = "reposter_id";
        C5631bLa<C5326TKa> a2 = this.b.a(C6975nLa.a(_ea.SoundStream).a(str));
        C7471uYa.a((Object) a2, "propeller.query(Query.fr…SoundStream.REPOSTER_ID))");
        ArrayList arrayList = new ArrayList(C6986nWa.a((Iterable<? extends T>) a2, 10));
        for (C5326TKa d : a2) {
            arrayList.add(C3508cda.f(d.d(str)));
        }
        return C7676xWa.t(arrayList);
    }

    public Set<C3508cda> b() {
        String str = "sound_id";
        String str2 = "sound_type";
        C5631bLa<C5326TKa> a2 = this.b.a((C6975nLa) C6975nLa.a(_ea.SoundStream).a(str).d(str2, (Object) Integer.valueOf(1)));
        C7471uYa.a((Object) a2, "propeller.query(Query.fr…es.Sounds.TYPE_PLAYLIST))");
        ArrayList arrayList = new ArrayList(C6986nWa.a((Iterable<? extends T>) a2, 10));
        for (C5326TKa d : a2) {
            arrayList.add(C3508cda.c(d.d(str)));
        }
        return C7676xWa.t(arrayList);
    }

    public Set<C3508cda> c() {
        String str = "sound_id";
        String str2 = "sound_type";
        C5631bLa<C5326TKa> a2 = this.b.a((C6975nLa) C6975nLa.a(_ea.SoundStream).a(str).d(str2, (Object) Integer.valueOf(0)));
        C7471uYa.a((Object) a2, "propeller.query(Query.fr…ables.Sounds.TYPE_TRACK))");
        ArrayList arrayList = new ArrayList(C6986nWa.a((Iterable<? extends T>) a2, 10));
        for (C5326TKa d : a2) {
            arrayList.add(C3508cda.d(d.d(str)));
        }
        return C7676xWa.t(arrayList);
    }

    public String getKey() {
        return this.a;
    }
}
