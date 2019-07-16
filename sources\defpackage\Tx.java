package defpackage;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: Tx reason: default package */
public final class Tx extends AbstractList<String> implements C0249Qw, RandomAccess {
    /* access modifiers changed from: private */
    public final C0249Qw a;

    public Tx(C0249Qw qw) {
        this.a = qw;
    }

    public final void a(C0289Zv zv) {
        throw new UnsupportedOperationException();
    }

    public final C0249Qw b() {
        return this;
    }

    public final /* synthetic */ Object get(int i) {
        return (String) this.a.get(i);
    }

    public final Iterator<String> iterator() {
        return new Vx(this);
    }

    public final ListIterator<String> listIterator(int i) {
        return new Sx(this, i);
    }

    public final int size() {
        return this.a.size();
    }

    public final List<?> a() {
        return this.a.a();
    }
}
