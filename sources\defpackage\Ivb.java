package defpackage;

/* renamed from: Ivb reason: default package */
/* compiled from: WrappedValues */
public class Ivb {
    private static final Object a = new Hvb();
    public static volatile boolean b = false;

    /* renamed from: Ivb$a */
    /* compiled from: WrappedValues */
    private static final class a {
        private final Throwable a;

        /* synthetic */ a(Throwable th, Hvb hvb) {
            this(th);
        }

        private static /* synthetic */ void a(int i) {
            String str = i != 1 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[(i != 1 ? 3 : 2)];
            String str2 = "kotlin/reflect/jvm/internal/impl/utils/WrappedValues$ThrowableWrapper";
            if (i != 1) {
                objArr[0] = "throwable";
            } else {
                objArr[0] = str2;
            }
            if (i != 1) {
                objArr[1] = str2;
            } else {
                objArr[1] = "getThrowable";
            }
            if (i != 1) {
                objArr[2] = "<init>";
            }
            String format = String.format(str, objArr);
            throw (i != 1 ? new IllegalArgumentException(format) : new IllegalStateException(format));
        }

        public Throwable a() {
            Throwable th = this.a;
            if (th != null) {
                return th;
            }
            a(1);
            throw null;
        }

        public String toString() {
            return this.a.toString();
        }

        private a(Throwable th) {
            if (th != null) {
                this.a = th;
            } else {
                a(0);
                throw null;
            }
        }
    }

    /* renamed from: Ivb$b */
    /* compiled from: WrappedValues */
    public static class b extends RuntimeException {
        public b(Throwable th) {
            super("Rethrow stored exception", th);
        }
    }

    public static <V> Object a(V v) {
        if (v == null) {
            Object obj = a;
            if (obj != null) {
                return obj;
            }
            a(1);
            throw null;
        } else if (v != null) {
            return v;
        } else {
            a(2);
            throw null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0058  */
    private static /* synthetic */ void a(int i) {
        String str = (i == 1 || i == 2 || i == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i == 1 || i == 2 || i == 4) ? 2 : 3)];
        String str2 = "kotlin/reflect/jvm/internal/impl/utils/WrappedValues";
        if (!(i == 1 || i == 2)) {
            if (i == 3) {
                objArr[0] = "throwable";
            } else if (i != 4) {
                objArr[0] = "value";
            }
            String str3 = "escapeThrowable";
            if (i != 1 || i == 2) {
                objArr[1] = "escapeNull";
            } else if (i != 4) {
                objArr[1] = str2;
            } else {
                objArr[1] = str3;
            }
            if (!(i == 1 || i == 2)) {
                if (i != 3) {
                    objArr[2] = str3;
                } else if (i != 4) {
                    if (i != 5) {
                        objArr[2] = "unescapeNull";
                    } else {
                        objArr[2] = "unescapeExceptionOrNull";
                    }
                }
            }
            String format = String.format(str, objArr);
            throw ((i != 1 || i == 2 || i == 4) ? new IllegalStateException(format) : new IllegalArgumentException(format));
        }
        objArr[0] = str2;
        String str32 = "escapeThrowable";
        if (i != 1) {
        }
        objArr[1] = "escapeNull";
        if (i != 3) {
        }
        String format2 = String.format(str, objArr);
        throw ((i != 1 || i == 2 || i == 4) ? new IllegalStateException(format2) : new IllegalArgumentException(format2));
    }

    public static <V> V b(Object obj) {
        if (obj != null) {
            d(obj);
            return c(obj);
        }
        a(5);
        throw null;
    }

    public static <V> V c(Object obj) {
        if (obj == null) {
            a(0);
            throw null;
        } else if (obj == a) {
            return null;
        } else {
            return obj;
        }
    }

    public static <V> V d(Object obj) {
        if (!(obj instanceof a)) {
            return obj;
        }
        Throwable a2 = ((a) obj).a();
        if (!b || !C7296rvb.a(a2)) {
            C7296rvb.b(a2);
            throw null;
        }
        throw new b(a2);
    }

    public static Object a(Throwable th) {
        if (th != null) {
            return new a(th, null);
        }
        a(3);
        throw null;
    }
}
