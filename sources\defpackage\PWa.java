package defpackage;

import java.util.Arrays;
import java.util.Iterator;
import java.util.RandomAccess;

/* renamed from: PWa reason: default package */
/* compiled from: SlidingWindow.kt */
final class PWa<T> extends YVa<T> implements RandomAccess {
    /* access modifiers changed from: private */
    public final Object[] b;
    /* access modifiers changed from: private */
    public int c;
    private int d;
    private final int e;

    public PWa(int i) {
        this.e = i;
        if (this.e >= 0) {
            this.b = new Object[this.e];
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("ring buffer capacity should not be negative but it is ");
        sb.append(this.e);
        throw new IllegalArgumentException(sb.toString().toString());
    }

    public final void add(T t) {
        if (!h()) {
            this.b[(this.c + size()) % g()] = t;
            this.d = size() + 1;
            return;
        }
        throw new IllegalStateException("ring buffer is full");
    }

    public final void c(int i) {
        boolean z = true;
        if (i >= 0) {
            if (i > size()) {
                z = false;
            }
            if (!z) {
                StringBuilder sb = new StringBuilder();
                sb.append("n shouldn't be greater than the buffer size: n = ");
                sb.append(i);
                sb.append(", size = ");
                sb.append(size());
                throw new IllegalArgumentException(sb.toString().toString());
            } else if (i > 0) {
                int i2 = this.c;
                int g = (i2 + i) % g();
                if (i2 > g) {
                    a(this.b, null, i2, this.e);
                    a(this.b, null, 0, g);
                } else {
                    a(this.b, null, i2, g);
                }
                this.c = g;
                this.d = size() - i;
            }
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("n shouldn't be negative but it is ");
            sb2.append(i);
            throw new IllegalArgumentException(sb2.toString().toString());
        }
    }

    public int f() {
        return this.d;
    }

    public final int g() {
        return this.e;
    }

    public T get(int i) {
        YVa.a.a(i, size());
        return this.b[(this.c + i) % g()];
    }

    public final boolean h() {
        return size() == this.e;
    }

    public Iterator<T> iterator() {
        return new OWa(this);
    }

    public <T> T[] toArray(T[] tArr) {
        C7471uYa.b(tArr, "array");
        if (tArr.length < size()) {
            tArr = Arrays.copyOf(tArr, size());
            C7471uYa.a((Object) tArr, "java.util.Arrays.copyOf(this, newSize)");
        }
        int size = size();
        int i = 0;
        int i2 = this.c;
        int i3 = 0;
        while (i3 < size && i2 < this.e) {
            tArr[i3] = this.b[i2];
            i3++;
            i2++;
        }
        while (i3 < size) {
            tArr[i3] = this.b[i];
            i3++;
            i++;
        }
        if (tArr.length > size()) {
            tArr[size()] = null;
        }
        if (tArr != null) {
            return tArr;
        }
        throw new OVa("null cannot be cast to non-null type kotlin.Array<T>");
    }

    private final <T> void a(T[] tArr, T t, int i, int i2) {
        while (i < i2) {
            tArr[i] = t;
            i++;
        }
    }

    public Object[] toArray() {
        return toArray(new Object[size()]);
    }
}
