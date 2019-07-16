package defpackage;

import java.io.Serializable;

/* renamed from: GUa reason: default package */
/* compiled from: NotificationLite */
public enum GUa {
    COMPLETE;

    /* renamed from: GUa$a */
    /* compiled from: NotificationLite */
    static final class a implements Serializable {
        final VPa a;

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("NotificationLite.Disposable[");
            sb.append(this.a);
            sb.append("]");
            return sb.toString();
        }
    }

    /* renamed from: GUa$b */
    /* compiled from: NotificationLite */
    static final class b implements Serializable {
        final Throwable a;

        b(Throwable th) {
            this.a = th;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            return AQa.a((Object) this.a, (Object) ((b) obj).a);
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("NotificationLite.Error[");
            sb.append(this.a);
            sb.append("]");
            return sb.toString();
        }
    }

    public static Object a() {
        return COMPLETE;
    }

    public static <T> T b(Object obj) {
        return obj;
    }

    public static <T> boolean b(Object obj, GPa<? super T> gPa) {
        if (obj == COMPLETE) {
            gPa.onComplete();
            return true;
        } else if (obj instanceof b) {
            gPa.a(((b) obj).a);
            return true;
        } else if (obj instanceof a) {
            gPa.a(((a) obj).a);
            return false;
        } else {
            gPa.a(obj);
            return false;
        }
    }

    public static boolean c(Object obj) {
        return obj == COMPLETE;
    }

    public static boolean d(Object obj) {
        return obj instanceof b;
    }

    public static <T> Object e(T t) {
        return t;
    }

    public String toString() {
        return "NotificationLite.Complete";
    }

    public static Object a(Throwable th) {
        return new b(th);
    }

    public static Throwable a(Object obj) {
        return ((b) obj).a;
    }

    public static <T> boolean a(Object obj, GPa<? super T> gPa) {
        if (obj == COMPLETE) {
            gPa.onComplete();
            return true;
        } else if (obj instanceof b) {
            gPa.a(((b) obj).a);
            return true;
        } else {
            gPa.a(obj);
            return false;
        }
    }
}
