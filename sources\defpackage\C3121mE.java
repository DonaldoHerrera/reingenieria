package defpackage;

import com.google.common.base.Preconditions;
import com.google.common.base.Throwables;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.ForOverride;
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
import sun.misc.Unsafe;

/* renamed from: mE reason: default package and case insensitive filesystem */
/* compiled from: AbstractFuture */
public abstract class C3121mE<V> extends C2004EE implements C3347xE<V> {
    /* access modifiers changed from: private */
    public static final boolean a = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    private static final Logger b = Logger.getLogger(C3121mE.class.getName());
    /* access modifiers changed from: private */
    public static final a c;
    private static final Object d = new Object();
    /* access modifiers changed from: private */
    public volatile Object e;
    /* access modifiers changed from: private */
    public volatile d f;
    /* access modifiers changed from: private */
    public volatile k g;

    /* renamed from: mE$a */
    /* compiled from: AbstractFuture */
    private static abstract class a {
        private a() {
        }

        /* access modifiers changed from: 0000 */
        public abstract void a(k kVar, Thread thread);

        /* access modifiers changed from: 0000 */
        public abstract void a(k kVar, k kVar2);

        /* access modifiers changed from: 0000 */
        public abstract boolean a(C3121mE<?> mEVar, Object obj, Object obj2);

        /* access modifiers changed from: 0000 */
        public abstract boolean a(C3121mE<?> mEVar, d dVar, d dVar2);

        /* access modifiers changed from: 0000 */
        public abstract boolean a(C3121mE<?> mEVar, k kVar, k kVar2);
    }

    /* renamed from: mE$b */
    /* compiled from: AbstractFuture */
    private static final class b {
        static final b a;
        static final b b;
        final boolean c;
        final Throwable d;

