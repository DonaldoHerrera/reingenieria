package defpackage;

/* renamed from: yPa reason: default package and case insensitive filesystem */
/* compiled from: Notification */
public final class C7738yPa<T> {
    static final C7738yPa<Object> a = new C7738yPa<>(null);
    final Object b;

    private C7738yPa(Object obj) {
        this.b = obj;
    }

    public static <T> C7738yPa<T> a(T t) {
        AQa.a(t, "value is null");
        return new C7738yPa<>(t);
    }

    public T b() {
        Object obj = this.b;
        if (obj == null || GUa.d(obj)) {
            return null;
        }
        return this.b;
    }

    public boolean c() {
        return this.b == null;
    }

    public boolean d() {
        return GUa.d(this.b);
    }

    public boolean e() {
        Object obj = this.b;
        return obj != null && !GUa.d(obj);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C7738yPa)) {
            return false;
        }
        return AQa.a(this.b, ((C7738yPa) obj).b);
    }

    public int hashCode() {
        Object obj = this.b;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public String toString() {
        Object obj = this.b;
        if (obj == null) {
            return "OnCompleteNotification";
        }
        String str = "]";
        if (GUa.d(obj)) {
            StringBuilder sb = new StringBuilder();
            sb.append("OnErrorNotification[");
            sb.append(GUa.a(obj));
            sb.append(str);
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("OnNextNotification[");
        sb2.append(this.b);
        sb2.append(str);
        return sb2.toString();
    }

    public static <T> C7738yPa<T> a(Throwable th) {
        AQa.a(th, "error is null");
        return new C7738yPa<>(GUa.a(th));
    }

    public static <T> C7738yPa<T> a() {
        return a;
    }
}
