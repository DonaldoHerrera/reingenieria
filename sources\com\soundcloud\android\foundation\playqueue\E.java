package com.soundcloud.android.foundation.playqueue;

import com.google.common.base.Predicate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* compiled from: SimplePlayQueue */
public class E extends o {
    private final List<q> a;

    public E(List<q> list) {
        this.a = new ArrayList(list);
    }

    private Predicate<q> d(C3508cda cda) {
        return new C3717d(cda);
    }

    private int l() {
        for (int i = 0; i < this.a.size(); i++) {
            q qVar = (q) this.a.get(i);
            if (qVar.j() && !((t) qVar).u()) {
                return i;
            }
        }
        return this.a.size();
    }

    public void a(int i, List<q> list) {
        this.a.addAll(i, list);
    }

    public void b(int i, int i2) {
        this.a.add(i2, (q) this.a.remove(i));
    }

    public q c(int i) {
        C7457uKa.a(i, size(), "index");
        return (q) this.a.get(i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return C4804CKa.a(h(), ((o) obj).h());
    }

    public o f() {
        return new E(new ArrayList(this.a));
    }

    public List<C3508cda> h() {
        ArrayList arrayList = new ArrayList();
        for (q qVar : this.a) {
            if (qVar.j()) {
                arrayList.add(qVar.c());
            }
        }
        return arrayList;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public boolean i() {
        return !this.a.isEmpty();
    }

    public boolean isEmpty() {
        return this.a.isEmpty();
    }

    public Iterator<q> iterator() {
        return this.a.iterator();
    }

    public boolean j() {
        return false;
    }

    public List<q> k() {
        return this.a;
    }

    public C3508cda m(int i) {
        C7457uKa.a(i, size(), "index");
        return ((q) this.a.get(i)).c();
    }

    public boolean n(int i) {
        return i < this.a.size() - 1;
    }

    public boolean o(int i) {
        return i > 0 && !this.a.isEmpty();
    }

    public boolean p(int i) {
        return n(i) && (this.a.get(i + 1) instanceof F);
    }

    public void q(int i) {
        this.a.remove(i);
    }

    public boolean r(int i) {
        return i >= 0 && i < this.a.size() && ((q) this.a.get(i)).h();
    }

    public D s(int i) {
        return D.a(this, i, l());
    }

    public int size() {
        return this.a.size();
    }

    public String toString() {
        return C4804CKa.a((Object) this).a("trackItemUrns", (Object) h()).a("shuffled", j()).toString();
    }

    public int a(C3508cda cda) {
        return C1943BD.d(this.a, d(cda));
    }

    public int a(q qVar) {
        return C1943BD.d(this.a, o.b(qVar));
    }

    public Iterable<? extends q> b(C3508cda cda) {
        return C2063HD.a(C1943BD.b(this.a, c(cda)));
    }

    public void c(q qVar) {
        this.a.remove(qVar);
    }

    static /* synthetic */ boolean b(C3508cda cda, q qVar) {
        return qVar.j() && qVar.c().equals(cda);
    }

    private Predicate<q> c(C3508cda cda) {
        return new C3718e(cda);
    }

    public boolean a(o oVar) {
        if (oVar.size() != size()) {
            return false;
        }
        for (int i = 0; i < size(); i++) {
            if (!oVar.c(i).c().equals(c(i).c())) {
                return false;
            }
        }
        return true;
    }

    public void b(int i, List<q> list) {
        C7457uKa.a(i, size(), "Cannot replace item at position:%d, size:%d");
        this.a.remove(i);
        this.a.addAll(i, list);
    }

    public List<C3508cda> a(int i, int i2) {
        int min = Math.min(size(), i + i2);
        if (min >= i) {
            ArrayList arrayList = new ArrayList(min - i);
            while (i < min) {
                arrayList.add(m(i));
                i++;
            }
            return arrayList;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Error getting item urns. size = [");
        sb.append(size());
        sb.append("], from = [");
        sb.append(i);
        sb.append("], count = [");
        sb.append(i2);
        sb.append("]");
        throw new IllegalStateException(sb.toString());
    }

    public void a(int i, q qVar) {
        C7457uKa.b(i, size(), "Cannot insert item at position:%d, size:%d");
        this.a.add(i, qVar);
    }

    public void a(Iterable<q> iterable) {
        C1943BD.a((Collection<T>) this.a, iterable);
    }
}
