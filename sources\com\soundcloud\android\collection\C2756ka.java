package com.soundcloud.android.collection;

import com.soundcloud.android.collection.playhistory.Z;

/* renamed from: com.soundcloud.android.collection.ka reason: case insensitive filesystem */
/* compiled from: CollectionPresenter.kt */
final class C2756ka<T> implements C6776kQa<C3508cda> {
    final /* synthetic */ ua a;

    C2756ka(ua uaVar) {
        this.a = uaVar;
    }

    /* renamed from: a */
    public final void accept(C3508cda cda) {
        Z e = this.a.m;
        C7471uYa.a((Object) cda, "it");
        e.a(cda, Yca.COLLECTIONS).d((C6776kQa<? super T>) new ta<Object>(new C2752ia(this.a.n)));
    }
}
