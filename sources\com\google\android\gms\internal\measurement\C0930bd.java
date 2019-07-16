package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.measurement.bd reason: case insensitive filesystem */
public final class C0930bd extends AbstractList<String> implements Yb, RandomAccess {
    /* access modifiers changed from: private */
    public final Yb a;

    public C0930bd(Yb yb) {
        this.a = yb;
    }

    public final Yb R() {
        return this;
    }

    public final List<?> S() {
        return this.a.S();
    }

    public final void a(Ya ya) {
        throw new UnsupportedOperationException();
    }

    public final /* synthetic */ Object get(int i) {
        return (String) this.a.get(i);
    }

    public final Iterator<String> iterator() {
        return new C0944dd(this);
    }

    public final Object l(int i) {
        return this.a.l(i);
    }

    public final ListIterator<String> listIterator(int i) {
        return new C0923ad(this, i);
    }

    public final int size() {
        return this.a.size();
    }
}
