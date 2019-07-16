package com.google.android.gms.internal.measurement;

import java.io.IOException;

abstract class Xc<T, B> {
    Xc() {
    }

    /* access modifiers changed from: 0000 */
    public abstract B a();

    /* access modifiers changed from: 0000 */
    public abstract void a(Object obj);

    /* access modifiers changed from: 0000 */
    public abstract void a(B b, int i, int i2);

    /* access modifiers changed from: 0000 */
    public abstract void a(B b, int i, long j);

    /* access modifiers changed from: 0000 */
    public abstract void a(B b, int i, Ya ya);

    /* access modifiers changed from: 0000 */
    public abstract void a(B b, int i, T t);

    /* access modifiers changed from: 0000 */
    public abstract void a(T t, C1050ud udVar) throws IOException;

    /* access modifiers changed from: 0000 */
    public abstract void a(Object obj, T t);

    /* access modifiers changed from: 0000 */
    public abstract boolean a(Fc fc);

    /* access modifiers changed from: 0000 */
    public final boolean a(B b, Fc fc) throws IOException {
        int tag = fc.getTag();
        int i = tag >>> 3;
        int i2 = tag & 7;
        if (i2 == 0) {
            a(b, i, fc.n());
            return true;
        } else if (i2 == 1) {
            b(b, i, fc.c());
            return true;
        } else if (i2 == 2) {
            a(b, i, fc.g());
            return true;
        } else if (i2 == 3) {
            Object a = a();
            int i3 = 4 | (i << 3);
            while (fc.o() != Integer.MAX_VALUE) {
                if (!a((B) a, fc)) {
                    break;
                }
            }
            if (i3 == fc.getTag()) {
                a(b, i, (T) b(a));
                return true;
            }
            throw Rb.e();
        } else if (i2 == 4) {
            return false;
        } else {
            if (i2 == 5) {
                a(b, i, fc.b());
                return true;
            }
            throw Rb.f();
        }
    }

    /* access modifiers changed from: 0000 */
    public abstract T b(B b);

    /* access modifiers changed from: 0000 */
    public abstract void b(B b, int i, long j);

    /* access modifiers changed from: 0000 */
    public abstract void b(T t, C1050ud udVar) throws IOException;

    /* access modifiers changed from: 0000 */
    public abstract void b(Object obj, B b);

    /* access modifiers changed from: 0000 */
    public abstract int c(T t);

    /* access modifiers changed from: 0000 */
    public abstract T c(T t, T t2);

    /* access modifiers changed from: 0000 */
    public abstract T d(Object obj);

    /* access modifiers changed from: 0000 */
    public abstract B e(Object obj);

    /* access modifiers changed from: 0000 */
    public abstract int f(T t);
}
