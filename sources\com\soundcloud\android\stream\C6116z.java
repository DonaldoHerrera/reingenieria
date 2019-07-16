package com.soundcloud.android.stream;

import com.soundcloud.android.ads.C2618rb;
import com.soundcloud.android.ads.id;
import com.soundcloud.android.upsell.e;

/* renamed from: com.soundcloud.android.stream.z reason: case insensitive filesystem */
/* compiled from: StreamAdapter_Factory */
public final class C6116z implements C4961HMa<C6114y> {
    private final C7054oVa<pb> a;
    private final C7054oVa<Aa> b;
    private final C7054oVa<e> c;
    private final C7054oVa<C2618rb> d;
    private final C7054oVa<Cca<C6109va>> e;
    private final C7054oVa<id> f;

    public static C6114y a(Object obj, Object obj2, e eVar, C2618rb rbVar, Cca<C6109va> cca, id idVar) {
        C6114y yVar = new C6114y((pb) obj, (Aa) obj2, eVar, rbVar, cca, idVar);
        return yVar;
    }

    public C6114y get() {
        C6114y yVar = new C6114y((pb) this.a.get(), (Aa) this.b.get(), (e) this.c.get(), (C2618rb) this.d.get(), (Cca) this.e.get(), (id) this.f.get());
        return yVar;
    }
}
