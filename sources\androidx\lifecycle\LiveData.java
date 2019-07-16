package androidx.lifecycle;

import androidx.lifecycle.f.b;
import java.util.Map.Entry;

public abstract class LiveData<T> {
    static final Object a = new Object();
    final Object b = new Object();
    private J<p<? super T>, a> c = new J<>();
    int d = 0;
    private volatile Object e;
    volatile Object f;
    private int g;
    private boolean h;
    private boolean i;
    private final Runnable j;

    class LifecycleBoundObserver extends a implements e {
        final h e;

        LifecycleBoundObserver(h hVar, p<? super T> pVar) {
            super(pVar);
            this.e = hVar;
        }

        public void a(h hVar, androidx.lifecycle.f.a aVar) {
            if (this.e.getLifecycle().a() == b.DESTROYED) {
                LiveData.this.a(this.a);
            } else {
                a(b());
            }
        }

        /* access modifiers changed from: 0000 */
        public boolean b() {
            return this.e.getLifecycle().a().a(b.STARTED);
        }

        /* access modifiers changed from: 0000 */
        public boolean a(h hVar) {
            return this.e == hVar;
        }

        /* access modifiers changed from: 0000 */
        public void a() {
            this.e.getLifecycle().b(this);
        }
    }

    private abstract class a {
        final p<? super T> a;
        boolean b;
        int c = -1;

        a(p<? super T> pVar) {
            this.a = pVar;
        }

        /* access modifiers changed from: 0000 */
        public void a() {
        }

        /* access modifiers changed from: 0000 */
        public void a(boolean z) {
            if (z != this.b) {
                this.b = z;
                int i = 1;
                boolean z2 = LiveData.this.d == 0;
                LiveData liveData = LiveData.this;
                int i2 = liveData.d;
                if (!this.b) {
                    i = -1;
                }
                liveData.d = i2 + i;
                if (z2 && this.b) {
                    LiveData.this.c();
                }
                LiveData liveData2 = LiveData.this;
                if (liveData2.d == 0 && !this.b) {
                    liveData2.d();
                }
                if (this.b) {
                    LiveData.this.a(this);
                }
            }
        }

        /* access modifiers changed from: 0000 */
        public boolean a(h hVar) {
            return false;
        }

        /* access modifiers changed from: 0000 */
        public abstract boolean b();
    }

    public LiveData() {
        Object obj = a;
        this.e = obj;
        this.f = obj;
        this.g = -1;
        this.j = new m(this);
    }

    private void b(a aVar) {
        if (aVar.b) {
            if (!aVar.b()) {
                aVar.a(false);
                return;
            }
            int i2 = aVar.c;
            int i3 = this.g;
            if (i2 < i3) {
                aVar.c = i3;
                aVar.a.a(this.e);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public void a(a aVar) {
        if (this.h) {
            this.i = true;
            return;
        }
        this.h = true;
        do {
            this.i = false;
            if (aVar == null) {
                d g2 = this.c.g();
                while (g2.hasNext()) {
                    b((a) ((Entry) g2.next()).getValue());
                    if (this.i) {
                        break;
                    }
                }
            } else {
                b(aVar);
                aVar = null;
            }
        } while (this.i);
        this.h = false;
    }

    /* access modifiers changed from: protected */
    public void c() {
    }

    /* access modifiers changed from: protected */
    public void d() {
    }

    /* access modifiers changed from: protected */
    public void b(T t) {
        a("setValue");
        this.g++;
        this.e = t;
        a(null);
    }

    public boolean b() {
        return this.d > 0;
    }

    public void a(h hVar, p<? super T> pVar) {
        a("observe");
        if (hVar.getLifecycle().a() != b.DESTROYED) {
            LifecycleBoundObserver lifecycleBoundObserver = new LifecycleBoundObserver(hVar, pVar);
            a aVar = (a) this.c.b(pVar, lifecycleBoundObserver);
            if (aVar != null && !aVar.a(hVar)) {
                throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
            } else if (aVar == null) {
                hVar.getLifecycle().a(lifecycleBoundObserver);
            }
        }
    }

    public void a(p<? super T> pVar) {
        a("removeObserver");
        a aVar = (a) this.c.remove(pVar);
        if (aVar != null) {
            aVar.a();
            aVar.a(false);
        }
    }

    /* access modifiers changed from: protected */
    public void a(T t) {
        boolean z;
        synchronized (this.b) {
            z = this.f == a;
            this.f = t;
        }
        if (z) {
            E.c().b(this.j);
        }
    }

    public T a() {
        T t = this.e;
        if (t != a) {
            return t;
        }
        return null;
    }

    private static void a(String str) {
        if (!E.c().a()) {
            StringBuilder sb = new StringBuilder();
            sb.append("Cannot invoke ");
            sb.append(str);
            sb.append(" on a background");
            sb.append(" thread");
            throw new IllegalStateException(sb.toString());
        }
    }
}
