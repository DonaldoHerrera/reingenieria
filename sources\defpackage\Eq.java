package defpackage;

import android.os.Handler;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: Eq reason: default package */
/* compiled from: EventDispatcher */
public final class Eq<T> {
    private final CopyOnWriteArrayList<b<T>> a = new CopyOnWriteArrayList<>();

    /* renamed from: Eq$a */
    /* compiled from: EventDispatcher */
    public interface a<T> {
        void a(T t);
    }

    /* renamed from: Eq$b */
    /* compiled from: EventDispatcher */
    private static final class b<T> {
        private final Handler a;
        /* access modifiers changed from: private */
        public final T b;
        private boolean c;

        public b(Handler handler, T t) {
            this.a = handler;
            this.b = t;
        }

        public /* synthetic */ void b(a aVar) {
            if (!this.c) {
                aVar.a(this.b);
            }
        }

        public void a() {
            this.c = true;
        }

        public void a(a<T> aVar) {
            this.a.post(new C1732tq(this, aVar));
        }
    }

    public void a(Handler handler, T t) {
        C1852xq.a((handler == null || t == null) ? false : true);
        a(t);
        this.a.add(new b(handler, t));
    }

    public void a(T t) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            if (bVar.b == t) {
                bVar.a();
                this.a.remove(bVar);
            }
        }
    }

    public void a(a<T> aVar) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((b) it.next()).a(aVar);
        }
    }
}
