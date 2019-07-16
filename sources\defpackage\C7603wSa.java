package defpackage;

import java.util.NoSuchElementException;

/* renamed from: wSa reason: default package and case insensitive filesystem */
/* compiled from: ObservableElementAt */
public final class C7603wSa<T> extends C6642iSa<T, T> {
    final long b;
    final T c;
    final boolean d;

    /* renamed from: wSa$a */
    /* compiled from: ObservableElementAt */
    static final class a<T> implements GPa<T>, VPa {
        final GPa<? super T> a;
        final long b;
        final T c;
        final boolean d;
        VPa e;
        long f;
        boolean g;

        a(GPa<? super T> gPa, long j, T t, boolean z) {
            this.a = gPa;
            this.b = j;
            this.c = t;
            this.d = z;
        }

        public void a(VPa vPa) {
            if (C7463uQa.a(this.e, vPa)) {
                this.e = vPa;
                this.a.a((VPa) this);
            }
        }

        public void dispose() {
            this.e.dispose();
        }

        public void onComplete() {
            if (!this.g) {
                this.g = true;
                T t = this.c;
                if (t != null || !this.d) {
                    if (t != null) {
                        this.a.a(t);
                    }
                    this.a.onComplete();
                    return;
                }
                this.a.a((Throwable) new NoSuchElementException());
            }
        }

        public boolean a() {
            return this.e.a();
        }

        public void a(T t) {
            if (!this.g) {
                long j = this.f;
                if (j == this.b) {
                    this.g = true;
                    this.e.dispose();
                    this.a.a(t);
                    this.a.onComplete();
                    return;
                }
                this.f = j + 1;
            }
        }

        public void a(Throwable th) {
            if (this.g) {
                WUa.b(th);
                return;
            }
            this.g = true;
            this.a.a(th);
        }
    }

    public C7603wSa(EPa<T> ePa, long j, T t, boolean z) {
        super(ePa);
        this.b = j;
        this.c = t;
        this.d = z;
    }

    public void b(GPa<? super T> gPa) {
        EPa<T> ePa = this.a;
        a aVar = new a(gPa, this.b, this.c, this.d);
        ePa.a(aVar);
    }
}
