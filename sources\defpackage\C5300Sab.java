package defpackage;

import java.lang.ref.SoftReference;

/* renamed from: Sab reason: default package and case insensitive filesystem */
/* compiled from: ReflectProperties */
public class C5300Sab {

    /* renamed from: Sab$a */
    /* compiled from: ReflectProperties */
    public static class a<T> extends c<T> {
        private final PXa<T> b;
        private SoftReference<Object> c;

        public a(T t, PXa<T> pXa) {
            if (pXa != null) {
                this.c = null;
                this.b = pXa;
                if (t != null) {
                    this.c = new SoftReference<>(a(t));
                    return;
                }
                return;
            }
            a(0);
            throw null;
        }

        private static /* synthetic */ void a(int i) {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", new Object[]{"initializer", "kotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal", "<init>"}));
        }

        public T a() {
            SoftReference<Object> softReference = this.c;
            if (softReference != null) {
                Object obj = softReference.get();
                if (obj != null) {
                    return b(obj);
                }
            }
            T d = this.b.d();
            this.c = new SoftReference<>(a(d));
            return d;
        }
    }

    /* renamed from: Sab$b */
    /* compiled from: ReflectProperties */
    public static class b<T> extends c<T> {
        private final PXa<T> b;
        private Object c;

        public b(PXa<T> pXa) {
            if (pXa != null) {
                this.c = null;
                this.b = pXa;
                return;
            }
            a(0);
            throw null;
        }

        private static /* synthetic */ void a(int i) {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", new Object[]{"initializer", "kotlin/reflect/jvm/internal/ReflectProperties$LazyVal", "<init>"}));
        }

        public T a() {
            Object obj = this.c;
            if (obj != null) {
                return b(obj);
            }
            T d = this.b.d();
            this.c = a(d);
            return d;
        }
    }

    /* renamed from: Sab$c */
    /* compiled from: ReflectProperties */
    public static abstract class c<T> {
        private static final Object a = new C5330Tab();

        public abstract T a();

        public final T a(Object obj, Object obj2) {
            return a();
        }

        /* access modifiers changed from: protected */
        public T b(Object obj) {
            if (obj == a) {
                return null;
            }
            return obj;
        }

        /* access modifiers changed from: protected */
        public Object a(T t) {
            return t == null ? a : t;
        }
    }

    public static <T> b<T> a(PXa<T> pXa) {
        if (pXa != null) {
            return new b<>(pXa);
        }
        a(0);
        throw null;
    }

    private static /* synthetic */ void a(int i) {
        String str = (i == 1 || i == 3 || i == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i == 1 || i == 3 || i == 5) ? 2 : 3)];
        String str2 = "kotlin/reflect/jvm/internal/ReflectProperties";
        if (i == 1 || i == 3 || i == 5) {
            objArr[0] = str2;
        } else {
            objArr[0] = "initializer";
        }
        String str3 = "lazySoft";
        String str4 = "lazy";
        if (i == 1) {
            objArr[1] = str4;
        } else if (i == 3 || i == 5) {
            objArr[1] = str3;
        } else {
            objArr[1] = str2;
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            objArr[2] = str4;
                        }
                    }
                }
            }
            objArr[2] = str3;
        }
        String format = String.format(str, objArr);
        throw ((i == 1 || i == 3 || i == 5) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    public static <T> a<T> b(PXa<T> pXa) {
        if (pXa != null) {
            a<T> a2 = a(null, pXa);
            if (a2 != null) {
                return a2;
            }
            a(5);
            throw null;
        }
        a(4);
        throw null;
    }

    public static <T> a<T> a(T t, PXa<T> pXa) {
        if (pXa != null) {
            return new a<>(t, pXa);
        }
        a(2);
        throw null;
    }
}
