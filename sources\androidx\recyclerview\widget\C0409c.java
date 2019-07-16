package androidx.recyclerview.widget;

import androidx.recyclerview.widget.C0425t.c;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* renamed from: androidx.recyclerview.widget.c reason: case insensitive filesystem */
/* compiled from: AsyncDifferConfig */
public final class C0409c<T> {
    private final Executor a;
    private final Executor b;
    private final c<T> c;

    /* renamed from: androidx.recyclerview.widget.c$a */
    /* compiled from: AsyncDifferConfig */
    public static final class a<T> {
        private static final Object a = new Object();
        private static Executor b = null;
        private Executor c;
        private Executor d;
        private final c<T> e;

        public a(c<T> cVar) {
            this.e = cVar;
        }

        public C0409c<T> a() {
            if (this.d == null) {
                synchronized (a) {
                    if (b == null) {
                        b = Executors.newFixedThreadPool(2);
                    }
                }
                this.d = b;
            }
            return new C0409c<>(this.c, this.d, this.e);
        }
    }

    C0409c(Executor executor, Executor executor2, c<T> cVar) {
        this.a = executor;
        this.b = executor2;
        this.c = cVar;
    }

    public Executor a() {
        return this.b;
    }

    public c<T> b() {
        return this.c;
    }

    public Executor c() {
        return this.a;
    }
}
