package defpackage;

import java.io.IOException;

/* renamed from: Nx reason: default package */
abstract class Nx<T, B> {
    Nx() {
    }

    /* access modifiers changed from: 0000 */
    public abstract B a();

    /* access modifiers changed from: 0000 */
    public abstract T a(Object obj);

    /* access modifiers changed from: 0000 */
    public abstract void a(B b, int i, int i2);

    /* access modifiers changed from: 0000 */
    public abstract void a(B b, int i, long j);

    /* access modifiers changed from: 0000 */
    public abstract void a(B b, int i, C0289Zv zv);

    /* access modifiers changed from: 0000 */
    public abstract void a(B b, int i, T t);

    /* access modifiers changed from: 0000 */
    public abstract void a(Object obj, T t);

    /* access modifiers changed from: 0000 */
    public final boolean a(B b, C1889yx yxVar) throws IOException {
        int tag = yxVar.getTag();
        int i = tag >>> 3;
        int i2 = tag & 7;
        if (i2 == 0) {
            a(b, i, yxVar.d());
            return true;
        } else if (i2 == 1) {
            b(b, i, yxVar.a());
            return true;
        } else if (i2 == 2) {
            a(b, i, yxVar.f());
            return true;
        } else if (i2 == 3) {
            Object a = a();
            int i3 = 4 | (i << 3);
            while (yxVar.c() != Integer.MAX_VALUE) {
                if (!a((B) a, yxVar)) {
                    break;
                }
            }
            if (i3 == yxVar.getTag()) {
                a(b, i, (T) d(a));
                return true;
            }
            throw C0225Kw.e();
        } else if (i2 == 4) {
            return false;
        } else {
            if (i2 == 5) {
                a(b, i, yxVar.b());
                return true;
            }
            throw C0225Kw.f();
        }
    }

    /* access modifiers changed from: 0000 */
    public abstract boolean a(C1889yx yxVar);

    /* access modifiers changed from: 0000 */
    public abstract B b(Object obj);

    /* access modifiers changed from: 0000 */
    public abstract void b(B b, int i, long j);

    /* access modifiers changed from: 0000 */
    public abstract void b(Object obj, B b);

    /* access modifiers changed from: 0000 */
    public abstract T c(T t, T t2);

    /* access modifiers changed from: 0000 */
    public abstract void c(Object obj);

    /* access modifiers changed from: 0000 */
    public abstract T d(B b);
}
