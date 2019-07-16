package com.soundcloud.android.payments;

/* renamed from: com.soundcloud.android.payments.aa reason: case insensitive filesystem */
/* compiled from: NativePaymentOperations_Factory */
public final class C4229aa implements C4961HMa<Z> {
    private final C7054oVa<HPa> a;
    private final C7054oVa<efa> b;
    private final C7054oVa<C4591jla> c;
    private final C7054oVa<Ma> d;

    public static Z a(HPa hPa, efa efa, C4591jla jla, Object obj) {
        return new Z(hPa, efa, jla, (Ma) obj);
    }

    public Z get() {
        return new Z((HPa) this.a.get(), (efa) this.b.get(), (C4591jla) this.c.get(), (Ma) this.d.get());
    }
}
