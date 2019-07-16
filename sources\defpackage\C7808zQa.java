package defpackage;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: zQa reason: default package and case insensitive filesystem */
/* compiled from: Functions */
public final class C7808zQa {
    static final C7118pQa<Object, Object> a = new o();
    public static final Runnable b = new l();
    public static final C6368eQa c = new i();
    static final C6776kQa<Object> d = new j();
    public static final C6776kQa<Throwable> e = new m();
    public static final C6776kQa<Throwable> f = new w();
    public static final C7187qQa g = new k();
    static final C7256rQa<Object> h = new x();
    static final C7256rQa<Object> i = new n();
    static final Callable<Object> j = new v();
    static final Comparator<Object> k = new r();
    public static final C6776kQa<C5619bBb> l = new q();

    /* renamed from: zQa$a */
    /* compiled from: Functions */
    static final class a<T1, T2, R> implements C7118pQa<Object[], R> {
        final C6504gQa<? super T1, ? super T2, ? extends R> a;

        a(C6504gQa<? super T1, ? super T2, ? extends R> gqa) {
            this.a = gqa;
        }

        /* renamed from: a */
        public R apply(Object[] objArr) throws Exception {
            if (objArr.length == 2) {
                return this.a.apply(objArr[0], objArr[1]);
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Array of size 2 expected but got ");
            sb.append(objArr.length);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: zQa$b */
    /* compiled from: Functions */
    static final class b<T1, T2, T3, R> implements C7118pQa<Object[], R> {
        final C6844lQa<T1, T2, T3, R> a;

        b(C6844lQa<T1, T2, T3, R> lqa) {
            this.a = lqa;
        }

        /* renamed from: a */
        public R apply(Object[] objArr) throws Exception {
            if (objArr.length == 3) {
                return this.a.a(objArr[0], objArr[1], objArr[2]);
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Array of size 3 expected but got ");
            sb.append(objArr.length);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: zQa$c */
    /* compiled from: Functions */
    static final class c<T1, T2, T3, T4, R> implements C7118pQa<Object[], R> {
        final C6912mQa<T1, T2, T3, T4, R> a;

        c(C6912mQa<T1, T2, T3, T4, R> mqa) {
            this.a = mqa;
        }

        /* renamed from: a */
        public R apply(Object[] objArr) throws Exception {
            if (objArr.length == 4) {
                return this.a.a(objArr[0], objArr[1], objArr[2], objArr[3]);
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Array of size 4 expected but got ");
            sb.append(objArr.length);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: zQa$d */
    /* compiled from: Functions */
    static final class d<T1, T2, T3, T4, T5, R> implements C7118pQa<Object[], R> {
        private final C6980nQa<T1, T2, T3, T4, T5, R> a;

        d(C6980nQa<T1, T2, T3, T4, T5, R> nqa) {
            this.a = nqa;
        }

        /* renamed from: a */
        public R apply(Object[] objArr) throws Exception {
            if (objArr.length == 5) {
                return this.a.a(objArr[0], objArr[1], objArr[2], objArr[3], objArr[4]);
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Array of size 5 expected but got ");
            sb.append(objArr.length);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: zQa$e */
    /* compiled from: Functions */
    static final class e<T1, T2, T3, T4, T5, T6, T7, T8, R> implements C7118pQa<Object[], R> {
        final C7049oQa<T1, T2, T3, T4, T5, T6, T7, T8, R> a;

        e(C7049oQa<T1, T2, T3, T4, T5, T6, T7, T8, R> oqa) {
            this.a = oqa;
        }

        /* renamed from: a */
        public R apply(Object[] objArr) throws Exception {
            if (objArr.length == 8) {
                return this.a.a(objArr[0], objArr[1], objArr[2], objArr[3], objArr[4], objArr[5], objArr[6], objArr[7]);
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Array of size 8 expected but got ");
            sb.append(objArr.length);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: zQa$f */
    /* compiled from: Functions */
    static final class f<T> implements Callable<List<T>> {
        final int a;

        f(int i) {
            this.a = i;
        }

        public List<T> call() throws Exception {
            return new ArrayList(this.a);
        }
    }

    /* renamed from: zQa$g */
    /* compiled from: Functions */
    static final class g<T, U> implements C7118pQa<T, U> {
        final Class<U> a;

        g(Class<U> cls) {
            this.a = cls;
        }

        public U apply(T t) throws Exception {
            return this.a.cast(t);
        }
    }

    /* renamed from: zQa$h */
    /* compiled from: Functions */
    static final class h<T, U> implements C7256rQa<T> {
        final Class<U> a;

        h(Class<U> cls) {
            this.a = cls;
        }

        public boolean test(T t) throws Exception {
            return this.a.isInstance(t);
        }
    }

    /* renamed from: zQa$i */
    /* compiled from: Functions */
    static final class i implements C6368eQa {
        i() {
        }

        public void run() {
        }

        public String toString() {
            return "EmptyAction";
        }
    }

    /* renamed from: zQa$j */
    /* compiled from: Functions */
    static final class j implements C6776kQa<Object> {
        j() {
        }

        public void accept(Object obj) {
        }

        public String toString() {
            return "EmptyConsumer";
        }
    }

    /* renamed from: zQa$k */
    /* compiled from: Functions */
    static final class k implements C7187qQa {
        k() {
        }
    }

    /* renamed from: zQa$l */
    /* compiled from: Functions */
    static final class l implements Runnable {
        l() {
        }

        public void run() {
        }

        public String toString() {
            return "EmptyRunnable";
        }
    }

    /* renamed from: zQa$m */
    /* compiled from: Functions */
    static final class m implements C6776kQa<Throwable> {
        m() {
        }

        /* renamed from: a */
        public void accept(Throwable th) {
            WUa.b(th);
        }
    }

    /* renamed from: zQa$n */
    /* compiled from: Functions */
    static final class n implements C7256rQa<Object> {
        n() {
        }

        public boolean test(Object obj) {
            return false;
        }
    }

    /* renamed from: zQa$o */
    /* compiled from: Functions */
    static final class o implements C7118pQa<Object, Object> {
        o() {
        }

        public Object apply(Object obj) {
            return obj;
        }

        public String toString() {
            return "IdentityFunction";
        }
    }

    /* renamed from: zQa$p */
    /* compiled from: Functions */
    static final class p<T, U> implements Callable<U>, C7118pQa<T, U> {
        final U a;

        p(U u) {
            this.a = u;
        }

        public U apply(T t) throws Exception {
            return this.a;
        }

        public U call() throws Exception {
            return this.a;
        }
    }

    /* renamed from: zQa$q */
    /* compiled from: Functions */
    static final class q implements C6776kQa<C5619bBb> {
        q() {
        }

        /* renamed from: a */
        public void accept(C5619bBb bbb) throws Exception {
            bbb.a(Long.MAX_VALUE);
        }
    }

    /* renamed from: zQa$r */
    /* compiled from: Functions */
    static final class r implements Comparator<Object> {
        r() {
        }

        public int compare(Object obj, Object obj2) {
            return ((Comparable) obj).compareTo(obj2);
        }
    }

    /* renamed from: zQa$s */
    /* compiled from: Functions */
    static final class s<T> implements C6368eQa {
        final C6776kQa<? super C7738yPa<T>> a;

        s(C6776kQa<? super C7738yPa<T>> kqa) {
            this.a = kqa;
        }

        public void run() throws Exception {
            this.a.accept(C7738yPa.a());
        }
    }

    /* renamed from: zQa$t */
    /* compiled from: Functions */
    static final class t<T> implements C6776kQa<Throwable> {
        final C6776kQa<? super C7738yPa<T>> a;

        t(C6776kQa<? super C7738yPa<T>> kqa) {
            this.a = kqa;
        }

        /* renamed from: a */
        public void accept(Throwable th) throws Exception {
            this.a.accept(C7738yPa.a(th));
        }
    }

    /* renamed from: zQa$u */
    /* compiled from: Functions */
    static final class u<T> implements C6776kQa<T> {
        final C6776kQa<? super C7738yPa<T>> a;

        u(C6776kQa<? super C7738yPa<T>> kqa) {
            this.a = kqa;
        }

        public void accept(T t) throws Exception {
            this.a.accept(C7738yPa.a(t));
        }
    }

    /* renamed from: zQa$v */
    /* compiled from: Functions */
    static final class v implements Callable<Object> {
        v() {
        }

        public Object call() {
            return null;
        }
    }

    /* renamed from: zQa$w */
    /* compiled from: Functions */
    static final class w implements C6776kQa<Throwable> {
        w() {
        }

        /* renamed from: a */
        public void accept(Throwable th) {
            WUa.b((Throwable) new C5636bQa(th));
        }
    }

    /* renamed from: zQa$x */
    /* compiled from: Functions */
    static final class x implements C7256rQa<Object> {
        x() {
        }

        public boolean test(Object obj) {
            return true;
        }
    }

    public static <T1, T2, R> C7118pQa<Object[], R> a(C6504gQa<? super T1, ? super T2, ? extends R> gqa) {
        AQa.a(gqa, "f is null");
        return new a(gqa);
    }

    public static <T> C6776kQa<T> b() {
        return d;
    }

    public static <T> C7118pQa<T, T> c() {
        return a;
    }

    public static <T, U> C7118pQa<T, U> b(U u2) {
        return new p(u2);
    }

    public static <T> C6776kQa<T> c(C6776kQa<? super C7738yPa<T>> kqa) {
        return new u(kqa);
    }

    public static <T1, T2, T3, R> C7118pQa<Object[], R> a(C6844lQa<T1, T2, T3, R> lqa) {
        AQa.a(lqa, "f is null");
        return new b(lqa);
    }

    public static <T> C6776kQa<Throwable> b(C6776kQa<? super C7738yPa<T>> kqa) {
        return new t(kqa);
    }

    public static <T, U> C7256rQa<T> b(Class<U> cls) {
        return new h(cls);
    }

    public static <T1, T2, T3, T4, R> C7118pQa<Object[], R> a(C6912mQa<T1, T2, T3, T4, R> mqa) {
        AQa.a(mqa, "f is null");
        return new c(mqa);
    }

    public static <T1, T2, T3, T4, T5, R> C7118pQa<Object[], R> a(C6980nQa<T1, T2, T3, T4, T5, R> nqa) {
        AQa.a(nqa, "f is null");
        return new d(nqa);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> C7118pQa<Object[], R> a(C7049oQa<T1, T2, T3, T4, T5, T6, T7, T8, R> oqa) {
        AQa.a(oqa, "f is null");
        return new e(oqa);
    }

    public static <T> C7256rQa<T> a() {
        return h;
    }

    public static <T> Callable<T> a(T t2) {
        return new p(t2);
    }

    public static <T, U> C7118pQa<T, U> a(Class<U> cls) {
        return new g(cls);
    }

    public static <T> Callable<List<T>> a(int i2) {
        return new f(i2);
    }

    public static <T> C6368eQa a(C6776kQa<? super C7738yPa<T>> kqa) {
        return new s(kqa);
    }
}
