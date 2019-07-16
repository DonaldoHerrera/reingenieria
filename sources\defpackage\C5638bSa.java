package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: bSa reason: default package and case insensitive filesystem */
/* compiled from: MaybeZipArray */
public final class C5638bSa<T, R> extends C7531vPa<R> {
    final C7669xPa<? extends T>[] a;
    final C7118pQa<? super Object[], ? extends R> b;

    /* renamed from: bSa$a */
    /* compiled from: MaybeZipArray */
    final class a implements C7118pQa<T, R> {
        a() {
        }

        public R apply(T t) throws Exception {
            R apply = C5638bSa.this.b.apply(new Object[]{t});
            AQa.a(apply, "The zipper returned a null value");
            return apply;
        }
    }

    /* renamed from: bSa$b */
    /* compiled from: MaybeZipArray */
    static final class b<T, R> extends AtomicInteger implements VPa {
        final C7600wPa<? super R> a;
        final C7118pQa<? super Object[], ? extends R> b;
        final c<T>[] c;
        final Object[] d;

        b(C7600wPa<? super R> wpa, int i, C7118pQa<? super Object[], ? extends R> pqa) {
            super(i);
            this.a = wpa;
            this.b = pqa;
            c<T>[] cVarArr = new c[i];
            for (int i2 = 0; i2 < i; i2++) {
                cVarArr[i2] = new c<>(this, i2);
            }
            this.c = cVarArr;
            this.d = new Object[i];
        }

        public boolean a() {
            return get() <= 0;
        }

        /* access modifiers changed from: 0000 */
        public void b(int i) {
            if (getAndSet(0) > 0) {
                a(i);
                this.a.onComplete();
            }
        }

        public void dispose() {
            if (getAndSet(0) > 0) {
                for (c<T> a2 : this.c) {
                    a2.a();
                }
            }
        }

        /* access modifiers changed from: 0000 */
        public void a(T t, int i) {
            this.d[i] = t;
            if (decrementAndGet() == 0) {
                try {
                    Object apply = this.b.apply(this.d);
                    AQa.a(apply, "The zipper returned a null value");
                    this.a.onSuccess(apply);
                } catch (Throwable th) {
                    _Pa.b(th);
                    this.a.a(th);
                }
            }
        }

        /* access modifiers changed from: 0000 */
        public void a(int i) {
            c<T>[] cVarArr = this.c;
            int length = cVarArr.length;
            for (int i2 = 0; i2 < i; i2++) {
                cVarArr[i2].a();
            }
            while (true) {
                i++;
                if (i < length) {
                    cVarArr[i].a();
                } else {
                    return;
                }
            }
        }

        /* access modifiers changed from: 0000 */
        public void a(Throwable th, int i) {
            if (getAndSet(0) > 0) {
                a(i);
                this.a.a(th);
                return;
            }
            WUa.b(th);
        }
    }

    /* renamed from: bSa$c */
    /* compiled from: MaybeZipArray */
    static final class c<T> extends AtomicReference<VPa> implements C7600wPa<T> {
        final b<T, ?> a;
        final int b;

        c(b<T, ?> bVar, int i) {
            this.a = bVar;
            this.b = i;
        }

        public void a() {
            C7463uQa.a((AtomicReference<VPa>) this);
        }

        public void onComplete() {
            this.a.b(this.b);
        }

        public void onSuccess(T t) {
            this.a.a(t, this.b);
        }

        public void a(VPa vPa) {
            C7463uQa.c(this, vPa);
        }

        public void a(Throwable th) {
            this.a.a(th, this.b);
        }
    }

    public C5638bSa(C7669xPa<? extends T>[] xpaArr, C7118pQa<? super Object[], ? extends R> pqa) {
        this.a = xpaArr;
        this.b = pqa;
    }

    /* access modifiers changed from: protected */
    public void b(C7600wPa<? super R> wpa) {
        C7669xPa<? extends T>[] xpaArr = this.a;
        int length = xpaArr.length;
        int i = 0;
        if (length == 1) {
            xpaArr[0].a(new a(wpa, new a()));
            return;
        }
        b bVar = new b(wpa, length, this.b);
        wpa.a((VPa) bVar);
        while (i < length && !bVar.a()) {
            C7669xPa<? extends T> xpa = xpaArr[i];
            if (xpa == null) {
                bVar.a((Throwable) new NullPointerException("One of the sources is null"), i);
                return;
            } else {
                xpa.a(bVar.c[i]);
                i++;
            }
        }
    }
}
