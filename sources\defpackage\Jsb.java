package defpackage;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: Jsb reason: default package */
/* compiled from: LockBasedStorageManager */
public class Jsb implements Ssb {
    private static final String a = Hxb.d(Jsb.class.getCanonicalName(), ".", "");
    public static final Ssb b = new Gsb("NO_LOCKS", c.a, Osb.a);
    protected final Lock c;
    /* access modifiers changed from: private */
    public final c d;
    private final String e;

    /* renamed from: Jsb$a */
    /* compiled from: LockBasedStorageManager */
    private static class a<K, V> extends b<K, V> implements Fsb<K, V> {
        /* synthetic */ a(Jsb jsb, ConcurrentMap concurrentMap, Gsb gsb) {
            this(jsb, concurrentMap);
        }

        private static /* synthetic */ void c(int i) {
            String str = i != 3 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[(i != 3 ? 3 : 2)];
            String str2 = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNotNullValuesBasedOnMemoizedFunction";
            if (i == 1) {
                objArr[0] = "map";
            } else if (i == 2) {
                objArr[0] = "computation";
            } else if (i != 3) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = str2;
            }
            String str3 = "computeIfAbsent";
            if (i != 3) {
                objArr[1] = str2;
            } else {
                objArr[1] = str3;
            }
            if (i == 2) {
                objArr[2] = str3;
            } else if (i != 3) {
                objArr[2] = "<init>";
            }
            String format = String.format(str, objArr);
            throw (i != 3 ? new IllegalArgumentException(format) : new IllegalStateException(format));
        }

        public V a(K k, PXa<? extends V> pXa) {
            if (pXa != null) {
                V a = super.a(k, pXa);
                if (a != null) {
                    return a;
                }
                c(3);
                throw null;
            }
            c(2);
            throw null;
        }

