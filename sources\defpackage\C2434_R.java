package defpackage;

import defpackage.C2453aS;

/* renamed from: _R reason: default package and case insensitive filesystem */
/* compiled from: SyncJob_Factory */
public final class C2434_R<T extends C2453aS> implements C4961HMa<C2415ZR<T>> {
    private final C7054oVa<T> a;

    public C2434_R(C7054oVa<T> ova) {
        this.a = ova;
    }

    public static <T extends C2453aS> C2434_R<T> a(C7054oVa<T> ova) {
        return new C2434_R<>(ova);
    }

    public C2415ZR<T> get() {
        return new C2415ZR<>(this.a);
    }
}
