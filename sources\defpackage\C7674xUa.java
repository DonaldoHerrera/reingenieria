package defpackage;

/* renamed from: xUa reason: default package and case insensitive filesystem */
/* compiled from: AppendOnlyLinkedArrayList */
public class C7674xUa<T> {
    final int a;
    final Object[] b;
    Object[] c = this.b;
    int d;

    /* renamed from: xUa$a */
    /* compiled from: AppendOnlyLinkedArrayList */
    public interface a<T> extends C7256rQa<T> {
        boolean test(T t);
    }

    public C7674xUa(int i) {
        this.a = i;
        this.b = new Object[(i + 1)];
    }

    public void a(T t) {
        int i = this.a;
        int i2 = this.d;
        if (i2 == i) {
            Object[] objArr = new Object[(i + 1)];
            this.c[i] = objArr;
            this.c = objArr;
            i2 = 0;
        }
        this.c[i2] = t;
        this.d = i2 + 1;
    }

    public void b(T t) {
        this.b[0] = t;
    }

    public void a(a<? super T> aVar) {
        int i = this.a;
        for (Object[] objArr = this.b; objArr != null; objArr = objArr[i]) {
            int i2 = 0;
            while (i2 < i) {
                Object[] objArr2 = objArr[i2];
                if (objArr2 == null) {
                    continue;
                    break;
                } else if (!aVar.test(objArr2)) {
                    i2++;
                } else {
                    return;
                }
            }
        }
    }

    public <U> boolean a(GPa<? super U> gPa) {
        Object[] objArr = this.b;
        int i = this.a;
        while (true) {
            int i2 = 0;
            if (objArr == null) {
                return false;
            }
            while (i2 < i) {
                Object[] objArr2 = objArr[i2];
                if (objArr2 == null) {
                    continue;
                    break;
                } else if (GUa.b(objArr2, gPa)) {
                    return true;
                } else {
                    i2++;
                }
            }
            objArr = objArr[i];
        }
    }
}
