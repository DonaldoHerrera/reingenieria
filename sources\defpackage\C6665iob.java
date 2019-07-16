package defpackage;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: iob reason: default package and case insensitive filesystem */
/* compiled from: UnmodifiableLazyStringList */
public class C6665iob extends AbstractList<String> implements RandomAccess, Tnb {
    /* access modifiers changed from: private */
    public final Tnb a;

    public C6665iob(Tnb tnb) {
        this.a = tnb;
    }

    public List<?> P() {
        return this.a.P();
    }

    public Tnb Q() {
        return this;
    }

    public Iterator<String> iterator() {
        return new C6597hob(this);
    }

    public Fnb k(int i) {
        return this.a.k(i);
    }

    public ListIterator<String> listIterator(int i) {
        return new C6529gob(this, i);
    }

    public int size() {
        return this.a.size();
    }

    public void a(Fnb fnb) {
        throw new UnsupportedOperationException();
    }

    public String get(int i) {
        return (String) this.a.get(i);
    }
}
