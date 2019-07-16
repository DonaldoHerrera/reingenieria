package defpackage;

import java.util.RandomAccess;

/* renamed from: dWa reason: default package and case insensitive filesystem */
/* compiled from: _ArraysJvm.kt */
public final class C6306dWa extends YVa<Integer> implements RandomAccess {
    final /* synthetic */ int[] b;

    C6306dWa(int[] iArr) {
        this.b = iArr;
    }

    public boolean c(int i) {
        return C6578hWa.a(this.b, i);
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Integer) {
            return c(((Number) obj).intValue());
        }
        return false;
    }

    public int f() {
        return this.b.length;
    }

    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof Integer) {
            return m(((Number) obj).intValue());
        }
        return -1;
    }

    public boolean isEmpty() {
        return this.b.length == 0;
    }

    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof Integer) {
            return n(((Number) obj).intValue());
        }
        return -1;
    }

    public int m(int i) {
        return C6578hWa.c(this.b, i);
    }

    public int n(int i) {
        return C6578hWa.d(this.b, i);
    }

    public Integer get(int i) {
        return Integer.valueOf(this.b[i]);
    }
}
