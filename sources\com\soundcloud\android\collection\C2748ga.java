package com.soundcloud.android.collection;

/* renamed from: com.soundcloud.android.collection.ga reason: case insensitive filesystem */
/* compiled from: CollectionOptionsStorage.kt */
final class C2748ga extends C7540vYa implements PXa<C6713jVa<C3871sda>> {
    final /* synthetic */ C2746fa a;

    C2748ga(C2746fa faVar) {
        this.a = faVar;
        super(0);
    }

    public final C6713jVa<C3871sda> d() {
        return C6713jVa.f(new C3871sda(this.a.m(), this.a.h.getBoolean("showLikes", true), this.a.h.getBoolean("showPosts", true), this.a.h.getBoolean("showOfflineOnly", false)));
    }
}
