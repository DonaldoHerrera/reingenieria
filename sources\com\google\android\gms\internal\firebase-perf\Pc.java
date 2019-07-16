package com.google.android.gms.internal.firebase-perf;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public final class Pc extends AbstractList<String> implements Lb, RandomAccess {
    /* access modifiers changed from: private */
    public final Lb a;

    public Pc(Lb lb) {
        this.a = lb;
    }

    public final Lb U() {
        return this;
    }

    public final List<?> W() {
        return this.a.W();
    }

    public final void a(Oa oa) {
        throw new UnsupportedOperationException();
    }

    public final /* synthetic */ Object get(int i) {
        return (String) this.a.get(i);
    }

    public final Iterator<String> iterator() {
        return new Rc(this);
    }

    public final Object j(int i) {
        return this.a.j(i);
    }

    public final ListIterator<String> listIterator(int i) {
        return new Oc(this, i);
    }

    public final int size() {
        return this.a.size();
    }
}
