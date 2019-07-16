package defpackage;

/* renamed from: ca reason: default package and case insensitive filesystem */
/* compiled from: SparseArrayCompat */
public class C0516ca<E> implements Cloneable {
    private static final Object a = new Object();
    private boolean b;
    private int[] c;
    private Object[] d;
    private int e;

    public C0516ca() {
        this(10);
    }

    private void k() {
        int i = this.e;
        int[] iArr = this.c;
        Object[] objArr = this.d;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != a) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.b = false;
        this.e = i2;
    }

    public void a(int i) {
        int a2 = X.a(this.c, this.e, i);
        if (a2 >= 0) {
            Object[] objArr = this.d;
            Object obj = objArr[a2];
            Object obj2 = a;
            if (obj != obj2) {
                objArr[a2] = obj2;
                this.b = true;
            }
        }
    }

    public E b(int i) {
        return b(i, null);
    }

    public void c(int i, E e2) {
        int a2 = X.a(this.c, this.e, i);
        if (a2 >= 0) {
            this.d[a2] = e2;
        } else {
            int i2 = ~a2;
            if (i2 < this.e) {
                Object[] objArr = this.d;
                if (objArr[i2] == a) {
                    this.c[i2] = i;
                    objArr[i2] = e2;
                    return;
                }
            }
            if (this.b && this.e >= this.c.length) {
                k();
                i2 = ~X.a(this.c, this.e, i);
            }
            int i3 = this.e;
            if (i3 >= this.c.length) {
                int b2 = X.b(i3 + 1);
                int[] iArr = new int[b2];
                Object[] objArr2 = new Object[b2];
                int[] iArr2 = this.c;
                System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
                Object[] objArr3 = this.d;
                System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
                this.c = iArr;
                this.d = objArr2;
            }
            int i4 = this.e;
            if (i4 - i2 != 0) {
                int[] iArr3 = this.c;
                int i5 = i2 + 1;
                System.arraycopy(iArr3, i2, iArr3, i5, i4 - i2);
                Object[] objArr4 = this.d;
                System.arraycopy(objArr4, i2, objArr4, i5, this.e - i2);
            }
            this.c[i2] = i;
            this.d[i2] = e2;
            this.e++;
        }
    }

    public int d(int i) {
        if (this.b) {
            k();
        }
        return this.c[i];
    }

    public void e(int i) {
        a(i);
    }

    public E f(int i) {
        if (this.b) {
            k();
        }
        return this.d[i];
    }

    public void i() {
        int i = this.e;
        Object[] objArr = this.d;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.e = 0;
        this.b = false;
    }

    public int j() {
        if (this.b) {
            k();
        }
        return this.e;
    }

    public String toString() {
        if (j() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.e * 28);
        sb.append('{');
        for (int i = 0; i < this.e; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(d(i));
            sb.append('=');
            Object f = f(i);
            if (f != this) {
                sb.append(f);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public C0516ca(int i) {
        this.b = false;
        if (i == 0) {
            this.c = X.a;
            this.d = X.c;
        } else {
            int b2 = X.b(i);
            this.c = new int[b2];
            this.d = new Object[b2];
        }
        this.e = 0;
    }

    public E b(int i, E e2) {
        int a2 = X.a(this.c, this.e, i);
        if (a2 >= 0) {
            E[] eArr = this.d;
            if (eArr[a2] != a) {
                return eArr[a2];
            }
        }
        return e2;
    }

    public C0516ca<E> clone() {
        try {
            C0516ca<E> caVar = (C0516ca) super.clone();
            caVar.c = (int[]) this.c.clone();
            caVar.d = (Object[]) this.d.clone();
            return caVar;
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }

    public int a(E e2) {
        if (this.b) {
            k();
        }
        for (int i = 0; i < this.e; i++) {
            if (this.d[i] == e2) {
                return i;
            }
        }
        return -1;
    }

    public void a(int i, E e2) {
        int i2 = this.e;
        if (i2 == 0 || i > this.c[i2 - 1]) {
            if (this.b && this.e >= this.c.length) {
                k();
            }
            int i3 = this.e;
            if (i3 >= this.c.length) {
                int b2 = X.b(i3 + 1);
                int[] iArr = new int[b2];
                Object[] objArr = new Object[b2];
                int[] iArr2 = this.c;
                System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
                Object[] objArr2 = this.d;
                System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
                this.c = iArr;
                this.d = objArr;
            }
            this.c[i3] = i;
            this.d[i3] = e2;
            this.e = i3 + 1;
            return;
        }
        c(i, e2);
    }

    public int c(int i) {
        if (this.b) {
            k();
        }
        return X.a(this.c, this.e, i);
    }
}
