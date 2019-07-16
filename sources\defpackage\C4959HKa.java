package defpackage;

import com.google.common.base.Function;

/* renamed from: HKa reason: default package and case insensitive filesystem */
/* compiled from: Present */
final class C4959HKa<T> extends C4928GKa<T> {
    private final T a;

    C4959HKa(T t) {
        this.a = t;
    }

    public C4928GKa<T> a(C4928GKa<? extends T> gKa) {
        if (gKa != null) {
            return this;
        }
        throw new NullPointerException();
    }

    public T b() {
        return this.a;
    }

    public boolean c() {
        return true;
    }

    public T d(T t) {
        if (t != null) {
            return this.a;
        }
        throw new NullPointerException("use Optional.orNull() instead of Optional.or(null)");
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C4959HKa)) {
            return false;
        }
        return this.a.equals(((C4959HKa) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode() + 1502476572;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Optional.of(");
        sb.append(this.a);
        sb.append(")");
        return sb.toString();
    }

    public <V> C4928GKa<V> b(Function<? super T, V> function) {
        Object apply = function.apply(this.a);
        if (apply != null) {
            return new C4959HKa(apply);
        }
        throw new NullPointerException("the Function passed to Optional.transform() must not return null.");
    }

    public T d() {
        return this.a;
    }
}
