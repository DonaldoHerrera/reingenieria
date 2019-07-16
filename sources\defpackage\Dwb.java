package defpackage;

import java.util.Iterator;

/* renamed from: Dwb reason: default package */
/* compiled from: Sequences.kt */
public final class Dwb<T> implements Iwb<T> {
    /* access modifiers changed from: private */
    public final Iwb<T> a;
    /* access modifiers changed from: private */
    public final boolean b;
    /* access modifiers changed from: private */
    public final _Xa<T, Boolean> c;

    public Dwb(Iwb<? extends T> iwb, boolean z, _Xa<? super T, Boolean> _xa) {
        C7471uYa.b(iwb, "sequence");
        C7471uYa.b(_xa, "predicate");
        this.a = iwb;
        this.b = z;
        this.c = _xa;
    }

    public Iterator<T> iterator() {
        return new Cwb(this);
    }
}
