package defpackage;

import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: sf reason: default package and case insensitive filesystem */
/* compiled from: AbstractFuture */
public abstract class C1691sf<V> implements C3347xE<V> {
    static final boolean a = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    private static final Logger b = Logger.getLogger(C1691sf.class.getName());
    static final a c;
    private static final Object d = new Object();
    volatile Object e;
    volatile d f;
    volatile h g;

    /* renamed from: sf$a */
    /* compiled from: AbstractFuture */
    private static abstract class a {
        private a() {
        }

        /* access modifiers changed from: 0000 */
        public abstract void a(h hVar, Thread thread);

        /* access modifiers changed from: 0000 */
        public abstract void a(h hVar, h hVar2);

        /* access modifiers changed from: 0000 */
        public abstract boolean a(C1691sf<?> sfVar, Object obj, Object obj2);

        /* access modifiers changed from: 0000 */
        public abstract boolean a(C1691sf<?> sfVar, d dVar, d dVar2);

        /* access modifiers changed from: 0000 */
        public abstract boolean a(C1691sf<?> sfVar, h hVar, h hVar2);
    }

    /* renamed from: sf$b */
    /* compiled from: AbstractFuture */
    private static final class b {
        static final b a;
        static final b b;
        final boolean c;
        final Throwable d;

        static {
            if (C1691sf.a) {
                b = null;
                a = null;
                return;
            }
            b = new b(false, null);
            a = new b(true, null);
        }

        b(boolean z, Throwable th) {
            this.c = z;
            this.d = th;
        }
    }

    /* renamed from: sf$c */
    /* compiled from: AbstractFuture */
    private static final class c {
        static final c a = new c(new C1721tf("Failure occurred while trying to finish a future."));
        final Throwable b;

        c(Throwable th) {
            C1691sf.a(th);
            this.b = th;
        }
    }

    /* renamed from: sf$d */
    /* compiled from: AbstractFuture */
    private static final class d {
        static final d a = new d(null, null);
        final Runnable b;
        final Executor c;
        d d;

        d(Runnable runnable, Executor executor) {
            this.b = runnable;
            this.c = executor;
        }
    }

    /* renamed from: sf$e */
    /* compiled from: AbstractFuture */
    private static final class e extends a {
        final AtomicReferenceFieldUpdater<h, Thread> a;
        final AtomicReferenceFieldUpdater<h, h> b;
        final AtomicReferenceFieldUpdater<C1691sf, h> c;
        final AtomicReferenceFieldUpdater<C1691sf, d> d;
        final AtomicReferenceFieldUpdater<C1691sf, Object> e;

        e(AtomicReferenceFieldUpdater<h, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<h, h> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<C1691sf, h> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<C1691sf, d> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<C1691sf, Object> atomicReferenceFieldUpdater5) {
            super();
            this.a = atomicReferenceFieldUpdater;
            this.b = atomicReferenceFieldUpdater2;
            this.c = atomicReferenceFieldUpdater3;
            this.d = atomicReferenceFieldUpdater4;
            this.e = atomicReferenceFieldUpdater5;
        }

        /* access modifiers changed from: 0000 */
        public void a(h hVar, Thread thread) {
            this.a.lazySet(hVar, thread);
        }

        /* access modifiers changed from: 0000 */
        public void a(h hVar, h hVar2) {
            this.b.lazySet(hVar, hVar2);
        }

        /* access modifiers changed from: 0000 */
        public boolean a(C1691sf<?> sfVar, h hVar, h hVar2) {
            return this.c.compareAndSet(sfVar, hVar, hVar2);
        }

        /* access modifiers changed from: 0000 */
        public boolean a(C1691sf<?> sfVar, d dVar, d dVar2) {
            return this.d.compareAndSet(sfVar, dVar, dVar2);
        }

        /* access modifiers changed from: 0000 */
        public boolean a(C1691sf<?> sfVar, Object obj, Object obj2) {
            return this.e.compareAndSet(sfVar, obj, obj2);
        }
    }

