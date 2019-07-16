package defpackage;

import java.util.concurrent.Executor;

/* renamed from: E reason: default package */
/* compiled from: ArchTaskExecutor */
public class E extends H {
    private static volatile E a;
    private static final Executor b = new C();
    private static final Executor c = new D();
    private H d = this.e;
    private H e = new G();

    private E() {
    }

    public static E c() {
        if (a != null) {
            return a;
        }
        synchronized (E.class) {
            if (a == null) {
                a = new E();
            }
        }
        return a;
    }

    public void a(Runnable runnable) {
        this.d.a(runnable);
    }

    public void b(Runnable runnable) {
        this.d.b(runnable);
    }

    public static Executor b() {
        return c;
    }

    public boolean a() {
        return this.d.a();
    }
}
