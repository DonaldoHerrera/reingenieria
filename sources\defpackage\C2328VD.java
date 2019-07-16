package defpackage;

import com.google.common.base.Preconditions;

/* renamed from: VD reason: default package and case insensitive filesystem */
/* compiled from: RegularImmutableList */
class C2328VD<E> extends C3326wD<E> {
    static final C3326wD<Object> c = new C2328VD(new Object[0], 0);
    final transient Object[] d;
    private final transient int e;

    C2328VD(Object[] objArr, int i) {
        this.d = objArr;
        this.e = i;
    }

    /* access modifiers changed from: 0000 */
    public int a(Object[] objArr, int i) {
        System.arraycopy(this.d, 0, objArr, i, this.e);
        return i + this.e;
    }

    /* access modifiers changed from: 0000 */
    public Object[] c() {
        return this.d;
    }

    /* access modifiers changed from: 0000 */
    public int d() {
        return this.e;
    }

    /* access modifiers changed from: 0000 */
    public int f() {
        return 0;
    }

    public E get(int i) {
        Preconditions.checkElementIndex(i, this.e);
        return this.d[i];
    }

    public int size() {
        return this.e;
    }
}
