package defpackage;

/* renamed from: AQa reason: default package */
/* compiled from: ObjectHelper */
public final class AQa {
    static final C6572hQa<Object, Object> a = new a();

    /* renamed from: AQa$a */
    /* compiled from: ObjectHelper */
    static final class a implements C6572hQa<Object, Object> {
        a() {
        }

        public boolean test(Object obj, Object obj2) {
            return AQa.a(obj, obj2);
        }
    }

    public static int a(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i > i2 ? 1 : 0;
    }

    public static int a(long j, long j2) {
        int i = (j > j2 ? 1 : (j == j2 ? 0 : -1));
        if (i < 0) {
            return -1;
        }
        return i > 0 ? 1 : 0;
    }

    public static <T> T a(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    public static boolean a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static <T> C6572hQa<T, T> a() {
        return a;
    }

    public static int a(int i, String str) {
        if (i > 0) {
            return i;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" > 0 required but it was ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }
}
