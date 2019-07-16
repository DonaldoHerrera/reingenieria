package defpackage;

import java.util.Iterator;

/* renamed from: Fwb reason: default package */
/* compiled from: Sequences.kt */
public final class Fwb<T, R, E> implements Iwb<E> {
    /* access modifiers changed from: private */
    public final Iwb<T> a;
    /* access modifiers changed from: private */
    public final _Xa<T, R> b;
    /* access modifiers changed from: private */
    public final _Xa<R, Iterator<E>> c;

    public Fwb(Iwb<? extends T> iwb, _Xa<? super T, ? extends R> _xa, _Xa<? super R, ? extends Iterator<? extends E>> _xa2) {
        C7471uYa.b(iwb, "sequence");
        C7471uYa.b(_xa, "transformer");
        C7471uYa.b(_xa2, "iterator");
        this.a = iwb;
        this.b = _xa;
        this.c = _xa2;
    }

    public Iterator<E> iterator() {
        return new Ewb(this);
    }
}
