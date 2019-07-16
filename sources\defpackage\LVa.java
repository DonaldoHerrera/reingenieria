package defpackage;

import java.io.Serializable;

/* renamed from: LVa reason: default package */
/* compiled from: LazyJVM.kt */
final class LVa<T> implements C7744yVa<T>, Serializable {
    private PXa<? extends T> a;
    private volatile Object b;
    private final Object c;

    public LVa(PXa<? extends T> pXa, Object obj) {
        C7471uYa.b(pXa, "initializer");
        this.a = pXa;
        this.b = PVa.a;
        if (obj == 0) {
            obj = this;
        }
        this.c = obj;
    }

    private final Object writeReplace() {
        return new C7606wVa(getValue());
    }

    public boolean a() {
        return this.b != PVa.a;
    }

    public T getValue() {
        T t;
        T t2 = this.b;
        if (t2 != PVa.a) {
            return t2;
        }
        synchronized (this.c) {
            t = this.b;
            if (t == PVa.a) {
                PXa<? extends T> pXa = this.a;
                if (pXa != null) {
                    t = pXa.d();
                    this.b = t;
                    this.a = null;
                } else {
                    C7471uYa.a();
                    throw null;
                }
            }
        }
        return t;
    }

    public String toString() {
        return a() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }

    public /* synthetic */ LVa(PXa pXa, Object obj, int i, C7264rYa rya) {
        if ((i & 2) != 0) {
            obj = null;
        }
        this(pXa, obj);
    }
}
