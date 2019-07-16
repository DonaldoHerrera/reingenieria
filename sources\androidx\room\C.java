package androidx.room;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: SharedSQLiteStatement */
public abstract class C {
    private final AtomicBoolean a = new AtomicBoolean(false);
    private final t b;
    private volatile Yd c;

    public C(t tVar) {
        this.b = tVar;
    }

    private Yd a(boolean z) {
        if (!z) {
            return d();
        }
        if (this.c == null) {
            this.c = d();
        }
        return this.c;
    }

    private Yd d() {
        return this.b.a(c());
    }

    /* access modifiers changed from: protected */
    public void b() {
        this.b.a();
    }

    /* access modifiers changed from: protected */
    public abstract String c();

    public Yd a() {
        b();
        return a(this.a.compareAndSet(false, true));
    }

    public void a(Yd yd) {
        if (yd == this.c) {
            this.a.set(false);
        }
    }
}
