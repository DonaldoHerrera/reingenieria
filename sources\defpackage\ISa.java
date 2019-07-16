package defpackage;

/* renamed from: ISa reason: default package */
/* compiled from: ObservableFromArray */
public final class ISa<T> extends APa<T> {
    final T[] a;

    /* renamed from: ISa$a */
    /* compiled from: ObservableFromArray */
    static final class a<T> extends QQa<T> {
        final GPa<? super T> a;
        final T[] b;
        int c;
        boolean d;
        volatile boolean e;

        a(GPa<? super T> gPa, T[] tArr) {
            this.a = gPa;
            this.b = tArr;
        }

        public int a(int i) {
            if ((i & 1) == 0) {
                return 0;
            }
            this.d = true;
            return 1;
        }

        /* access modifiers changed from: 0000 */
        public void b() {
            T[] tArr = this.b;
            int length = tArr.length;
            for (int i = 0; i < length && !a(); i++) {
                T t = tArr[i];
                if (t == null) {
                    GPa<? super T> gPa = this.a;
                    StringBuilder sb = new StringBuilder();
                    sb.append("The element at index ");
                    sb.append(i);
                    sb.append(" is null");
                    gPa.a((Throwable) new NullPointerException(sb.toString()));
                    return;
                }
                this.a.a(t);
            }
            if (!a()) {
                this.a.onComplete();
            }
        }

        public void clear() {
            this.c = this.b.length;
        }

        public void dispose() {
            this.e = true;
        }

        public boolean isEmpty() {
            return this.c == this.b.length;
        }

        public T poll() {
            int i = this.c;
            T[] tArr = this.b;
            if (i == tArr.length) {
                return null;
            }
            this.c = i + 1;
            T t = tArr[i];
            AQa.a(t, "The array element is null");
            return t;
        }

        public boolean a() {
            return this.e;
        }
    }

    public ISa(T[] tArr) {
        this.a = tArr;
    }

    public void b(GPa<? super T> gPa) {
        a aVar = new a(gPa, this.a);
        gPa.a((VPa) aVar);
        if (!aVar.d) {
            aVar.b();
        }
    }
}
