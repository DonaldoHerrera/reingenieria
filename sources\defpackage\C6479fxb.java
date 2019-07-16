package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: fxb reason: default package and case insensitive filesystem */
/* compiled from: Strings.kt */
public final class C6479fxb implements Iterator<C6785kZa>, MYa {
    private int a = -1;
    private int b;
    private int c;
    private C6785kZa d;
    private int e;
    final /* synthetic */ C6547gxb f;

    C6479fxb(C6547gxb gxb) {
        this.f = gxb;
        this.b = C7265rZa.a(gxb.b, 0, gxb.a.length());
        this.c = this.b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0023, code lost:
        if (r6.e < r6.f.c) goto L_0x0025;
     */
    private final void a() {
        int i = 0;
        if (this.c < 0) {
            this.a = 0;
            this.d = null;
            return;
        }
        if (this.f.c > 0) {
            this.e++;
        }
        if (this.c <= this.f.a.length()) {
            HVa hVa = (HVa) this.f.d.invoke(this.f.a, Integer.valueOf(this.c));
            if (hVa == null) {
                this.d = new C6785kZa(this.b, Hxb.c(this.f.a));
                this.c = -1;
            } else {
                int intValue = ((Number) hVa.a()).intValue();
                int intValue2 = ((Number) hVa.b()).intValue();
                this.d = C7265rZa.d(this.b, intValue);
                this.b = intValue + intValue2;
                int i2 = this.b;
                if (intValue2 == 0) {
                    i = 1;
                }
                this.c = i2 + i;
            }
            this.a = 1;
        }
        this.d = new C6785kZa(this.b, Hxb.c(this.f.a));
        this.c = -1;
        this.a = 1;
    }

    public boolean hasNext() {
        if (this.a == -1) {
            a();
        }
        return this.a == 1;
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public C6785kZa next() {
        if (this.a == -1) {
            a();
        }
        if (this.a != 0) {
            C6785kZa kza = this.d;
            if (kza != null) {
                this.d = null;
                this.a = -1;
                return kza;
            }
            throw new OVa("null cannot be cast to non-null type kotlin.ranges.IntRange");
        }
        throw new NoSuchElementException();
    }
}
