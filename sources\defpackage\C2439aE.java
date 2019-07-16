package defpackage;

import java.util.Set;

/* renamed from: aE reason: default package and case insensitive filesystem */
/* compiled from: Sets */
class C2439aE extends b<E> {
    final /* synthetic */ Set a;
    final /* synthetic */ Set b;

    C2439aE(Set set, Set set2) {
        this.a = set;
        this.b = set2;
        super(null);
    }

    public boolean contains(Object obj) {
        return this.a.contains(obj) || this.b.contains(obj);
    }

    public boolean isEmpty() {
        return this.a.isEmpty() && this.b.isEmpty();
    }

    public int size() {
        int size = this.a.size();
        for (Object contains : this.b) {
            if (!this.a.contains(contains)) {
                size++;
            }
        }
        return size;
    }

    public C2988fE<E> iterator() {
        return new C2420_D(this);
    }
}
