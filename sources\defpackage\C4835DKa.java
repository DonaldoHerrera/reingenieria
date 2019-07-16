package defpackage;

import com.google.common.base.Function;

/* renamed from: DKa reason: default package and case insensitive filesystem */
/* compiled from: Absent */
final class C4835DKa<T> extends C4928GKa<T> {
    static final C4835DKa<Object> a = new C4835DKa<>();

    private C4835DKa() {
    }

    static <T> C4928GKa<T> e() {
        return a;
    }

    private Object readResolve() {
        return a;
    }

    public C4928GKa<T> a(C4928GKa<? extends T> gKa) {
        if (gKa != null) {
            return gKa;
        }
        throw new NullPointerException();
    }

    public T b() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    public boolean c() {
        return false;
    }

    public T d() {
        return null;
    }

    public T d(T t) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException("use Optional.orNull() instead of Optional.or(null)");
    }

    public boolean equals(Object obj) {
        return obj == this;
    }

    public int hashCode() {
        return 1502476572;
    }

    public String toString() {
        return "Optional.absent()";
    }

    public <V> C4928GKa<V> b(Function<? super T, V> function) {
        if (function != null) {
            return C4928GKa.a();
        }
        throw new NullPointerException();
    }
}
