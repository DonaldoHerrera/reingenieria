package defpackage;

import java.util.Iterator;

/* renamed from: bxb reason: default package and case insensitive filesystem */
/* compiled from: Sequences.kt */
public final class C5679bxb<T, R> implements Iwb<R> {
    /* access modifiers changed from: private */
    public final Iwb<T> a;
    /* access modifiers changed from: private */
    public final _Xa<T, R> b;

    public C5679bxb(Iwb<? extends T> iwb, _Xa<? super T, ? extends R> _xa) {
        C7471uYa.b(iwb, "sequence");
        C7471uYa.b(_xa, "transformer");
        this.a = iwb;
        this.b = _xa;
    }

    public Iterator<R> iterator() {
        return new C5611axb(this);
    }

    public final <E> Iwb<E> a(_Xa<? super R, ? extends Iterator<? extends E>> _xa) {
        C7471uYa.b(_xa, "iterator");
        return new Fwb(this.a, this.b, _xa);
    }
}
