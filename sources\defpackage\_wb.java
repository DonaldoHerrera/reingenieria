package defpackage;

import java.util.Iterator;

/* renamed from: _wb reason: default package */
/* compiled from: Sequences.kt */
public final class _wb<T> implements Iwb<T> {
    /* access modifiers changed from: private */
    public final Iwb<T> a;
    /* access modifiers changed from: private */
    public final _Xa<T, Boolean> b;

    public _wb(Iwb<? extends T> iwb, _Xa<? super T, Boolean> _xa) {
        C7471uYa.b(iwb, "sequence");
        C7471uYa.b(_xa, "predicate");
        this.a = iwb;
        this.b = _xa;
    }

    public Iterator<T> iterator() {
        return new Zwb(this);
    }
}
