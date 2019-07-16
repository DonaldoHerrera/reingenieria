package defpackage;

/* renamed from: BVa reason: default package */
/* compiled from: LazyJVM.kt */
class BVa {
    public static <T> C7744yVa<T> a(PXa<? extends T> pXa) {
        C7471uYa.b(pXa, "initializer");
        return new LVa(pXa, null, 2, null);
    }

    public static <T> C7744yVa<T> a(DVa dVa, PXa<? extends T> pXa) {
        C7471uYa.b(dVa, "mode");
        C7471uYa.b(pXa, "initializer");
        int i = C7813zVa.a[dVa.ordinal()];
        if (i == 1) {
            return new LVa(pXa, null, 2, null);
        }
        if (i == 2) {
            return new KVa(pXa);
        }
        if (i == 3) {
            return new SVa(pXa);
        }
        throw new FVa();
    }
}