        private a(Jsb jsb, ConcurrentMap<d<K, V>, Object> concurrentMap) {
            if (jsb == null) {
                c(0);
                throw null;
            } else if (concurrentMap != null) {
                super(jsb, concurrentMap, null);
            } else {
                c(1);
                throw null;
            }
        }
    }

    /* renamed from: Jsb$b */
    /* compiled from: LockBasedStorageManager */
    private static class b<K, V> extends g<d<K, V>, V> {
        /* synthetic */ b(Jsb jsb, ConcurrentMap concurrentMap, Gsb gsb) {
            this(jsb, concurrentMap);
        }

        private static /* synthetic */ void b(int i) {
            Object[] objArr = new Object[3];
            if (i == 1) {
                objArr[0] = "map";
            } else if (i != 2) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "computation";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNullableValuesBasedOnMemoizedFunction";
            if (i != 2) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "computeIfAbsent";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        public V a(K k, PXa<? extends V> pXa) {
            if (pXa != null) {
                return invoke(new d(k, pXa));
            }
            b(2);
            throw null;
        }

        private b(Jsb jsb, ConcurrentMap<d<K, V>, Object> concurrentMap) {
            if (jsb == null) {
                b(0);
                throw null;
            } else if (concurrentMap != null) {
                super(jsb, concurrentMap, new Ksb());
            } else {
                b(1);
                throw null;
            }
        }
    }

    /* renamed from: Jsb$c */
    /* compiled from: LockBasedStorageManager */
    public interface c {
        public static final c a = new Lsb();

        RuntimeException a(Throwable th);
    }

    /* renamed from: Jsb$d */
    /* compiled from: LockBasedStorageManager */
    private static class d<K, V> {
        private final K a;
        /* access modifiers changed from: private */
        public final PXa<? extends V> b;

        public d(K k, PXa<? extends V> pXa) {
            this.a = k;
            this.b = pXa;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || d.class != obj.getClass()) {
                return false;
            }
            return this.a.equals(((d) obj).a);
        }

        public int hashCode() {
            return this.a.hashCode();
        }
    }

    /* renamed from: Jsb$e */
    /* compiled from: LockBasedStorageManager */
    private static class e<T> implements Qsb<T> {
        private final Jsb a;
        private final PXa<? extends T> b;
        private volatile Object c;

        public e(Jsb jsb, PXa<? extends T> pXa) {
            if (jsb == null) {
                a(0);
                throw null;
            } else if (pXa != null) {
                this.c = i.NOT_COMPUTED;
                this.a = jsb;
                this.b = pXa;
            } else {
                a(1);
                throw null;
            }
        }

        private static /* synthetic */ void a(int i) {
            String str = (i == 2 || i == 3) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[((i == 2 || i == 3) ? 2 : 3)];
            String str2 = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValue";
            if (i == 1) {
                objArr[0] = "computable";
            } else if (i == 2 || i == 3) {
                objArr[0] = str2;
            } else {
                objArr[0] = "storageManager";
            }
            if (i == 2) {
                objArr[1] = "recursionDetected";
            } else if (i != 3) {
                objArr[1] = str2;
            } else {
                objArr[1] = "renderDebugInformation";
            }
            if (!(i == 2 || i == 3)) {
                objArr[2] = "<init>";
            }
            String format = String.format(str, objArr);
            throw ((i == 2 || i == 3) ? new IllegalStateException(format) : new IllegalArgumentException(format));
        }

        /* access modifiers changed from: protected */
        public void a(T t) {
        }

        public boolean a() {
            return (this.c == i.NOT_COMPUTED || this.c == i.COMPUTING) ? false : true;
        }

        public T d() {
            T t = this.c;
            if (!(t instanceof i)) {
                Ivb.d(t);
                return t;
            }
            this.a.c.lock();
            try {
                T t2 = this.c;
                if (!(t2 instanceof i)) {
                    Ivb.d(t2);
                } else {
                    if (t2 == i.COMPUTING) {
                        this.c = i.RECURSION_WAS_DETECTED;
                        j a2 = a(true);
                        if (!a2.c()) {
                            t2 = a2.b();
                        }
                    }
                    if (t2 == i.RECURSION_WAS_DETECTED) {
                        j a3 = a(false);
                        if (!a3.c()) {
                            t2 = a3.b();
                        }
                    }
                    this.c = i.COMPUTING;
                    t2 = this.b.d();
                    this.c = t2;
                    a(t2);
                }
                this.a.c.unlock();
                return t2;
            } catch (Throwable th) {
                this.a.c.unlock();
                throw th;
            }
        }

        /* access modifiers changed from: protected */
        public j<T> a(boolean z) {
            j<T> b2 = this.a.b();
            if (b2 != null) {
                return b2;
            }
            a(2);
            throw null;
        }
    }

    /* renamed from: Jsb$f */
    /* compiled from: LockBasedStorageManager */
    private static class f<T> extends e<T> implements Psb<T> {
        public f(Jsb jsb, PXa<? extends T> pXa) {
            if (jsb == null) {
                b(0);
                throw null;
            } else if (pXa != null) {
                super(jsb, pXa);
            } else {
                b(1);
                throw null;
            }
        }

        private static /* synthetic */ void b(int i) {
            String str = i != 2 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[(i != 2 ? 3 : 2)];
            String str2 = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValue";
            if (i == 1) {
                objArr[0] = "computable";
            } else if (i != 2) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = str2;
            }
            if (i != 2) {
                objArr[1] = str2;
            } else {
                objArr[1] = "invoke";
            }
            if (i != 2) {
                objArr[2] = "<init>";
            }
            String format = String.format(str, objArr);
            throw (i != 2 ? new IllegalArgumentException(format) : new IllegalStateException(format));
        }

        public T d() {
            T d = super.d();
            if (d != null) {
                return d;
            }
            b(2);
            throw null;
        }
    }

    /* renamed from: Jsb$g */
    /* compiled from: LockBasedStorageManager */
    private static class g<K, V> implements Nsb<K, V> {
        private final Jsb a;
        private final ConcurrentMap<K, Object> b;
        private final _Xa<? super K, ? extends V> c;

        public g(Jsb jsb, ConcurrentMap<K, Object> concurrentMap, _Xa<? super K, ? extends V> _xa) {
            if (jsb == null) {
                a(0);
                throw null;
            } else if (concurrentMap == null) {
                a(1);
                throw null;
            } else if (_xa != null) {
                this.a = jsb;
                this.b = concurrentMap;
                this.c = _xa;
            } else {
                a(2);
                throw null;
            }
        }

        private AssertionError a(K k) {
            StringBuilder sb = new StringBuilder();
            sb.append("Recursion detected on input: ");
            sb.append(k);
            sb.append(" under ");
            sb.append(this.a);
            AssertionError assertionError = new AssertionError(sb.toString());
            Jsb.b(assertionError);
            return assertionError;
        }

        private static /* synthetic */ void a(int i) {
            String str = (i == 3 || i == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[((i == 3 || i == 4) ? 2 : 3)];
            String str2 = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunction";
            if (i == 1) {
                objArr[0] = "map";
            } else if (i == 2) {
                objArr[0] = "compute";
            } else if (i == 3 || i == 4) {
                objArr[0] = str2;
            } else {
                objArr[0] = "storageManager";
            }
            if (i == 3) {
                objArr[1] = "recursionDetected";
            } else if (i != 4) {
                objArr[1] = str2;
            } else {
                objArr[1] = "raceCondition";
            }
            if (!(i == 3 || i == 4)) {
                objArr[2] = "<init>";
            }
            String format = String.format(str, objArr);
            throw ((i == 3 || i == 4) ? new IllegalStateException(format) : new IllegalArgumentException(format));
        }

        public V invoke(K k) {
            Throwable th;
            Object obj = this.b.get(k);
            if (obj != null && obj != i.COMPUTING) {
                return Ivb.b(obj);
            }
            this.a.c.lock();
            try {
                Object obj2 = this.b.get(k);
                if (obj2 == i.COMPUTING) {
                    throw a(k);
                } else if (obj2 != null) {
                    V b2 = Ivb.b(obj2);
                    return b2;
                } else {
                    try {
                        this.b.put(k, i.COMPUTING);
                        V invoke = this.c.invoke(k);
                        Object put = this.b.put(k, Ivb.a(invoke));
                        if (put == i.COMPUTING) {
                            this.a.c.unlock();
                            return invoke;
                        }
                        th = a(k, put);
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        th = null;
                        if (C7296rvb.a(th)) {
                            this.b.remove(k);
                            throw ((RuntimeException) th);
                        } else if (th != th) {
                            Object put2 = this.b.put(k, Ivb.a(th));
                            if (put2 != i.COMPUTING) {
                                throw a(k, put2);
                            }
                            this.a.d.a(th);
                            throw null;
                        } else {
                            this.a.d.a(th);
                            throw null;
                        }
                    }
                }
            } finally {
                this.a.c.unlock();
            }
        }

        private AssertionError a(K k, Object obj) {
            StringBuilder sb = new StringBuilder();
            sb.append("Race condition detected on input ");
            sb.append(k);
            sb.append(". Old value is ");
            sb.append(obj);
            sb.append(" under ");
            sb.append(this.a);
            AssertionError assertionError = new AssertionError(sb.toString());
            Jsb.b(assertionError);
            return assertionError;
        }
    }

    /* renamed from: Jsb$h */
    /* compiled from: LockBasedStorageManager */
    private static class h<K, V> extends g<K, V> implements Msb<K, V> {
        public h(Jsb jsb, ConcurrentMap<K, Object> concurrentMap, _Xa<? super K, ? extends V> _xa) {
            if (jsb == null) {
                b(0);
                throw null;
            } else if (concurrentMap == null) {
                b(1);
                throw null;
            } else if (_xa != null) {
                super(jsb, concurrentMap, _xa);
            } else {
                b(2);
                throw null;
            }
        }

        private static /* synthetic */ void b(int i) {
            String str = i != 3 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[(i != 3 ? 3 : 2)];
            String str2 = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunctionToNotNull";
            if (i == 1) {
                objArr[0] = "map";
            } else if (i == 2) {
                objArr[0] = "compute";
            } else if (i != 3) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = str2;
            }
            if (i != 3) {
                objArr[1] = str2;
            } else {
                objArr[1] = "invoke";
            }
            if (i != 3) {
                objArr[2] = "<init>";
            }
            String format = String.format(str, objArr);
            throw (i != 3 ? new IllegalArgumentException(format) : new IllegalStateException(format));
        }

        public V invoke(K k) {
            V invoke = super.invoke(k);
            if (invoke != null) {
                return invoke;
            }
            b(3);
            throw null;
        }
    }

    /* renamed from: Jsb$i */
    /* compiled from: LockBasedStorageManager */
    private enum i {
        NOT_COMPUTED,
        COMPUTING,
        RECURSION_WAS_DETECTED
    }

    /* renamed from: Jsb$j */
    /* compiled from: LockBasedStorageManager */
    private static class j<T> {
        private final T a;
        private final boolean b;

        private j(T t, boolean z) {
            this.a = t;
            this.b = z;
        }

        public static <T> j<T> a(T t) {
            return new j<>(t, false);
        }

        public T b() {
            return this.a;
        }

        public boolean c() {
            return this.b;
        }

        public String toString() {
            return c() ? "FALL_THROUGH" : String.valueOf(this.a);
        }

        public static <T> j<T> a() {
            return new j<>(null, true);
        }
    }

    /* synthetic */ Jsb(String str, c cVar, Lock lock, Gsb gsb) {
        this(str, cVar, lock);
    }

    private static /* synthetic */ void a(int i2) {
        String str;
        int i3;
        Throwable th;
        switch (i2) {
            case 2:
            case 7:
            case 10:
            case 12:
            case 15:
            case 17:
            case 20:
            case 23:
            case 25:
            case 27:
            case 30:
            case 32:
            case 34:
            case 35:
            case 36:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i2) {
            case 2:
            case 7:
            case 10:
            case 12:
            case 15:
            case 17:
            case 20:
            case 23:
            case 25:
            case 27:
            case 30:
            case 32:
            case 34:
            case 35:
            case 36:
                i3 = 2;
                break;
            default:
                i3 = 3;
                break;
        }
        Object[] objArr = new Object[i3];
        String str2 = "compute";
        String str3 = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager";
        switch (i2) {
            case 1:
            case 4:
                objArr[0] = "exceptionHandlingStrategy";
                break;
            case 2:
            case 7:
            case 10:
            case 12:
            case 15:
            case 17:
            case 20:
            case 23:
            case 25:
            case 27:
            case 30:
            case 32:
            case 34:
            case 35:
            case 36:
                objArr[0] = str3;
                break;
            case 5:
                objArr[0] = "lock";
                break;
            case 6:
            case 8:
            case 11:
            case 13:
                objArr[0] = str2;
                break;
            case 9:
            case 14:
                objArr[0] = "map";
                break;
            case 16:
            case 18:
            case 21:
            case 24:
            case 26:
            case 28:
            case 31:
                objArr[0] = "computable";
                break;
            case 19:
                objArr[0] = "onRecursiveCall";
                break;
            case 22:
            case 29:
                objArr[0] = "postCompute";
                break;
            case 33:
                objArr[0] = "throwable";
                break;
            default:
                objArr[0] = "debugText";
                break;
        }
        String str4 = "sanitizeStackTrace";
        String str5 = "createNullableLazyValueWithPostCompute";
        String str6 = "createRecursionTolerantNullableLazyValue";
        String str7 = "createNullableLazyValue";
        String str8 = "createLazyValueWithPostCompute";
        String str9 = "createRecursionTolerantLazyValue";
        String str10 = "createLazyValue";
        String str11 = "createMemoizedFunctionWithNullableValues";
        String str12 = "createMemoizedFunction";
        String str13 = "createWithExceptionHandling";
        switch (i2) {
            case 2:
                objArr[1] = str13;
                break;
            case 7:
            case 10:
                objArr[1] = str12;
                break;
            case 12:
            case 15:
                objArr[1] = str11;
                break;
            case 17:
                objArr[1] = str10;
                break;
            case 20:
                objArr[1] = str9;
                break;
            case 23:
                objArr[1] = str8;
                break;
            case 25:
                objArr[1] = str7;
                break;
            case 27:
                objArr[1] = str6;
                break;
            case 30:
                objArr[1] = str5;
                break;
            case 32:
                objArr[1] = "createConcurrentHashMap";
                break;
            case 34:
                objArr[1] = str4;
                break;
            case 35:
                objArr[1] = "createCacheWithNullableValues";
                break;
            case 36:
                objArr[1] = "createCacheWithNotNullValues";
                break;
            default:
                objArr[1] = str3;
                break;
        }
        switch (i2) {
            case 2:
            case 7:
            case 10:
            case 12:
            case 15:
            case 17:
            case 20:
            case 23:
            case 25:
            case 27:
            case 30:
            case 32:
            case 34:
            case 35:
            case 36:
                break;
            case 3:
            case 4:
            case 5:
                objArr[2] = "<init>";
                break;
            case 6:
            case 8:
            case 9:
                objArr[2] = str12;
                break;
            case 11:
            case 13:
            case 14:
                objArr[2] = str11;
                break;
            case 16:
                objArr[2] = str10;
                break;
            case 18:
            case 19:
                objArr[2] = str9;
                break;
            case 21:
            case 22:
                objArr[2] = str8;
                break;
            case 24:
                objArr[2] = str7;
                break;
            case 26:
                objArr[2] = str6;
                break;
            case 28:
            case 29:
                objArr[2] = str5;
                break;
            case 31:
                objArr[2] = str2;
                break;
            case 33:
                objArr[2] = str4;
                break;
            default:
                objArr[2] = str13;
                break;
        }
        String format = String.format(str, objArr);
        switch (i2) {
            case 2:
            case 7:
            case 10:
            case 12:
            case 15:
            case 17:
            case 20:
            case 23:
            case 25:
            case 27:
            case 30:
            case 32:
            case 34:
            case 35:
            case 36:
                th = new IllegalStateException(format);
                break;
            default:
                th = new IllegalArgumentException(format);
                break;
        }
        throw th;
    }

    private static <K> ConcurrentMap<K, Object> c() {
        return new ConcurrentHashMap(3, 1.0f, 2);
    }

    public <K, V> Msb<K, V> b(_Xa<? super K, ? extends V> _xa) {
        if (_xa != null) {
            Msb<K, V> a2 = a(_xa, c());
            if (a2 != null) {
                return a2;
            }
            a(7);
            throw null;
        }
        a(6);
        throw null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("@");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(" (");
        sb.append(this.e);
        sb.append(")");
        return sb.toString();
    }

    private Jsb(String str, c cVar, Lock lock) {
        if (str == null) {
            a(3);
            throw null;
        } else if (cVar == null) {
            a(4);
            throw null;
        } else if (lock != null) {
            this.c = lock;
            this.d = cVar;
            this.e = str;
        } else {
            a(5);
            throw null;
        }
    }

    public <K, V> Msb<K, V> a(_Xa<? super K, ? extends V> _xa, ConcurrentMap<K, Object> concurrentMap) {
        if (_xa == null) {
            a(8);
            throw null;
        } else if (concurrentMap != null) {
            return new h(this, concurrentMap, _xa);
        } else {
            a(9);
            throw null;
        }
    }

    public <K, V> Nsb<K, V> b(_Xa<? super K, ? extends V> _xa, ConcurrentMap<K, Object> concurrentMap) {
        if (_xa == null) {
            a(13);
            throw null;
        } else if (concurrentMap != null) {
            return new g(this, concurrentMap, _xa);
        } else {
            a(14);
            throw null;
        }
    }

    public <K, V> Nsb<K, V> a(_Xa<? super K, ? extends V> _xa) {
        if (_xa != null) {
            Nsb<K, V> b2 = b(_xa, c());
            if (b2 != null) {
                return b2;
            }
            a(12);
            throw null;
        }
        a(11);
        throw null;
    }

    public <T> Qsb<T> b(PXa<? extends T> pXa) {
        if (pXa != null) {
            return new e(this, pXa);
        }
        a(24);
        throw null;
    }

    public Jsb(String str) {
        this(str, c.a, new ReentrantLock());
    }

    public <T> Psb<T> a(PXa<? extends T> pXa) {
        if (pXa != null) {
            return new f(this, pXa);
        }
        a(16);
        throw null;
    }

    /* access modifiers changed from: protected */
    public <T> j<T> b() {
        StringBuilder sb = new StringBuilder();
        sb.append("Recursive call in a lazy value under ");
        sb.append(this);
        IllegalStateException illegalStateException = new IllegalStateException(sb.toString());
        b((T) illegalStateException);
        throw illegalStateException;
    }

    /* access modifiers changed from: private */
    public static <T extends Throwable> T b(T t) {
        if (t != null) {
            StackTraceElement[] stackTrace = t.getStackTrace();
            int length = stackTrace.length;
            int i2 = -1;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    break;
                } else if (!stackTrace[i3].getClassName().startsWith(a)) {
                    i2 = i3;
                    break;
                } else {
                    i3++;
                }
            }
            List subList = Arrays.asList(stackTrace).subList(i2, length);
            t.setStackTrace((StackTraceElement[]) subList.toArray(new StackTraceElement[subList.size()]));
            if (t != null) {
                return t;
            }
            a(34);
            throw null;
        }
        a(33);
        throw null;
    }

    public <T> Psb<T> a(PXa<? extends T> pXa, T t) {
        if (pXa == null) {
            a(18);
            throw null;
        } else if (t != null) {
            return new Hsb(this, this, pXa, t);
        } else {
            a(19);
            throw null;
        }
    }

    public <T> Psb<T> a(PXa<? extends T> pXa, _Xa<? super Boolean, ? extends T> _xa, _Xa<? super T, RVa> _xa2) {
        if (pXa == null) {
            a(21);
            throw null;
        } else if (_xa2 != null) {
            Isb isb = new Isb(this, this, pXa, _xa, _xa2);
            return isb;
        } else {
            a(22);
            throw null;
        }
    }

    public <K, V> Fsb<K, V> a() {
        return new a(this, c(), null);
    }
}
