package com.soundcloud.android.collections.data;

/* renamed from: com.soundcloud.android.collections.data.n reason: case insensitive filesystem */
/* compiled from: CollectionsDataModule_ProvidesRoomLikesWriteStorageFactory */
public final class C2858n implements C4961HMa<ca> {
    private final C7054oVa<CollectionsDatabase> a;

    public C2858n(C7054oVa<CollectionsDatabase> ova) {
        this.a = ova;
    }

    public static C2858n a(C7054oVa<CollectionsDatabase> ova) {
        return new C2858n(ova);
    }

    public static ca a(CollectionsDatabase collectionsDatabase) {
        ca b = C2855k.b(collectionsDatabase);
        C5023JMa.a(b, "Cannot return null from a non-@Nullable @Provides method");
        return b;
    }

    public ca get() {
        return a((CollectionsDatabase) this.a.get());
    }
}