    /* renamed from: sf$f */
    /* compiled from: AbstractFuture */
    private static final class f<V> implements Runnable {
        final C1691sf<V> a;
        final C3347xE<? extends V> b;

        f(C1691sf<V> sfVar, C3347xE<? extends V> xEVar) {
            this.a = sfVar;
            this.b = xEVar;
        }

        public void run() {
            if (this.a.e == this) {
                if (C1691sf.c.a(this.a, (Object) this, C1691sf.a(this.b))) {
                    C1691sf.a(this.a);
                }
            }
        }
    }

    /* renamed from: sf$g */
    /* compiled from: AbstractFuture */
    private static final class g extends a {
        g() {
            super();
        }

        /* access modifiers changed from: 0000 */
        public void a(h hVar, Thread thread) {
            hVar.b = thread;
        }

        /* access modifiers changed from: 0000 */
        public void a(h hVar, h hVar2) {
            hVar.c = hVar2;
        }

        /* access modifiers changed from: 0000 */
        public boolean a(C1691sf<?> sfVar, h hVar, h hVar2) {
            synchronized (sfVar) {
                if (sfVar.g != hVar) {
                    return false;
                }
                sfVar.g = hVar2;
                return true;
            }
        }

        /* access modifiers changed from: 0000 */
        public boolean a(C1691sf<?> sfVar, d dVar, d dVar2) {
            synchronized (sfVar) {
                if (sfVar.f != dVar) {
                    return false;
                }
                sfVar.f = dVar2;
                return true;
            }
        }

        /* access modifiers changed from: 0000 */
        public boolean a(C1691sf<?> sfVar, Object obj, Object obj2) {
            synchronized (sfVar) {
                if (sfVar.e != obj) {
                    return false;
                }
                sfVar.e = obj2;
                return true;
            }
        }
    }

    /* renamed from: sf$h */
    /* compiled from: AbstractFuture */
    private static final class h {
        static final h a = new h(false);
        volatile Thread b;
        volatile h c;

        h(boolean z) {
        }

        /* access modifiers changed from: 0000 */
        public void a(h hVar) {
            C1691sf.c.a(this, hVar);
        }

        h() {
            C1691sf.c.a(this, Thread.currentThread());
        }

