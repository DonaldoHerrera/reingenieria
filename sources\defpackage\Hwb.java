package defpackage;

import java.util.Iterator;

/* renamed from: Hwb reason: default package */
/* compiled from: Sequences.kt */
final class Hwb<T> implements Iwb<T> {
    /* access modifiers changed from: private */
    public final PXa<T> a;
    /* access modifiers changed from: private */
    public final _Xa<T, T> b;

    public Hwb(PXa<? extends T> pXa, _Xa<? super T, ? extends T> _xa) {
        C7471uYa.b(pXa, "getInitialValue");
        C7471uYa.b(_xa, "getNextValue");
        this.a = pXa;
        this.b = _xa;
    }

    public Iterator<T> iterator() {
        return new Gwb(this);
    }
}
