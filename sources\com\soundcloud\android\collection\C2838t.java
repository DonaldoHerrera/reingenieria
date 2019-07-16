package com.soundcloud.android.collection;

import com.soundcloud.android.collection.playhistory.C2792u;
import com.soundcloud.android.collection.recentlyplayed.C2826o;

/* renamed from: com.soundcloud.android.collection.t reason: case insensitive filesystem */
/* compiled from: CollectionAdapter_Factory */
public final class C2838t implements C4961HMa<C2837s> {
    private final C7054oVa<Ha> a;
    private final C7054oVa<Na> b;
    private final C7054oVa<wa> c;
    private final C7054oVa<Cca<B>> d;
    private final C7054oVa<C2826o> e;
    private final C7054oVa<C2792u> f;

    public static C2837s a(Object obj, Na na, wa waVar, Cca<B> cca, C2826o oVar, C2792u uVar) {
        C2837s sVar = new C2837s((Ha) obj, na, waVar, cca, oVar, uVar);
        return sVar;
    }

    public C2837s get() {
        C2837s sVar = new C2837s((Ha) this.a.get(), (Na) this.b.get(), (wa) this.c.get(), (Cca) this.d.get(), (C2826o) this.e.get(), (C2792u) this.f.get());
        return sVar;
    }
}
