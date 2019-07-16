package defpackage;

import defpackage.C2453aS;

/* renamed from: cS reason: default package and case insensitive filesystem */
/* compiled from: SyncerProvider_Factory */
public final class C2491cS<T extends C2453aS> implements C4961HMa<C2472bS<T>> {
    private final C7054oVa<C2415ZR<T>> a;

    public C2491cS(C7054oVa<C2415ZR<T>> ova) {
        this.a = ova;
    }

    public static <T extends C2453aS> C2491cS<T> a(C7054oVa<C2415ZR<T>> ova) {
        return new C2491cS<>(ova);
    }

    public static <T extends C2453aS> C2472bS<T> b(C7054oVa<C2415ZR<T>> ova) {
        return new C2472bS<>(ova);
    }

    public C2472bS<T> get() {
        return new C2472bS<>(this.a);
    }
}
