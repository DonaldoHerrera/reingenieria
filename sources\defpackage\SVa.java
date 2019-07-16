package defpackage;

import java.io.Serializable;

/* renamed from: SVa reason: default package */
/* compiled from: Lazy.kt */
public final class SVa<T> implements C7744yVa<T>, Serializable {
    private PXa<? extends T> a;
    private Object b = PVa.a;

    public SVa(PXa<? extends T> pXa) {
        C7471uYa.b(pXa, "initializer");
        this.a = pXa;
    }

    private final Object writeReplace() {
        return new C7606wVa(getValue());
    }

    public boolean a() {
        return this.b != PVa.a;
    }

    public T getValue() {
        if (this.b == PVa.a) {
            PXa<? extends T> pXa = this.a;
            if (pXa != null) {
                this.b = pXa.d();
                this.a = null;
            } else {
                C7471uYa.a();
                throw null;
            }
        }
        return this.b;
    }

    public String toString() {
        return a() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
