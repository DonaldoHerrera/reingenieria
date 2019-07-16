package com.soundcloud.android.features.library;

import com.soundcloud.android.collection.B;
import com.soundcloud.android.collection.Na;
import com.soundcloud.android.collection.playhistory.C2792u;
import com.soundcloud.android.collection.recentlyplayed.C2826o;

/* renamed from: com.soundcloud.android.features.library.g reason: case insensitive filesystem */
/* compiled from: LibraryAdapter_Factory */
public final class C3581g implements C4961HMa<C3580f> {
    private final C7054oVa<C3647y> a;
    private final C7054oVa<Na> b;
    private final C7054oVa<V> c;
    private final C7054oVa<Cca<B>> d;
    private final C7054oVa<C2826o> e;
    private final C7054oVa<C2792u> f;

    public C3580f get() {
        C3580f fVar = new C3580f((C3647y) this.a.get(), (Na) this.b.get(), (V) this.c.get(), (Cca) this.d.get(), (C2826o) this.e.get(), (C2792u) this.f.get());
        return fVar;
    }
}
