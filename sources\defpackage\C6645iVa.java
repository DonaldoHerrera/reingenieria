package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* renamed from: iVa reason: default package and case insensitive filesystem */
/* compiled from: Schedulers */
public final class C6645iVa {
    static final HPa a = WUa.e(new h());
    static final HPa b = WUa.b((Callable<HPa>) new b<HPa>());
    static final HPa c = WUa.c((Callable<HPa>) new c<HPa>());
    static final HPa d = C7122pUa.b();
    static final HPa e = WUa.d(new f());

    /* renamed from: iVa$a */
    /* compiled from: Schedulers */
    static final class a {
        static final HPa a = new C5572aUa();
    }

    /* renamed from: iVa$b */
    /* compiled from: Schedulers */
    static final class b implements Callable<HPa> {
        b() {
        }

        public HPa call() throws Exception {
            return a.a;
        }
    }

    /* renamed from: iVa$c */
    /* compiled from: Schedulers */
    static final class c implements Callable<HPa> {
        c() {
        }

        public HPa call() throws Exception {
            return d.a;
        }
    }

    /* renamed from: iVa$d */
    /* compiled from: Schedulers */
    static final class d {
        static final HPa a = new C6372eUa();
    }

    /* renamed from: iVa$e */
    /* compiled from: Schedulers */
    static final class e {
        static final HPa a = new C6440fUa();
    }

    /* renamed from: iVa$f */
    /* compiled from: Schedulers */
    static final class f implements Callable<HPa> {
        f() {
        }

        public HPa call() throws Exception {
            return e.a;
        }
    }

    /* renamed from: iVa$g */
    /* compiled from: Schedulers */
    static final class g {
        static final HPa a = new C7053oUa();
    }

    /* renamed from: iVa$h */
    /* compiled from: Schedulers */
    static final class h implements Callable<HPa> {
        h() {
        }

        public HPa call() throws Exception {
            return g.a;
        }
    }

    public static HPa a() {
        return WUa.a(b);
    }

    public static HPa b() {
        return WUa.b(c);
    }

    public static HPa c() {
        return WUa.c(a);
    }

    public static HPa d() {
        return d;
    }

    public static HPa a(Executor executor) {
        return new C5708cUa(executor, false);
    }
}
