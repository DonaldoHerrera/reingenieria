package defpackage;

/* renamed from: Sb reason: default package and case insensitive filesystem */
/* compiled from: Pools */
public class C0255Sb<T> implements C0251Rb<T> {
    private final Object[] a;
    private int b;

    public C0255Sb(int i) {
        if (i > 0) {
            this.a = new Object[i];
            return;
        }
        throw new IllegalArgumentException("The max pool size must be > 0");
    }

    private boolean b(T t) {
        for (int i = 0; i < this.b; i++) {
            if (this.a[i] == t) {
                return true;
            }
        }
        return false;
    }

    public T a() {
        int i = this.b;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        T[] tArr = this.a;
        T t = tArr[i2];
        tArr[i2] = null;
        this.b = i - 1;
        return t;
    }

    public boolean a(T t) {
        if (!b(t)) {
            int i = this.b;
            Object[] objArr = this.a;
            if (i >= objArr.length) {
                return false;
            }
            objArr[i] = t;
            this.b = i + 1;
            return true;
        }
        throw new IllegalStateException("Already in the pool!");
    }
}
