package com.soundcloud.android.features.library;

import com.soundcloud.android.collection.playhistory.Z;

/* compiled from: LibraryPresenter.kt */
final class I extends C7540vYa implements _Xa<C3508cda, RVa> {
    final /* synthetic */ T a;
    final /* synthetic */ Z b;

    I(T t, Z z) {
        this.a = t;
        this.b = z;
        super(1);
    }

    public final void a(C3508cda cda) {
        Z d = this.a.m;
        C7471uYa.a((Object) cda, "it");
        d.a(cda, Yca.COLLECTIONS).d((C6776kQa<? super T>) new S<Object>(new A(this.b)));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((C3508cda) obj);
        return RVa.a;
    }
}
