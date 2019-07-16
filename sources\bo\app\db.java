package bo.app;

import java.util.Collection;
import java.util.concurrent.Callable;

public class db implements dg {
    /* access modifiers changed from: private */
    public final dg a;
    private final au b;

    public db(dg dgVar, au auVar) {
        this.a = dgVar;
        this.b = auVar;
    }

    public void b(final bo boVar) {
        this.b.execute(new Runnable() {
            public void run() {
                db.this.a.b(boVar);
            }
        });
    }

    public void a(final bo boVar) {
        this.b.execute(new Runnable() {
            public void run() {
                db.this.a.a(boVar);
            }
        });
    }

    public synchronized Collection<bo> a() {
        try {
        } catch (Exception e) {
            throw new RuntimeException("Error while trying to asynchronously get all events.", e);
        }
        return (Collection) this.b.submit(new Callable<Collection<bo>>() {
            /* renamed from: a */
            public Collection<bo> call() {
                return db.this.a.a();
            }
        }).get();
    }
}