        /* access modifiers changed from: 0000 */
        public void a() {
            Thread thread = this.b;
            if (thread != null) {
                this.b = null;
                LockSupport.unpark(thread);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v11, types: [sf$g] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    static {
        Throwable th;
        e eVar;
        try {
            e eVar2 = new e(AtomicReferenceFieldUpdater.newUpdater(h.class, Thread.class, "b"), AtomicReferenceFieldUpdater.newUpdater(h.class, h.class, "c"), AtomicReferenceFieldUpdater.newUpdater(C1691sf.class, h.class, "g"), AtomicReferenceFieldUpdater.newUpdater(C1691sf.class, d.class, "f"), AtomicReferenceFieldUpdater.newUpdater(C1691sf.class, Object.class, "e"));
            th = null;
            eVar = eVar2;
        } catch (Throwable th2) {
            th = th2;
            eVar = new g();
        }
        c = eVar;
        Class<LockSupport> cls = LockSupport.class;
        if (th != null) {
            b.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
    }

    protected C1691sf() {
    }

    private void a(h hVar) {
        hVar.b = null;
        while (true) {
            h hVar2 = this.g;
            if (hVar2 != h.a) {
                h hVar3 = null;
                while (hVar2 != null) {
                    h hVar4 = hVar2.c;
                    if (hVar2.b != null) {
                        hVar3 = hVar2;
                    } else if (hVar3 != null) {
                        hVar3.c = hVar4;
                        if (hVar3.b == null) {
                        }
                    } else if (!c.a(this, hVar2, hVar4)) {
                    }
                    hVar2 = hVar4;
                }
                return;
            }
            return;
        }
    }

    private V c(Object obj) throws ExecutionException {
        if (obj instanceof b) {
            throw a("Task was cancelled.", ((b) obj).d);
        } else if (obj instanceof c) {
            throw new ExecutionException(((c) obj).b);
        } else if (obj == d) {
            return null;
        } else {
            return obj;
        }
    }

    private void d() {
        h hVar;
        do {
            hVar = this.g;
        } while (!c.a(this, hVar, h.a));
        while (hVar != null) {
            hVar.a();
            hVar = hVar.c;
        }
    }

    /* access modifiers changed from: protected */
    public void a() {
    }

    /* access modifiers changed from: protected */
    public void b() {
    }

    /* access modifiers changed from: protected */
    public boolean b(V v) {
        if (v == null) {
            v = d;
        }
        if (!c.a(this, (Object) null, (Object) v)) {
            return false;
        }
        a(this);
        return true;
    }

    public final boolean cancel(boolean z) {
        Object obj = this.e;
        if (!(obj == null) && !(obj instanceof f)) {
            return false;
        }
        b bVar = a ? new b(z, new CancellationException("Future.cancel() was called.")) : z ? b.a : b.b;
        boolean z2 = false;
        Object obj2 = obj;
        C1691sf sfVar = this;
        while (true) {
            if (c.a(sfVar, obj2, (Object) bVar)) {
                if (z) {
                    sfVar.b();
                }
                a(sfVar);
                if (!(obj2 instanceof f)) {
                    return true;
                }
                C3347xE<? extends V> xEVar = ((f) obj2).b;
                if (xEVar instanceof C1691sf) {
                    sfVar = (C1691sf) xEVar;
                    obj2 = sfVar.e;
                    if (!(obj2 == null) && !(obj2 instanceof f)) {
                        return true;
                    }
                    z2 = true;
                } else {
                    xEVar.cancel(z);
                    return true;
                }
            } else {
                obj2 = sfVar.e;
                if (!(obj2 instanceof f)) {
                    return z2;
                }
            }
        }
    }

    public final V get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException, ExecutionException {
        long j2 = j;
        TimeUnit timeUnit2 = timeUnit;
        long nanos = timeUnit2.toNanos(j2);
        if (!Thread.interrupted()) {
            Object obj = this.e;
            if ((obj != null) && (!(obj instanceof f))) {
                return c(obj);
            }
            long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0;
            if (nanos >= 1000) {
                h hVar = this.g;
                if (hVar != h.a) {
                    h hVar2 = new h();
                    do {
                        hVar2.a(hVar);
                        if (c.a(this, hVar, hVar2)) {
                            do {
                                LockSupport.parkNanos(this, nanos);
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.e;
                                    if ((obj2 != null) && (!(obj2 instanceof f))) {
                                        return c(obj2);
                                    }
                                    nanos = nanoTime - System.nanoTime();
                                } else {
                                    a(hVar2);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            a(hVar2);
                        } else {
                            hVar = this.g;
                        }
                    } while (hVar != h.a);
                }
                return c(this.e);
            }
            while (nanos > 0) {
                Object obj3 = this.e;
                if ((obj3 != null) && (!(obj3 instanceof f))) {
                    return c(obj3);
                }
                if (!Thread.interrupted()) {
                    nanos = nanoTime - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String sfVar = toString();
            String lowerCase = timeUnit.toString().toLowerCase(Locale.ROOT);
            StringBuilder sb = new StringBuilder();
            sb.append("Waited ");
            sb.append(j2);
            String str = " ";
            sb.append(str);
            sb.append(timeUnit.toString().toLowerCase(Locale.ROOT));
            String sb2 = sb.toString();
            if (nanos + 1000 < 0) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(sb2);
                sb3.append(" (plus ");
                String sb4 = sb3.toString();
                long j3 = -nanos;
                long convert = timeUnit2.convert(j3, TimeUnit.NANOSECONDS);
                long nanos2 = j3 - timeUnit2.toNanos(convert);
                int i = (convert > 0 ? 1 : (convert == 0 ? 0 : -1));
                boolean z = i == 0 || nanos2 > 1000;
                if (i > 0) {
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append(sb4);
                    sb5.append(convert);
                    sb5.append(str);
                    sb5.append(lowerCase);
                    String sb6 = sb5.toString();
                    if (z) {
                        StringBuilder sb7 = new StringBuilder();
                        sb7.append(sb6);
                        sb7.append(",");
                        sb6 = sb7.toString();
                    }
                    StringBuilder sb8 = new StringBuilder();
                    sb8.append(sb6);
                    sb8.append(str);
                    sb4 = sb8.toString();
                }
                if (z) {
                    StringBuilder sb9 = new StringBuilder();
                    sb9.append(sb4);
                    sb9.append(nanos2);
                    sb9.append(" nanoseconds ");
                    sb4 = sb9.toString();
                }
                StringBuilder sb10 = new StringBuilder();
                sb10.append(sb4);
                sb10.append("delay)");
                sb2 = sb10.toString();
            }
            if (isDone()) {
                StringBuilder sb11 = new StringBuilder();
                sb11.append(sb2);
                sb11.append(" but future completed as timeout expired");
                throw new TimeoutException(sb11.toString());
            }
            StringBuilder sb12 = new StringBuilder();
            sb12.append(sb2);
            sb12.append(" for ");
            sb12.append(sfVar);
            throw new TimeoutException(sb12.toString());
        }
        throw new InterruptedException();
    }

    public final boolean isCancelled() {
        return this.e instanceof b;
    }

    public final boolean isDone() {
        Object obj = this.e;
        boolean z = true;
        boolean z2 = obj != null;
        if (obj instanceof f) {
            z = false;
        }
        return z2 & z;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        String str2 = "]";
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            a(sb);
        } else {
            try {
                str = c();
            } catch (RuntimeException e2) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Exception thrown from implementation: ");
                sb2.append(e2.getClass());
                str = sb2.toString();
            }
            if (str != null && !str.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(str);
                sb.append(str2);
            } else if (isDone()) {
                a(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append(str2);
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    public boolean b(C3347xE<? extends V> xEVar) {
        f fVar;
        c cVar;
        a((T) xEVar);
        Object obj = this.e;
        if (obj == null) {
            if (xEVar.isDone()) {
                if (!c.a(this, (Object) null, a(xEVar))) {
                    return false;
                }
                a(this);
                return true;
            }
            fVar = new f(this, xEVar);
            if (c.a(this, (Object) null, (Object) fVar)) {
                try {
                    xEVar.a(fVar, C1751uf.INSTANCE);
                } catch (Throwable unused) {
                    cVar = c.a;
                }
                return true;
            }
            obj = this.e;
        }
        if (obj instanceof b) {
            xEVar.cancel(((b) obj).c);
        }
        return false;
        c.a(this, (Object) fVar, (Object) cVar);
        return true;
    }

    private String d(Object obj) {
        return obj == this ? "this future" : String.valueOf(obj);
    }

    /* access modifiers changed from: protected */
    public String c() {
        Object obj = this.e;
        if (obj instanceof f) {
            StringBuilder sb = new StringBuilder();
            sb.append("setFuture=[");
            sb.append(d(((f) obj).b));
            sb.append("]");
            return sb.toString();
        } else if (!(this instanceof ScheduledFuture)) {
            return null;
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("remaining delay=[");
            sb2.append(((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS));
            sb2.append(" ms]");
            return sb2.toString();
        }
    }

    public final void a(Runnable runnable, Executor executor) {
        a((T) runnable);
        a((T) executor);
        d dVar = this.f;
        if (dVar != d.a) {
            d dVar2 = new d(runnable, executor);
            do {
                dVar2.d = dVar;
                if (!c.a(this, dVar, dVar2)) {
                    dVar = this.f;
                } else {
                    return;
                }
            } while (dVar != d.a);
        }
        b(runnable, executor);
    }

    private static void b(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e2) {
            Logger logger = b;
            Level level = Level.SEVERE;
            StringBuilder sb = new StringBuilder();
            sb.append("RuntimeException while executing runnable ");
            sb.append(runnable);
            sb.append(" with executor ");
            sb.append(executor);
            logger.log(level, sb.toString(), e2);
        }
    }

    /* access modifiers changed from: protected */
    public boolean a(Throwable th) {
        a((T) th);
        if (!c.a(this, (Object) null, (Object) new c(th))) {
            return false;
        }
        a(this);
        return true;
    }

    static Object a(C3347xE<?> xEVar) {
        if (xEVar instanceof C1691sf) {
            Object obj = ((C1691sf) xEVar).e;
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (bVar.c) {
                    Throwable th = bVar.d;
                    obj = th != null ? new b(false, th) : b.b;
                }
            }
            return obj;
        }
        boolean isCancelled = xEVar.isCancelled();
        if ((!a) && isCancelled) {
            return b.b;
        }
        try {
            Object a2 = a((Future<V>) xEVar);
            if (a2 == null) {
                a2 = d;
            }
            return a2;
        } catch (ExecutionException e2) {
            return new c(e2.getCause());
        } catch (CancellationException e3) {
            if (isCancelled) {
                return new b(false, e3);
            }
            StringBuilder sb = new StringBuilder();
            sb.append("get() threw CancellationException, despite reporting isCancelled() == false: ");
            sb.append(xEVar);
            return new c(new IllegalArgumentException(sb.toString(), e3));
        } catch (Throwable th2) {
            return new c(th2);
        }
    }

    private static <V> V a(Future<V> future) throws ExecutionException {
        V v;
        boolean z = false;
        while (true) {
            try {
                v = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return v;
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=sf<?>, code=sf, for r4v0, types: [sf<?>, sf] */
    static void a(C1691sf sfVar) {
        d dVar = null;
        while (true) {
            sfVar.d();
            sfVar.a();
            d a2 = sfVar.a(dVar);
            while (true) {
                if (a2 != null) {
                    dVar = a2.d;
                    Runnable runnable = a2.b;
                    if (runnable instanceof f) {
                        f fVar = (f) runnable;
                        sfVar = fVar.a;
                        if (sfVar.e == fVar) {
                            if (c.a(sfVar, (Object) fVar, a(fVar.b))) {
                            }
                        } else {
                            continue;
                        }
                    } else {
                        b(runnable, a2.c);
                    }
                    a2 = dVar;
                } else {
                    return;
                }
            }
        }
    }

    public final V get() throws InterruptedException, ExecutionException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.e;
            if ((obj2 != null) && (!(obj2 instanceof f))) {
                return c(obj2);
            }
            h hVar = this.g;
            if (hVar != h.a) {
                h hVar2 = new h();
                do {
                    hVar2.a(hVar);
                    if (c.a(this, hVar, hVar2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.e;
                            } else {
                                a(hVar2);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof f))));
                        return c(obj);
                    }
                    hVar = this.g;
                } while (hVar != h.a);
            }
            return c(this.e);
        }
        throw new InterruptedException();
    }

    private d a(d dVar) {
        d dVar2;
        do {
            dVar2 = this.f;
        } while (!c.a(this, dVar2, d.a));
        d dVar3 = dVar2;
        d dVar4 = dVar;
        d dVar5 = dVar3;
        while (dVar5 != null) {
            d dVar6 = dVar5.d;
            dVar5.d = dVar4;
            dVar4 = dVar5;
            dVar5 = dVar6;
        }
        return dVar4;
    }

    private void a(StringBuilder sb) {
        String str = "]";
        try {
            Object a2 = a((Future<V>) this);
            sb.append("SUCCESS, result=[");
            sb.append(d(a2));
            sb.append(str);
        } catch (ExecutionException e2) {
            sb.append("FAILURE, cause=[");
            sb.append(e2.getCause());
            sb.append(str);
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e3) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e3.getClass());
            sb.append(" thrown from get()]");
        }
    }

    private static CancellationException a(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    static <T> T a(T t) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException();
    }
}
