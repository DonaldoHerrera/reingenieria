package defpackage;

import java.util.List;

/* renamed from: NWa reason: default package */
/* compiled from: ReversedViews.kt */
final class NWa<T> extends ZVa<T> {
    private final List<T> a;

    public NWa(List<T> list) {
        C7471uYa.b(list, "delegate");
        this.a = list;
    }

    public void add(int i, T t) {
        this.a.add(C7400tWa.d(this, i), t);
    }

    public int c() {
        return this.a.size();
    }

    public void clear() {
        this.a.clear();
    }

    public T get(int i) {
        return this.a.get(C7400tWa.c(this, i));
    }

    public T set(int i, T t) {
        return this.a.set(C7400tWa.c(this, i), t);
    }

    public T c(int i) {
        return this.a.remove(C7400tWa.c(this, i));
    }
}
