package com.soundcloud.android.offline;

import com.soundcloud.android.collections.data.K;
import com.soundcloud.android.tracks.Pa;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;

/* renamed from: com.soundcloud.android.offline.wc reason: case insensitive filesystem */
/* compiled from: LoadTracksWithStalePolicies */
class C4186wc {
    private final K a;
    private final Pa b;
    private final C5421Wpa c;
    private final Gd d;

    C4186wc(K k, Pa pa, C5421Wpa wpa, Gd gd) {
        this.a = k;
        this.b = pa;
        this.c = wpa;
        this.d = gd;
    }

    private IPa<Set<C3508cda>> b() {
        return this.d.c().a((C7118pQa<? super T, ? extends MPa<? extends R>>) new G<Object,Object>(this));
    }

    private long c() {
        return System.currentTimeMillis() - C6334dta.a;
    }

    private IPa<Set<C3508cda>> d() {
        return this.a.a().e(H.a).a((C7118pQa<? super T, ? extends MPa<? extends R>>) new I<Object,Object>(this));
    }

    private IPa<Set<C3508cda>> e() {
        APa d2 = this.d.b().d((C7118pQa<? super T, ? extends EPa<? extends R>>) Za.a);
        C5421Wpa wpa = this.c;
        wpa.getClass();
        return d2.g(new C4115kb(wpa)).g(new I(this)).a((Callable<? extends U>) C4073db.a, (C6436fQa<? super U, ? super T>) C4091gb.a);
    }

    public IPa<Collection<C3508cda>> a() {
        return b().a((MPa<U>) e(), (C6504gQa<? super T, ? super U, ? extends R>) C4107j.a);
    }

    /* access modifiers changed from: private */
    public IPa<Set<C3508cda>> b(List<C3508cda> list) {
        return this.b.a(new HashSet(list), new Date(c()));
    }

    public /* synthetic */ MPa a(Boolean bool) throws Exception {
        if (bool.booleanValue()) {
            return d();
        }
        return IPa.a(Collections.emptySet());
    }
}
