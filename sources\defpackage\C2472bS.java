package defpackage;

import defpackage.C2453aS;

/* renamed from: bS reason: default package and case insensitive filesystem */
/* compiled from: SyncerProvider.kt */
public final class C2472bS<T extends C2453aS> {
    private final C7054oVa<C2415ZR<T>> a;

    public C2472bS(C7054oVa<C2415ZR<T>> ova) {
        C7471uYa.b(ova, "provider");
        this.a = ova;
    }

    public final C2415ZR<T> a() {
        Object obj = this.a.get();
        C7471uYa.a(obj, "provider.get()");
        return (C2415ZR) obj;
    }
}
