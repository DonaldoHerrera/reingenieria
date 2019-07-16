package defpackage;

import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: PDb reason: default package */
/* compiled from: ZoneRulesInitializer */
public abstract class PDb {
    public static final PDb a = new a();
    private static final AtomicBoolean b = new AtomicBoolean(false);
    private static final AtomicReference<PDb> c = new AtomicReference<>();

    /* renamed from: PDb$a */
    /* compiled from: ZoneRulesInitializer */
    static class a extends PDb {
        a() {
        }

        /* access modifiers changed from: protected */
        public void b() {
        }
    }

    /* renamed from: PDb$b */
    /* compiled from: ZoneRulesInitializer */
    static class b extends PDb {
        b() {
        }

        /* access modifiers changed from: protected */
        public void b() {
            Iterator it = ServiceLoader.load(QDb.class, QDb.class.getClassLoader()).iterator();
            while (it.hasNext()) {
                try {
                    QDb.a((QDb) it.next());
                } catch (ServiceConfigurationError e) {
                    if (!(e.getCause() instanceof SecurityException)) {
                        throw e;
                    }
                }
            }
        }
    }

    public static void a(PDb pDb) {
        if (b.get()) {
            throw new IllegalStateException("Already initialized");
        } else if (!c.compareAndSet(null, pDb)) {
            throw new IllegalStateException("Initializer was already set, possibly with a default during initialization");
        }
    }

    /* access modifiers changed from: protected */
    public abstract void b();

    static void a() {
        if (!b.getAndSet(true)) {
            c.compareAndSet(null, new b());
            ((PDb) c.get()).b();
            return;
        }
        throw new IllegalStateException("Already initialized");
    }
}