        static {
            if (C3121mE.a) {
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

    /* renamed from: mE$c */
    /* compiled from: AbstractFuture */
    private static final class c {
        static final c a = new c(new C3140nE("Failure occurred while trying to finish a future."));
        final Throwable b;

        c(Throwable th) {
            Preconditions.checkNotNull(th);
            this.b = th;
        }
    }

    /* renamed from: mE$d */
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

    /* renamed from: mE$e */
    /* compiled from: AbstractFuture */
    private static final class e extends a {
        final AtomicReferenceFieldUpdater<k, Thread> a;
        final AtomicReferenceFieldUpdater<k, k> b;
        final AtomicReferenceFieldUpdater<C3121mE, k> c;
        final AtomicReferenceFieldUpdater<C3121mE, d> d;
        final AtomicReferenceFieldUpdater<C3121mE, Object> e;

        e(AtomicReferenceFieldUpdater<k, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<k, k> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<C3121mE, k> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<C3121mE, d> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<C3121mE, Object> atomicReferenceFieldUpdater5) {
            super();
            this.a = atomicReferenceFieldUpdater;
            this.b = atomicReferenceFieldUpdater2;
            this.c = atomicReferenceFieldUpdater3;
            this.d = atomicReferenceFieldUpdater4;
            this.e = atomicReferenceFieldUpdater5;
        }

        /* access modifiers changed from: 0000 */
        public void a(k kVar, Thread thread) {
            this.a.lazySet(kVar, thread);
        }

        /* access modifiers changed from: 0000 */
        public void a(k kVar, k kVar2) {
            this.b.lazySet(kVar, kVar2);
        }

        /* access modifiers changed from: 0000 */
        public boolean a(C3121mE<?> mEVar, k kVar, k kVar2) {
            return this.c.compareAndSet(mEVar, kVar, kVar2);
        }

        /* access modifiers changed from: 0000 */
        public boolean a(C3121mE<?> mEVar, d dVar, d dVar2) {
            return this.d.compareAndSet(mEVar, dVar, dVar2);
        }

        /* access modifiers changed from: 0000 */
        public boolean a(C3121mE<?> mEVar, Object obj, Object obj2) {
            return this.e.compareAndSet(mEVar, obj, obj2);
        }
    }

    /* renamed from: mE$f */
    /* compiled from: AbstractFuture */
    private static final class f<V> implements Runnable {
        final C3121mE<V> a;
        final C3347xE<? extends V> b;

        f(C3121mE<V> mEVar, C3347xE<? extends V> xEVar) {
            this.a = mEVar;
            this.b = xEVar;
        }

        public void run() {
            if (this.a.e == this) {
                if (C3121mE.c.a(this.a, (Object) this, C3121mE.c(this.b))) {
                    C3121mE.e(this.a);
                }
            }
        }
    }

    /* renamed from: mE$g */
    /* compiled from: AbstractFuture */
    private static final class g extends a {
        private g() {
            super();
        }

        /* access modifiers changed from: 0000 */
        public void a(k kVar, Thread thread) {
            kVar.b = thread;
        }

        /* access modifiers changed from: 0000 */
        public void a(k kVar, k kVar2) {
            kVar.c = kVar2;
        }

        /* access modifiers changed from: 0000 */
        public boolean a(C3121mE<?> mEVar, k kVar, k kVar2) {
            synchronized (mEVar) {
                if (mEVar.g != kVar) {
                    return false;
                }
                mEVar.g = kVar2;
                return true;
            }
        }

        /* access modifiers changed from: 0000 */
        public boolean a(C3121mE<?> mEVar, d dVar, d dVar2) {
            synchronized (mEVar) {
                if (mEVar.f != dVar) {
                    return false;
                }
                mEVar.f = dVar2;
                return true;
            }
        }

        /* access modifiers changed from: 0000 */
        public boolean a(C3121mE<?> mEVar, Object obj, Object obj2) {
            synchronized (mEVar) {
                if (mEVar.e != obj) {
                    return false;
                }
                mEVar.e = obj2;
                return true;
            }
        }
    }

    /* renamed from: mE$h */
    /* compiled from: AbstractFuture */
    interface h<V> extends C3347xE<V> {
    }

    /* renamed from: mE$i */
    /* compiled from: AbstractFuture */
    static abstract class i<V> extends C3121mE<V> implements h<V> {
        i() {
        }

        public final void a(Runnable runnable, Executor executor) {
            C3121mE.super.a(runnable, executor);
        }

        @CanIgnoreReturnValue
        public final boolean cancel(boolean z) {
            return C3121mE.super.cancel(z);
        }

        @CanIgnoreReturnValue
        public final V get() throws InterruptedException, ExecutionException {
            return C3121mE.super.get();
        }

        public final boolean isCancelled() {
            return C3121mE.super.isCancelled();
        }

        public final boolean isDone() {
            return C3121mE.super.isDone();
        }

        @CanIgnoreReturnValue
        public final V get(long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
            return C3121mE.super.get(j, timeUnit);
        }
    }

    /* renamed from: mE$j */
    /* compiled from: AbstractFuture */
    private static final class j extends a {
        static final Unsafe a;
        static final long b;
        static final long c;
        static final long d;
        static final long e;
        static final long f;

        /* JADX WARNING: Code restructure failed: missing block: B:23:0x005f, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x006b, code lost:
            throw new java.lang.RuntimeException("Could not initialize intrinsics", r0.getCause());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:3:?, code lost:
            r0 = (sun.misc.Unsafe) java.security.AccessController.doPrivileged(new defpackage.C3169oE());
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:2:0x0005 */
        static {
            Unsafe unsafe = Unsafe.getUnsafe();
            Class<C3121mE> cls = C3121mE.class;
            try {
                c = unsafe.objectFieldOffset(cls.getDeclaredField("g"));
                b = unsafe.objectFieldOffset(cls.getDeclaredField("f"));
                d = unsafe.objectFieldOffset(cls.getDeclaredField("e"));
                e = unsafe.objectFieldOffset(k.class.getDeclaredField("b"));
                f = unsafe.objectFieldOffset(k.class.getDeclaredField("c"));
                a = unsafe;
            } catch (Exception e2) {
                Throwables.throwIfUnchecked(e2);
                throw new RuntimeException(e2);
            }
        }

        private j() {
            super();
        }

        /* access modifiers changed from: 0000 */
        public void a(k kVar, Thread thread) {
            a.putObject(kVar, e, thread);
        }

        /* access modifiers changed from: 0000 */
        public void a(k kVar, k kVar2) {
            a.putObject(kVar, f, kVar2);
        }

        /* access modifiers changed from: 0000 */
        public boolean a(C3121mE<?> mEVar, k kVar, k kVar2) {
            return a.compareAndSwapObject(mEVar, c, kVar, kVar2);
        }

        /* access modifiers changed from: 0000 */
        public boolean a(C3121mE<?> mEVar, d dVar, d dVar2) {
            return a.compareAndSwapObject(mEVar, b, dVar, dVar2);
        }

        /* access modifiers changed from: 0000 */
        public boolean a(C3121mE<?> mEVar, Object obj, Object obj2) {
            return a.compareAndSwapObject(mEVar, d, obj, obj2);
        }
    }

    /* renamed from: mE$k */
    /* compiled from: AbstractFuture */
    private static final class k {
        static final k a = new k(false);
        volatile Thread b;
        volatile k c;

        k(boolean z) {
        }

        /* access modifiers changed from: 0000 */
        public void a(k kVar) {
            C3121mE.c.a(this, kVar);
        }

        k() {
            C3121mE.c.a(this, Thread.currentThread());
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

    static {
        Throwable th;
        a aVar;
        Throwable th2 = null;
        try {
            th = null;
            aVar = new j();
        } catch (Throwable th3) {
            th2 = th3;
            th = th;
            aVar = new g();
        }
        c = aVar;
        Class<LockSupport> cls = LockSupport.class;
        if (th2 != null) {
            b.log(Level.SEVERE, "UnsafeAtomicHelper is broken!", th);
            b.log(Level.SEVERE, "SafeAtomicHelper is broken!", th2);
        }
    }

    protected C3121mE() {
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Incorrect type for immutable var: ssa=mE<?>, code=mE, for r4v0, types: [mE, mE<?>] */
    public static void e(C3121mE mEVar) {
        d dVar = null;
        while (true) {
            mEVar.h();
            mEVar.d();
            d a2 = mEVar.a(dVar);
            while (true) {
                if (a2 != null) {
                    dVar = a2.d;
                    Runnable runnable = a2.b;
                    if (runnable instanceof f) {
                        f fVar = (f) runnable;
                        mEVar = fVar.a;
                        if (mEVar.e == fVar) {
                            if (c.a(mEVar, (Object) fVar, c(fVar.b))) {
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

    private void h() {
        k kVar;
        do {
            kVar = this.g;
        } while (!c.a(this, kVar, k.a));
        while (kVar != null) {
            kVar.a();
            kVar = kVar.c;
        }
    }

    @CanIgnoreReturnValue
    public boolean cancel(boolean z) {
        Object obj = this.e;
        if (!(obj == null) && !(obj instanceof f)) {
            return false;
        }
        b bVar = a ? new b(z, new CancellationException("Future.cancel() was called.")) : z ? b.a : b.b;
        boolean z2 = false;
        Object obj2 = obj;
        C3121mE mEVar = this;
        while (true) {
            if (c.a(mEVar, obj2, (Object) bVar)) {
                if (z) {
                    mEVar.e();
                }
                e(mEVar);
                if (!(obj2 instanceof f)) {
                    return true;
                }
                C3347xE<? extends V> xEVar = ((f) obj2).b;
                if (xEVar instanceof h) {
                    mEVar = (C3121mE) xEVar;
                    obj2 = mEVar.e;
                    if (!(obj2 == null) && !(obj2 instanceof f)) {
                        return true;
                    }
                    z2 = true;
                } else {
                    xEVar.cancel(z);
                    return true;
                }
            } else {
                obj2 = mEVar.e;
                if (!(obj2 instanceof f)) {
                    return z2;
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    @ForOverride
    public void d() {
    }

    /* access modifiers changed from: protected */
    public void e() {
    }

    /* access modifiers changed from: protected */
    public String f() {
        Object obj = this.e;
        if (obj instanceof f) {
            StringBuilder sb = new StringBuilder();
            sb.append("setFuture=[");
            sb.append(c((Object) ((f) obj).b));
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

    /* access modifiers changed from: protected */
    public final boolean g() {
        Object obj = this.e;
        return (obj instanceof b) && ((b) obj).c;
    }

    @CanIgnoreReturnValue
    public V get(long j2, TimeUnit timeUnit) throws InterruptedException, TimeoutException, ExecutionException {
        long j3 = j2;
        TimeUnit timeUnit2 = timeUnit;
        long nanos = timeUnit2.toNanos(j3);
        if (!Thread.interrupted()) {
            Object obj = this.e;
            if ((obj != null) && (!(obj instanceof f))) {
                return b(obj);
            }
            long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0;
            if (nanos >= 1000) {
                k kVar = this.g;
                if (kVar != k.a) {
                    k kVar2 = new k();
                    do {
                        kVar2.a(kVar);
                        if (c.a(this, kVar, kVar2)) {
                            do {
                                LockSupport.parkNanos(this, nanos);
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.e;
                                    if ((obj2 != null) && (!(obj2 instanceof f))) {
                                        return b(obj2);
                                    }
                                    nanos = nanoTime - System.nanoTime();
                                } else {
                                    a(kVar2);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            a(kVar2);
                        } else {
                            kVar = this.g;
                        }
                    } while (kVar != k.a);
                }
                return b(this.e);
            }
            while (nanos > 0) {
                Object obj3 = this.e;
                if ((obj3 != null) && (!(obj3 instanceof f))) {
                    return b(obj3);
                }
                if (!Thread.interrupted()) {
                    nanos = nanoTime - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String mEVar = toString();
            String lowerCase = timeUnit.toString().toLowerCase(Locale.ROOT);
            StringBuilder sb = new StringBuilder();
            sb.append("Waited ");
            sb.append(j3);
            String str = " ";
            sb.append(str);
            sb.append(timeUnit.toString().toLowerCase(Locale.ROOT));
            String sb2 = sb.toString();
            if (nanos + 1000 < 0) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(sb2);
                sb3.append(" (plus ");
                String sb4 = sb3.toString();
                long j4 = -nanos;
                long convert = timeUnit2.convert(j4, TimeUnit.NANOSECONDS);
                long nanos2 = j4 - timeUnit2.toNanos(convert);
                int i2 = (convert > 0 ? 1 : (convert == 0 ? 0 : -1));
                boolean z = i2 == 0 || nanos2 > 1000;
                if (i2 > 0) {
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
            sb12.append(mEVar);
            throw new TimeoutException(sb12.toString());
        }
        throw new InterruptedException();
    }

    public boolean isCancelled() {
        return this.e instanceof b;
    }

    public boolean isDone() {
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
                str = f();
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

    private V b(Object obj) throws ExecutionException {
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

    /* access modifiers changed from: private */
    public static Object c(C3347xE<?> xEVar) {
        String str = "get() did not throw CancellationException, despite reporting isCancelled() == true: ";
        if (xEVar instanceof h) {
            Object obj = ((C3121mE) xEVar).e;
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (bVar.c) {
                    Throwable th = bVar.d;
                    obj = th != null ? new b(false, th) : b.b;
                }
            }
            return obj;
        }
        if (xEVar instanceof C2004EE) {
            Throwable a2 = C2024FE.a((C2004EE) xEVar);
            if (a2 != null) {
                return new c(a2);
            }
        }
        boolean isCancelled = xEVar.isCancelled();
        if ((!a) && isCancelled) {
            return b.b;
        }
        try {
            Object b2 = b((Future<V>) xEVar);
            if (isCancelled) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(xEVar);
                return new b(false, new IllegalArgumentException(sb.toString()));
            }
            if (b2 == null) {
                b2 = d;
            }
            return b2;
        } catch (ExecutionException e2) {
            if (!isCancelled) {
                return new c(e2.getCause());
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append(xEVar);
            return new b(false, new IllegalArgumentException(sb2.toString(), e2));
        } catch (CancellationException e3) {
            if (isCancelled) {
                return new b(false, e3);
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append("get() threw CancellationException, despite reporting isCancelled() == false: ");
            sb3.append(xEVar);
            return new c(new IllegalArgumentException(sb3.toString(), e3));
        } catch (Throwable th2) {
            return new c(th2);
        }
    }

    private void a(k kVar) {
        kVar.b = null;
        while (true) {
            k kVar2 = this.g;
            if (kVar2 != k.a) {
                k kVar3 = null;
                while (kVar2 != null) {
                    k kVar4 = kVar2.c;
                    if (kVar2.b != null) {
                        kVar3 = kVar2;
                    } else if (kVar3 != null) {
                        kVar3.c = kVar4;
                        if (kVar3.b == null) {
                        }
                    } else if (!c.a(this, kVar2, kVar4)) {
                    }
                    kVar2 = kVar4;
                }
                return;
            }
            return;
        }
    }

    /* access modifiers changed from: protected */
    @CanIgnoreReturnValue
    public boolean b(C3347xE<? extends V> xEVar) {
        f fVar;
        c cVar;
        Preconditions.checkNotNull(xEVar);
        Object obj = this.e;
        if (obj == null) {
            if (xEVar.isDone()) {
                if (!c.a(this, (Object) null, c(xEVar))) {
                    return false;
                }
                e(this);
                return true;
            }
            fVar = new f(this, xEVar);
            if (c.a(this, (Object) null, (Object) fVar)) {
                try {
                    xEVar.a(fVar, C3207qE.INSTANCE);
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

    public void a(Runnable runnable, Executor executor) {
        Preconditions.checkNotNull(runnable, "Runnable was null.");
        Preconditions.checkNotNull(executor, "Executor was null.");
        if (!isDone()) {
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
        }
        b(runnable, executor);
    }

    private static <V> V b(Future<V> future) throws ExecutionException {
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

    private String c(Object obj) {
        return obj == this ? "this future" : String.valueOf(obj);
    }

    /* access modifiers changed from: protected */
    @CanIgnoreReturnValue
    public boolean a(V v) {
        if (v == null) {
            v = d;
        }
        if (!c.a(this, (Object) null, (Object) v)) {
            return false;
        }
        e(this);
        return true;
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
    @CanIgnoreReturnValue
    public boolean a(Throwable th) {
        Preconditions.checkNotNull(th);
        if (!c.a(this, (Object) null, (Object) new c(th))) {
            return false;
        }
        e(this);
        return true;
    }

    /* access modifiers changed from: protected */
    public final Throwable a() {
        if (this instanceof h) {
            Object obj = this.e;
            if (obj instanceof c) {
                return ((c) obj).b;
            }
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    public final void a(Future<?> future) {
        if ((future != null) && isCancelled()) {
            future.cancel(g());
        }
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
            Object b2 = b((Future<V>) this);
            sb.append("SUCCESS, result=[");
            sb.append(c(b2));
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

    @CanIgnoreReturnValue
    public V get() throws InterruptedException, ExecutionException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.e;
            if ((obj2 != null) && (!(obj2 instanceof f))) {
                return b(obj2);
            }
            k kVar = this.g;
            if (kVar != k.a) {
                k kVar2 = new k();
                do {
                    kVar2.a(kVar);
                    if (c.a(this, kVar, kVar2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.e;
                            } else {
                                a(kVar2);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof f))));
                        return b(obj);
                    }
                    kVar = this.g;
                } while (kVar != k.a);
            }
            return b(this.e);
        }
        throw new InterruptedException();
    }

    private static CancellationException a(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }
}
