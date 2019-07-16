package com.soundcloud.android.collections.data;

/* renamed from: com.soundcloud.android.collections.data.m reason: case insensitive filesystem */
/* compiled from: CollectionsDataModule_ProvidesRoomLikesReadStorageFactory */
public final class C2857m implements C4961HMa<aa> {
    private final C7054oVa<CollectionsDatabase> a;

    public C2857m(C7054oVa<CollectionsDatabase> ova) {
        this.a = ova;
    }

    public static C2857m a(C7054oVa<CollectionsDatabase> ova) {
        return new C2857m(ova);
    }

    public static aa a(CollectionsDatabase collectionsDatabase) {
        aa a2 = C2855k.a(collectionsDatabase);
        C5023JMa.a(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }

    public aa get() {
        return a((CollectionsDatabase) this.a.get());
    }
}
