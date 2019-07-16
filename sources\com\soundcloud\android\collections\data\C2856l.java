package com.soundcloud.android.collections.data;

import android.content.Context;

/* renamed from: com.soundcloud.android.collections.data.l reason: case insensitive filesystem */
/* compiled from: CollectionsDataModule_ProvidesCollectionDatabaseFactory */
public final class C2856l implements C4961HMa<CollectionsDatabase> {
    private final C7054oVa<Context> a;

    public C2856l(C7054oVa<Context> ova) {
        this.a = ova;
    }

    public static C2856l a(C7054oVa<Context> ova) {
        return new C2856l(ova);
    }

    public static CollectionsDatabase a(Context context) {
        CollectionsDatabase a2 = C2855k.a(context);
        C5023JMa.a(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }

    public CollectionsDatabase get() {
        return a((Context) this.a.get());
    }
}
