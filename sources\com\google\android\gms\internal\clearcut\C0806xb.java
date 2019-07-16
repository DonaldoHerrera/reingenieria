package com.google.android.gms.internal.clearcut;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.clearcut.xb reason: case insensitive filesystem */
public final class C0806xb extends AbstractList<String> implements C0799va, RandomAccess {
    /* access modifiers changed from: private */
    public final C0799va a;

    public C0806xb(C0799va vaVar) {
        this.a = vaVar;
    }

    public final List<?> T() {
        return this.a.T();
    }

    public final C0799va V() {
        return this;
    }

    public final /* synthetic */ Object get(int i) {
        return (String) this.a.get(i);
    }

    public final Iterator<String> iterator() {
        return new C0812zb(this);
    }

    public final Object j(int i) {
        return this.a.j(i);
    }

    public final ListIterator<String> listIterator(int i) {
        return new C0809yb(this, i);
    }

    public final int size() {
        return this.a.size();
    }
}
