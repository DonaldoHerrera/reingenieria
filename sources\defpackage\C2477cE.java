package defpackage;

import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.concurrent.LazyInit;

/* renamed from: cE reason: default package and case insensitive filesystem */
/* compiled from: SingletonImmutableSet */
final class C2477cE<E> extends C3366yD<E> {
    final transient E c;
    @LazyInit
    private transient int d;

    C2477cE(E e) {
        Preconditions.checkNotNull(e);
        this.c = e;
    }

    /* access modifiers changed from: 0000 */
    public int a(Object[] objArr, int i) {
        objArr[i] = this.c;
        return i + 1;
    }

    public boolean contains(Object obj) {
        return this.c.equals(obj);
    }

    /* access modifiers changed from: 0000 */
    public C3326wD<E> h() {
        return C3326wD.a(this.c);
    }

    public final int hashCode() {
        int i = this.d;
        if (i != 0) {
            return i;
        }
        int hashCode = this.c.hashCode();
        this.d = hashCode;
        return hashCode;
    }

    /* access modifiers changed from: 0000 */
    public boolean i() {
        return this.d != 0;
    }

    public int size() {
        return 1;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        sb.append(this.c.toString());
        sb.append(']');
        return sb.toString();
    }

    public C2988fE<E> iterator() {
        return C2023FD.a(this.c);
    }

    C2477cE(E e, int i) {
        this.c = e;
        this.d = i;
    }
}
